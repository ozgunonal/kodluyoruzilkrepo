package UcakBiletFiyatiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int km,yas,yolculukTipi;
        String burc="";
        boolean isError= false;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Mesafeyi km türünden giriniz : ");
        km= inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas= inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi= inp.nextInt();

        if(km>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)){
            double normalTutar = km * 0.10;
            double indirimOranı = 0;
            if(yas<12){
                indirimOranı=0.5;
            } else if (yas<24){
                indirimOranı=0.1;
            } else if (yas>65){
                indirimOranı=0.3;
            }
            if(indirimOranı>0){
                normalTutar =  normalTutar - normalTutar*indirimOranı;
            }
            if(yolculukTipi==2){
                normalTutar =  2* (normalTutar - normalTutar*0.2);
            }
            System.out.println("Toplam Tutar = " + normalTutar + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }











    }
}

