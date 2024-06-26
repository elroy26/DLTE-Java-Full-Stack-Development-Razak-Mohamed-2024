//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.25 at 10:43:13 AM IST 
//


package services.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loans complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loanName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loanType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loanDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="loanRoi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loans", propOrder = {
    "loanNumber",
    "loanName",
    "loanType",
    "loanDescription",
    "loanRoi"
})
public class Loans {

    protected int loanNumber;
    @XmlElement(required = true)
    protected String loanName;
    @XmlElement(required = true)
    protected String loanType;
    @XmlElement(required = true)
    protected String loanDescription;
    protected double loanRoi;

    /**
     * Gets the value of the loanNumber property.
     * 
     */
    public int getLoanNumber() {
        return loanNumber;
    }

    /**
     * Sets the value of the loanNumber property.
     * 
     */
    public void setLoanNumber(int value) {
        this.loanNumber = value;
    }

    /**
     * Gets the value of the loanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanName() {
        return loanName;
    }

    /**
     * Sets the value of the loanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanName(String value) {
        this.loanName = value;
    }

    /**
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanType(String value) {
        this.loanType = value;
    }

    /**
     * Gets the value of the loanDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDescription() {
        return loanDescription;
    }

    /**
     * Sets the value of the loanDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDescription(String value) {
        this.loanDescription = value;
    }

    /**
     * Gets the value of the loanRoi property.
     * 
     */
    public double getLoanRoi() {
        return loanRoi;
    }

    /**
     * Sets the value of the loanRoi property.
     * 
     */
    public void setLoanRoi(double value) {
        this.loanRoi = value;
    }

}
