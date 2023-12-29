abstract class Admin {
    private int kodeAlat;
    private int durasi;

    public Admin(int kodeAlat, int durasi) {
        this.kodeAlat = kodeAlat;
        this.durasi = durasi;
    }

    public int getKodeAlat() {
        return kodeAlat;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int hitungHarga() {
        return 0;  // You can provide a default implementation or throw an exception
    }
}