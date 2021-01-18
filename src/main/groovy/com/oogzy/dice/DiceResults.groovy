package com.oogzy.dice

protected class DiceResults {
	private Dice dice

	private int[] rolls

	public DiceResults(Dice dice, int[] rolls) {
		this.dice = dice
		this.rolls = rolls
	}

	public Dice getDice() {
		return dice
	}

	public int[] getRolls() {
		return rolls
	}

	public int sum() {
		int sum = 0
		getRolls().each({ sum += it })
		return sum
	}
}