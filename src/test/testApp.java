package test;

import java.util.Scanner;

public class testApp {
    public static float HitungHargaDiskon(float input1, float input2) {

        float diskon = (input2 / 100) * input1;
        float hargaSetelahDiskon = input1 - diskon;

        System.out.println("Harga Barang Diskon " + hargaSetelahDiskon);
        return hargaSetelahDiskon;
    }

    public static float HitungHargaAwal(float input1, float input2) {
        float hargaAwal = 100 / (100 - input2) * input1;
        float hargaDiskon = hargaAwal - input1;

        System.out.println("Harga Barang Diskon " + hargaAwal);
        return hargaDiskon;
    }

    public static void main(String[] args) {

        Scanner inputAngka;
        int pilihan;
        float harga, persen;
        inputAngka = new Scanner(System.in);
        System.out.println("Menghitung Harga Diskon");
        System.out.println("1. mencari harga sebelum Diskon");
        System.out.println("2. mencari harga sebelum Diskon");
        System.out.println("=================================");

        System.out.print("Masukan pilihan: ");
        pilihan = inputAngka.nextInt();

        System.out.print("Masukkan harga barang: ");
        harga = inputAngka.nextFloat();

        System.out.print("Masukkan persentase diskon: ");
        persen = inputAngka.nextFloat();
        System.out.println("=================================");
        // Menampilkan hasil

        if (pilihan == 1) {
            HitungHargaDiskon(harga, persen);
        } else if (pilihan == 2) {
            HitungHargaAwal(harga, persen);
        } else {
            System.out.println("Operator tidak tersedia");
        }

        inputAngka.close();
    }
}
