import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        mat = input.nextInt();
        fizik = input.nextInt();
        kimya = input.nextInt();
        turkce = input.nextInt();
        tarih = input.nextInt();
        muzik = input.nextInt();

        ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.print("Ort: ");
        System.out.println(ortalama);

        String str = ortalama>=60 ? "geçti" : "kaldı";
        System.out.println(str);

    }
}
