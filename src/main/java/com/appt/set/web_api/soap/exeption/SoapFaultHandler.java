package com.appt.set.web_api.soap.exeption;

import javax.xml.namespace.QName;

import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract  class SoapFaultHandler {
    private static final QName Q_CODE= new QName("errorCode");
    private static final QName Q_MESSAGE= new QName("message");

    private final Exception exception;

    abstract String errorCode();

    public String message(){
        return exception.getLocalizedMessage();
    }

    public void addFaultDetail(SoapFault fault){
        SoapFaultDetail soapFaultDetail= fault.addFaultDetail();
        soapFaultDetail.addFaultDetailElement(Q_CODE)
        .addText(errorCode());
        soapFaultDetail.addFaultDetailElement(Q_MESSAGE)
        .addText(message());
    }

}
