import java.util.Scanner;

public class SistemKembalian extends Harga {
    void viewTotal() {
        boolean ulang = true;
        int uangmasuk, kembalian;

        Scanner input = new Scanner(System.in);

        while (ulang) {
            System.out.println("|==== Pilih Metode Pembayaran ====|");
            System.out.println("| 1. Tunai                        |");
            System.out.println("| 2. Qris                         |");
            System.out.println("|=================================|");
            System.out.print("Pilih Metode Pembayaran: ");
            int pilihanMetode = input.nextInt();


            switch (pilihanMetode) {
                case 1:
                    System.out.println("Metode Pembayaran: Tunai");
                    System.out.println("Total : Rp." + Total);
                    System.out.print("Total Uang yang Dibayar: Rp ");
                    uangmasuk = input.nextInt();
                    kembalian = uangmasuk - Total;

                    if (uangmasuk >= Total) {
                        ulang = false;
                        System.out.println("Kembali Rp " + kembalian);
                    } else {
                        System.out.println("Maaf, Uang yang Dibayar Masih Kurang ...");
                        System.out.println("Kekurangan Sebesar Rp " + Math.abs(kembalian));
                    }
                    break;
                case 2:
                    System.out.println("Metode Pembayaran: Qris");
                    System.out.println("Total : Rp." + Total);
                    System.out.println("Pembayaran berhasil");
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada !!!");
                    break;
            }
        }
    }
}
