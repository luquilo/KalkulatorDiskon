package test;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while (choice != 0) {
            System.out.println("\n========== Program Mencari Diskon ==========");
            System.out.println("1. Cari Diskon");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateDiscount(scanner);
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

    private static void calculateDiscount(Scanner scanner) {
        boolean repeat = true;

        while (repeat) {
            System.out.print("Masukkan harga awal barang: ");
            double hargaAwal = scanner.nextDouble();

            System.out.print("Masukkan persentase diskon: ");
            double persentaseDiskon = scanner.nextDouble();

            double diskon = (persentaseDiskon / 100) * hargaAwal;
            double hargaSetelahDiskon = hargaAwal - diskon;

            System.out.println("Harga Awal Barang: Rp " + hargaAwal);
            System.out.println("Jumlah Diskon: Rp " + diskon);
            System.out.println("Harga Setelah Diskon: Rp " + hargaSetelahDiskon);

            System.out.print("Apakah Anda ingin mencari diskon lagi? (Ya/Tidak): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Ya")) {
                repeat = true;
            } else if (input.equalsIgnoreCase("Tidak")) {
                repeat = false;
            } else {
                System.out.println("Input tidak valid. Mengakhiri program.");
                repeat = false;
            }
        }
    }
}
