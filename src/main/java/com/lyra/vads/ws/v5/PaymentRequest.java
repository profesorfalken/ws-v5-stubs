
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour paymentRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="paymentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retryUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expectedCaptureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="manualValidation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paymentOptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acquirerTransientData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstInstallmentDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="overridePaymentCinematic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentRequest", propOrder = {
    "transactionId",
    "retryUuid",
    "amount",
    "currency",
    "expectedCaptureDate",
    "manualValidation",
    "paymentOptionCode",
    "acquirerTransientData",
    "firstInstallmentDelay",
    "overridePaymentCinematic"
})
public class PaymentRequest {

    protected String transactionId;
    protected String retryUuid;
    protected Long amount;
    protected Integer currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedCaptureDate;
    protected Integer manualValidation;
    protected String paymentOptionCode;
    protected String acquirerTransientData;
    protected Integer firstInstallmentDelay;
    protected String overridePaymentCinematic;

    /**
     * Obtient la valeur de la propriété transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Définit la valeur de la propriété transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Obtient la valeur de la propriété retryUuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryUuid() {
        return retryUuid;
    }

    /**
     * Définit la valeur de la propriété retryUuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryUuid(String value) {
        this.retryUuid = value;
    }

    /**
     * Obtient la valeur de la propriété amount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété currency.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrency() {
        return currency;
    }

    /**
     * Définit la valeur de la propriété currency.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrency(Integer value) {
        this.currency = value;
    }

    /**
     * Obtient la valeur de la propriété expectedCaptureDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedCaptureDate() {
        return expectedCaptureDate;
    }

    /**
     * Définit la valeur de la propriété expectedCaptureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedCaptureDate(XMLGregorianCalendar value) {
        this.expectedCaptureDate = value;
    }

    /**
     * Obtient la valeur de la propriété manualValidation.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManualValidation() {
        return manualValidation;
    }

    /**
     * Définit la valeur de la propriété manualValidation.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManualValidation(Integer value) {
        this.manualValidation = value;
    }

    /**
     * Obtient la valeur de la propriété paymentOptionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOptionCode() {
        return paymentOptionCode;
    }

    /**
     * Définit la valeur de la propriété paymentOptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOptionCode(String value) {
        this.paymentOptionCode = value;
    }

    /**
     * Obtient la valeur de la propriété acquirerTransientData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerTransientData() {
        return acquirerTransientData;
    }

    /**
     * Définit la valeur de la propriété acquirerTransientData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerTransientData(String value) {
        this.acquirerTransientData = value;
    }

    /**
     * Obtient la valeur de la propriété firstInstallmentDelay.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstInstallmentDelay() {
        return firstInstallmentDelay;
    }

    /**
     * Définit la valeur de la propriété firstInstallmentDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstInstallmentDelay(Integer value) {
        this.firstInstallmentDelay = value;
    }

    /**
     * Obtient la valeur de la propriété overridePaymentCinematic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverridePaymentCinematic() {
        return overridePaymentCinematic;
    }

    /**
     * Définit la valeur de la propriété overridePaymentCinematic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverridePaymentCinematic(String value) {
        this.overridePaymentCinematic = value;
    }

}
