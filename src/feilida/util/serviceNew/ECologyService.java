
package feilida.util.serviceNew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ECologyService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://172.20.70.218:2088/Service/ECologyService.asmx?WSDL")
public class ECologyService
    extends Service
{

    private final static URL ECOLOGYSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(feilida.util.serviceNew.ECologyService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = feilida.util.serviceNew.ECologyService.class.getResource(".");
            url = new URL(baseUrl, "http://172.20.70.218:2088/Service/ECologyService.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://172.20.70.218:2088/Service/ECologyService.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ECOLOGYSERVICE_WSDL_LOCATION = url;
    }

    public ECologyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ECologyService() {
        super(ECOLOGYSERVICE_WSDL_LOCATION, new QName("http://tempuri.org/", "ECologyService"));
    }

    /**
     * 
     * @return
     *     returns ECologyServiceSoap
     */
    @WebEndpoint(name = "ECologyServiceSoap")
    public ECologyServiceSoap getECologyServiceSoap() {
        return super.getPort(new QName("http://tempuri.org/", "ECologyServiceSoap"), ECologyServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ECologyServiceSoap
     */
    @WebEndpoint(name = "ECologyServiceSoap")
    public ECologyServiceSoap getECologyServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "ECologyServiceSoap"), ECologyServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ECologyServiceSoap
     */
    @WebEndpoint(name = "ECologyServiceSoap12")
    public ECologyServiceSoap getECologyServiceSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "ECologyServiceSoap12"), ECologyServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ECologyServiceSoap
     */
    @WebEndpoint(name = "ECologyServiceSoap12")
    public ECologyServiceSoap getECologyServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "ECologyServiceSoap12"), ECologyServiceSoap.class, features);
    }

}
