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
    }else{
        return (n*faktorialRekursif(n-1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialRekursif(int n){
 int faktor =1;
    for(int i =n; i>=1; i--){
        faktor = faktor*i;
    }
    return faktor;
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
static int faktorialRekursif(int n){
    if (n==0){
        return (1);
    }else{
        return (n*faktorialRekursif(n-1));
    }
}
static int faktorialIteratif(int n){
 int faktor =1;
    for(int i =n; i>=1; i--){
        faktor = faktor*i;
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
1. Fungsi rekursif adalah metode perulangan yang terjadi akibat pengeksekusian suatu fungsi yang mana fungsi tersebut memanggil dirinya sendiri. Bisa jadi ia terus memanggil dirinya sendiri tanpa batas, atau mungkin dia akan berhenti jika kondisi tertentu terpenuhi
2. contoh kasus penggunaan fungsi rekursif seperti faktorial dan fbonacci
3. sama, perbedaannya adalah rekursif menggunakan struktur seleksi (if-else) sedangkan iteratih menggunakan struktur repetisi(for/while)

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
    if (y==0){
        return (1);
    }else{
        return (x*hitungPangkat(x, y -1));
    }
}
Scanner sc = new Scanner (System.in);
int bil, pang;
System.out.print("Bilangan yang dihitung : ");
bil = sc.nextInt();
System.out.print("Pangkat : ");
pang = sc.nextInt();
System.out.println(hitungPangkat(bil,pang));
```

    Bilangan yang dihitung : 5
    Pangkat : 2
    25


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

#### Jawaban
proses pemanggilan fungsi tersebut akan berhenti sampai y==0

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
    if (tahun ==0 ){
        return (saldo);
    }else{
        return (1.11*hitungBunga(saldo, tahun -1));
    }
}
Scanner sc = new Scanner (System.in);
int saldoAwal, tahun;
System.out.print("Jumlah saldo awal : ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung(tahun) : ");
tahun = sc.nextInt();
System.out.print("Jumlah uang setelah" + tahun + " tahun: ");
System.out.println(hitungBunga(saldoAwal,tahun));


```

    Jumlah saldo awal : 20000
    Lamanya menabung(tahun) : 1
    Jumlah uang setelah1 tahun: 22200.000000000004


#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

#### Jawaban
base case = tahun ==0
recursion call = 1.11*hitungBunga(saldo, tahun -1)

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static int DeretDescendingRekursif(int n){
    System.out.print(n+" ");
    if (n==0){
        return (0);
    }else{
        return (n+DeretDescendingRekursif(n-1));
    }
}
static int DeretDescendingIteratif(int n){
 int faktor =0;
    for(int i =n; i>=0; i--){
        System.out.print(i+" ");
        faktor = faktor+i;
    }
    return faktor;
}
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int nilai = sc.nextInt();
System.out.println("Deret Descending Rekurtif");
DeretDescendingRekursif(nilai);
System.out.println();
System.out.println("Deret Descending Iteratif");
DeretDescendingIteratif(nilai);
```

    Masukkan nilai N = 5
    Deret Descending Rekurtif
    5 4 3 2 1 0 
    Deret Descending Iteratif
    5 4 3 2 1 0 




    15


user akan menginputkan bilangan ya diakan di masukkan ke fungsi rekursif dan akan memanggil dirinya sendiri yang nilainya dikurang satu dan akan berulang sampai nilai pada fungsi sampai 0. pada fungsi iteratif malakukan looping yang dimulai dari nilai yang dimasukkan user sampai nilai pada fungsi mencpai 0



2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int penjumlahanRekursif(int f){
    if (f==1){
        System.out.print(f + " = ");
    }else{
        System.out.print(f + " + ");
    }
    if (f==1){
        return (1);
    }else{
        return (f+penjumlahanRekursif(f-1));
    }
}
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai F = ");
int nilai = sc.nextInt();
System.out.println(penjumlahanRekursif(nilai));
```

    Masukkan nilai F = 5
    5 + 4 + 3 + 2 + 1 = 15


user akan menginputkan nilai f dan akan di seleksi menggunkan fungsi rekursif. jika nilai fungsi samadengan 1 makan akan di print = dan jika tidak maka akan +. fungsi ini akan memanggil dirinya sendiri yang nilainya dikurang 1 dan akan berulang sampai nilai fungsi samadengan 1


3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
static int CekPrimaRekursif(int x, int y){
    if (y==1){
        return 1;
    }else if( x % y == 0){
        return 1 + CekPrimaRekursif(x, --y);
    }else{
        return 0 + CekPrimaRekursif(x, --y);
    }
}

public static boolean  CekPrimaRekursif(int bil){
    if(bil > 2){
        return (CekPrimaRekursif(bil,bil) == 2);
    }else{
        return false;
    }
}
Scanner sc = new Scanner(System.in);
System.out.print(" Masukkan bilangan yang ingin di cek = ");
int bilprim = sc.nextInt();
if (CekPrimaRekursif(bilprim)){
    System.out.print(" Bilangan Prima");
}else{
    System.out.print("Bukan Bilangan Prima");
}

```

     Masukkan bilangan yang ingin di cek = 3
     Bilangan Prima


user akan menginputkan nilau yang akan diolah di fuungsi pertama dan di fungsi pertama akan menyeleksi lagi ika nilai yang diinputkan lebih dari 1 maka akan dilanjut ke fungsi selanjutnya dan jika nilai kurang dari 1 maka bukan bilangan prima. fungsi berikutnya mengecek jika bilangan sama dengan 1 , maka akan selesai dan jika tidak akan looping dengan rumus  1 + CekPrimaRekursif(x, --y) dan 
0 + CekPrimaRekursif(x, --y) sampai x tidak menyisakan 0. jika pada fungsi menghasilkan false makan outputnya adalah bilangan prima dan jika tidak maka outputnya adalah bukan bilangan prima

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int fibonacci(int n){
    if (n<=1){
        return n;
    }else{
        return (fibonacci (n-1))+(fibonacci(n-2));
    }
}
Scanner sc = new Scanner(System.in);
System.out.print(" Masukkan bulan : ");
int bulan = sc.nextInt();
System.out.print("pasangan marmut yang ada pada bulan ke " +bulan+ " adalah " +fibonacci(bulan));
```

     Masukkan bulan : 12
    pasangan marmut yang ada pada bulan ke 12 adalah 144


angka yang di inputkan oleh user akan diseleksi dengan fungsi rekursif untuk mengetahui setara dengan baris keberapa dalam deret fibonacci. fungsi rekursif akan tetap berjalan sampai n dalam deret fibonacci tidak mencapai 1 dan 0. fungsi ini akan berjalan dengna cara mengurangi bilangan pada fungsi (fibonacci (n-1))+(fibonacci(n-2)); itu akan dilakukan secara terus menerus sampai x mencpai 1 dan 0

