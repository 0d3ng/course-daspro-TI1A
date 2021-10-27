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


```python


```

2.	Seorang yang akan membayar pajak perlu dihitung semua harta kekayaan atau penghasilan. Kriteria yang dapat dihitung adalah sebagai berikut
    + Sebelum dihitung, wajib pajak ditanya terlebih dahulu apakah memiliki usaha atau tidak. Ketika memiliki usaha, maka perlu diinputkan penghasilan dalam 1 tahun berapa? Kemudian dikenai pajak sebesar 15%
    + Terdapat inputan harta kekayaan yang perlu dinputkan, dengan setiap wajib pajak memiliki harta kekayaan yang berbeda-beda.
    + Harta kekayaan berupa, benda bergerak(kendaraan,dll) ataupun kekayaan yang tidak bergerak(perhiasan, tanah, surat berharga, dll). Silakan diinputkan nama kendaraan ataupun perhiasaannya beserta nilai jual saat ini.
    + Jika wajib pajak sudah berkeluarga, maka perlu ditanyakan tingkat pendidikan(SD,SMP,SMA,KULIAH). Ketika jumlah yang kuliah anaknya 1 dan 1 SMA dan total harta kekayaan lebih dari sama dengan 50 juta maka akan dipotong semua pajaknya 10%. Sedangkan tidak ada yang SMA ataupun KULIAH dan total harta kekayaan kurang dari 50 juta maka akan dipotong 5%.


```python
import java.util.Scanner;
public class tokowarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int penghasilan, hargajualKendaraan, hargajualPerhiasan, totalhartaKekayaan=0;
        double pajak, penghasilansetelahPajak;
        int usaha, berkeluarga, kuliah, sma;
        String kendaraan, perhiasan;

        System.out.print("Apakah anda memiliki usaha? ( 0 = tidak, 1 = ya) ? ");
        usaha = sc.nextInt();

        if(usaha==1){
            System.out.print("Berapa penghasilan anda dalam satu tahun?: ");
            penghasilan = sc.nextInt();
            sc.nextLine();
            penghasilansetelahPajak = penghasilan - (penghasilan*0.15);
            System.out.println("Penghasilan anda setelah dikenakan pajak: " + penghasilansetelahPajak);
            System.out.print("Kendaraan yang dimiliki: ");
            kendaraan = sc.nextLine();
            System.out.print("Harga jual sekarang: ");
            hargajualPerhiasan = sc.nextInt();
            sc.nextLine();
            System.out.print("Perhiasan yang dimiliki: ");
            perhiasan = sc.nextLine();
            System.out.print("Harga jual sekarang: ");
            hargajualKendaraan = sc.nextInt();
            sc.nextLine();
            System.out.println("Apakah anda sudah berkeluarga? ( 0 = tidak, 1 = ya) ? ");
            berkeluarga = sc.nextInt();
            if(berkeluarga==1){
                System.out.println("Jumlah anak yang kuliah: (0 = tidak, 1 = ya) ");
                kuliah = sc.nextInt();
                if(kuliah==1){
                    System.out.println("Jumlah anak yang masih SMA: (0 = tidak, 1 = ya) ");
                    sma = sc.nextInt();
                    totalhartaKekayaan= (int)penghasilansetelahPajak + hargajualKendaraan + hargajualPerhiasan;
                    System.out.println("Total harta kekayaan: " + totalhartaKekayaan);
                }else{
                    System.out.println("Total harta kekayaan: 0");
                }
            }
        }
    }
}
```

> **Kerjakan secara individu, segala bentuk yang mengarah kepada kecurangan akan mendapatkan nilai 0.**
>
> Selamat mengerjakan :)

