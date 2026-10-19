package smarthome;

import smarthome.smarthome.builder.Scenario;
import smarthome.smarthome.builder.ScenarioBuilder;
import smarthome.smarthome.builder.ScenarioDirector;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== СИСТЕМА УМНЫЙ ДОМ: ТЕСТ ПАТТЕРНА BUILDER ===");

        // 1. Создание сценария с помощью Директора (готовые рецепты)
        Scenario leaveHomeScenario = ScenarioDirector.leaveHome("light-1", "lock-1", "thermostat-1");
        System.out.println("Сценарий 1 (через Director): " + leaveHomeScenario.getName());
        System.out.println("Описание: " + leaveHomeScenario.getDescription());
        System.out.println("Количество шагов: " + leaveHomeScenario.getSteps().size());

        System.out.println("--------------------------------------------------");

        // 2. Создание кастомного сценария напрямую через ScenarioBuilder
        Scenario customScenario = new ScenarioBuilder()
                .name("Кинотеатр дома")
                .description("Приглушить свет для просмотра фильма")
                .turnOff("light-1")
                .build();

        System.out.println("Сценарий 2 (через Builder): " + customScenario.getName());
        System.out.println("Описание: " + customScenario.getDescription());
        System.out.println("Количество шагов: " + customScenario.getSteps().size());

        System.out.println("=== ТЕСТ УСПЕШНО ЗАВЕРШЕН ===");
    }
}