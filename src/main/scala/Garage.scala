import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 06/06/2017.
  */
class Garage (a: String) {
  private var garageID = a
  private var openOrClosed = true
  private var vehicleList = ListBuffer[Vehicle]()
  private var employeeList = ListBuffer[Employee]()
  var idTally = 0


  // Getters
  def getGarageID : String = { garageID}
  def getGarageState : Boolean = { openOrClosed}

  // Setters
  def setGarageID(newID: String) : Any = {garageID = newID}
  def setGarageState(newState: Boolean) : Any = {openOrClosed = newState}

  //Vehicle Interactions
  def addCarToVehicleList(newVehicle: Car) : Unit = {newVehicle.setVehicleID(idTally); idTally+=1;vehicleList += newVehicle}
  def addBikeToVehicleList(newVehicle: Bike) : Unit = {newVehicle.setVehicleID(idTally); idTally+=1;vehicleList += newVehicle}
  def turnVBufferToList() {vehicleList.toList}
  def removeFromVehicleListByID(removeID: Int) : Unit = {vehicleList -= vehicleList(removeID)}

  def removeFromVehicleListByType(removeType: String) : Unit = {
    for(loop<-0 to vehicleList.size){
      println(vehicleList.size)
      if(vehicleList(loop).getVehicleType.equals(removeType)) {vehicleList.remove(loop)}
    }
  }

  def printVehicleList() {for(loop<-0 to vehicleList.size){println(vehicleList(loop).printDetails())}}

  //Employee Interactions
  def addToEmployeeList(newEmployee: Employee) : Unit = {employeeList += newEmployee}
  def turnEBufferToList() {employeeList.toList}
  def removeFromEmployeeListByID(removeID: Int) : Unit = {employeeList -= employeeList(removeID)}
  def printEmployeeList() {for(loop<-0 to employeeList.size){println(employeeList(loop).printEDetails())}}




}
