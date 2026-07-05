package peony_garden;

/**
/*
 * ============================================
 * Class      : HerbaceousPeony
 * Fungsi     : Subclass dari Peony
 * ============================================
 */

public class HerbaceousPeony extends Peony {

    // =========================
    // Attribute Tambahan
    // =========================
    private String musimMekar;

    // =========================
    // Constructor Kosong
    // =========================
    public HerbaceousPeony() {

    }

    // =========================
    // Constructor Berparameter
    // =========================
    public HerbaceousPeony(String namaVarietas,
                           String warna,
                           int umur,
                           double harga,
                           String musimMekar) {

        super(namaVarietas, warna, umur, harga);
        this.musimMekar = musimMekar;
    }

    // =========================
    // Getter & Setter
    // =========================
    public String getMusimMekar() {
        return musimMekar;
    }

    public void setMusimMekar(String musimMekar) {
        this.musimMekar = musimMekar;
    }

    // =========================
    // Override Method
    // (Polymorphism)
    // =========================
    @Override
    public String getJenis() {
        return "Herbaceous Peony";
    }

    // =========================
    // Override Display Info
    // =========================
    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Musim Mekar    : " + musimMekar);
        System.out.println("Kategori       : Herbaceous Peony");
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
                + musimMekar;
    }

}