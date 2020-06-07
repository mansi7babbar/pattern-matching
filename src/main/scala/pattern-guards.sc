def patternGuards(toMatch: Any, maxLength: Int): String = {
  toMatch match {
    case list: List[_] if list.size <= maxLength => "List is of acceptable size"
    case _: List[_] => "List has not an acceptable size"
    case string: String if string.length <= maxLength => "String is of acceptable size"
    case _: String => "String has not an acceptable size"
    case _ => "Input is neither a List nor a String"
  }
}
patternGuards(List(2, 4, 6, 8), 5)
patternGuards(List(3, 6, 9, 15, 18), 5)
patternGuards("Good Morning", 15)
patternGuards("Good Morning World", 15)
patternGuards(100, 10)
