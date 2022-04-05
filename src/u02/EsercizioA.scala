package u02

object EsercizioA extends App:

  def parity(n: Int): String = n match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  println(parity(3)) //odd
  println(parity(6)) //even

  val s = 5
  val r: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  println(r(s)) //odd
  println(r(2)) //even