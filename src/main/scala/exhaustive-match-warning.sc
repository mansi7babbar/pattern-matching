sealed abstract class BaseClass
case class SubClassOne() extends BaseClass
case class SubClassTwo() extends BaseClass
case class SubClassThree() extends BaseClass
def patternMatching(classObject: BaseClass): String = {
  classObject match {
    case SubClassOne() => "Belongs to first sub class"
    case SubClassTwo() => "Belongs to second sub class"
  }
}
patternMatching(SubClassOne())
