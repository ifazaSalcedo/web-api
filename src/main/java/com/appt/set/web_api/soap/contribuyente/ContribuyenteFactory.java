//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.11.12 a las 09:18:53 PM PYST 
//


package com.appt.set.web_api.soap.contribuyente;

import com.appt.set.web_api.data.dto.PersonDto;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.appt.set.web_api.soap.contribuyente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ContribuyenteFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.appt.set.web_api.soap.contribuyente
     * 
     */
    public ContribuyenteFactory() {
    }

    /**
     * Create an instance of {@link GetContribuyenteRucRequest }
     * 
     */
    public GetContribuyenteRucRequest createGetContribuyenteRucRequest() {
        return new GetContribuyenteRucRequest();
    }

    /**
     * Create an instance of {@link GetContribuyenteRucResponse }
     * 
     */
    public GetContribuyenteRucResponse createGetContribuyenteRucResponse() {
        return new GetContribuyenteRucResponse();
    }

    /**
     * Create an instance of {@link Contribuyente }
     * 
     */
    public Contribuyente createContribuyente(PersonDto person) {
        Contribuyente contribuyente= Contribuyente.builder()
        .personId(person.getPersonId())
        .name(person.getName())
        .lastname(person.getLastname())
        .ruc(person.getRuc())
        .dv(person.getDv())
        .rucFormer(person.getRucFormer())
        .state(person.getState())
        .build();
        return contribuyente;
    }

    /**
     * Create an instance of {@link GetContribuyenteListRequest }
     * 
     */
    public GetContribuyenteListRequest createGetContribuyenteListRequest() {
        return new GetContribuyenteListRequest();
    }

    /**
     * Create an instance of {@link GetContribuyenteListResponse }
     * 
     */
    public GetContribuyenteListResponse createGetContribuyenteListResponse() {
        return new GetContribuyenteListResponse();
    }

}
