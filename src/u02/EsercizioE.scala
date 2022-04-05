package u02

object EsercizioE extends App:

  def compose(f: Int => Int, g: Int => Int): Int => Int =
    (a: Int) => f(g(a))
  def compose2[A,B,C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

  println(compose(_ - 1, _ * 2)(5))
  println(compose2((x: Int) => 4 + x, (y: Int) => y / 3)(6))