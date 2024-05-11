package com.ironhack.partone;

public class Main {
    public static void main(String[] args) {
        var wa = new WorkoutAssistant();

//        System.out.println(wa.createWorkout("legs"));

    }

    public static void test() {
        var wa = new WorkoutAssistant();
        var result = wa.createWorkout("chest");

        var expectedResult = """
                bench press workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
        if (result.equals(expectedResult)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}