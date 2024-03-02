/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 2 Maret 2024 */

/* README */
/* MAIN CLASS DIGABUNG DENGAN MAIN TITIK (Main.java) */

package tugas_2;

import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode, courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;
    private Enrollment enrollment;

    public Course(String cCode, String cName, Lecture lecturer) {
        courseCode = cCode;
        courseName = cName;
        lecture = lecturer;
        studentsEnrolled = new ArrayList<Student>();
        enrollment = new Enrollment();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public boolean isStudentEnrolled(Student student) {
        return studentsEnrolled.contains(student);
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
        enrollment.addStudent(this, student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
        enrollment.removeStudent(this, student);
    }

    public void getDetails() {
        System.out.println("Course Name\t: " + courseName);
        System.out.println("Course Code\t: " + courseCode);
        System.out.println("Lecturer\t: " + lecture.getName());
    }

    public void viewEnrolledStudents() {
        System.out.println("==============================");
        System.out.println("Students enrolled in " + this.getCourseName());
        for (Student student : studentsEnrolled) {
            System.out.println();
            student.getDetails();
        }
    }
}
