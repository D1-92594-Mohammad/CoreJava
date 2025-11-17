package com.sunbeam;

public class Student {
    private int rollno;
    private String name;
    private double marks;

    public Student(int rollno, String name, double marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno(){
        return rollno;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }

    @Override
    public String toString(){
        return "Student{rollno=" + rollno + ", name=" + name + ", marks=" + marks + "}";
    }
}
