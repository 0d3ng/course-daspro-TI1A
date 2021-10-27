Identitas Diri

Nim : 2141720208

Nama: Mukhammad Nuril Haidar

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

```


```Java
// tulis jawaban di sini
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
char usaha, keluarga, kuliah, sma;
double pajak, penghasilan, harta, harga_hartagerak, harga_hartatdkgerak, potong, totalPotong, total;
String hartagerak,hartatdkgerak;

System.out.print("Apakah anda memiliki usaha (y/n) ? ");
usaha = scan.next().charAt(0);

if(usaha == 'y'){
    System.out.print("Masukkan Penghasilan Anda Selama 1 Tahun : ");
    penghasilan = scan.nextDouble();
    pajak = 0.15 * penghasilan;
}

System.out.print("Apakah anda memiliki harta bergerak dan tidak bergerak (y/n) ? ");
char status = scan.next().charAt(0);

if(status == 'y'){
    System.out.print("Masukkan Harta Harta Benda Bergerak (Mobil, Sepeda Motor, dll): ");
    hartagerak = scan.nextLine();
    scan.nextLine();
    System.out.print("Masukkan Nilai Jual Harta Bergerak : ");
    harga_hartagerak = scan.nextDouble();
    System.out.print("Masukkan Harta Harta Benda Tidak Bergerak (Perhiasan, Tanah, Surat Berharga, dll): ");
    hartatdkgerak = scan.nextLine();
    scan.nextLine();
    System.out.print("Masukkan Nilai Jual Harta Bergerak : ");
    harga_hartatdkgerak = scan.nextDouble();
    
}

double totalharta = harga_hartagerak + harga_hartatdkgerak;
total = penghasilan + harga_hartagerak + harga_hartatdkgerak;

System.out.print("Apakah Anda Sudah Berkeluarga (y/n) ?");
keluarga = scan.next().charAt(0);

if(keluarga == 'y'){
    System.out.print("Apakah ada yang berkuliah (y/n) ?");
    kuliah = scan.next().charAt(0);
    System.out.print("Apakah ada yang SMA (y/n) ?");
    sma = scan.next().charAt(0);
    
    if(kuliah == 'y' && sma == 'y'){
        if(totalharta >= 50000000){
            potong = 0.1 * pajak;
            totalPotong = pajak - potong;
        } else {
            potong = 0.5 * pajak;
            totalPotong = pajak - potong;
        }
        System.out.printf("Total Harta Kekayaan Anda : %.2f\n", total);
        System.out.println("Pajak Yang Harus di Bayarkan : " + totalPotong);
    }
} else {
    System.out.printf("Total Harta Kekayaan Anda : %.2f\n", total);
    System.out.println("Pajak Yang Harus di Bayarkan : " + pajak);
}

```

    Apakah anda memiliki usaha (y/n) ? y
    Masukkan Penghasilan Anda Selama 1 Tahun : 1000000
    Apakah anda memiliki harta bergerak dan tidak bergerak (y/n) ? y
    Masukkan Harta Harta Benda Bergerak (Mobil, Sepeda Motor, dll): Mobil
    Masukkan Nilai Jual Harta Bergerak : 60000000
    Masukkan Harta Harta Benda Tidak Bergerak (Perhiasan, Tanah, Surat Berharga, dll): Tanah
    Masukkan Nilai Jual Harta Bergerak : 10000000
    Apakah Anda Sudah Berkeluarga (y/n) ?y
    Apakah ada yang berkuliah (y/n) ?y
    Apakah ada yang SMA (y/n) ?y
    Total Harta Kekayaan Anda : 71000000.00
    Pajak Yang Harus di Bayarkan : 135000.0
    

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

