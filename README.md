Dice v1.0
===
Exemplos:

    Dice dice = new Dice(20) // Creates a dice with 20 sides.
    int result = dice.roll() // Roll the dice one time and get the result.

    DiceResults result = dice.roll(10) // Roll the dice 10 times.
    result.sum() // Get the sum of all dice rolls.

#### Default dices:

    DicePack.getD4()
    DicePack.getD6()
    DicePack.getD8()
    DicePack.getD10()
    DicePack.getD12()
    DicePack.getD20()
