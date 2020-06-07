def patternMatching(variable: Any): String = {
  variable match {
    case _: Seq[_] => "Variable is of type Sequence"
    case _: List[_] => "Variable is of type List"
    case _: Vector[_] => "Variable is of type Vector"
  }
}
patternMatching(List(1, 2, 3))
