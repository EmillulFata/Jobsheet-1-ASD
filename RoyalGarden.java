public class RoyalGarden {

    // Fungsi untuk menghitung pendapatan
    public static int hitungPendapatan(int aglonema, int keladi,
            int alocasia, int mawar) {

        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        int totalPendapatan = 
            (aglonema * hargaAglonema) +
            (keladi * hargaKeladi) +
            (alocasia * hargaAlocasia) +
            (mawar * hargaMawar);

        return totalPendapatan;
    }

    // Fungsi untuk menentukan status cabang
    public static String cekStatus(int pendapatan) {

        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        // Data stok bunga setiap cabang
        int[][] stok = {
                { 10, 5, 15, 7 }, // RoyalGarden 1
                { 6, 11, 9, 12 }, // RoyalGarden 2
                { 2, 10, 10, 5 }, // RoyalGarden 3
                { 5, 7, 12, 9 } // RoyalGarden 4
        };

        // Proses setiap cabang
        for (int i = 0; i < stok.length; i++) {

            int pendapatan = hitungPendapatan(
                    stok[i][0], // Aglonema
                    stok[i][1], // Keladi
                    stok[i][2], // Alocasia
                    stok[i][3] // Mawar
            );

            String status = cekStatus(pendapatan);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp" + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("-------------------------");
        }
    }
}