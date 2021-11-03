<dl>
  <dt>NIM :</dt>
  <dd>2141720098</dd>

  <dt>Nama :</dt>
  <dd>FRISARANDA DIOUF JULIO</dd>
    
  <dt>Kelas :</dt>
  <dd>TI 1A</dd>
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
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

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
for(int outer = 1; outer <= N; outer++){
    // Inner Loop
}
```

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Belum menghasilkan seperti gambar pada langkah 1.
2. 


```Java
import java.util.Scanner;

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int outer = 1; outer <= N; outer++){
    for(int i = 1; i < N; i++){
    System.out.print("*");
    }
    System.out.println("*");
}
```

    Masukkan nilai N : 5
    *****
    *****
    *****
    *****
    *****


> Penjelasan Percobaan 1 : Kode program di atas, meminta user untuk menginput sebuah bilangan. Kemudian, bilangan yang diinputkan tadi akan menjadi panjang sisi dari persegi bintang (*).

***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
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
1. Tidak sesuai dengan tahap 1.
2. 


```Java
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


> Pada luar body inner loop, tepat sebelum ekspresi increment diberi perintah System.out.println(""). Perintah ini berguna agar bintang tidak lurus ke kanan (horizontal) saja, tetapi bintang akan muncul di baris baru sesuai nilai N yang diinputkan user.

***
### Percobaan 3: Segitiga Angka
1.	Pada percobaan ke-3 akan dilakukan percobaan segitiga angka sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti berikut
![Gambar 7](images/img-07.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 8](images/img-08.png)



```Java
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
1. Tidak seperti yang diharapkan.
2. 


```Java
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


> Kode program yang harus dimodifikasi ada pada body inner loop, di mana awalnya System.out.print(j), kita ubah menjadi System.out.print(i). Jika kita mengeprint-kan variabel j, maka outputnya akan dimulai dari angka 1 pada setiap baris segitiga. Sedangkan jika kita mengeprint-kan variabel i, maka output pada setiap baris segitiga akan bertambah 1 dan angkanya akan sama pada baris itu.

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
    } while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 6
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?Y
    Tebak angka (1-10) : 7
    Tebak angka (1-10) : 8
    Tebak angka (1-10) : 9
    Tebak angka (1-10) : 10
    Tebak angka (1-10) : 2
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?T


#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Kode program dimulai dengan meng-import library Scanner dan Random. Library Random ini berfungsi sebagai random number generator. Lalu, kita akan melakukan deklarasi Scanner dan penginisialisasi tipe data char. Kemduian, kita menggunakan fungsi do-while sebagai outer loop. Di dalam body outer loop ini kita akan menginisialisasi boolean success bernilai false. Lalu, kita akan menggunakan fungsi do-while lagi sebagai inner loop. Dalam inner loop ini, user diminta untuk menebak angka (1-10) yang sudah diacak tadi. Jawaban akan disimpan dalam variabel answer. Lalu, kita tambahkan fungsi pemilihan if yang berisi jika answer (angka yang diinputkan user) sama dengan number (angka yang sudah diacak oleh library Random), maka akan muncul kalimat "Yay... tebakan Anda benar... Selamat!!!" dan permainan selesai serta inner loop akan berakhir. Apabila masih salah, user akan diminta menebak angka 1-10 lagi. Saat jawaban benar user akan ditanya apakah ingin mengulang permainan, dan jika menginputkan y atau Y, maka permainan diulangi. Jika user menginputkan selain y atau Y, maka permainan akan berakhir.
2. Dengan menginputkan huruf selain y atau Y.



```Java
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
        } else if(answer > number){
            System.out.println("Tebakan Anda lebih besar dari jawaban");
        } else if(answer < number){
            System.out.println("Tebakan Anda lebih kecil dari jawaban");
        }
    } while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 3
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 4
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 5
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 6
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 7
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 8
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 9
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 10
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?y
    Tebak angka (1-10) : 3
    Tebakan anda lebih kecil dari jawaban
    Tebak angka (1-10) : 7
    Tebakan anda lebih besar dari jawaban
    Tebak angka (1-10) : 6
    Tebakan anda lebih besar dari jawaban
    Tebak angka (1-10) : 5
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?t



```Java
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';
int coba = 0;

do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        coba++;
            
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        } else if(answer > number){
            System.out.println("Tebakan Anda lebih besar dari jawaban");
        } else if(answer < number){
            System.out.println("Tebakan Anda lebih kecil dari jawaban");
        } if(coba == 10){
            System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
            success = true;
        }
    } while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Tebak angka (1-10) : 2
    Tebakan Anda lebih kecil dari jawaban
    Maaf Anda gagal menebak angka sebanyak 10x
    Apakah Anda ingin mengulang permainan (Y/y)?y
    Tebak angka (1-10) : 1
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?t


***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = N; j >= i; j--){
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++){
        System.out.print("*");
    }
    System.out.println();
}
```

    Masukkan nilai N = 5
         *
        **
       ***
      ****
     *****


> Penjelasan Soal 1 : Kode program di atas menggunakan perulangan bersarang. Pada outer loop, jika kondisi memenuhi syarat akan memberi atau menambah baris baru. Pada inner loop pertama, jika kondisi memenuhi syarat maka akan menge-print spasi dan akan berkurang sesuai penambahan baris. Sedangkan pada inner loop kedua, jika kondisi memenuhi syarat maka akan menge-print tanda bintang (*) dan akan terus bertambah sesuai baris ke berapa.

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1; j <= N; j++){
        if(i == 1 || i == N || j == 1 || j == N){
            System.out.print(N);
        } else{
            System.out.print(" ");
        }
    }
    System.out.println("");
}
```

    Masukkan nilai N = 5
    55555
    5   5
    5   5
    5   5
    55555


> Penjelasan Soal 2 : Kode program di atas menggunakan perulangan bersarang atau nested loop. Pada outer loop, jika kondisi memenuhi syarat akan memberi atau menambah baris baru sesuai inputan user. Pada inner loop, ini akan menentukan seberapa banyak lebar dari persegi tersebut. Inputan dari user akan menentukan seberapa banyak perulangan ke samping (lebar persegi). Pada body inner loop ini terdapat sintaks if yang berarti jika i berada pada baris 1 atau baris ke-N, program akan mencetak nilai N secara mendatar. Sementara jika j berada pada baris 1 atau baris ke-N, program akan mencetak nilai N secara menurun. Lalu, jika kondisi if tadi tidak terpenuhi, maka program akan menge-print " ", artinya kosong. Hal inilah yang membuat persegi tersebut memiliki lubang di tengahnya.

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai N = ");
int N = sc.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = N; j >= i; j--){
        System.out.print(" ");
    }
    for(int k = 1; k <= i; k++){
        System.out.print("*");
    }
    for(int l = 1; l <= i - 1; l++){
        System.out.print("*");
    }
    System.out.println();
}
```

    Masukkan nilai N = 5
         *
        ***
       *****
      *******
     *********


> Penjelasan Soal 3 : Kode program di atas menggunakan perulangan bersarang atau nested loop. Kode ini sebenarnya hanyalah segitiga siku-siku yang dibagi 2, sebelah kanan dan kiri. Pada outer loop, jika kondisi terpenuhi maka memberi atau menambah baris baru sesuai inputan user. Pada inner loop pertama, jika kondisi terpenuhi maka akan memberi spasi dan akan berkurang sesuai penambahan baris. Pada inner loop kedua, jika kondisi terpenuhi makan akan menge-print tanda bintang (*) pada segitiga siku-siku sebelah kiri. Pada inner loop ketiga, jika kondisi terpenuhi maka akan menge-print tanda bintang pada segitiga siku-siku sebelah kanan, tetapi tidak sebanyak bintang pada segitiga kiri karena pada syarat tertulis i - 1, yang artinya banyaknya baris pada segitiga kanan memiliki selisih 1 dengan banyaknya baris pada segitiga kiri.
