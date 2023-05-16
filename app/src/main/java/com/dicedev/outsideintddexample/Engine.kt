package com.dicedev.outsideintddexample

class Engine(var temperature: Double = 15.0, var isTurnedOn: Boolean = false) {
    fun turnOn() {
        isTurnedOn = true
        temperature = 95.0
    }
}