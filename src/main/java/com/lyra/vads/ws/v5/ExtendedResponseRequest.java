
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour extendedResponseRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="extendedResponseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isNsuRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isWalletRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isBankLabelRequested" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extendedResponseRequest", propOrder = {
    "isNsuRequested",
    "isWalletRequested",
    "isBankLabelRequested"
})
public class ExtendedResponseRequest {

    protected boolean isNsuRequested;
    protected boolean isWalletRequested;
    protected boolean isBankLabelRequested;

    /**
     * Obtient la valeur de la propriété isNsuRequested.
     * 
     */
    public boolean isIsNsuRequested() {
        return isNsuRequested;
    }

    /**
     * Définit la valeur de la propriété isNsuRequested.
     * 
     */
    public void setIsNsuRequested(boolean value) {
        this.isNsuRequested = value;
    }

    /**
     * Obtient la valeur de la propriété isWalletRequested.
     * 
     */
    public boolean isIsWalletRequested() {
        return isWalletRequested;
    }

    /**
     * Définit la valeur de la propriété isWalletRequested.
     * 
     */
    public void setIsWalletRequested(boolean value) {
        this.isWalletRequested = value;
    }

    /**
     * Obtient la valeur de la propriété isBankLabelRequested.
     * 
     */
    public boolean isIsBankLabelRequested() {
        return isBankLabelRequested;
    }

    /**
     * Définit la valeur de la propriété isBankLabelRequested.
     * 
     */
    public void setIsBankLabelRequested(boolean value) {
        this.isBankLabelRequested = value;
    }

}
