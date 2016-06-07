package com.vutichenko.sectest;

import com.vutichenko.sectest.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by vutichenko on 07.06.2016.
 */
public class WebbAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    public static final String MAPPING_URL = "/*";

    @Override
    protected String[] getServletMappings() {
        return new String[]{MAPPING_URL};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }
}
