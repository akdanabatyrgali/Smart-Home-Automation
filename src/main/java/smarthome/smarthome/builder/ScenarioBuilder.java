package smarthome.smarthome.builder;

import java.util.ArrayList;
import java.util.List;

public class ScenarioBuilder {
    private String name;
    private String description = "no description";
    private final List<ScenarioStep> steps = new ArrayList<>();

    public ScenarioBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ScenarioBuilder description(String description) {
        this.description = description;
        return this;
    }

    public ScenarioBuilder turnOn(String deviceId) {
        steps.add(new ScenarioStep(deviceId, DeviceAction.TURN_ON));
        return this;
    }

    public ScenarioBuilder turnOff(String deviceId) {
        steps.add(new ScenarioStep(deviceId, DeviceAction.TURN_OFF));
        return this;
    }

    /** Validates and creates the final object. */
    public Scenario build() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Scenario must have a name");
        }
        if (steps.isEmpty()) {
            throw new IllegalStateException("Scenario '" + name + "' must have at least one step");
        }
        return new Scenario(name, description, steps);
    }
}
