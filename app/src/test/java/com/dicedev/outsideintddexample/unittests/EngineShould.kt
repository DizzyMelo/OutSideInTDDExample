package com.dicedev.outsideintddexample.unittests

import com.dicedev.outsideintddexample.Engine
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class EngineShould {
    private lateinit var engine: Engine

    @Before
    fun setUp() {
        engine = Engine()
    }

    @Test
    fun `turn on`() {
        engine.turnOn()

        assertThat(engine.isTurnedOn).isTrue()
    }

    @Test
    fun `temperature increases when car turns on`() {
        engine.turnOn()

        assertThat(engine.temperature).isEqualTo(95.0)
    }
}