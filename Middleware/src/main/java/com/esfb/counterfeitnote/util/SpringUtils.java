package com.esfb.counterfeitnote.util;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class SpringUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        SpringUtils.applicationContext = applicationContext;
    }

    public static MessageSource getMessageSource() {
        return (MessageSource) applicationContext.getBean("messageSource");
    }

    public static Locale getLocale(){
    	return new Locale(applicationContext.getEnvironment().resolvePlaceholders("${locale.langcode}"));
    }
}
