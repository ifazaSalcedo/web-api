package com.appt.set.web_api.exeptions;

public class PersonNotFountExeption extends RuntimeException{

    public PersonNotFountExeption(String msg) {

        super(msg);

    }
    public PersonNotFountExeption(String msg, Throwable cause) {

        super(msg, cause);

    }
    public PersonNotFountExeption(Throwable cause) {

        super(cause);

    }

}
