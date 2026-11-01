import java.util.Scanner;

public class Tugas1NoAbsen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int n = sc.nextInt();

        int angka= 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                angka++;
            }
            System.out.println();
        }
        System.out.println("Total Angka Tercetak : "+ angka);
        sc.close();
    }
}