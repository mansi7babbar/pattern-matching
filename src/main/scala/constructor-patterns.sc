abstract class Expression
case class Neg(expr: Int) extends Expression
case class Add(left: Int, right: Int) extends Expression
case class Mult(left: Int, right: Int) extends Expression
case class Div(left: Int, right: Int) extends Expression
def patternMatching(caseClass: Any): Int = {
  caseClass match {
    case Neg(expr) => 0 - expr
    case Add(left, right) => left + right
    case Mult(left, right) => left * right
    case _ => 0
  }
}
patternMatching(Add(10, 5))
patternMatching(Mult(6, 2))
patternMatching(Neg(4))
patternMatching(Div(9, 3))
