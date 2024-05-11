package com.ironhack.partone;

public class WorkoutAssistant {


    public String createWorkout(String bodyPart) {

        String exerciseToDo;

        switch (bodyPart.toLowerCase()){
            case "chest" -> exerciseToDo = "bench press";
            case "legs" -> exerciseToDo = "leg press";
            case "leg" -> exerciseToDo = "leg press";
            case "back" -> exerciseToDo = "lat pull down";
            case "abs" -> exerciseToDo = "sit ups";
            default -> exerciseToDo = "jumping jacks";
        }

        var workoutTemplate = """
                %s workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
        return workoutTemplate.formatted(exerciseToDo);
    }

}
