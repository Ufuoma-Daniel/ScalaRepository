import scala.collection.JavaConverters
import java.util.TimeZone
/**
  * Created by Administrator on 05/06/2017.
  */
object Main {
  def main(args: Array[String]) = {
    def testFunction(a: Int, b: Int) : Unit = {
      var a = 5
      var b = 10
      var c = a + b
      println(s"The sum of $a and $b is equal to $c")
    }
    def Tasks() : Unit = {
      println("Hello World")
      var c = "Hello world"
      return c
    }
    def TaskInference(a: Any)  = {
      println(a)
    }
    def cutString(a: String, b: Int) = {
      var newString = ""
      for(position <- a.length() to b){
        var character = a.charAt(position)
        newString= newString.concat(character.toString)
        //println(str takeRight(x))
      }
      println(newString)
    }
    def mergeCharAndString(a: String, b: String, c: Char, d: Char) = {
      var merge = a.concat(b)
      for(position <- 0 to merge.length -1){
        var check = merge.charAt(position)
        if(check == c) {
          merge = merge.replace(check,d)
        }
      }
      println(merge)
    }
    def Sum(a: Int, b: Int, c: Boolean) : Unit = {
      if(a == 0){ println(b)} else if (b == 0) {println(a)}
      else if(c == true){
        var c = a + b
        println(s"The sum of $a and $b is equal to \n$c")
      }else{
        var c = a * b
        println(s"The product of $a and $b is equal to \n$c")
      }

    }
    def squarePrint (a: String, b: Int) : Unit = {
      for(x <- 0 until b; y<- 1 to b){
        print(a)
        if(y == b){
          println("")
        }

      }

    }
    def multiPrint (a: String, b: Int) : Unit = {
      for(x <- 0 until b){
        println(a)
      }

    }
    def fizzBuzz(a: String, b: String, c: Int) : Unit = {
      for(x<-1 until c){
        if((x%3 == 0) && (x%5 == 0)){print(a.concat(b))}else
        if(x%3 == 0) { print(a);}else
        if(x%5 == 0) {print(b);}
        else{ print(x)}
      }
    }
    def squarePrintRecursive (a: String, b: Int) : Unit = {
        squarePrintRecursive2(a,b,b)
    }
    def squarePrintRecursive2 (a: String, b: Int, c: Int) : Unit = {
      if(c == 0 && b != 0){ squarePrintRecursive2(a,b-1,b)   }else{
        squarePrintRecursive2(a,b,c-1)

      }

    }
    def multiPrintRecursive(a: String, b: Int) : Unit = {

      if(b != 0){
        println(a)
        multiPrintRecursive(a,b-1)
      }
    }
    def fizzBuzzRecursive(a: String, b: String, c: Int) : Unit = {
      fizzBuzzRecursive2(a,b,c,1)
    }
    def fizzBuzzRecursive2(a: String, b: String, c: Int, d: Int) : Unit = {
      if(d< c){
        if((d%3 == 0) && (d%5 == 0)){print(a.concat(b))}else
        if(d%3 == 0) {print(a);}else
        if(d%5 == 0) {print(b);}
        else{ print(d)}

        fizzBuzzRecursive2(a,b,c,d+1)
      }
    }
    def SumWithPatternMatching(a: Int, b: Int, c: Boolean) : Unit = {
      var newList = List(a, b, c); var d = a+b ; var e = a*b;
      newList match {
        case List(0, b, c) => println(b)
        case List(a, 0, c) => println(a)
        case List(a, b, true) => println(s"The sum of $a and $b is equal to $d")
        case List(a, b, false) => println(s"The product of $a and $b is equal to $e")
      }
    }
    def PatternMatching2(args: Any) : Any = args match {
      case arr: Array[Int] if arr.length > 2 =>  println(s"Swapped Elements ${arr(1)} and ${arr(0)}")
      case Array(x,y) => {
        val ara = Array(x,y)
        println(s"Swapped Elements ${ara(1)} and ${ara(0)}")
      }
      case List(x,y) => println(List(y,x))
      case Tuple2(x,y) => println(Tuple2(y,x))
      case _ => println("Misc")

    }
    def blackJack(a: Int, b: Int) : Unit = {
      if((a > b) && (a <= 21 && a > 0)) {  println("Player A has won with a score of "+a)}
      if((a < b) && (b <= 21 && b > 0)) {  println("Player B has won with a score of "+b)}
      if((a == b) && (a == 21)) {  println("Both players got 21")}
      if((a > 21) && (b > 21)) {  println("Both players busted")}
    }
    def uniqueSum(a: Int, b: Int, c: Int) : Unit = {
      val set = Set(a,b,c); var list = List(a,b,c) ;list = set.toList; var total = 0;
      if(list.size > 1){ total = 1 } else{  total = 0 }
      for(x<-0 until list.size){ total*= list(x)}
      println(total)
    }
    def tooHot(temperature: Int, isSummer: Boolean) : Unit = {
      var upperLimit = 90; var answer = true
      if(isSummer == true){ upperLimit = 100}
      if(temperature >= 60 && temperature <= upperLimit){ answer= true } else { answer= false}
      println(answer)
    }

    //STILL NEEDS TO BE FINISHED
    def functional() : Unit = {
      val  a: Array[String] = TimeZone.getAvailableIDs.filter(_.length>3)
      for(x<-0 until a.length){print(a(x)+",")}
    }

    //Ongoing



//    testFunction(5,3)
//    TaskInference("Hi I am a String")
//    TaskInference(5)
//    Tasks()
//    cutString("Testing",4)
//    multiPrintRecursive("Hi",4)
//    SumWithPatternMatching(3,5,true)
//    swapInputs(Array(5,1,7))
//    blackJack(22,22)
//    uniqueSum(1,1,2)
//    functional()
//    weather(100,true)
    println()
  }


}
