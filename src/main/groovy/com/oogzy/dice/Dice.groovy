package com.oogzy.dice

class Dice {
	private static final Random RANDOM = new Random()

	private final int sides

	Dice(int sides) {
		this.sides = sides
	}

	int getSides() {
		return sides
	}

	DiceResults roll(int timesToRoll) {
		int[] results = new int[timesToRoll]
		for (int t = 0; t < timesToRoll; t++) {
			results[t] = roll()
		}
		return new DiceResults(this, results)
	}

	int roll() {
		return RANDOM.nextInt(sides) + 1
	}

	String toString() {
		return String.format("D%s", getSides())
	}
}