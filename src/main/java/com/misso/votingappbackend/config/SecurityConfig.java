package com.misso.votingappbackend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Value("${api.user.username}")
    String user_username;

    @Value("${api.user.password}")
    String user_password;

    @Value("${api.admin.username}")
    String admin_username;

    @Value("${api.admin.password}")
    String admin_password;

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails admin = User.withUsername(admin_username)
                .password(passwordEncoder().encode(admin_password))
                .roles("ADMIN")
                .build();
        UserDetails user = User.withUsername(user_username)
                .password(passwordEncoder().encode(user_password))
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                // TODO:
                // Current request matcher is to test api access restriction
                // Update the requestMatchers after making admin APIs
                .requestMatchers("/positions/**").hasRole("ADMIN")
                .requestMatchers("/candidates/**").hasAnyRole("ADMIN", "USER")
                .anyRequest().authenticated()
                .and()
                .formLogin().disable()
                .httpBasic();
        return http.build();
    }

}