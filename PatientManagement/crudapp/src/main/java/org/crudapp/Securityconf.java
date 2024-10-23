package org.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Securityconf {
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig {
        @Autowired
        private UserDetailsService userDetailsService;


        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .requestMatchers("/api/**").authenticated()
                    .anyRequest().permitAll()
                    .and()
                    .formLogin(login -> login
                            .loginPage("/login")
                    .defaultSuccessUrl("/")
                    .failureUrl("/login?error=true"));
        }


        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }


}
