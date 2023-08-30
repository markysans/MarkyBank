package com.dolan.marky_bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf()
                .disable()
                .authorizeHttpRequests((requests) -> {
//                      requests.anyRequest().authenticated(); //to authenticate all the request
//                      requests.anyRequest().permitAll();
//                      requests.anyRequest().denyAll(); //to deny all the request
                    requests.requestMatchers("/myAccount", "/myBalance", "/myCards", "/myLoans", "/user").authenticated();
                    requests.requestMatchers("/notices", "/contact", "/register").permitAll();
        })
        .formLogin(Customizer.withDefaults())
        .httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        //Approach 1
////        UserDetails admin = User.withDefaultPasswordEncoder()
////                .username("admin")
////                .password("admin123")
////                .authorities("admin")
////                .build();
////        UserDetails user = User.withDefaultPasswordEncoder()
////                .username("user")
////                .password("user123")
////                .authorities("read")
////                .build();
////        return new InMemoryUserDetailsManager(admin, user);
//
//        //Approach 2 where we use NoOpPasswordEncoder Bean while creating the user details
//        UserDetails admin = User.withUsername("admin")
//                .password("admin123")
//                .authorities("admin")
//                .build();
//        UserDetails user = User.withUsername("user")
//                .password("user123")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }

//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
