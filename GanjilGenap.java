import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int bilangan;

        System.out.println("--- Program Cek Ganjil Genap ---");
        System.out.print("Masukan sebuah bilangan bualt: ");
        bilangan = inputUser.nextInt();

        if (bilangan % 2 == 0){
            System.out.println("Bilangan " + bilangan + " adalah **GENAP**.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah **GANJIL**.");
        }
        inputUser.close();
    }
}
