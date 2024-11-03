package com.appt.set.web_api.soap.exeption;

import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

public class SoapExceptionInterceptor extends SoapFaultMappingExceptionResolver{

    @Override
    protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
        logger.warn(ex);
        SoapFaultHandler handler= SoapFaultHanlerFactory.of(ex);
        handler.addFaultDetail(fault);
    }
    
}
