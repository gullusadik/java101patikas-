import java.util.Scanner;

public class Kdvhesaplama {
    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz :");
        tutar = input.nextDouble();

        double kdvtutari = tutar<1000 ? tutar * 0.18 : tutar * 0.08;
        double kdvlitutar = kdvtutari + tutar;
        System.out.println("Kdv'siz tutar : " + tutar);
        System.out.println("Kdv tutarı : " + kdvtutari);
        System.out.println("Kdv'li tutar : " + kdvlitutar);


    }
}
