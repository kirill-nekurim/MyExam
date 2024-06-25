package org.example.entities;

import java.util.ArrayList;

public class Var {
    ArrayList<Task> tasks;

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Variant{" + "tasks=" + tasks + "}";
    }
}
