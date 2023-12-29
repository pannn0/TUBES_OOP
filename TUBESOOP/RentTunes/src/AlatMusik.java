public class AlatMusik extends Admin {

    public AlatMusik(int kodeAlat, int durasi) {
        super(kodeAlat, durasi);
    }

    @Override
    public int hitungHarga() {
        int[] hargaPerHari = {0, 30000, 35000, 40000, 45000, 45000, 50000};
        return hargaPerHari[getKodeAlat()] * getDurasi();
    }
}