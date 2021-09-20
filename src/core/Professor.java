package core;

public class Professor extends Human {
    private int profID;
    private int experience;
    private String specialization;
    private Course course;


    public Professor(String lname, String fname, int profID, int experience, String specialization, Course course) {
        super(lname, fname);
        this.profID = profID;
        this.experience = experience;
        this.specialization = specialization;
        this.course = course;
    }
    public Professor(){

    }

    public int getProfID() {
        return profID;
    }

    public void setProfID(int profID) {
        this.profID = profID;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "profID=" + profID +
                ", experience=" + experience +
                ", specialization='" + specialization + '\'' +
                ", course=" + course +
                '}';
    }
}
