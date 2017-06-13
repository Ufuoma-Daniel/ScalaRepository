package ObjectOrientedGarage

import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 06/06/2017.
  */
class Garage (a: String) {
  private var garageID = a
  private var openOrClosed = true
  private var vehicleList = ListBuffer[ListBuffer[Vehicle]]()
  private var bikeList = ListBuffer[Vehicle]()
  private var carList = ListBuffer[Vehicle]()
  private var employeeList = ListBuffer[Employee]()
  private var vList = 0;
  var bIdTally = 1;
  var cIdTally = 1


  // Getters
  def getGarageID: String = {
    garageID
  }

  def getGarageState: Boolean = {
    openOrClosed
  }

  // Setters
  def setGarageID(newID: String): Any = {
    garageID = newID
  }

  def setGarageState(newState: Boolean): Any = {
    openOrClosed = newState
  }

  //ObjectOrientedGarage.Vehicle Interactions
  def addVehiclesTolist(newVList: ListBuffer[Vehicle]) {
    vehicleList += newVList
  }

  def addCarToVehicleList(newVehicle: Car): Unit = {
    newVehicle.setVehicleID("C" + cIdTally);
    cIdTally += 1;
    carList += newVehicle
  }

  def addBikeToVehicleList(newVehicle: Bike): Unit = {
    newVehicle.setVehicleID("B" + bIdTally);
    bIdTally += 1;
    bikeList += newVehicle
  }

  def turnVBufferToList() {
    vehicleList.toList
  }

  def removeFromVehicleListByID(removeID: String): Unit = {
    var ID = removeID.substring(1).toInt
    removeID.charAt(0) match {
      case 'B' => var list = bikeList.remove(ID)
      case 'C' => var list = carList.remove(ID)
    }
  }

  def printVehicleList() {
    for (x <- 0 until carList.size) {
      println(carList(x).printDetails())
    }
    for (x <- 0 until bikeList.size) {
      println(bikeList(x).printDetails())
    }
  }

  def calculateTotalFixTime() {
    var totalTime = 0;
    for (x <- 0 until carList.size) {
      totalTime += carList(x).totalFixTime()
    }
    for (x <- 0 until bikeList.size) {
      totalTime += bikeList(x).totalFixTime()
    }
    println("Time to fix all Vehicles: " + totalTime + "seconds")
  }

  def calculateTotalCost() {
    var totalTime = 0;
    for (x <- 0 until carList.size) {
      totalTime += carList(x).totalCost()
    }
    for (x <- 0 until bikeList.size) {
      totalTime += bikeList(x).totalCost()
    }
    println("Cost to fix all Vehicles: £" + totalTime)
  }

  //ObjectOrientedGarage.Employee Interactions
  def addToEmployeeList(newEmployee: Employee): Unit = {
    employeeList += newEmployee
  }

  def turnEBufferToList() {
    employeeList.toList
  }

  def removeFromEmployeeListByID(removeID: Int): Unit = {
    employeeList -= employeeList(removeID)
  }

  def printEmployeeList() {
    for (loop2 <- 0 until employeeList.size) {
      println(employeeList(loop2).printEDetails())
    }
  }

  def getAvailableEmployee: Employee = {
    var employee = employeeList(0)
    for (loop <- 0 until employeeList.size) {
      if (employeeList(loop).getAvailability) {
        employee = employeeList(loop)
      }
    }
    employee
  }



  //Run the day
  def runDay(): Unit = {
    calculateTotalCost()
    calculateTotalFixTime()
    var todaysList = carList.toList ::: bikeList.toList

    for (y<-0 until todaysList.size){
      if (todaysList(y).getCurrentState.equals("Broken")) {
        var e = getAvailableEmployee
        e.fixVehicle(todaysList(y))
      }
    }
  }
}



