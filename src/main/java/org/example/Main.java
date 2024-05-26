package com.example.todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as done");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    break;
                case 2:
                    System.out.println("Tasks:");
                    for (int i = 0; i < taskManager.getTasks().size(); i++) {
                        System.out.println(i + ". " + taskManager.getTasks().get(i));
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to mark as done: ");
                    int taskNumber = scanner.nextInt();
                    taskManager.markTaskAsDone(taskNumber);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
