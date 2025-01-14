package student;

public class Student{
    public String studentID;
    public String studentName;
    public String studentSurname;
    public String studentPhone;
    public String studentEmail;
    public int studentAge;


    public Student(){
        this.studentID = "0000";
        this.studentName = "John";
        this.studentSurname = "Doe";
        this.studentPhone = "000-000-0000";
        this.studentEmail = "example@mail.com";
        this.studentAge = 0;
    }

    public Student(String studentID, String studentName, String studentSurname, String studentPhone, String studentEmail, int studentAge){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentPhone = studentPhone;
        this.studentEmail = studentEmail;
        this.studentAge = studentAge;
    }


    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public static void main(String[] args) {

        // try to create an object of the Student class here

    }
}
