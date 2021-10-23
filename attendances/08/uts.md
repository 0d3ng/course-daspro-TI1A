Identitas Diri

Nim : [2141720100]

Nama: [Adinda Kurnia Rifanti]

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
        int penghasilan, nilaiJualKendaraan, nilaiJualPerhiasan;
        boolean punyaUsaha, berkeluarga, kuliah, sma;
        double penghasilanSetelahPajak, total, total5, total10; 

        System.out.println("Apakah anda memiliki usaha? (ya = true, tidak = false)");
        punyaUsaha = input.nextBoolean();

        if(punyaUsaha == true){
            System.out.println("Penghasilan pertahun : "); 
            penghasilan = input.nextInt();
            penghasilanSetelahPajak = penghasilan - (penghasilan*15/100);
            System.out.println("Penghasilan setelah dipotong pajak adalah : " + penghasilanSetelahPajak);
            System.out.println("Kendaraan yang dimiliki : ");
            String kendaraan = input.next();
            System.out.println("Nilai jual saat ini : ");
            nilaiJualKendaraan = input.nextInt();
            System.out.println("Perhiasan yang dimiliki : ");
            String perhiasan = input.next();
            System.out.println("Nilai jual saat ini : ");
            nilaiJualPerhiasan = input.nextInt();
            total = penghasilanSetelahPajak + nilaiJualKendaraan + nilaiJualPerhiasan;
            total5 = total - (total * 5/100);
            total10 = total - (total * 10/100);
            System.out.println("Apakah Anda sudah berkeluarga (ya = true, tidak = false)");
            berkeluarga = input.nextBoolean();
            if(berkeluarga == true){
                System.out.println("Jumlah anak yang kuliah (1 = true, 0 = false): ");
                kuliah = input.nextBoolean();
                if(kuliah == true){
                    System.out.println("Jumlah anak yang SMA (1 = true, 0 = false): ");
                    sma = input.nextBoolean();
                    if(sma == true){
                        System.out.println("Total harta kekayaan : " + total10);
                    }else
                    System.out.println("Total harta kekayaan : " + total5); 
                }else{
                    System.out.println("Total harta kekayaan : " + total5);
                }
            }else{
                System.out.println("Total harta kekayaan : " + total);
            }
        }else
            System.out.println("Total harta kekayaan : 0 ");
    }
}
```

    Apakah anda memiliki usaha? (ya = true, tidak = false)
    true
    Penghasilan pertahun : 
    60000000
    Penghasilan setelah dipotong pajak adalah : 5.1E7
    Kendaraan yang dimiliki : 
    mobil
    Nilai jual saat ini : 
    80000000
    Perhiasan yang dimiliki : 
    gelang
    Nilai jual saat ini : 
    3000000
    Apakah Anda sudah berkeluarga (ya = true, tidak = false)
    true
    Jumlah anak yang kuliah (1 = true, 0 = false): 
    true
    Jumlah anak yang SMA (1 = true, 0 = false): 
    false
    Total harta kekayaan : 1.273E8



    |       }

    illegal start of statement

    


Menggunakan scanner untuk menginput data yang diperlukan, dengan tipe data yang digunakan adalah int, boolean, dan double. Seluruh data dimasukkan dan diisi. Kemudian sistem akan menghitung totalnya. 

Seperti pada contoh: 
seseorang memiliki usaha, dengan penghasilan pertahun Rp. 60.000.000, hingga muncul jumlah penghasilan akhir setelah pajak 15% dan memiliki harta kekayaan berupa mobil dengan harga jual 80.000.000 dan perhiasan berupa gelang dengan harga 3.000.000. Kemudian seseorang tersebut sudah berkeluarga, dan memiiki anak yang kuliah 1, sehingga pajaknya dipotong, dan muncul total harta kekayaan. 

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

