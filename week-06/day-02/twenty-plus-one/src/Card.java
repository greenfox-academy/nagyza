
public class Card {

  private CardColor color;
  private CardSuit suit;
  private CardRank rank;

  public Card() {
    this.suit = CardSuit.getRandomSuite();
    this.rank = CardRank.getRandomRank();
    this.color = this.suit.getValue() < 2 ? CardColor.BLACK : CardColor.RED;
  }

  public Card(CardSuit suit, CardRank rank) {
    this.suit = suit;
    this.rank = rank;
    this.color = this.suit.getValue() < 2 ? CardColor.BLACK : CardColor.RED;
  }

  public int getValueOfCard() {
    return rank.getValue();
  }

  @Override
  public String toString() {
    return this.rank + " " + this.suit + " " + this.color + "\n";
  }
}
