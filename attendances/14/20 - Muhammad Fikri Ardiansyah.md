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
        return(1);
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


1.Biasanya sebuah fungsi akan dipanggil (di-CALL) oleh fungsi lain.Pada 
fungsi rekursif, di dalam sebuah fungsi terdapat perintah untuk memanggil fungsi itu 
sendiri (dirinya sendiri). Dengan demikian, proses pemanggilan fungsi akan terjadi 
secara berulang-ulang. 

2.Contohnya mencari factorial, pangkat, Fibonacci dan sebagainya. 

3.Hasilnya sama saja, alur jalannya program pada penggunaan Fungsi Rekursif 
adalah pertama kita membuat fungsi dengan nama faktorialRekursif lalu buat nilai batas 
(base case) pada if untuk menghentikan proses rekursi tersebut dan beri return (1) untuk 
mengembalikan nilai. Kemudian pada else kita beri return (n* faktorialRekursif(n-1) untuk
menyediakan perulangan yg dibutuhkan untuk menyederhanakan permasalahan.
Sementara pada fungsi iteratif kita buat inisialisasi variabel faktor sekaligus kita beri nilai pada 
variabel tersebut yaitu 1.Kemudian membuat perulangan dengan for (i=n; 
i>=1; i--) untuk melakukan perulangan. Lalu memberikan perubahan nilai pada variabel 
faktor dengan mengalikan nilai faktor dengan hasil dari perulangan for (i) kemudian 
mengurangi 1 pada nilai n dan terakhir kita beri return untuk mengembalikan nilai. 

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

    Bilangan yang dihitung: 5
    Pangkat: 2
    25


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

1.Sampai nilai batas (base case) terpenuhi yaitu y==0, atau lebih jelasnya pada 
pangkat yang diinput akan disederhanakan sampai menjadi 0 dan pemanggilan fungsi 
akan berhenti.

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

    Jumlah Saldo Awal: 50000
    Lamanya menabung (tahun): 2
    Jumlah uang setelah 2 tahun: 61605.000000000015


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

Base case yaitu pada baris/blok ke 23 dan return pada baris ke 26.

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
import java.util.Scanner;

public class deretdescendingrekursif {
    //fungsi main

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========FUNGSI REKURSIF========");
        System.out.println("\n--------Tanpa inputan--------");
        tampilDeret(5);
        System.out.println("\n--------Dengan Inputan--------");
        System.out.println("Masukkan jumlah deret: ");
        int deret = input.nextInt();
        tampilDeret(deret);

        System.out.println("\n========FUNGSI ITERATIF========");
        System.out.println("\n--------Tanpa Inputan--------");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + " ");
        }
        System.out.println("\n\n--------Dengan Inputan--------");
        System.out.println("Masukkan jumlah deret : ");
        int jumlah = 0;
        for (int i = jumlah; i >= 0; i--){
            System.out.println(i + " ");
        }
    }
    static void tampilDeret(int x) {
        if (x >= 0){
            System.out.println(x + " ");
            tampilDeret(x - 1);
        }else{
            System.out.println();
        }
    }
}

```

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
import java.util.Scanner;

public class penjumlahanrekursif {

    static int jumlah(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + jumlah(x-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan : ");
        int nomor = input.nextInt();
        System.out.println(jumlah(nomor));
    }
}

```

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;

public class primarekursif {
    static int n;
    static int cekprima(int p){
        if (p==1){
            return 1;

        }else if (n%p==0) {
            return 0;
        }else{
            return cekprima(p-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        n=input.nextInt();
        if (n>1) {
            int p = cekprima(n-1);
            if (p==1) {
                System.out.println(n + " adalah bilangan prima");;
            }else{
                System.out.println(n +" bukan bilangan prima ");
            }
        }else{
            System.out.println(n+" bukan bilangan prima");
        }
    }
}

```

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;

public class fibonacci {
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }else{
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }

    public static void main(String[] args) {
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah deret bilangan fibonacci : ");
        int bilangan = input.nextInt();

        System.out.println("Hasil deret fibonacci");
        for (int i = 0; i <= bilangan; i++) {
            System.out.println(fibonacci(j));
            j++;
        }
        System.out.println("");
    }
}


```


```Java

```
