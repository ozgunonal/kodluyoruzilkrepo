package Hipotenus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int a,b,c;
        double cevre,alan;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("İlk Kenarı Giriniz : ");
        a= inp.nextInt();

        System.out.print("İkinci Kenarı Giriniz : ");
        b= inp.nextInt();

        System.out.print("Üçüncü Kenarı Giriniz : ");
        c= inp.nextInt();

        cevre = (a+b+c)/2;
        alan = Math.sqrt(cevre* (cevre-a) * (cevre-b)* (cevre-c));

        System.out.println("Üçgenin Çevresi = " + cevre);
        System.out.println("Üçgenin Alanı = " + alan);


    }
}

