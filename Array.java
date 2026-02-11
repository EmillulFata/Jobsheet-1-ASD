import java.util.Scanner;

public class Array {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Jumlah Mata Kuliah: ");
    int n = input.nextInt();

    String[] matkul = new String[n];
    int[] sks = new int[n];
    String[] nilaiHuruf = new String[n];

    double[] nilaiAngka = new double[n];
    double[] bobot = new double[n];

    double totalNilai = 0;
    int totalSKS = 0;

    input.nextLine();

    System.out.println("\nProgram Menghitung IP Semester");
    System.out.println("==============================");

    // Input data
    for (int i = 0; i < n; i++) {

      System.out.println("\nData ke-" + (i + 1));

      System.out.print("Nama Mata Kuliah : ");
      matkul[i] = input.nextLine();

      System.out.print("SKS             : ");
      sks[i] = input.nextInt();

      System.out.print("Nilai (Angka / Huruf ) : ");
      String inputNilai = input.next();

      // Cek apakah input huruf
      if (inputNilai.equals("A") ||
          inputNilai.equals("B+") ||
          inputNilai.equals("B") ||
          inputNilai.equals("C+") ||
          inputNilai.equals("C") ||
          inputNilai.equals("D") ||
          inputNilai.equals("E")) {

        // Simpan huruf
        nilaiHuruf[i] = inputNilai;

        // Ubah huruf ke angka
        if (nilaiHuruf[i].equals("A"))
          nilaiAngka[i] = 85;
        else if (nilaiHuruf[i].equals("B+"))
          nilaiAngka[i] = 80;
        else if (nilaiHuruf[i].equals("B"))
          nilaiAngka[i] = 75;
        else if (nilaiHuruf[i].equals("C+"))
          nilaiAngka[i] = 70;
        else if (nilaiHuruf[i].equals("C"))
          nilaiAngka[i] = 60;
        else if (nilaiHuruf[i].equals("D"))
          nilaiAngka[i] = 50;
        else
          nilaiAngka[i] = 0;

      }
      // Jika input angka
      else {

        nilaiAngka[i] = Double.valueOf(inputNilai);

        // Ubah angka ke huruf
        if (nilaiAngka[i] >= 85)
          nilaiHuruf[i] = "A";
        else if (nilaiAngka[i] >= 80)
          nilaiHuruf[i] = "B+";
        else if (nilaiAngka[i] >= 75)
          nilaiHuruf[i] = "B";
        else if (nilaiAngka[i] >= 70)
          nilaiHuruf[i] = "C+";
        else if (nilaiAngka[i] >= 60)
          nilaiHuruf[i] = "C";
        else if (nilaiAngka[i] >= 50)
          nilaiHuruf[i] = "D";
        else
          nilaiHuruf[i] = "E";
      }

      // Huruf ke bobot
      if (nilaiHuruf[i].equals("A"))
        bobot[i] = 4.0;
      else if (nilaiHuruf[i].equals("B+"))
        bobot[i] = 3.5;
      else if (nilaiHuruf[i].equals("B"))
        bobot[i] = 3.0;
      else if (nilaiHuruf[i].equals("C+"))
        bobot[i] = 2.5;
      else if (nilaiHuruf[i].equals("C"))
        bobot[i] = 2.0;
      else if (nilaiHuruf[i].equals("D"))
        bobot[i] = 1.0;
      else
        bobot[i] = 0.0;

      totalNilai += bobot[i] * sks[i];
      totalSKS += sks[i];

      input.nextLine();
    }

    // Output
    System.out.println("\n==============================");
    System.out.println("Hasil Perhitungan Nilai");
    System.out.println("==============================");

    System.out.printf("%-25s %-10s %-10s %-10s\n",
        "Mata Kuliah", "Angka", "Huruf", "Bobot");

    System.out.println("-----------------------------------------------------");

    for (int i = 0; i < n; i++) {

      System.out.printf("%-25s %-10.2f %-10s %-10.2f\n",
          matkul[i],
          nilaiAngka[i],
          nilaiHuruf[i],
          bobot[i]);
    }

    double ip = totalNilai / totalSKS;

    System.out.println("-----------------------------------------------------");
    System.out.printf("IP Semester : %.2f\n", ip);

    input.close();
  }
}