
package com.test.csf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test.csf package. 
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

    private final static QName _GeeCxfMsgResponse_QNAME = new QName("http://service.cxf.xt.com/", "geeCxfMsgResponse");
    private final static QName _GeeCxfMsg_QNAME = new QName("http://service.cxf.xt.com/", "geeCxfMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test.csf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeeCxfMsg }
     * 
     */
    public GeeCxfMsg createGeeCxfMsg() {
        return new GeeCxfMsg();
    }

    /**
     * Create an instance of {@link GeeCxfMsgResponse }
     * 
     */
    public GeeCxfMsgResponse createGeeCxfMsgResponse() {
        return new GeeCxfMsgResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeeCxfMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.xt.com/", name = "geeCxfMsgResponse")
    public JAXBElement<GeeCxfMsgResponse> createGeeCxfMsgResponse(GeeCxfMsgResponse value) {
        return new JAXBElement<GeeCxfMsgResponse>(_GeeCxfMsgResponse_QNAME, GeeCxfMsgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeeCxfMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.xt.com/", name = "geeCxfMsg")
    public JAXBElement<GeeCxfMsg> createGeeCxfMsg(GeeCxfMsg value) {
        return new JAXBElement<GeeCxfMsg>(_GeeCxfMsg_QNAME, GeeCxfMsg.class, null, value);
    }

}
