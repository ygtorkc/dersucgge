import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz:");
        int n = input.nextInt();
        for (int i = n - 1; i >= 1; i--) {

            for (int d = 1; d <= (n - i); d++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= (2 * i) - 1; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println();
        }







    }
