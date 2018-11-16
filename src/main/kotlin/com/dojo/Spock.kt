package com.dojo

class Spock {
    fun against(rock: Rock): Any {
        return this
    }

    fun against(paper: Paper): Any {
        return paper
    }

    fun against(scissors: Scissors): Any {
        return this
    }

    fun against(lizard: Lizard): Any {
        return lizard
    }

    fun against(spock: Spock): Any {
        return NoWinner()
    }

}
