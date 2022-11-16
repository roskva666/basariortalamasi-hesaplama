import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat,fizik,tarih,kimya,biyoloji;

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();


        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();


        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();


        System.out.println("Biyoloji Notunuzu Giriniz: ");
        biyoloji = input.nextInt();

        int toplam = (mat + fizik + tarih + kimya + biyoloji);
        double sonuc = toplam / 5;

        System.out.println("NOT ORTALAMANIZ: " + sonuc);



        System.out.println(sonuc >= 60 ? "Sınıfı geçtiniz tebrikler!" : "Sınıfı geçemediniz. Daha çok çalışın.");

    }
}
