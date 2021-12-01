# JOBSHEET 14 Fungsi 2

## Tujuan
* Mahasiswa memahami konsep fungsi rekursif
* Mahasiswa mampu mengimplementasikan fungsi rekursif dalam kode program



## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

Nama : Diah Putri Nofianti

NIM : 2141720054

### Percobaan 1
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung nilai faktorial dari suatu bilangan dengan menggunakan fungsi rekursif. Selain itu, akan dibuat juga fungsi untuk menghitung nilai faktorial dengan menggunakan algoritma iteratif sebagai pembandingnya

1. Buat fungsi static dengan nama **faktorialRekursif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya

    ![Gambar 1](images/code14-1.png)


```Java
static int faktorialRekursif(int n){
    if (n==0){
        return (1);
    } else {
        return (n*faktorialRekursif(n-1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
static int faktorialIteratif(int n){
    int faktor=1;
    for (int i=n; i>=1; i--){
        faktor=faktor*i;
    }
    return faktor;
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
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

*1. Fungsi rekursif itu fungsi yang di dalamnya memanggil dirinya sendiri, jadi prosesnya akan terjadi berulang-ulang (karena adanya recursion call) sampai kondisi base case terpenuhi.*

*2. Contoh kasusnya yang bisa menggunakan fungsi rekursif antara lain menghitung nilai faktorial, pangkat, deret bilangan, FPB, KPK, fibonacci.*

*3. Ya, hasilnya sama.*

*a) fungsi rekursif ini di dalamnya memanggil dirinya sendiri di bagian recursion call jadi ia tak memakai perulangan, cukup dengan membuat batasan kondisi di base case yang jika terpenuhi maka pemanggilan tersebut berhenti.*

*faktorialRekursif() untuk recursion callnya adalah nilai n yang dikalikan dengan pemanggilan fungsi ini sendiri dengan parameter n yang dikurangi satu (decrease) agar setiap pemanggilan dan pengembalian nilainya berbeda dan semakin mendekati kondisi batas, base casenya yakni jika nilai n sudah mencapai 0 maka nilai dikembalikan menjadi 1.*

*b) fungsi faktorialIteratif() disini menggunakan perulangan yang sebelumnya dibuat dulu variabel faktor yang diinisialisasikan nilai awal 1 untuk nanti menampung hasil dari pengembalian proses faktorisasi pada perulangan.*

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
static int hitungPangkat(int x, int y){
    if (y==0){
        return (1);
    } else {
        return (x*hitungPangkat(x, y-1));
    }
}

import java.util.Scanner;
Scanner sc=new Scanner(System.in);

System.out.print("Bilangan yang dihitung : ");
int bil=sc.nextInt();

System.out.print("Pangkat : ");
int pangkat=sc.nextInt();

System.out.println(hitungPangkat(bil, pangkat));
```

    Bilangan yang dihitung : 9
    Pangkat : 3
    729
    

#### Pertanyaan
Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

#### Jawaban
*Fungsi rekursif berhenti jika kondisi base case nya terpenuhi. Disini base case nya fungsi hitungPangkat adalah jika y sudah mencapai 0 maka pemanggilan fungsi selesai. Yang mana y menampung nilai dari pangkat, jika sudah pangkat 0 lalu dikembalikan nilainya menjadi 1 karena nilai apapun jika dipangkatkan 0 hasilnya 1.*

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
static double hitungBunga(double saldo, int tahun){
    if(tahun==0){
        return (saldo);
    } else {
        return (1.11*hitungBunga(saldo, tahun-1));
    }
}

import java.util.Scanner;
Scanner sc=new Scanner(System.in);

System.out.print("Jumlah saldo awal : ");
int saldoAwal=sc.nextInt();

System.out.print("Lamanya menabung (tahun) : ");
int tahun=sc.nextInt();

System.out.print("Jumlah uang setelah "+tahun+" tahun : ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal : 1000000
    Lamanya menabung (tahun) : 3
    Jumlah uang setelah 3 tahun : 1367631.0000000002
    

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

***base case***


```Java
if(tahun==0) {    
      return (saldo);
     }
```

***recursion call***


```Java
else {
       return (1.11*hitungBunga(saldo, tahun-1));
    }
```

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
static int descendingRekursif(int n){
    if (n==0){
        return (0);
    } else {
        System.out.print(n+" ");
        return (descendingRekursif(n-1));
    }
}


static int descendingIteratif(int n){
    int desc=0;
    for (int i=n; i>0; i--){
        System.out.print(i+" ");
    }
    return desc;
}

import java.util.Scanner;
Scanner sc=new Scanner(System.in);

System.out.print("Masukkan deret bilangan : ");
int x=sc.nextInt();

System.out.println("\nFungsi Rekursif :");
System.out.print(descendingRekursif(x));

System.out.println("\n\nFungsi Iteratif :");
System.out.print(descendingIteratif(x));
```

    Masukkan deret bilangan : 9
    
    Fungsi Rekursif :
    9 8 7 6 5 4 3 2 1 0
    
    Fungsi Iteratif :
    9 8 7 6 5 4 3 2 1 0

***Penjelasan :***

*Hampir sama seperti Percobaan 1, hanya saja disini ada beberapa bagian yang perlu diubah. Selain bilangannya yang dapat ditentukan dari inputan, pada fungsi descendingRekursif() recursion call tidak perlu dikalikan dengan nilai parameter, jadi langsung memanggil diri sendiri dengan nilai n yang dikurangi satu dan perlu langsung ditampilkan di setiap pemanggilan. Untuk fungsi descendingIteratif() pun perulangan yang dibuat untuk menampilkan nilai n, yang setiap perulangan akan di decrement sampai berakhir ditampilan angka 0.*

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
static int penjumlahanRekursif(int p){
    if (p==0){
        return (0);
    } else {
        return (p+penjumlahanRekursif(p-1));
    }
}

System.out.print("Masukkan bilangan : ");
int x=sc.nextInt();

System.out.println("Hasil penjumlahan : "+penjumlahanRekursif(x));
```

    Masukkan bilangan : 8
    Hasil penjumlahan : 36
    

***Penjelasan :***

*penjumlahanRekursif() ini memiliki parameter p yang digunakan untuk proses di dalam fungsi. Jadi recursion callnya nilai p ditambah dengan pemanggilan fungsi ini sendiri dengan nilai p dikurangi satu. Dan juga untuk terpenuhi base casenya jika p sudah mencapai 0 maka akan nilai yang dikembalikan akan 0.*

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
static int cekPrima(int a, int b){
    if (b==1){
        return (1);
    } else if (a%b==0){
        return (1+cekPrima(a, b-1));
    } else {
        return (cekPrima(a, b-1));
    }
}

import java.util.Scanner;
Scanner sc=new Scanner(System.in);

for (int i=0; true; i++){
System.out.print("Masukkan bilangan : ");
int c=sc.nextInt();
    
    if (c<=0){
    System.out.print("-");
    break;
    }
    
        if (cekPrima(c,c)==2){
            System.out.println("Faktornya ada "+cekPrima(c,c));
            System.out.printf("Jadi, %d => Bilangan prima",c);
        } else {
            System.out.println("Faktornya ada "+cekPrima(c,c));
            System.out.printf("Jadi, %d => Bukan bilangan prima",c);
        }
    System.out.println("\n");
}
```

    Masukkan bilangan : 1
    Faktornya ada 1
    Jadi, 1 => Bukan bilangan prima
    
    Masukkan bilangan : 2
    Faktornya ada 2
    Jadi, 2 => Bilangan prima
    
    Masukkan bilangan : 5
    Faktornya ada 2
    Jadi, 5 => Bilangan prima
    
    Masukkan bilangan : 9
    Faktornya ada 3
    Jadi, 9 => Bukan bilangan prima
    
    Masukkan bilangan : 10
    Faktornya ada 4
    Jadi, 10 => Bukan bilangan prima
    
    Masukkan bilangan : 0
    -

***Penjelasan :***

*Untuk mengecek bilangan prima atau bukan disini user diminta menginputkan bilangan yang ingin dicek, dibuat perulangan untuk inputnya, agar perulangan meminta input berhenti, user perlu menginputkan angka 0. Beralih pada proses pengecekan, inputan akan di periksa dalam fungsi cekPrima() yang mana parameter a adalah untuk bilangan asli inputan tadi dan parameter b untuk pembaginya (karena nanti akan dikurangi satu setiap pemanggilan). Pada base casenya adalah jika b sudah mencapai 1 maka nilai yang dikembalikan 1. Kemudian dibuat kondisi jika a%b itu 0 lalu dipanggil fungsi ini sendiri, untuk mengetahui ada berapa faktor yang bisa membagi bilangan tersebut. Jika faktornya ada 2 maka bilangan itu termasuk bilangan prima, selain itu maka bilangan itu bukanlah prima.*

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
static int fibonacciRekursif(int x){
    if(x<=1){
        return (x);
    } else {
        return (fibonacciRekursif(x-1)+fibonacciRekursif(x-2));
    }
}

import java.util.Scanner;
Scanner sc=new Scanner(System.in);

for (int i=0; true; i++){
System.out.print("Tentukan : bulan ke-");
int y=sc.nextInt();
    
if (y<=0||y>12){
    System.out.print("-");
    break;
    }  
    System.out.println("Total pasangan marmut => "+fibonacciRekursif(y));
    System.out.println();
}
```

    Tentukan : bulan ke-12
    Total pasangan marmut => 144
    
    Tentukan : bulan ke-5
    Total pasangan marmut => 5
    
    Tentukan : bulan ke-9
    Total pasangan marmut => 34
    
    Tentukan : bulan ke-0
    -

***Penjelasan :***

*Dengan menginputkan bulan sekian, user dapat mengecek total pasangan marmut yang ada pada bulan tersebut. Menggunakan fungsi fibanocciRekursif() untuk mengolah penjumlahan fibonacci total pasangan marmutnya sesuai bulan dengan base case jika parameter x lebih besar sama dengan 0 maka nilai yang dikembalikan adalah x itu sendiri. Untuk recursion callnya memanggil fungsi sendiri dengan nilai x dikurangi 1 lalu ditambah pemanggilan lagi dengan x dikurangi 2 (agar bisa jadi deret fibonacci). Jadi nanti hasil akhirnya akan dikembalikan nilai yang sudah diproses tadi ke fungsi.*
