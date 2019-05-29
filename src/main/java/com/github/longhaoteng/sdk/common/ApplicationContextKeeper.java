package com.github.longhaoteng.sdk.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ApplicationContextKeeper
 *
 * @author mr.long
 */
public class ApplicationContextKeeper implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextKeeper.applicationContext = applicationContext;
    }
}
