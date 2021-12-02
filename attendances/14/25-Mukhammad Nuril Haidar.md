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
    } else {
        return (n*faktorialRekursif(n - 1));
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
static int faktorialRekursif(int n){
    if(n == 0){
        return (1);
    } else {
        return (n*faktorialRekursif(n - 1));
    }
}

static int faktorialIteratif(int n){
    int faktor = 1;
    for(int i = n; i >= 1; i--){
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


#### Jawab
1. Fungsi rekursif adalah seuah function yang menggunakan perulangan if else dan akan berhenti jika base case terpenuhi
2. Contohnya adalah untuk menghitung faktorial dari sebuah bilangan
3. Untuk hasil sama, alurnya jika faktorialRekursif() menggunakan perulangan if else yang jika base case nya belum terpenuhi ia akan mengulang fungsi yang sama, dan akan berhenti jika base case nya terpenuhi. Dan kalau jika faktorialIteratif() menggunakan perulangan for yang sudah dikenai kondisi sejak awal 

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
Scanner scan = new Scanner(System.in);
static int hitungPangkat(int x, int y){
    if (y == 0){
        return (1);
    } else {
        return (x * hitungPangkat(x, y - 1));
    }
}

System.out.print("Bilangan yang dihitung : ");
int bilangan = scan.nextInt();
System.out.print("Pangkat : ");
int pangkat = scan.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung : 2
    Pangkat : 2
    4
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

- Sampai base case terpenuhi

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

    Jumlah saldo awal : 2000000
    Lamanya menabung (tahun) : 4
    Jumlah uang setelah 4tahun : 3036140.8200000008

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

- tahun == 0 adalah base case dan else nya adalah recursion call

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
//Tuliskan jawaban tugas nomor 1
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

static int rekursif(int angka){
    System.out.print(angka + " ");
    if(angka == 0){
        return(0);
    } else {
        return(rekursif(angka - 1));
    }
}

static void iteratif(int angka){
    for(int i = angka; i >= 0; i--){
        System.out.print(i + " ");
    }
}

System.out.print("Masukkan Angka : ");
int a = scan.nextInt();
System.out.print("Fungsi Rekursif : ");
rekursif(a);
System.out.println();
System.out.print("Fungsi Iteratif : ");
iteratif(a);
```

    Masukkan Angka : 5
    Fungsi Rekursif : 5 4 3 2 1 0 
    Fungsi Iteratif : 5 4 3 2 1 0 

- Pada rekursif() menggunakan perulangan if else yang akan berhenti memunculkan angka jika angka yang telah diproses di recursion call sudah mencapai 0, sedangkan pada iteratif() perulangan akan berhenti jika decrement dari angka sudah mencapai 0

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

static int jumlah(int angka){
    if(angka == 1){
        return(1);
    } else {
        return(angka + jumlah(angka - 1));
    }
}

System.out.print("Masukkan Angka : ");
int a = scan.nextInt();
for(int i = 1; i <= a; i++){
    if(i == a){
        System.out.print(i + " = ");
    } else {
        System.out.print(i + " + ");
    }
}
System.out.print(jumlah(a));
```

    Masukkan Angka : 5
    1 + 2 + 3 + 4 + 5 = 15

- Untuk menghitung bilangan berurutan tersebut digunakan fungsi rekursif yang akan menghitung dari recursion call yang parameter nya adalah angka - 1, sehingga akan berurutan hingga base case nya terpenuhi

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

System.out.print("Masukkan Angka : ");
int a = scan.nextInt();

static int prima(int angka, int b){
    if(b == 1){
        return(1);
    }else if(angka % b == 0){
        return(0);
    } else {
        return(prima(angka, b - 1));
    }
}

if(prima(a, a - 1) != 0){
    System.out.print("Prima");
} else {
    System.out.print("Bukan Prima");
}
```

    Masukkan Angka : 567
    Bukan Prima

- Untuk menghitung bilangan prima atau bukan menggunakan fungsi rekursif maka base case nya jika perulangan sudah mencapai 1 kali maka bilangan tersebut bukan bilangan prima karena tidak ada angka yang bisa membagi angka yang telah ditentukan tanpa sisa

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

static int hitung(int bulan){
    if(bulan <= 2){
        return(1);
    } else {
        return(hitung(bulan-1) + hitung(bulan-2));
    }
}

System.out.print("Masukkan Bulan : ");
int a = scan.nextInt();
System.out.print(hitung(a));
```

    Masukkan Bulan : 6
    8

- Kode tersebut menggunakan rumus dari bilangan fibonacci yaitu Un = Un-2 + Un-1
