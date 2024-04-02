package VucutKutleIndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        double boy,kilo,indeks;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy= inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo= inp.nextDouble();

        indeks = kilo / (boy * boy);



        System.out.println("Vücut Kitle İndeksiniz : " + indeks);


    }
}

