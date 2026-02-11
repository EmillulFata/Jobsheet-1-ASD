import java.util.Scanner;

public class Tugas2 {

    static Scanner input = new Scanner(System.in);
    static String[][] jadwal;
    static int n;

    // a. Input data jadwal
    static void inputJadwal() {

        for (int i = 0; i < n; i++) {

            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang           : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari Kuliah     : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam Kuliah      : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // b. Tampilkan semua jadwal
    static void tampilSemua() {

        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");

        System.out.printf("%-25s %-20s %-15s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < n; i++) {

            System.out.printf("%-25s %-20s %-15s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    // c. Cari berdasarkan hari
    static void cariHari() {

        System.out.print("\nMasukkan Hari: ");
        String hari = input.nextLine();

        boolean ada = false;

        System.out.println("\nJadwal Hari " + hari + ":");

        for (int i = 0; i < n; i++) {

            if (jadwal[i][2].equalsIgnoreCase(hari)) {

                System.out.printf("%-25s %-20s %-15s %-15s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][2],
                        jadwal[i][3]);

                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal di hari tersebut.");
        }
    }

    // d. Cari berdasarkan mata kuliah
    static void cariMatkul() {

        System.out.print("\nMasukkan Nama Mata Kuliah: ");
        String mk = input.nextLine();

        boolean ada = false;

        for (int i = 0; i < n; i++) {

            if (jadwal[i][0].equalsIgnoreCase(mk)) {

                System.out.println("\nJadwal Ditemukan:");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);

                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan Jumlah Jadwal: ");
        n = input.nextInt();
        input.nextLine(); // bersihkan enter

        jadwal = new String[n][4];

        // Input data
        inputJadwal();

        int pilih;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampil Semua Jadwal");
            System.out.println("2. Cari Berdasarkan Hari");
            System.out.println("3. Cari Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    tampilSemua();
                    break;

                case 2:
                    cariHari();
                    break;

                case 3:
                    cariMatkul();
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 4);
    }
}
