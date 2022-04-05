package u02

object EsercizioD extends App:

  def notCurrying(x: Int, y: Int, z: Int): Boolean =
    x<=y && y<=z
  def currying(x: Int)(y: Int)(z: Int): Boolean =
    x<=y && y<=z

  val orderNotCurried: (Int, Int, Int) => Boolean = (x, y, z) => x<=y && y<=z
  val orderCurred: Int => Int => Int => Boolean = x => y => z => x<=y && y<=z

  val n1 = 3
  val n2 = 5
  val n3 = 8

  println(orderNotCurried(n1,n2,n3))
  println(orderCurred(n1)(n2)(n3))
  println(notCurrying(5,9,12))
  println(currying(1)(15)(2))