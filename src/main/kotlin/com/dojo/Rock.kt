package com.dojo

class Rock{

    fun against(rock: Rock): Any {
        return NoWinner()
    }

    fun against(scissors: Scissors): Any {
        return this
    }

    fun against(paper: Paper): Any {
        return paper
    }

    fun against(lizard: Lizard): Any {
        return this
    }

    fun against(spock: Spock): Any {
        return spock
    }

}
