package org.jgeeks.toggle;

import org.jgeeks.toggle.configuration.ToggleProperties;

public class PropertyToggleLookupService extends ToggleLookupService {

  private ToggleProperties toggleProperties;

  public PropertyToggleLookupService() {}

  public PropertyToggleLookupService(ToggleProperties toggleProperties) {
    this.toggleProperties = toggleProperties;
  }

  @Override
  public boolean isEnabled(String toggle) {
    return toggleProperties.getToggles().getOrDefault(toggle, false);
  }
}
