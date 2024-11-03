package com.appt.set.web_api.data.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.appt.set.web_api.data.dto.PersonDto;
import com.appt.set.web_api.data.entity.Person;
import com.appt.set.web_api.data.repository.PersonRepository;
import com.appt.set.web_api.exeptions.PersonNotFountExeption;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PersonServicesImplement implements PersonServices {

    private final PersonRepository repository;
    private final PersonaServiceImplementFactory factory;

    @Override
    public Page<PersonDto> findAll(Pageable paginator) {
        try {
            return repository.findAll(paginator).map(factory::createPersonDto);
        } catch (Exception e) {
            throw new PersonNotFountExeption("No se pudo optener el listado de contribuyentes...", e);
        }

    }

    @Override
    public Page<PersonDto> findByNameLike(Pageable paginator, String filter) {
        try {
            return repository.findByNameContains(paginator, filter).map(factory::createPersonDto);
        } catch (Exception e) {
            throw new PersonNotFountExeption("No se pudo optener el listado de contribuyentes...", e);
        }
    }

    @Override
    public PersonDto findByRuc(String ruc) {

            Person person = repository.findByRuc(ruc)
                    .orElseThrow(() -> new PersonNotFountExeption("El ruc no existe o es incorrecto"));
            return factory.createPersonDto(person);
    }

}
