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
static int faktorialRekursif(int n){
    if(n == 0){
        return (1);
    }else {
        return(n * faktorialRekursif(n-1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
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


JAWABAN :

1. Fungsi rekursif adalah sebuah fungsi yang di dalamnya memiliki perintah untuk memanggil fungsi itu sendiri (dirinya sendiri). Sehingga fungsi akan terjadi secara berulang-ulang.

2. Contoh kasus penggunaan fungsi rekursif terdapat di beberapa operasi seperti mecari pemfaktoran, pangkat, fpb, kpk, deret bilangan.

3. Hasil yang di hasilkan sama, pada fungsi faktorialRekursif() saat proses perhitungan menggunakan fungsi rekursif dan pada fungsi faktorialIteratif() menggunakan fungsi iteratif sebenarnya sama saja, keduanya mempunyai alur yang sama yaitu perulangan. Perbedaannya adalah fungsi rekursif melakukan perulangan dengan cara memanggil fungsi itu sendiri. Sedangkan fungsi iteratif melakukan perulangan dengan menggunakan for loop.

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
        return (1);
    }else{
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

    Bilangan yang dihitung : 10
    Pangkat : 2
    100
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Jawaban :

Proses pemanggilan fungsi tersebut akan dijalankan sampai proses tersebut selesai. Batas perulangannya adalah **y == 0**. maka jika nilai dari variabel "y" adalah 0. Maka otomatis perulangan tersebut berhenti

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
        return (saldo);
    }else{
        return (1.11 * hitungBunga(saldo, tahun-1));
    }
}

Scanner sc = new Scanner(System.in);
double saldoAwal;
int tahun;
System.out.print("Jumlah  saldo awal : ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun) : ");
tahun = sc.nextInt();

System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah  saldo awal : 10000
    Lamanya menabung (tahun) : 2
    Jumlah uang setelah 2 tahun: 12321.000000000004
    

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

Jawaban 

**Base case :**

if (tahun == 0){

        return (saldo);
}

**recursion call :**

else{

        return (1.11 * hitungBunga(saldo, tahun-1));
    }

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static void deretDescendingRekursif(int n) {
    if(n >= 0) { // sebagai base case atau batas perulangan fungsi 
        System.out.print(n + " "); // menampilkan nilai "n"
        deretDescendingRekursif(n - 1 ); // bisa dibilang seperti decrement tetapi ini pada fungsi. Jadi nilai "n" berkurang satu tiap perulangannya
    }
}

static void deretDescendingIteratif(int n) {
    for(int i = n; i >= 0; i--) // di fungsi iteratif menggunakan perulangan for yang memiliki exp 1, 2, dan 3
        System.out.print(i + " "); // kemudian akan menampilkan nilai dari variabel i
}
System.out.println("===========MENGGUNAKAN REKURSIF===========");
deretDescendingRekursif(3); // memanggil fungsi "deretDescendingRekursif" dengan parameter "n" yang isi nya adalah 5
System.out.println();
System.out.println("===========MENGGUNAKAN INTERATIF===========");
deretDescendingIteratif(5); // memanggil fungsi "deretDescendingIteratif" dengan parameter berisi bilangan 5

```

    ===========MENGGUNAKAN REKURSIF===========
    3 2 1 0 
    ===========MENGGUNAKAN INTERATIF===========
    5 4 3 2 1 0 

Penjelasan :

Alur kode program di atas :
Alur rekursif
- pada kode program di atas nilai dari parameter fungsi **deretDescendingRekursif** adalah 3. jadi angka 3 tadi di seleksi terlebih dahulu, apakah 3 lebih dari 0. jika iya maka akan menampilkan angka 3 tadi. kemudian angka 3 tadi masuk ke propses di mana "n-1". jadi "3-1" seterusnya berulang sampai nilai n yaitu 3 tadi bernilai 0.

Alur Iteratif:
- Sama dengan alur rekursif. Namun di fungsi iteratif menggunakan perulangan for. Kemudian angka nya di tampilkan

==> Kemudian jika proses di dalam fungsi tersebut sudah dibuat, maka fungsi tersebut di CALL. seperi **deretDescendingRekursif(3);** dan **deretDescendingIteratif(5);**. Baru nanti hasilnya akan muncul saat di run

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
int i = 1;
static int penjumlahanRekursif(int f) {
    if(i == f) 
        return 1;
    else {
        i++; 
        printf("+ %d ", i);
        return (i + penjumlahanRekursif(f));
    }
}

Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai faktorial : ");
int faktorial = sc.nextInt();
printf("1 ");
System.out.println("= " + penjumlahanRekursif(faktorial));

```

    Masukkan nilai faktorial : 9
    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
    

Penjelasan :

Pada fungsi **penjumlahanRekursif** mempunyai parameter f yang dimana nilai dari variabel f ini di dapatkan dari input user. Jadi variabel "faktorial" akan diisi oleh user menggunakan library sacnner, lalu nilainya ini akan masuk ke variabel "f". Setelah itu akan di cek kondisinya. Jika kondisi pertama sudah sesuai **if(i == f)** maka, akan me-return 1. atau secara tidak langsung seperti batas perulangan dan mengakhiri perulangan. Kemudian di kalkulasi mulai dari 1. Setelah itu variabel "i" di tampilkan, dan di return kan.

Pada main, mendeklarasikan scanner. memasukkan nilai faktorial yang di tampug di dalam variabel "faktorial". Angka 1 di print erlebih dahulu. Setelah itu menampilkan hasil dengan memanggil fungsi penjumlahanRekursif(faktorial) dengan parameternya juga.

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;

static void CekPrimaRekursif(int pembagi, int diBagi){
    if(pembagi == 1){ // sebagai base case. seperti menjadi batas dari perulangan.
        System.out.println("Bilangan Prima");
        System.out.println("Program Selesai");
    }else if (diBagi % pembagi == 0){ // kondisi untuk menentukan bahwa bilangan yang di inputkan "bukan" bilangan prima
        System.out.println("Bukan Bilangan Prima");
    }else if(diBagi % pembagi != 0){ // kondisi untuk menentukan bilanagn yang di inputkan adalah bilangan prima
        CekPrimaRekursif(pembagi - 1, diBagi); 
        
    }

}

Scanner sc = new Scanner(System.in); // deklarasi scanner
System.out.print("Masukkan Angka : ");
int angka = sc.nextInt(); // input nilai dari variabel angka
int angka2 = angka - 1; // nilai angka2 sama dengan angka - 1
CekPrimaRekursif(angka2, angka);
```

    Masukkan Angka : 7
    Bilangan Prima
    Program Selesai
    

Penjelasan :

Alur kode program di atas jika dijalankan
- User memasukkan nilai dari variabel "angka"
- kemudian nilai tersebut akan di cek di kondisi, akan masuk ke kondisi yang mana
- jika nilai memenuhi kondisi **(diBagi % pembagi == 0)** maka otomatis akan menampilkan kalimat **Bukan bilangan prima**
- Jika nilai memenuhi kondisi **(diBagi % pembagi != 0)** maka akan dilakukan proses dimana nilai yang di inputkan user tadi akan dikurangi -1. hal tersebut akan berulang terjadi sampai batas maksimal yaitu **if(pembagi == 1)** baru setelah itu dapat di nyatakan bahwa nilai tersebut adalah bilangan prima

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

static int fibonacci(int n, int x, int y) {
     if (n == 0) return x;
     if (n == 1) return y;
     System.out.println("Bulan ke-" + n);
     return fibonacci(n - 1, y, x + y);
}

System.out.println("=======================");
System.out.println("PASANGAN MARMUT");
System.out.println("=======================");
printf("Masukkan bulan : ");
int bulan = sc.nextInt();
printf("Pada bulan ke %d terdapat %d pasangan marmut", bulan , fibonacci(bulan, 0, 1));

```

    =======================
    PASANGAN MARMUT
    =======================
    Masukkan bulan : 12
    Bulan ke-12
    Bulan ke-11
    Bulan ke-10
    Bulan ke-9
    Bulan ke-8
    Bulan ke-7
    Bulan ke-6
    Bulan ke-5
    Bulan ke-4
    Bulan ke-3
    Bulan ke-2
    Pada bulan ke 12 terdapat 144 pasangan marmut

Penjelasan :

Kode program di atas digunakan untuk mencari berapa banyak pasangan marmut yang ada pada bulan 12. Menggunakan fungsu rekursi dan juga menggunakan fibonacci yang sistemnya menjumlahkan dua angka sebelumnya. Untuk input bulannya menggunakan input scanner yang berasal dari user. Kemudian nanti menampilkan hasilnya dengan memeanggil fungsi fibonacci.
