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
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n){
    int faktor = 1;
    for (int i = n; i >= 1; i--){
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


**Jawaban**
1. Fungsi rekursif adalah fungsi yang di dalamnya memanggil fungsi itu sendiri secara berulang hingga base case terpenuhi.
2. Contoh penggunaan rekursif yaitu kita dapat menghitung hasil faktorial seperti kode program pada percobaan 1. Fungsi rekursif juga dapat digunakan untuk menyelesaikan masalah yang dapat dipecah menjadi bagian-bagian lebih kecil serta bersifat repetitif seperti persoalan deret bilangan, fibonacci, pemfaktoran, perpangkatan, dan lain-lain.
3. Hasil yang diberikan kedua fungsi sama, hanya saja berbeda alur berjalannya program.
 - **Fungsi Rekursif**
<br>Pada fungsi rekursif, nilai n akan terus dikurangi seperti dipecah hingga nilai n memenuhi base case yaitu `(n == 1)`. Setelah base case terpenuhi, maka akan mereturn nilai 1, lalu nilai 1 akan dikalikan dengan fungsi yang dipecah sebelumnya yaitu pada `2 * hitungFaktorialRekursif(1)` sehingga akan mereturn nilai `2*1`. Begitu seterusnya hingga hitungFaktorialRekursif yang memiliki argumen 5, sehingga ditemukan hasilnya yaitu 120.
 - **Fungsi Iteratif**
<br>Pada fungsi iteratif, menggunakan perulangan for. Nilai n akan dikalikan dengan n dikurangi 1 sesuai dengan decreement hingga terpenuhi kondisi perulangan tersebut yaitu `i >= 1`. Di dalam perulangan terdapat operator assignment yang menyimpan hasil perkalian. Setelah perulangan selesai, fungsi iteratif akan mereturn hasil dari faktorial menggunakan perulangan tadi.

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

    Bilangan yang dihitung: 3
    Pangkat: 2
    9


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

**Jawaban**
1. Proses tersebut akan dijalankan hingga base case terpenuhi, yaitu ketika nilai y sama dengan 0 yang ditunjukkan oleh baris kode `if (y == 0)`.

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
    }else{
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

    Jumlah saldo awal: 100000
    Lamanya menabung (tahun): 3
    Jumlah uang setelah 3 tahun: 136763.10000000003


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

**Jawaban**
1. - Base Case <br>
`if (tahun == 0){
        return (saldo);
}`
 - Recursion call <br>
`else{
        return (1.11 * hitungBunga(saldo, tahun - 1));
}`

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1

static int deretDescendingRekursif(int bil){
    System.out.print(bil + " ");
    if(bil == 0){
        return (0);
    }else{
        return deretDescendingRekursif(bil - 1);
    }
}

static void deretDescendingIteratif(int bil){
    for(int i = bil; i >= 0; i--){
        System.out.print(i + " ");
    }
}

System.out.println("Deret Descending Rekursif: ");
deretDescendingRekursif(10);

System.out.println("\nDeret Descending Iteratif: ");
deretDescendingIteratif(10);
```

    Deret Descending Rekursif: 
    10 9 8 7 6 5 4 3 2 1 0 
    Deret Descending Iteratif: 
    10 9 8 7 6 5 4 3 2 1 0 

Pada baris kode program diatas, terdapat dua fungsi yaitu fungsi `deretDescendingRekursif` dan `deretDescendingIteratif`. Pada `deretDescendingRekursif` menggunakan fungsi rekursif yang akan melakukan print setiap bilangan dilakukan pengurangan pada recursion call dan akan berhenti jika bilangan telah mencapai nilai nol. Sedangkan pada fungsi `deretDescendingIteratif`, akan dilakukan print setiap perulangan yang dilakukan di dalam perulangan for.

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2

static int penjumlahanRekursif(int bil, int maks){
    if(bil == maks){
        System.out.printf("%d = ", bil);
        return (bil);
    }else{
        System.out.printf("%d+", bil);
        return bil + penjumlahanRekursif(bil + 1, maks);
    }
}

penjumlahanRekursif(1, 8);
```

    1+2+3+4+5+6+7+8 = 




    36



Pada baris kode program diatas, fungsi `penjumlahanRekursif` merupakan fungsi rekursif yang akan melakukan penghitungan penjumlahan dan melakukan print urutan penjumlahan. Argumen pertama berfungsi untuk nilai bilangan pertama dan argumen kedua untuk bilangan maksimal. Base call nya adalah ketika bilangan yang dijumlah mencapai bilangan maksimal pada argumen. Jadi, pada recursion call, bilangan akan dijumlahkan dengan bilangan dijumlah 1, setelah itu akan diprint bilangan yang akan dijumlah, berulang kali seperti itu hingga kondisi pada base call terpenuhi, sehingga akan mereturn bilangan dan melakukan print bilangan terakhir. Lalu akan diakumulasi semuanya sehingga didapat total dari penjumlahan tersebut.

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3

import java.util.Scanner;

static String cekPrimaRekursif(int bil, int faktor){
    if(bil <= 2){
        if(bil == 2){
            return "bilangan prima";
        }else{
            return "bukan bilangan prima";
        }
    }
    
    if(bil % faktor == 0){
        return "bukan bilangan prima";
    }
    
    if(bil < faktor * faktor){
        return "bilangan prima";
    }
    
    return cekPrimaRekursif(bil, faktor + 1);
}

Scanner input = new Scanner(System.in);

System.out.print("Masukkan bilangan yang akan di cek: ");
int n = input.nextInt();
System.out.print("Bilangan " + n + " " + cekPrimaRekursif(n,2));
```

    Masukkan bilangan yang akan di cek: 9
    Bilangan 9 bukan bilangan prima

Pada baris kode program diatas, terdapat fungsi `cekPrimaRekursif` yang digunakan untuk menentukan apakah sebuah bilangan merupakan bilangan prima atau bukan menggunakan fungsi rekursif. Pada fungsi tersebut menggunakan nilai kembalian berupa String. Pada awalnya terdapat 2 parameter yaitu `bil` dan `faktor`. Parameter `bil` berfungsi untuk menampung nilai dari bilangan yang akan diketahui apakah bilangan prima atau bukan. Sedangkan parameter `faktor` akan diawali diisi dengan nilai 2 karena bilangan prima terkecil adalah 2. 

Kemudian pada fungsi `cekPrimaRekursif` akan dilakukan pengecekan apakah bilangan kurang dari sama dengan 2, jika iya maka akan di cek lagi, jika bilangan adalah 2 maka benar bahwa bilangan tersebut adalah bilangan prima, jika tidak, yang berarti bilangan bernilai 1, maka bilangan tersebut bukanlah bilangan prima.

Lalu, jika bilangan di modulus dengan faktor saat itu bernilai 0 maka bilangan tersebut bukanlah bilangan prima, karena bilangan prima hanya memiliki faktor bilangan itu sendiri dan 1.

Setelah itu, jika bilangan kurang dari kuadrat faktor saat itu maka bilangan tersebut adalah bilangan prima. Sebagai contoh, jika bilangan adalah 3 dan faktor masih awal yaitu 2, maka 3 merupakan bilangan prima karena 3 lebih dari 2 dan 3 kurang dari kuadrat bilangan prima terkecil.

Dan pada akhirnya akan dilakukan recursion call untuk meningkatkan nilai dari faktor dan mencari hingga terdapat base call yang terpenuhi.

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4

static int marmutFibonacci(int bil){
    if(bil <= 1){
        return bil;
    }
    else{
        return marmutFibonacci(bil - 1) + marmutFibonacci(bil - 2);
    }
}

marmutFibonacci(12);
```




    144



Pada baris kode program diatas, sesuai dengan salah satu cara penggunaan fungsi rekursif, pada recursion call tinggal memanggil rumus dari deret yang akan dicari totalnya. Rumus dari fibonacci adalah Fn = Fn-1 + Fn-2, sehingga pada recursion call tinggal memanggil rumus fibonacci tersebut. Lalu pada base call, dilakukan pengkondisian jika bilangan kurang dari sama dengan 1 yaitu 0 dan 1. Jadi, pada pemanggilan recursion call akan dipecah terus menerus hingga base call melakukan return dua nilai yaitu 0 dan 1, kemudian semuanya akan dijumlah hingga didapat total dari fibonacci.


```Java

```
