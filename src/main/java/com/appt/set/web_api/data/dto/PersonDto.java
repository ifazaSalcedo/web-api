package com.appt.set.web_api.data.dto;

import com.appt.set.web_api.data.entity.Person;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personDto", propOrder = {
    "personId",
    "name",
    "lastname",
    "ruc",
    "dv",
    "rucFormer",
    "state"
})
@Data
public class PersonDto {
    @XmlElement(required = true)
    private Long personId;
    @XmlElement(required = true)
    private String name;
    @XmlElement(required = true)
    private String lastname;
    @XmlElement(required = true)
    private String ruc;
    @XmlElement(required = true)
    private int dv;
    @XmlElement(required = true)
    private String rucFormer;
    @XmlElement(required = true)
    private String state;

    public PersonDto(Person person) {
        this.personId= person.getPersonId();
        this.name= person.getName();
        this.lastname= person.getLastname();
        this.ruc= person.getRuc();
        this.dv= person.getDv();
        this.rucFormer= person.getRucFormer();
        this.state= person.getState().toString();
    }
}
