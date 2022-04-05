package u02

import scala.annotation.tailrec

object EsercizioF extends App:


  def fibonacci(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)

  def fibonacci2(n: Int): Int =
    @tailrec
    def _fib(n: Int, acc: Int): Int = n match
      case 0 => acc
      case _ => _fib(n - 1, (n / 2) + acc)
    _fib(n, 0)

  println(fibonacci(6))
  println(fibonacci2(6))