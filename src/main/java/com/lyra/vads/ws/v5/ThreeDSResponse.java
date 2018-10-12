
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour threeDSResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="threeDSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationRequestData" type="{http://v5.ws.vads.lyra.com/}authenticationRequestData" minOccurs="0"/>
 *         &lt;element name="authenticationResultData" type="{http://v5.ws.vads.lyra.com/}authenticationResultData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threeDSResponse", propOrder = {
    "authenticationRequestData",
    "authenticationResultData"
})
public class ThreeDSResponse {

    protected AuthenticationRequestData authenticationRequestData;
    protected AuthenticationResultData authenticationResultData;

    /**
     * Obtient la valeur de la propriété authenticationRequestData.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationRequestData }
     *     
     */
    public AuthenticationRequestData getAuthenticationRequestData() {
        return authenticationRequestData;
    }

    /**
     * Définit la valeur de la propriété authenticationRequestData.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationRequestData }
     *     
     */
    public void setAuthenticationRequestData(AuthenticationRequestData value) {
        this.authenticationRequestData = value;
    }

    /**
     * Obtient la valeur de la propriété authenticationResultData.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResultData }
     *     
     */
    public AuthenticationResultData getAuthenticationResultData() {
        return authenticationResultData;
    }

    /**
     * Définit la valeur de la propriété authenticationResultData.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResultData }
     *     
     */
    public void setAuthenticationResultData(AuthenticationResultData value) {
        this.authenticationResultData = value;
    }

}
