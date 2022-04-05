package u02

object Optionals extends App:

  enum Option[A]:
    case Some(a: A)
    case None() // here parens are needed because of genericity

  object Option:

    def isEmpty[A](opt: Option[A]): Boolean = opt match
      case None() => true
      case _ => false

    def orElse[A, B >: A](opt: Option[A], orElse: B): B = opt match
      case Some(a) => a
      case _ => orElse

    def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = opt match
      case Some(a) => f(a)
      case _ => None()

    def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = opt match
      case Some(a) if(f(a)) => Some(a)
      case _ => None()

    def map[A](opt: Option[A])(f: A => Boolean): Option[Boolean] = opt match
      case Some(a) if(f(a)) => Some(true)
      case Some(a) => Some(false)
      case _ => None()

    def map2[A,B,C](opt: Option[A])(opt2: Option[B])(f: (A,B) => C): Option[C] = opt match
      case Some(a) => opt2 match
        case Some(b) => Some(f(a,b))
        case _ => None()
      case _ => None()

    def sum2(opt: Option[Int])(opt2: Option[Int]): Option[Int] = opt match
      case Some(a) => opt2 match
        case Some(b) => Some(a + b)
        case _ => None()
      case _ => None()


  import Option.*
  val s1: Option[Int] = Some(1)
  val s2: Option[Int] = Some(2)
  val s3: Option[Int] = None()

  println(s1) // Some(1)
  println(orElse(s1, 0))
  println(orElse(s3, 0)) // 1,0
  println(flatMap(s1)(i => Some(i + 1))) // Some(2)
  println(flatMap(s1)(i => flatMap(s2)(j => Some(i + j)))) // Some(3)
  println(flatMap(s1)(i => flatMap(s3)(j => Some(i + j)))) // None
  println(filter(s2)(_ >= 2))
  println(filter(s3)(_ < 2))
  println(map(s2)(_ == 2))
  println(map(s1)(_ > 2))
  println(map(s3)(_ == 0))
  println(map2(s1)(s2)(_ + _))
  println(map2(s2)(s1)(_ - _))
  println(map2(s3)(s1)(_ * _))
  println(map2(s1)(s3)(_ / _))
  println(sum2(Some(3))(Some(4)))
