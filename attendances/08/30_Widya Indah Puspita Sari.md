Identitas Diri

Nim : 2141720034

Nama: Widya Indah Puspita Sari

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


```python
// tulis jawaban di sini
import java.uti.Scanner
```

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```python
// tulis jawaban di sini
Scanner sc= new Scanner(System.in);
        String pilihan;
        int penghasilanSetahun;
        int jenisKekayaaan;
        int namaKekayaan;
        int nilaiJual;
        int kekayaanBergerak = 0;
        double pajakSetahun;
        int kekayaanTdkBergerak = 0;
        int totalKekayaan;
        boolean sudahBerkeluarga;
        String tingkatPendidikan;
        int jumlahSd = 0;
        int jumlahSmp = 0;
        int jumlahSma = 0;
        int jumlahKuliah = 0;
        
        
        System.out.println("Apakah Anda Pengusaha? (Y/N) : ");
        pilihan = sc.nextLine();
        
        if(pilihan.equalsIgnoreCase("Y")){
            System.out.println("Masukkan Penghasilan 1 Tahun : ");
            penghasilanSetahun = sc.nextInt();
            System.out.println("");
            pajakSetahun = penghasilanSetahun * 0.15;
        }
        
        boolean inputLagi = true;
        
        do {
            System.out.println("Masukkan Jenis Kekayaan Anda (0 = bergerak, 1= tidak bergerak");
            jenisKekayaaan = sc.nextInt();
            System.out.println("Masukkan Kekayaan Anda : ");
            namaKekayaan = sc.nextInt();
            System.out.println("Masukkan Nilai Jual Kekayaan : ");
            nilaiJual = sc.nextInt();


            totalKekayaan += nilaiJual;

            System.out.println("Apakah Ada Kekayaan lagi? (Y/N) : ");
            inputLagi = sc.next().equalsIgnoreCase("Y"); 
                
            }while (inputLagi);
        System.out.println("Apakah Anda sudah berkeluarga? (Y/N) : ");
        boolean sudahKeluarga = 
        }

```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

