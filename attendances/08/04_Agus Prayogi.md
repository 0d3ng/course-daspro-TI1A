Identitas Diri

Nim : [Isikan NIM Anda]

Nama: [Isikan Nama Anda]

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
// tulis jawaban di sini
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int hargaBrg, jmbMinuman, jmbMakanan;
double totalHMinuman, totalHMakanan, totalBayar;
String namaBrg;
boolean ulang,jenisBrg;

System.out.println("===== Tokoku =====");
do{
    System.out.println("1. Makanan"); // true
    System.out.println("2. Minuman"); // false
    System.out.print("Masukkan Jenis (1/2): ");
    jenisBrg = input.nextInt() == 1;

    System.out.print("Masukkan Nama Barang : ");
    namaBrg = input.next();
    input.next(); // untuk menghilangkan enter
    System.out.print("Masukkan Harga Barang : ");
    hargaBrg = input.nextInt();
    if(hargaBrg < 0){
        System.out.println("Harga tidak boleh negatif");
        System.out.print("Masukkan Harga Barang : ");
        hargaBrg = input.nextInt();
    }
    
    if(jenisBrg){
        jmbMakanan++;
        totalHMakanan += hargaBrg;
    }else{
        jmbMinuman++;
        totalHMinuman += hargaBrg;
    }

    System.out.print("Apakah anda ingin Beli Lagi (y/t): ");
    ulang = input.next().equalsIgnoreCase("y");
    
}while(ulang);

System.out.print("Apakah ingin membeli kantong plastik kak? (y/t) : ");
boolean kantongPlastik = input.next().equalsIgnoreCase("y");

if (kantongPlastik){
    totalBayar += 200;
}

if(jmbMinuman >= 3){
    totalHMinuman -= totalHMinuman * 0.05; // diskon
}

totalBayar += totalHMakanan + totalHMinuman;
if(totalBayar >= 1000000){
    totalBayar += totalBayar * 0.07;
}
System.out.println("\n===== Total Pembayaran =====");
if(jmbMakanan>0){
    System.out.println("Jumlah Makanan : " + jmbMakanan);
    System.out.println("Total Harga Makanan : " + totalHMakanan);
}
if(jmbMinuman>0){
    System.out.println("Jumlah Minuman : " + jmbMinuman);
    System.out.println("Total Harga Minuman : " + totalHMinuman);
}
System.out.println("Total Pembayaran : " + totalBayar);
System.out.println("===== Total Pembayaran =====");

```

    ===== Tokoku =====
    1. Makanan
    2. Minuman
    Masukkan Jenis (1/2): 2
    Masukkan Nama Barang : Es Teh
    Masukkan Harga Barang : 50000
    Apakah anda ingin Beli Lagi (y/t): y
    1. Makanan
    2. Minuman
    Masukkan Jenis (1/2): 2
    Masukkan Nama Barang : Es Degan
    Masukkan Harga Barang : 60000
    Apakah anda ingin Beli Lagi (y/t): y
    1. Makanan
    2. Minuman
    Masukkan Jenis (1/2): 2
    Masukkan Nama Barang : Es Lemon
    Masukkan Harga Barang : 70000
    Apakah anda ingin Beli Lagi (y/t): y
    1. Makanan
    2. Minuman
    Masukkan Jenis (1/2): 1
    Masukkan Nama Barang : Nasi Goreng
    Masukkan Harga Barang : 100000
    Apakah anda ingin Beli Lagi (y/t): t
    Apakah ingin membeli kantong plastik kak? (y/t) : y
    ===== Total Pembayaran =====
    Jumlah Makanan : 1
    Total Harga Makanan : 100000.0
    Jumlah Minuman : 3
    Total Harga Minuman : 171000.0
    Total Pembayaran : 271200.0
    ===== Total Pembayaran =====


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

