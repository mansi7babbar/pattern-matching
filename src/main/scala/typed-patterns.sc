def patternMatching(anyTypeVariable: Any): Any = {
  anyTypeVariable match {
    case stringVariable: String => stringVariable.length
    case mapVariable: Map[_, _] => mapVariable.size
    case arrayVariable: Array[_] => arrayVariable.length
    case listVariable: List[_] => listVariable.size
    case _ => "Undefined type"
  }
}
patternMatching("Mansi Babbar")
patternMatching(Map(1 -> "One", 2 -> "Two", 3 -> "Three"))
patternMatching(Array(3, 6, 9, 15))
patternMatching(List('A', 'B', 'C', 'D', 'E'))
patternMatching((10, "Twenty"))
