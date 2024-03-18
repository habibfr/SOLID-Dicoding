package org.example

class ElectricEngine(private val speedController: SpeedController) : EngineInterface {
    override fun move() {
        speedController.control()
    }
}

class SpeedController(private val batteryManagementSystem: BatteryManagementSystem, private val motor: ElectricMotor) {
    fun control() {
        val battery = batteryManagementSystem.getBattery()
        motor.rotate(battery)
    }
}

class BatteryManagementSystem {
    fun getBattery(): Battery {
        return Battery(Electrons())
    }
}

class ElectricMotor {
    fun rotate(battery: Battery) {

    }
}

class Electrons {

}

class Battery(private var electrons: Electrons) : StorageInterface<Electrons> {
    override fun fill(source: Electrons) {
        this.electrons = source
    }

    override fun getSource(): Electrons {
        return electrons
    }

}