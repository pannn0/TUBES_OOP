import java.util.ArrayList;
import java.util.Scanner;

public class RentTunes {
    ArrayList<Penyewa> penyewaList = new ArrayList<>();
    ArrayList<AlatMusik> AlatMusikList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void tambahData() {
        System.out.println("===============================");
        System.out.println("Pilih alat musik:");
        System.out.println("1 => Gitar1 - 30000/hari");
        System.out.println("2 => Gitar2 - 35000/hari");
        System.out.println("3 => Drum1 - 40000/hari");
        System.out.println("4 => Drum2 - 45000/hari");
        System.out.println("5 => Piano1 - 45000/hari");
        System.out.println("6 => Piano2 - 50000/hari");

        System.out.print("Nama: ");
        String nama = input.next();
        System.out.print("No HP: ");
        String noHP = input.next();
        System.out.print("Umur: ");
        int umur = input.nextInt();
        System.out.print("Kode Alat: ");
        int kodeAlat = input.nextInt();
        System.out.print("Durasi: ");
        int durasi = input.nextInt();

        Penyewa penyewa = new Penyewa(nama, noHP, umur);
        AlatMusik alatMusik = new AlatMusik(kodeAlat, durasi);
        penyewaList.add(penyewa);
        AlatMusikList.add(alatMusik);

        System.out.println("Data berhasil ditambahkan!");
    }

    public void ubahData() {
        System.out.println("===============================");
        System.out.print("Masukkan kode alat: ");
        int kodeAlat = input.nextInt();

        for (AlatMusik alatMusik : AlatMusikList) {
            if (alatMusik.getKodeAlat() == kodeAlat) {
                System.out.print("Masukkan durasi baru: ");
                int durasiBaru = input.nextInt();
                alatMusik.setDurasi(durasiBaru);
                System.out.println("Data berhasil diubah!");
                return;
            }
        }

        System.out.println("Kode alat tidak ditemukan!");
    }

    public void tampilkanDataIndividu() {
        System.out.print("Masukkan kode alat: ");
        int kodeAlat = input.nextInt();

        for (int i = 0; i < AlatMusikList.size(); i++) {
            AlatMusik alatMusik = AlatMusikList.get(i);

            if (alatMusik.getKodeAlat() == kodeAlat) {
                Penyewa penyewa = penyewaList.get(i);
                
                System.out.println("===============================");
                System.out.println("Data Penyewa:");
                System.out.println("Nama: " + penyewa.getNama());
                System.out.println("No HP: " + penyewa.getNoHP());
                System.out.println("Umur: " + penyewa.getUmur());
                System.out.println("Kode Alat: " + alatMusik.getKodeAlat());
                System.out.println("Durasi: " + alatMusik.getDurasi() + " hari");
                System.out.println("------------------------");
                int harga = alatMusik.hitungHarga();
                System.out.println("Harga: " + harga);
                System.out.println("===============================");
                return;
            }
        }

        System.out.println("Kode alat tidak ditemukan!");
    }

    public void tampilkanData() {
        System.out.println("1 => Tampilkan data individu");
        System.out.println("2 => Tampilkan semua data");
        System.out.print("Pilih opsi: ");
        int opsi = input.nextInt();

        switch (opsi) {
            case 1:
                tampilkanDataIndividu();
                break;
            case 2:
                System.out.println("===============================");
                System.out.println("Data Penyewa:");

                for (int i = 0; i < penyewaList.size(); i++) {
                    Penyewa penyewa = penyewaList.get(i);
                    Admin admin = AlatMusikList.get(i);

                    System.out.println("Nama: " + penyewa.getNama());
                    System.out.println("No HP: " + penyewa.getNoHP());
                    System.out.println("Umur: " + penyewa.getUmur());
                    System.out.println("Kode Alat: " + admin.getKodeAlat());
                    System.out.println("Durasi: " + admin.getDurasi() + " hari");
                    System.out.println("------------------------");
                }

                int totalHarga = 0;
                for (AlatMusik alatMusik : AlatMusikList) {
                    totalHarga += alatMusik.hitungHarga();
                }
                System.out.println("Total Harga: " + totalHarga);
                System.out.println("===============================");
                break;
            default:
                System.out.println("Opsi tidak valid!");
        }
    }



    public void denda() {
        int dendaPerHari = 5000;
        System.out.println("===============================");
        System.out.print("Masukkan kode alat: ");
        int kodeAlat = input.nextInt();

        for (AlatMusik alatMusik : AlatMusikList) {
            if (alatMusik.getKodeAlat() == kodeAlat) {
                System.out.print("Masukkan jumlah hari terlambat: ");
                int hariTerlambat = input.nextInt();
                int totalDenda = dendaPerHari * hariTerlambat;
                System.out.println("Denda yang harus dibayar: " + totalDenda);
                System.out.println("===============================");
                return;
            }
        }

        System.out.println("Kode alat tidak ditemukan!");
        System.out.println("===============================");
    }
    public void hapusData() {
        System.out.print("Masukkan kode alat yang akan dihapus: ");
        int kodeAlat = input.nextInt();
    
        int indexToRemove = -1;
    
        // Cari indeks alat musik yang akan dihapus
        for (int i = 0; i < AlatMusikList.size(); i++) {
            if (AlatMusikList.get(i).getKodeAlat() == kodeAlat) {
                indexToRemove = i;
                break;
            }
        }
    
        if (indexToRemove != -1) {
            // Hapus data pada indeks yang ditemukan
            penyewaList.remove(indexToRemove);
            AlatMusikList.remove(indexToRemove);
    
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Kode alat tidak ditemukan!");
        }
    }
}
