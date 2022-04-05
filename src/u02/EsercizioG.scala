package u02

object EsercizioG extends App:

  enum Shape:
    case Rectangle(l1: Double, l2: Double)
    case Circle(r: Double)
    case Square(l: Double)

  def perimeter(shape: Shape): Double = shape match
    case Shape.Rectangle(l1, l2) => (l1 + l2) * 2
    case Shape.Circle(r) => 2 * r * 3.14
    case Shape.Square(l) => l * 4

  def area(shape: Shape): Double = shape match
    case Shape.Rectangle(l1,l2) => l1 * l2
    case Shape.Circle(r) => r * r * 3.14
    case Shape.Square(l) => l * l

  println(perimeter(Shape.Rectangle(3.0, 4.5)))
  println(perimeter(Shape.Circle(2.5)))
  println(perimeter(Shape.Square(6.2)))

  println(area(Shape.Rectangle(2.5,8.8)))
  println(area(Shape.Circle(4.6)))
  println(area(Shape.Square(9.0)))