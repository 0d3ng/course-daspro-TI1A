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


```java 
mport java.util.Scanner;
Scanner input = new Scanner(System.in);
String jenis, nama;
int jumlah, harga;
double potongan, total, diskon, ppn;
System.out.print("masukkan jenis makanan ('A'untuk minuman/'B'untuk makan) : ");
jenis = input.nextLine();
System.out.print("masukan nama barang yang diinginkan : ");
nama = input.nextLine();
System.out.print("masukkan harga barang : ");
harga = input.nextInt();
System.out.print("jumlah : ");
jumlah = input.nextInt();
 
if(jenis.equalsIgnoreCase ("d")){
    if(jumlah >= 3){
    diskon=5.0/100.0;
    
    }
}else diskon = 1;
potongan = harga * jumlah * diskon;

total = harga * jumlah - potongan;
if(total >= 1000000){
    ppn = total * 7.0/100.0;
}
double tagihan = total + ppn;
System.out.println("Tagihan anda ");
System.out.println("Nama barang \t: " + nama);
System.out.println("Harga \t\t: " + harga);
System.out.println("Jumlah \t\t: " + jumlah);
System.out.println("Diskon \t\t: " + potongan);
System.out.println("PPN \t\t: " + ppn);
System.out.println("Total \t\t: " + tagihan);

maaf pak belom selesai soalnya tiba tiba vertigo saya kambuh 


```

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```python
// tulis jawaban di sini

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

