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
        return (1);
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
        return (1);
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
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

#### Jawaban
1. Fungsi rekursif dalam pemrograman merupakan fungsi yang memanggil dirinya sendiri. Fungsi rekursif cara kerjanya hampir mirip seperti perulangan. Karena tingkah lakunya yang mengulang-ulang setiap pemanggilan dirinya.
2. Contoh kasus penggunaan fungsi rekursif seperti didalam faktorisasi dimana dalam faktorisasi terdapat perulangan nilai dari bilangan yang dimasukkan sampai ke 0.
3. Yang dihasilkan dari percobaan 1 fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama. Akan tetapi yang membedakan didalam alur jalannya programnya didalam fungsi faktorialRekursif() menggunakan if else, sedangkan dalam fungsi faktorialIteratif menggunakan perulangan "biasanya perulangan for dan while".

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
    if (y == 0) {
        return (1);
    } else {
        return (x * hitungPangkat(x, y - 1));
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
    Pangkat: 2
    25


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

#### Jawaban
1. Proses pemanggilan fungsi pada percobaan 2 tersebut akan dijalankan sampai i==0.

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
    if (tahun == 0) {
        return (saldo);
    } else {
        return (1.11 * hitungBunga(saldo, tahun - 1));
    }
}

Scanner sc = new Scanner(System.in);
double saldoAwal;
int tahun;
System.out.print("Jumlah saldo awal: ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun): ");
tahun = sc.nextInt();
System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal: 2000000
    Lamanya menabung (tahun): 1
    Jumlah uang setelah 1 tahun: 2220000.0


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

#### Jawaban
1. Pada Percobaan 3 yang termasuk blok kode program "base case" adalah tahun==0 dan blok kode program "recursion call" adalah 1.11 * hitungBunga(saldo, tahun - 1).

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static int faktorialRekursif(int n) {
    System.out.print(n + " ");
    if (n==0) {
        return(0);
    } else {
        return(n + faktorialRekursif(n-1));
    }
}
static int faktorialIteratif(int n){
    int faktor = 0;
    for(int i = n; i >= 0; i--) {
        System.out.print(i + " ");
        faktor = faktor + i;
    }
    return faktor;
}

Scanner sc = new Scanner(System.in);
int nilai;
System.out.print("Masukkan Nilai n = ");
nilai = sc.nextInt();
System.out.print("Deret Descending Rekursif adalah ");
faktorialRekursif(nilai);
System.out.println();
System.out.print("Deret Descending Iteratif adalah ");
faktorialIteratif(nilai);
```

    Masukkan Nilai n = 13
    Deret Descending Rekursif adalah 13 12 11 10 9 8 7 6 5 4 3 2 1 0 
    Deret Descending Iteratif adalah 13 12 11 10 9 8 7 6 5 4 3 2 1 0 




    91

#### Penjelasan
Kode program diatas berfungsi untuk menampilkan deret bilangan ke 0. Pada fungsi rekursif menggunakan if else dan akan memanggil dirinya sendiri dimana nilainya akan dikurang 1 dan berulang sampai nilainya == 0. Pada fungsi iterati menggunakan perulangan for atau bisa juga while dimana nilai yang dimasukkan akan looping sesuai exp3 decrement sampai nilainya 0. 


2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int penjumlahanRekursif(int f) {
    if (f == 1) {
        System.out.print(f + " = ");
    } else {
        System.out.print(f + "+");
    }
    if (f == 1) {
        return(1);
    } else {
        return(f + penjumlahanRekursif(f - 1));
    }
}

Scanner sc = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai f: ");
nilai = sc.nextInt();
System.out.print("Hasil Penjumlahan Rekursifnya adalah ");
System.out.println(penjumlahanRekursif(nilai));
```

    Masukkan nilai f: 10
    Hasil Penjumlahan Rekursifnya adalah 10+9+8+7+6+5+4+3+2+1 = 55

#### Penjelasan
Kode program diatas berfungsi untuk menghitung penjumlahan faktorial menggunakan fungsi rekursif dengan menginputkan nilai, fungsinya menggunakan rumus f + penjumlahanRekursif(f - 1). untuk pencetakannya apabila nilai fungsi 1 maka dicetak nilai f + "=", jika tidak maka dicetak nilai f + "+". dalam fungsi ini aka berjalan terus sampai nilai fungsi == 1.


3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
static int CekPrimRekursif(int n, int i) {
    if(i == 1) {
        return 1;
    } else if (n % i == 0) {
            return 1 + CekPrimaRekursif(n, --i);
    } else {
            return 0 + CekPrimaRekursif(n, --i);
    }
}
 
public static boolean CekBilPrim(int bil) {
        if (bil > 1) {
            return (CekPrimRekursif(bil, bil) == 2);
        } else {
            return false;
    }
}
Scanner sc = new Scanner(System.in);
int nilai;
System.out.print("Masukkan bilangan : ");
nilai = sc.nextInt();
if(CekBilPrim(nilai)) {
    System.out.println("Bilangan " + nilai + " merupakan Bilangan Prima");
} else {
    System.out.println("Bilangan " + nilai + " bukan merupakan Bilangan Prima");
}
```

    Masukkan bilangan : 101
    Bilangan 101 merupakan Bilangan Prima

#### Penjelasan
Kode program diatas berfungsi untuk menentukan bilangan prima atau bukan. User diminta untuk menginputkan nilai yang akan dicek apakah bilangan prima. nilai tersebut akan diproses fungsi cekBilPrim apabila yang diinputkan kurang dari 1 maka bukan bilangn prima, apabila yang diinputkan lebih dari 1 maka akan di lanjut ke fungsi CekPrimRekursif. pada fungsi ini menggunakan rumus 1 + CekPrimaRekursif(x, --y) dan 0 + CekPrimaRekursif(x, --y) sampai x tidak menyisahkan 0. didalam fungsi CekPrimRekursif looping akan selesai sampi nilainya == 1. jika menghasilkan false maka akan menampulkan output bilangan tersebut bukan bilangan prima.


4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int fibonacci(int x) {
    if (x <= 1) {
        return x;
    } else {
        return (fibonacci(x - 1) + fibonacci(x - 2));
    }
}

Scanner sc = new Scanner(System.in);
int bulan;
System.out.print("Masukkan bulan: ");
bulan = sc.nextInt();
System.out.println("Pasangan marmut pada bulan ke-" + bulan + " adalah " + fibonacci(bulan));
```

    Masukkan bulan: 12
    Pasangan marmut pada bulan ke-12 adalah 144

#### Penjelasan
Kode program diatas berfungsi untuk membuat pola fibonacci menentukan jumlah marmut dengan memasukkan inputan pada bulan ke-... .inputan bulan tersebut akan diproses kedalam fingsi fibonacci yang menggunakan rumus (x - 1)+(x - 2). jika nilai yang dimasukkan kurang dari sama dengan 1, maka bilangan tersebut ditampung kedalam nilai x. kemudian bilangan yang ditampung akan dijumlahkan di rumus fibonnaci tersebut dan hasilnya akan dicetak.

