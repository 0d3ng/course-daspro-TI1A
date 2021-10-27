<dl>
  <dt>NIM :</dt>
  <dd>2141720124</dd>

  <dt>Nama :</dt>
  <dd>Taufiqy Firdaus Jatu</dd>
    
  <dt>Kelas :</dt>
  <dd>TI-1A</dd>
</dl>


___


# JOBSHEET 09 - Perulangan 2

## Tujuan
+ Mahasiswa memahami konsep perulangan bersarang (_nested loop_)
+ Mahasiswa dapat menjelaskan format penulisan perulangan bersarang (_nested loop_)
+ Mahasiswa dapat mengimplementasikan _flowchart_ perulangan bersarang menggunakan bahasa pemrograman Java

## Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet
+ Anaconda3 + Java kernel (opsional)

## Praktikum
### Percobaan 1: Bintang Persegi
1. Perhatikan Flowchart di bawah ini
![Gambar 0](images/img-00.png)
> flowchart di atas digunakan untuk menggambar sebuah persegi dengan simbol * (bintang)
2. Pada percobaan ke-1 akan dilakukan percobaan tentang _nested loop_. Kasus yang akan diselesaikan adalah untuk membuat tampilan persegi * , dengan panjang sisi sebanyak N. Misalkan N dimasukan **5**, maka hasilnya adalah
![Gambar 1](images/img-01.png)
3. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
4. Ketikan kode program di bawah ini
![Gambar 2](images/img-02.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4 di atas
import java.util.Scanner;

int N;
Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = in.nextInt();

for(int i = 0; i <= N; i++) {
    System.out.print("*");
}
```

    Masukkan nilai N : 5
    ******

5.	Perhatikan sintaks perulangan yang digunakan untuk mencetak * sebanyak N kali ke arah samping. Di tahap 4 di atas kode _looping **for**_ kita jadikan sebagai _**inner loop**_. 
6.	Kita looping lagi _inner loop_ sebanyak N kali untuk menghasilkan _output_ seperti tahap 2. Maka perlu ditambahkan perulangan luar (_outer loop_).
![Gambar 3](images/img-03.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 6 (gabungkan dengan inner loop pada langkah 4)
import java.util.Scanner;

int N;
Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = in.nextInt();

for(int i = 0; i <= N; i++) {
    for(int outer = 1; outer <= N; outer++){
        //innerloop
    }
    System.out.print("*");
}
```

    Masukkan nilai N : 3
    ****

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Belum
2. Alurnya adalah import scanner dan dideklarasi, kemudian membuat variabel N, lalu inputan nilai variabel N menggunakan scanner, selanjutnya memulai perulangan luar terlebih dahulu disini saya mengubah inisialisasi variabel menjadi 1 agar keluaran bintang jumlahnya sesuai dengan nilai N. Kemudian lanjut ke perulangan dalam dengan pernyataan mengeluarkan ouput *. Kemudian di perulangan luar menggunakan pernyataan System.out.println(); karena jika menggunakan ("*") hasilnya tidak sesuai.


```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;

int N;
Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = in.nextInt();

for(int i = 1; i <= N; i++) {
    for(int j = 1; j <= N; j++){
        //innerloop
        System.out.print("*");
    }
    System.out.println();
}

```

    Masukkan nilai N : 3
    ***
    ***
    ***


***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = in.nextInt();
int i = 0;
while(i <= N) {
    int j = 0;
    while(j < i){
        System.out.print("*");
        j++;
    }
    i++;
}
```

    Masukkan nilai N : 5
    ***************

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Tidak sesuai
2. Alurnya adalah import scanner dan dideklarasi, lalu inputan nilai variabel N menggunakan scanner dan inisialisasi variabel i diluar, selanjutnya memulai perulangan luar while dengan kondisi i <= N. Kemudian didalamnya inisialiasi variabel j dan lanjut ke perulangan dalam dengan kondisi j < i. Didalam perulangan dalam ada pernyataan mengeluarkan output "*" dan increment. Kemudian di perulangan luar menggunakan pernyataan System.out.println(); dan increment.


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = in.nextInt();
int i = 0;
while(i <= N) {
    int j = 0;
    while(j < i){
        System.out.print("*");
        j++;
    }
    System.out.println();
    i++;
}
```

    Masukkan nilai N : 5
    
    *
    **
    ***
    ****
    *****


***
### Percobaan 3: Segitiga Angka
1.	Pada percobaan ke-3 akan dilakukan percobaan segitiga angka sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti berikut
![Gambar 7](images/img-07.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 8](images/img-08.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = in.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(j);
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    1
    12
    123
    1234
    12345


#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Belum
2. Alurnya adalah import scanner lalu dideklarasi, kemudian membuat inputan variabel N menggunakan scanner. selanjutnya dilakukan perulangan luar dengan inisialisasi var i dengan kondisi i <= N. kemudian lanjut ke perulangan dalam dengan diawali inisialisasi var j dengan kondisi j <= i. Perbedaan antara percobaan 3 yang atas dan bawah adalah keluaran nya jika yang diatas mengeluarkan output var j sedangkan yang bawah mengeluarkan var i.


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = in.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(i);
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    1
    22
    333
    4444
    55555


***
### Percobaan 4: Tebak Angka
1. Pada Percobaan 4 ini, kita akan belajar membuat kode untuk menebak angka menggunakan _nested loop_.
2. Pada percobaan ini kita menggunakan library Scanner untuk menangkap input dari keyboard dan Random untuk meng-generate angka secara acak
3. Ketik dan pahami kode program di bawah ini
![Gambar 6](images/img-06.png)


```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
import java.util.Scanner;
import java.util.Random;

Random rndm = new Random();
Scanner in = new Scanner(System.in);
char menu = 'y';

do{
    int number = rndm.nextInt(10) + 1;
    boolean success = false;
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = in.nextInt();
        in.nextLine();
        
        if(answer == number){
            System.out.println("Yayy selamat tebakanmu benar!!");
            success = true;
        }
    } while(!success);
    System.out.print("Apa anda ingin mengulang permainan?(Y/y) ");
    menu = in.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Yayy selamat tebakanmu benar!!
    Apa anda ingin mengulang permainan?(Y/y) 2


#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Alurnya adalah import scanner dan random dan dideklarasi. Lalu membuat variabel menu dengan tipe data char yang bernilai 'y'. kemudian mulai outer loop dengan do yang didalamnya berisi merandom angka 1-10 dengan kondisi di while yaitu variabel menu berisi y atau Y. Kemudian lanjut ke inner loop denngan do yang berisi inputan angka yang dimasukkan. selanjutnya menambahkan pemilihan if dengan kondisi jika nilai answer = nilai number yang dirandom, maka mengeluarkan "Yayy selamat tebakanmu benar!!". Kemudian untuk while dari inner loop dengan kondisi !success maka mengeluarkan inputan pertanyaan apakah ingin mengulang permainan.
2. Yang harus dilakukan agar berhenti adalah dengan mengetikkan keyword selain "y/Y".



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.A disini */
import java.util.Scanner;
import java.util.Random;

Random rndm = new Random();
Scanner in = new Scanner(System.in);
char menu = 'y';

do{
    int number = rndm.nextInt(10) + 1;
    boolean success = false;
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = in.nextInt();
        in.nextLine();
        
        if(answer == number){
            System.out.println("Yayy selamat tebakanmu benar!!");
            success = true;
        } else if(answer > number){
            System.out.println("Hayoo Kurang kecil!!");
        } else {
            System.out.println("Hayoo Kurang besar!!");
        }
    } while(!success);
    System.out.print("Apa anda ingin mengulang permainan?(Y/y) ");
    menu = in.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Yayy selamat tebakanmu benar!!
    Apa anda ingin mengulang permainan?(Y/y) y
    Tebak angka (1-10) : 1
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 5
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 10
    Hayoo Kurang kecil!!
    Tebak angka (1-10) : 8
    Hayoo Kurang kecil!!
    Tebak angka (1-10) : 7
    Yayy selamat tebakanmu benar!!
    Apa anda ingin mengulang permainan?(Y/y) n


Tambahkan else if dengan kondisi jika angka yang dimasukkan lebih besar dari angka random maka mengeluarkan petunjuk "Hayoo kurang kecil!!" dan else dengan pernyataan mengeluarkan petunjuk "Hayoo kurang besar!!".


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
import java.util.Scanner;
import java.util.Random;
Random rndm = new Random();
Scanner in = new Scanner(System.in);
char menu = 'y';
int i = 0;

do{
    int number = rndm.nextInt(10) + 1;
    boolean success = false;
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = in.nextInt();
        in.nextLine();
        i++;
        
        if(answer == number){
            System.out.println("Yayy selamat tebakanmu benar!!");
            success = true;
        } else if(answer > number){
            System.out.println("Hayoo Kurang kecil!!");
        } else {
            System.out.println("Hayoo Kurang besar!!");
        }
        if(i == 10){
            System.out.println("Yahh kamu gagal nebak angka 10x!!");
            break;
        }
    } while(!success);
    System.out.print("Apa anda ingin mengulang permainan?(Y/y) ");
    menu = in.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 2
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 3
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 1
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 2
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 2
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 1
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 3
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 1
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 2
    Hayoo Kurang besar!!
    Tebak angka (1-10) : 3
    Hayoo Kurang besar!!
    Yahh kamu gagal nebak angka 10x!!
    Apa anda ingin mengulang permainan?(Y/y) n


***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = in.nextInt();

for(int i = 1; i <= N; i++) {
    for(int j = N; j >= 1; j--){
        if(i < j){
            System.out.print(" ");
        } else {
            System.out.print("*");
        }
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
        *
       **
      ***
     ****
    *****


***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
/* Jawaban Soal 2 disini */

import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = in.nextInt();

for(int i = 1; i <= N; i++) {
    for(int j = 1; j <= N; j++){
        if(i == 1 || i == N || j == 1 || j == N){
            System.out.print(N);
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    55555
    5   5
    5   5
    5   5
    55555


***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;

Scanner in = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int N = in.nextInt();

for(int i = 1; i <= N; i++) {
    for(int j = N; j >= i; j--){
        System.out.print(" ");
    }
    for(int k = 1; k <= i; k++){
        System.out.print("*");
    }
    for(int l = 1; l <= i-1; l++){
        System.out.print("*");
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
         *
        ***
       *****
      *******
     *********

