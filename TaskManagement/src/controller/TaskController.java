/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.TaskInputer;
import bo.TaskManager;
import entity.Task;
import utils.Validation;

/**
 *
 * @author duytr
 */
public class TaskController {

    private TaskInputer taskInputer;
    private TaskManager taskManager;

    public TaskController() {
        taskManager = new TaskManager();
    }

    public void addTask() throws Exception {
        taskInputer = new TaskInputer();
        taskInputer.inputTask();
        Task t = taskInputer.getStudent();
        taskManager.addTask(t);
    }

//    public void addTask() throws Exception {
//        inputTask();
//    }

    public void deleteTask() throws Exception {
        int id = Validation.getInt("Enter ID: ", "Please enter integer number!", 1, Integer.MAX_VALUE);
        taskManager.deleteTask(id);
    }

    public void displayTaskList() {
        System.out.print(Task.DISPLAY_HEADER);
        for (Task t : taskManager.getTask()) {
            System.out.print(t);
        }
    }
}
