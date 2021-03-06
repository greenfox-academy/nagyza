import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Page {
  private List<Tasks> tasks;

  Page() {
    this.tasks = new ArrayList<>();
  }

  void addTask(Tasks task) {
    this.tasks.add(task);
    this.sortTaskByPriority();
  }

  void addNewTask(String newTask) {
    this.tasks.add(new Tasks(newTask));
    this.sortTaskByPriority();
  }

  void addNewTaskPriority(String newTask, int priority) {
    this.tasks.add(new Tasks(newTask, priority));
    this.sortTaskByPriority();
  }

  private void sortTaskByPriority() {
    Collections.sort(this.tasks, (o1, o2) -> Integer.valueOf(o1.getPriority()).compareTo(o2.getPriority()));
  }

  List<Tasks> getTasksList() {
    return this.tasks;
  }

  void removeTask(int index) {
    this.tasks.remove(index - 1);
  }

  void checkTask(int index) {
    this.tasks.get(index - 1).changeToBeDone();
  }

  void unCheckTask(int index) {
    this.tasks.get(index - 1).changeToBeUndone();
  }

  void changeTask(int index) {
    this.tasks.get(index - 1).changeDone();
  }

  void checkAllTask() {
    for (Tasks task : this.tasks) {
      task.changeToBeDone();
    }
  }

  ArrayList<String> toFile() {
    ArrayList<String> result = new ArrayList<>();
    for (Tasks task : this.tasks) {
      result.add(task.toFile());
    }
    return result;
  }

  @Override
  public String toString() {
    String result = "";
    int i = 0;
    for (Tasks task : this.tasks) {
      result = result.concat((i + 1) + " - " + task.toString() + "\n");
      i++;
    }
    return result;
  }
}