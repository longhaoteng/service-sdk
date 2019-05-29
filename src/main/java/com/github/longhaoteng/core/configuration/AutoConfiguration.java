package com.github.longhaoteng.core.configuration;

import com.github.longhaoteng.core.common.ApplicationContextKeeper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AutoConfiguration
 *
 * @author mr.long
 */
@Configuration
public class AutoConfiguration {

    @Bean
    public ApplicationContextKeeper buildContextKeeper() {
        return new ApplicationContextKeeper();
    }

}
