package smarthome.smarthome.builder;

public final class ScenarioDirector {

    private ScenarioDirector() { }

    public static Scenario leaveHome(String lightId, String lockId, String thermostatId) {
        return new ScenarioBuilder()
                .name("Leave home")
                .description("light off, door locked, heating off")
                .turnOff(lightId)
                .turnOn(lockId)          // for a lock "on" = locked
                .turnOff(thermostatId)
                .build();
    }

    public static Scenario goodNight(String lightId, String lockId) {
        return new ScenarioBuilder()
                .name("Good night")
                .description("light off, door locked")
                .turnOff(lightId)
                .turnOn(lockId)
                .build();
    }

    public static Scenario movieMode(String lightId) {
        return new ScenarioBuilder()
                .name("Movie mode")
                .description("lights off")
                .turnOff(lightId)
                .build();
    }
}
