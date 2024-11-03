package com.appt.set.web_api.soap.exeption;

import com.appt.set.web_api.exeptions.PersonNotFountExeption;

public class SoapFaultHanlerFactory {

    public static SoapFaultHandler of(Exception ex){
        if (ex instanceof IllegalArgumentException) {

            return new SoapIllegalArgumentExceptionHandler(ex);
            
        }
        if (ex instanceof PersonNotFountExeption) {
            return new SoapNoResultExeptionHanler(ex);
            
        }
        return new SoapExceptionHanler(ex);
    }

}
