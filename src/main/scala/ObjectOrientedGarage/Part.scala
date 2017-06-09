package ObjectOrientedGarage
import java.util.Random
/**
  * Created by Administrator on 09/06/2017.
  */
class Part {
  var r = new scala.util.Random

  private var currentState = randomCurrentState()
  private var costToFix = randomCost()
  private var timeToFix = randomTime()

  // Getters
  def getCurrentState : String = { val returnState = currentState;  returnState}
  def getCostToFix : Int = { costToFix}
  def getTimeToFix : Int = { timeToFix}

  // Setters
  def setCurrentState(newState: String) : Any = {currentState = newState}
  def setCostToFix(newCost: Int) : Any = {costToFix = newCost}
  def setTimeToFix(newTime: Int) : Any = {timeToFix = newTime}

  //Random
  def randomCurrentState() : String = {
    val x = r.nextInt(10 - 1 + 1) + 1; var newState = ""
    if(x%2 == 0){  newState = "Fixed"}
    else {  newState = "Broken"; }
    newState}
  def randomCost() : Int = {
    var x = 0
    if(getCurrentState.equals("Broken")) {
       x = r.nextInt(50 - 10 + 1) + 10
    }
    x
  }
  def randomTime() : Int = {
    var x = 0
    if(getCurrentState.equals("Broken")) {
       x = r.nextInt(1000 - 100 + 1) + 10
    }
    x
  }
  def printPartDetails() {println("Current State: "+currentState+ " Cost to Fix: £"+costToFix+ " Time to Fix: "+timeToFix)+"seconds "}
  def fix(){ setCurrentState("Fixed"); costToFix = 0; timeToFix = 0}
}

  //if employee is available
  //how many broken part

  //When was V fixed, by whom, how much?
  //total earnings for the day


