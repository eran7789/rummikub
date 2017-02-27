
package ws.rummikub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RummikubWebServiceService", targetNamespace = "http://rummikub.ws/", wsdlLocation = "http://localhost:8080/RummikubWeb/RummikubWebServiceService?wsdl")
public class RummikubWebServiceService
    extends Service
{

    private final static URL RUMMIKUBWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException RUMMIKUBWEBSERVICESERVICE_EXCEPTION;
    private final static QName RUMMIKUBWEBSERVICESERVICE_QNAME = new QName("http://rummikub.ws/", "RummikubWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/RummikubWeb/RummikubWebServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RUMMIKUBWEBSERVICESERVICE_WSDL_LOCATION = url;
        RUMMIKUBWEBSERVICESERVICE_EXCEPTION = e;
    }

    public RummikubWebServiceService() {
        super(__getWsdlLocation(), RUMMIKUBWEBSERVICESERVICE_QNAME);
    }

    public RummikubWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RUMMIKUBWEBSERVICESERVICE_QNAME, features);
    }

    public RummikubWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, RUMMIKUBWEBSERVICESERVICE_QNAME);
    }

    public RummikubWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RUMMIKUBWEBSERVICESERVICE_QNAME, features);
    }

    public RummikubWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RummikubWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RummikubWebService
     */
    @WebEndpoint(name = "RummikubWebServicePort")
    public RummikubWebService getRummikubWebServicePort() {
        return super.getPort(new QName("http://rummikub.ws/", "RummikubWebServicePort"), RummikubWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RummikubWebService
     */
    @WebEndpoint(name = "RummikubWebServicePort")
    public RummikubWebService getRummikubWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://rummikub.ws/", "RummikubWebServicePort"), RummikubWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RUMMIKUBWEBSERVICESERVICE_EXCEPTION!= null) {
            throw RUMMIKUBWEBSERVICESERVICE_EXCEPTION;
        }
        return RUMMIKUBWEBSERVICESERVICE_WSDL_LOCATION;
    }

}