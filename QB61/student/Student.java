package student;

/*
 * Program to create user defined package and write a Program to calculate marks & percentage of students
 */
public class Student {
    private String Name;
    private double[] marks;
    private double percentage;

    public Student(String Name, double[] marks) {
        this.Name = Name;
        this.marks = marks;
    }

    public void calculatePer() {
        double total_marks = 0.0;
        for (double mark : marks) {
            total_marks += mark;
        }
        percentage = total_marks / marks.length * 100;
    }

    public String getName() {
        return Name;
    }

    public double getPercentage() {
        return percentage;
    }
}