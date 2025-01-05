import models.Student;
import models.Teacher;
import models.School;
import models.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person> personal = new ArrayList<>();
        School school = new School(personal);
        boolean gender;
        File file = new File("src/students.txt");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            String line=scanner.nextLine();
            System.out.println(line);
            String[] split=line.split(" ");
            double[] grades = new double[split.length-4];
            for(int i=4;i<split.length;i++){
                grades[i-4]=Integer.parseInt(split[i]);
            }
            if (split[3].equals("Male")){
                gender=true;
            }
            else if (split[3].equals("Female")){
                gender=false;
            }
            else {
                throw new IllegalArgumentException("Invalid gender value: " + split[3]);
            }
            Student person = new Student(split[0],split[1],Integer.parseInt(split[2]),gender,grades);
            school.addMember(person);
        }
        File file1 = new File("src/teachers.txt");
        Scanner scanner1 = new Scanner(file1);
        while(scanner1.hasNext()){
            String line=scanner1.nextLine();
            String[] split=line.split(" ");
            if (split[3].equals("Male")){
                gender=true;
            }
            else if (split[3].equals("Female")){
                gender=false;
            }
            else {
                throw new IllegalArgumentException("Invalid gender value: " + split[3]);
            }
            Teacher person = new Teacher(split[0],split[1],Integer.parseInt(split[2]),gender,split[4],Integer.parseInt(split[5]),Integer.parseInt(split[6]));
            school.addMember(person);
            System.out.println(line);
}
        scanner1.close();
        System.out.println(school.toString()); // test
    }

}