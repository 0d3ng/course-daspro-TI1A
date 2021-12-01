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
static int faktorialRekursif(int n) {
    if (n == 0) {
        return (1) ;
    } else {
        return (n * faktorialRekursif(n - 1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n) {
    int faktor = 1;
    for (int i = n; i >= 1; i--) {
        faktor = faktor * i;
    } 
    return faktor;
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
static int faktorialRekursif(int n) {
    if (n == 0) {
        return (1) ;
    } else {
        return (n * faktorialRekursif(n - 1));
    }
}
static int faktorialIteratif(int n) {
    int faktor = 1;
    for (int i = n; i >= 1; i--) {
        faktor = faktor * i;
    } 
    return faktor;
}
System.out.println(faktorialRekursif(5));
System.out.println(faktorialIteratif(5));
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?

Jawab : Fungsi rekrusif yaitu sebuah fungsi yang didalamnya terdapat perintah untuk memanggil fungsi itu sendiri(dirinya sendiri) sampai dalam kondisi tertentu sehingga pemanggilan berhenti

2. Bagaimana contoh kasus penggunaan fungsi rekursif ?

Jawab : contohnya yaitu untuk mencari nilai faktorial dan nilai pangkat dari suatu bilangan

3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif! 

Jawab : ya, hasilnya sama. pada fungsi rekursif menggunakan struktur seleksi (IF-ELSE) dan pemanggilan fungsinya sendiri. ketika base case terpenuhi maka pengulangan akan berhenti. sedangkan pada struktur Iteratif menggunakan pengulangan dengan struktur repetisi(FOR/WHILE) dan pengulangan akan berhenti saat kondisi pengulangan bernilai false.

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
static int hitungPangkat(int x, int y) {
    if (y==0) {
        return (1);
    } else {
        return (x * hitungPangkat(x, y-1));
    }
}
Scanner sc = new Scanner(System.in);
System.out.print("Bilangan yang dihitung: ");
int bilangan = sc.nextInt();
System.out.print("Pangkat: ");
int pangkat = sc.nextInt();
System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung: 5
    Pangkat: 2
    25


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Jawab : pada pemanggilan fungsi rekursif hitungPangkat proses pemanggilan fungsi tersebut akan dijalankan sampai saat base case terpenuhi yaitu if (y==0)

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
static double hitungBunga(double saldo, int tahun) {
    if (tahun==0) {
        return (saldo);
    } else {
        return (1.11 * hitungBunga(saldo, tahun - 1));
    }
}
Scanner sc = new Scanner(System.in);
System.out.print("Jumlah saldo awal: ");
double saldoAwal = sc.nextDouble();
System.out.print("Pangkat: ");
int tahun = sc.nextInt();
System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));

```

    Jumlah saldo awal: 1500000
    Pangkat: 2
    Jumlah uang setelah 2 tahun: 1848150.0000000005


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

base case : **tahun = 0**

recursion call : **1.11 * hitungBunga(saldo, tahun - 1)**

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int a;
static int deretDescendingRekursif(int a) {
    if (a == 0) {
        return 0;
    } else {
        System.out.println(a);
        return deretDescendingRekursif(a - 1);
    }
}
static void deretDescendingIteratif(int a) {
    for (int i = a; i >= 0; i--) {
           System.out.println(i);
    } 
}
System.out.print("Masukkan bilangan : ");
a = sc.nextInt();
System.out.println("DeretDescendingRekursif: ");
DeretDescendingRekursif(a);
System.out.println("DeretDescendingIteratif: ");
DeretDescendingIteratif(a);
```

    Masukkan bilangan : 5
    DeretDescendingRekursif: 
    5
    4
    3
    2
    1
    DeretDescendingIteratif: 
    5
    4
    3
    2
    1
    0


Penjelasan :
1. pada fungsi rekursif menggunakan pengulangan dengan struktur seleksi if-else dan pemanggilan fungsi dirinya sendiri. pengulangan akan berhenti saat base case a==0 terpenuhi dan juga menggunakan keyword return untuk mengembalikan nilai output sehingga bisa diolah pada proses berikutnya 
2. pada fungsi iteratif menggunakan pengulangan dengan struktur repetisi (for). pengulangan akan berhenti saat konsisi bernilai false dan tidak menggunakan keyword return.


2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int f = 1;
int bilangan;
System.out.print("Masukkan bilangan faktorial : ");
bilangan = sc.nextInt();
static int penjumlahanRekursif(int f) { 
    if(f == bilangan) {
        return f;
    } else {
        return f + penjumlahanRekursif(f + 1);
    }
}
System.out.println(penjumlahanRekursif(f));
```

    Masukkan bilangan faktorial : 8
    36


Penjelasan : Pertama kita membuat library scanner dan deklarasi scanner, lalu membuat inputan untuk memasukkan bilangan. untuk menghitung penjumlahan bilangan fakrotial diatas menggunakan fungsi rekursif dan pengulangan dengan struktur seleksi if-else. jika f==bilangan maka akan di return kan, jika tidak maka akan dijumlahkan terus sampai base case f = bilangan terpenuhi 

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
static int CekPrimaRekursif (int a, int b){
    if( b == 1){
        return 1 ;
    } else if (a%b == 0){
        return 0 ;
    } else {
        return CekPrimaRekursif(a, b-1);
    }
}
int x = CekPrimaRekursif(7, 2);
if (x==1){
    System.out.println ("Bilangan Prima");
} else if(x==0){
    System.out.println ("Bukan merupakan Bilangan Prima");
}

```

    Bilangan Prima


Penjelasan : kode program diatas digunakan untuk mengecek apakah suatu bilangan merupakan suatu bilangan prima atau bukan dengan fungsi rekursif dan menggunakan pengulangan if-else. pertama yaitu membuat fungsi berparameter int a dan int b. lalu membuat pengulangan dan menggunakan keyword return untuk mengembalikan nilai. setelah itu membuat variabel dan kondisi dimana ketika x==1 maka outputnya bilangan prima, jika x==0 maka bilangan bukan merupakan bilangan prima

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int fibonacciRekursif ( int x ){
    if ( x==1 || x==2){
        return 1;
    }else{
        return fibonacciRekursif(x-1) + fibonacciRekursif(x-2);
    }
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan bulan : ");
int x = sc.nextInt();
System.out.print("Banyak pasangan marmut yang ada pada akhir bulan ke- " + x + " yaitu " );
System.out.println(fibonacciRekursif(x));
```

    Masukkan bulan : 12
    Banyak pasangan marmut yang ada pada akhir bulan ke- 12 yaitu 144


Penjelasan : pertama yaitu membuat fungsi static dengan nama fibonacciRekursif dengan tipedatakembalian fungsi int dan berparameter int x. lalu membuat pengulangan dengan struktur seleksi if-else. cabang if merupakan base case untuk penghentian, sedangkan else merupakan recursion call untuk menyederhanakan masalah. kemudian membuatlibrary scanner, deklarasi scanner, membuat input untuk memasukkan bukan dan banyak pasangan marmut yang ada. lalu melakukan pemanggilan dari fungsi yang telah dibuat sebelumnya
