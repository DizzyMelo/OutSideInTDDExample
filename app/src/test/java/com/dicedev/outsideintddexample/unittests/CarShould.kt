package com.dicedev.outsideintddexample.unittests

import com.dicedev.outsideintddexample.Car
import com.dicedev.outsideintddexample.Engine
import com.google.common.truth.Truth.assertThat
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test

class CarShould {

    private lateinit var engine: Engine
    private lateinit var car: Car

    @Before
    fun setUp() {
        engine = mock()
        car = Car(fuel = 6.0, engine)
    }

    @Test
    fun `lose fuel when car turns on`() {
        car.turnOn()

        assertThat(car.fuel).isEqualTo(5.5)
    }

    @Test
    fun `turn on its engine`() {
        car.turnOn()

        verify(engine, times(1)).turnOn()
    }
}