package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    StudentDAO studentDAO = new StudentDAO();
    Student student1 = new Student("John","john@gmail.com");
    Student student2 = new Student("Ville Schulz","ville@gmail.com");

    studentDAO.createStudent(student1);
    student1.addTimeSpent(new TimeSpent(1,3,4));
    studentDAO.updateStudet(student1);

    student2.addTimeSpent(new TimeSpent(13,32,4));
    studentDAO.createStudent(student2);

    Student foundStudent = studentDAO.findStudent(1L);
    System.out.println(foundStudent);




    }
}