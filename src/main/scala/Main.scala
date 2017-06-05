/**
  * Created by Administrator on 05/06/2017.
  */
object Main {
  def main(args: Array[String]) = {
    def testFunction(a: Int, b: Int) : Unit = {
      var a = 5
      var b = 10
      var c = a + b

      println(s"The sum of $a and $b is equal to \n$c")
    }
    //Var Can be changed, Val can't be changed
    var a = 5
    val b = 10
    val c = "Defining the type"
    println("Hello World, Daniel is here!")
    testFunction(5,3)
    //Creating lists
    List(1,2,3) == "Hello"
    for(i<-1 until 10 by 2; j<-1 to 1){  }

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
      }
      println(newString)
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
      var newList = List(a, b, c)
      var d = a+b ; var e = a*b;
      newList match {
        case List(0, b, c) => println(b)
        case List(a, 0, c) => println(a)
        case List(a, b, true) => println(s"The sum of $a and $b is equal to $d")
        case List(a, b, false) => println(s"The product of $a and $b is equal to $e")
      }
    }

    def swapInputs(args: Any) : Any = args match {
      case Array(x,y,_) => val message: Array[Any] = Array(y,x)
      case List(x,y,_) => val message = List(y,x)
      case Tuple2(x,y) => val message = {Tuple2(y, x)}
        println(message)
    }

    TaskInference("Hi I am a String")
    TaskInference(5)
    Tasks()
    cutString("Testing",4)
    multiPrintRecursive("Hi",4)
    SumWithPatternMatching(3,5,true)
    swapInputs(Array(5,1))
  }


}
