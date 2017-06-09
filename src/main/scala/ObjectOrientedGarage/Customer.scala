package ObjectOrientedGarage

/**
  * Created by Administrator on 06/06/2017.
  */
class Customer (name : String, age_ : Int, address_ : String, email_ : String, phoneNumber_ : String, accountNumber_ : String) extends Person (name,age_,address_,email_,phoneNumber_) {

  private var accountNumber = ""


  // Getters


  // Setters




  //Misc
  def printCDetails() : String = { val send = printDetails() + " " +accountNumber+ " "
    send
  }
}
