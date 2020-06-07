def patternMatching(variable: Any): String = {
  variable match {
    /*
    Wildcard pattern is used because we does not care about the value
    of variable, it just check whether or not it is a Integer.
    */
    case _: Int => "Variable is of Integer type"
    /*
    Wildcard pattern is used as catch-all alternative, it is matched
    if no other pattern is matched.
    */
    case _ => "Variable is of some other type"
  }
}
patternMatching(10)
patternMatching("Ten")
