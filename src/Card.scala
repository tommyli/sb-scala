/**
 * Created by IntelliJ IDEA.
 * User: tommyli
 * Date: 8/04/11
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */

object Suit extends Enumeration {
  val Spade, Heart, Club, Diamond = Value
}

object Rank extends Enumeration {
  val Ace, R2, R3, R4, R5, R6, R7, R8, R9, R10, Jack, Queen, King = Value
}

class Card(suit: Suit.Value, rank: Rank.Value) {

  def getSuit(): Suit.Value = {
    suit
  }

  def getRank(): Rank.Value = {
    rank
  }

  override def toString = suit+" "+rank
}
