/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 16 Maret 2024 */

package tugas_4.org;

import tugas_4.org.course.Course;
import tugas_4.org.person.Lecturer;
import tugas_4.org.person.Student;

public class Main {
    public static void main(String[] args) {
        // Main student
        System.out.println("\n===== MAIN STUDENT =====");

        /* Deklarasi */
        Student sabrina, sausan, elsa;
        Lecturer rona, sarah, daffa;
        Course daspro, dasis, logif, alpro, alin;

        /* Instansiasi */
        sabrina = new Student("Aniqah Nursabrina", "Jl Gondang Barat IV", 20, false, 20036);
        sausan = new Student("Sausan Berliana", "Jatisari IV", 20       , false, 30092);
        elsa = new Student("Elsa Roshana R Hutagalung", "Gang Arjuna", 19, false, 20024);

        rona = new Lecturer("Rona Realita Najma", "Jurang Belimbing", 19, false, 40124);
        sarah = new Lecturer("Sarah Teguh Kinanthi Situmeang", "Gang Delima", 19, false, 20032);
        daffa = new Lecturer("Daffa Aly Meganendra", "Ngesrep", 19, true, 40140);

        daspro = new Course("daspro", "Dasar Pemrograman", rona);
        dasis = new Course("dasis", "Dasar Sistem", sarah);
        logif = new Course("logif", "Logika Informatika", daffa);
        alpro = new Course("alpro", "Algoritma dan Pemrograman", rona);
        alin = new Course("alin", "Aljabar Linear", daffa);
        /* Menambahkan student ke course */
        System.out.println("\n===== Menambahkan Student ke Course menggunakan method object Course =====");
        daspro.addStudent(sabrina);
        dasis.addStudent(sabrina);
        sabrina.viewEnrolledCourses();
        daspro.viewEnrolledStudents();
        
        System.out.println("\n===== Menghapus Student dari Course menggunakan method object Course =====");
        daspro.removeStudent(sabrina);
        sabrina.viewEnrolledCourses();
        daspro.viewEnrolledStudents();

        System.out.println("\n===== Menambahkan Student ke course menggunakan method object Student =====");
        sausan.enrollInCourse(alpro);
        sausan.enrollInCourse(alin);
        elsa.enrollInCourse(alpro);
        elsa.enrollInCourse(alin);
        sausan.viewEnrolledCourses();
        alpro.viewEnrolledStudents();

        System.out.println("\n===== Menghapus Student dari course menggunakan method object Student =====");
        sausan.removeFromCourse(alin);
        sausan.viewEnrolledCourses();
        alin.viewEnrolledStudents();

        System.out.println("\n===== Menambahkan Course yang diajar ke Lecturer =====");
        daffa.teachCourse(logif);
        daffa.teachCourse(alin);
        daffa.viewTaugthCourses();

        sarah.teachCourse(dasis);
        sarah.viewTaugthCourses();

        System.out.println("\n===== Melihat daftar course dengan lecturer tertentu =====");
        sabrina.viewEnrolledCourses(sarah);
    }
}
