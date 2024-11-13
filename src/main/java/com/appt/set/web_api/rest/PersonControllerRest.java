package com.appt.set.web_api.rest;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appt.set.web_api.data.services.PersonServicesImplement;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rest")
public class PersonControllerRest {


    private final PersonServicesImplement service;

    @GetMapping("/contribuyentes-list")
    public ResponseEntity<?> findAll(@RequestParam(defaultValue="0") int page, @RequestParam(defaultValue="60") int size){
        return ResponseEntity.ok(
            service.findAll(PageRequest.of(page, size))
        );
    }

    @GetMapping("/contribuyentes-nombre")
    public ResponseEntity<?> findByNameLike(@RequestParam(defaultValue="0") int page, @RequestParam(defaultValue="60") int size, @RequestParam String filter){
        return ResponseEntity.ok(
            service.findByNameLike(PageRequest.of(page, size), filter)
        );
    }

    @GetMapping("/contribuyente-ruc")
    public ResponseEntity<?> findByRuc(@RequestParam String filter){
        return ResponseEntity.ok(
            service.findByRuc(filter)
        );
    }

}
