/* Nama     : Qun Alfadrian Setyowahyu Putro */
/* Nim      : 24060122130072 */
/* Tanggal  : 2 Maret 2024 */

/* README */
/* MAIN CLASS DIGABUNG DENGAN MAIN TITIK (Main.java) */

package tugas_2;

public class Person {
    private String name, address, genderString;
    private int age;
    private boolean genderBool;

    public Person(String pName, String pAddress, int pAge, String pGender) {
        name = pName;
        address = pAddress;
        genderString = pGender;
        age = pAge;
    }
    
    public Person(String pName, String pAddress, int pAge, boolean pGender) {
        name = pName;
        address = pAddress;
        age = pAge;
        setGenderBool(pGender);
    }

    public Person() {
        name = null;
        address = null;
        genderString = null;
        age = 0;
    }

    public void setName(String pName) {
        name = pName;
    }

    public void setAge(int pAge) {
        age = pAge;
    }

    public void setAddress(String pAddress) {
        address = pAddress;
    }

    public void setGenderString(String pGender) {
        genderString = pGender;
    }

    public void setGenderBool(boolean pGender) {
        genderBool = pGender;
        if (pGender = true) {
            genderString = "Male";
        } else {
            genderString = "Female";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGenderString() {
        return genderString;
    }

    public boolean geGenderBool() {
        return genderBool;
    }

    public void getDetails() {
        System.out.println("Nama\t: " + name);
        System.out.printf("Umur\t: %d\n", age);
        System.out.println("Alamat\t: " + address);
    }
}
