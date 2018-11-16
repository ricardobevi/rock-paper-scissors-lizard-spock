package com.dojo

class Lizard {
    fun against(rock: Rock): Any {
        return rock
    }

    fun against(paper: Paper): Any {
        return this
    }

    fun against(scissors: Scissors): Any {
        return scissors
    }

    fun against(lizard: Lizard): Any {
        return NoWinner()
    }

    fun against(spock: Spock): Any {
        return this
    }

}
