package TekSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int n;
        int total = 0;


            // Scanner sınıfımızı tanımladık
            Scanner inp = new Scanner(System.in);

            do {
                //Kullanıcıdan değerleri al
                System.out.print("Sayı Giriniz : ");
                n= inp.nextInt();
                if(n %4 == 0){
                    total += n;
                }
            } while (n%2==0);



        System.out.println("Toplam: " +total);







    }
}

