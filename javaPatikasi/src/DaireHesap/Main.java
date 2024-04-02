package DaireHesap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int r,a;
        double pi= 3.14,alan;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("r Giriniz : ");
        r= inp.nextInt();

        System.out.print("a Giriniz : ");
        a= inp.nextInt();


        alan = (pi*r*r*a)/360;

        System.out.println("Daire Dilimi Alanı = " + alan);


    }
}

