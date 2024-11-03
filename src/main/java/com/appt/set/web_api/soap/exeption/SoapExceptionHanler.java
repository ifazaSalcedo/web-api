package com.appt.set.web_api.soap.exeption;

public class SoapExceptionHanler extends SoapFaultHandler{

    SoapExceptionHanler(Exception exception){
        super(exception);
    }

    @Override
    String errorCode() {
        return "ERROR";
    }

    @Override
    public String message() {
        return "Something go wrong";
    }

}

