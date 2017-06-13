package Misc

/**
  * Created by Administrator on 09/06/2017.
  */
class BusDrivers(route: List[Int]) {

   var busRoute = route
   var locations = Set[Int]()
   var gossip:Map[BusDrivers, Boolean] = Map()
   var index = 0

  // A map with keys and values.
 // val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

  def incIndex() { index = (index+1)%route.size}


}
