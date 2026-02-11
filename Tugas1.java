import java.util.Scanner;

public class Tugas1 {

  public static void main(String[] args) {

    // Array kode plat
    char[] KODE = {
        'A', 'B', 'C', 'D', 'E',
        'F', 'G', 'H', 'I', 'J'
    };

    // Array 2D kota (huruf per huruf)
    char[][] KOTA = {
        { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' ' },
        { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' ' },
        { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' ' },
        { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' ' },
        { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
        { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' ' },
        { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' ' },
        { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' ' },
        { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' ' },
        { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
    };

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Kode Plat: ");
    char kodeInput = input.next().toUpperCase().charAt(0);

    boolean ditemukan = false;

    for (int i = 0; i < KODE.length; i++) {

      if (kodeInput == KODE[i]) {

        System.out.print("Nama Kota: ");

        for (int j = 0; j < KOTA[i].length; j++) {
          System.out.print(KOTA[i][j]);
        }

        System.out.println();
        ditemukan = true;
        break;
      }
    }

    if (!ditemukan) {
      System.out.println("Kode plat tidak ditemukan!");
    }
  }
}
