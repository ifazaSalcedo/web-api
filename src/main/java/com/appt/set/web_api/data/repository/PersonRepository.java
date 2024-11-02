package com.appt.set.web_api.data.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appt.set.web_api.data.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

    public Page<Person> findByNameContains(Pageable paginator, String filter);

    public Optional<Person> findByRuc(String ruc);

}
