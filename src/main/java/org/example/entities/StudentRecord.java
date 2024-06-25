package org.example.entities;

import java.util.ArrayList;

public class StudentRecord {
    ArrayList<Task> tasks;
    boolean hasNoWork = false;

    public boolean isHasNoWork() {
        return hasNoWork;
    }

    public void setHasNoWork(boolean hasNoWork) {
        this.hasNoWork = hasNoWork;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
