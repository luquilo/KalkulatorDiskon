package Diskon;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while (choice != 0) {
            System.out.println("\n========== Program Mencari Diskon ==========");
            System.out.println("1. Hitung Harga Sebelum Diskon");
            System.out.println("2. Hitung Harga Setelah Diskon");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    HitungHargaDiskon(scanner);
                    break;
                case 2:
                    HitungHargaAwal(scanner);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    private static void HitungHargaDiskon(Scanner scanner) {
        boolean repeat = true;

        while (repeat) {
            System.out.print("Masukkan harga awal barang: ");
            double hargaAwal = scanner.nextDouble();

            System.out.print("Masukkan persentase diskon: ");
            double persentaseDiskon = scanner.nextDouble();

            double hargadiskon = (persentaseDiskon / 100) * hargaAwal;
            double hargaSetelahDiskon = hargaAwal - hargadiskon;

            System.out.println("\n============================================");
            System.out.println("Jumlah Diskon: Rp " + hargadiskon);
            System.out.println("Harga Setelah Diskon: Rp " + hargaSetelahDiskon);
            System.out.println("\n============================================");
            System.out.print("Apakah Anda ingin mencari diskon lagi? (y/t): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("y")) {
                repeat = true;
            } else if (input.equalsIgnoreCase("t")) {
                repeat = false;
            } else {
                System.out.println("Input tidak valid. Mengakhiri program.");
                repeat = false;
            }
        }
    }

    private static void HitungHargaAwal(Scanner scanner) {
        boolean repeat = true;

        while (repeat) {
            System.out.print("Masukkan harga diskon barang: ");
            double setelahDiskon = scanner.nextDouble();

            System.out.print("Masukkan persentase diskon: ");
            double persentaseDiskon = scanner.nextDouble();

            Double hargaAwal = 100 / (100 - persentaseDiskon) * setelahDiskon;

            System.out.println("\n============================================");
            System.out.println("Harga Awal Barang: Rp " + hargaAwal);
            System.out.println("Jumlah Diskon: " + persentaseDiskon + " %");
            System.out.println("\n============================================");
            System.out.print("Apakah Anda ingin mencari diskon lagi? (y/t): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("y")) {
                repeat = true;
            } else if (input.equalsIgnoreCase("t")) {
                repeat = false;
            } else {
                System.out.println("Input tidak valid. Mengakhiri program.");
                repeat = false;
            }
        }
    }
}
