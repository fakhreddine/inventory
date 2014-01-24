package com.springapp.mvc.InitApp;

/**
 * Created by aleksandrs on 1/24/14.
 */
import javax.sql.DataSource;

import com.springapp.mvc.services.MyCustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MyCustomUserDetailsService myCustomUserDetailsService;

    @Override
    protected void registerAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.userDetailsService(myCustomUserDetailsService)
                .authorizeRequests()
                .antMatchers("/app/**").hasRole("ADMIN")
                .and()
                .formLogin()
                .loginPage("/index.jsp")
                .defaultSuccessUrl("/app/")
                .failureUrl("/index.jsp")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/index.jsp");
    }

}