 import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean ulang = true;
            boolean ulang2 = true;
            char pilih = 'Y';
            Menu tampilan = new Menu();
            while(ulang){
                System.out.println();
                tampilan.inputDataDiri();
                tampilan.menu();
                ulang = true;
                ulang2 = true;
                while (ulang2) {
                    System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                    System.out.print("Silahkan klik [Y] kembali atau [T] berhenti : ");
                    pilih = input.next().charAt(0);
                    
                    if (pilih == 'Y'){
                        ulang2 = false;
                        break;
                    } else if (pilih == 'T'){
                        System.exit(0);
                    } else {
                        System.out.println("Pilihan yang anda masukkan salah");
                    }
                }
            }
        }
    }
}