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
    if (n==0){
        return (1);
    }else{
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


Jawab :
1. Fungsi rekursif ini fungsi yg memanggil diri sendiri
2. biasanya bisa buat fungsi pangkat, faktorial, barisan fibonacci
3. Hasilnya sama,
   alur rekursif,ada parameter ,ada kondisi yang membatasi pengulangan tersebut (pakai if)
   alur iteratif, (pakai for)

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
    if (y == 0){
        return (1);
    } else {
        return (x * hitungPangkat(x,y-1));
    }
}

import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bilangan, pangkat;

System.out.print("Bilangan yg dihitung: ");
bilangan = sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yg dihitung: 3
    Pangkat: 2
    9
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

jawaban :
if y==0 akan pemanggilan ini terpenuhinya 

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
Scanner scan = new Scanner(System.in);
static double hitungBunga (double saldo, int tahun){
    if(tahun == 0){
        return(saldo);
    } else {
        return(1.11 * hitungBunga(saldo, tahun - 1));
    }
}

System.out.print("Jumlah saldo awal : ");
int saldoAwal = scan.nextInt();
System.out.print("Lamanya menabung (tahun) : ");
int tahun = scan.nextInt();

System.out.print("Jumlah uang setelah " + tahun + "tahun : ");
System.out.print(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal : 200000
    Lamanya menabung (tahun) : 3
    Jumlah uang setelah 3tahun : 273526.20000000007

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!


```Java
//untuk base casenya
if( tahun==0){
return (saldo);
}

//recursion call
else{
return (1.11*hitungBunga(saldo, tahun -1));
}
```

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int n;
//Fungsi Rekursif
static int rekursif(int n) {
    if (n==0) {
        return 0;
    } else {
        System.out.println(n);
        return rekursif(n-1);
    }
}

//Fungsi Iteratif
static void iteratif(int n){
    for (int i = n; i >=0; i--) {
        System.out.println(i);
    }
}
System.out.print("Masukan bil : ");
n = sc.nextInt();
System.out.println("Rekursif : ");
rekursif(n);
System.out.println("Iteratif : ");
iteratif(n);
```

    Masukan bil : 6
    Rekursif : 
    6
    5
    4
    3
    2
    1
    Iteratif : 
    6
    5
    4
    3
    2
    1
    0
    

Penjelasan:
  Rekursif, dengan if else, akan berhenti jika recursion call sudah mencapai 0
  Iteratif, dengan for akan berhenti jika false

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int f=1;
int bil;
System.out.print("Masukkan bil faktorial: ");
bil = sc.nextInt();
static int penjumlahan(int f) {
    if(f==bil){
        return f;
    } else {
        return f + penjumlahan(f+1);
    }
}
System.out.println(penjumlahan(f));
```

    Masukkan bil faktorial: 8
    36
    

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan bil: ");
int n = sc.nextInt();

static int prima(int bil, int a){
    if(a==1){
        return(1);
    }else if(bil% a ==0){
        return(0);
    } else {
        return(prima(bil,a-1));
    }
}
if(prima(n, n-1) !=0){
    System.out.print("Bil Prima");
} else {
    System.out.print("Bukan bil prima");
}
```

    Masukkan bil: 5
    Bil Prima

Penjelasan :
ini dengan rekursif yg dimana base nya mencapai 1 maka bukan prima

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int fibonacci (int a){
    if (a==1 || a==2){
        return 1;
    }
    else{
        return fibonacci(a-1) + fibonacci (a-2);
    }
}
import java.util.Scanner;
Scanner sc= new Scanner(System.in);
System.out.print("Masukkan bulan : ");
int a = sc.nextInt();
System.out.print("Banyak pasangan marmut bulan ke- " + a + " yaitu " );
System.out.println(fibonacci(a));
```

    Masukkan bulan : 3
    Banyak pasangan marmut bulan ke- 3 yaitu 2
    


```Java

```
