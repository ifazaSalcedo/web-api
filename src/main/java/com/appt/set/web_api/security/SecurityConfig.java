package com.appt.set.web_api.security;


import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private final AuthenticationFilter authenticationFilter;
    private final ServerApiKey serverApiKey;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
        .csrf(csrf -> csrf.disable())
        /***
         *desabilita la integracion para verificar los cors de orignes
         * .cors(cors -> cors.disable()) 
        */
        .cors(cors -> configurationSource())
        .authorizeHttpRequests(auth-> auth.requestMatchers("/ws/**", "/rest/**")
        .permitAll().anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults())
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .addFilterBefore(authenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
    
    public CorsConfigurationSource configurationSource(){
        CorsConfiguration corsConfig= new CorsConfiguration();
        corsConfig.setAllowedOrigins(Arrays.asList(serverApiKey.getApiOrigins()));
        corsConfig.setAllowedMethods(Arrays.asList("GET"));
        corsConfig.setAllowedHeaders(Arrays.asList("Content-Type", "Authorization", "X-API-KEY"));
        corsConfig.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source= new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("corsConfigurer/**", corsConfig);
        return source;
    }
}
