/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 16 Maret 2024 */

package tugas_4.org.course;

import java.util.List;
import java.util.ArrayList;

import tugas_4.org.enrollment.Enrollment;
import tugas_4.org.person.Lecturer;
import tugas_4.org.person.Student;

public class Course {
    private String courseCode, courseName;
    private Lecturer lecturer;
    private List<Student> studentsEnrolled;
    private Enrollment enrollment;

    public Course(String cCode, String cName, Lecturer lecturer) {
        this.courseCode = cCode;
        this.courseName = cName;
        this.lecturer = lecturer;
        this.studentsEnrolled = new ArrayList<Student>();
        this.enrollment = new Enrollment();
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
        System.out.println("Lecturer\t: " + lecturer.getName());
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