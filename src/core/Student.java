package core;

public class Student  extends Human{
    private int studentID;

    public Student() {
        System.out.println("You didn't set student");
    }
    public Student(String fname, String lname,int studentID) {
        super(lname,fname);
        this.studentID=studentID;
    }


    public String getFname() {
        return super.getFname();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='"+ super.getFname()+ '\'' +
                "lastName='"+super.getLname()+ '\'' +
                "studentID='" + studentID +'\''+
                '}';
    }
}
