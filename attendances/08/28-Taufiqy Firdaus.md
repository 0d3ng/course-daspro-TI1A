Identitas Diri

Nim : [ 2141720124 ]

Nama: [ Taufiqy Firdaus Jatu ]

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
```

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```python
import java.util.Scanner;
Scanner in = new Scanner(System.in);
        String usaha,keluarga,harta,tingkatPendidikan;
        int nilaiJual,penghasilan,anak,totalKekayaan,bayar;
        double pajak = 0;

        System.out.print("Apakah anda memiliki usaha? (y/n) : ");
        usaha = in.nextLine();

        if(usaha.equalsIgnoreCase ("y")){
            System.out.print("Masukkan penghasilan 1 tahun : ");
            penghasilan = in.nextInt();
            System.out.print("Masukkan harta kekayaan : ");
            in.nextLine();
            harta = in.nextLine();
            System.out.print("Masukkan total jual : ");
            nilaiJual = in.nextInt();
            System.out.print("Apakah anda sudah berkeluarga? (y/n) : ");
            in.nextLine();
            keluarga = in.nextLine();
            if(keluarga.equalsIgnoreCase ("y")){
                System.out.print("Jumlah anak : ");
                anak = in.nextInt();
                System.out.print("Tingkat pendidikan : ");
                
                tingkatPendidikan = in.nextLine();
                if(anak == 1 && tingkatPendidikan.equalsIgnoreCase ("SMA") && nilaiJual >= 50000000){
                    totalKekayaan = penghasilan + nilaiJual;
                    bayar = (int) (totalKekayaan * 0.05);
                    System.out.println("bayar pajak = " + bayar);
                } else if(anak == 1 && tingkatPendidikan.equalsIgnoreCase ("kuliah") && nilaiJual >= 50000000){
                    totalKekayaan = penghasilan + nilaiJual;
                    bayar = (int) (totalKekayaan * 0.05);
                    System.out.println("bayar pajak = " + bayar);
                } else if(anak >= 1 && nilaiJual <= 50000000){
                    totalKekayaan = penghasilan + nilaiJual;
                    bayar = (int) (totalKekayaan * 0.10);
                    System.out.println("bayar pajak = " + bayar);
                } 
            } else if(keluarga.equalsIgnoreCase ("n")){
                totalKekayaan = penghasilan + nilaiJual;
                bayar = (int) (totalKekayaan * 0.15);
                System.out.println("bayar pajak = " + bayar);
            }
        } else if(usaha.equalsIgnoreCase ("n")){
            System.out.print("Masukkan harta kekayaan : ");
            harta = in.nextLine();
            System.out.print("Masukkan total jual : ");
            nilaiJual = in.nextInt();
            totalKekayaan = nilaiJual;
            bayar = (int) (totalKekayaan * 0.15);
            System.out.println("bayar pajak = " + bayar);
        }
```


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

