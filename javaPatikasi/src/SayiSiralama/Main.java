package SayiSiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int a,b,c;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("1. sayı: ");
        a= inp.nextInt();

        System.out.print("2. sayı: ");
        b= inp.nextInt();

        System.out.print("3. sayı: ");
        c= inp.nextInt();

        if ((a>b) && (a>c)){
            if(b>c){
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b>a) && (b>c)) {
            if(a>c){
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else {
            if(b>a){
                System.out.println("c > b > a");
            } else {
                System.out.println("c > a > b");
            }
        }


    }
}

