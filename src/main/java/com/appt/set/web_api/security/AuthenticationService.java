package com.appt.set.web_api.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class AuthenticationService {
    private final String headerName = "X-API-KEY";
    private final ServerApiKey serverApiKey;
    

    public Authentication getAuthentication(HttpServletRequest request){
        String apiKey= request.getHeader(headerName);
        if(apiKey== null || !apiKey.equals(serverApiKey.getApiKey())){
            throw  new BadCredentialsException("Autenticacion invalida");
        }
        return new ApiAuthentication(apiKey, AuthorityUtils.NO_AUTHORITIES);
    }
}
