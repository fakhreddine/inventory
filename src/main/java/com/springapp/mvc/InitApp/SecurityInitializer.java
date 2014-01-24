package com.springapp.mvc.InitApp;

/**
 * Created by aleksandrs on 1/24/14.
 */
import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(2)
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {

}