package models;
import java.util.ArrayList;
public class School {
    private ArrayList<Person> personal;
    public School(ArrayList<Person> personal) {
        setPersonal(personal);
    }
    public void addMember(Person person) {
        personal.add(person);
    }
    public void setPersonal(ArrayList<Person> personal) {
        this.personal = personal;
    }
    public ArrayList<Person> getPersonal() {
        return personal;
    }

    public String toString() {
        String res = "";
        for (Person person : personal) {
            res =res + person.toString() + "\n";
        }
        return res;
    }
}
