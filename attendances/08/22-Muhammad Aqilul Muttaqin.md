Identitas Diri

Nim : 2141720182

Nama: Muhammad Aqilul Muttaqin

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
// tulis jawaban di sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String memilikiUsaha, namaHarta, anak;
int penghasilan, pajak, nilaiJual, sudahBerkeluarga, jumlahHarta, keseluruhan jumlahSetelahPajak, anak;
System.out.println("Apakah memiliki usaha 'ya' atau 'tidak'? ");
memilikiUsaha = input.nextLine();
if (memilikiUsaha.equalsIgnoreCase ("tidak")){
    System.out.print("tidak dikenai pajak");
}else if (memilikiUsaha.equalsIgnoreCase ("ya")){
    System.out.print("penghasilan 1 tahun : ");
    penghasilan = input.nextInt();
    System.out.print("Nama harta kekayaan : ");
    namaHarta = input.nextLine();
    System.out.print("Nilai jual saat ini : ");
    nilaiJual = input.nextInt();
    jumlahHarta = penghasilan + nilaiJual;
    jumlahSetelahPajak = jumlahHarta * 15/100;
    System.out.println("jumlah kekayaan setelah pajak :" + jumlahSetelahPajak);
}else{
    System.out.print("apakah sudah berkeluarga (1 jika iya, 0 jika tidak)" );
    sudahBerkeluarga = input.nextInt();
    if (sudahBerkeluarga == 0){
        System.out.print("selesai");    
    }else if (sudahBerkeluarga == 1){
        System.out.print("apakah anak anda SD/SMP/SMA/Kuliah (ya/tidak) : ");
        anak = input.nextLine();
        {
        if (anak.equalsIgnoreCase ("ya")){
            
        }
        }
    }
}



```

    Apakah memiliki usaha 'ya' atau 'tidak'? 
    tidak
    tidak dikenai pajak

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

