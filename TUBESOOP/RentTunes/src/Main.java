import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentTunes rentTunes = new RentTunes();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=====RENT TUNES=====");
            System.out.println("Menu:");
            System.out.println("1) Tambah Data");
            System.out.println("2) Ubah Data");
            System.out.println("3) Tampilkan Data");
            System.out.println("4) Denda");
            System.out.println("5) Hapus Data");
            System.out.println("0) Keluar");
            System.out.println("====================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    rentTunes.tambahData();
                    break;
                case 2:
                    rentTunes.ubahData();
                    break;
                case 3:
                    rentTunes.tampilkanData();
                    break;
                case 4:
                    rentTunes.denda();
                    break;
                case 5:
                    rentTunes.hapusData();
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
        input.close();
    }
}