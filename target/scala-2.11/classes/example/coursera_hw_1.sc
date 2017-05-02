import example.Lists.max

def max(xs: List[Int]): Int = {

  def loop(tracker: Int, xs: List[Int]):Int = {
    if (xs.isEmpty)  0
    else if (xs.head > max(xs.tail))
      xs.head
    else
      max(xs.tail)
  }
  loop(0, xs)
}

max(List(1,3,2,999,27,30, 90,34, 123,99))

max(List())


//
//def max2(xs: List[Int]): Int = {
//
//  def loop(tracker: Int, xs: List[Int]):Int = {
//    xs match{
//      case _ if xs.isEmpty => throw new NoSuchElementException("NO maximum element for empty list")
//      case _ if xs.head > max2(xs.tail) =>  xs.head
//      case _  =>  max2(xs.tail)
//    }
//  }
//  loop(0, xs)
//}
//
//
//max2(List(1,3,2,999,27,30, 90,34, 123,99))