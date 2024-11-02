package com.appt.set.web_api.data.services;

import org.springframework.stereotype.Service;

import com.appt.set.web_api.data.dto.PersonDto;
import com.appt.set.web_api.data.entity.Person;

@Service
public class PersonaServiceImplementFactory {
    public PersonDto createPersonDto(Person person){
        
        return new PersonDto(person);

    }
}
