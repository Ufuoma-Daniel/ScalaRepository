/**
  * Created by Administrator on 06/06/2017.
  */
class Car (name: String, vType: String, cost: Int, colour: String, fuelType_ : String, carMake_ : String, seatAmount_ : String ) extends Vehicle(name,vType, cost, colour){
  private var fuelType = fuelType_
  private var carMake = carMake_
  private var seatAmount = seatAmount_

  // Getters
  def getFuelType : String = { fuelType}
  def getCarMake : String = { carMake}
  def getSeatAmount : String = { seatAmount}

  // Setters
  def setFuelType(newFuelType: String) : Any = {fuelType = newFuelType}
  def setCarMake(newMake: String) : Any = {carMake = newMake}
  def setSeatAmount(newSeatAmount: String) : Any = {seatAmount = newSeatAmount}

  //Misc
  def printVDetails() : String = { val send = printDetails() + " " +fuelType+ " " + carMake+ " "+ seatAmount
    send
  }
}
