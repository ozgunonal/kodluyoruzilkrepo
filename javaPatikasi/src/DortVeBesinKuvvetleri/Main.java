package DortVeBesinKuvvetleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int n;

            // Scanner sınıfımızı tanımladık
            Scanner inp = new Scanner(System.in);


                //Kullanıcıdan değerleri al
                System.out.print("Sınır sayısını giriniz : ");
                n= inp.nextInt();

        System.out.print("4 ün Kuvvetleri: ");
                for (int i=1; i<=n ; i*=4){
                    if(i==1){
                        System.out.print( i );
                    } else {
                        System.out.print(" , " + i );
                    }
                }
        System.out.println(" ");
        System.out.print("5 in Kuvvetleri: ");
        for (int i=1; i<=n ; i*=5){
            if(i==1){
                System.out.print( i );
            } else {
                System.out.print(" , " + i );
            }
        }








    }
}

