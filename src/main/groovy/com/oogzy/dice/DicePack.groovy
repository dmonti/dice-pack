package com.oogzy.dice

class DicePack {
    private static final Dice D4 = new Dice(4)
    private static final Dice D6 = new Dice(6)
    private static final Dice D8 = new Dice(8)
    private static final Dice D10 = new Dice(10)
    private static final Dice D12 = new Dice(12)
    private static final Dice D20 = new Dice(20)
    private static final Dice D100 = new Dice(100)

    static Dice getD4() {
        return D4
    }

    static Dice getD6() {
        return D6
    }

    static Dice getD8() {
        return D8
    }

    static Dice getD10() {
        return D10
    }

    static Dice getD12() {
        return D12
    }

    static Dice getD20() {
        return D20
    }

    static Dice getD100() {
        return D100
    }
}