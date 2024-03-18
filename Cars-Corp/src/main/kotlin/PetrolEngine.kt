package org.example

class PetrolEngine(private val oilPipe: OilPipe, private val piston: Piston) : EngineInterface {
    override fun move() {
        val oil: Oil = oilPipe.suckOil()
        val energy: Energy = oil.burn()
        energy.push(piston)
    }
}