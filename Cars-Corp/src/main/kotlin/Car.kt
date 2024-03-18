package org.example

class Car<T>(private val engineInterface: EngineInterface?, private val storageInterface: StorageInterface<T>) :
    Vehicle<T> {
    override fun accelerate() {
        engineInterface?.move()
    }

    override fun brake() {
        println("break")
    }

    override fun refill(source: T) {
        storageInterface.fill(source)
    }

}