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
    if (n==0){
        return (1);
    } else {
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



```Java
Jawab:
1. fungsi yang memuat looping di dalamnya tanpa menggunakan code program dari looping sendiri dan mempunyai alur dengan cara memanggil fungsi tersebut secara berulang-ulang.
2. untuk contoh kasus penggunaan fungsi rekursif sendiri bisa kasus soal faktorial, fibonacci, dan lain-lain.
3. Kalau fungsi rekursif melakukan perulangan dengan memanggil fungsi rekursif dirinya sendiri dan menggunakan struktur seleksi(if-else). Sedangkan fungsi iteratif di dalamnya menggunakan struktur repetisi(for/while)
```

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
    if(y == 0){
        return (1);
    } else {
        return (x * hitungPangkat(x, y-1));
    }
}
Scanner sc = new Scanner(System.in);

System.out.print("Bilangan yang dihitung: ");
int bilangan = sc.nextInt();
System.out.print("Pangkat: ");
int pangkat = sc.nextInt();
System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung: 3
    Pangkat: 3
    27


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!


```Java
fungsi rekursif hitungPangkat(bilangan, pangkat) berjalan sampai nilai dari variabel y mencapai sesuai keadaan yaitu y = 0.
```

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
    if(tahun == 0){
        return saldo;
    } else {
        return(1.11 * hitungBunga(saldo, tahun - 1));
    }
}

System.out.print("Jumlah saldo awal: ");
int saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun): ");
int tahun = sc.nextInt();
System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal: 50000
    Lamanya menabung (tahun): 3
    Jumlah uang setelah 3 tahun: 68381.55000000002


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!


```Java
Jawab:
1. yang merupakan base case yaitu sintak if yang menyatakan kondisi tahun == 0, sedangkan recursion call yaitu sintak else yang menyatakan code dari fungsi hitungBunga.
```

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static int DeretDescendingRekursif(int n){
    System.out.println(n);
    if(n == 0){
        return 0;
    } else {
        return (DeretDescendingRekursif(n-1));
    }
}
static void DeretDescendingIteratif(int n){
    for(int i = n; i >= 0; i--){
        System.out.println(i);
    }
}
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan n: ");
int n = sc.nextInt();    
System.out.println("Fungsi rekursif: ");
DeretDescendingRekursif(n);
System.out.println("Fungsi iteratif: ");
DeretDescendingIteratif(n);
```

    Masukkan n: 6
    Fungsi rekursif: 
    6
    5
    4
    3
    2
    1
    0
    Fungsi iteratif: 
    6
    5
    4
    3
    2
    1
    0

Penjelasan: 

Untuk menampilkan bilangan n sampai 0, pertama kita membuat scanner untuk menginputkan bilangan untuk mengisi n. Lalu, bilangan tersebut masuk pada fungsi DeretDescendingRekursif dan DeretDescendingIteratif. Setelah itu, nilai akan diproses sesuai rumus yaitu nilai tersebut dikurangi 1 sampai nilai tersebut/n = 0. Setelah itu hasil dari fungsi DeretDescendingRekursif dan DeretDescendingIteratif dicetak.

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int PenjumlahanRekursif(int f){
    if(f == 1){
        System.out.print(f + " = ");
    } else {
         System.out.print(f + " + ");
    }
    if(f==1){
        return f;
    } else {
        return f + PenjumlahanRekursif(f-1);
    }
}
Scanner gas = new Scanner(System.in);
System.out.print("Masukkan bilangan f: ");
int bil = gas.nextInt();
System.out.println(PenjumlahanRekursif(bil));
```

    Masukkan bilangan f: 3
    3 + 2 + 1 = 6

Penjelasan:

Untuk membuat perhitungan faktorial seperti soal, pertama inputkan angka untuk menentukan faktorial yang diminta, lalu nilai tersebut ditampung pada variabel bil dan variabel bil dimasukkan dalam fungsi PenjumlahanRekursif pada parameter f dan akan diproses sesuai dengan rumus yang terdapat pada fungsi tersebut yaitu (f + PenjumlahanRekursif(f-1)), fungsi tersebut diulang sampai f sama dengan 1 dan bilangan tersebut akan dijumlah serta hasilnya dicetak.

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
static int CekPrimaRekursif(int n, int indeks){
    if(indeks == 1){
        return 1;
    } else if (n % indeks == 0){
            return 1 + CekPrimaRekursif(n, --indeks);
    } else {
            return 0 + CekPrimaRekursif(n, --indeks);
    }
}
 
public static boolean CekBilanganPrima(int bil){
        if (bil > 1){
            return (CekPrimaRekursif(bil, bil) == 2);
        } else {
            return false;
    }
}
Scanner pip = new Scanner(System.in);
System.out.print("Masukkan bilangan yang ingin dicek: ");
int bilPrima = pip.nextInt();
if(CekBilanganPrima(bilPrima)){
    System.out.println("Bilangan Prima");
} else {
    System.out.println("Bukan Bilangan Prima");
}
```

    Masukkan bilangan yang ingin dicek: 4
    Bukan Bilangan Prima

Penjelasan:

Untuk menentukan bilangan bilangan prima. Pertama, menginputkan nilai yang ingin dicek. Lalu, nilai tersebut diproses pada fungsi pertama jika nilai kurang dari 1 maka nilai tersebut bukan bilangan prima dan jika lebih dari 1 maka akan diproses pada fungsi berikutnya. Fungsi berikutnya mengecek jika bilangan tersebut sama dengan 1, maka fungsi akan selesai dan jika tidak maka akan berlanjut looping dengan rumus "1 + CekPrimaRekursif(n, --indeks)" dan juga "0 + CekPrimaRekursif(n, --indeks)" sampai  x jika dibagi y tidak menyisakan 0.  Jika pada fungsi CekPrimaRekursif menghasilkan false, maka akan menghasilkan output bukan bilangan prima, namun jika tidak, maka akan menghasilkan output bukan bilangan prima.

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int Fibonacci(int p){
    if(p <= 1){
        return p;
    } else {
        return (Fibonacci(p-1) + Fibonacci(p-2));
    }
}
Scanner pip = new Scanner(System.in);
System.out.print("Masukkan bulan: ");
int bul = pip.nextInt();
System.out.println("Pasangan marmut pada bulan ke " + bul + " adalah " + Fibonacci(bul));
```

    Masukkan bulan: 12
    Pasangan marmut pada bulan ke 12 adalah 144

Penjelasan:

Untuk membuat pola fibonacci yang berfungsi menentukan jumlah pasangan marmut pada bulan ke-12. Pertama, memasukkan nilai angka yang berfungsi untuk inisialisasi bulan yang ingin dicek jummlah pasangannya. Lalu, nilai tersebut diproses di dalam fungsi Fibonacci dengan rumus "Fibonacci(p-1) + Fibonacci(p-2)". Kemudian, jika nilai fibonacci mencapai kurang dari sama dengan 1, maka bilangan tersebut akan ditampung sesuai dengan nilai p. Seluruh bilangan yang ditampung tersebut akan dijumlahkan dan hasil tersebut dicetak