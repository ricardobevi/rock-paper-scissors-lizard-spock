package com.dojo

class Paper{

    fun against(rock: Rock): Any {
        return this
    }

    fun against(scissors: Scissors): Any {
        return scissors
    }

    fun against(paper: Paper): Any {
        return NoWinner()
    }

    fun against(lizard: Lizard): Any {
        return lizard
    }

    fun against(spock: Spock): Any {
        return this
    }

}
