package ObjectOrientedGarage

import scala.collection.mutable.ListBuffer


/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Vehicle(name : String, vType: String, cost_ : Int, colour_ : String, owner_ : Person) {
  private var owner = owner_
  private var vehicleID = ""
  private var vehicleName = name
  private var vehicleType = vType
  private var cost = cost_
  private var colour = colour_
  private var makeDate = "1/1/1990"
  private var currentState = "Broken"
  private var partsList = ListBuffer[Part]()

  // Getters
  def getVehicleID : String = { vehicleID}
  def getOwner : Person = { owner}
  def getName : String = { vehicleName}
  def getColour : String = { colour}
  def getMakeDate : String = { makeDate}
  def getVehicleType : String = { vehicleType}
  def getCost : Int = { cost}
  def getCurrentState : String = { currentState}

  // Setters
  def setVehicleID(newID: String) : Any = {vehicleID = newID; createParts()}
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
  def printParts() {for(x<-0 until partsList.size){ partsList(x).printPartDetails()}}
  def createParts() { var x = 0; while(x < 10){
    var newP = new ObjectOrientedGarage.Part
    partsList += newP;
    x+= 1}
  }
  def totalFixTime(): Int ={
    var totalTime = 0
    for(x<-0 until partsList.size){
      totalTime += partsList(x).getTimeToFix
    }
    totalTime
  }
  def totalCost(): Int ={
    var totalCost = 0
    for(x<-0 until partsList.size){
      totalCost += partsList(x).getCostToFix
    }
    totalCost
  }
  def fixAllParts(): Unit ={
    for(x<-0 until partsList.size){
       partsList(x).fix()
    }
    currentState = "Fixed"
  }

}
