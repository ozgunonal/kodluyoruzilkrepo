package CiftSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int k,i=0;
        double toplam = 0;


            // Scanner sınıfımızı tanımladık
            Scanner inp = new Scanner(System.in);

            //Kullanıcıdan değerleri al
            System.out.print("Sayı Giriniz : ");
            k= inp.nextInt();

         while (i<=k) {
             if(i%3== 0 || i%4 == 0){
                 toplam += i;
             }
             i ++;
        }
        System.out.println("Toplam: " +toplam);







    }
}

