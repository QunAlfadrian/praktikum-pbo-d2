/* Nama : Qun Alfadrian S. P.
 * NIM  : 24060122130072
 * Tanggal  : 9 Maret 2024
 */
package tugas_3.exception;

public class BankApp {
    public static void main(String[] args) {
        /* TODO: buatlah main yang akan melakukan operasi transaksi
        dan akan menampilkan pesan bila terjadi kesalahan
        
        skenario bebas berkreasi, tidak harus sama seperti contoh dibawah
        */
    
           BankAccount account = new BankAccount(500.0);
    
        try {
            // skenario saldo mencukupi
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
     
            // skenario saldo tidak mencukupi
            account.withdraw(300.0);
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
