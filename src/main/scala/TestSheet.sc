java.util.TimeZone.getAvailableIDs.map(item => item.split("/").last).filter(_.length > 4).grouped(10).map(item => item(2)).toList
java.util.TimeZone.getAvailableIDs.map(item => item.split("/").last).filter(_.length > 4).grouped(10).next()


def x (array: Array[String]): Unit = {
   print(array)
}

x(Array[String]("Hi"))


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
  for(position <- b to a.length -1){
    var character = a.charAt(position)
    newString= newString.concat(character.toString)
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
    if(x%3 == 0) {print(a);}else
    if(x%5 == 0) {print(b);}
    else{ print(x)}
  }
}

def squarePrintRecursive (a: String, b: Int) : Unit = {
  squarePrintRecursive2(a,b,b,b)
}

def squarePrintRecursive2 (a: String, b: Int, c: Int, d: Int) : Unit = {
  if((b == 1) && (c == 0)){}
  else if(c == 0){println(""); squarePrintRecursive2(a,b-1,d,d)}
  else{
    print(a);squarePrintRecursive2(a,b,c-1,d)
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




TaskInference("Hi I am a String")
TaskInference(5)
Tasks()
cutString("Testing",4)
mergeCharAndString("Ha","llo",'a' ,'e')
Sum(0,0,false)
multiPrint("Hi",3)
squarePrint("H",4)
fizzBuzz("Fizz","Buzz", 15)
multiPrintRecursive("Hi",3)
squarePrintRecursive("H",4)
fizzBuzzRecursive("Fizz","Buzz",15)
SumWithPatternMatching(2,5,false)