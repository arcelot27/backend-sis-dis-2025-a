package com.corhuila.AgendaManager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/error").permitAll() // Permite la página de error
                .requestMatchers("/").permitAll()      // Permite la ruta raíz
                .requestMatchers("/swagger-ui.html", "/swagger-ui/**").denyAll() // Bloquea Swagger
                .anyRequest().authenticated()         // El resto requiere autenticación
            )
            .formLogin(form -> form
                .loginPage("/login")                 // Página personalizada de login
                .permitAll()
            )
            .csrf(csrf -> csrf.disable());           // Desactiva CSRF para desarrollo

        return http.build();
    }
}