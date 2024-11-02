package com.appt.set.web_api.data.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.appt.set.web_api.data.dto.PersonDto;

public interface PersonServices {
    Page<PersonDto> findAll(Pageable paginator);
    Page<PersonDto> findByNameLike(Pageable paginator, String filter);
    PersonDto findByRuc(String ruc);
}
