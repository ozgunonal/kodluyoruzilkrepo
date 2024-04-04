package CinZodyagiHesabi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int yil,value;
        String burc="";
        boolean isError=false;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Doğum Yılınızı Giriniz : ");
        yil= inp.nextInt();

        if(yil>0){
            value = yil % 12;
            switch (value) {
                case 0:
                    burc= "Maymun";
                    break;
                case 1:
                    burc= "Horoz";
                    break;
                case 2:
                    burc= "Köpek";
                    break;
                case 3:
                    burc= "Domuz";
                    break;
                case 4:
                    burc= "Fare";
                    break;
                case 5:
                    burc= "Öküz";
                    break;
                case 6:
                    burc= "Kaplan";
                    break;
                case 7:
                    burc= "Tavşan";
                    break;
                case 8:
                    burc= "Ejderha";
                    break;
                case 9:
                    burc= "Yılan";
                    break;
                case 10:
                    burc= "At";
                    break;
                case 11:
                    burc= "Koyun";
                    break;
                default:
                    isError=true;
                    break;

            }
        } else {
            isError=true;
        }





        if(isError){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Çin Zodyağı Burcunuz : " +burc);
        }








    }
}

