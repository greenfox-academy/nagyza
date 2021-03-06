import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (c > a && c > b) {
      return c;
    } else {
      return b;
    }
  }

  int median(List<Integer> pool) {
    Collections.sort(pool);
    return pool.get((pool.size()-1)/2);
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'E', 'I', 'O', 'U').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = teve.substring(0, i) + c + "v" + c + teve.substring(i + 1);
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}
