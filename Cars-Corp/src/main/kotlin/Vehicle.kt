package org.example

interface Vehicle<T> {
    fun accelerate()
    fun brake()
    fun refill(source: T)
}