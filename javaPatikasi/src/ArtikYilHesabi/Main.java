package ArtikYilHesabi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int yil;
        boolean isArtikYil= false;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Yıl Giriniz : ");
        yil= inp.nextInt();



        if(yil%4==0){
            isArtikYil=true;
            if(yil%100==0 && yil%400==0){
                    isArtikYil=false;
                }
            }




        if(isArtikYil){
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }






    }


}

