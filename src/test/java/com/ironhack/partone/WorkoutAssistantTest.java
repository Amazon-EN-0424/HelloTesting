package com.ironhack.partone;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutAssistantTest {


    private static WorkoutAssistant wa;

//    ctrl + y to delete an entire line


//    @BeforeAll run once at the beginning
    @BeforeEach // run before every test
    public void setup(){
        wa = new WorkoutAssistant();
    }

    @Test
    @DisplayName("Test chest") //TODO explore the DisplayNameGeneration
    public void given_ChestBodyPart_when_askingWorkout_then_benchPressExercise() {
//        Arrange
        var bodyPartToTrain = "chest";
        var exceptedResult = """
                bench press workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
//        Act
        var actualResult = wa.createWorkout(bodyPartToTrain);

//        Assert
        assertEquals(exceptedResult, actualResult);
    }

    @Nested
    @DisplayName("Legs Tests")
    class LegsTest {
        @Test
        public void given_LegBodyPart_when_askingWorkout_then_legPressExercise() {
//        Arrange
            var bodyPartToTrain = "leg";
            var exceptedResult = """
                leg press workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
//        Act
            var actualResult = wa.createWorkout(bodyPartToTrain);

//        Assert
            assertEquals(exceptedResult, actualResult);
        }

        @Test
        public void given_LegsBodyPart_when_askingWorkout_then_legPressExercise() {
//        Arrange
            var bodyPartToTrain = "legs";
            var exceptedResult = """
                leg press workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
//        Act
            var actualResult = wa.createWorkout(bodyPartToTrain);

//        Assert
            assertEquals(exceptedResult, actualResult);
        }
    }



    @Test
    public void given_genericBodyPart_when_askingWorkout_then_sitUpExercise() {
//        Arrange
        var bodyPartToTrain = "body";
        var exceptedResult = """
                jumping jacks workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
//        Act
        var actualResult = wa.createWorkout(bodyPartToTrain);

//        Assert
        assertEquals(exceptedResult, actualResult);
    }




    @Test
    public void given_backBodyPart_when_askingWorkout_then_latPullDownExercise() {
//        Arrange
        var bodyPartToTrain = "back";
        var exceptedResult = """
                lat pull down workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
//        Act
        var actualResult = wa.createWorkout(bodyPartToTrain);

//        Assert
        assertEquals(exceptedResult, actualResult);
    }

    @Test
    public void given_absBodyPart_when_askingWorkout_then_sitUpExercise() {
//        Arrange
        var bodyPartToTrain = "abs";
        var exceptedResult = """
                sit ups workout:
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                12 * 3 - 120 seconds rest
                """;
//        Act
        var actualResult = wa.createWorkout(bodyPartToTrain);

//        Assert
        assertEquals(exceptedResult, actualResult);
    }



}