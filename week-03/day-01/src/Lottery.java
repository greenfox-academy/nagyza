import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by nagyza on 2017.04.02..
 */
public class Lottery {
  final static public String READ_PATH = "otos.csv";

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers otos.csv
    findTopNumbers();
  }

  public static void findTopNumbers() {
    List<Integer> topInstances = new ArrayList<>(findTopInstances().size());
    List<String> topNumbers = new ArrayList<>();
    HashMap<String, Integer> numsInstance = new HashMap<String, Integer>(countInstances());
    topInstances.addAll(findTopInstances());
    for (Map.Entry<String, Integer> entry : numsInstance.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      for (int i = 0; i < topInstances.size(); i++) {
        if (value.equals(topInstances.get(i))) {
          topNumbers.add(key);
        }
      }
    }
    System.out.println("The most frequent numbers from 1957: ");
    for (String i : topNumbers) {
      System.out.print(i + " ");
    }
  }

  public static List<Integer> findTopInstances() {
    List<Integer> allInstances = new ArrayList<>();
    List<Integer> topInstances = new ArrayList<>();
    allInstances.addAll(countInstances().values());
    allInstances.sort(null);
    for (int i = allInstances.size() - 1; i > allInstances.size() - 6; i--) {
      topInstances.add(allInstances.get(i));
    }
    for (int i = 5; i > 1; i--) {
      if (topInstances.get(i - 1).equals(topInstances.get(i - 2))) {
        topInstances.remove(i - 1);
      }
    }
    return topInstances;
  }
  
  public static HashMap<String, Integer> countInstances() {
    HashMap<String, Integer> numsInstance = new HashMap<String, Integer>();
    for (int i = 0; i < 90; i++) {
      numsInstance.put(String.valueOf(i + 1), 0);
    }
    for (String number : storeAllNumbers()) {
      numsInstance.put(number, numsInstance.get(number) + 1);
    }
    return numsInstance;
  }

  public static List<String> storeAllNumbers() {
    List<String> allNumbers = new ArrayList<>();
    List<String> lines = readFileLines();
    for (String line : lines) {
      String[] raffledInWeek = Arrays.copyOfRange(line.split(";"), 11, 16);
      for (String number : raffledInWeek) {
        allNumbers.add(number);
      }
    }
    return allNumbers;
  }

  public static List<String> readFileLines() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get(READ_PATH);
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with reading the " + READ_PATH + "file!");
    }
    return lines;
  }
}