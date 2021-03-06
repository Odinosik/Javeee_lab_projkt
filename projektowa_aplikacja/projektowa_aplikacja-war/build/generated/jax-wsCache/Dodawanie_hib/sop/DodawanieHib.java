
package sop;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Dodawanie_hib", targetNamespace = "http://sop/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DodawanieHib {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getName", targetNamespace = "http://sop/", className = "sop.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://sop/", className = "sop.GetNameResponse")
    @Action(input = "http://sop/Dodawanie_hib/getNameRequest", output = "http://sop/Dodawanie_hib/getNameResponse")
    public String getName();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPath", targetNamespace = "http://sop/", className = "sop.GetPath")
    @ResponseWrapper(localName = "getPathResponse", targetNamespace = "http://sop/", className = "sop.GetPathResponse")
    @Action(input = "http://sop/Dodawanie_hib/getPathRequest", output = "http://sop/Dodawanie_hib/getPathResponse")
    public String getPath();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFileName", targetNamespace = "http://sop/", className = "sop.GetFileName")
    @ResponseWrapper(localName = "getFileNameResponse", targetNamespace = "http://sop/", className = "sop.GetFileNameResponse")
    @Action(input = "http://sop/Dodawanie_hib/getFileNameRequest", output = "http://sop/Dodawanie_hib/getFileNameResponse")
    public String getFileName();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDate", targetNamespace = "http://sop/", className = "sop.GetDate")
    @ResponseWrapper(localName = "getDateResponse", targetNamespace = "http://sop/", className = "sop.GetDateResponse")
    @Action(input = "http://sop/Dodawanie_hib/getDateRequest", output = "http://sop/Dodawanie_hib/getDateResponse")
    public String getDate();

    /**
     * 
     * @param date
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "setDate", targetNamespace = "http://sop/", className = "sop.SetDate")
    @Action(input = "http://sop/Dodawanie_hib/setDate")
    public void setDate(
        @WebParam(name = "date", targetNamespace = "")
        String date);

    /**
     * 
     * @param firstname
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "setFirstName", targetNamespace = "http://sop/", className = "sop.SetFirstName")
    @Action(input = "http://sop/Dodawanie_hib/setFirstName")
    public void setFirstName(
        @WebParam(name = "firstname", targetNamespace = "")
        String firstname);

    /**
     * 
     * @param path
     * @param firstname
     * @param filename
     * @param id
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "setParamAll", targetNamespace = "http://sop/", className = "sop.SetParamAll")
    @Action(input = "http://sop/Dodawanie_hib/setParamAll")
    public void setParamAll(
        @WebParam(name = "id", targetNamespace = "")
        long id,
        @WebParam(name = "firstname", targetNamespace = "")
        String firstname,
        @WebParam(name = "filename", targetNamespace = "")
        String filename,
        @WebParam(name = "path", targetNamespace = "")
        String path);

    /**
     * 
     * @param filename
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "setFileName", targetNamespace = "http://sop/", className = "sop.SetFileName")
    @Action(input = "http://sop/Dodawanie_hib/setFileName")
    public void setFileName(
        @WebParam(name = "filename", targetNamespace = "")
        String filename);

    /**
     * 
     * @param path
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "setPath", targetNamespace = "http://sop/", className = "sop.SetPath")
    @Action(input = "http://sop/Dodawanie_hib/setPath")
    public void setPath(
        @WebParam(name = "path", targetNamespace = "")
        String path);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://sop/", className = "sop.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sop/", className = "sop.HelloResponse")
    @Action(input = "http://sop/Dodawanie_hib/helloRequest", output = "http://sop/Dodawanie_hib/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getid", targetNamespace = "http://sop/", className = "sop.Getid")
    @ResponseWrapper(localName = "getidResponse", targetNamespace = "http://sop/", className = "sop.GetidResponse")
    @Action(input = "http://sop/Dodawanie_hib/getidRequest", output = "http://sop/Dodawanie_hib/getidResponse")
    public long getid();

    /**
     * 
     * @param id
     */
    @WebMethod(operationName = "SetId")
    @Oneway
    @RequestWrapper(localName = "SetId", targetNamespace = "http://sop/", className = "sop.SetId")
    @Action(input = "http://sop/Dodawanie_hib/SetId")
    public void setId(
        @WebParam(name = "id", targetNamespace = "")
        long id);

}
