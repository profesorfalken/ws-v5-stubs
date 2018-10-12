
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createTokenByIban complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createTokenByIban">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="ibanRequest" type="{http://v5.ws.vads.lyra.com/}ibanRequest" minOccurs="0"/>
 *         &lt;element name="customerRequest" type="{http://v5.ws.vads.lyra.com/}customerRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTokenByIban", propOrder = {
    "commonRequest",
    "ibanRequest",
    "customerRequest"
})
public class CreateTokenByIban {

    protected CommonRequest commonRequest;
    protected IbanRequest ibanRequest;
    protected CustomerRequest customerRequest;

    /**
     * Obtient la valeur de la propriété commonRequest.
     * 
     * @return
     *     possible object is
     *     {@link CommonRequest }
     *     
     */
    public CommonRequest getCommonRequest() {
        return commonRequest;
    }

    /**
     * Définit la valeur de la propriété commonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonRequest }
     *     
     */
    public void setCommonRequest(CommonRequest value) {
        this.commonRequest = value;
    }

    /**
     * Obtient la valeur de la propriété ibanRequest.
     * 
     * @return
     *     possible object is
     *     {@link IbanRequest }
     *     
     */
    public IbanRequest getIbanRequest() {
        return ibanRequest;
    }

    /**
     * Définit la valeur de la propriété ibanRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link IbanRequest }
     *     
     */
    public void setIbanRequest(IbanRequest value) {
        this.ibanRequest = value;
    }

    /**
     * Obtient la valeur de la propriété customerRequest.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRequest }
     *     
     */
    public CustomerRequest getCustomerRequest() {
        return customerRequest;
    }

    /**
     * Définit la valeur de la propriété customerRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRequest }
     *     
     */
    public void setCustomerRequest(CustomerRequest value) {
        this.customerRequest = value;
    }

}
