import java.util.*;
public class Menu extends SistemKembalian{
    Scanner input =  new Scanner(System.in);
    private String nomerHp;

    private void SetNomerHp(String angka){
        this.nomerHp = angka;
    }

    private String GetNomerHp(){
        return this.nomerHp;
    }

    public void menu() {
        System.out.println(Harga.selamat);
        do {
            System.out.println("| ===== Nama ===== | ===== Harga ===== |");
            System.out.println("| 1.Gula           | Rp.5.000          |");
            System.out.println("| 2.Garam          | Rp.3.000          |");
            System.out.println("| 3.Telur          | Rp.27.000         |");
            System.out.println("| 4.Beras          | Rp.13.000         |");
            System.out.println("| 5.Es Batu        | Rp.1.000          |");
            System.out.println("| 6.Minyak         | Rp.12.000         |");
            System.out.println("| 7.Tepung         | Rp.8.000          |");
            System.out.println("| 8.Kecap          | Rp.7.000          |");
            System.out.println("| 9.Mie Instan     | Rp.3.500          |");
            System.out.println("| 10.Penyedap      | Rp.1000           |");
            System.out.println("|======================================|");
            System.out.println("| 15.Selesai dan Hitung pembayaran     |");
            System.out.println("| 0.Keluar Program                     |");
            System.out.println("|======================================|");
            System.out.print("Masukkan Pilihan  : ");
            pilihan = input.nextInt();
            if(pilihan >= 1 && pilihan <=10) {
                System.out.print("Masukkan Jumlah Beli : ");
                jumlah = input.nextInt();
            }
            hitungTotal(jumlah);
        }while(pilihan != 15);

        viewTotal();
        
    }

    public void inputDataDiri(){
        Scanner input = new Scanner(System.in);
        String Nama, Alamat, NoTelp;
        System.out.println();
        System.out.println("Selamat Datang");
        System.out.println("Silahkan isi no antrian dibawah");
        System.out.print("Nama: ");
        Nama = input.nextLine();
        System.out.print("Alamat: ");
        Alamat = input.nextLine();
        System.out.print("Nomor Telepon: ");
        NoTelp = input.nextLine();
        SetNomerHp(NoTelp);        
        System.out.println();
        System.out.println("Data Diri");
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Nomor Telepon : " + GetNomerHp());
    }
}
