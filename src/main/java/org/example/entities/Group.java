package org.example.entities;

import java.util.ArrayList;
public class Group {
    String name;
    ArrayList<Student> students;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    @Override
    public String toString(){
        return "Group{" + "name ' " + name + "' " + ", students" + students + "}";
    }
}
