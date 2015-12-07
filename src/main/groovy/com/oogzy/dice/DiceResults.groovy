package com.oogzy.rpg.dice

protected class DiceResults
{
	private Dice dice

	private int[] rolls

    public DiceResults(Dice dice, int[] rolls)
    {
        this.dice = dice
        this.rolls = rolls
    }

    public getRolls()
    {
        return rolls
    }

	public int sum()
	{
		int sum = 0
		rolls.each({ sum += it })
		return sum
	}
}