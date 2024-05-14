package Uni;

public class Student {



    private static int studentID;
    private String studentName;
    private int age;
    private String subjectOfStudy;

//    public Student(int studentID, String studentName, int age, String subjectOfStudy) {
//        this.studentID = studentID;
//        this.studentName = studentName;
//        this.age = age;
//        this.subjectOfStudy = subjectOfStudy;
//    }

    public Student(){

    }



    @Override
    public String toString() {
        return this.studentID + " " + this.studentName + " " + this.age + " " + this.subjectOfStudy;
    }

    public String getSubjectOfStudy() {
        return subjectOfStudy;
    }

    public void setSubjectOfStudy(String subjectOfStudy) {
        this.subjectOfStudy = subjectOfStudy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


}
