import java.util.Scanner;
public class penjumlahan {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int angka1, angka2, hasil;

        System.out.println("--- Program Penjumlahan ---");
        System.out.print("Masukan angka pertama: ");
        angka1 = inputUser.nextInt();

        System.out.print("Masukan angka kedua: ");
        angka2 = inputUser.nextInt();

        hasil = angka1 + angka2;

        System.out.println("Hasil penjumlahan " + angka1 + "+ " + angka2 + " adalah : " + hasil);

        inputUser.close();
    }    
}
