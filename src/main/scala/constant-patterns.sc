def patternMatching(constant: Any): String = {
  constant match {
    case 0 => "I'm equal to zero"
    case 4.5d => "I'm a double"
    case "hello" => "I'm a string"
    case false => "I'm the contrary of true"
    case Nil => "I'm an empty list"
    case _ => s"I'm unknown and equal to $constant"
  }
}
patternMatching(0)
patternMatching(4.5d)
patternMatching("hello")
patternMatching(false)
patternMatching(Nil)
patternMatching(Option(1))
