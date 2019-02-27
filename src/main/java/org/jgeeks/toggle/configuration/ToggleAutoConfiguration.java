package org.jgeeks.toggle.configuration;

import org.jgeeks.toggle.PropertyToggleLookupService;
import org.jgeeks.toggle.ToggleLookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "toggle", name = "enabled", matchIfMissing = true)
public class ToggleAutoConfiguration {

    @Configuration
    @EnableConfigurationProperties(ToggleProperties.class)
    public static class ToggleConfiguration {

        @Autowired
        ToggleProperties toggleProperties;

        @ConditionalOnMissingBean
        @Bean
        public ToggleLookupService toggleLookupService() {
            return new PropertyToggleLookupService(toggleProperties);
        }
    }
}
