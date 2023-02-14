import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        float pi=3.14f;
        double cevre,alan,a;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz :");
        r= inp.nextInt();
        System.out.print("Daire Açısını Giriniz :");
        a= inp.nextInt();

        cevre = 2 * pi * r;
        alan =  (pi * (r*r) * a) / 360;
        System.out.println("Dairenin Alanı :"+alan);
        System.out.print("Dairenin Çevresi :"+cevre);


    }
    }
