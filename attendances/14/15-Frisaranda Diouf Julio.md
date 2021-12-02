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
static int faktorialRekursif(int n){
    if (n == 0){
        return (1);
    } else {
        return (n * faktorialRekursif(n - 1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
static int faktorialIteratif(int n){
    int faktor = 1;
    for(int i = n; i >= 1; i--){
        faktor = faktor * i;
    }
    return faktor;
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
System.out.println(faktorialRekursif(5));
System.out.println(faktorialIteratif(5));
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

> Penjelasan Percobaan 1 : Kode program di atas menggunakan fungsi rekursif dan iteratif untuk menghitung nilai faktorial suatu bilangan. Pada fungsi rekursif, ketika nilainya 0 nilai akan di-return dan nilai tersebut akan masuk ke operasi perkalian. Terakhir, hasilnya akan dicetak.

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!


> #### Jawaban
> 1. Fungsi rekursif adalah sebuah fungsi yang dapat memanggil fungsi itu sendiri, sehingga cara kerjanya mirip seperti perulangan.
> 2. Fungsi rekursif dapat digunakan untuk menghitung nilai faktorial sebuah bilangan, menjumlahkan bilangan berurutan, dan menggunakan rumus fibonacci.
> 3. Iya, hasilnya sama. Pada fungsi rekursif menggunakan sintaks pemilihan (if-else), dan pengulangan akan terus terjadi sampai base case terpenuhi. Sedangkan pada fungsi iteratif menggunakan sintaks perulangan (for/while), dan pengulangan akan terus terjadi sampai kondisi perulangan bernilai false atau tidak terpenuhi.

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
import java.util.Scanner;
static int hitungPangkat(int x, int y){
    if(y == 0){
        return (1);
    } else {
        return (x * hitungPangkat(x, y - 1));
    }
}

Scanner sc = new Scanner(System.in);
int bilangan, pangkat;

System.out.print("Bilangan yang dihitung : ");
bilangan = sc.nextInt();
System.out.print("Pangkat : ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung : 4
    Pangkat : 3
    64


> Penjelasan Percobaan 2 : Kode program di atas meminta inputan dari user, lalu inputan tersebut akan masuk ke fungsi rekursif dan akan diproses. Apabila y bernilai 0 (pangkat 0), maka hasil pangkat tersebut sama dengan 1 dan tidak dipanggil lagi fungsinya. Apabila y bernilai selain 0, maka akan dihitung nilai pangkatnya. Terakhir, akan dicetak hasil dari perhitungan tersebut.

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

> Fungsi tersebut akan berhenti ketika nilai y bernilai 0. Karena saat y = 0 (pangkat 0), maka hasil pangkat tersebut akan bernilai 1 dan tidak akan memanggil fungsi hitungPangkat lagi.

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
import java.util.Scanner;
static double hitungBunga(double saldo, int tahun){
    if(tahun == 0){
        return (saldo);
    } else {
        return (1.11 * hitungBunga(saldo, tahun - 1));
    }
}

Scanner sc = new Scanner(System.in);
double saldoAwal;
int tahun;

System.out.print("Jumlah saldo awal : ");
saldoAwal = sc.nextDouble();
System.out.print("Lamanya menabung (tahun) : ");
tahun = sc.nextInt();

System.out.print("Jumlah uang setelah " + tahun + " tahun : ");
System.out.print(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal : 100000
    Lamanya menabung (tahun) : 2
    Jumlah uang setelah 2 tahun : 123210.00000000003

> Penjelasan Percobaan 3 : Kode program tersebut akan meminta inputan user jumlah saldo dan lamanya menabung dalam tahunan. Kemudian apabila user menginputkan 2 tahun, maka perulangannya akan terjadi 2 kali sampai tahun bernilai 0 (decreament). Ketika tahun bernilai 0, maka akan di-return ke saldo dan akan dilakukan penghitungan.

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

> Base case : tahun = 0. Recursion call : 1.11 * hitungBunga(saldo, tahun - 1)

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
import java.util.Scanner;
static void fungsiRekursif(int n){
    if(n == 0){
        System.out.println(n);
    } else {
        System.out.print(n + " ");
        fungsiRekursif(n - 1);
    }
}
static void fungsiIteratif(int n){
    for(int i = n; i >= 0; i--){
        System.out.print(i + " ");
    }
}
Scanner in = new Scanner(System.in);
System.out.print("Masukkan bilangan : ");
int bil = in.nextInt();
System.out.println("---Fungsi Rekursif---");
System.out.print("Deret bilangannya = ");
fungsiRekursif(bil);
System.out.println();
System.out.println("---Fungsi Iteratif---");
System.out.print("Deret bilangannya = ");
fungsiIteratif(bil);
```

    Masukkan bilangan : 7
    ---Fungsi Rekursif---
    Deret bilangannya = 7 6 5 4 3 2 1 0
    
    ---Fungsi Iteratif---
    Deret bilangannya = 7 6 5 4 3 2 1 0 

> Penjelasan : Pada fungsi rekursif memiliki paramter n. Lalu, n = 0 merupakan base case agar pemanggilan bisa berhenti ketika kondisi terpenuhi. Apabila kondisi ini terpenuhi, program akan mencetak nilai n. Apabila nilai n bukan sama dengan 0, program akan mencetak nilai n tersebut kemudian dilakukan decreament nilai n agar nilai n tersebut dapat berubah di setiap pemanggilan. Sedangkan pada fungsi iteratif memiliki parameter n. Lalu, digunakan perulangan for dengan kondisi i = inputan dari user, syarat perulangan nilai i sampai sama dengan 0, dan terjadi decreament agar inputan user dapat mencapai 0. Kemudian, di luar fungsi terdapat program untuk meminta inputan user dan disimpan di variabel bil. Terakhir, dilakukan pemanggilan kedua fungsi berparameter bil.

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
import java.util.Scanner;
int i = 1, jumlah = 0;
static void hitungPenjumlahan(int parameter){
    if (i == parameter){
        jumlah += i;
        System.out.print(i + " = " + jumlah);
    } else {
        System.out.print(i + " + ");
        jumlah += i;
        i++;
        hitungPenjumlahan(parameter);
    }
}

Scanner sc = new Scanner(System.in);
System.out.print("Masukkan bilangan : ");
int bil = sc.nextInt();
hitungPenjumlahan(bil);
```

    Masukkan bilangan : 8
    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36

> Penjelasan : Pada awal program, dideklarasikan variabel i bernilai 1 dan jumlah bernilai 0. Lalu, dibuat fungsi void hitungPenjumlahan yang memiliki parameter bernama parameter. Base case nya adalah i = parameter. Apabila kondisi ini terpenuhi, akan ditambahkan sesama i dan ditampung di variabel jumlah, serta akan di-print (i + " = " + jumlah). Apabila kondisi base case tidak terpenuhi, akan di-print (i + " + "). Selain itu, variabel i akan dijumlah sesamanya lalu disimpan di variabel jumlah, variabel i juga dilakukan increament agar variabel i tidak statis, serta akan dilakukan pemanggilan fungsi hitungPenjumlahan berparameter parameter agar terjadi perulangan. Di luar body fungsi, terdapat program untuk meminta inputan user lalu disimpan di variabel bil, dan terakhir akan dilakukan pemanggilan fungsi hitungPenjumlahan berparameter bil.

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).

```Java
import java.util.Scanner;
static void cekPrimaRekursif(int prima, int index){
    if (index == 1){
        System.out.print(prima + " merupakan Bilangan Prima");
    } else if (prima % index == 0){
        System.out.println(prima + " bukan merupakan bilangan prima");
    } else if (prima % index != 0){
        cekPrimaRekursif(prima, index - 1);
    }
}
Scanner oke = new Scanner(System.in);
System.out.print("Masukkan sebuah bilangan : ");
int bil1 = oke.nextInt();
int bil2 = bil1 - 1;
cekPrimaRekursif(bil1, bil2);
```

    Masukkan sebuah bilangan : 6
    6 bukan merupakan bilangan prima

> Penjelasan : Dibuat fungsi void cekPrimaRekursif yang memiliki 2 parameter, yaitu prima dan index (pembagi) bertipe data int. Lalu, base case nya adalah index = 1. Apabila kondisinya terpenuhi akan di-print bilangan tersebut adalah bilangan prima. Akan tetapi, jika terdapat kondisi prima dibagi index sisanya adalah 0 (habis dibagi), maka akan di-print bilangan tersebut bukan bilangan prima. Namun, jika terdapat kondisi prima dibagi index terdapat sisa (tidak habis dibagi), maka akan dilakukan pemanggilan fungsi cekPrimaRekursif dengan parameter prima dan index - 1. Kemudian di luar body fungsi, program akan meminta inputan user dan disimpan di variabel bil1, dan dideklarasi bil2 yang merupakan bil1 - 1. Terakhir akan dipanggil fungsi cekPrimaRekursif dengan parameter bil1 dan bil2.

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
static int Fibonacci(int x){
    if(x <= 1){
        return x;
    } else {
        return(Fibonacci(x-1) + Fibonacci(x-2));
    }
}
Scanner ya = new Scanner(System.in);
System.out.print("Masukkan bulan: ");
int bulan = ya.nextInt();
System.out.println("Pasangan marmut pada bulan ke " + bulan + " adalah " + Fibonacci(bulan));
```

    Masukkan bulan: 12
    Pasangan marmut pada bulan ke 12 adalah 144

> Penjelasan : Dibuat fungsi int Fibonacci berparameter x bertipe data int. Base case nya adalah x <= 1. Apabila kondisi ini terpenuhi, maka nilai tersebut akan ditampung di variabel x dan akan dijumlahkan sesamanya. Apabila tidak, akan di-return ke Fibonacci(x-1) + Fibonacci(x-2) seperti rumus Fibonacci yang sudah ada. Di luar body fungsi, user akan diminta inputan bulan ke-berapa yang nantinya akan diproses di fungsi Fibonacci. Terakhir, akan dicetak hasil perhitungan fungsi Fibonacci tersebut.

