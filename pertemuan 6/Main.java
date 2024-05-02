/* 
 * Nama : Qun Alfadrian S. P
 * NIM  : 24060122130072
 */

import java.util.ArrayList;

public class Main {
    /* Syarat method overloading:
     * memiliki nama method yang sama
     * memiliki parameter formal yang berbeda atau return type yang berbeda
     */

    /* Contoh method overloading */
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void sayHello(ArrayList<String> names) {
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }

    public static void main(String[] args) {

        int output = 'a';

        // double x = 15.5;
        // output = x;

        output = 25;
        double y = output;

        int z = 78;
        char out = (char)z;

        char a = 'a';
        double b = a;

        System.out.println(output);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Mira");
        names.add("Joko");
        names.add("Tatok");
        names.add("Mindi");
        
        sayHello("Qun");
        sayHello(names);
    }
}
