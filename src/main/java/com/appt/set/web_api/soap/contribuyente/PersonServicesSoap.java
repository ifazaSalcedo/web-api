package com.appt.set.web_api.soap.contribuyente;


import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.appt.set.web_api.data.dto.PersonDto;
import com.appt.set.web_api.data.services.PersonServicesImplement;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Endpoint
public class PersonServicesSoap {

    private static final String NAME_SPACE = "http://www.appt.com/set/web_api/soap/contribuyente";
    private final PersonServicesImplement service;

    @PayloadRoot(namespace = NAME_SPACE, localPart = "getContribuyenteRucRequest")
    @ResponsePayload
    public GetContribuyenteRucResponse findByRuc(@RequestPayload GetContribuyenteRucRequest request) {
        GetContribuyenteRucResponse response = new GetContribuyenteRucResponse();
        PersonDto personDto = service.findByRuc(request.getRuc());
        Contribuyente contribuyente= new ContribuyenteFactory().createContribuyente(personDto);
        response.setPersondto(contribuyente);
        return response;
    }

    @PayloadRoot(namespace = NAME_SPACE, localPart = "getContribuyenteListRequest")
    @ResponsePayload
    public GetContribuyenteListResponse findAll(@RequestPayload GetContribuyenteListRequest request) {

        Page<PersonDto> page = service.findAll(PageRequest.of(request.getPage(), request.getSize()));

        GetContribuyenteListResponse response = new GetContribuyenteListResponse();
        response.getContribuyentes().addAll(
            page.getContent().stream()
            .map(dto -> new ContribuyenteFactory().createContribuyente(dto))
            .collect(Collectors.toList())
        );
        
        response.setTotalPages(page.getTotalPages());
        response.setTotalElements((int) page.getTotalElements());
        response.setCurrentPage(page.getNumber());
        response.setPageSize(page.getSize());

        return response;

    }
}
