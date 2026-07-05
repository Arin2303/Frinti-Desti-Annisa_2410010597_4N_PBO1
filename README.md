# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana pengelolaan koleksi bunga **Peony** menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi **Peony Garden** digunakan untuk mengelola data koleksi bunga Peony melalui menu berbasis terminal. Pengguna dapat menambahkan data, melihat seluruh koleksi, mencari varietas bunga, mengedit data koleksi, menghapus data koleksi, melihat statistik koleksi, menyimpan data ke file, serta membaca data dari file. Setiap perubahan data melalui fitur edit maupun hapus akan langsung memperbarui isi file sehingga data yang tersimpan di memori dan file selalu sinkron.

Aplikasi ini mengimplementasikan konsep-konsep penting dalam Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

---

# Penjelasan Kode

Berikut merupakan implementasi konsep OOP yang digunakan pada aplikasi **Peony Garden**.

## 1. Class

Class merupakan blueprint atau rancangan dalam pembuatan object.

Pada program ini terdapat lima class yaitu:

- Peony
- TreePeony
- HerbaceousPeony
- ItohPeony
- MainPeony

```java
public class Peony {

}

public class TreePeony extends Peony {

}

public class HerbaceousPeony extends Peony {

}

public class ItohPeony extends Peony {

}

public class MainPeony {

}
```

---

## 2. Object

Object merupakan hasil pembuatan dari sebuah class.

Pada program ini object dibuat ketika pengguna menambahkan data koleksi.

```java
daftarPeony[jumlahData] = new TreePeony(
        nama,
        warna,
        umur,
        harga,
        tinggi);
```

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh suatu class.

Contoh atribut pada class Peony.

```java
private String namaVarietas;
private String warna;
private int umur;
private double harga;
```

---

## 4. Constructor

Constructor merupakan method yang otomatis dipanggil ketika object dibuat.

```java
public Peony(String namaVarietas, String warna, int umur, double harga) {

    this.namaVarietas = namaVarietas;
    this.warna = warna;
    this.umur = umur;
    this.harga = harga;

}
```

---

## 5. Mutator (Setter)

Mutator atau setter digunakan untuk mengubah nilai atribut suatu object setelah object dibuat.

Pada aplikasi ini setter digunakan pada fitur **Edit Data**, sehingga pengguna dapat memperbarui informasi koleksi Peony tanpa membuat object baru.

```java
public void setHarga(double harga) {

    this.harga = harga;

}
```

---

## 6. Accessor (Getter)

Accessor atau getter digunakan untuk mengambil nilai atribut suatu object.

Pada aplikasi ini getter digunakan untuk menampilkan data koleksi, mencari varietas, menghitung statistik, menghapus data, serta menyimpan data ke dalam file.

```java
public double getHarga() {

    return harga;

}
```

---

## 7. Encapsulation

Encapsulation merupakan proses menyembunyikan data menggunakan access modifier **private**, sehingga data hanya dapat diakses melalui getter dan setter.

```java
private String namaVarietas;
private String warna;
private int umur;
private double harga;
```

---

## 8. Inheritance

Inheritance merupakan proses pewarisan dari superclass ke subclass.

Pada program ini class TreePeony, HerbaceousPeony, dan ItohPeony mewarisi class Peony.

```java
public class TreePeony extends Peony {

}
```

---

## 9. Polymorphism

Polymorphism diterapkan menggunakan **method overriding**.

Method `getJenis()` pada superclass dioverride oleh masing-masing subclass.

```java
@Override
public String getJenis() {

    return "Tree Peony";

}
```

Selain itu, polymorphism juga diterapkan saat seluruh object disimpan dalam array bertipe `Peony`.

```java
Peony[] daftarPeony = new Peony[100];
```

Method `displayInfo()` juga menerapkan polymorphism. Ketika dipanggil dari object bertipe `Peony`, Java akan menjalankan method `displayInfo()` sesuai subclass masing-masing sehingga informasi yang ditampilkan berbeda sesuai jenis Peony.

---

## 10. Seleksi

Seleksi digunakan menggunakan `switch` dan `if`.

```java
switch(menu){

    case 1:
        ...

}
```

```java
if(jumlahData == 0){

    System.out.println("Belum ada data.");

}
```

---

## 11. Perulangan

Perulangan digunakan untuk menampilkan seluruh data koleksi, mencari data, menghitung statistik, menyimpan data ke file, serta menghapus data.

```java
for(int i = 0; i < jumlahData; i++){

    daftarPeony[i].displayInfo();

}
```

---

## 12. Input Output Sederhana

Input menggunakan class `Scanner`.

Output menggunakan `System.out.println()`.

Selain itu aplikasi juga menggunakan `BufferedWriter` untuk menyimpan data ke file dan `BufferedReader` untuk membaca data dari file.

```java
Scanner input = new Scanner(System.in);

System.out.print("Nama Varietas : ");
```

---

## 13. Array

Array digunakan untuk menyimpan seluruh object Peony.

Karena array bertipe `Peony`, maka object dari TreePeony, HerbaceousPeony, maupun ItohPeony dapat disimpan dalam satu wadah.

```java
Peony[] daftarPeony = new Peony[100];
```

---

## 14. Error Handling

Error Handling menggunakan `try-catch` saat proses menyimpan, membaca, mengedit, maupun menghapus data yang berkaitan dengan file sehingga program tidak langsung berhenti apabila terjadi kesalahan Input/Output.

```java
try{

    BufferedWriter bw = new BufferedWriter(new FileWriter("peony.txt"));

}catch(IOException e){

    System.out.println(e.getMessage());

}
```

---

# Fitur Program

- Menambah koleksi Peony
- Menampilkan seluruh koleksi
- Mencari varietas Peony
- Mengedit data koleksi
- Menghapus data koleksi
- Menampilkan statistik koleksi
- Menyimpan data ke file (.txt)
- Membaca data dari file (.txt)
- Memperbarui isi file secara otomatis setelah data diedit
- Memperbarui isi file secara otomatis setelah data dihapus

---

# Usulan Nilai

| No | 		Materi 	      	| Nilai	|
|:--:|--------------------------|:-----:|
|1   |Class		  	|5     	|
|2   |Object		      	|5 	|
|3   |Atribut			|5     	|
|4   |Constructor		|5     	|
|5   |Mutator		   	|5    	|
|6   |Accessor			|5	|
|7   |Encapsulation		|5	|
|8   |Inheritance		|5	|
|9   |Polymorphism		|10	|
|10  |Seleksi			|5	|
|11  |Perulangan		|5	|
|12  |Input Output Sederhana	|10	|
|13  |Array			|15	|
|14  |Error Handling		|15	|
|    |**TOTAL**		        |**100**|

---

# Pembuat

**Nama :** Frinti Desti Annisa
**NPM :** 2410010597
**Kelas :** 4N REG BJM
**Mata Kuliah :** Pemrograman Berbasis Objek 1
**Program :** Peony Garden