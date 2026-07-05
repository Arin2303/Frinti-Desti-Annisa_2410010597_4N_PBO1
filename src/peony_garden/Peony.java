package peony_garden;

/*
 * ============================================
 * Class      : Peony
 * Fungsi     : Superclass untuk semua jenis Peony
 * ============================================
 */

public class Peony {

    // =========================
    // Attribute (Encapsulation)
    // =========================
    private String namaVarietas;
    private String warna;
    private int umur;
    private double harga;

    // =========================
    // Constructor Kosong
    // =========================
    public Peony() {

    }

    // =========================
    // Constructor Berparameter
    // =========================
    public Peony(String namaVarietas, String warna, int umur, double harga) {
        this.namaVarietas = namaVarietas;
        this.warna = warna;
        this.umur = umur;
        this.harga = harga;
    }

    // =========================
    // Getter & Setter
    // =========================

    public String getNamaVarietas() {
        return namaVarietas;
    }

    public void setNamaVarietas(String namaVarietas) {
        this.namaVarietas = namaVarietas;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // =========================
    // Method Polymorphism
    // Akan dioverride subclass
    // =========================
    public String getJenis() {
        return "Peony";
    }

    // =========================
    // Menampilkan Informasi
    // =========================
    public void displayInfo() {

        System.out.println("====================================");
        System.out.println("Jenis Peony    : " + getJenis());
        System.out.println("Nama Varietas  : " + namaVarietas);
        System.out.println("Warna          : " + warna);
        System.out.println("Umur           : " + umur + " Tahun");
        System.out.println("Harga          : Rp " + harga);
    }

    // =========================
    // Untuk disimpan ke file
    // =========================
    @Override
    public String toString() {

        return getJenis() + ";"
                + namaVarietas + ";"
                + warna + ";"
                + umur + ";"
                + harga;
    }

}