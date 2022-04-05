package u02

object EsercizioC extends App:

  def neg[A](p: A): A =
    p


  val empty: String => Boolean = _ == "" // predicate on strings
  val notEmpty = neg(empty: String => Boolean) // which type of notEmpty?
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test