import greenfox.*;
import java.util.ArrayList;

/**
 * Created by nagyza on 2017.04.04..
 */
public class GreenfoxApp {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME", 3);
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX", 0);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      person.introduce();
      person.getGoal();
    }

    LagopusClass badass = new LagopusClass("BADA55");
    badass.addStudent(student);
    badass.addStudent(john);
    badass.addMentor(mentor);
    badass.addMentor(gandhi);
    badass.info();
  }
}
