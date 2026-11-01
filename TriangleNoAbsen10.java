import java.util.Scanner;

public class TriangleNoAbsen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int nilai = sc.nextInt();
        int i = 0;
        while (i <= nilai) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
            while (i <= nilai) {
                int h = 0;
                while (h < i) {
                    System.out.print("*");
                    h++;
                }
                i++;
            }
            
            sc.close();
        }
    }
}
