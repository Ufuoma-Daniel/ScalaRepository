/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle(name : String, vType: String, cost_ : Int, colour_ : String) {
  private var vehicleID = 0
  private var vehicleName = name
  private var vehicleType = vType
  private var cost = cost_
  private var colour = colour_
  private var makeDate = "1/1/1990"
  private var currentState = "Good Condition"

  // Getters
  def getVehicleID : Int = { vehicleID}
  def getName : String = { vehicleName}
  def getColour : String = { colour}
  def getMakeDate : String = { makeDate}
  def getVehicleType : String = { vehicleType}
  def getCost : Int = { cost}
  def getCurrentState : String = { currentState}

  // Setters
  def setVehicleID(newID: Int) : Any = {vehicleID = newID}
  def setCost(newCost: Int) : Any = {cost = newCost}
  def setName(newName: String) : Any = {vehicleName = newName}
  def setColour(newColour: String) : Any = {colour = newColour}
  def setDate(newDate: String) : Any = {makeDate = newDate}
  def setVehicleType(newType: String) : Any = {vehicleType = newType}
  def setVehicleState(newState: String) : Any = {currentState = newState}

  //Misc
  def printDetails() : String = { val send = vehicleID+" "+vehicleName+" "+vehicleType+" "+cost+" "+colour+ " "+makeDate+" "+currentState
    send
  }

}
