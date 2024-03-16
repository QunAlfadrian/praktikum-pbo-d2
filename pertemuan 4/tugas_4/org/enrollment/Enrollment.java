/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 16 Maret 2024 */

package tugas_4.org.enrollment;

import tugas_4.org.course.Course;
import tugas_4.org.person.Student;

public class Enrollment {
    public Enrollment() {

    }

    public void addStudent(Course course, Student student) {
        if (!student.isCourseEnrolled(course)) {
            student.enrollInCourse(course);
        }
    }

    public void removeStudent(Course course, Student student) {
        if (student.isCourseEnrolled(course)) {
            student.removeFromCourse(course);
        }
    }

    public void enrollInCourse(Course course, Student student) {
        if (!course.isStudentEnrolled(student)) {
            course.addStudent(student);
        }
    }

    public void removeFromCourse(Course course, Student student) {
        if (course.isStudentEnrolled(student)) {
            course.removeStudent(student);
        }
    }
}
