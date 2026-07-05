package peony_garden;

/*
 * ============================================
 * Class      : ItohPeony
 * Fungsi     : Subclass dari Peony
 * ============================================
 */

public class ItohPeony extends Peony {

    // =========================
    // Attribute Tambahan
    // =========================
    private int jumlahKelopak;

    // =========================
    // Constructor Kosong
    // =========================
    public ItohPeony() {

    }

    // =========================
    // Constructor Berparameter
    // =========================
    public ItohPeony(String namaVarietas,
                     String warna,
                     int umur,
                     double harga,
                     int jumlahKelopak) {

        super(namaVarietas, warna, umur, harga);
        this.jumlahKelopak = jumlahKelopak;
    }

    // =========================
    // Getter & Setter
    // =========================
    public int getJumlahKelopak() {
        return jumlahKelopak;
    }

    public void setJumlahKelopak(int jumlahKelopak) {
        this.jumlahKelopak = jumlahKelopak;
    }

    // =========================
    // Override Method
    // (Polymorphism)
    // =========================
    @Override
    public String getJenis() {
        return "Itoh Peony";
    }

    // =========================
    // Override Display Info
    // =========================
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Jumlah Kelopak : " + jumlahKelopak);
        System.out.println("Kategori       : Itoh Peony");
        System.out.println("====================================");
    }

    // =========================
    // Untuk disimpan ke file
    // =========================
    @Override
    public String toString() {

        return getJenis() + ";"
                + getNamaVarietas() + ";"
                + getWarna() + ";"
                + getUmur() + ";"
                + getHarga() + ";"
                + jumlahKelopak;
    }

}