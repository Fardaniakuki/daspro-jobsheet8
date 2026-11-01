import java.util.Scanner;

public class StarNoAbsen10Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        // Modif biar naiknya 2 tiap step dari angka 1, jadi ganjil terus
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}