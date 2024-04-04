package BurcBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int ay,gun;
        String burc="";
        boolean isError= false;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Doğduğunuz Ay : ");
        ay= inp.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        gun= inp.nextInt();


        if(ay==1){
            if(gun>=1 && gun <=31){
                     if(gun <22){
                    burc = "Oğlak";
                } else {
                    burc = "Kova";}
            } else {
                isError=true;
            }
        }
        else if(ay==2){
            if(gun>=1 && gun <=28){
                     if(gun <20){
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError=true;
            }
        }
        else if(ay==3){
            if(gun>=1 && gun <=31){
                     if(gun <21){
                    burc = "Balık";
                } else {
                    burc = "Koç";}
            } else {
                isError=true;
            }}
            else if(ay==4){
                if(gun>=1 && gun <=30){
                     if(gun <21){
                        burc = "Koç";
                    } else {
                        burc = "Boğa";}
                } else {
                    isError=true;
                }
            }
            else if(ay==5){
                if(gun>=1 && gun <=31){
                     if(gun <22){
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";}
                } else {
                    isError=true;
                }
            }
            else if(ay==6){
                if(gun>=1 && gun <=30){
                     if(gun <23){
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";}
                } else {
                    isError=true;
                }
            }
            else if(ay==7){
                if(gun>=1 && gun <=31){
                     if(gun <23){
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";}
                } else {
                    isError=true;
                }
            }
            else if(ay==8){
                if(gun>=1 && gun <=31){
                     if(gun <23){
                        burc = "Aslan";
                    } else {
                        burc = "Başak";}
                } else {
                    isError=true;
                }
            }
            else if(ay==9){
                if(gun>=1 && gun <=30){
                     if(gun <23){
                        burc = "Başak";
                    } else {
                        burc = "Terazi";}
                } else {
                    isError=true;
                }
            }
            else if(ay==10){
                if(gun>=1 && gun <=31){
                     if(gun <23){
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";}
                } else {
                    isError=true;
                }
            }
            else if(ay==11){
                if(gun>=1 && gun <=30){
                     if(gun <22){
                        burc = "Akrep";
                    } else {
                        burc = "Yay";}
                } else {
                    isError=true;
                }
            }
            else if(ay==12){
                if(gun>=1 && gun <=31){
                     if(gun <22){
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";}
                } else {
                    isError=true;
                }
            }
            else{
                isError=true;
            }

        if(isError){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz : " +burc);
        }








    }
}

