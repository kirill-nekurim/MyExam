package org.example.entities;

import java.util.ArrayList;

public class StudentRecord {
    ArrayList<Task> tasks;
    boolean noWork = false;

    public boolean isNoWork() {
        return noWork;
    }

    public void setNoWork(boolean noWork) {
        this.noWork = noWork;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
