import java.util.ArrayList;
import java.util.Collections;

public class ToDoListManager {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();

        toDoList.add("Buy groceries");
        toDoList.add("Finish report");
        toDoList.add("Call plumber");
        toDoList.add("Book flight");

        toDoList.remove("Call plumber");

        String firstTask = toDoList.get(0);
        System.out.println("First task: " + firstTask);

        boolean isListEmpty = toDoList.isEmpty();
        System.out.println("Is to-do list empty? " + isListEmpty);

        Collections.sort(toDoList);
        System.out.println("Sorted to-do list:");
        for (String task : toDoList) {
            System.out.println("- " + task);
        }
    }
}
