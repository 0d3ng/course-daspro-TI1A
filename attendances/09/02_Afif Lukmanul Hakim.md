<dl>
  <dt>NIM :</dt>
  2141720262

  <dt>Nama :</dt>
  Afif Lukmanul Hakim
    
  <dt>Kelas :</dt>
  1A-TI
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
System.out.print("Masukkan Nilai N: ");
N = sc.nextInt();

for(int i = 0; i <= N; i++){
    System.out.print("*");
}
```

    Masukkan Nilai N: 5
    ******

5.	Perhatikan sintaks perulangan yang digunakan untuk mencetak * sebanyak N kali ke arah samping. Di tahap 4 di atas kode _looping **for**_ kita jadikan sebagai _**inner loop**_. 
6.	Kita looping lagi _inner loop_ sebanyak N kali untuk menghasilkan _output_ seperti tahap 2. Maka perlu ditambahkan perulangan luar (_outer loop_).
![Gambar 3](images/img-03.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 6 (gabungkan dengan inner loop pada langkah 4)
for(int outer = 1; outer <= N; outer++){
    // Inner Loop
}
```

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Dari yang sudah saya ketikkan ulang sesuai code programnya dan mencoba menjalankan code program tersebut hasil outputnya tidak sama hanya menampilkan output satu baris saja

2. Hasil modifikasi code program menurut saya di bawah ini.



```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;
int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan Nilai N: ");
N = sc.nextInt();

for(int i = 1; i <= N; i++){
    for(int outer = 1; outer <= N; outer++){
    System.out.print("*");
    }
    System.out.println();
}
```

    Masukkan Nilai N: 5
    *****
    *****
    *****
    *****
    *****


Dari code program tersebut kita nembuat loop nesting yang dimana menghasilkan output bintang yang sejajar baik baris maupun kolom.

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
System.out.print("Masukkan Nilai N = ");
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

    Masukkan Nilai N = 5
    ***************

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Hasil yang ditampilkan code program langkah ke-3 tidak sesuai dengan output yang diminta di langkah pertama
2. Untuk bagian yang perlu ditambahkan agar sesuai output yang diminta yaitu bagian memasukkan tipe data dan variabel dari contoh di atas berupa "int N"-nya belum ada jadi perlu ditambahkan agar yang diminta scanner terbaca dan penambahan "System.out.println()" di bagian sebelum i++ Seperti code program yang sudah saya modifikasi di bawah ini.


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

System.out.print("Masukkan Nilai N:  ");
int N = sc.nextInt();

int i = 0;
while(i <= N){
    int j = 0;
    while(j < i){
        System.out.print("*");
        j++;
    }
    System.out.println();
    i++;
}
```

    Masukkan Nilai N:  5
    
    *
    **
    ***
    ****
    *****


Pada code program tersebut kita membuat loop nesting menggunakan syntak do-while di mana output yang dihasilkan harus bintang membentuk segitiga.

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

System.out.print("Masukkan Nilai N: ");
int N = input.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1; j<= i; j++){
        System.out.print(j);
    }
    System.out.println();
}
```

    Masukkan Nilai N: 5
    1
    12
    123
    1234
    12345


#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Code program tersebut tidak sesuai yang diharapkan karena output yang ditampilkan pada contoh tersebut angka yang ditampilkan setiap barisnya sama dan sedangkan output yang dihasilkan dari code program tersebut benar membentuk segitiga akan tetapi setiap barisnya angka yang muncul berbeda
2. Untuk code program yang menurut saya benar dengan cara mengubah variabel pada code "System.out.print(j)" menjadi "System.out.print(i) seperti code di bawah ini.


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.print("Masukkan Nilai N: ");
int N = input.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1; j<= i; j++){
        System.out.print(i);
    }
    System.out.println();
}
```

    Masukkan Nilai N: 5
    1
    22
    333
    4444
    55555


Pada code program di atas menggunakan loop nesting dengan menggunakan syntak for dan di mana hasil outputnya harus urut angka secara vertikal dengan membentuk segitiga siku-siku.

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

do {
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan anda benar... Selamat!!!");
            success = true;
        }
    } while(!success);
    
    System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/y)? ");
    menu = input.nextLine() .charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 6
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 9
    Tebak angka (1-10) : 8
    Yay... tebakan anda benar... Selamat!!!
    Apakah Anda Ingin Mengulang Permainan (Y/y)? y
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 7
    Tebak angka (1-10) : 8
    Tebak angka (1-10) : 10
    Tebak angka (1-10) : 9
    Yay... tebakan anda benar... Selamat!!!
    Apakah Anda Ingin Mengulang Permainan (Y/y)? no


#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 

    A. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!

    B. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. alur dari program di atas yaitu code tersebut menghasilkan angka random yang kita tidak ketahui dan kita harus menebak angka tersebut dengan cara menginputkan sebuah angka dan jika angka tidak sesuai maka kita harus menebak lagi angka tersebut sampai benar, dan jika tebakan kita sudah benar maka muncul print kata "Yay... tebakan anda benar... Selamat!!!". Setelah itu kita diminta untuk menginputkan Y/y jika ingin mengulang permainan tebak angka tersebut.
2. Mungkin dengan cara menginputkan kata selain Y/y misal bisa menginputkan kata "no".


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.A disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do {
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan anda benar... Selamat!!!");
            success = true;
        } else if(answer > number){
            System.out.println("Tebakan anda lebih besar");
        }else{
             System.out.println("Tebakan anda lebih kecil");
        }
    } while(!success);
    
    System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/y)? ");
    menu = input.nextLine() .charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 6
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 9
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 10
    Yay... tebakan anda benar... Selamat!!!
    Apakah Anda Ingin Mengulang Permainan (Y/y)? no



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */ 
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';
int jawab = 0;

do {
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        jawab++;
        
        if(answer == number){
            System.out.println("Yay... tebakan anda benar... Selamat!!!");
            success = true;
        } else if(answer > number){
            System.out.println("Tebakan anda lebih besar");
        }else{
             System.out.println("Tebakan anda lebih kecil");
        } if(jawab == 10){
            System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
            success = true;
        }
    } while(!success);
    
    System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/y)? ");
    menu = input.nextLine() .charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 1
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 2
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 1
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 3
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 2
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 1
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 2
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 1
    Tebakan anda lebih kecil
    Tebak angka (1-10) : 2
    Tebakan anda lebih kecil
    Maaf Anda gagal menebak angka sebanyak 10x
    Apakah Anda Ingin Mengulang Permainan (Y/y)? no

Dalam code program di atas kita membuat sebuah permainan tebak angka yang di mana masih menggunakan perulangan karena jika kita salah menebak angka, maka kita akan diminta untuk memasukkan angka lagi sampai angka sama dengan angka yang ada pada program dan syntak yang dipakai adalah do-while


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
int N;
System.out.print("Masukkan Nilai N= ");
N = sc.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = N; i < j; j--){
        System.out.print(" ");
    }
    for(int j = 1; j <= i; j++){
        System.out.print("*");
    }
    System.out.println();
}
```

    Masukkan Nilai N= 5
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
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan Nilai N= ");
N = sc.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1; j <= N; j++){
        if(i == 1 || i == N) 
            System.out.print(N);
        else if(j == 1 || j == N) 
            System.out.print(N);
        else 
            System.out.print(" ");
    }
        System.out.println();
}
```

    Masukkan Nilai N= 3
    333
    3 3
    333

    
    Masukkan Nilai N= 5
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
Scanner input = new Scanner(System.in);
int N;
System.out.print("Masukan niali N = ");
N = input.nextInt();
        
for(int i = 1; i <= N; i++){ 
    for(int j = i; j <= N; j++){
        System.out.print(" ");
    }
    for(int k=0; k<=(i*2)-2; k++){
        System.out.print("*");
    }
    System.out.println();
}
```

    Masukan niali N = 3
       *
      ***
     *****

    Masukan niali N = 5
         *
        ***
       *****
      *******
     *********

