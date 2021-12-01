# JOBSHEET 14. Fungsi 2

## Tujuan
* Mahasiswa memahami konsep fungsi rekursif
* Mahasiswa mampu mengimplementasikan fungsi rekursif dalam kode program



## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung nilai faktorial dari suatu bilangan dengan menggunakan fungsi rekursif. Selain itu, akan dibuat juga fungsi untuk menghitung nilai faktorial dengan menggunakan algoritma iteratif sebagai pembandingnya

1. Buat fungsi static dengan nama **faktorialRekursif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya

    ![Gambar 1](images/code14-1.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
static int faktorialRekursif(int n){
    if (n == 0){
        return (1);
    } else {
        return (n * faktorialRekursif(n-1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n){
    int faktor = 1;
    for (int i = n; i >= 1; i--){
        faktor = faktor * i;
    }
    return faktor;
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
System.out.println(faktorialRekursif(5));
System.out.println(faktorialIteratif(5));
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!



```Java
//Jawaban
1. Fungsi Rekursif adalah sebuah fungsi yang berfungi melakukan perulangan/proses dengan cara memangil fungsi tersebut secara berulang ulang
2. Contohnya yaitu meghitung bilangan faktorial
3. Iya, perbedaan alur jalannya yaitu jika rekursif melakukan perulangan/proses dengan cara memanggil fungsi tersebut secara berulang ulang, namun jika fungsi iteratif dengan cara melakukan perulangan/ proses di dalam fungsi tersebut tanpa memanggil fungsi tersebut secara berulang ulang
```

### Percobaan 2
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung pangkat sebuah bilangan dengan menggunakan fungsi rekursif.

1. Buat fungsi static dengan nama **hitungPangkat()**, dengan tipe data kembalian fungsi int dan memiliki 2 parameter dengan tipe data int berupa bilangan yang akan dihitung pangkatnya dan bilangan pangkatnya

    ![Gambar 5](images/code14-5.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah dua buah variabel bertipe int dengan nama bilangan dan pangkat
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

    ![Gambar 6](images/code14-6.png)

5. Lakukan pemanggilan fungsi hitungPangkat yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 7](images/code14-7.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 - 5
import java.util.Scanner;
static int hitungPangkat(int x, int y){
    if (y == 0){
        return(1);
    } else {
        return(x * hitungPangkat(x, y - 1));
    }
}
Scanner sc = new Scanner(System.in);
System.out.print("Bilangan yang dihitung: ");
int bilangan = sc.nextInt();
System.out.print("Pangkat: ");
int pangkat = sc.nextInt();
System.out.println(hitungPangkat(bilangan, pangkat));
```

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!


```Java
//Jawaban
1. Sampai bilangan y/bilangan pada fungsi tersebut mencapai 0, atau bisa juga disebut sampai mencapai fungsi hitungPangkat(bilangan, 0).
```

### Percobaan 3
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung jumlah uang nasabah yang disimpan di Bank setelah mendapatkan bunga selama beberapa tahun dengan menggunakan fungsi rekursif. 

1. Buat fungsi static dengan nama **hitungBunga()**, dengan tipe data kembalian fungsi double dan memiliki 2 parameter dengan tipe  data int berupa saldo nasabah dan lamanya menabung. Pada kasus ini dianggap bunga yang ditentukan oleh bank adalah 11% per tahun. Karena perhitungan bunga adalah bunga * saldo, sehingga untuk menghitung besarnya uang setelah ditambah bunga adalah saldo + bunga * saldo. Dalam hal ini, besarnya bunga adalah 0.11 * saldo, dan saldo dianggap 1 * saldo, sehingga 1 * saldo + 0.11 * saldo dapat diringkas menjadi 1.11 * saldo untuk perhitungan saldo setelah ditambah bunga (dalam setahun).

    ![Gambar 8](images/code14-8.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah sebuah variabel bertipa double dengan nama saldoAwal dan sebuah variabel bertipe int bernama tahun
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

 ![Gambar 9](images/code14-9.png)

5. Lakukan pemanggilan fungsi hitungBunga yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 10](images/code14-10.png)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1 - 5
static double hitungBunga(double saldo, int tahun){
if (tahun == 0){
return (saldo);
} else {
return (1.11 * hitungBunga(saldo, tahun - 1));
}
}
System.out.print("Jumlah Saldo Awal: ");
int saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun): ");
int tahun = sc.nextInt();
System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah Saldo Awal: 100000000
    Lamanya menabung (tahun): 5
    Jumlah uang setelah 5 tahun: 1.685058155100001E8


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!


```Java
//Base Case
if (tahun == 0){
return (saldo);
}
```


```Java
//Recursion Call
else {
return (1.11 * hitungBunga(saldo, tahun - 1));
}
```

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Bilangan: ");
int bil = input.nextInt();
static int DeretDescendingRekursif(int x){
    System.out.print(x + "  ");
    if (x == 0){
        return(0);
    } else {
        return(DeretDescendingRekursif(x - 1));
    }
}
static void DeretDescendingIteratif(int y){
    for(int i = y; i >= 0; i--){
        System.out.print(i + "  ");
    }
}
System.out.println("Rekursif: ");
DeretDescendingRekursif(bil);
System.out.println("\n\nIteratif: ");
DeretDescendingIteratif(bil);
```

    Masukkan Bilangan: 34
    Rekursif: 
    34  33  32  31  30  29  28  27  26  25  24  23  22  21  20  19  18  17  16  15  14  13  12  11  10  9  8  7  6  5  4  3  2  1  0  
    
    Iteratif: 
    34  33  32  31  30  29  28  27  26  25  24  23  22  21  20  19  18  17  16  15  14  13  12  11  10  9  8  7  6  5  4  3  2  1  0  

Penjelasan: Pertama tama, user diminta untuk memasukkan bilangan. Kemudian pada fungsi rekursif akan mencetak bilangan tersebut, lalu memanggil dirinya sendiri yang nilainya sudah dikurangi 1, begitu berulang sampai nilai pada fungsi mencapai 0. Pada fungsi iteratif melakukan looping yang dimulai dari nilai yang dimasukkan tadi sampai nilai tersebut mencapai 0. Lalu kedua hasil tersebut diberi output untuk menampilkan kedua bialngan tersebut.

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
import java.util.Scanner;
static int PenjumlahanRekursif(int x){
    if (x == 0){
        return(0);
    } else {
        return(x + PenjumlahanRekursif(x - 1));
    }
}
Scanner sc = new Scanner(System.in);
System.out.print("Bilangan yang dihitung: ");
int bilangan = sc.nextInt();
System.out.print("Jumlah bilangan dari 1 sampai " + bilangan + " adalah ");
System.out.println(PenjumlahanRekursif(bilangan));
```

    Bilangan yang dihitung: 4
    Jumlah bilangan dari 1 sampai 4 adalah 10


Penjelasan: Pertama, user diminta menginputkan sebuah bilangan, lalu menggunakan perulangan rekursif untuk menghitungnya dengan x + PenjumlahanRekursif(x - 1), berikut diulang ulang sampai x mencapai 0 lalu x akan ditambah 0. ilustrasinya seperti ini : x + ..... + 1 + 0. lalu bilangan tersebut akan dijumlah dan akan mencetak hasil dari penjumlahan tersebut melalui system.out.print

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
static int NilaiRekursif(int x, int y) {
        if (y == 1){
            return (1);
        } else if (x % y == 0){
            return (1 + NilaiRekursif(x, --y));
        } else {
          return (0 + NilaiRekursif(x, --y));
}
    }
 
    public static boolean CekPrimaRekursif(int z) {
        if (z > 1){
            return (NilaiRekursif(z, z) == 2);
        } else {
            return (false);
    }
    }
 System.out.print("Masukkan Bilangan Yang Akan Dicek: ");
int prima = input.nextInt();

        if (CekPrimaRekursif(prima)){
            System.out.println("Bilangan " + prima + " Merupakan Bilangan Prima");
        } else {
            System.out.println("Bilangan " + prima + " Bukan Bilangan Prima");
        }
```

    Masukkan Bilangan Yang Akan Dicek: 10
    Bilangan 10 Bukan Bilangan Prima


Penjelasan: Pertama-tama user diminta menginputkan sebuah bilangan yang akan dicek apakah bilangan tersebut prima atau bukan. Kemudian nilai tersebut akan diolah di dalam fungsi pertama. Pada fungsi pertama menyeleksi lagi bilangan tersebut. jika bilangan z atau bilangan yang diinputkan lebih dari 1, maka NilaiRekursif adalah sama dengan 2, setelah itu akan diproses di fungsi sebelumnya, namun jika tidak, maka hasilnya bukan bilangan prima. Lalu menuju fungsi selanjutnya. Fungsi selanjutnya mengecek jika bilangan tersebut sama dengan 1, maka fungsi tersebut akan selesai. Jika bilangan tersebut dibagi dengan y sisa 0, maka akan looping dengan formula 1 + NIlaiRekursif(x, --y), dan looping tersebut akan diulang terus sampai x jika dibagi y tidak menyisakan 0. Lalu selain itu akan menghasilkan formula 0 + NilaiRekursif(x, --y), fungsi tersebut akan diulang selama 2 pernyataan diatasnya salah. Jika pada fungsi CekPrimaRekursif menghasilkan false, maka akan menghasilkan output bukan bilangan prima, namun jika tidak, maka akan menghasilkan output bukan bilangan prima.  

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
Scanner input = new Scanner(System.in);
static int MarmutRekursif(int x){
    if (x <= 1){
        return(x);
    } else {
        return(MarmutRekursif(x - 1) + MarmutRekursif(x - 2));
    }
}
System.out.print("Bulan Keberapa Yang Ingin Anda Lihat? : ");
int bulan = input.nextInt();
System.out.print("Total Pasangan Marmut Pada Bulan " + bulan + " Adalah " + MarmutRekursif(bulan) + " Ekor");
```

    Bulan Keberapa Yang Ingin Anda Lihat? : 3
    Total Pasangan Marmut Pada Bulan 3 Adalah 2 Ekor

Penjelasan: 
Pada Fungsi tersebut pertama tama user diminta memasukkan sebuah angka yang mengindikasi bulan berapa yang akan dihitung, setara dengan baris keberapa dalam deret fibonacci. lalu angka tersebut akan diseleksi dengan fungsi rekursif. Fungsi rekursif akan tetap berjalan selama x atau baris dalam deret fibonacci tidak mencapai 1 atau 0. Fungsi tersebut berjalan dengan cara mengurangi bilangan pada fungsi MarmutRekursif(x - 1) ditambah dengan MarmutRekursif(x - 2), lalu fungsi tersebut akan dilakukan perulangan sampai dengan kriteria yang telah dijalskan, yaitu x mencapai 1 atau 0.

