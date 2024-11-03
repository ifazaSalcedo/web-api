package com.appt.set.web_api.soap.exeption;

public class SoapNoResultExeptionHanler extends SoapFaultHandler{

    public SoapNoResultExeptionHanler(Exception exception) {
        super(exception);
    }

    @Override
    String errorCode() {
        return  "NO_RESULT";
    }

}
