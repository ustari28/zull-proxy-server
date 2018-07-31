package com.alan.zuulserver.config;

import com.alan.zuulserver.service.HeaderFilter;
import com.alan.zuulserver.service.SecurityFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Expose basic filter into Spring's Context.
 */
@Configuration
public class FilterConfig {

    /**
     * Simple secutiry filter.
     *
     * @return {@link SecurityFilter}
     */
    @Bean
    public ZuulFilter securityFilter() {
        return new SecurityFilter();
    }

    /**
     * Simple header filter.
     *
     * @return {@link HeaderFilter}
     */
    @Bean
    public ZuulFilter headerFilter() {
        return new HeaderFilter();
    }
}
