
import java.io.*;
import java.nio.file.*;
import java.sql.*;
import model.Notes;
import hib.HibernateUtil;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.hibernate.Query;
import org.hibernate.Session;

@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
        maxFileSize = 1024 * 1024 * 1000, // 1 GB
        maxRequestSize = 1024 * 1024 * 1000)   	// 1 GB
public class Upload extends HttpServlet {

    PrintWriter out = null;
    Connection con = null;
    PreparedStatement ps = null;
    HttpSession session = null;

    private Notes note;

    private Session hibsession;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        try {
            out = response.getWriter();
            session = request.getSession(false);
            
            
            //UPLOAD
            
            String folderName = "resources";
          
            String folderPath = request.getServletContext().getRealPath("") + "\\..\\..\\..\\..\\" + folderName ;
            
            
            File dir = new File(folderPath);
            
            
            if (!dir.exists()) {
                dir.mkdirs();
            }
            
            
            
            
            
            Part filePart = request.getPart("file");
            
            String firstName = request.getParameter("firstname");
           

            Session hibsession;
            
            Notes lastnotes= null;

           
                
            
            hibsession = HibernateUtil.getSessionFactory().openSession();
            hibsession.beginTransaction();
            Query q = hibsession.createQuery("from Notes order by Id DESC");
            q.setMaxResults(1);
            lastnotes = (Notes) q.uniqueResult();

            long id = lastnotes.getId() + 1;
    
        

            String fileName = filePart.getSubmittedFileName();
            
            
            
            String path = folderName + File.separator + fileName;
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date data = new Date();
            String added_date = dateFormat.format(data);
            
            
            if (".txt".equals(fileName.substring(fileName.length()-4)) )
            {
            
            
            InputStream is = filePart.getInputStream();
            Files.copy(is, Paths.get(folderPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING);
            } else {
                   
                response.sendRedirect("/Fail.jsp");
                
            }
            
            
            try {

                note = new Notes(id, firstName, fileName, path, added_date);
                hibsession = HibernateUtil.getSessionFactory().openSession();
                hibsession.beginTransaction();
                hibsession.save(note);
                hibsession.getTransaction().commit();
                hibsession.close();

                session.setAttribute("fileName", fileName);
                String msg = "" + fileName + " File uploaded successfully...";
                request.setAttribute("msg", msg);
                RequestDispatcher rd = request.getRequestDispatcher("/Success.jsp");
                rd.forward(request, response);
                System.out.println("File uploaded successfully...");
                System.out.println("Uploaded Path: " + folderPath);

            } catch (Exception e) {
                out.println("Exception: " + e);
                System.out.println("Exception1: " + e);
            } 
        } catch (IOException | ServletException e) {
            response.sendRedirect("/Fail.jsp");
            out.println("Exception: " + e);
            System.out.println("Exception2: " + e);
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

    
    

}
