def patternMatching(candidate: String): String = {
  candidate match {
    case "patternOne" => "Code executed when patternOne matches"
    case "patternTwo" => "Code executed when patternTwo matches"
    case _ => "Code executed when no pattern matches"
  }
}
patternMatching("patternOne")
patternMatching("patternTwo")
patternMatching("default")
