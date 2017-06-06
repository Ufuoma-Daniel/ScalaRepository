/**
  * Created by Administrator on 06/06/2017.
  */
class Customer (name : String, age_ : Int, address_ : String, email_ : String, phoneNumber_ : String, accountNumber_ : String) extends Person (name,age_,address_,email_,phoneNumber_) {

  private var accountNumber = ""
  private var wallet = 500

  // Getters
  def getWallet : Int = {wallet}

  // Setters
  def setWallet(newWallet: Int) : Any = {wallet = newWallet}

  //Interaction
  def removeFromWallet(amount : Int) : Unit = {wallet -= amount}
  def addToWallet(amount : Int) : Unit = {wallet += amount}

  //Misc
  def printCDetails() : String = { val send = printDetails() + " " +accountNumber+ " " +wallet
    send
  }
}
