package com.dicedev.outsideintddexample

class Car(var fuel: Double, val engine: Engine = Engine()) {

    fun turnOn() {

        engine.turnOn()
        fuel -= .5
    }
}