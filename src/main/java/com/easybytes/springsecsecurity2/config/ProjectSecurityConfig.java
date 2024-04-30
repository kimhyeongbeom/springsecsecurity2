package com.easybytes.springsecsecurity2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> requests
//                .requestMatchers("/myAccount", "/myBalance", "/myLoans", "myCards").authenticated()
//                .requestMatchers("/contact", "/notices").permitAll() )
//        .formLogin(withDefaults())
//        .httpBasic(withDefaults());
//        return http.build();

        http.authorizeHttpRequests((requests) -> requests
                        .anyRequest().permitAll() )
                .formLogin(withDefaults())
                .httpBasic(withDefaults());
        return http.build();


    }
}
