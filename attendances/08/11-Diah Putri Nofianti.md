Identitas Diri

Nim : 2141720054

Nama: Diah Putri Nofianti

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
Scanner input = new Scanner(System.in);

String usaha;
int pajak, penghasilan;

System.out.print("Apakah Anda memiliki usaha? (y/n) ");
usaha = input.nextLine();
   
    if (usaha.equalsIgnoreCase ("y")){
        System.out.print("Masukkan penghasilan per tahun: Rp ");
        penghasilan = input.nextInt();
        input.nextLine();
        
        pajak=penghasilan*15/100;
        penghasilan-=pajak;    
        
         System.out.println("\nPenghasilan setelah terkena pajak usaha Rp"+penghasilan);
  
} else {
    System.out.println("\nAnda tidak ada pajak usaha");
}

String nama;
int nilai;

System.out.print("\nMasukkan jumlah harta kekayaan Anda yang akan didata : ");
    int a=input.nextInt();
    input.nextLine();

do
{


    System.out.print("\nMasukkan nama jenis harta kekayaan Anda : ");
    nama=input.nextLine();
    
    System.out.print("Masukkan nilai jual harta kekayaan Anda  : ");
    nilai=input.nextInt();
    input.nextLine();
    
    System.out.print("\nIsi 1 untuk menyudahi");
    int kaya=nilai*a;
    if(nilai==1) break;
}
while(true);

int kaya=nilai*a;
System.out.print("\ntotal harta kekayaan Anda Rp "+kaya);

System.out.print("\nApakah Anda sudah berkeluarga? (y/n) ");
String keluarga = input.nextLine(); 

    if (keluarga.equalsIgnoreCase ("y")){
        System.out.print("\nMasukkan jumlah anak Anda ");
        int jml = input.nextInt();
        input.nextLine();
          
        System.out.print("\nMasukkan tingkat pendidikan anak Anda yang pertama (SD,SMP,SMA,KULIAH) : ");
        String sekolah = input.nextLine();  
}
```

    Apakah Anda memiliki usaha? (y/n) y
    Masukkan penghasilan per tahun: Rp 1000000
    
    Penghasilan setelah terkena pajak usaha Rp850000
    
    Masukkan jumlah harta kekayaan Anda yang akan didata : 2
    
    Masukkan nama jenis harta kekayaan Anda : motor
    Masukkan nilai jual harta kekayaan Anda  : 20000
    
    Isi 1 untuk menyudahi
    Masukkan nama jenis harta kekayaan Anda : EMAS
    Masukkan nilai jual harta kekayaan Anda  : 6000000
    
    Isi 1 untuk menyudahi
    Masukkan nama jenis harta kekayaan Anda : 1
    Masukkan nilai jual harta kekayaan Anda  : 1
    
    Isi 1 untuk menyudahi
    total harta kekayaan Anda Rp 2
    Apakah Anda sudah berkeluarga? (y/n) y
    
    Masukkan jumlah anak Anda 3
    
    Masukkan tingkat pendidikan anak Anda yang pertama (SD,SMP,SMA,KULIAH) : Kuliah


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

