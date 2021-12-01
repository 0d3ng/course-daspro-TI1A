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
    if(n==0) {
        return 1;
    }else{
        return n*faktorialRekursif(n - 1);
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
```
120
120
```

4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
    Suatu teknik memanggil dirinya sendir secara berulang sampai suatu kondisi menghentikannya
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
    contohnya adalah program mencari faktorial
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!
    hasilnya sama,pada faktorialRekursif menggunakan fungsi rekursif yaitu memanggil fungsi itu dengan mengguanakan parameter yang beda sampai kondisi yang ditentukan. Sedangkan pada faktorialIteratif menggunakan perulangan.


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
static int hitungPangkat (int x, int y){
    if (y == 0){
        return(1);
    }else {
        return (x * hitungPangkat(x,y-1));
    }
}

Scanner sc = new Scanner(System.in);
int bilangan,pangkat;

System.out.print("Bilangan yang dihitung : ");
bilangan = sc.nextInt();
System.out.print("Pangkat : ");
pangkat = sc.nextInt();
  

System.out.println(hitungPangkat(bilangan, pangkat));   

```
```
Bilangan yang dihitung : 3
Pangkat : 2
9
```

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!
    fungsi akan terus berjalan sampai y mencapai angka 1. Jika terjadi hal tersebut maka fungsi mengembalikan nilainya dan tidak berjalan lagi


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
static double hitungBunga(double saldo, int tahun){
   if (tahun == 0){
     return saldo;
   }else {
     return (1.11 * hitungBunga(saldo, tahun-1));
   }
 }

 Scanner sc = new Scanner(System.in);
  
   int tahun,saldoAwal;

  System.out.print("Jumlah saldo awal : ");
  saldoAwal = sc.nextInt();
  System.out.print("Lamanya menabung (tahun) : ");
  tahun = sc.nextInt();

  System.out.print("Jumlah uang setelah " + tahun + " tahun : ");
  System.out.println(hitungBunga(saldoAwal, tahun));

```
```
Jumlah saldo awal : 2000000
Lamanya menabung (tahun) : 2
Jumlah uang setelah 2 tahun : 2464200.0
```

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!
    Base case
```Java
if (tahun == 0){
     return saldo;
}
```
    Recursion call 
```Java
else {
     return (1.11 * hitungBunga(saldo, tahun-1));
   }
```


## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
import java.util.Scanner;
static void DeretDescendingRekursif(int x){
    System.out.print(x + ",");
 
   if(x == 0){
     return;
   }else {
     DeretDescendingRekursif(x-1);
   }
  }
 
static void DeretDescendingIteratif(int x){
    for(int i=x;i>=0;i--){
      System.out.print(i + ",");
    }
  }
 

Scanner sc = new Scanner(System.in);
System.out.print("masukkan bilangan : ");
int bil = sc.nextInt();
System.out.print("Deret Descending Rekursif : ");
DeretDescendingRekursif(bil);
System.out.print("\nDeret Descending Iteratif : ");
DeretDescendingIteratif(bil);

```
```
masukkan bilangan : 5
Deret Descending Rekursif : 5,4,3,2,1,0,
Deret Descending Iteratif : 5,4,3,2,1,0,
```
### Penjelasan
1. Pada fungsi yang pertama yaitu `DeretDescendingRekursif` digunakan untuk menampilkan nilai x yang kemudian di cek apakah bernilai = 0 atau tidak, jika iya maka akan terhenti dan jika tidak maka akan lanjut ke fungsi berikutnya untuk menampilkan nilai berikutnya.
2. Fungsi `DeretDescendingIteratif` menggunakan perulangan yang memiliki nilai awal i sama dengan x kemudian di decrement sampai nilainya 0

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int PenjumlahanRekursif(int x){
   if (x == 1){
     return x;
   }else{
     return x + PenjumlahanRekursif(x - 1);

   }
 }

 
System.out.print("Hasil penjumlahan rekursif adalah : "); 
System.out.print(PenjumlahanRekursif(8));
 
```
```
Hasil penjumlahan rekursif adalah : 36
```


3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;
static int ambilNilaiRekursif(int x, int y) {
    if (y == 1){
        return 1;
    }else if (x % y == 0){
        return 1 + ambilNilaiRekursif(x, --y);
    }else{
        return 0 + ambilNilaiRekursif(x, --y);
    }
}

static boolean CekPrimaRekursif(int num) {
    if (num > 1){
        return (ambilNilaiRekursif(num, num) == 2);
    }else{
        return false;
    }
}

  Scanner sc = new Scanner(System.in); 
  System.out.print("masukkan bilangan : "); 
  int num = sc.nextInt();
    if (CekPrimaRekursif(num)){
       System.out.println("Bilangan Prima");
    }else{
      System.out.println("Bukan Bilangan Prima");
  }
```
```
masukkan bilangan : 20
Bukan Bilangan Prima
```
```
masukkan bilangan : 23
Bilangan Prima
```
### Penjelasan
1. membuat fungsi dengan nama `ambilNilaiRekursif` dengan parameter, kemudian dilakukan pengecekan jika y bernilai 1 maka return 1, kemudian kondisi kedua yaitu jika modulus benilai = 0 maka return 1 dan dijumlah dengan fungsi `ambilNilaiRekursif`
2. Kemudian membuat fungsi baru dengan nama `CekPrimaRekursif` dengan parameter, setelah itu di cek bila num > 1 maka return `ambilNilaiRekursif` jika kondisi tidak memenuhi maka false
3. kemudian masukkan bilangan yang ingin di cek, setelah itu masuk ke pengecekan apakah bilangan prima atau tidak

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
static int Fibonacci(int a){
    if (a == 0 || a == 1){
      return a;
    } else{
      return Fibonacci(a - 1) + Fibonacci(a-2);
    }
  }

  Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah deret : ");
    int a = sc.nextInt();

    System.out.println("hasil bilangan Fibonacci adalah ");
    for(int i = 0; i < a; i++) {
      System.out.print(Fibonacci(i)+" ");
    }
```
```
Masukkan jumlah deret : 10
hasil bilangan Fibonacci adalah 
0 1 1 2 3 5 8 13 21 34 
```
### Penjelasan

1. Membuat fungsi bernama fibonacci yang bertipe integer dan menerima masukkan sebuah integer yang bernama variabel a.
2. Cek kondisi jika nilai dari variable a adalah 0 atau 1 maka akan mengembalikan nilai a.
3. Jika variable a bernilai selain 0 dan 1 maka akan melakukan operasi rekursif dimana hasil operasi fibonacci a-1 ditambah dengan hasil operasi fibonacci a-2.
4. melakukan perulangan sebanyak nilai a dan menginputkan nilai i kedalam fungsi fibonacci serta menampilkan hasil operasi fibonacci.

