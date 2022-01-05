Identitas Diri

Nim : 2141720004

Nama: Alya Marliza Koesnanto

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
String status, statusSekolah, hartaKekayaan;
int jmlhPenghasilan, jmlhTangunggan, biayaHidup, nilaiJual;
int jmlhPajak;
double pajak = 0;

System.out.print("Masukkan Status: ");
status = input.nextLine();
System.out.print("Masukkan Penghasilan: ");
jmlhPenghasilan = input.nextInt();

if(status.equalsIgnoreCase ("pengusaha")){ 
    if(jmlhPenghasilan <= 50000000){ 
        pajak = 0.10;
    } else if (jmlhPenghasilan<= 100000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.20;
    }
    jmlhPajak = (int)(jmlhPenghasilan - (jmlhPenghasilan * pajak));
    System.out.println ("Total pajak yang wajib dibayar " + jmlhPajak);
    
} else if(status.equalsIgnoreCase ("pekerja")){ 
    if(jmlhPenghasilan <= 25000000){ 
        pajak = 0.10;
    } else if (jmlhPenghasilan <= 50000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.20;
    }
    jmlhPajak = (int)(jmlhPenghasilan - (jmlhPenghasilan * pajak));
    System.out.println ("Total pajak yang wajib dibayar: " + jmlhPajak);
    
} else {
    System.out.println ("Status yang anda masukkan salah");
}
System.out.print("Masukkan Harta Kekayaan: ");
hartaKekayaan = input.nextLine();
System.out.print("Masukkan Nilai Jual: ");
nilaiJual = input.nextInt();
if(hartaKekayaan.equalsIgnoreCase ("Mobil")){ 
    if(nilaiJual <= 100000000 ){ 
        pajak = 0.10;
    } else if (jmlhPenghasilan<= 1000000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.20;
    }
    jmlhPajak = (int)(hartaKekayaan - (hartaKekayaan * pajak));
    System.out.println ("Total pajak yang wajib dibayar " + jmlhPajak);

} else if(hartaKekayaan.equalsIgnoreCase ("Sepeda Motor")){ 
    if(nilaiJual <= 25000000){ 
        pajak = 0.10;
    } else if (jmlhPenghasilan <= 50000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.20;
    }
    jmlhPajak = (int)(hartaKekayaan - (hartaKekayaan * pajak));
    System.out.println ("Total pajak yang wajib dibayar " + jmlhPajak);
    
} else {
    System.out.println ("Harta Kekayaan yang anda masukkan salah");
}

System.out.print("Apa status sekolah anda saat ini ? ");
statusSekolah = input.nextLine();
    if (statusSekolah.equalsIgnoreCase (Kuliah)){
        if(jmlhPenghasilan <= 100000000 ){ 
        pajak = 0.10;
    } else if (jmlhPenghasilan<= 1000000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.20;
    }
        System.out.print("Berapa penghasilan ortu saat ini ?");
        jmlhPenghasilan = input.next.Int();
        System.out.print("Masukkan Jumlah Tanggungan: ");
        jmlhTanggungan = input.nextInt();
        biayaHidup = jmlhPenghasilan / jmlhTanggungan;
        jmlhPajak = biayaHidup * pajak
}
```

    Masukkan Status: Pengusaha
    Masukkan Penghasilan: 100000000
    Total pajak yang wajib dibayar 85000000
    Masukkan Harta Kekayaan: Masukkan Nilai Jual: Mobil



    ---------------------------------------------------------------------------

    java.util.InputMismatchException: null

    	at java.base/java.util.Scanner.throwFor(Scanner.java:943)

    	at java.base/java.util.Scanner.next(Scanner.java:1598)

    	at java.base/java.util.Scanner.nextInt(Scanner.java:2263)

    	at java.base/java.util.Scanner.nextInt(Scanner.java:2217)

    	at .(#41:1)


> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

