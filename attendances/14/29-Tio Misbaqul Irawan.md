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
    if(n == 0) {
        return 1;
    } else {
        return n * faktorialRekursif(n - 1);
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
static int faktorialIteratif(int n) {
    int faktor = 1;
    for(int i = n; i >= 1; i--) {
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


#### Jawaban

1. Fungsi rekursif adalah sebuah fungsi yang memanggil dirinya sendiri
2. Contohnya adalah penghitungan faktorial dan fpb
3. Sama, pada faktorialRekursif, proses perhitungan menggunakan alur rekursif, yaitu dengan memanggil fungsi itu dengan parameter yang berbeda sampai dengan kondisi yang telah ditentukan. Sedangkan pada fungsi faktorialIteratif, alur perhitunganya adalah menggunakan perintah perulangan for sederhana,  yaitu dengan cara melakukan iterasi dari n ke 1, kemudian mengalikanya dengan variable faktor

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
    if(y == 0) {
        return 1;
    } else {
        return x * hitungPangkat(x, y - 1);
    }
}

import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int bilangan, pangkat;

System.out.print("Bilangan yang dihitung: ");
bilangan = sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung: 2
    Pangkat: 3
    8
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Proses pemanggilan fungsi hitungPangkat akan berhenti jika nilai dari y adalah 0. Hal ini dapat terjadi karena pada pemanggilan fungsi rekursif, fungsi dipanggil dengan parameter kedua, atau parameter y - 1 hitungPangkat(x, **y - 1**)

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
    if(tahun == 0) {
        return saldo;
    } else {
        return 1.11 * hitungBunga(saldo, tahun - 1);
    }
}


import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int saldoAwal, tahun;

System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun): ");
tahun = sc.nextInt();

System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal: 100000
    Lamanya menabung (tahun): 5
    Jumlah uang setelah 5 tahun: 168505.81551000007
    

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

Yang merupakan base case pada program tersebut adalah pada block

```java
if(tahun == 0) {
    return saldo;
}
```

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
static void DeretDescendingRekursif(int n) {
    System.out.println(n);
    
    if(n == 0) {
        return;
    } else {
        DeretDescendingRekursif(n - 1);
    }
}

static void DeretDescendingIteratif(int n) {
    for(int i = n; i >= 0; i--) {
        System.out.println(i);
    }
}

System.out.println("DeretDescendingRekursif: ");
DeretDescendingRekursif(10);
System.out.println("\nDeretDescendingIteratif: ");
DeretDescendingIteratif(10);
```

    DeretDescendingRekursif: 
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    0
    
    DeretDescendingIteratif: 
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    0
    

#### Penjelasan

Pada fungsi DeretDescendingRekursif, alurnya adalah menampilkan nilai n, kemudian melakukan pengecekan, apakah nilai n == 0 atau tidak, jika iya, maka berhenti, jika tidak maka panggil fungsi ini lagi dengan parameter n - 1 untuk menampilkan nilai selanjutnya.

Pada fungsi DeretDescendingIteratif, alurnya adalah dengan menggunakan perulangan biasa dimana nilai awal i adalah n, kemudian melakukan operasi decrement sampai n bernilai sama dengan 0;

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
static int PenjumlahanRekursif(int n) {
    if(n == 1) {
        return n;
    } else {
        return n + PenjumlahanRekursif(n - 1);
    }
}

System.out.println(PenjumlahanRekursif(8));
```

    36


#### Penjelasan

Fungsi ini sama dengan fungsi faktorial pada percobaan di atas, hanya saja tinggal merubah operasinya dari x menjadi +

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
static boolean CekPrimaRekursif(int n, int i) {
    if(n < 2) return false;
    if(n == 2) return true;
    if(n % i == 0) return false;
    if(i * i > n) return true;
    
    return CekPrimaRekursif(n, i + 1);
}

System.out.println(CekPrimaRekursif(7, 2));
```

    true


#### Penjelasan

Untuk mengecek apakah bilangan prima, yang pertama lakukan cek apabila nilai n itu kurang dari 2, jika iya makan bukan bilangan prima.
Setelah itu cek apakah bilangan tersebut adalah 2, jika iya maka bilangan tersebut adalah bilangan prima. Kenapa menggunakan pengecekan tersendiri, karena 2 adalah bilangan yang hanya mememiliki 2 pembagi saja yaitu 1 dan 2.
Kemudian, lakukan pengecekan apabila bilangan tersebut dibagi i (dimana pada pemanggilan pertama nilai dari i akan bernilai 2 dan akan bertambah seiring dengan pemanggilan fungsi ini lagi jika semua kondisi tidak terpenuhi). Jika bilangan tersebut tidak habis dibagi dengan i, maka bilangan tersebut bukan bilangan prima.
Kemudian lakukan pengecekan apabila pembagi^2 lebih dari bilangan tersebut. Ini untuk melakukan pengecekan jika bilangan tersebut bukanlah nilai akar kuadrat dari pembagi.
Jika semua kondisi tidak terpenuhi, panggil lagi fungsi CekPrimaRekursif dengan parameter n dan i + 1, atau dengan pembagi selanjutnya.

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
static int Fibonacci(int n) {
    if(n <= 1) {
        return n;
    } else {
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}

System.out.println(Fibonacci(12));
```

    144


#### Penjelasan

Fungsi di atas menggunakan rumus Fibonacci yang sudah ada yaitu

F<sub>n</sub> = F<sub>n -  1</sub> + F<sub>n - 2</sub> dimana n > 1
