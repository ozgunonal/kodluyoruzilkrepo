package KullanıcıGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        String userName,inputPassword,passsword="java123";

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Kullanıcı Adınız : ");
        userName= inp.nextLine();

        System.out.print("Şifreniz : ");
        inputPassword= inp.nextLine();

        if(userName.equals("patika") && inputPassword.equals(passsword)){
            System.out.println("Giriş Yaptınız !");
        } else if(!(userName.equals("patika")) && !(inputPassword.equals(passsword))) {
            System.out.println("Kullanıcı adı ve şifre yanlış, tekrar deneyiniz!");
        } else if(!userName.equals("patika")) {
            System.out.println("Kullanıcı adı yanlış, tekrar deneyiniz!");
        } else {
            System.out.println("Şifre yanlış, sıfırlamak ister misiniz? ");
            String response = inp.nextLine();
            if(response.toLowerCase().equals("evet")){

                System.out.println("Yeni şifrenizi giriniz: ");
                String newPassword = inp.nextLine();
                if(!newPassword.equals(passsword)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, eski veya hatalı şifrenizi girmeyin!.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }



    }
}

