package org.example.entities;

public class Student {
    int var;
    String fio;
    StudentRecord report;

    public StudentRecord getReport() {
        return report;
    }

    public void setReport(StudentRecord report) {
        this.report = report;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        String rate;
        if (report==null){
            rate = "не оценен";
        }
        else if (report.hasNoWork){
            rate = "нет работы";
        }
        else rate = "оценен";
        return "" + fio + ", " + var + " вариант, " + rate;
    }
}
