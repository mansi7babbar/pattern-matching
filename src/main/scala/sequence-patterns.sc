def patternMatching(sequence: Any): String = {
  sequence match {
    case List(singleElement) => s"List with one element. Value: $singleElement"
    case List(_, _*) => s"List with one or more elements. Sequence: $sequence"
    case Vector(1, 2, _*) => s"Vector with two or more elements. Sequence: $sequence"
    case Array(singleElement) => s"Array with one element. Value: $singleElement"
    case _ => s"Unrecognised sequence. Sequence: $sequence"
  }
}
patternMatching(List(1))
patternMatching(List(1, 2, 3))
patternMatching(Vector(1, 2))
patternMatching(Array(10))
patternMatching((2, 4))
