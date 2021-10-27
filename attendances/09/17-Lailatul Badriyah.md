<dl>
  <dt>NIM :</dt>
  <dd>2141720036</dd>

  <dt>Nama :</dt>
  <dd>Lailatul Badriyah</dd>
    
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
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 0; i <= N; i++){
    System.out.print("*");
}
```

    Masukkan nilai N : 5
    ******

Kode program ini menggunakan tipe data int untuk variabel N dan i. Kode program ini menggunakan perulangan for dengan int i = 0; sebagai inisialisasi, i <= N sebagai syarat perulangan, dan i++ sebagai increment. int i sebagai nilai pertama yang digunakan untuk looping baris dengan output *. (int i = 0; i <= N; i++)

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
for(int i = 0; i <= N; i++){
    for(int outer = 1; outer <= N; outer++){
        // Inner Loop
    }
    System.out.print("*");
}
```

    Masukkan nilai N : 5
    ******

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Tidak bisa seperti gambar
2. Berikut kode program yang telah saya modifikasi:


```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukan nilai N : ");
N = sc.nextInt();

for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print("*");
    } 
    System.out.println();
}
```

    Masukan nilai N : 5
    *****
    *****
    *****
    *****
    *****


Pada kode program ini mengggunakan perulangan for sebanyak 2 perulangan. int i sebagai outer loop digunakan untuk menghitung atau melakukan perulangan sebanyak jumlah baris yaitu 5 baris (int i = 0; i < 5; i++). Setiap inner loop selesai di eksekusi, maka akan dibuatkan baris baru.
int j sebagai inner loop untuk mencetak simbol * pada layar, jumlah simbol yang ditampilkan perbarisnya akan menyesuaikan dengan nilai pada variabel j, yaitu 5 simbol *.(int j = 0; j < 5; j++)

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

Pada kode program di atas menggunakan perulangan while dengan 2 perulangan. while(i <= N) { merupakan outer loop mengulang output dari inner loop. while(j < i) { merupakan inner loop menghasilkan satu baris bintang. int j dan i akan di increment.

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Tidak bisa seperti gambar
2. Perlu ditambahkan System.out.print(); setelah perulangan inner agar tampilan output berubah.


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();
int i = 0;
while(i < 6) {
    int j = 0;
    while(j < i) {
        System.out.print("*");
        j++;
    }
    System.out.println();
    i++;
}
```

    Masukkan nilai N = 5
    
    *
    **
    ***
    ****
    *****


Pada kode program di atas menggunakan perulangan while dengan 2 perulangan. while(i < 6) { sebagai outer loop untuk mengulang inner loop.while(j < i) { sebagai inner loop menghasilkan satu baris bintang yang jumlahnya menyesuaikan dengan nomor baris pada baris i.   

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


Pada kode program di atas menggunakan perulangan for dengan 2 perulangan. int N berfungsi sebagai variabel penerima input user. Perulangan pertama for(int i = 1; i <= N; i++){ sebagai perulangan terluar untuk looping barisnya. Perulangan kedua for(int j = 1;j <= i; j++){ untuk looping kolomnya. Perulangan pertama menghasilkan " " dan perulangan kedua menghasilkan output variabel j. 

#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Tidak
2. System.out.print(j); menjadi System.out.print(i); karena i berfungsi untuk menampilkan baris dan jika makin ke bawah angka yang ditampilkan lebih kecil dari baris tersebut maka tidak akan ditampilkan.


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
import java.util.Scanner;

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int N = input.nextInt();

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


Pada kode program di atas menggunakan perulangan for dengan 2 perulangan. int N berfungsi sebagai variabel penerima input user. Perulangan pertama for(int i = 1; i <= N; i++){ sebagai perulangan terluar untuk looping barisnya. Perulangan kedua for(int j = 1;j <= i; j++){ untuk looping kolomnya. Perulangan pertama menghasilkan output variabel i, perulangan pertama menghasilkan output " ". 

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
    
    do {
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        }
    } while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
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
1.  Pertama-tama user memasukkan tebakan angka 1-10. Jika angka yang ditebak salah maka program akan melakukan looping untuk melakukan tebakan. Apabila user menginput dengan angka yang sama dengan meminta jawaban maka akan terdapat output "Yay... tebakan Anda benar... Selamat!!!". Jika angka yang ditebak benar maka program akan menanyakan apakah user ingin mengulang program atau tidak, jika user ingin mengulang maka dapat menjawab "Y/y" jika tidak ingin mengulangi maka user dapat memasukkan huruf selain "Y/y"
2. Jika tidak ingin melanjutkan permainan tersebut maka dapat memasukkan char selain Y/y


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
menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 8
    Angka yang anda masukkan lebih besar!!!
    Tebak angka (1-10) : 6
    Angka yang anda masukkan lebih besar!!!
    Tebak angka (1-10) : 10
    Angka yang anda masukkan lebih besar!!!
    Tebak angka (1-10) : 11
    Angka yang anda masukkan lebih besar!!!
    Tebak angka (1-10) : 2
    Angka yang anda masukkan lebih kecil!!!
    Tebak angka (1-10) : 3
    Yay...tebakan Anda benar...Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n


Pada program ini menggunakan perulangan do-while. Pertama-tama user memasukkan tebakan angka 1-10. Jika angka yang ditebak salah maka program akan melakukan looping untuk melakukan tebakan. Apabila user menginput dengan angka yang sama dengan meminta jawaban maka akan terdapat output "Yay... tebakan Anda benar... Selamat!!!". Jika answer kurang dari sama dengan number maka outputnya "Angka yang anda masukkan lebih kecil!!!". Jika answer lebih dari sama dengan number maka outputnya Angka yang anda masukkan lebih besar!!!". Jika angka yang ditebak benar maka program akan menanyakan apakah user ingin mengulang program atau tidak, jika user ingin mengulang maka dapat menjawab "Y/y" jika tidak ingin mengulangi maka user dapat memasukkan huruf selain "Y/y"


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';
int tebak = 0;

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
do{
  System.out.print("Tebak angka (1-10) : ");
  int answer = input.nextInt();
  input.nextLine();
  if (answer == number){
      System.out.println("Yay...tebakan anda benar...Selamat!!!");
      success =true;
    }else if(answer >= number){
      System.out.println("Angka yang anda masukkan lebih kecil!!!");
    }else{
      System.out.println("Angka yang anda masukkan salah!!!");
  }
    tebak++;
    if(tebak == 10){
    System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
    success = true;
    }
        
} while(!success);

    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Tebak angka (1-10) : 1
    Angka yang anda masukkan salah!!!
    Maaf Anda gagal menebak angka sebanyak 10x
    Apakah Anda ingin mengulang permainan (Y/y)?n


Pada program ini menggunakan perulangan do-while. Pertama-tama user memasukkan tebakan angka 1-10. Jika angka yang ditebak salah maka program akan melakukan looping untuk melakukan tebakan. Apabila user menginput dengan angka yang sama dengan meminta jawaban maka akan terdapat output "Yay... tebakan Anda benar... Selamat!!!". Jika answer lebih dari sama dengan number maka outputnya "Angka yang anda masukkan lebih kecil!!!". Selain itu outputnya "Angka yang anda masukkan salah!!!". Jika angka yang ditebak salah sebanyak 10x maka outputnya "Maaf Anda gagal menebak angka sebanyak 10x". Selanjutnya terdapat output "Apakah Anda ingin mengulang permainan (Y/y)?" jika user menjawab Y/y maka program akan mengulang kembali, jika user menjawab huruf selain Y/y maka program akan berhenti.

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
Scanner input = new Scanner(System.in);
int n = 0;
        System.out.print("Masukkan nilai N : ");
        n = input.nextInt();
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

    Masukkan nilai N : 5
        * 
       ** 
      *** 
     **** 
    ***** 


Pada kode program ini saya menggunakan perulangan for dengan 3 perulangan. Perulangan pertama saya gunakan perulangan terluar untuk looping barisnya sedangkan 2 perulangan yang lainnya saya gunakan untuk looping kolom. Yang pertama menghasilkan output " " dan yang kedua menghasilkan output *, int n digunakan sebagai variabel penerima input dari user, int i sebagai nilai pertama yang digunakan dalam membuat looping baris, int a sebagai nilai pertama yang digunakan dalam membuat looping baris dengan output " ", int j sebagai nilai pertama yang digunakan dalam membuat looping kolom dengan output *.

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for (int i = 1; i <= N; i++) {
    for (int j = 1; j <= N; j++) {
        if (i == 1 || i == N || j == 1 || j == N) {
             System.out.print(N + " ");
        }
        else {
           System.out.print("  "); 
        } 
    }
    System.out.println();
}
```

    Masukkan nilai N : 3
    3 3 3 
    3   3 
    3 3 3 



```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for (int i = 1; i <= N; i++) {
    for (int j = 1; j <= N; j++) {
        if (i == 1 || i == N || j == 1 || j == N) {
             System.out.print(N + " ");
        }
        else {
           System.out.print("  "); 
        } 
    }
    System.out.println();
}
```

    Masukkan nilai N : 5
    5 5 5 5 5 
    5       5 
    5       5 
    5       5 
    5 5 5 5 5 


Pada kode program ini saya menggunakan perulangan for dengan 2 perulangan. int i sebagai nilai pertama digunakan dalam membuat looping baris, int j sebagai nilai pertama digunakan dalam membuat looping kolom. Pada program ini diberi if supaya ketika baris selain awal dan baris selain akhir hanya print value dari N di awal dan di akhir saja. Setiap angka yang diinput oleh user merupakan representasi if (i == 1 || i == N || j == 1 || j == N). Else pada program ini berarti selainnya itu print spasi.

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int c = input.nextInt();
 for (int i = 1; i <= c; i++) { 
     for (int j = i; j <= c; j++) { 
     System.out.print(" ");
     }
     for (int k = 0; k <= (i * 2) - 2; k++) { 
     System.out.print("*");
     }
 System.out.println(" "); 
 }
```

    Masukkan nilai N : 3
       * 
      *** 
     ***** 



```Java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int c = input.nextInt();
 for (int i = 1; i <= c; i++) { 
     for (int j = i; j <= c; j++) { 
     System.out.print(" ");
     }
     for (int k = 0; k <= (i * 2) - 2; k++) { 
     System.out.print("*");
     }
 System.out.println(" "); 
 }
```

    Masukkan nilai N : 5
         * 
        *** 
       ***** 
      ******* 
     ********* 


Pada kode program ini saya menggunakan perulangan for sebanyak 3 perulangan. int c digunakan sebagai penerima input oleh user, int i sebagai nilai pertama untuk membuat baris, int j sebagai nilai pertama yang digunakan untuk looping baris dengan output " ", int k sebagai nilai nilai pertama untuk looping kolom dengan output *. Pertama k akan dieksekusi untuk mencetak 1 bintang, for i dijalankan sehingga mencetak baris baru, pada loop selanjutnya adalah kelipatan/ditambah dengan 2 sehingga akan menghasilkan 3 bintang di baris selanjutnya dan sampai seterusnya bintang akan ditambah 2.
