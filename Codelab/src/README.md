# 📚 Sistem Manajemen Buku Sederhana (Java OOP Project)

Proyek ini adalah demonstrasi sederhana dari konsep **Pemrograman Berorientasi Objek (OOP)** di Java. Proyek ini mendefinisikan objek `Book` dan `Library` untuk mengelola informasi dasar buku, menghitung diskon, dan melacak stok.

## Struktur Kelas

Proyek ini terdiri dari tiga kelas utama:

### 1. `Book`

Kelas ini merepresentasikan objek buku dengan atribut dan perilaku berikut:
- **Atribut:** `title`, `author`, `price`, `stock`.
- **Konstanta:** `DISCOUNT_RATE` (0.1 atau 10%).
- **Metode:**
    - `calculateDiscount()`: Menghitung harga buku setelah diskon 10%.
    - `adjustStock(int adjustment)`: Menambah atau mengurangi stok buku.
    - `displayInfo()`: Menampilkan detail lengkap buku, termasuk harga diskon.

### 2. `Library`

Kelas ini merepresentasikan perpustakaan yang menyimpan objek `Book` dan informasi lokasinya.
- **Atribut:** Objek `book` (asosiasi) dan `location`.
- **Metode:**
    - `showLibraryInfo()`: Menampilkan lokasi perpustakaan dan memanggil metode `displayInfo()` dari objek `Book` di dalamnya.

### 3. `Main`

Kelas utama yang berisi metode `main()`. Kelas ini bertanggung jawab untuk:
- Membuat instance objek `Book`.
- Membuat instance objek `Library` dan mengasosiasikannya dengan `Book`.
- Mendemonstrasikan fungsionalitas metode `adjustStock()` dan menampilkan informasi sebelum dan sesudah pembaruan.

## 🚀 Cara Menjalankan Proyek

### Prasyarat

Pastikan Anda telah menginstal **Java Development Kit (JDK)** di komputer Anda.

### Langkah-langkah Kompilasi & Eksekusi

1.  **Simpan Kode:** Pastikan semua kode (`Book.java`, `Library.java`, `Main.java`) berada di direktori yang sama.
2.  **Kompilasi:** Buka terminal atau Command Prompt, arahkan ke direktori proyek, dan kompilasi file:
    ```bash
    javac Book.java Library.java Main.java
    ```
3.  **Jalankan:** Jalankan kelas `Main`:
    ```bash
    java Main
    ```

## 📝 Contoh Output

Berikut adalah hasil yang akan Anda lihat saat menjalankan program: