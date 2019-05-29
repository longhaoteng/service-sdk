package com.github.longhaoteng.sdk.configuration;

import com.github.longhaoteng.sdk.common.ApplicationContextKeeper;
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
