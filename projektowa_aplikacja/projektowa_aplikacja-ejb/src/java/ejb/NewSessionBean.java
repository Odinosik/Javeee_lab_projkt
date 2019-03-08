/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;

/**
 *
 * @author Huber
 */
@Singleton
@LocalBean
public class NewSessionBean {

    public String sayHello(String content) {
        return "" + content;
    }

    public String Open_file(File file) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        String ret = "";
        while ((line = reader.readLine()) != null) {

            ret = ret + line + "<br>";
        }

        return ret;

    }

    public void Create_file(File file, String content) throws IOException {
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(content);
        writer.flush();
        writer.close();
    }
    
    
    public Boolean Delete_File(File file) {
       
        return file.delete();
    }
    
    



}
