package ObjectOrientedGarage

/**
  * Created by Administrator on 06/06/2017.
  */
abstract class Person(name : String, age_ : Int, address_ : String, email_ : String, phoneNumber_ : String) {
  private var fullName = name
  private var age = age_
  private var address = address_
  private var email = email_
  private var phoneNumber = phoneNumber_
  private var wallet = 500

  // Getters
  def getAge : Int = { age}
  def getWallet : Int = {wallet}
  def getName : String = { fullName}
  def getAddress : String = { address}
  def getEmail : String = { email}
  def getPhoneNumber : String = { phoneNumber}

  // Setter s
  def setAge(newAge: Int) : Any = {age = newAge}
  def setWallet(newWallet: Int) : Any = {wallet = newWallet}
  def setName(newName: String) : Any = {fullName = newName}
  def setAddress(newAddress: String) : Any = {fullName = newAddress}
  def setEmail(newEmail: String) : Any = {fullName = newEmail}
  def setPhoneNumber(newPhoneNumber: String) : Any = {fullName = newPhoneNumber}

  //Misc
  def printDetails() : String = { var send = name+" "+age+" "+address+" "+email+" "+phoneNumber
     send
  }

  //Interaction
  def removeFromWallet(amount : Int) : Unit = {wallet -= amount}
  def addToWallet(amount : Int) : Unit = {wallet += amount}


}
