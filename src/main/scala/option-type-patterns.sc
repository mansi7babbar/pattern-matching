def patternMatching(option: Option[String]): String = {
  option match {
    case Some(value) => "Not an empty option"
    case None => "Empty option"
  }
}
patternMatching(Option("Hello"))
patternMatching(Option(null))
