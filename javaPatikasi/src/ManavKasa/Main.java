package ManavKasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int armut,elma,domates,muz,patlican;
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00,toplamTutar;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Armut Kaç Kilo ? : ");
        armut= inp.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        elma= inp.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        domates= inp.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        muz= inp.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican= inp.nextInt();

        toplamTutar = (armut*armutFiyat) + (elma*elmaFiyat) + (domates*domatesFiyat) + (muz*muzFiyat) + (patlican*patlicanFiyat);



        System.out.println("Toplam Tutar : " + toplamTutar + " TL");


    }
}

