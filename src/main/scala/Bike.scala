/**
  * Created by Administrator on 06/06/2017.
  */
class Bike (name: String, vType: String, cost: Int, colour: String, bikeType_ : String) extends Vehicle(name,vType, cost, colour){
  private var bikeType = ""
 // private Customer owner = Customer customer

  // Getters
  def getBikeType : String = { bikeType}
  // def getOwnerID() : String = {return seatAmount}

  // Setters
  def setBikeType(newType: String) : Any = {bikeType = newType}
      //  def setSeatAmount(newSeatAmount: String) : Any = {seatAmount = newSeatAmount}

  //Misc
  def printVDetails() : String = { val send = printDetails() + " " +bikeType
    send
  }

}