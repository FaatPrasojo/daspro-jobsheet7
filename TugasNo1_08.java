import java.util.Scanner;
public class TugasNo1_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga = 50000, totalTiket = 0, i = 0, tiket, hari;
        double totalHarga, jmlHarga, totalTerjual;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();            
            totalTiket += tiket;
            System.out.println("Total tiket yang terjual: " + totalTiket);
            if (tiket > 4 && tiket < 10) {
                jmlHarga = harga * tiket * 0.9;
                System.out.println("Total harga yang diperoleh dari penjualan tiket hari ini: " + jmlHarga);

            } else if (tiket > 10) {
                jmlHarga = harga * tiket * 0.85;
                System.out.println("Total harga yang diperoleh dari penjualan tiket hari ini: " + jmlHarga);

            } else if (tiket < 0) {
                System.out.println("Gagal, silahkan coba lagi");
            } 

        } while(true);
    } 
}    