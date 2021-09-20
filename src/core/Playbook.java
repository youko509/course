package core;
import core.views.Features;

public class Playbook {
    public static void main(String[] args){

        Student aStudent = new Student("Muller","Merkel",56);
        Features.display(aStudent.toString());
    }
}
