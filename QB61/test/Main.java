package test;

import java.util.Scanner;

import student.Student;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No of Students : ");
        int noOfStudents = scan.nextInt();
        System.out.print("Enter no of subjects : ");
        int noOfSubjects = scan.nextInt();
        Student[] students = new Student[noOfStudents];
        for (int studID = 0; studID < students.length; studID++) {
            scan.nextLine();
            System.out.println("Enter for Student " + (studID + 1));
            System.out.print("Enter Name : ");
            String Name = scan.nextLine();
            double[] marks = new double[noOfSubjects];
            for (int subID = 0; subID < marks.length; subID++) {
                System.out.print("Enter marks of subject " + (subID + 1) + " : ");
                marks[subID] = scan.nextInt();
            }
            students[studID] = new Student(Name, marks);
        }
        for (Student stud : students) {
            System.out.println();
            System.out.println("Name : " + stud.getName());
            stud.calculatePer();
            System.out.println("Percentage : " + stud.getPercentage());
        }
    }
}
