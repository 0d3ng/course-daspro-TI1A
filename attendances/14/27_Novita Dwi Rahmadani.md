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
// Tuliskan kode program Percobaan 1 Langkah 
static int faktorialRekursif(int n){
    if(n == 0){
        return(1);
    }else{
        return(n* faktorialRekursif(n - 1));
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
        faktor = faktor*i;
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


Jawab:
1. Fungsi Rekusif yaitu fungsi yang memanggil dirinya sendiri sampai kondisi tertentu(dalam kondisi yang sudah tidak terpenuhi).Proses pemanggilannya akan terjadi berulang-ulang.
2. Beberapa kasus lebih mudah menggunakan fungsi rekursif, contohnya: pangkat, factorial, dan beberapa proses deret lainnya. 
3. Hasil keduanya sama,yaitu 120.Namun alur jalannya program antara fungsi rekursif dan iteratif tentu saja berbeda.
Perbedaan tersebut dapat dilihat pada fungsi rekursif pengulangannya dengan struktur seleksi if-else dan pengulangannya akan berhenti jika base case (n == 0) terpenuhi sedangkan pada s=fungsi iteratif pengulangannya menggunakan for dan pengulangannya berhenti saat kondisi pengulangan bernilai false.

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
static int hitungPangkat(int x, int y){
    if(y==0){
        return(1);
    }else{
        return(x * hitungPangkat(x, y - 1));
    }
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bil,pangkat;
System.out.print("Bilangan yg dihitung : ");
bil = sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bil,pangkat));
```

    Bilangan yg dihitung : 2
    Pangkat: 3
    8
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!


```Java
Jawab :
proses pemanggilan fungsi tersebut akan berhenti jika dalam kondisi saat base case nya(nilai ambang batas) terpenuhi.
basecase pada alur program diatas yaitu jika y==0 maka akan return 1
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
static double hitungBunga(double saldo,int tahun){
    if(tahun == 0) {
        return(saldo);
    }else{
        return(1.11* hitungBunga(saldo,tahun - 1));
    }
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double saldoAwal;
int tahun;
System.out.print("Jumlah saldo awal : ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung(tahun) : ");
tahun = sc.nextInt();

System.out.print("Jumlah uang setelah " + tahun + "tahun : ");
System.out.println(hitungBunga(saldoAwal,tahun));

```

    Jumlah saldo awal : 200000
    Lamanya menabung(tahun) : 2
    Jumlah uang setelah 2tahun : 246420.00000000006
    

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

jawab :
base case : if (tahun == 0)
recirsion : return(saldo)
return(1.11* hitungBunga(saldo,tahun - 1));

Base case : if(tahun==0)
Recursion Call : return(1.11* hitungBunga(saldo,tahun-1) 

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
//fungsi Rekursif
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan angka :");
int bil = sc.nextInt();
static int deretDescendingRekursif(int bil){
    System.out.print(bil + " ");
    if(bil == 0){
        return (0);
    }else{
     return (deretDescendingRekursif(bil -1)); 
    }
}
static void deretDescendingIteratif(int bil) {
    for (int i = bil; i >= 0; i--) {
           System.out.println(i);
    } 
}
System.out.println("Masukkan bilangan Rekursif : ");
deretDescendingRekursif(bil);
System.out.println("\n Masukkan bilangan Iteratif : ");
deretDescendingRekursif(bil);
```

    Masukkan angka :5
    Masukkan bilangan Rekursif : 
    5 4 3 2 1 0 
     Masukkan bilangan Iteratif : 
    5 4 3 2 1 0 




    0



Penjelasan :
-Pada fungsi rekursif menggunakan struktur pengulangan seleksi (if-else) dengan pemanggilan fungsi dirinya sendiri.dimana perulangan akan berhenti saat base case terpenuhi dan pengulangan tdk akan berhenti jika base case nya tidak terpenuhi.seperti pada code program diatas terdapat kondisi basecase jika bilangan samadengan 0 maka sudah terpenuhi atau telah mencapai ambang batas,sedangkan tidak terpenuhi maka akan recursion call atau mengulang kembali.

-Pada fungsi Iteratif menggunakan struktur pengulangan repetisi (for/while) dimana pengulangan akan berhenti jika kondisi pengulangan bernilai false.

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

    Bilangan yang dihitung: 20
    Jumlah bilangan dari 1 sampai 20 adalah 210
    

Penjelasan :
Pertama-tama saya menngunakan librarry scanner untuk mencetak/menampilkan sebuah nilai yang diinputkan dari keyboard.
kemudian memberikan nama fungsi penjumlahanRekursif dgn parameter x yg bertipedata integer,lalu terdapat sebuah basecase atau kondisi dimana nilai ambang batas x samadengan 0 maka kondisi akan terpenuhi jika tidak maka akan dijumlahkan terus sampai base case x = bilangan terpenuhi.

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan bilangan yang ingin dicek: ");
int bilPrima = sc.nextInt();
static int CekPrimaRekursif(int n, int indeks){
    if(indeks == 1){
        return 1;
    } else if (n % indeks == 0){
            return 1 + CekPrimaRekursif(n, --indeks);
    } else {
            return 0 + CekPrimaRekursif(n, --indeks);
    }
}
 
public static boolean CekBilanganPrima(int bil){
        if (bil > 1){
            return (CekPrimaRekursif(bil, bil) == 2);
        } else {
            return false;
    }
}
Scanner sc = new Scanner(System.in);

if(CekBilanganPrima(bilPrima)){
    System.out.println("Bilangan Prima");
} else {
    System.out.println("Bukan Bilangan Prima");
}
```

    Masukkan bilangan yang ingin dicek: 6
    Bukan Bilangan Prima
    

Penjelasan :
program diatas digunakan untuk menyeleksi nilai apakah nilai tsb termasuk dalam bilangan prima atau bukan.fungsi tersebut akan diulang selama 2 pernyataan diatasnya salah. Jika pada fungsi CekPrimaRekursif menghasilkan false, maka akan menghasilkan output bukan bilangan prima, namun jika tidak, maka akan menghasilkan output bukan bilangan prima.

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
static int MarmutRekursif(int a){
    if (a <= 1){
        return(a);
    } else {
        return(MarmutRekursif(a - 1) + MarmutRekursif(a - 2));
    }
}
System.out.print("Bulan Keberapa Yang Ingin Anda Lihat? : ");
int bln = sc.nextInt();
System.out.print("Total Pasangan Marmut Pada Bulan " + bln + " Adalah " + MarmutRekursif(bln) + " Ekor");
```

    Bulan Keberapa Yang Ingin Anda Lihat? : 4
    Total Pasangan Marmut Pada Bulan 4 Adalah 3 Ekor

Penjelasan : 
saya memberi nama fungsi marmutrekursig dengan parameter a bertipedata integer lalu terdapata sebuah basecase atau nilai ambang batas dimana hika a lebih kecilsamadengan 1 maka kondisi akan terpenuhi jika tidak maka akan dijumlahkan terus sampai base case a = bilangan terpenuhi.kemudian membuat input untuk memasukkan bulan keberapa yng ingin kita lihat dan banyak pasangan marmut yang ada. lalu melakukan pemanggilan dari fungsi yang telah dibuat sebelumnya
