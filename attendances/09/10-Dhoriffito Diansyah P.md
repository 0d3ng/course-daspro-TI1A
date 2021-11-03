<dl>
  <dt>NIM :</dt>
  <dd>2141720201</dd>

  <dt>Nama :</dt>
  <dd>Dhoriffito Diansyah Putra</dd>
    
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
Scanner sc = new Scanner(System.in);

int N;
System.out.println("Masukkan nilai N:");
N = sc.nextInt();

for(int i = 0; i <= N; i++) {
  System.out.print("*");
}

```
```
Masukkan nilai N:5
******
```

5.	Perhatikan sintaks perulangan yang digunakan untuk mencetak * sebanyak N kali ke arah samping. Di tahap 4 di atas kode _looping **for**_ kita jadikan sebagai _**inner loop**_. 
6.	Kita looping lagi _inner loop_ sebanyak N kali untuk menghasilkan _output_ seperti tahap 2. Maka perlu ditambahkan perulangan luar (_outer loop_).
![Gambar 3](images/img-03.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 6 (gabungkan dengan inner loop pada langkah 4)
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int N;
System.out.println("Masukkan nilai N:");
N = sc.nextInt();

for(int outer=1;outer<=N;outer++){
for(int i = 0; i <= N; i++) {
  System.out.println("*");
}
}

```
```
Masukkan nilai N:
5
******************************
```

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Belum seperti pada langkah 1
2. ...


```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;

    System.out.println("Masukkan nilai N : ");
    N = sc.nextInt();

    for (int outer=1; outer<=N;outer++) {
       for(int i=0; i<=N;i++) {
            System.out.print("*");
       }
       System.out.println();
    }


```
```
Masukkan nilai N : 
5
******
******
******
******
******
```

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
Scanner sc = new Scanner(System.in);
System.out.println("Masukkan nilai N = ");
    int N = sc.nextInt();
    int i =0;
    while(i<=N){
        int j = 0;
        while(j<i){
            System.out.print("*");
            j++;
        }
        
        i++;
    }

```
```
Masukkan nilai N = 
5
***************
```

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Belum sama
2. ...


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.println("Masukkan nilai N = ");
    int N = sc.nextInt();
    int i =0;
    while(i<=N){
        int j = 0;
        while(j<i){
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }


```
```
Masukkan nilai N = 
5
*
**
***
****
*****
******
```
```
yang harus ditambahkan adalah "System.out.println();" agar nanti saat kita jalankan program tersebut terdapat jarak saat dilakukan inner loop, jadi akan terkeluarkan baris baru sampai programnya selelsai
```

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

    System.out.println("Masukkan nilai N : ");
    int N = sc.nextInt();

    for (int i = 1;i<=N;i++) {
        for (int j = 1;j<=i;j++) {
            System.out.print(j);
        }
        System.out.println();
    }

```
```
Masukkan nilai N : 
5
1
12
123
1234
12345
```

#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. belum
2. ...


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
import java.util.Scanner;
Scanner input = new Scanner(System.in);

    System.out.println("Masukkan nilai N : ");
    int N = sc.nextInt();

    for (int i = 1;i<=N;i++) {
        for (int j = 1;j<=i;j++) {
            System.out.print(i);
        }
        System.out.println();
    }

```
```
Masukkan nilai N : 
5
1
22
333
4444
55555
```
```
modifikasi yang harus dilakukan agar output yang dikeluarkan benar adalah dengan merubah print(j) menjadi print(i),karena jika kita ingin setiap baris memiliki angka yang sama. saat yang dikeluarkan print(j) angka yang dimulai dari angka 1 sedangkan jika print(i) jika berganti baris baru akan bertambah 1 dan tak akan berubah pada baris yang sama.
```

***
### Percobaan 4: Tebak Angka
1. Pada Percobaan 4 ini, kita akan belajar membuat kode untuk menebak angka menggunakan _nested loop_.
2. Pada percobaan ini kita menggunakan library Scanner untuk menangkap input dari keyboard dan Random untuk meng-generate angka secara acak
3. Ketik dan pahami kode program di bawah ini
![Gambar 6](images/img-06.png)


```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
import java.util.Random;
import java.util.Scanner;

Random random = new Random();
Scanner sc = new Scanner (System.in);
char menu = 'y';

    do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    do{
        System.out.print("Tebak angka (1 - 10) : ");
        int answer = sc.nextInt();
        sc.nextLine();

        if(answer == number){
            System.out.println("Yay...tebakan Anda benar...Selamat!!");
            success = true;
        }
    }while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)");
    menu = sc.nextLine().charAt(0);
}while(menu == 'y' || menu == 'Y');

```
```
Tebak angka (1 - 10) : 5
Yay...tebakan Anda benar...Selamat!!
Apakah Anda ingin mengulang permainan (Y/y)>y
Tebak angka (1 - 10) : 1
Tebak angka (1 - 10) : 3
Tebak angka (1 - 10) : 5
Tebak angka (1 - 10) : 4
Tebak angka (1 - 10) : 6
Tebak angka (1 - 10) : 8
Tebak angka (1 - 10) : 7
Yay...tebakan Anda benar...Selamat!!
Apakah Anda ingin mengulang permainan (Y/y)Y
Tebak angka (1 - 10) : 
```

#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. 
    a.mengimport scanner agar user dapat memasukkan nilai yang ingin ditebak
    b.membuat variabel untuk menyimpan data user
    c. ada 2 looping yang terjadi yaitu inner untuk agar user dapat memasukkan tebakannya,sedangkan untuk outernya berguna untuk memulai kembali permainan saat user berhasil menebak angkanya
    d.inner looping akan terus terjadi saat variabel success nilainya false 
    e.menu digunakan agar kita dapat mengetahui yang di inpitkan oleh user apakah bernilai Y/y jika selain dari itu maka program akan berhenti 

2. agar dapat terhenti user harus menebak angkanya dengan benar, setelahnya user harus memasukkan karakter diluar Y/y agar dapat berhenti 



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.A disini */
Scanner sc = new Scanner(System.in);
    

    Random random = new Random();

char menu = 'y';

    do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    do{
        System.out.print("Tebak angka (1 - 10) : ");
        int answer = sc.nextInt();
        sc.nextLine();

        if(answer == number){
            System.out.println("Yay...tebakan Anda benar...Selamat!!");
            success = true;
        }else if (answer>number){
            System.out.println("maaf angka anda lebih besar");
        }else{
            System.out.println("maaf angka anda lebih kecil ");
        }
    }while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (y/n)");
    menu = sc.nextLine().charAt(0);
}while(menu == 'y');

```
```
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 5
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 10
maaf angka anda lebih besar
Tebak angka (1 - 10) : 7
Yay...tebakan Anda benar...Selamat!!
Apakah Anda ingin mengulang permainan (y/n)>n
```


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
char menu = 'y';
int b=0;

    do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    do{
        System.out.print("Tebak angka (1 - 10) : ");
        int answer = sc.nextInt();
        sc.nextLine();

        if(answer == number){
            System.out.println("Yay...tebakan Anda benar...Selamat!!");
            success = true;
        }else if (answer>number){
            System.out.println("maaf angka anda lebih besar");
        }else{
            System.out.println("maaf angka anda lebih kecil ");
        }
    b++;
    if(b==10){
        System.out.println("Maaf anda gagal menebak angka sebanyak 10x");
        break;
    }
    }while(!success);
    
    System.out.print("Apakah Anda ingin mengulang permainan (y/n)");
    menu = sc.nextLine().charAt(0);
}while(menu == 'y');


```
```
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2    
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Tebak angka (1 - 10) : 2
maaf angka anda lebih kecil 
Maaf anda gagal menebak angka sebanyak 10x
Apakah Anda ingin mengulang permainan (y/n)n
```

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
Scanner scanner = new Scanner(System.in);
int j, i = 0; 
    System.out.println("masukkan nilai n: ");
    int N = sc.nextInt();
    
    for ( i = 1; i <= N; i++){
        for ( j = N;j>=1; j--){
            if (i<j){
                System.out.print(" ");
            }else{
            
                System.out.print("*");
            }
        }
        System.out.println( );
    }

```
```
masukkan nilai n: 
5
    *
   **
  ***
 ****
*****
```
```
1. inner loop bertujuan agar dapat menampilkan bintang ataupun spasi dalam tiap kolom
2. Outer loop bertujuan agar dapat menampilan tiap barisnya dari segitiga
3. jika pada saat baris bernilai 1 kurang dari j atau kurang dari N maka tampilan dari spasinya jika tidak ada bintang akan dikurangi nilai j. Akhirnya nilai dari i dapat lebih dari sama dengan j
```

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.println("masukkan nilai N");
    int N =sc.nextInt();
    if(N > 3)
    for(int i =1;i<=N;i++ ){
        for(int j =1;j<=N;j++){
            if(i == 1 || i == N || j == 1 || j == N){
                System.out.print(N+" ");
            }else{
                System.out.print(" "+" ");
            }
        }
        System.out.println();
    }


```
```
masukkan nilai N
5
5 5 5 5 5 
5       5
5       5
5       5
5 5 5 5 5
```
```
a. jika pada saat user memasukkan nilai kurang dari 3 maka program tersebut akan terhenti
b. Jika yang terjalankan pada baris pertama dan baris terakhir maka yang muncul N pada setiap kolom tersebut
```

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Masukan N: ");
        int tinggi = sc.nextInt(); 
    
        for(int t=1; t<=tinggi; t++){         
            for(int s=t; s<=tinggi; s++){
                System.out.print(" ");
            }
            for(int b=0; b<=(t*2)-2; b++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        //t = tinggi
        //s = Spasi
        //b = bintang

```


```
Masukan N: 25
                         *
                        ***
                       *****
                      *******
                     *********
                    ***********
                   *************
                  ***************
                 *****************
                *******************
               *********************
              ***********************
             *************************
            ***************************
           *****************************
          *******************************
         *********************************
        ***********************************
       *************************************
      ***************************************
     *****************************************
    *******************************************
   *********************************************
  ***********************************************
 *************************************************

```
