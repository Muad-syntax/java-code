import java.util.ArrayList;
import java.util.Scanner;

// Kelas Mahasiswa
class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getIpk() {
        return ipk;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", IPK: " + ipk;
    }
}

public class DataMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private Scanner scanner;

    public DataMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void tambahMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
        scanner.nextLine(); // Konsumsi newline

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, ipk);
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public void tampilkanMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                System.out.println(mahasiswa);
            }
        }
    }

    public void jalankan() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    tampilkanMahasiswa();
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void main(String[] args) {
        DataMahasiswa pengelola = new DataMahasiswa();
        pengelola.jalankan();
    }
}
