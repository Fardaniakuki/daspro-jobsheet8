import java.util.Scanner;

public class Tugas3NoAbsen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Toko: ");
        int jumlahToko = sc.nextInt();

        int totalSeluruhBarang = 0;
        int maxBarang = -1;
        int tokoTerlaris = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan Jumlah Pelanggan DI Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();

            int barangPerToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Jumlah Barang yang dibeli pelanggan " + j +": ");
                int barang = sc.nextInt();
                barangPerToko += barang;
            }
            System.err.println("Toko " + i +"- Pelanggan: "+ jumlahPelanggan + ", total barang: "+ barangPerToko);
            totalSeluruhBarang += barangPerToko;

            if (barangPerToko > maxBarang) {
                maxBarang = barangPerToko;
                tokoTerlaris = i;
            }
        }
        System.out.println("Total Barang seluruh toko: "+ totalSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak: "+ tokoTerlaris);
        sc.close();
    }
}