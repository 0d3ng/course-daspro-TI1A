<dl>
  <dt>NIM :</dt>
  <dd>2141720004</dd>

  <dt>Nama :</dt>
  <dd>Alya Marliza Koesnanto</dd>
    
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
import java.util.Scanner;

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukan nilai N : ");
N = sc.nextInt();

for (int i = 0; i <= N; i++){
    System.out.print("*");
}
```

    Masukan nilai N : 10
    ***********

5.	Perhatikan sintaks perulangan yang digunakan untuk mencetak * sebanyak N kali ke arah samping. Di tahap 4 di atas kode _looping **for**_ kita jadikan sebagai _**inner loop**_. 
6.	Kita looping lagi _inner loop_ sebanyak N kali untuk menghasilkan _output_ seperti tahap 2. Maka perlu ditambahkan perulangan luar (_outer loop_).
![Gambar 3](images/img-03.png)


```Java
import java.util.Scanner;

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukan nilai N : ");
N = sc.nextInt();

for (int i = 0; i <= N; i++){
    System.out.print("*");
}
    for (int outer = 1; outer <= N; outer++){
   // inner loop
}
```

    Masukan nilai N : 5
    ******

#### Pertanyaan 
1. Apakah dengan menggabungkan _inner loop_ dan _outer loop_ seperti langkah 5 di atas sudah menghasilkan _output_ seperti gambar pada langkah 1?
2. Jika belum, silahkan modifikasi kode program sehingga menghasilkan output yang sesuai dengan gambar pada langkah 2?

#### Jawaban
1. Tidak, alasannya karena output pada langkah 1 mengeluarkan nilai berupa angka sedangkan pada langkah 5
2. Ya


```Java
import java.util.Scanner;

int N;
Scanner sc = new Scanner(System.in);
System.out.print("Masukan nilai N : ");
N = sc.nextInt();

for (int i = 0; i <= N; i++){
    for(int outer= 1; outer <= N; outer++){
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
    *****


***
### Percobaan 2: Bintang Segitiga
1.	Pada percobaan ke-2 akan dilakukan percobaan segitiga * sama siku dengan tinggi sebesar N. Misalkan N dimasukan **5**, maka hasilnya seperti gambar berikut
![Gambar 4](images/img-04.png)
2. Karena program membutuhkan input dari keyboard, maka perlu import class Scanner
3. Ketikan kode program di bawah ini
![Gambar 5](images/img-05.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
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

    Masukkan nilai N : 5
    ***************

Amati kode program yang telah kalian tulis di atas.

#### Pertanyaan
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan  tampilan seperti pada tahap 1 (Percobaan 2)?
2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan. 

#### Jawaban
1. Tidak
2. Agar output berubah,maka tambahkan perintah "System.out.println();" setelah j++ dan tanda }.


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
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
import java.util.Scanner;

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int N = input.nextInt();

for (int i = 1; i <= N; i++){
    for (int j = 1; j <= i; j++){
        System.out.print(j);
    }
    System.out.println();
}
```

    Masukkan nilai N : 10
    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910


#### Pertanyaan 
1. Apakah kode program di atas menghasilkan _output_ yang diharapkan?
2. Jika belum, kode program mana yang harus modifikasi? Jelaskan

#### Jawaban
1. Tidak, karena output yang diinginkan adalah output yang memunculkan nilai yang sama dalam bentuk piramida/segitiga. contohnya, 1 lalu 22 dan seterusnya.
2. Pada bagian "System.out.print(j);" dirubah menjadi "System.out.print(i);". Alasannya karena perintah <= pada interger i mengikuti pada hasil kurang lebihnya interger N.


```Java
import java.util.Scanner;

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int N = input.nextInt();

for (int i = 1; i <= N; i++){
    for (int j = 1; j <= i; j++){
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
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false; 
    do {
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine();
        if (answer == number){
            System.out.println ("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
            
        }
    } while(!success);
    System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 6
    Tebak angka (1-10) : 8
    Tebak angka (1-10) : 10
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 6
    Tebak angka (1-10) : 
    7
    Tebak angka (1-10) : 8
    Tebak angka (1-10) : 9
    Yay... tebakan Anda benar... Selamat!!!
    Apakah anda ingin mengulang permainan (Y/y)?n


##### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Alur program diatas diciptakan/dibuat untuk menebak suatu nilai angka secara bebas, jika nilai angka yang dimasukkan benar maka program akan berhenti dan mengeluarkan pesan "Yay... tebakan Anda benar... Selamat!!!" dan "Apakah anda ingin mengulang permainan (Y/y)?". Maka perulangan dari pemrograman diatas menggunakan Nested Loop Do While yang berarti program akan berjalan apabila statement(pernyataan) dijalan lalu kondisi baru berjalan.

2. Pada baris terakhir pemograman diatas terdapat sebuah perintah yang merujuk pada berhentinya sebuah perulangan namun tidak menggunakan perintah "Break". Perintah diatas menggunakan tipe data char yang bernilai "y". Apabila kita mengeluarkan huruf selain "y/Y" maka perulangan akan  berhenti.



```Java
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
        if (answer == number){
            System.out.println ("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        }else if (answer <= number){
            System.out.println ("Nilai yang anda masukkan kurang!");
        }else if (answer >= number){
            System.out.println ("Nilai yang anda masukkan lebih!");
        }else{
            System.out.println ("Nilai yang anda masukkan benar");
        }
    } while(!success);
    System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 8
    Nilai yang anda masukkan lebih!
    Tebak angka (1-10) : 5
    Nilai yang anda masukkan lebih!
    Tebak angka (1-10) : 10
    Nilai yang anda masukkan lebih!
    Tebak angka (1-10) : 11
    Nilai yang anda masukkan lebih!
    Tebak angka (1-10) : 2
    Nilai yang anda masukkan kurang!
    Tebak angka (1-10) : 3
    Nilai yang anda masukkan kurang!
    Tebak angka (1-10) : 4
    Yay... tebakan Anda benar... Selamat!!!
    Apakah anda ingin mengulang permainan (Y/y)?n



```Java
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';

do{
    int number = random.nextInt(10) + 1;
    boolean success = false; 
    int refresh = 0;
    
    do {
        System.out.print("Tebak angka (1-10 ) : ");
        int answer = input.nextInt();
        input.nextLine();
        
        if (answer == number){
            System.out.println ("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        }else if(answer >= number){
            System.out.println ("Nilai yang anda masukkan kurang "); 
        }else{
            System.out.println ("Nilai yang anda masukkan salah");
        }
        if (refresh == 10){
            System.out.println ("Maaf anda sudah mencoba 10x, kesempatan anda sudah habis");
            break;
        }
            refresh++;
        
    } while(!success);
    System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0);
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Tebak angka (1-10 ) : 1
    Nilai yang anda masukkan salah
    Maaf anda sudah mencoba 10x, kesempatan anda sudah habis
    Apakah anda ingin mengulang permainan (Y/y)?n


***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukan nilai N : ");
int n = input.nextInt();

for(int i = 1; i <= n;){ 
    for (int j = n; j >= 1;){
      if (i < j){
        System.out.print(" ");
     }else{
        System.out.print("*");
            } 
        j--;  
    }
    System.out.println();
    i++; 
}
```

    Masukan nilai N : 5
        *
       **
      ***
     ****
    *****


**Penjelasan :**
Dari pemrograman diatas menggunakan nested loop. Untuk perintahnya menggunakan library scanner untuk memasukkan nilai N beserta nilai lainnya. Lalu menggunakan perulangan for pada nilai i untuk bagian outer loop dan menggunakan perulangan for pada nilai j untuk inner loop.

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int n;
n = sc.nextInt();

for (int i = 1; i <= n;){
    for (int j = 1; j <= n;){
        if (i == 1 || i == n || j == 1 || j == n) {
             System.out.print(n + " ");
        }
        else {
           System.out.print("  "); 
        } 
         j++;
    }
    System.out.println();
    i++;
}
```

    Masukkan nilai N : 5
    5 5 5 5 5 
    5       5 
    5       5 
    5       5 
    5 5 5 5 5 


**Penjelasan :**
Dari pemrograman diatas menggunakan perulangan for dan if else. Lalu menampilkan hasil nested loop for dalam bentuk persegi atau bentuk pigura. 

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan nilai N : ");
int n;
n = sc.nextInt();

for(int i = 1; i <= n; i++){
    for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
    }for(int l = 0; l != 2 * i - 1; l++){
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


**Penjelasan :**
Dari pemrograman diatas menggunakan nested loop for namun dengan bentuk yang berbeda dari sebelumnya yang merupakan bentuk segitiga siku siku atau tangga naik, sedangkan diatas bentuknya seperti segitiga sama sisi atau piramida.
