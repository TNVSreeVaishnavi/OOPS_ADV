package mypack;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentList = new ArrayList<>();

        // Add student names
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");
        System.out.println("Initial list: " + studentList);

        // Insert a student at a specific index
        studentList.add(1, "David"); // Inserts David at index 1
        System.out.println("After inserting David at index 1: " + studentList);

        // Remove a student by name
        studentList.remove("Charlie");
        System.out.println("After removing Charlie: " + studentList);

        // Check if a student is in the list
        boolean hasBob = studentList.contains("Bob");
        System.out.println("Is Bob in the list? " + hasBob);

        // Get the number of students
        int totalStudents = studentList.size();
        System.out.println("Total number of students: " + totalStudents);

        // Display all student names
        System.out.println("Final student list:");
        for (String student : studentList) {
            System.out.println("- " + student);
        }
    }
}