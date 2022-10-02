import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,k;
        Scanner usluSayi = new Scanner(System.in);
        System.out.println("Üssü Alınacak Sayi girişi : ");
        n = usluSayi.nextInt();
        System.out.println("Üs Olacak Sayi girişi : ");
        k = usluSayi.nextInt();
        int total = 1;

        for (int i = 1; i <=k ; i++){
        total *= n;

        }
        System.out.println("Cevap : " + total);
    }
}