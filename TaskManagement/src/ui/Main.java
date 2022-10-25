package ui;

import controller.TaskController;
import utils.Validation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author duytr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        TaskController tc = new TaskController();
        String menu = "-------------------------\n"
                + "TASK MANAGEMENT PROGRAM\n"
                + "1. Add Task\n"
                + "2. Delete Task\n"
                + "3. Display Task\n"
                + "4. Exit\n"
                + "(Please choose 1 to Add, 2 to Delete, 3 to Display, 4 to Exit program)\n"
                + "Enter choice: ";
        while (true) {
            int choice = Validation.getInt(menu, "Please enter Integer Number!", 1, 4);
            switch (choice) {
                case 1:
                    try {
                        tc.addTask();
                        System.out.println("Add Task success!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;

                case 2:
                    try {
                        tc.deleteTask();
                        System.out.println("Delete Task success!");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    tc.displayTaskList();
                    break;
                case 4:
                    return;
            }

        }
    }

}
