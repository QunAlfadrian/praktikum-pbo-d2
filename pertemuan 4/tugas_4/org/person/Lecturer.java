/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 16 Maret 2024 */

package tugas_4.org.person;

import java.util.List;
import java.util.ArrayList;

import tugas_4.org.course.Course;

public class Lecturer extends Person{
    private int employeeID;
    private List<Course> courseTaught;

    public Lecturer(String lName, String lAddress, int lAge, boolean lGender, int eID) {
        super(lName, lAddress, lAge, lGender);
        employeeID = eID;
        courseTaught = new ArrayList<Course>();
    }

    public void getDetails() {
        System.out.println("Name\t\t: " + super.getName());
        System.out.printf("Age\t\t: %d\n", super.getAge());
        System.out.println("Address\t\t: " + super.getAddress());
        System.out.printf("Employee Id\t: %d\n", employeeID);
    }

    public void teachCourse(Course course) {
        courseTaught.add(course);
    }

    public void viewTaugthCourses() {
        System.out.println("==============================");
        System.out.println(super.getName() + " Taught Courses: ");
        for (Course course : courseTaught) {
            System.out.println();
            course.getDetails();
        }
    }
}
