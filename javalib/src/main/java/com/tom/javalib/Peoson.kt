package com.tom.javalib

fun main() {
    val p = Peoson()
    p.weight = 65f
    p.height = 1.7f
    println("bmi: ${p.getBmi()}")
}

class Peoson() {
    var weight = 0f
    var height = 0f
    fun hello() {
        println("Hello World!")
    }
    fun getBmi() : Float {
        val bmi = weight / (height*height)
        return bmi
    }
}