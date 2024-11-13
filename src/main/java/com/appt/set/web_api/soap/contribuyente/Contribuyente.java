//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.11.12 a las 09:18:53 PM PYST 
//


package com.appt.set.web_api.soap.contribuyente;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Builder;


/**
 * <p>Clase Java para contribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ruc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dv" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rucFormer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contribuyente", propOrder = {
    "personId",
    "name",
    "lastname",
    "ruc",
    "dv",
    "rucFormer",
    "state"
})
@Builder
public class Contribuyente {

    protected long personId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String lastname;
    @XmlElement(required = true)
    protected String ruc;
    protected int dv;
    @XmlElement(required = true)
    protected String rucFormer;
    @XmlElement(required = true)
    protected String state;

    /**
     * Obtiene el valor de la propiedad personId.
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * Define el valor de la propiedad personId.
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Define el valor de la propiedad lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Obtiene el valor de la propiedad ruc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Define el valor de la propiedad ruc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuc(String value) {
        this.ruc = value;
    }

    /**
     * Obtiene el valor de la propiedad dv.
     * 
     */
    public int getDv() {
        return dv;
    }

    /**
     * Define el valor de la propiedad dv.
     * 
     */
    public void setDv(int value) {
        this.dv = value;
    }

    /**
     * Obtiene el valor de la propiedad rucFormer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRucFormer() {
        return rucFormer;
    }

    /**
     * Define el valor de la propiedad rucFormer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRucFormer(String value) {
        this.rucFormer = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
