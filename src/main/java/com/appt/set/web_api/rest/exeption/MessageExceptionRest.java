package com.appt.set.web_api.rest.exeption;

import lombok.Builder;
import lombok.Value;

@Value 
@Builder
public class MessageExceptionRest {

    private String url;
    private String message;


}
