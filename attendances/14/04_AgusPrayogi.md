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
    if(n == 0) {
        return 1;
    } else {
        return n * faktorialRekursif(n-1);
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n) {
    int faktor = 1;
    for(int i = n; i >= 1; i--) {
        faktor *= i;
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


> 1. Fungsi Rekursi adalah fungsi yang mengulangi fungsi itu sendiri dalam kondisi tertentu.
> 2. Contoh kasus penggunaan fungsi rekursif adalah menghitung faktorial dari bilangan yang lebih besar dari 1.
> 3. hasilnya sama, pada fungsi rekursif, jika n sama dengan 0, maka akan menghasilkan 1, jika tidak akan memanggil fungsi rekursif dari n-1 dikalikan n secara berulang-ulang hingga n = 0 dan mengembalikan nilainya. sedangkan pada fungsi iteratif, menggunakan perulangan `for` sederhana dengan menggunakan deincrement hingga kondisi n = 0 dan mengembalikan nilainya.
___

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

static int hitungPangkat(int x, int y) {
    if(y == 0) {
        return (1);
    } else {
        return (x * hitungPangkat(x, y-1));
    }
}
Scanner sc = new Scanner(System.in);
int bilangan, pangkat;

System.out.print("Bilangan yang dihitung: ");
bilangan = sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();
System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung: 5
    Pangkat: 4
    625
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

> Hingga parameter ke-2/ pangkat bernilai 0, karena didalam fungsi terdapat kondisi jika y atau parameter ke-2 sama dengan 0 akan me-return 1, dan perulangan fungsi `hitungPangkat()` akan berhenti dan me-return hasil pengulangan fungsi tadi.
___

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
import java.util.Scanner;

static double hitungBunga(double saldo, int tahun) {
    if(tahun == 0) {
        return saldo;
    } else {
        return (1.11 * hitungBunga(saldo, tahun-1));
    }
}

Scanner sc = new Scanner(System.in);
double saldoAwal;
int tahun;
System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextDouble();
System.out.print("Lama menabung (tahun): ");
tahun = sc.nextInt();
System.out.print("Jumlah uang setelah "+tahun+" tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal: 500000
    Lama menabung (tahun): 4
    Jumlah uang setelah 4 tahun: 759035.2050000002
    

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!


```Java
// base case
if(tahun == 0) {
    return saldo; 
} 
// recursion call
else {
    return (1.11 * hitungBunga(saldo, tahun-1));
}
```

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static void deretDescendingRekursif(int n) {
    if(n >= 0) {
        System.out.println(n);
        deretDescendingRekursif(n-1);
    } else {
        return;
    }
}

static void deretDescendingIteratif(int n) {
    for(int i = n; i >= 0; i--) {
        System.out.println(i);
    }
}

System.out.println("Deret descending rekursif");
deretDescendingRekursif(9);
System.out.println("Deret descending iteratif");
deretDescendingIteratif(9);
```

    Deret descending rekursif
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
    Deret descending iteratif
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
    

> 1. Pada fungsi `deretDescendingRekursif`, jika parameter lebih dari sama dengan 0, maka akan mencetak output dan memanggil dirinya sendiri hingga parameter = 0 dan fungsi akan selesai.
> 2. Pada fungsi `deretDescendingIteratif`, didalamnya hanya menggunakan perulangan `for` biasa dengan deincrement, jadi jika n >= 0, maka perulangan selesai.
> 3. Memanggil masing-masing fungsi dengan parameter 9.
___

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static void penjumlahanRekursif(int n, int i, int hasil) {
    if(n == i) {
        hasil += i;
        System.out.print(i+" = "+hasil);
        return;
    } else {
        hasil+=i;
        System.out.print(i+"+");
        penjumlahanRekursif(n, i+1, hasil);
    }
}

System.out.print("Faktorial bilangan 8 = ");
penjumlahanRekursif(8, 1, 0);
```

    Faktorial bilangan 8 = 1+2+3+4+5+6+7+8 = 36

> 1. Parameter ke-1 digunakan untuk jumlah faktorial/kondisi
> 2. Parameter ke-2 digunakan untuk kondisi awal dan increment
> 3. Parameter ke-3 digunakan untuk menampung hasil dari faktorial
> 4. jadi jika parameter ke-1 dan ke-2 tidak sama maka akan memanggil dirinya sendiri hingga kedua paramter sama dan menampilkan hasilnya.
___

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;

static int cekPrimaRekursif(int n, int c) {
    if(n <= 1) {
        return 0;
    } else if(n % c == 0) {
        if(n == c) {
            return 1;
        } else {
            return 0;
        }
    }else{
        return cekPrimaRekursif(n, c+1);
    }
}

Scanner sc = new Scanner(System.in);

System.out.print("Masukkan angka: ");
int angka = sc.nextInt();
System.out.println("Angka "+angka+" = "+(cekPrimaRekursif(angka, 2) == 1 ? "Bilangan Prima" : "Bukan Bilangan Prima"));
```

    Masukkan angka: 11
    Angka 11 = Bilangan Prima
    

> 1. user mengimputkan angka yang akan dicek
> 2. parameter ke-1 untuk menampung angka yang akan dicek, parameter ke-2 untuk kondisi dan increment
> 3. jika parameter 1 / `n` lebih kecil sama dengan 1, maka akan mengembalikan 0.
> 4. hanya jika `n` % `c` sama dengan 0, maka akan masuk kedalam inner if, jika `n` == `c` maka akan menggembalikan 1, jika tidak 0.
> 5. jika tidak, akan mengembelikan fungsinya sendiri hingga memenuhi kondisi yang ada.
___

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;

static int Fibonacci(int n) {
    if(n <= 1) {
        return n;
    } else {
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}

Scanner sc = new Scanner(System.in);
int bln;

System.out.print("Berapa bulan marmut ditempatkan: ");
bln = sc.nextInt();
System.out.println("Dalam jangka "+bln+" bulan ditempatkan, terdapat "+Fibonacci(bln) + " pasangan marmut");
```

    Berapa bulan marmut ditempatkan: 12
    Dalam jangka 12 bulan ditempatkan, terdapat 144 pasangan marmut
    

> 1. user mengimputkan angka berapa bulan
> 2. jika parameter lebih besar sama dengan 1, maka akan mengembalikan fungsi itu sendiri dengan parameter n - 1 ditambah fungsi itu sendiri dengan parameter n - 2, dimana ini menanfaatkan rumus deret fibonacci, jika kedua fungsi sudah memenuhi kondisi akan mengembalikan nilainya.
___
