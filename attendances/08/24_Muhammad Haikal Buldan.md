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
```

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int usaha, keluarga, hargahartagerak, hargahartadiam, jumlahanak, sd, smp, sma, kuliah;
double pajak1, pajak2, penghasilan;
String hartagerak, hartadiam;

System.out.print("Punya Usaha atau Belum (1 untuk iya atau 0 untuk tidak)\t\t : ");
usaha = sc.nextInt();
if (usaha == 1){
    System.out.print("Masukan penghasilan 1 Tahun \t : ");
    penghasilan = sc.nextInt();
    penghasilan = penghasilan - (penghasilan * 15 / 100);
    System.out.print("Harta Kekayaan Bergerak \t : ");
    hartagerak = sc.nextLine();
    System.out.print("Masukan Harga \t : ");
    hargahartagerak = sc.nextInt();
    System.out.print("Harta Kekayaan Diam \t : ");
    hartadiam = sc.nextLine();
    System.out.print("Masukan Harga \t : ");
    hargahartadiam = sc.nextInt();
    jumlahharta = hargahartadiam + hargahartagerak;
    System.out.print("Apakah Sudah Berkeluarga (1 untuk iya atau 0 untuk tidak) \t : ");
    keluarga = sc.nextInt();

    if (keluarga == 1 ){
            System.out.println("Masukkan Jumlah Anak di Setiap Jenjang : ");
            jumlahanak = sc.nextInt();
            System.out.println("Masukkan Jumlah Anak SD : ");
            sd = sc.nextInt();
            System.out.println("Masukkan Jumlah Anak SMP : ");
            smp = sc.nextInt();
            System.out.println("Masukkan Jumlah Anak SMA : ");
            sma = sc.nextInt();
            System.out.println("Masukkan Jumlah Anak Kuliah : ");
            kuliah = sc.nextInt();
            if ( sma = 1 && kuliah = 1 && jumlahharta >= 50000000 ){
                pajak2 = (penghasilan + jumlahharta) 10 / 100;
            }else{
                pajak1 = (penghasilan + jumlahharta) 5 / 100;
            }
            System.out.println("Pendidikan Anak : ");
            jumlahanak = sc.nextInt();

}
System.out.print("Harga Makanan \t\t : Rp ");
harga = sc.nextInt();
```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

