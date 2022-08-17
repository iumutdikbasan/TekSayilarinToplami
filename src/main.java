import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int i, n, ortalama, sayac = 0, total = 0;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Bir sayi giriniz: ");
            n = scan.nextInt();

            if(n%4==0){
                total += n;
            }

        }
        while (n % 2 == 0);

        System.out.println(total);
    }
}