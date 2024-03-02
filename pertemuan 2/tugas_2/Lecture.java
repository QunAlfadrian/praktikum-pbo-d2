/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 2 Maret 2024 */

/* README */
/* MAIN CLASS DIGABUNG DENGAN MAIN TITIK (Main.java) */

package tugas_2;

import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person{
    private int employeeID;
    private List<Course> courseTaught;

    public Lecture(String lName, String lAddress, int lAge, boolean lGender, int eID) {
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
