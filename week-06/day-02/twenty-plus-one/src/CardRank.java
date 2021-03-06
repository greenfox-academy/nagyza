
public enum  CardRank {
  C2(2), C3(3), C4(4), C5(5), C6(6), C7(7), C8(8), C9(9), C10(10), JUMBO(10), DAMA(10), QUEEN(10), ACE(11);

  private int value;
  private static final int SIZE = values().length;

  CardRank(int value) {
    this.value = value;
  }

  public static CardRank getRandomRank() {
    return values()[(int) (Math.random() * SIZE)];
  }

  public int getValue() {
    return value;
  }
}
