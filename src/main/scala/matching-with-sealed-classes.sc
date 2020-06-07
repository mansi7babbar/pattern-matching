sealed abstract class CardSuit
case class Spike() extends CardSuit
case class Club() extends CardSuit
case class Heart() extends CardSuit
case class Diamond() extends CardSuit
def sealedClass(cardsuit: CardSuit): String = {
  cardsuit match {
    case Spike() => "Card is Spike"
    case Club() => "Card is Club"
    case Heart() => "Card is Heart"
    case Diamond() => "Card is Diamond"
  }
}
sealedClass(Spike())
sealedClass(Club())
sealedClass(Heart())
sealedClass(Diamond())
