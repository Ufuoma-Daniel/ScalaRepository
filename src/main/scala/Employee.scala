/**
  * Created by Administrator on 06/06/2017.
  */
class Employee (name : String, age_ : Int, address_ : String, email_ : String, phoneNumber_ : String, jobRole_ : String) extends Person (name,age_,address_,email_,phoneNumber_) {
  private var jobRole = jobRole_
  private var businessName = ""

  // Getters
  def getRole : String = { jobRole}
  def getBusinessName : String = { businessName}

  // Setters
  def setRole(newRole: String) : Any = {jobRole = newRole}
  def setBusinessName(newBusName: String) : Any = {businessName = newBusName}

  //Interaction
  def chargeCustomer(customer: Customer, amount: Int) : Unit = { customer.removeFromWallet(amount)}
  def refundCustomer(customer: Customer, amount: Int) : Unit = { customer.addToWallet(amount)}

  //Misc
  def printEDetails() : String = { val send = printDetails() + " " +jobRole
    send
  }

}
