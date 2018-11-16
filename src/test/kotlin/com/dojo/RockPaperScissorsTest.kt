package com.dojo

import org.junit.Test

class RockPaperScissorsTest {

    /*
        ROCK
     */

    @Test
    fun `given rock vs rock, should have no winner`() {

        val winner = Rock().against(Rock())

        assert(winner is NoWinner)
    }

    @Test
    fun `given rock vs paper, paper should win`() {

        val winner = Rock().against(Paper())

        assert( winner is Paper )

    }

    @Test
    fun `given rock vs scissors, rock should win`() {

        val winner = Rock().against(Scissors())

        assert( winner is Rock )

    }

    @Test
    fun `given rock vs lizard, rock should win`() {

        val winner = Rock().against(Lizard())

        assert( winner is Rock )

    }

    @Test
    fun `given rock vs spock, spock should win`() {

        val winner = Rock().against(Spock())

        assert( winner is Spock )

    }


    /*
        PAPER
     */

    @Test
    fun `given paper vs rock, paper should win`() {

        val winner = Paper().against(Rock())

        assert( winner is Paper )

    }

    @Test
    fun `given paper vs paper, should have no winner`() {

        val winner = Paper().against(Paper())

        assert( winner is NoWinner )

    }

    @Test
    fun `given paper vs scissors, scissors should win`() {

        val winner = Paper().against(Scissors())

        assert( winner is Scissors )

    }

    @Test
    fun `given paper vs lizard, lizard should win`() {

        val winner = Paper().against(Lizard())

        assert( winner is Lizard )

    }

    @Test
    fun `given paper vs spock, paper should win`() {

        val winner = Paper().against(Spock())

        assert( winner is Paper )

    }

    /*
        SCISSORS
     */


    @Test
    fun `given scissors vs rock, rock should win`() {

        val winner = Scissors().against(Rock())

        assert( winner is Rock )

    }


    @Test
    fun `given scissors vs paper, scissors should win`() {

        val winner = Scissors().against(Paper())

        assert( winner is Scissors )

    }

    @Test
    fun `given scissors vs scissors, should have no winner`() {

        val winner = Scissors().against(Scissors())

        assert( winner is NoWinner )

    }


    @Test
    fun `given scissors vs lizard, scissors should win`() {

        val winner = Scissors().against(Lizard())

        assert( winner is Scissors )

    }

    @Test
    fun `given scissors vs spock, spock should win`() {

        val winner = Scissors().against(Spock())

        assert( winner is Spock )

    }


    /*
        LIZARD
     */


    @Test
    fun `given lizard vs rock, rock should win`() {

        val winner = Lizard().against(Rock())

        assert( winner is Rock )

    }


    @Test
    fun `given lizard vs paper, lizard should win`() {

        val winner = Lizard().against(Paper())

        assert( winner is Lizard )

    }

    @Test
    fun `given lizard vs scissors, scissors should win`() {

        val winner = Lizard().against(Scissors())

        assert( winner is Scissors )

    }

    @Test
    fun `given lizard vs lizard, should have no winner`() {

        val winner = Lizard().against(Lizard())

        assert( winner is NoWinner )

    }

    @Test
    fun `given lizard vs spock, lizard should win`() {

        val winner = Lizard().against(Spock())

        assert( winner is Lizard )

    }



    /*
        SPOCK
     */


    @Test
    fun `given spock vs rock, spock should win`() {

        val winner = Spock().against(Rock())

        assert( winner is Spock )

    }


    @Test
    fun `given spock vs paper, paper should win`() {

        val winner = Spock().against(Paper())

        assert( winner is Paper )

    }

    @Test
    fun `given spock vs scissors, spock should win`() {

        val winner = Spock().against(Scissors())

        assert( winner is Spock )

    }

    @Test
    fun `given spock vs lizard, lizard should win`() {

        val winner = Spock().against(Lizard())

        assert( winner is Lizard )

    }


    @Test
    fun `given spock vs spock, should have no winner`() {

        val winner = Spock().against(Spock())

        assert( winner is NoWinner )

    }

}