import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args) {

    //Değişken oluştur
    double tutar, oran,kdvFiyat,kdvDahilFiyat;

    // Scanner sınıfımızı tanımladık
    Scanner inp = new Scanner(System.in);

    //Kullanıcıdan değerleri al
        System.out.print("Ücret Tutarı Giriniz : ");
        tutar= inp.nextDouble();

        if (tutar>0 && tutar<1000){
            oran= 0.18;
        } else {
            oran = 0.08;
        }


         kdvFiyat = tutar * oran;
         kdvDahilFiyat = tutar + kdvFiyat;
        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV Oranı = " + oran);
        System.out.println("KDV Tutarı = " + kdvFiyat);
        System.out.println("KDV'li Fiyat = " + kdvDahilFiyat);



    }
}

