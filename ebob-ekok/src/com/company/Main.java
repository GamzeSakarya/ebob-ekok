import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = scanner.nextInt();

        // EBOB ve EKOK hesaplama için geçici değişkenler
        int ebob = 0;
        int ekok = 0;
        int sayi1 = n1;
        int sayi2 = n2;

        while (sayi2 != 0) {
            int temp = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = temp;
        }

        ebob = sayi1;
        ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
