package org.example

fun main() {
//    Petrol Car
    val tank = Tank()
    val oilPipe = OilPipe()
    val piston = Piston()
    val petrolEngine = PetrolEngine(oilPipe, piston)
    val petroCar = Car<Oil>(petrolEngine, tank)
    val oil = Oil()
    petroCar.refill(oil)
    petroCar.accelerate()
    petroCar.brake()

    //Electric car
    val electrons = Electrons()
    val battery = Battery(electrons)
    val speedController = SpeedController(BatteryManagementSystem(), ElectricMotor())
    val electricEngine = ElectricEngine(speedController)
    val electricCar = Car<Electrons>(electricEngine, battery)
    electricCar.refill(electrons)
    electricCar.accelerate()
    electricCar.brake()

}