import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00,topla;
        System.out.print("Armut Kaç Kilo: ");
        double armut_g = input.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        double elma_g = input.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        double domates_g = input.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        double muz_g = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        double patlican_g = input.nextDouble();
        topla = (armut_g * armut) + (elma_g * elma) + (domates_g * domates) + (muz_g * muz) + (patlican_g * patlican);
        System.out.print("Toplam: " + topla);




    }
}