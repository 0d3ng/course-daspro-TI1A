<dl>
  <dt>NIM :</dt>
  <dd>2141720080</dd>

  <dt>Nama :</dt>
  <dd>Muhammad Haikal Buldan</dd>
    
  <dt>Kelas :</dt>
  <dd>1A-TI</dd>
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
import java.util.Scanner;

int N;
Scanner haikal = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = haikal.nextInt();

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
for(int outer = 1; outer <= N; outer++) {
  for(int i = 0; i <= N; i++) {
    System.out.print("*");
  }
}
```

    ******************************

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Belum, karena seharusnya perlu ditambahakan system.out.println pada setelah perulangan dalam
2. 


```Java
import java.util.Scanner;
int N;
Scanner haikal = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = haikal.nextInt();

for(int i = 0; i < N; i++){
    for(int outer = 1; outer <= N; outer++){
    System.out.print("*");
    }
    System.out.println();
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
Scanner haikal = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = haikal.nextInt();
int i = 0;
while(i <= N) {
    int j = 0;
    while(j < i) {
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
1. Tidak
2. Perlu ditambahkan println pada bagian perulangan luar setelah perulangan dalam

while(j < i) {
        System.out.print("*");
        j++;
    }
    System.out.println("");
    i++;
}


```Java
Scanner haikal = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = haikal.nextInt();
int i = 0;
while(i <= N) {
    int j = 0;
    while(j < i) {
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
import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int N = haikal.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1;j <= i; j++){
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
2. 


```Java
import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int N = haikal.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1;j <= i; j++){
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
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner haikal = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do {
        System.out.print("Tebak angka (1-10) : ");
        int answer = haikal.nextInt();
        haikal.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        }
    } while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = haikal.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 10
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 4
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?y
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 0
    Tebak angka (1-10) : 9
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n


#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Alur program diatas yaitu, pertama memasukkan scanner untuk input dari pengguna dan random untuk menggenerate angka secara acak lalu memberikan inisialisasi char berupa huruf "Y/y", kemudian melakukan perulangan dengan menginisialisasi variabel number sebagai sasaran yang akan di acak nantinya dari 1-10, perulangan akan terus dilakukan ketika inputan dari luar salah atau tidak sesuai dengan angka yang diacak pada perulangan dalam, kemudian pada perulangan dalam terdapat perintah untuk memasukkan angka yang akan ditebak oleh user dengan menginisialisasi answer sebagai jawaban, kemudian akan dilakukan pemilihan dimana ketika answer (inputan dari pengguna) sama dengan number (angka yang telah di generate oleh mesin) yang akan mengeluarkan output tebakan anda benar dan akan mengulang untuk apakah akan bermain lagi, namun jika tidak benar atau tidak sesuai dengan number maka akan mengulang untuk menginputkan nilai yang benar kembali.
2. Menginputkan variable char selain Y/y yang tadinya sudah diinisialisasi.



```Java
import java.util.Scanner;
import java.util.Random;

Random buldan = new Random();
Scanner haikal = new Scanner(System.in);
char menu = 'y';

do{
    int number = buldan.nextInt(10) + 1;
    boolean success = false;
do{
  System.out.print("Tebak angka (1-10) : ");
  int answer = haikal.nextInt();
  haikal.nextLine();
  if (answer == number){
      System.out.println("Yay...tebakan Anda benar...Selamat!!!");
      success =true;
    }else if(answer <= number){
      System.out.println("Angka yang anda masukkan lebih kecil!!!");
    }else if(answer >= number){
      System.out.println("Angka yang anda masukkan lebih besar!!!");
    }
} while(!success);

    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
menu = haikal.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 3
    Yay...tebakan Anda benar...Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?y
    Tebak angka (1-10) : 2
    Angka yang anda masukkan lebih kecil!!!
    Tebak angka (1-10) : 3
    Angka yang anda masukkan lebih kecil!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan lebih kecil!!!
    Tebak angka (1-10) : 9
    Angka yang anda masukkan lebih besar!!!
    Tebak angka (1-10) : 6
    Angka yang anda masukkan lebih kecil!!!
    Tebak angka (1-10) : 7
    Yay...tebakan Anda benar...Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n



```Java
import java.util.Scanner;
import java.util.Random;

Random buldan = new Random();
Scanner haikal = new Scanner(System.in);
char menu = 'y';
int tebak = 0;

do{
    int number = buldan.nextInt(10) + 1;
    boolean success = false;
do{
  System.out.print("Tebak angka (1-10) : ");
  int answer = haikal.nextInt();
  haikal.nextLine();
  if (answer == number){
      System.out.println("Yay...tebakan anda benar...Selamat!!!");
      success =true;
    }else if(answer >= number){
      System.out.println("Angka yang anda masukkan terlalu besar!!!");
    }else{
      System.out.println("Angka yang anda masukkan terlalu kecil!!!");
  }
    tebak++;
    if(tebak == 10){
    System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
    success = true;
    }
        
} while(!success);

    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
menu = haikal.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 2
    Angka yang anda masukkan terlalu kecil!!!
    Tebak angka (1-10) : 3
    Angka yang anda masukkan terlalu kecil!!!
    Tebak angka (1-10) : 4
    Angka yang anda masukkan terlalu kecil!!!
    Tebak angka (1-10) : 5
    Yay...tebakan anda benar...Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n


***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
import java.util.Scanner;
Scanner haikal = new Scanner(System.in);
int n = 0;
        System.out.print("Silahkan masukkan nilai dari variable N : ");
        n = haikal.nextInt();
        for (int i = 1; i <= n; i++){
            for (int a = i; a < n; a++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
          System.out.println(" ");
        }
```

    Silahkan masukkan nilai dari variable N : 5
        * 
       ** 
      *** 
     **** 
    ***** 


Penjelasan 
Kembali pada fungsinya dimana inner loop mempengaruhi jumlah kolom yang akan ditampilkan, sedangkan outbut mempengaruhi jumlah baris dari jumlah yang diinputkan pengguna, dalam program tersebut innerloop bekerja ddengan menampilkan spasi sebanyak n di awal dan sisanya adalah bintang 

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

System.out.print("Silahkan masukkan nilai dari variable N : ");
int N = haikal.nextInt();
for(int i = 1; i <= N; i++){
    for(int j = 1; j <= N; j++){
        if (i==N || j==N || j==1 || i==1){
            System.out.print(" " + N);
        }else {
            System.out.print("  ");
        }
    }
    System.out.println();
}   
```

    Silahkan masukkan nilai dari variable N : 5
     5 5 5 5 5
     5       5
     5       5
     5       5
     5 5 5 5 5


***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
import java.util.Scanner;

Scanner haikal = new Scanner(System.in);
System.out.print("Silahkan masukkan nilai dari variable N : ");

int N = haikal.nextInt();

for (int i = 1; i <= n; i++) {
  for (int j = 1; j <= n - i; j++) {
    System.out.print(" ");
  }
  for (int k = 1; k <= i * 2 - 1; k++) {
    System.out.print("*");
  }
  System.out.println();
}
```

    Silahkan masukkan nilai dari variable N : 5
       *
      ***
     *****
    *******

