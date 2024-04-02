package Taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int km;
        double ucret;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Gidilecek km giriniz : ");
        km= inp.nextInt();

        ucret = 10 + (km * 2.20);
        if(ucret<20){
            ucret=20;
        }


        System.out.println("Ödenecek Ücret = " + ucret);


    }
}

