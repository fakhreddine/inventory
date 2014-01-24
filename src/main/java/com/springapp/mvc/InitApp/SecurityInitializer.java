package com.springapp.mvc.InitApp;

/**
 * Created by aleksandrs on 1/24/14.
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
@EnableWebSecurity
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {

}