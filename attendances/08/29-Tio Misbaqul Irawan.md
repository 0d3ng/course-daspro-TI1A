Identitas Diri

Nim : 2141720003

Nama: Tio Misbaqul Irawan

### Soal UTS 2021-2022
Waktu: 90 menit

Silakan mengerjakan soal di bawah ini, NIM ganjil untuk mengerjakan nomor.1 sedangkan nomor.2 untuk NIM genap. Tuliskan
kode program pada cell yang telah disediakan dan jangan lupa untuk menjalankan hasil kode program yang telah dibuat.

1. Buatlah sebuah program untuk menghitung biaya yang harus dikeluarkan oleh pembeli dalam sebuah toko dengan spesifikasi sebagai berikut
    + Jumlah barang yang akan diinputkan belum diketahui jumlahnya
    + Terdapat 3 buah inputan, jenis barang(minuman,makanan), nama, dan harga
    + Ketika jumlah minuman adalah 3 buah, maka akan mendapatkan potongan harga sebesar 5% dari harga minuman.
    + Ketika diakhir belanja seorang pembeli ditanya oleh kasir, apakah mau beli kantong plastic atau tidak. Jika mau, maka harus membayar Rp.200.
    + Ketika total pembelian lebih besar sama dengan 1 juta, maka harus dikenai PPN 7%.


```Java
import java.util.Scanner;

Scanner s = new Scanner(System.in);

boolean inputLagi = true;

// 0 makanan, 1 minuman
int jenisBarang;
String nama;
int harga;

int diskon = 0;
int totalMinuman = 0;
int totalMakanan = 0;
int totalHargaMinuman = 0;
int totalHarga = 0;

do {
  System.out.print("Masukan jenis barang  (0 = makanan, 1 = minuman): ");
  jenisBarang = s.nextInt();
  System.out.print("Masukan nama barang: ");
  nama = s.nextLine();

  s.nextLine();

  System.out.print("Masukan harga: ");
  harga = s.nextInt();

  if(jenisBarang == 0) {
    totalMakanan++;
  } else {
    totalMinuman++;
    totalHargaMinuman += harga;
  }

  totalHarga += harga;

  System.out.print("Apakah ada barang lagi? (y/t) : ");
  inputLagi = s.next().equalsIgnoreCase("y");
} while (inputLagi);

System.out.print("Apakah pakai kantung plastik? (y/t) : ");
boolean denganKantung = s.next().equalsIgnoreCase("y");

if(totalMinuman == 3){
  System.out.println("Karena Anda membeli 3 buah minuman, maka Anda akan mendapat diskon 5% untuk minuman yang Anda beli!");
  totalHarga -= (totalHargaMinuman * 0.05);
}

if(denganKantung){
  System.out.println("Biaya kantung plastik Rp 200");
  totalHarga += 200;
}

if(totalHarga > 1000000){
  System.out.println("Karena pembelian diatas 1jt, Anda terkena PPN 7%");
  totalHarga += (totalHarga * 0.07);
}

System.out.println("Total harga: " + totalHarga);

```

    Masukan jenis barang  (0 = makanan, 1 = minuman): 0
    Masukan nama barang: French Fries
    Masukan harga: 45000
    Apakah ada barang lagi? (y/t) : y
    Masukan jenis barang  (0 = makanan, 1 = minuman): 0
    Masukan nama barang: Burger
    Masukan harga: 40000
    Apakah ada barang lagi? (y/t) : y
    Masukan jenis barang  (0 = makanan, 1 = minuman): 1
    Masukan nama barang: Fruit Shake
    Masukan harga: 24000
    Apakah ada barang lagi? (y/t) : y
    Masukan jenis barang  (0 = makanan, 1 = minuman): 1
    Masukan nama barang: Kopi
    Masukan harga: 35000
    Apakah ada barang lagi? (y/t) : y
    Masukan jenis barang  (0 = makanan, 1 = minuman): 1
    Masukan nama barang: Apple Juice
    Masukan harga: 5000
    Apakah ada barang lagi? (y/t) : t
    Apakah pakai kantung plastik? (y/t) : y
    Karena Anda membeli 3 buah minuman, maka Anda akan mendapat diskon 5% untuk minuman yang Anda beli!
    Biaya kantung plastik Rp 200
    Total harga: 146000
    

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```Java
// tulis jawaban di sini

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

