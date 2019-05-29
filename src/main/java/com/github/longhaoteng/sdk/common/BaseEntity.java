package com.github.longhaoteng.sdk.common;

import org.springframework.context.ApplicationContext;

/**
 * BaseEntity
 *
 * @author mr.long
 */
public abstract class BaseEntity {

    private ApplicationContext applicationContext;

    public BaseEntity() {
        applicationContext = ApplicationContextKeeper.getApplicationContext();
    }

    protected <T> T getBean(Class<T> beanClass) {
        return applicationContext.getBean(beanClass);
    }

    protected <T> T getBean(String name, Class<T> beanClass) {
        return applicationContext.getBean(name, beanClass);
    }
}
