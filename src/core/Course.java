package core;

public class Course{
    private String subject;
    private Materials materials;

    public Course(String subject, Materials materials) {
        this.subject = subject;
        this.materials = materials;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", materials=" + materials +
                '}';
    }
}
