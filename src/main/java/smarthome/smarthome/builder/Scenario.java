package smarthome.smarthome.builder;

import java.util.List;

public class Scenario {
    private final String name;
    private final String description;
    private final List<ScenarioStep> steps;

    Scenario(String name, String description, List<ScenarioStep> steps) {
        this.name = name;
        this.description = description;
        this.steps = List.copyOf(steps);
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public List<ScenarioStep> getSteps() { return steps; }
}