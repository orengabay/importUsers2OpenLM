
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.RouterMonitoringResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetRouterMonitoringResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouterMonitoringResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRouterMonitoringResult"
})
@XmlRootElement(name = "GetRouterMonitoringResponse")
public class GetRouterMonitoringResponse {

    @XmlElementRef(name = "GetRouterMonitoringResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<RouterMonitoringResponse> getRouterMonitoringResult;

    /**
     * Gets the value of the getRouterMonitoringResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouterMonitoringResponse }{@code >}
     *     
     */
    public JAXBElement<RouterMonitoringResponse> getGetRouterMonitoringResult() {
        return getRouterMonitoringResult;
    }

    /**
     * Sets the value of the getRouterMonitoringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouterMonitoringResponse }{@code >}
     *     
     */
    public void setGetRouterMonitoringResult(JAXBElement<RouterMonitoringResponse> value) {
        this.getRouterMonitoringResult = value;
    }

}
