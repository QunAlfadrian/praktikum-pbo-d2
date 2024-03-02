/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 2 Maret 2024 */

import tugas_2.*;

public class Main {
    public static void main(String[] args) {
        // Main titik
        System.out.println("===== MAIN TITIK =====");
        Titik t1, t2, t3, t4;
        Garis g1, g2;


        t1 = new Titik();
        t2 = new Titik(2, 2);
        t3 = new Titik(2, 0);
        t4 = new Titik(0, 2);

        System.out.println(t1.getJarakPusat());
        System.out.println(t2.getJarakPusat());

        g1 = new Garis(t1, t2);
        g2 = new Garis(t3, t4);

        System.out.println(g1.isTegakLurus(g2));


        // Main student
        System.out.println("\n===== MAIN STUDENT =====");

        /* Deklarasi */
        Student sabrina, sausan, elsa;
        Lecture rona, sarah, daffa;
        Course daspro, dasis, logif, alpro, alin;

        /* Instansiasi */
        sabrina = new Student("Aniqah Nursabrina", "Jl Gondang Barat IV", 20, false, 20036);
        sausan = new Student("Sausan Berliana", "Jatisari IV", 20       , false, 30092);
        elsa = new Student("Elsa Roshana R Hutagalung", "Gang Arjuna", 19, false, 20024);

        rona = new Lecture("Rona Realita Najma", "Jurang Belimbing", 19, false, 40124);
        sarah = new Lecture("Sarah Teguh Kinanthi Situmeang", "Gang Delima", 19, false, 20032);
        daffa = new Lecture("Daffa Aly Meganendra", "Ngesrep", 19, true, 40140);

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
    }
}
