package org.jgeeks.toggle.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "toggle")
public class ToggleProperties {
    private boolean enabled;
    private Map<String, Boolean> toggles = new HashMap<>();
}
