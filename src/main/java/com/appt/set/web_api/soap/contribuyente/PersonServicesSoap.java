package com.appt.set.web_api.soap.contribuyente;


import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.appt.set.web_api.data.dto.PersonDto;
import com.appt.set.web_api.data.services.PersonServicesImplement;
import com.appt.set.web_api.exeptions.PersonNotFountExeption;
import com.appt.set.web_api.exeptionsoap.ServiceFault;
import com.appt.set.web_api.exeptionsoap.ServiceFaultException;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Endpoint
public class PersonServicesSoap {

    private static final String NAME_SPACE= "http://www.appt.com/set/web_api/soap/contribuyente";
    private final PersonServicesImplement service;


    @PayloadRoot(namespace=NAME_SPACE, localPart="getPersonRucRequest")
    @ResponsePayload
    public GetPersonRucResponse findByRuc(@RequestPayload GetPersonRucRequest request){
        try {
            GetPersonRucResponse response= new GetPersonRucResponse();
            PersonDto personDto= service.findByRuc(request.getRuc());
            response.setPersondto(personDto);
            return response;
        } catch (PersonNotFountExeption e) {
            throw new ServiceFaultException("error", new ServiceFault("NOT_FOUNT", "Otro error " + e.getMessage()));
        }

    }
    
}