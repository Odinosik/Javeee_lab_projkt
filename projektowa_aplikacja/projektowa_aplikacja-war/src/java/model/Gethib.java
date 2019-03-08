/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import hib.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Huber
 */
public class Gethib {

    public List get_List_Hib() {
        List<Notes> listnotes;
        Session hibsession;
        hibsession = HibernateUtil.getSessionFactory().openSession();
        hibsession.beginTransaction();
        Query q = hibsession.createQuery("from Notes as note");
        listnotes = (List<Notes>) q.list();
        return listnotes;
    }
    
    public long get_id_Hib() {
         
         Session hibsession;
         hibsession = HibernateUtil.getSessionFactory().openSession();
         hibsession.beginTransaction();
         Query q = hibsession.createQuery("from Notes order by Id DESC");
         q.setMaxResults(1);
         
         Notes  lastnotes = (Notes) q.uniqueResult();
         if (lastnotes == null)
             return 1;
         {
         q.setMaxResults(1);
         
      
        return lastnotes.getId() + 1;
         }
    }
    
    
    public void add_note_Hib(Notes note) {
        
        Session hibsession;
        hibsession = HibernateUtil.getSessionFactory().openSession();
        hibsession.beginTransaction();
        hibsession.save(note);
        hibsession.getTransaction().commit();
        hibsession.close();
        
        
        
    }
    
    
    
    
    
}
