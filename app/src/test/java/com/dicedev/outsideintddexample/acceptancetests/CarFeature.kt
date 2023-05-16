package com.dicedev.outsideintddexample.acceptancetests

import com.dicedev.outsideintddexample.Car
import com.dicedev.outsideintddexample.Engine
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class CarFeature {

    private lateinit var car: Car
    private lateinit var engine: Engine

    @Before
    fun setUp() {
        engine = Engine()
        car = Car(6.0, engine)
    }

    @Test
    fun `car looses fuel when turns on`() {
        car.turnOn()

        assertThat(car.fuel).isEqualTo(5.5)
    }

    @Test
    fun `turn on the car turns on the engine and increases temperature`() {
        car.turnOn()

        assertThat(car.engine.temperature).isEqualTo(95)
        assertThat(car.engine.isTurnedOn).isTrue()
    }
}