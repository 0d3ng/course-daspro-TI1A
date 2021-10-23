Identitas Diri

Nim : 2141720085

Nama: Maulana Arif Wijaya

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
Scanner in = new Scanner(System.in);
double hargaBarang = 0,totalHargaMinuman =0,totalHargaMakanan=0,totalHarga=0;
int jumlahMinuman =0;
String namaBarang,jenisBarang;
System.out.println("Selamat datang di MaulanaMart mau belanja berapa barang ?");
boolean beliLagi;
do{
    System.out.println("Beli Makanan atau Minuman ? Tulis di bawah");
    jenisBarang = in.nextLine();
    if(jenisBarang.equalsIgnoreCase("minuman")){
        System.out.println("Apa nama minumannya ?");
        namaBarang = in.nextLine();
        System.out.println("Berapa harganya ?");
        hargaBarang = in.nextDouble();
        in.nextLine();
        jumlahMinuman++;
        totalHargaMinuman += hargaBarang;
        if(jumlahMinuman == 3){
            totalHargaMinuman -= totalHargaMinuman*0.05;
        }
    }
    if (jenisBarang.equalsIgnoreCase("makanan")){
        System.out.println("Apa nama makanannya ?");
        namaBarang = in.nextLine();
        System.out.println("Berapa harganya ?");
        hargaBarang = in.nextDouble();
        in.nextLine();
        totalHargaMakanan += hargaBarang;
    }
    beliLagi = false;
    System.out.println("apakah ingin membeli barang lagi ?(Y jika iya / N jika tidak)");
    String beliLagiGa = in.nextLine();
    if(beliLagiGa.equalsIgnoreCase("y")){
        beliLagi = true;
    }
}while(beliLagi == true);
System.out.println("Sekalian kantong plastiknya kak ?(Y = ya/ N = tidak)");
String kresek = in.nextLine();
System.out.println("total harga minuman anda : " + totalHargaMinuman);
System.out.println("total harga makanan anda : " + totalHargaMakanan);
totalHarga = totalHargaMakanan + totalHargaMinuman;
if (kresek.equalsIgnoreCase("y")) {
    totalHarga += 200;
}
if(totalHarga >= 1000000){
    totalHarga -= totalHarga*0.07;
}
System.out.println("total harga = Rp " + totalHarga);
```
```
Selamat datang di MaulanaMart mau belanja berapa barang ?
Beli Makanan atau Minuman ? Tulis di bawah
minuman
Apa nama minumannya ?
aqua
Berapa harganya ?
500000
apakah ingin membeli barang lagi ?(Y jika iya / N jika tidak)
y
Beli Makanan atau Minuman ? Tulis di bawah
minuman
Apa nama minumannya ?
cleo
Berapa harganya ?
500000
apakah ingin membeli barang lagi ?(Y jika iya / N jika tidak)
y
Beli Makanan atau Minuman ? Tulis di bawah
minuman
Apa nama minumannya ?
santri
Berapa harganya ?
200000
apakah ingin membeli barang lagi ?(Y jika iya / N jika tidak)
n
Sekalian kantong plastiknya kak ?(Y = ya/ N = tidak)
y
total harga minuman anda : 1140000.0
total harga makanan anda : 0.0
total harga = Rp 1060386.0
```


2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.

```java

```


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

