package it.develhope.VariablesMethodsConstuctor02;

public class Student {
    public String name;
    public int grade;

    public Student(String studentName){
        System.out.println("A Student object has been created!\n");
        this.name=studentName;
    }
    public void getStudentDetails(){
        System.out.println("Student name:" + name + " " + "student grade:" + grade);
    }
}
