package com.appt.set.web_api.soap.exeption;

public class SoapIllegalArgumentExceptionHandler extends SoapFaultHandler{

    SoapIllegalArgumentExceptionHandler(Exception exception) {
        super(exception);
    }

    @Override
    String errorCode() {
        return "BAD_REQUEST";
    }

    

}
