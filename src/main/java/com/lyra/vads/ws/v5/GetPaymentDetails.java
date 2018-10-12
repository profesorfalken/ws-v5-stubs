
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getPaymentDetails complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryRequest" type="{http://v5.ws.vads.lyra.com/}queryRequest" minOccurs="0"/>
 *         &lt;element name="extendedResponseRequest" type="{http://v5.ws.vads.lyra.com/}extendedResponseRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentDetails", propOrder = {
    "queryRequest",
    "extendedResponseRequest"
})
public class GetPaymentDetails {

    protected QueryRequest queryRequest;
    protected ExtendedResponseRequest extendedResponseRequest;

    /**
     * Obtient la valeur de la propriété queryRequest.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest }
     *     
     */
    public QueryRequest getQueryRequest() {
        return queryRequest;
    }

    /**
     * Définit la valeur de la propriété queryRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest }
     *     
     */
    public void setQueryRequest(QueryRequest value) {
        this.queryRequest = value;
    }

    /**
     * Obtient la valeur de la propriété extendedResponseRequest.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedResponseRequest }
     *     
     */
    public ExtendedResponseRequest getExtendedResponseRequest() {
        return extendedResponseRequest;
    }

    /**
     * Définit la valeur de la propriété extendedResponseRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedResponseRequest }
     *     
     */
    public void setExtendedResponseRequest(ExtendedResponseRequest value) {
        this.extendedResponseRequest = value;
    }

}
