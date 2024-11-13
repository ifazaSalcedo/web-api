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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="persondto" type="{http://www.appt.com/set/web_api/soap/contribuyente}contribuyente"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "persondto"
})
@XmlRootElement(name = "getContribuyenteRucResponse")
public class GetContribuyenteRucResponse {

    @XmlElement(required = true)
    protected Contribuyente persondto;

    /**
     * Obtiene el valor de la propiedad persondto.
     * 
     * @return
     *     possible object is
     *     {@link Contribuyente }
     *     
     */
    public Contribuyente getPersondto() {
        return persondto;
    }

    /**
     * Define el valor de la propiedad persondto.
     * 
     * @param value
     *     allowed object is
     *     {@link Contribuyente }
     *     
     */
    public void setPersondto(Contribuyente value) {
        this.persondto = value;
    }

}
