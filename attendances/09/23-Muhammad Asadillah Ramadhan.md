<dl>
  <dt>NIM :</dt>
  <dd>2141720093</dd>

  <dt>Nama :</dt>
  <dd>Muhammad Asadillah Ramadhan</dd>
    
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
for(int outer = 1; outer <= N ; outer++){
 for(int i = 0; i <= N; i++){
    System.out.print("*");
}
 
}
```

    ********************

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Tidak
2. Kode program ada di bawah



```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan Nilai N: ");
N = sc.nextInt();

for(int outer = 1; outer <= N ; outer++){
 for(int i = 1; i <= N; i++){
    System.out.print("*");
    
}   
    System.out.println();
}
```

    Masukkan Nilai N: 10
    **********
    **********
    **********
    **********
    **********
    **********
    **********
    **********
    **********
    **********


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
1. Belum
2. Yang perlu diperbaiki adalah menambahkan spasi untuk setiap baris yang diinginkan, untuk lebih jelasnya kode program ada di bawah


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

    Masukkan nilai N : 7
    1
    12
    123
    1234
    12345
    123456
    1234567


## Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Belum
2. Kode program pada System.out.print, yang awalnya mengeluarkan output j, diganti dengan variabel i.


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
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
        int answer =  input.nextInt();
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
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?d


#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Alur program diatas adalah menebak angka. User akan diminta memasukkan angka, lalu akan terus di loop/terus diminta memasukkan angka sampai benar. Lalu jika benar akan muncul kalimat "Yay... tebakan Anda benar... Selamat!!!" dan ditanya "Apakah Anda ingin mengulang permainan (Y/y)?", namun pada kode program tersebut tidak bisa menghentikan permainan, yang berarti user diminta untuk bermain terus menerus.
2. User harus menginputkan karakter selain 'Y' dan 'y' setelah menebak benar angka.



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
        int answer =  input.nextInt();
        input.nextLine();
        
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        } else if (answer >= number){
            System.out.println("Angka Anda Terlalu Besar! Masukkan Lagi!");
        } else if (answer <= number){
            System.out.println("Angka Anda Terlalu Kecil! Masukkan Lagi!");
        }
    } while(!success);
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);

} while(menu == 'y' || menu == 'Y');

```

    Tebak angka (1-10) : 1
    Angka Anda Terlalu Kecil! Masukkan Lagi!
    Tebak angka (1-10) : 5
    Angka Anda Terlalu Kecil! Masukkan Lagi!
    Tebak angka (1-10) : 6
    Angka Anda Terlalu Kecil! Masukkan Lagi!
    Tebak angka (1-10) : 9
    Angka Anda Terlalu Besar! Masukkan Lagi!
    Tebak angka (1-10) : 7
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n



```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
import java.util.Scanner;
import java.util.Random;
Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';
int i=0;
do{
    int number = random.nextInt(10) + 1;
    boolean success = false;
    
    do{
        System.out.print("Tebak angka (1-10) : ");
        int answer =  input.nextInt();
        input.nextLine();
        i++;
        if(answer == number){
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        } else if(i == 10){
            System.out.print("Maaf Anda Gagal Menebak Angka Sebanyak 10 Kali!");
            break;
        }
    }  while(!success);
    if (i == 10){
        break;
    }
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
    
} while(menu == 'y' || menu == 'Y');

```

    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 1
    Maaf Anda Gagal Menebak Angka Sebanyak 10 Kali!

# ***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
Scanner gg = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N: ");
N = gg.nextInt();
for (int i = 1; i <= N; i++){
    for (int j = N; j >= 1; j--){
    if(i<j){
        System.out.print(" ");
    } else {
        System.out.print("*");
    }
        
    }
    System.out.println();
}
```

    Masukkan nilai N: 30
                                 *
                                **
                               ***
                              ****
                             *****
                            ******
                           *******
                          ********
                         *********
                        **********
                       ***********
                      ************
                     *************
                    **************
                   ***************
                  ****************
                 *****************
                ******************
               *******************
              ********************
             *********************
            **********************
           ***********************
          ************************
         *************************
        **************************
       ***************************
      ****************************
     *****************************
    ******************************


Penjelasan: Kode program berikut, digunakan untuk membuat segitiga siku siku terbalik. Mula mula user diminta untuk menginputkan angka yang akan menjadi tinggi segitiga. Setelah itu, segitiga akan terbentuk dengan sendirinya dengan elemn bintang dan memiliki tinggi sesuai N yang diinput.

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
/* Jawaban Soal 2 disini */
Scanner ram = new Scanner(System.in);
int i, N;
System.out.print("Masukkan nilai N: ");
N = ram.nextInt();
if (N >= 10){
    System.out.print("Maaf Angka Harus Menggunakan 1 Digit Angka!");
} else if (N == 0){
    System.out.print("Maaf Angka Tidak Boleh 0!");
}
for(i = 1; i <= N; i++)
     {if (N >= 10){
         break;
     } else if (N == 0){
         break;
     }
         for(int j = 0; j <= N-1; j++)
             {
                 if (i==1||i==N||j==0||j==N-1)
                 {
                     System.out.print(N + " ");
                 }
                 else
                 {
                     System.out.print("  ");
                 }
             }
         System.out.println();
     }

```

    Masukkan nilai N: 9
    9 9 9 9 9 9 9 9 9 
    9               9 
    9               9 
    9               9 
    9               9 
    9               9 
    9               9 
    9               9 
    9 9 9 9 9 9 9 9 9 


Penjelasan: Kode program tersebut berfungsi untuk membentuk segitiga menggunakan elemen angka yang diinputkan. Mula mula user diminta untuk menginputkan sebuah angka 1 digit, lalu akan dibentuk segitiga menggunakan elemen angka tersebut yang memiliki lubang ditengah (persegi tanpa isi). Jika angka lebih dari 2 digit, akan ditolak dan muncul tulisan "Maaf Angka Harus Menggunakan 1 Digit Angka!". Namun juga jika bilangan yang diinputkan 0 maka akan ditolak dan muncul tulisan "Maaf Angka Tidak Boleh 0!".

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
Scanner ram = new Scanner(System.in);
 int N;
System.out.print("Masukkan nilai N: ");
N = ram.nextInt();
       for (int i = 1; i <= N; i++){
           for (int j = 20; j >= i; j--) {
               System.out.print(" ");
           }
           for (int k = 1; k <= i; k++){
               System.out.print('*');
           }
           for (int l = 1; l <= i - 1; l++){
               System.out.print('*');
           }
           System.out.println();
       }
```

    Masukkan nilai N: 20
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


Penjelasan: Kode program tersebut digunakan untuk membuat piramida, pertama-tama user diminta untuk meninputkan tinggi piramida, lalu piramida akan terbentuk dengan memanfaatkan "*" dan " " untuk membuat elemen tersebut.
