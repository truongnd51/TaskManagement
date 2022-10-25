/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Task;
import java.util.ArrayList;

/**
 *
 * @author duytr
 */
public class TaskManager {

    private ArrayList<Task> listTask;
    private int lastId = 0;

    public TaskManager() {
        listTask = new ArrayList<>();
    }

    public ArrayList<Task> getTask() {
        return listTask;
    }

    public Task addTask(Task t) {
        t.setId(++lastId);
        listTask.add(t);
        return t;
    }

    public Task deleteTask(int id) throws Exception {
        int i = searchById(id);
        if (i != -1) {
            return listTask.remove(i);
        }
        throw new Exception("Task not found!");

    }

    private int searchById(int id) {
        for (int index = 0; index < listTask.size(); index++) {
            if (listTask.get(index).getId() == id) {
                return index;
            }
        }
        return -1;
    }

}
