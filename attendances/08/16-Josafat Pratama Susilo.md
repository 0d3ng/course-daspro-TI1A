Identitas Diri

Nim : 2141720031

Nama: Josafat Pratama Susilo

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
String jenis_barang, nama, isPlastik, isDone;
int harga, total = 0;
int jml_minuman = 0;
int harga_minuman = 0;

System.out.println("=======Sistem Jual Beli Toko========\n");

for(;true;){
    System.out.print("Masukkan jenis barang (makanan/minuman): ");
    jenis_barang = input.nextLine();
    
    System.out.print("Masukkan nama barang: ");
    nama = input.nextLine();
    
    System.out.print("Masukkan harga barang: ");
    harga = input.nextInt(); 
    input.nextLine();
    
    if(jenis_barang.equalsIgnoreCase("minuman")){
        harga_minuman+=harga;
        jml_minuman+=1;
    }
    
    total+=harga;
    
    System.out.print("Apakah anda sudah selesai berbelanja? (sudah/belum): ");
    isDone = input.nextLine();
    if(isDone.equalsIgnoreCase("sudah")){
        break;
    }
}
       
System.out.print("Apakah anda ingin membeli kantong plastik? (ya/tidak): ");
isPlastik = input.nextLine();

System.out.println("\nTotal Beli:\t" + total);

if(jml_minuman == 3){
    total = (total-harga_minuman)+(harga_minuman*95/100);
}

if(total >= 1000000){
    total = total * 107/100;
}

if(isPlastik.equalsIgnoreCase("ya")){
    total+=200;
}

System.out.println("Total Bayar:\t" + total);
```

    =======Sistem Jual Beli Toko========
    
    Masukkan jenis barang (makanan/minuman): makanan
    Masukkan nama barang: Indomie Goreng
    Masukkan harga barang: 1000000
    Apakah anda sudah selesai berbelanja? (sudah/belum): belum
    Masukkan jenis barang (makanan/minuman): minuman
    Masukkan nama barang: Boba Gold
    Masukkan harga barang: 300000
    Apakah anda sudah selesai berbelanja? (sudah/belum): belum
    Masukkan jenis barang (makanan/minuman): minuman
    Masukkan nama barang: Black Matcha
    Masukkan harga barang: 200000
    Apakah anda sudah selesai berbelanja? (sudah/belum): belum
    Masukkan jenis barang (makanan/minuman): minuman
    Masukkan nama barang: Apoa
    Masukkan harga barang: 500000
    Apakah anda sudah selesai berbelanja? (sudah/belum): sudah
    Apakah anda ingin membeli kantong plastik? (ya/tidak): ya
    
    Total Beli:	2000000
    Total Bayar:	2086700


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

