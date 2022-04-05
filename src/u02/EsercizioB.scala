package u02

object EsercizioB extends App:

  val neg: (String => Boolean) => (String => Boolean) =
    f => (s => !f(s))

  def negative(p: String => Boolean): (String => Boolean) =
    (s:String) => (!p(s))

  val empty: String => Boolean = _ == "" // predicate on strings
  val noEmpty = negative(empty)
  println(noEmpty(""))
  println(noEmpty("ciao"))

  val notEmpty = neg(empty) // which type of notEmpty?
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty(""))