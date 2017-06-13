package ObjectOrientedGarage

/**
  * Created by Administrator on 06/06/2017.
  */
class Employee (name : String, age_ : Int, address_ : String, email_ : String, phoneNumber_ : String, jobRole_ : String) extends Person (name,age_,address_,email_,phoneNumber_) {
  private var jobRole = jobRole_
  private var businessName = ""
  private var available = true

  // Getters
  def getRole : String = { jobRole}
  def getBusinessName : String = { businessName}
  def getAvailability : Boolean = { available}

  // Setters
  def setRole(newRole: String) : Any = {jobRole = newRole}
  def setBusinessName(newBusName: String) : Any = {businessName = newBusName}
  def setAvailability(newRole: Boolean) : Any = {available = newRole}

  //Interaction
  def chargeCustomer(customer: Person, amount: Int) : Unit = { customer.removeFromWallet(amount)}
  def refundCustomer(customer: Person, amount: Int) : Unit = { customer.addToWallet(amount)}

  //Misc
  def printEDetails() : String = { val send = printDetails() + " " +jobRole
    send
  }
  def fixVehicle(vehicle: Vehicle): Unit = {
    setAvailability(false)
    Thread.sleep(vehicle.totalFixTime())
    println("Vehicle "+vehicle.getVehicleID+ " is fixed, Customer "+vehicle.getOwner.getName+ " was charged £"+vehicle.totalCost()+ " by employee "+name)
    chargeCustomer(vehicle.getOwner, vehicle.totalCost())
    vehicle.fixAllParts()
    setAvailability(true)
  }
}
