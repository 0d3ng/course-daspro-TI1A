<dl>
  <dt>NIM :</dt>
  <dd>2141720031</dd>

  <dt>Nama :</dt>
  <dd>Josafat Pratama Susilo</dd>
    
  <dt>Kelas :</dt>
  <dd>D4 TI 1A</dd>
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
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i<=N; i++){
    System.out.print("*")
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
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i<=N; i++){
    for(int outer = 1; outer <= N; outer++){
        System.out.print("*");
    }
}
```

    Masukkan nilai N : 5
    ******************************

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Belum, karena output masih berupa bintang horizontal, belum membentuk persegi dengan sisi 5 bintang. Bahkan hasil bintang tidak sesuai dengan gambar. Seharusnya bila saya menginputkan 5, maka akan menghasilkan 25 bintang, namun pada hasil saat ini  menghasilkan 30 bintang.
2. Menurut saya, harus ditambahkan _new line_ setelah melakukan _inner loop_ sehingga outputnya tidak horizontal saja. Lalu untuk kondisi pada _outer loop_ diganti menjadi kurang dari, karena pada deklarasi variabel untuk perulangan nilai awalnya adalah 0.


```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i<N; i++){
    for(int outer = 1; outer <= N; outer++){
        System.out.print("*");
    }
    System.out.println("");
}
```

    Masukkan nilai N : 5
    *****
    *****
    *****
    *****
    *****


***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();
int i = 0;
while(i <= N){
    int j = 0;
    while(j < i){
        System.out.print("*");
        j++;
    }
    i++;
}
```

    Masukkan nilai N = 5
    ***************

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Tidak Sesuai, seharusnya output yang dihasilkan membentuk bangun segitiga. Namun pada output program tersebut hanya menghasilkan bentuk garis bintang horizontal.
2. Hanya perlu menambahkan fungsi _new line_ sehingga line selanjutnya yang meng-output baris dapat membentuk bidang segitiga. Sedangkan untuk pengkondisian, kita tidak perlu mengubah, karena meskipun pada _outer loop_ kondisinya adalah kurang dari sama dengan. Namun, kita hanya menampilkan _new line_ saja, karena pada _inner loop_ yang berfungsi untuk meng-output sudah terdapat kondisi kurang dari.


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();
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

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int N = input.nextInt();

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
1. Belum, karena angka yang di-output-kan tidak sesuai dengan yang diharapkan.
2. Hanya perlu untuk mengganti variabel yang akan di-print. Dengan mengganti variabel j dengan variabel i, maka angka yang di-output-kan akan sesuai dengan _output_ yang diharapkan, yaitu pada _outer loop_ ke berapa baris tersebut.


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
import java.util.Scanner;

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int N = input.nextInt();

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

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        }
    }while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
}while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 9
    Tebak angka (1-10) : 8
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 4
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n


#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Alur program diatas diawali dengan melakukan _outer loop_ menggunakan do while. _outer loop_ tersebut berfungsi untuk melakukan perulangan berjalannya game. Game akan terus berjalan jika kondisi dalam _outer loop_ tersebut terus berjalan yaitu saat user meng-input-kan huruf y maupun y kapital ketika angka random berhasil ditebak. Setelah _outer loop_ berjalan, awalnya akan diacak angka dari 1 sampai 10. Kemudian, terdapat _inner loop_ yang juga menggunakan do while. Di dalam inner loop ini, user akan dimintai inputan dan akan di cek inputnya, jika benar maka akan mengganti variabel success menjadi true dan keluar dari _inner loop_, jika salah maka akan mengulangi terus hingga angka berhasil tertebak. Hal ini dikarenakan, kondisi dalam perulangan _inner loop_ akan terus berjalan selama variabel success bernilai false. Lalu, ketika angka berhasil tertebak, dan user keluar dari _inner loop_, maka program akan menanyai apakah user ingin mengulangi permainan. Jika iya, maka akan mengacak angka lagi dan menjalankan _inner loop_ lagi.
2. Menginput selain huruf Y kapital dan y tidak kapital ketika dimintai inputan apakah ingin mengulang permainan setelah angka berhasil ditebak.



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.A disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        }else if(answer > number){
            System.out.println("Input anda lebih besar dari angka random, cobalah lagi :)");
        }else if(answer < number){
            System.out.println("Input anda lebih kecil dari angka random, cobalah lagi :)");
        }
    }while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
}while(menu == 'y' || menu == 'Y');

// Program diatas dimodifikasi, dengan melakukan cek pada inner loop, apakah inputan user lebih kecil/besar dari angka random.
```

    Tebak angka (1-10) : 8
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 6
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 2
    Input anda lebih kecil dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 5
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    int counter = 0;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        }else{
            counter += 1;
            if(answer > number){
                System.out.println("Input anda lebih besar dari angka random, cobalah lagi :)");
            }else{
                System.out.println("Input anda lebih kecil dari angka random, cobalah lagi :)");
            }
        }
    }while(!success && counter != 10);
    
    if(counter == 10){
        System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
        break;
    }
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
}while(menu == 'y' || menu == 'Y');

// Program diatas dimodifikasi dengan menambahkan variabel baru yaitu counter untuk menghitung seberapa banyak jawaban salah user.
// Lalu di dalam pengkondisian inner loop akan ditambahkan kondisi baru, program akan terus berjalan jika counter tidak sama dengan 10
// kemudian pada outer loop akan ditambah pengkondisian, jika counter sama dengan 10, maka akan djalankan statement break dan
// meng-output user mengenai pesan gagal menebak 10x.
```

    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Tebak angka (1-10) : 11
    Input anda lebih besar dari angka random, cobalah lagi :)
    Maaf Anda gagal menebak angka sebanyak 10x


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

Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();
int i = 1;
while(i <= N){
    int j = N;
    while(j >= 1){
        if(i < j){
            System.out.print(" ");
        }else{  
            System.out.print("*");
        }
        j--;
    }
    System.out.println("");
    i++;
}

// Program diatas berjalan dengan konsep yang sama ketika membuat persegi, namun kita menambahkan pengkondisian baru.
// Pada inner loop, kondisinya yaitu ketika variabel j yang nilainya sama dengan N-kolom, perulangan akan terus berjalan.
// Pada inner loop tersebut, dilakukan decrement. Kemudian didalamnya terdapat pengkondisia, jika variabel i-baris kurang dari
// variabel j maka akan melakukan output spasi / whitespace. Jika tidak maka akan melakukan output bintang.
// Hal tersebut karena, sebagai contoh baris pertama. Pada baris pertama, nilai i adalah 1, dan nilai j adalah 5. 
// maka pada inner loop akan dilakukan sebanyak 5 kali. Karena 1 kurang dari 5 sampai 2, maka dari kolom 1-4 akan berisi whitespace.
// Lalu karena 1 sama dengan 1, pada kolom 5 berisi bintang, begitu terus sampai baris 5. Spasi akan semakin sedikit seiring perulangan,
// karena variabel i semakin bertambah dan variabel j pada awal tetaplah N.
```

    Masukkan nilai N = 5
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

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i<N; i++){
    for(int a = 1; a <= N; a++){
        if((i+1) == N || (i+1) == N-(N-1) || a == 1 || a == N){
            System.out.print(N);
        }else{
            System.out.print(" ");
        }
    }
    System.out.println("");
}

// Program kali ini kurang lebih sama dengan program membuat persegi. Kita hanya perlu untuk melakukan pengkondisian.
// Kondisi tersebut berisi, jika berada pada kolom yang bukan pada baris pertama dan baris terakhir, serta  bukan kolom satu dan akhir
// maka akan melakukan output spasi. Namun jika sebaliknya, maka akan melakukan output angka inputan.
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

Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();

for(int i = 1; i <= N; i++){
    
    for (int b = 1; b <= (N-i); b++) {
        System.out.print("  ");
    }
    
    for(int a = 1; a <= (2*i-1); a++){
        System.out.print("* ");
    }
    System.out.println("");
}

// Pertama kita mengetahui bahwa segitiga tersebut memiliki pola yaitu, setiap baris baru, selalu bertambah 2 bintang.
// Dengan informasi tersebut kita akan lebih mudah dalam melakukan inner loop. Kemudian, kita melakukan outer loop sebanyak
// input yang dimasukkan oleh user. Kemudian kita akan melakukan teknik spasi yang mirip dengan nomor 1, hanya saja saya menemukan
// cara yang lebih mudah dipahami oleh logika saya. Pada inner loop pertama kita melakukan pengisian spasi sebanyak N - 1. Contohnya
// ketika pada baris 1 dengan nilai N adalah 5, maka kita akan melakukan spasi sebanyak 4 kali, dan digit terakhir akan di isi oleh bintang 
// dari perulangan dibawahnya. Kemudian pada inner loop kedua, kita melakukan inputan sebanyak 2 kali dari variabel i-baris dikurangi 1.
// Hal tersebut bermaksud, pada awal tadi kita tau bahwa selisih setiap baris adalah 2, maka kita bisa menentukan polanya seperti itu.
// Contoh, pada baris 1 maka i bernilai 1, kemudian pada inner loop kedua kita melakukan perulangan hingga 2*1-1 yaitu 1, sehingga bintang
// di output sebanyak satu kali. Lalu pada baris 2 maka i bernliai 2, sehingga 2*2-1 yaitu 3, sehingga output bintang pada baris 2 itu 3.
// Kemudian supaya bentuk bintang sesuai, kita menambahkan spasi setelah bintang.
```

    Masukkan nilai N = 5
            * 
          * * * 
        * * * * * 
      * * * * * * * 
    * * * * * * * * * 



```Java

```
