public class hitung_gajih {
    public static void main(String[] args){
        
        int upahBulanan = 500000;
        int bonusMingguan = 50000;
        int minggguPerbulan = 4;
        int bulan = 12;
        int totalBonusBulan = bonusMingguan * minggguPerbulan;
        int GajiBulanan = upahBulanan + totalBonusBulan;
        int PenghasilanTahunan = GajiBulanan * bulan;

        System.out.println();
        System.out.println("Total Gaji Bulanan: " + GajiBulanan + " IDR");
        System.out.println("Total Gaji Tahunan: " + PenghasilanTahunan + " IDR");
        System.out.println();

    }
}
