<dl>
  <dt>NIM :</dt>
  <dd>2141720208</dd>

  <dt>Nama :</dt>
  <dd>Mukhammad Nuril Haidar</dd>
    
  <dt>Kelas :</dt>
  <dd>1A</dd>
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
Scanner scan = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = scan.nextInt();

for(int i = 0; i <= N; i++){
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
for(int outer=1; outer <= N; outer++){
    for(int i = 0; i <= N; i++){
    System.out.print("*");
    }
}
```

    ******************************

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Belum
2. Dengan memberikan enter atau System.out.println("") setelah inner loop, maka akan menghasilkan output yang sesuai


```Java
for(int outer=1; outer <= N; outer++){
    for(int i = 0; i <= N; i++){
        System.out.print("*");
    }
    System.out.println("");
}
```

    ******
    ******
    ******
    ******
    ******
    

***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
Scanner scan = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = scan.nextInt();

int i = 0;
while(i <= N){
    int j = 0;
    while(j < 1){
        System.out.print("*");
        j++;
    }
    i++;
}
```

    Masukkan nilai N = 5
    ******

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Belum
2. Pada inner loop seharusnya j harus lebih kecil dari i agar mengulangi output bintang dan diberi Enter atau System.out.println("") setelah inner loop


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
Scanner scan = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = scan.nextInt();

int i = 0;
while(i <= N){
    int j = 0;
    while(j < i){
        System.out.print("*");
        j++;
    }
    System.out.println("");
    i++;
}
```

    Masukkan nilai N = 5
    
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

Scanner scan = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int n = scan.nextInt();

for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(j);
    }
    System.out.println("");
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
2. Yang harus dirubah adalah seharusnya output yang ditampilkan adalah i untuk mengulang angka yang sama, jika menampilkan j maka angka akan berlanjut karena telah masuk inner looping dari j


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
System.out.print("Masukkan nilai N : ");
int n = scan.nextInt();

for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(i);
    }
    System.out.println("");
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

Random random = new Random();
Scanner scan = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak Angka (1-10) : ");
        int answer = scan.nextInt();
        scan.nextLine();
        
        if(answer == number){
            System.out.println("Yay Kamu Berhasil Kawan");
            success = true;
        }
    } while(!success);
    System.out.print("Apakah anda ingin mengulang permainan (Y/y) ?");
    menu = scan.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak Angka (1-10) : 1
    Tebak Angka (1-10) : 2
    Yay Kamu Berhasil Kawan
    Apakah anda ingin mengulang permainan (Y/y) ?y
    Tebak Angka (1-10) : 1
    Tebak Angka (1-10) : 2
    Yay Kamu Berhasil Kawan
    Apakah anda ingin mengulang permainan (Y/y) ?3
    

#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Program diatas awalnya mempunyai outer loop yang berguna untuk mengkonfirmasi jika ingin bermain kembali, didalamnya terdapat inisiasi variabel number yang bervalue random 1-10 dan inisiasi variabel boolean success dengan value false. Kemudian pada inner loop nya terdapat permainan tebak angka dengan cara menebak value pada variabel number dengan cara menginputnya, jika angka yang diinput tidak sama dengan value number maka akan terjadi looping penebakan angka. Jika berhasil menebak maka inner looping akan berhenti dan akan ditanyai apakah ingin mengulang ? Jika menjawab y/Y maka akan mengulang permainan tersebut.
2. Yang harus dilakukan adalah memasukkan input selain huruf y/Y



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.A disini */
Random random = new Random();
Scanner scan = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak Angka (1-10) : ");
        int answer = scan.nextInt();
        scan.nextLine();
        
        if(answer < number){
            System.out.println("Lebih Besar Lagi");
            success = false;
        }
        
        if(answer > number){
            System.out.println("Lebih Kecil Lagi");
            success = false;
        }
        
        if(answer == number){
            System.out.println("Yay Kamu Berhasil Kawan");
            success = true;
        }
    } while(!success);
    System.out.print("Apakah anda ingin mengulang permainan (Y/y) ?");
    menu = scan.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak Angka (1-10) : 2
    Lebih Besar Lagi
    Tebak Angka (1-10) : 3
    Lebih Besar Lagi
    Tebak Angka (1-10) : 9
    Lebih Kecil Lagi
    Tebak Angka (1-10) : 6
    Lebih Kecil Lagi
    Tebak Angka (1-10) : 4
    Yay Kamu Berhasil Kawan
    Apakah anda ingin mengulang permainan (Y/y) ?n
    


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
Random random = new Random();
Scanner scan = new Scanner(System.in);
char menu = 'y';
int percobaan = 0;

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    int percobaan = 0;
    
    do{
        System.out.print("Tebak Angka (1-10) : ");
        int answer = scan.nextInt();
        scan.nextLine();
        
        if(answer < number){
            System.out.println("Lebih Besar Lagi");
            success = false;
        }
        
        if(answer > number){
            System.out.println("Lebih Kecil Lagi");
            success = false;
        }
        
        if(answer == number){
            System.out.println("Yay Kamu Berhasil Kawan");
            success = true;
        }
        
        percobaan++;
        if(percobaan == 10){
            System.out.println("Maaf Percobaan Kamu Sudah Menebak 10 kali");
            success=true;
        }
    } while(!success);
    System.out.print("Apakah anda ingin mengulang permainan (Y/y) ?");
    menu = scan.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Tebak Angka (1-10) : 1
    Lebih Besar Lagi
    Maaf Percobaan Kamu Sudah Menebak 10 kali
    Apakah anda ingin mengulang permainan (Y/y) ?n
    

***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

System.out.print("Masukkan Angka :");
int n = scan.nextInt();

for(int i=1; i<=n; i++){
   for(int j=5; j >= 1; j--){
       if(i<j){
           System.out.print(" ");
       } else {
           System.out.print("*");
       }
   }
    System.out.println("");
}
```

    Masukkan Angka :5
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
Scanner scan = new Scanner(System.in);

System.out.print("Masukkan Angka : ");
int angka = scan.nextInt();

for(int i=1; i <= angka; i++){
    for(int j = 1; j <= angka; j++){
        if(i==1 || j==angka || j==1 || i==angka){
            System.out.print(angka);
        } else {
            System.out.print(" ");
        }
    }
    System.out.println("");
}
```

    Masukkan Angka : 3
    333
    3 3
    333
    

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

System.out.print("Masukkan angka : ");
int n = scan.nextInt();

for (int i = n; i > 0; i--) {
    String output = "";
    for (int j = 1; j <= n; j++) {
        if (j >= i) {
            output += "* ";
        } else {
            output += " ";
        }
    }
    System.out.println(output);
}
```

    Masukkan angka : 4
       * 
      * * 
     * * * 
    * * * * 
    
