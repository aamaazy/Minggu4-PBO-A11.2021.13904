import java.util.Scanner;
public class Tugas3 {
    
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        char lagi = 'Y';

        while (lagi == 'Y' || lagi == 'y') {
            System.out.print("Detik: ");
            int detik = input.nextInt();

            int hari = detik / 86400;
            detik %= 86400;

            int jam = detik / 3600;
            detik %= 3600;

            int menit = detik / 60;
            detik %= 60;

            System.out.println("Hari  : " + hari);
            System.out.println("Jam   : " + jam);
            System.out.println("Menit : " + menit);
            System.out.println("Detik : " + detik);

            System.out.print("Input data lagi [Y/T]? ");
            lagi = input.next().charAt(0);
        }
        
        input.close();
    }
}
