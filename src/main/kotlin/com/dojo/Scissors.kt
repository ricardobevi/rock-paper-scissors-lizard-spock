package com.dojo

class Scissors {

    fun against(scissors: Scissors): Any {
        return NoWinner()
    }

    fun against(rock: Rock): Any {
        return rock
    }

    fun against(paper: Paper): Any {
        return this
    }

    fun against(lizard: Lizard): Any {
        return this
    }

    fun against(spock: Spock): Any {
        return spock
    }

}
