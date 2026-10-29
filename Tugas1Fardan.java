import java.util.Scanner;

public class Tugas1Fardan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai batas baris = ");
        int nilai = sc.nextInt();

        if (nilai < 1) {
            System.out.println("Nilai batas baris minimal 1.");
        } else {
            int totalAngka = 0;
            
            for (int nomorBaris = 1; nomorBaris <= nilai; nomorBaris++) {
                
                for (int angkaYangDicetak = 1; angkaYangDicetak <= nomorBaris; angkaYangDicetak++) {
                    System.out.print(angkaYangDicetak + " ");
                    totalAngka++;
                }
                System.out.println(); 
            }
            System.out.println("Total angka tercetak: " + totalAngka);
        }
        sc.close();
    }
}