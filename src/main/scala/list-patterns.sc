def patternMatching(list: List[Int]): String = {
  list match {
    case Nil => "List has no elements"
    case _ :: Nil => "List has only one element"
    case first :: second :: Nil => s"List has two elements which are $first and $second"
    case _ :: _ :: _ ::  Nil => "List has three elements"
    case _ :: rest => s"List elements except first elements are $rest"
  }
}
patternMatching(List.empty)
patternMatching(List(1))
patternMatching(List(1, 2))
patternMatching(List(1, 2, 3))
patternMatching(List(1, 2, 3, 4, 5))
