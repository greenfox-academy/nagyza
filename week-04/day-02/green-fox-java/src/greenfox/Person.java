package greenfox;

/**
 * Created by nagyza on 2017.04.04..
 */
public class Person {

  private String name;
  private int age;
  private String gender;

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public String getGender() {
    return this.gender;
  }
}