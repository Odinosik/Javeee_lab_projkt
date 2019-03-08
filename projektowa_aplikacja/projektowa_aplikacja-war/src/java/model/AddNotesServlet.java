/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ejb.NewSessionBean;
import hib.HibernateUtil;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import org.hibernate.Query;
import org.hibernate.Session;
import sop.DodawanieHib_Service;

/**
 *
 * @author Huber
 */
@WebServlet(name = "AddNotesServlet", urlPatterns = {"/AddNotesServlet"})
public class AddNotesServlet extends HttpServlet {

    @EJB(name = "idBean")
    private NewSessionBean idBean;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Dodawanie_hib/Dodawanie_hib.wsdl")
    private DodawanieHib_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         HttpSession session = request.getSession(false);
        response.setContentType("text/html;charset=UTF-8");
        
        
         String content = request.getParameter("content1");
         String fileName = request.getParameter("fileName") +".txt";
         String firstName = request.getParameter("firstName");
         String folderName = "resources";
         String uploadPath = request.getServletContext().getRealPath("") + "\\..\\..\\..\\..\\" + folderName ;
         File dir = new File(uploadPath);
            
            
            if (!dir.exists()) {
                dir.mkdirs();
            }
            String file_path = uploadPath + File.separator + fileName ;
            String path = folderName + File.separator + fileName ;
            
         //Tworzenie nowego pliku     
            
         File file = new File(file_path);
         
         //EJB TWORZENIE NOWEGO PLIKU
         
         
         idBean.Create_file(file, content);
         
        
         
         
         //Pobranie ID
         
          
            Session hibsession;
            
            Notes lastnotes= null;

            hibsession = HibernateUtil.getSessionFactory().openSession();
            hibsession.beginTransaction();
            Query q = hibsession.createQuery("from Notes order by Id DESC");
            q.setMaxResults(1);
            lastnotes = (Notes) q.uniqueResult();
            long id = lastnotes.getId() + 1;
            
            
            //Dodanie do web
         
            setParamAll(id,firstName,fileName,path);
            
         
         
            //Pobranie z web
            
            
            
            long id_note = getid();
            String firstName_note = getName();
            String fileName_note = getFileName();
            String path_note = getPath();
            String added_date_note = getDate();
         
         
         
         //Dodanie do bazy danych 
            
         
           Notes note = new Notes(id_note, firstName_note, fileName_note, path_note, added_date_note);
                hibsession = HibernateUtil.getSessionFactory().openSession();
                hibsession.beginTransaction();
                hibsession.save(note);
                hibsession.getTransaction().commit();
                hibsession.close();
         
        
                
                
                
                session.setAttribute("fileName", fileName);
                String msg = "" + fileName + " File uploaded successfully... path: " + uploadPath + File.separator + fileName;
                request.setAttribute("msg", msg);
                RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
                rd.forward(request, response);
                System.out.println("File uploaded successfully...");
                System.out.println("Uploaded Path: " + uploadPath);
                
                
                
                
                
                
                
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddNotesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(content);
            out.println("<p> " + request.getParameter("content1") + "</p>");
            out.println(file_path);
            out.println("<h1>Servlet AddNotesServlet at " + request.getContextPath() + "</h1>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void setParamAll(long id, java.lang.String firstname, java.lang.String filename, java.lang.String path) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        sop.DodawanieHib port = service.getDodawanieHibPort();
        port.setParamAll(id, firstname, filename, path);
    }

    private String getDate() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        sop.DodawanieHib port = service.getDodawanieHibPort();
        return port.getDate();
    }

    private String getFileName() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        sop.DodawanieHib port = service.getDodawanieHibPort();
        return port.getFileName();
    }

    private String getName() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        sop.DodawanieHib port = service.getDodawanieHibPort();
        return port.getName();
    }

    private String getPath() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        sop.DodawanieHib port = service.getDodawanieHibPort();
        return port.getPath();
    }

    private long getid() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        sop.DodawanieHib port = service.getDodawanieHibPort();
        return port.getid();
    }

}
