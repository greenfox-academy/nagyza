import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nagyza on 2017.03.23..
 * Palindrome searcher as a weekly project in the second week
 * in the Greenfox Academy Junior Software Developer training
 */
public class PalindromeSearcher {
  public static void main(String[] args) {
    ArrayList<String> foundPalindromes = new ArrayList<>();
    String stringToExamine = "abba8*8indulagorogaludni8*8abba";
    for (int i = stringToExamine.length(); i > 2; i--) {
      for (int j = 0; j < i + 1; j++) {
        if (palTrial(stringToExamine.substring(j, i))) {
          if (stringToExamine.substring(j, i).length() > 2) {
            foundPalindromes.add(stringToExamine.substring(j, i));
          }
        } else {
        }
      }
    }
    for (String palind : foundPalindromes) {
      String actualPal = palind;
      int f = 0;
      for (int i = 0; i < foundPalindromes.size(); i++) {
        if (foundPalindromes.contains(actualPal)) {
          f++;
        }
      }
    }
    for (String palind : foundPalindromes) {
      System.out.println(palind);
    }
    System.out.println(foundPalindromes);
  }

  public static void removeDuplicates(ArrayList<String> arraySimplify) {
    for (String palind : arraySimplify) {
      ArrayList<int> foundindex = new ArrayList<int>();
      for (int i = 0; i < arraySimplify.size(); i++) {
        if (palind == arraySimplify.get(i)) {
          foundindex.add(i);
        }
      }
    }
  }

  private static boolean palTrial(String palTry) {
    for (int j = 0; j < (palTry.length()/2); j++) {
      int charNum = j;
      if (palTry.charAt(charNum) != palTry.charAt((palTry.length() - 1) - charNum)) {
        return false;
      }
    }
    return true;
  }
}