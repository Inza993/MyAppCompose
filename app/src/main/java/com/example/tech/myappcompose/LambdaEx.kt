package com.example.tech.myappcompose

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val coins1: (Int) -> String = {
        "$it quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()

    trickOrTreat()

    val treatFunction1 = trickOrTreat(false) { "$it quarters" }

    repeat(4) {
        treatFunction()
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}

fun trickOrTreat(isTrick: Boolean = false, extraTreat: (Int) -> String = { n -> "**$n" }) : () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat(5))
        return treat
    }
}