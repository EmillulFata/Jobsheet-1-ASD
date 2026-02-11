import java.util.Scanner;

public class Perulangan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan NIM :");
    long nim = input.nextLong();

    long n = nim % 100;

    // Jika n < 10, tambah 10
    if (n < 10) {
      n += 10;
    }

      // Lewati 10 dan 15
      for (int i = 1; i <= n; i++) {
        if (i == 10 || i == 15) {
          continue;
          }

          // Kelipatan 3 → #
          if (i % 3 == 0) {
            System.out.print("# ");
            }

            // Genap → angka
            else if (i % 2 == 0) {
              System.out.print(i + " ");
            }

            // Ganjil → *
            else {
              System.out.print("* ");
        }
      }
    }
  }

