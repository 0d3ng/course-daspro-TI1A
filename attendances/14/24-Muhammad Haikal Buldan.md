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
static int faktorialRekursif(int n) {
    if (n == 0) {
        return (1);
    } else {
        return (n * faktorialRekursif(n - 1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
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


Jawab :

1. Fungsi rekursif adalah fungsi yang memiliki perulangan didalammnya yang menggunakan if else 

2. Dalam penggunaan program menghitung pangkat, faktorial dan fibonacci

3. Sama, dalam fungsi iteratif tidak ada perulangan didalam fungsi tersebut, dan jika ingin menggunakan fungsi iteratif dalam perulangan maka fungsi iteratif dipanggil didalam perulangan for, while, atau do while, sedangkan fungsi rekursif memiliki cara kerja yang memanggil dirinya sendiri, atau fungsi dengan perulangan didalamnya dengan menggunakan if else, sehingga ketika dipanggil akan otomatis melakukan perulangan tanpa menggunakan for, while, atau do while


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
static int hitungPangkat(int x, int y) {
    if (y == 0) {
        return (1);
    } else {
        return (x * hitungPangkat(x, y -1));
    }
}

int bilangan, pangkat;
Scanner sc = new Scanner(System.in);

System.out.print("Bilangan yang dihitung : ");
bilangan = sc.nextInt();
System.out.print("Pangkat : ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat))
```

    Bilangan yang dihitung : 5
    Pangkat : 5
    3125


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Jawab :

Fungsi pemanggilan tersebut akan dijalankan dari inputan pangkat yang diberikan sampai nantinya pada perulangan titik 0 atau lebih ringkasnya perulangan akan dijalankan sebanyak inputan yang diberikan pada y atau pangkat, misal pada inputan pangkat diberikan nilai 5 maka perulangan akan berjalan mundur mulai 5 sampai 0 yaitu 6 kali perulangan. 

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
static double hitungBunga(double saldo, int tahun) {
    if (tahun == 0) {
        return (saldo);
    } else {
        return (1.11 * hitungBunga(saldo, tahun - 1));
    }
}

int tahun;
double saldoAwal;
Scanner sc = new Scanner(System.in);

System.out.print("Jumlah saldo awal : ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun) : ");
tahun = sc.nextInt();

System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal : 1000000
    Lamanya menabung (tahun) : 5
    Jumlah uang setelah 5 tahun: 1685058.1551000006


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

Jawab :

Base Case :

if (tahun == 0) {
    return (saldo);
}

Disini memiliki base case tahun = 0

Recursion Call :

else {
    return (1.11 * hitungBunga(saldo, tahun - 1));
}

Disini memiliki recursion call yang akan terus berulang jika tahun bukan sama dengan 0

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
static void deretDescendingIteratif(int h) {
     while (h >= 0) {
        System.out.print(h + " ");
        --h;
    }
}

static void deretDescendingRekursif(int h) {
    if (h == 0) {
        System.out.println("0");
    } else {
        System.out.print(h + " ");
        deretDescendingRekursif(h - 1);
    }
}

import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

System.out.print("Silahkan masukkan angka: ");
int bilangan = haikal.nextInt();
System.out.println("Fungsi Rekursif");
deretDescendingRekursif(bilangan);
System.out.println("\nFungsi Iteratif");
deretDescendingIteratif(bilangan);
```

    Silahkan masukkan angka: 24
    Fungsi Rekursif
    24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
    
    Fungsi Iteratif
    24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0 

Penjelasan

Program diatas memiliki fungsi menampilkan bilangan 0 sampai n yang dilakukan dengan cara iteratif dan rekursif.
diawal program dibuat fungsi terlebih dahulu yaitu fungsi iteratif dan fungsi rekursif, fungsi iteratif menggunakan decrement dalam perulangannya jadi akan berhenti ketika decrement sudah mencapai 0, sedangkan fungsi rekursif menggunakan kondisi dalam melakukan perulangan sesuai inputan yang nantinya akan terus dilakukan dengan mengurangi inputan tersebut sampai bertemu base case

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
static int total(int bil){
    if(bil == 1){
        return(1);
    } else {
        return(bil + total(bil - 1));
    }
}

import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

System.out.print("Silahkan Masukan Bilangan : ");
int h = haikal.nextInt();

for(int i = 1; i <= h; i++){
    if(i == h){
        System.out.print(i + " = ");
    } else {
        System.out.print(i + " + ");
    }
}

System.out.print(total(h));
```

    Silahkan Masukan Bilangan : 24
    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22 + 23 + 24 = 300

Penjelasan :

Fungsi program tersebut yaitu untuk menampilkan penghitungan faktorial namun dalam bentuk yang berbeda dan menampilkan perhitungan mulai dari 1 sampai n

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
static int cekPrimaRekursif(int m, int h) {
    if(m % h == 0) {
        if(m == h) {
            return 1;
        } else {
            return 0;
        }
    } else if (m <= 1) {
        return 0;
        
    } else {
        return cekPrimaRekursif(m, h+1);
    }
}

import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

System.out.print("Silahkan Masukan Bilangannya: ");
int bil = haikal.nextInt();

System.out.println("Bilangan "+ bil +" = "+ (cekPrimaRekursif(bil, 2) == 1 ? "Merupakan Bilangan Prima" : "Bukan Merupakan Bilangan Prima"));
```

    Silahkan Masukan Bilangannya: 24
    Bilangan 24 = Bukan Merupakan Bilangan Prima


Penjelasan :

Program diatas menjelaskan tentang cara mengetahui bilangan yang diinputkan apakah bilangan prima ataukah bukan

Dengan menggunakan fungsi rekursif yang mana perulangan dalam fugsi yaitu jika sisa bagi m dengan h = 0 maka akan dilakukan perulangan lagi yaitu jika m = h akan dikembalikan dengan nilai 1, sedangkan jika m tidak sama dengan h maka akan mengmbalikan 0 lalu alasan lainnya yaitu ketika m lebih kecil sama dengan 1 maka akan kembali dengan 0, dan selain alasan diatas akan dikembalikan berupa fungsi dengan h yang di tambah 1

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
static int fiboRekursif(int h) {
    if(h==1 || h==2){
        return 1;
    }
    else{
        return fiboRekursif(h-1) + fiboRekursif(h-2);
    }
}

import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

int h;

System.out.print("Silahkan Memasukkan Bulan Saat Ini : ");
h = haikal.nextInt();

System.out.print("Banyak pasangan marmut pada bulan ke-" + h + " adalah: ");
System.out.println(fiboRekursif(h));
```

    Silahkan Memasukkan Bulan Saat Ini : 3
    Banyak pasangan marmut pada bulan ke-3 adalah: 2


Penjelasan :

Program diatas digunakan untuk menghitung fibbonaci pada bulan bulan tertentu terhadap marmut

dengan fungsi yang berisi jika h = 1 atau 2 maka akan mengembalikan ke 1 selain h = 1 atau 2 maka akan mengembalikan fungsui dengan h-1 + fungsi dengan h-2 yang mana rumus tersebut digunakan untuk menghitung bilangan fibbonaci yaitu Un = Un-2 + Un-1


```Java

```
