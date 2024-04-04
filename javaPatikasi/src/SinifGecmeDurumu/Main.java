package SinifGecmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int mat,fizik,turkce,kimya,muzik,dersSayisi=5;
        double avarage= 0.0;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz: ");
        mat= inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik= inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce= inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya= inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik= inp.nextInt();

        if(mat<0 || mat>100){
            mat=0;
            dersSayisi--;
        }
        if(fizik<0 || fizik>100){
            fizik=0;
            dersSayisi--;
        }
        if(turkce<0 || turkce>100){
            turkce=0;
            dersSayisi--;
        }
        if(kimya<0 || kimya>100){
            kimya=0;
            dersSayisi--;
        }
        if(muzik<0 || muzik>100){
            muzik=0;
            dersSayisi--;
        }
        if(dersSayisi!=0){
            avarage = (mat + fizik + turkce + kimya + muzik) / dersSayisi;
        }
        if(avarage <=55){
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere!");

        } else {
            System.out.println("Tebrikler, sınıf geçtiniz !");
        }

        System.out.println("Ortalamanız :" + avarage);




    }
}

