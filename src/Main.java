
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        HİPOTENÜS BULMA
        int birinciKenar, ikinciKenar;
        double hipotenus;

        System.out.print("Lutfen Birinci Kenari Giriniz: ");
        birinciKenar = scan.nextInt();
        System.out.print("Lutfen Ikinci Kenari Giriniz: ");
        ikinciKenar = scan.nextInt();

        hipotenus = Math.sqrt((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar));

        System.out.println("Hipotenus = " + hipotenus);

         */

        double birinciKenar, ikinciKenar, ucuncuKenar, cevre, alan, u;

        System.out.print("Lütfen Birinci Kenari Giriniz: ");
        birinciKenar = scan.nextDouble();
        System.out.print("Lütfen İkinci Kenari Giriniz: ");
        ikinciKenar = scan.nextDouble();
        System.out.print("Lütfen Üçüncü Kenarı Giriniz: ");
        ucuncuKenar = scan.nextDouble();

        cevre = birinciKenar + ikinciKenar + ucuncuKenar;
        u = cevre /2;

        alan = Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));

        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);






    }
}