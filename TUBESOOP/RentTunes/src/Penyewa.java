public class Penyewa {
    private String nama;
    private String noHP;
    private int umur;

    public Penyewa  (String nama, String noHP, int umur) {
        this.nama = nama;
        this.noHP = noHP;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public int getUmur() {
        return umur;
    }
}