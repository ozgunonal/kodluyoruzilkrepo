package HavaSicakligiEtkinlikOnerme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int heat;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Sıcaklık: ");
        heat= inp.nextInt();



        if(heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat<=25){
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if(heat>=10){
                System.out.println("Pikniğe gidebilirsiniz.");

            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");

        }


    }
}

