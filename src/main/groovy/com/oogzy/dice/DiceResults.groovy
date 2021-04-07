package com.oogzy.dice

class DiceResults {
	private Dice dice

	private int[] rolls

	DiceResults(Dice dice, int[] rolls) {
		this.dice = dice
		this.rolls = rolls
	}

	int[] getRolls() {
		return rolls
	}

	int sum() {
		int sum = 0
		getRolls().each({ sum += it })
		return sum
	}
}