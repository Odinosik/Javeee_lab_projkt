package model;
// Generated 2019-01-15 20:12:33 by Hibernate Tools 4.3.1



/**
 * Notes generated by hbm2java
 */
public class Notes  implements java.io.Serializable {


     private long id;
     private String firstname;
   
     private String filename;
     private String path;
     private String addedDate;

    public Notes() {
    }

	
    public Notes(long id, String firstname, String filename, String path) {
        this.id = id;
        this.firstname = firstname;
      
        this.filename = filename;
        this.path = path;
    }
    public Notes(long id, String firstname,  String filename, String path, String addedDate) {
       this.id = id;
       this.firstname = firstname;
      
       this.filename = filename;
       this.path = path;
       this.addedDate = addedDate;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    public String getAddedDate() {
        return this.addedDate;
    }
    
    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }




}


