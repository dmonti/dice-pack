package com.oogzy.dice

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertTrue

import org.junit.jupiter.api.Test

public class DicesTest {
	private static final int ROLL_TIMES = 1000

	@Test
	public void testToString() {
		Dice dice = new Dice(20)
		assertEquals("D20", dice.toString())
	}

	@Test
	public void testRoll() {
		for (int i = 0; i < ROLL_TIMES; i++) {
			int score = DicePack.getD20().roll()
			assertTrue(score >= 1 && score <= 20)
		}
	}

	@Test
	public void testRollXTimes() {
		for (int i = 0; i < ROLL_TIMES; i++) {
			int score = DicePack.getD20().roll(3).sum()
			assertTrue(score >= 3 && score <= 60)
		}
	}
}