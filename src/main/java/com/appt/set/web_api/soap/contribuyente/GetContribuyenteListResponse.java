//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.11.12 a las 09:18:53 PM PYST 
//


package com.appt.set.web_api.soap.contribuyente;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="contribuyentes" type="{http://www.appt.com/set/web_api/soap/contribuyente}contribuyente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalElements" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "contribuyentes",
    "totalPages",
    "totalElements",
    "currentPage",
    "pageSize"
})
@XmlRootElement(name = "getContribuyenteListResponse")
public class GetContribuyenteListResponse {

    protected List<Contribuyente> contribuyentes;
    protected int totalPages;
    protected int totalElements;
    protected int currentPage;
    protected int pageSize;

    /**
     * Gets the value of the contribuyentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contribuyentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribuyentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contribuyente }
     * 
     * 
     */
    public List<Contribuyente> getContribuyentes() {
        if (contribuyentes == null) {
            contribuyentes = new ArrayList<Contribuyente>();
        }
        return this.contribuyentes;
    }

    /**
     * Obtiene el valor de la propiedad totalPages.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Define el valor de la propiedad totalPages.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

    /**
     * Obtiene el valor de la propiedad totalElements.
     * 
     */
    public int getTotalElements() {
        return totalElements;
    }

    /**
     * Define el valor de la propiedad totalElements.
     * 
     */
    public void setTotalElements(int value) {
        this.totalElements = value;
    }

    /**
     * Obtiene el valor de la propiedad currentPage.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Define el valor de la propiedad currentPage.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Obtiene el valor de la propiedad pageSize.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Define el valor de la propiedad pageSize.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

}
