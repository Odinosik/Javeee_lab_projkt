
package sop;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sop package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetId_QNAME = new QName("http://sop/", "SetId");
    private final static QName _GetDate_QNAME = new QName("http://sop/", "getDate");
    private final static QName _GetDateResponse_QNAME = new QName("http://sop/", "getDateResponse");
    private final static QName _GetFileName_QNAME = new QName("http://sop/", "getFileName");
    private final static QName _GetFileNameResponse_QNAME = new QName("http://sop/", "getFileNameResponse");
    private final static QName _GetName_QNAME = new QName("http://sop/", "getName");
    private final static QName _GetNameResponse_QNAME = new QName("http://sop/", "getNameResponse");
    private final static QName _GetPath_QNAME = new QName("http://sop/", "getPath");
    private final static QName _GetPathResponse_QNAME = new QName("http://sop/", "getPathResponse");
    private final static QName _Getid_QNAME = new QName("http://sop/", "getid");
    private final static QName _GetidResponse_QNAME = new QName("http://sop/", "getidResponse");
    private final static QName _Hello_QNAME = new QName("http://sop/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sop/", "helloResponse");
    private final static QName _SetDate_QNAME = new QName("http://sop/", "setDate");
    private final static QName _SetFileName_QNAME = new QName("http://sop/", "setFileName");
    private final static QName _SetFirstName_QNAME = new QName("http://sop/", "setFirstName");
    private final static QName _SetParamAll_QNAME = new QName("http://sop/", "setParamAll");
    private final static QName _SetPath_QNAME = new QName("http://sop/", "setPath");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetId }
     * 
     */
    public SetId createSetId() {
        return new SetId();
    }

    /**
     * Create an instance of {@link GetDate }
     * 
     */
    public GetDate createGetDate() {
        return new GetDate();
    }

    /**
     * Create an instance of {@link GetDateResponse }
     * 
     */
    public GetDateResponse createGetDateResponse() {
        return new GetDateResponse();
    }

    /**
     * Create an instance of {@link GetFileName }
     * 
     */
    public GetFileName createGetFileName() {
        return new GetFileName();
    }

    /**
     * Create an instance of {@link GetFileNameResponse }
     * 
     */
    public GetFileNameResponse createGetFileNameResponse() {
        return new GetFileNameResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetPath }
     * 
     */
    public GetPath createGetPath() {
        return new GetPath();
    }

    /**
     * Create an instance of {@link GetPathResponse }
     * 
     */
    public GetPathResponse createGetPathResponse() {
        return new GetPathResponse();
    }

    /**
     * Create an instance of {@link Getid }
     * 
     */
    public Getid createGetid() {
        return new Getid();
    }

    /**
     * Create an instance of {@link GetidResponse }
     * 
     */
    public GetidResponse createGetidResponse() {
        return new GetidResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SetDate }
     * 
     */
    public SetDate createSetDate() {
        return new SetDate();
    }

    /**
     * Create an instance of {@link SetFileName }
     * 
     */
    public SetFileName createSetFileName() {
        return new SetFileName();
    }

    /**
     * Create an instance of {@link SetFirstName }
     * 
     */
    public SetFirstName createSetFirstName() {
        return new SetFirstName();
    }

    /**
     * Create an instance of {@link SetParamAll }
     * 
     */
    public SetParamAll createSetParamAll() {
        return new SetParamAll();
    }

    /**
     * Create an instance of {@link SetPath }
     * 
     */
    public SetPath createSetPath() {
        return new SetPath();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "SetId")
    public JAXBElement<SetId> createSetId(SetId value) {
        return new JAXBElement<SetId>(_SetId_QNAME, SetId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getDate")
    public JAXBElement<GetDate> createGetDate(GetDate value) {
        return new JAXBElement<GetDate>(_GetDate_QNAME, GetDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getDateResponse")
    public JAXBElement<GetDateResponse> createGetDateResponse(GetDateResponse value) {
        return new JAXBElement<GetDateResponse>(_GetDateResponse_QNAME, GetDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getFileName")
    public JAXBElement<GetFileName> createGetFileName(GetFileName value) {
        return new JAXBElement<GetFileName>(_GetFileName_QNAME, GetFileName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getFileNameResponse")
    public JAXBElement<GetFileNameResponse> createGetFileNameResponse(GetFileNameResponse value) {
        return new JAXBElement<GetFileNameResponse>(_GetFileNameResponse_QNAME, GetFileNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getPath")
    public JAXBElement<GetPath> createGetPath(GetPath value) {
        return new JAXBElement<GetPath>(_GetPath_QNAME, GetPath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getPathResponse")
    public JAXBElement<GetPathResponse> createGetPathResponse(GetPathResponse value) {
        return new JAXBElement<GetPathResponse>(_GetPathResponse_QNAME, GetPathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getid")
    public JAXBElement<Getid> createGetid(Getid value) {
        return new JAXBElement<Getid>(_Getid_QNAME, Getid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "getidResponse")
    public JAXBElement<GetidResponse> createGetidResponse(GetidResponse value) {
        return new JAXBElement<GetidResponse>(_GetidResponse_QNAME, GetidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "setDate")
    public JAXBElement<SetDate> createSetDate(SetDate value) {
        return new JAXBElement<SetDate>(_SetDate_QNAME, SetDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFileName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "setFileName")
    public JAXBElement<SetFileName> createSetFileName(SetFileName value) {
        return new JAXBElement<SetFileName>(_SetFileName_QNAME, SetFileName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFirstName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "setFirstName")
    public JAXBElement<SetFirstName> createSetFirstName(SetFirstName value) {
        return new JAXBElement<SetFirstName>(_SetFirstName_QNAME, SetFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetParamAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "setParamAll")
    public JAXBElement<SetParamAll> createSetParamAll(SetParamAll value) {
        return new JAXBElement<SetParamAll>(_SetParamAll_QNAME, SetParamAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sop/", name = "setPath")
    public JAXBElement<SetPath> createSetPath(SetPath value) {
        return new JAXBElement<SetPath>(_SetPath_QNAME, SetPath.class, null, value);
    }

}
