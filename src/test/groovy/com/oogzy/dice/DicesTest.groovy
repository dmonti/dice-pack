package com.oogzy.dice

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertTrue

import org.junit.jupiter.api.Test

class DicesTest {
    private static final int ROLL_TIMES = 1000

    @Test
    void testToString() {
        Dice dice = new Dice(20)
        assertEquals("D20", dice.toString())
    }

    @Test
    void testRoll() {
        for (int i = 0; i < ROLL_TIMES; i++) {
            int scoreD4 = DicePack.getD4().roll()
            assertTrue(scoreD4 >= 1 && scoreD4 <= 4)

            int scoreD6 = DicePack.getD6().roll()
            assertTrue(scoreD6 >= 1 && scoreD6 <= 6)

            int scoreD8 = DicePack.getD8().roll()
            assertTrue(scoreD8 >= 1 && scoreD8 <= 8)

            int scoreD10 = DicePack.getD10().roll()
            assertTrue(scoreD10 >= 1 && scoreD10 <= 10)

            int scoreD12 = DicePack.getD12().roll()
            assertTrue(scoreD12 >= 1 && scoreD12 <= 12)

            int scoreD20 = DicePack.getD20().roll()
            assertTrue(scoreD20 >= 1 && scoreD20 <= 20)

            int scoreD100 = DicePack.getD100().roll()
            assertTrue(scoreD100 >= 1 && scoreD100 <= 100)
        }
    }

    @Test
    void testRollXTimes() {
        for (int i = 0; i < ROLL_TIMES; i++) {
            int score = DicePack.getD20().roll(3).sum()
            assertTrue(score >= 3 && score <= 60)
        }
    }
}