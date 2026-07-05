package peony_garden;

import java.util.Scanner; //terima inpuut dari keyboard
import java.io.BufferedReader; // baca isi data
import java.io.BufferedWriter; //tulis data
import java.io.FileReader; // hubungkan ke file yang dibaca
import java.io.FileWriter; // hubungkan ke file yang dibuat
import java.io.IOException; // menangani error saat proses baca/simpan

public class MainPeony {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Peony[] daftarPeony = new Peony[100];
        int jumlahData = 0;

        boolean jalan = true;

        while (jalan) {

            System.out.println("\n==================================================");
            System.out.println("               PEONY GARDEN");
            System.out.println("       Collection Management System");
            System.out.println("==================================================");
            System.out.println("1. Tambah Koleksi Peony");
            System.out.println("2. Lihat Semua Koleksi");
            System.out.println("3. Cari Varietas Peony");
            System.out.println("4. Statistik Koleksi");
            System.out.println("5. Simpan Data ke File");
            System.out.println("6. Baca Data dari File");
            System.out.println("7. Edit Data");
            System.out.println("8. Hapus Data");
            System.out.println("9. Keluar");
            System.out.println("==================================================");
            System.out.print("Pilih menu : ");

            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {

                case 1:

                    if (jumlahData >= daftarPeony.length) {
                        System.out.println("\nKapasitas penyimpanan sudah penuh.");
                        break;
                    }

                    System.out.println("\n========== TAMBAH KOLEKSI ==========");
                    System.out.println("1. Tree Peony");
                    System.out.println("2. Herbaceous Peony");
                    System.out.println("3. Itoh Peony");
                    System.out.print("Pilih jenis Peony : ");
                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Varietas : ");
                    String nama = input.nextLine();

                    System.out.print("Warna : ");
                    String warna = input.nextLine();

                    System.out.print("Umur (tahun) : ");
                    int umur = input.nextInt();

                    System.out.print("Harga : ");
                    double harga = input.nextDouble();
                    input.nextLine();

                    switch (jenis) {

                        case 1:

                            System.out.print("Tinggi Tanaman (cm) : ");
                            double tinggi = input.nextDouble();
                            input.nextLine();

                            daftarPeony[jumlahData] = new TreePeony(
                                    nama,
                                    warna,
                                    umur,
                                    harga,
                                    tinggi);

                            break;

                        case 2:

                            System.out.print("Musim Mekar : ");
                            String musim = input.nextLine();

                            daftarPeony[jumlahData] = new HerbaceousPeony(
                                    nama,
                                    warna,
                                    umur,
                                    harga,
                                    musim);

                            break;

                        case 3:

                            System.out.print("Jumlah Kelopak : ");
                            int kelopak = input.nextInt();
                            input.nextLine();

                            daftarPeony[jumlahData] = new ItohPeony(
                                    nama,
                                    warna,
                                    umur,
                                    harga,
                                    kelopak);

                            break;

                        default:

                            System.out.println("Jenis Peony tidak tersedia.");
                            break;
                    }

                    if (jenis >= 1 && jenis <= 3) {

                        jumlahData++;

                        System.out.println("\n======================================");
                        System.out.println("🌸 Koleksi berhasil ditambahkan.");
                        System.out.println("Total koleksi : " + jumlahData);
                        System.out.println("======================================");

                    }

                    break;

                case 2:

                    if (jumlahData == 0) {

                        System.out.println("\nBelum ada data koleksi.");

                    } else {

                        System.out.println("\n========== DAFTAR KOLEKSI ==========");

                        for (int i = 0; i < jumlahData; i++) {

                            System.out.println("\nData Ke-" + (i + 1));
                            daftarPeony[i].displayInfo();

                        }

                    }

                    break;

                case 3:

                    if (jumlahData == 0) {

                        System.out.println("\nBelum ada data koleksi.");
                        break;

                    }

                    System.out.print("\nMasukkan nama varietas : ");
                    String cari = input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < jumlahData; i++) {

                        if (daftarPeony[i].getNamaVarietas().equalsIgnoreCase(cari)) {

                            System.out.println("\n🌸 Data berhasil ditemukan!\n");

                            daftarPeony[i].displayInfo();

                            ditemukan = true;

                            break;

                        }

                    }

                    if (!ditemukan) {

                        System.out.println("\n🍃 Varietas \"" + cari + "\" tidak ditemukan.");

                    }

                    break;

                case 4:

                    if (jumlahData == 0) {

                        System.out.println("\nBelum ada data koleksi.");
                        break;

                    }

                    int tree = 0;
                    int herb = 0;
                    int itoh = 0;
                    double totalHarga = 0;

                    for (int i = 0; i < jumlahData; i++) {

                        if (daftarPeony[i] instanceof TreePeony) {
                            tree++;
                        } else if (daftarPeony[i] instanceof HerbaceousPeony) {
                            herb++;
                        } else if (daftarPeony[i] instanceof ItohPeony) {
                            itoh++;
                        }

                        totalHarga += daftarPeony[i].getHarga();

                    }

                    System.out.println("\n========== STATISTIK KOLEKSI ==========");
                    System.out.println("Jumlah Tree Peony        : " + tree);
                    System.out.println("Jumlah Herbaceous Peony  : " + herb);
                    System.out.println("Jumlah Itoh Peony        : " + itoh);
                    System.out.println("Total Koleksi            : " + jumlahData);
                    System.out.println("Total Harga              : Rp " + totalHarga);
                    System.out.println("Rata-rata Harga          : Rp " + (totalHarga / jumlahData));

                    break;

                case 5:

                    if (jumlahData == 0) {

                        System.out.println("\nBelum ada data yang dapat disimpan.");
                        break;

                    }

                    try {

                        BufferedWriter bw = new BufferedWriter(new FileWriter("peony.txt"));

                        for (int i = 0; i < jumlahData; i++) {

                            bw.write(daftarPeony[i].toString());
                            bw.newLine();

                        }

                        bw.close();

                        System.out.println("\n🌸 Data berhasil disimpan ke file.");

                    } catch (IOException e) {

                        System.out.println("Terjadi kesalahan : " + e.getMessage());

                    }

                    break;

                case 6:

                    try {

                        BufferedReader br = new BufferedReader(new FileReader("peony.txt"));

                        String baris;

                        System.out.println("\n========== ISI FILE PEONY ==========");

                        while ((baris = br.readLine()) != null) {

                            System.out.println(baris);

                        }

                        br.close();

                    } catch (IOException e) {

                        System.out.println("Terjadi kesalahan : " + e.getMessage());

                    }

                    break;

                case 7:

                    if (jumlahData == 0) {

                        System.out.println("\nBelum ada data yang dapat diedit.");
                        break;

                    }

                    System.out.println("\n========== EDIT DATA ==========");

                    for (int i = 0; i < jumlahData; i++) {

                        System.out.println((i + 1) + ". "
                                + daftarPeony[i].getNamaVarietas());

                    }

                    System.out.print("Pilih nomor data yang akan diedit : ");
                    int edit = input.nextInt();
                    input.nextLine();

                    if (edit >= 1 && edit <= jumlahData) {

                        Peony p = daftarPeony[edit - 1];

                        System.out.print("Nama Varietas Baru : ");
                        p.setNamaVarietas(input.nextLine());

                        System.out.print("Warna Baru : ");
                        p.setWarna(input.nextLine());

                        System.out.print("Umur Baru : ");
                        p.setUmur(input.nextInt());

                        System.out.print("Harga Baru : ");
                        p.setHarga(input.nextDouble());
                        input.nextLine();

                        if (p instanceof TreePeony) {

                            System.out.print("Tinggi Tanaman Baru (cm) : ");
                            ((TreePeony) p).setTinggiTanaman(input.nextDouble());
                            input.nextLine();

                        } else if (p instanceof HerbaceousPeony) {

                            System.out.print("Musim Mekar Baru : ");
                            ((HerbaceousPeony) p).setMusimMekar(input.nextLine());

                        } else if (p instanceof ItohPeony) {

                            System.out.print("Jumlah Kelopak Baru : ");
                            ((ItohPeony) p).setJumlahKelopak(input.nextInt());
                            input.nextLine();

                        }

                        System.out.println("\n🌸 Data berhasil diperbarui.");

                        try {

                            BufferedWriter bw = new BufferedWriter(new FileWriter("peony.txt"));

                            for (int i = 0; i < jumlahData; i++) {

                                bw.write(daftarPeony[i].toString());
                                bw.newLine();

                            }

                            bw.close();

                            System.out.println("Data pada file berhasil diperbarui.");

                        } catch (IOException e) {

                            System.out.println("Terjadi kesalahan : " + e.getMessage());

                        }

                    } else {

                        System.out.println("Nomor tidak valid.");

                    }

                    break;

                case 8:

                    if (jumlahData == 0) {

                        System.out.println("\nBelum ada data yang dapat dihapus.");
                        break;

                    }

                    System.out.println("\n========== HAPUS DATA ==========");

                    for (int i = 0; i < jumlahData; i++) {

                        System.out.println((i + 1) + ". "
                                + daftarPeony[i].getNamaVarietas());

                    }

                    System.out.print("Pilih nomor data yang akan dihapus : ");
                    int hapus = input.nextInt();

                    if (hapus >= 1 && hapus <= jumlahData) {

                        for (int i = hapus - 1; i < jumlahData - 1; i++) {

                            daftarPeony[i] = daftarPeony[i + 1];

                        }

                        daftarPeony[jumlahData - 1] = null;
                        jumlahData--;

                        System.out.println("\n🌸 Data berhasil dihapus.");

                        try {

                            BufferedWriter bw = new BufferedWriter(new FileWriter("peony.txt"));

                            for (int i = 0; i < jumlahData; i++) {

                                bw.write(daftarPeony[i].toString());
                                bw.newLine();

                            }

                            bw.close();

                            System.out.println("Data pada file berhasil diperbarui.");

                        } catch (IOException e) {

                            System.out.println("Terjadi kesalahan : " + e.getMessage());

                        }

                    } else {

                        System.out.println("Nomor tidak valid.");

                    }

                    break;

                case 9:

                    System.out.println("\n==========================================");
                    System.out.println("Terima kasih telah menggunakan");
                    System.out.println("PEONY GARDEN");
                    System.out.println("Have a Blooming Day 🌸");
                    System.out.println("==========================================");

                    jalan = false;
                    break;

                default:

                    System.out.println("\nMenu tidak tersedia.");
            }

        }

        input.close();

    }

}
