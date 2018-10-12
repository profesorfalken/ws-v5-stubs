
package com.lyra.vads.ws.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour riskAnalysis complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="riskAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://v5.ws.vads.lyra.com/}riskAnalysisProcessingStatus" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraInfo" type="{http://v5.ws.vads.lyra.com/}extInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fingerPrintId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskAnalysis", propOrder = {
    "score",
    "resultCode",
    "status",
    "requestId",
    "extraInfo",
    "fingerPrintId"
})
public class RiskAnalysis {

    protected String score;
    protected String resultCode;
    protected RiskAnalysisProcessingStatus status;
    protected String requestId;
    @XmlElement(nillable = true)
    protected List<ExtInfo> extraInfo;
    protected String fingerPrintId;

    /**
     * Obtient la valeur de la propriété score.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Définit la valeur de la propriété score.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Obtient la valeur de la propriété resultCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Définit la valeur de la propriété resultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link RiskAnalysisProcessingStatus }
     *     
     */
    public RiskAnalysisProcessingStatus getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAnalysisProcessingStatus }
     *     
     */
    public void setStatus(RiskAnalysisProcessingStatus value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Définit la valeur de la propriété requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the extraInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtInfo }
     * 
     * 
     */
    public List<ExtInfo> getExtraInfo() {
        if (extraInfo == null) {
            extraInfo = new ArrayList<ExtInfo>();
        }
        return this.extraInfo;
    }

    /**
     * Obtient la valeur de la propriété fingerPrintId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFingerPrintId() {
        return fingerPrintId;
    }

    /**
     * Définit la valeur de la propriété fingerPrintId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFingerPrintId(String value) {
        this.fingerPrintId = value;
    }

}
