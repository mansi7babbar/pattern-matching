object Person {
  /*
  This method takes the arguments and constructs an object.
   */
  def apply(fullName: String) = fullName

  /*
  This method extracts the object and return back the attributes.
   */
  def unapply(fullName: String): Option[String] = {
    if (!fullName.isEmpty)
      Some(fullName.replaceAll("(?<=\\w)(\\w+)", "."))
    else
      None
  }
}
def extractors(person: Any): String = {
  person match {
    case Person(initials) => s"My initials are $initials"
    case _ => "Could not extract initials"
  }
}
extractors("Mansi Babbar")
extractors(10)
