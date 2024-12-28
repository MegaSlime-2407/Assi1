package models;
import java.util.ArrayList;

public class Student extends Person {
private int studentID;
ArrayList<Integer> grades = new ArrayList<Integer>();
private static int idGetter=1;

private void setStudentID() {
    studentID = idGetter++;
}

public Student(String name, String surname, int age,boolean gender, double[] grades) {
    super(name,surname,age,gender);
    setGrades();
    setStudentID();
}


public void setGrades(){
    this.grades = new ArrayList<Integer>();
}
public void AddGrade(int grade){
    this.grades.add(grade);
}
public int getStudentID() {
    return studentID;
}
public ArrayList<Integer> getGrades() {
    return grades;
}
public double calculateGPA(){
    double gpa = 0;
    for(int grade : grades){
        gpa += grade;
    }
    return gpa/grades.size();
}
public String ToString(){
    return super.toString()+"\nStudentID: "+studentID+"\nGrades : "+grades;
}
}
