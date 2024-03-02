/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 2 Maret 2024 */

/* README */
/* MAIN CLASS DIGABUNG DENGAN MAIN TITIK (Main.java) */

package tugas_2;

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
