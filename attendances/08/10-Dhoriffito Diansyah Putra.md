Identitas Diri

Nim : [ 2141720201 ]

Nama: [Dhoriffito Diansyah Putra]

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
Scanner sc = new Scanner(System.in);

int harga, jumlahMinuman = 0, jumlahMakanan = 0, totalHargaMinuman = 2, totalHarga = 0;
    String jenisBarang, nama, banyakbarang, barangLagi, kantong ;
    
    do {
        System.out.print("Masukkan jenis barang: ");
        jenisBarang = sc.next();
        System.out.print("Masukkan nama barang: ");
        nama = sc.nextLine();
        sc.nextLine();
        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();
        
        if (jenisBarang.equalsIgnoreCase("minuman")){
            jumlahMinuman++;
        
        }else {
          jumlahMakanan++;
          totalHargaMinuman += harga;
        }
     
        
        totalHarga += harga;
        
        System.out.println("Apakah ada barang lagi? (y/t) ");
        barangLagi = sc.next();
        System.out.println(" ");
    } while (barangLagi.equalsIgnoreCase("y"));
        
        if (jumlahMinuman == 3){
            System.out.println("Anda mendapatkan diskon 5% untuk minuman yang Anda beli");
            totalHarga -= (totalHargaMinuman * 0.05);
        }
    
        System.out.println("Ingin menggunakan kantong plastik? (y/t)");
        kantong = sc.next();
        
        if (kantong.equalsIgnoreCase("y")){
            System.out.println("Harga kantong plastik + Rp.200");
            totalHarga += 200;
        }
            
        if (totalHarga >= 1000000){
            System.out.println("Anda dikenakan PPN sebesar 7%");
            totalHarga += (totalHarga*0.07);
        }
            
        System.out.println("Total biaya yang harus anda bayarkan sebesar RP." + totalHarga);
   

```
```
Masukkan jenis barang: makanan
Masukkan nama barang: rujak
Masukkan harga barang: 30000
Apakah ada barang lagi? (y/t) 
y
 
Masukkan jenis barang: minuman
Masukkan nama barang: es teh
Masukkan harga barang: 50000
Apakah ada barang lagi? (y/t) 
y
 
Masukkan jenis barang: minuman
Masukkan nama barang: jus jeruk
Masukkan harga barang: 40000
Apakah ada barang lagi? (y/t) 
y
 
Masukkan jenis barang: minuman
Masukkan nama barang: jus jambu
Masukkan harga barang: 60000
Apakah ada barang lagi? (y/t) 
t
 
Anda mendapatkan diskon 5% untuk minuman yang Anda beli
Ingin menggunakan kantong plastik? (y/t)
y
Harga kantong plastik + Rp.200
Total biaya yang harus anda bayarkan sebesar RP.178699
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

