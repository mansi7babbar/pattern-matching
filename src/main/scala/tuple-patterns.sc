def patternMatching(tuple: Any): String = {
  tuple match {
    case (first, second) => s"Tuple with two elements. Values: $first & $second"
    case (_, _, _) => "Tuple with three elements"
    case _ =>  s"Unrecognized pattern. Value: $tuple"
  }
}
patternMatching((1, "Two"))
patternMatching((1, "Two", 3.0))
patternMatching(List(1, 2, 3))
