import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,i,j;
        System.out.println("Lutfen sınır degerini giriniz :");
        sayi =inp.nextInt();
        for(i = 0;i<sayi;i*=1)
        {
            System.out.println(i);
        }

    }
}