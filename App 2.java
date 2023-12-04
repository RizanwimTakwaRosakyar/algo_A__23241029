import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        // Deklarasi variabel dan tipe data
        String nama;
        int nim;
        String prodi;
        double tinggi_badan; 
        
        // Membuat scanner baru
        Scanner input = new Scanner(System.in); 
        System.out.println("Form Data Mahasiswa UNDIKMA");
        System.out.println("===========================");

        // Membuat form
        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Masukkan Prodi: ");
        prodi = input.nextLine();

        System.out.print("Masukkan NIM: ");
        nim = input.nextInt();

        System.out.print("Tinggi Badan: ");
        tinggi_badan = input.nextDouble();

        // Cetak output ke layar monitor
        System.out.println("Data Mahasiswa UNDIKMA");
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("NIM: " + nim);
        System.out.println("Tinggi Badan: " + tinggi_badan);

     
        input.close();
    }
}
