package com.github.zipcodewilmington.casino.games.numberguess;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGuessGameTest {

    @Test

    void guessNumberEngineTest1() {
        NumberGuessGame gg = new NumberGuessGame();

        boolean actual = gg.guessNumberEngine(12,12,1);
        boolean expected = true;
        Assert.assertEquals(actual, expected);

    }
    @Test

    void guessNumberEngineTest2() {
        NumberGuessGame gg = new NumberGuessGame();

        boolean actual = gg.guessNumberEngine(12,12,5);
        boolean expected = true;
        Assert.assertEquals(actual, expected);

    }

    @Test

    void guessNumberEngineTest3() {
        NumberGuessGame ng = new NumberGuessGame();
        boolean actual = ng.guessNumberEngine(15,45,3);
        boolean expected = false;
        Assert.assertEquals(actual,expected);
    }
    @Test
    void guessNumberEngineTest4(){
        NumberGuessGame obj = new NumberGuessGame();
        boolean actual = obj.guessNumberEngine(23,56,5);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }

}