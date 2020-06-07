def patternMatching(variable: Any): String = {
  variable match {
    case _: List[_] => "Variable is of type List"
    case _: Vector[_] => "Variable is of type Vector"
    case _: Seq[_] => "Variable is of type Sequence"
  }
}
patternMatching(Map("first" -> "Mansi", "last" -> "Babbar"))
