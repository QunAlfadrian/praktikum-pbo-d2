/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 16 Maret 2024 */

package tugas_4.org.person;

import java.util.List;
import java.util.ArrayList;

import tugas_4.org.course.Course;
import tugas_4.org.enrollment.Enrollment;

public class Student extends Person {
    private int studentID;
    private List<Course> courseEnrolled;
    private Enrollment enrollment;

    public Student(String sName, String sAddress, int sAge, boolean sGender, int sID) {
        super(sName, sAddress, sAge, sGender);
        studentID = sID;
        courseEnrolled = new ArrayList<Course>();
        enrollment = new Enrollment();
    }

    public void enrollInCourse(Course course) {
        courseEnrolled.add(course);
        enrollment.enrollInCourse(course, this);
    }

    public void removeFromCourse(Course course) {
        courseEnrolled.remove(course);
        enrollment.removeFromCourse(course, this);
    }

    public boolean isCourseEnrolled(Course course) {
        return courseEnrolled.contains(course);
    }

    public void getDetails() {
        System.out.println("Name\t\t: " + super.getName());
        System.out.printf("Age\t\t: %d\n", super.getAge());
        System.out.println("Address\t\t: " + super.getAddress());
        System.out.printf("Student Id\t: %d\n", studentID);
    }

    public void viewEnrolledCourses() {
        System.out.println("==============================");
        System.out.println(super.getName() + " Enrolled in: ");
        for (Course course : courseEnrolled) {
            System.out.println();
            course.getDetails();
        }
    }

    public void viewEnrolledCourses(Lecturer lecturer) {
        System.out.println("==============================");
        System.out.println("Courses with " + lecturer.getName() + " as the lecturer");
        for (Course course : courseEnrolled) {
            if (course.getLecturer() == lecturer) {
                System.out.println();
                course.getDetails();
            }
        }
    }
}
