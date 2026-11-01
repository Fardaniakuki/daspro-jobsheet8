import java.util.Scanner;

public class TriangleNoAbsenModif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        // Segitiga Normal yang udah di-fix
        int i = 1; 
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); //Pindah barisnya
            i++;
        }
        
        // Segitiga Terbalik
        i = n; // Mulai dari n ke bawah
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--; 
        }
        sc.close();
    }
}