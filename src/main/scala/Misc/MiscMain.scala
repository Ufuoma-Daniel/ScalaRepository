package Misc
import scala.collection.mutable.ListBuffer
/**
  * Created by Administrator on 13/06/2017.
  */
object MiscMain {
  var bus1 = new BusDrivers(List(3,1,2,3))
      var bus2 = new BusDrivers(List(3,2,3,1))
      var bus3 = new BusDrivers(List(4,2,3,4,5))

      def startBusDay(busList : List[BusDrivers]): Unit ={
        var allLocations = ListBuffer[Int]()
        var currentPositions = ListBuffer[Int]()

        for(x<-0 until  busList.size) {
          busList(x).locations = allLocations.toSet
          currentPositions += busList(x).busRoute(busList(x).index)
          for(y<-0 until  busList(x).busRoute.size ){
            allLocations += busList(x).busRoute(y)}}

        def checkAndMove(): Unit = {

        }



        println("ALL LOCATIONS: "+allLocations.toSet)
        println("CURRENT POSITIONS: "+currentPositions)



      }

     startBusDay(List(bus1,bus2,bus3))




  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }
  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c >= r) 1
    else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    val check = ListBuffer[Char](); val check2 = ListBuffer[Char]()
    balance2(chars, check, check2)
  }
  def balance2(chars: List[Char], check: ListBuffer[Char], check2: ListBuffer[Char]): Boolean = {
    var valid = true
    chars.head match {
      case '(' => check += '('
      case ')' if check.isEmpty => valid = false;
      case ')' if check.nonEmpty => check.remove(0)
      case _ =>
    }
    if (chars.tail.isEmpty || !valid) {
      if (check.isEmpty && valid) { true
      } else {  false   }
    } else {
      balance2(chars.tail, check, check2)
    }
  }

  // balance(List(')', '(', ')'))
  // balance(List(')', '(', 'S', 'D', ')', 'F', '(', ')'))

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    //println("Min Coin"+coins.min)
    // println("Money"+money)
    // println("Modulo"+money%coins.min)

    //    if(money % coins.min == 0){
    //      countChange2(money, coins, 0, 0)
    //    }else {  0 }
    0
  }

  //  def countChange2(money: Int, coins: List[Int], tally: Int, total: Int): Int = {
  //    var returnTally = 0
  //    if(coins.isEmpty){}else {
  //      for (x<-0 until coins.size) {
  //        val newNum = total + coins(x)
  //        if (newNum == money) {returnTally = tally + 1}
  //        else if(newNum < money) {
  //          returnTally += countChange2(money, coins, tally, newNum)
  //        }}}
  //    returnTally
  //  }
  //  countChange(10,List(3,1,2,5))
  //  countChange(301,List(5,10,20,50,100,200,500))


}
