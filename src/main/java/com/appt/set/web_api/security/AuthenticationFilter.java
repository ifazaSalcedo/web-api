package com.appt.set.web_api.security;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class AuthenticationFilter extends GenericFilterBean {

    private final AuthenticationService authenticationService;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {


            String path = ((HttpServletRequest) request).getRequestURI();
            // Omitir autenticación para rutas públicas
            if (path.startsWith("/ws/**") || path.startsWith("/rest/**")) {
                chain.doFilter(request, response);
                return;
            }


            Authentication authentication = authenticationService.getAuthentication((HttpServletRequest) request);
            SecurityContextHolder.getContext().setAuthentication(authentication);


        } catch (Exception e) {
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            //httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
            PrintWriter writer = httpServletResponse.getWriter();
            writer.print(e.getMessage());
            writer.flush();
            writer.close();
        }
        chain.doFilter(request, response);
    }

}
