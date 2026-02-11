import java.util.Scanner;

public class Pemilihan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==============================");

    System.out.print("Nilai Tugas: ");
    double tugas = input.nextDouble();

    System.out.print("Nilai Kuis : ");
    double kuis = input.nextDouble();

    System.out.print("Nilai UTS  : ");
    double uts = input.nextDouble();

    System.out.print("Nilai UAS  : ");
    double uas = input.nextDouble();

    if (tugas < 0 || tugas > 100 ||
        kuis < 0 || kuis > 100 ||
        uts < 0 || uts > 100 ||
        uas < 0 || uas > 100) {

      System.out.println("Nilai tidak valid");
      return;
    }
    double nilaiAkhir = (0.2 * tugas) +
        (0.2 * kuis) +
        (0.3 * uts) +
        (0.3 * uas);

    String huruf;

    if (nilaiAkhir >= 85)
      huruf = "A";
    else if (nilaiAkhir >= 80)
      huruf = "B+";
    else if (nilaiAkhir >= 75)
      huruf = "B";
    else if (nilaiAkhir >= 70)
      huruf = "C+";
    else if (nilaiAkhir >= 60)
      huruf = "C";
    else if (nilaiAkhir >= 50)
      huruf = "D";
    else
      huruf = "E";

    String status = (huruf.equals("D") || huruf.equals("E"))
        ? "TIDAK LULUS"
        : "LULUS";

    System.out.println("==============================");
    System.out.println("Nilai Akhir : " + nilaiAkhir);
    System.out.println("Nilai Huruf : " + huruf);
    System.out.println("Status      : " + status);
    System.out.println("==============================");
    
    if (status.equals("LULUS")) {
      System.out.println("Selamat, Anda Lulus ");
    } else {
      System.out.println("Maaf, Anda Dinyatakan Tidak Lulus ");
    }
  }
}