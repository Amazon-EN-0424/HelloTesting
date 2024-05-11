package com.ironhack.parttwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void given_nameIsEmpty_when_runningHello_anExceptionIsThrown() {
//        arrange
        var name = "";
//        act & assert
        assertThrows(NameEmptyException.class, () -> Main.hello(name));


    }

    @Test
    public void given_nameIsNotEmpty_when_runningHello_noExceptionIsThrown() {
//        arrange
        var name = "Mario";
//        act & assert
        assertDoesNotThrow(() -> Main.hello(name));
    }

}