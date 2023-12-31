public class Harga implements Kalkulasi {
    protected int Total;
    protected int jumlah, pilihan;
    static final String selamat = " ~> [Selamat Datang Di Toko Sembako] <~";

    public int hitungTotal(int Jml) {
        int Harga;
        switch(pilihan) {
            case 0 :
                System.exit(0);
                break;
            case 1: Harga = 5000; 
                Total = Harga*jumlah;
                break;
            case 2: Harga = 3000; 
                Total = Harga*jumlah;
                break;
            case 3: Harga = 27000; 
                Total = Harga*jumlah;
                break;
            case 4: Harga = 13000; 
                Total = Harga*jumlah;
                break;
            case 5: Harga = 1000; 
                Total = Harga*jumlah;
                break;
            case 6: Harga = 12000; 
                Total = Harga*jumlah;
                break;
            case 7: Harga = 8000; 
                Total = Harga*jumlah;
                break;
            case 8: Harga = 7000; 
                Total = Harga*jumlah;
                break;
            case 9: Harga = 3500; 
                Total = Harga*jumlah;
                break;
            case 10: Harga = 1000; 
                Total = Harga*jumlah;
                break;
            case 15: break;
            default:
                System.out.println("ERROR: Input yang anda masukkan salah !");
                break;
            }
        return Total;
        }
    }
