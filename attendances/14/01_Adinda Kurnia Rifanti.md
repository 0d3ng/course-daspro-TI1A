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

static int faktorialRekursif(int n) {
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


1. Fungsi rekursif adalah sebuah fungsi yang didalamnya terdapat perintah untuk memanggil dirinya sendiri sehingga proses pemanggilan fungsi akan terjadi berulang-ulang 

2. Fungsi rekursif biasanya digunakan untuk menyelesaikan permasalahan yang memiliki pola atau keteraturan, contohnya dalam menyelesaikan soal deret bilangan, faktorial, dan pangkat. 

3. Hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() adalah sama. Perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif adalah pada fungsi rekursif menggunakan pengulangan dengan struktur if-else dan pemberhentian pengulangannya akan langsung terjadi saat base case terpenuhi. Sedangkan pada fungsi iteratif, menggunakan pengulangan dengan struktur for/while dan pengulangan berhenti saat kondisi bernilai false.  

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
static int hitungPangkat (int x, int y){
    if (y == 0) {
        return (1);
    } else {
        return (x * hitungPangkat(x, y - 1));
    }
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bil,pangkat;
System.out.print("Bilangan yg dihitung : ");
bil = sc.nextInt();
System.out.print("Pangkat: ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bil,pangkat));
```

    Bilangan yg dihitung : 3
    Pangkat: 2
    9
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Pemanggilan fungsi tersebut akan dijalankan sampai sejumlah pangkat diinputkan dan tentunya saat base case (y == 0) terpenuhi.

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
static double hitungBunga(double saldo,int tahun){
    if(tahun == 0) {
        return(saldo);
    }else{
        return(1.11* hitungBunga(saldo,tahun - 1));
    }
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double saldoAwal;
int tahun;
System.out.print("Jumlah saldo awal : ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung(tahun) : ");
tahun = sc.nextInt();

System.out.print("Jumlah uang setelah " + tahun + "tahun : ");
System.out.println(hitungBunga(saldoAwal,tahun));
```

    Jumlah saldo awal : 5000000
    Lamanya menabung(tahun) : 1
    Jumlah uang setelah 1tahun : 5550000.000000001
    

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

base case: if(tahun == 0)

recursion call (mempunyai keyword return)
return(saldo);
return(1.11* hitungBunga(saldo,tahun - 1));

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Angka: ");
int angka = input.nextInt();
static int DeretDescendingRekursif(int angka){
    System.out.print(angka + "  ");
    if (angka == 0){  //base case
        return(0);
    } else {
        return(DeretDescendingRekursif(angka - 1)); //recursion call
    }
}
static void DeretDescendingIteratif(int angka){
     for(int i = angka; i >= 0; i--)
        System.out.print(i + "  "); 
    }
System.out.println("Fungsi Rekursif: ");
DeretDescendingRekursif(angka);
System.out.println("\n\nFungsi Iteratif: ");
DeretDescendingIteratif(angka);
```

    Masukkan Angka: 10
    Fungsi Rekursif: 
    10  9  8  7  6  5  4  3  2  1  0  
    
    Fungsi Iteratif: 
    10  9  8  7  6  5  4  3  2  1  0  

kode program diatas digunakan untuk mengurutkan angka dengan fungsi rekursif dan iteratif. pertama yaitu menggunakan scanner, kemudian menginput angka / bilangan yang nantinya akan diurutkan, berupa deret. Setelah input angka, kemudian menggunakan fungsi rekrsif. Jika rekursif menggunakan if else. Setelah itu, menggunakan fungsi iteratif yang ditandai dengan for. Kemudian bagian akhir menampilkan deret fungsi rekursif dan iteratif sebagai outputnya. 

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in); 
System.out.print("Bilangan faktorial: "); 
int bilangan = sc.nextInt(); 
static int PenjumlahanRekursif(int z){
    if (z == 0){ //base case
        return(0);
    } else {
        return(z + PenjumlahanRekursif(z - 1)); //recursion call
    }
}
System.out.print("Jumlah bilangan dari bilangan faktorial yang diinputkan adalah "); 
System.out.println(PenjumlahanRekursif(bilangan)); 
```

    Bilangan faktorial: 4
    Jumlah bilangan dari bilangan faktorial yang diinputkan adalah 10
    

Kode program diatas digunakan untuk menghitung penjumlahan dari bilangan faktorial yang diinputkan. Pertama, menggunakan scanner kemudian menginputkan bilangan faktorial yang akan dijumlahkan. Menggunakan static penjumlahan rekursif. Rekursif ditandai dengan if else. Kemudian, menampilkan output jumlah dari bilangan faktorial yang diinputkan. 

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Bilangan : "); 
int prima = input.nextInt();
static int NilaiRekursif(int x, int y) {
        if (y == 1){ //base case
            return (1);
        } else if (x % y == 0){ //recursion call
            return (0);
        } else {
          return (0 + NilaiRekursif(x, y - 1)); // recursion call
}
    }
 
        if (NilaiRekursif(prima, prima-1) == 1){
            System.out.println("Bilangan " + prima + " Merupakan Bilangan Prima");
        } else {
            System.out.println("Bilangan " + prima + " Bukan Bilangan Prima");
        }
```

    Masukkan Bilangan Yang Akan Dicek: 3
    Bilangan 3 Merupakan Bilangan Prima
    

Menggunakan scanner, kemudian menggunakan rekursif, seperti pada sebelumnya ditandai dengan if else. Pada kode program diatas, base case merupakan nilai batas yaitu (y == 1), dimana rekursif berakhir jika nilai batas terpenuhi. Jika recursion call, mempunyai keyword return, yang digunakan untuk mengembalikan nilai ke fungsi yang memanggilnya. Pada bagian yang dibawah, itu menggunakan if else juga, jika if bernilai true maka output yang tampil adalah bilangan tersebut merupakan bilangan prima. dan jika else maka bilangan yang diinputkan tersebut bukan merupakan bilangan prima. 



4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Bulan : ");
int bulan = input.nextInt();
static int MarRekursif(int a){
    if (a <= 1){
        return(a);
    } else {
        return(MarRekursif(a - 1) + MarRekursif(a - 2));
    }
}
System.out.print("Total Pasangan Marmut Bulan " + bulan + " Adalah " + MarRekursif(bulan) + " Ekor");
```

    Masukkan Bulan : 12
    Total Pasangan Marmut Bulan 12 Adalah 144 Ekor

Kode program diatas menggunakan scanner, dengan tahap pertama yaitu menginput bulan yang ingin kita lihat pada output nanti. Tahap kedua membuat fungsi static dengan nama MarRekursif. Rekursif ditandai dengan if else. Pada kode diatas, if (a <= 1){ merupakan base case dan  return(MarRekursif(a - 1) + MarRekursif(a - 2)); merupakan recursion call. Lalu, menampilkan otput dari kode program diatas. 
