package peony_garden;

/*
 * ============================================
 * Class      : TreePeony
 * Fungsi     : Subclass dari Peony
 * ============================================
 */

public class TreePeony extends Peony {

    // =========================
    // Attribute Tambahan
    // =========================
    private double tinggiTanaman;

    // =========================
    // Constructor Kosong
    // =========================
    public TreePeony() {

    }

    // =========================
    // Constructor Berparameter
    // =========================
    public TreePeony(String namaVarietas,
                     String warna,
                     int umur,
                     double harga,
                     double tinggiTanaman) {

        super(namaVarietas, warna, umur, harga);
        this.tinggiTanaman = tinggiTanaman;
    }

    // =========================
    // Getter & Setter
    // =========================
    public double getTinggiTanaman() {
        return tinggiTanaman;
    }

    public void setTinggiTanaman(double tinggiTanaman) {
        this.tinggiTanaman = tinggiTanaman;
    }

    // =========================
    // Override Method
    // (Polymorphism)
    // =========================
    @Override
    public String getJenis() {
        return "Tree Peony";
    }

    // =========================
    // Override Display Info
    // =========================
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Tinggi Tanaman : " + tinggiTanaman + " cm");
        System.out.println("Kategori       : Tree Peony");
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
                + tinggiTanaman;
    }

}