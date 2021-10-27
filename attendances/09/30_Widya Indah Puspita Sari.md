<dl>
  <dt>NIM : 2141720034</dt>
  <dd>...</dd>

  <dt>Nama : WIDYA INDAH PUSPITA SARI</dt>
  <dd>...</dd>
    
  <dt>Kelas : TI-1A</dt>
  <dd>...</dd>
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
// Tulis Kode program Percobaan 1 Langkah 6 (gabungkan dengan inner loop pada langkah 4)
// Tulis Kode program Percobaan 1 Langkah 4 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int outer = 1; outer <= N; outer++){
    for(int i = 0; i <= N; i++){
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
1. Pada kode program no 5 belum menghasilkan output seperti gambar pada langkah 1. Tinggal menambahkan perintah **System.out.println();** pada bagian akhir perulangan  "inner loop" agar dapat berpindah ke baris dibawahnya (enter) saat output kondisi inner loop sudah terseleaikan.
2. Berikut ini modifikasi kode program yang lebih tepat :


```Java
// Tulis Kode program Percobaan 1 yang benar menurut kalian
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int outer = 1; outer <= N; outer++){
    for(int i = 0; i <= 5; i++){
    System.out.print("*");
    }
    System.out.println();
}

```

    Masukkan nilai N : 5
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
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

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
1. Output yang di hasilkan dari kode program diatas tidak sesuai dengan gambar di tahap 1, karena tidak terdapat perintah untuk enter ke baris selanjutnya, sehingga outputnya menjadi satu baris semua.
2. Berikut ini modifikasi kode program yang lebih tepat :


```Java
// Tulis Kode program Percobaan 2 yang benar menurut kalian
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

int i = 0;
while(i < N){ //tdk menggunakan <= tapi < saja
    int j = 0;
    while(j <= i){  //menambahkan = pada operator assigment
        System.out.print("*");
        j++;
    }
    System.out.println(); //menambahkan println untuk enter ke baris berikutnya
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
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

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
1. Output yang dikeluarkan tidak sesuai. Karena pada kondisi di inner loop yang di outputkan adalah nilai dari variabel " j ", sedangkan yang lebih tepat adalah meng-outputkan nilai dari variabel " i ". karena pada contoh gambar nilai yang di outputkan itu sesuai dengan baris (i)  bukan sesuai nilai kolom (j).
2. Modifikasi program yaitu mengubah perintah **System.out.print(j);** diubah menjadi **System.out.print(i);**. Seperti kode program di bawah ini :


```Java
// Tulis Kode program Percobaan 3 yang benar menurut kalian
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for(int i = 1; i <= N; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(i); //yang harus di outputkan variabel i bukan j. output sesuai baris bukan kolom
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

do {
    int number = random.nextInt(10) + 1;
    boolean success = false; 
    do {
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine(); 
        if(answer == number) {
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        } 
    } while(!success);
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0); 
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 7
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?y
    Tebak angka (1-10) : 10
    Tebak angka (1-10) : 7
    Tebak angka (1-10) : 4
    Tebak angka (1-10) : 5
    Tebak angka (1-10) : 2
    Tebak angka (1-10) : 9
    Tebak angka (1-10) : 6
    Tebak angka (1-10) : 3
    Tebak angka (1-10) : 1
    Tebak angka (1-10) : 8
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?

#### Pertanyaan
1. Jelaskan alur program di atas!
2. Apa yang harus dilakukan untuk tidak melanjutkan (tidak mengulangi) permainan tersebut? 
3. Modifikasi program di atas, sehingga bisa menampilkan informasi mengenai : 
    1. input nilai tebakan yang dimasukan oleh user apakah lebih kecil atau lebih besar dari nilai random!
    2. hentikan _nested loop_ jika pengguna gagal menebak angka sampai 10x tebakan, dan beri pesan "Maaf Anda gagal menebak angka sebanyak 10x"

#### Jawaban
1. Kode program diatas digunakan untuk membuat tebak angka yang dimana angka nya itu random.
   - Menggunakan library Scanner untuk input nilai variabel dan juga menggunakan library random yang dimana berfungsi untuk menghasilkan angka acak yang nantinya pada program tebak angka ini dijadikan sebuah jawaban yang nantinya harus kita tebak.
   - Mendeklarasikan library Scanner dan Random, serta variabel yang dibutuhkan
   - kode perintah :  **int number = random.nextInt(10) + 1;** berfungsi untuk me random angka dari 1-9 dan ditambah 1 menjadi 10, jadi menggenerate angka Random dari 1-10.
   - kode perintah : **boolean success = false;** berfungsi untuk mendeklarasikan variabel success bernilai "false"
   - kode perintah : **success = true;** digunakan untuk mengecek apakah inputan dari user benar atau salah
   - Menggunakan do while nested loop. Yang pertama outer loop digunakan untuk mengulangi tebak angka setelah kita menjawab angka yang benar, untuk inner loop digunakan untuk mengulangi ke tahap dimana user dapat memasukkan angka lagi setelah menjawab salah.
   - Proses berjalannya program :
   1.Pertama user akan menginputkan angka untuk menebak angka
   
   2.Setelah input angka maka akan di proses apakah input yang di masukkan sama dengan jawaban yang sudah di random dengan menggunakan library Random tadi. kode program pengecekan jawaban : **if(answer == number)**
   
   3.jika kondisi nya tidak terpenuhi atau angka yang kita input tadi salah maka otomatis akan kembali mengulang ke kode program memasukkan angka tebakan tadi.
   
   4.Akan tetapi Jika input angka sama dengan jawaban maka akan di outputkan perintah berikut: **System.out.println("Yay... tebakan Anda benar... Selamat!!!");**
   
   4.Setelah itu untuk akhir program terdapat pertanyaan "Apakah Anda ingin mengulang permainan (Y/y)?" 
   
   6.jika menjawab "y" maka program akan mengulang ke pertama lagi yaitu memasukkan angka untuk menebak jawabannya.
   
   
2. Supaya tidak mengulangi permainan maka saat user telah menebak dengan benar dan terdapat pertanyaan "Apakah Anda ingin mengulang permainan (Y/y)?" harus memilih selain dari huruf Y/y.



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
    do {
        System.out.print("Tebak angka (1-10) : ");
        int answer = input.nextInt();
        input.nextLine(); 
        if(answer == number) {
            System.out.println("Yay... tebakan Anda benar... Selamat!!!");
            success = true;
        } else if(answer > number){
            System.out.println("TEBAKAN Anda LEBIH BESAR dari JAWABAN");
        }else if(answer < number){
            System.out.println("TEBAKAN Anda LEBIH KECIL dari JAWABAN");
        }
    } while(!success);
    System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
    menu = input.nextLine().charAt(0); 
} while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 3
    TEBAKAN Anda LEBIH KECIL dari JAWABAN
    Tebak angka (1-10) : 5
    TEBAKAN Anda LEBIH KECIL dari JAWABAN
    Tebak angka (1-10) : 7
    TEBAKAN Anda LEBIH KECIL dari JAWABAN
    Tebak angka (1-10) : 8
    Yay... tebakan Anda benar... Selamat!!!
    Apakah Anda ingin mengulang permainan (Y/y)?n
    


```Java
/* Jawaban untuk Percobaan 4 Pertnyaan 3.B disini */
import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner input = new Scanner(System.in);
char menu = 'y';
int batasMenebak = 1;


        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                    
                if(batasMenebak == 10) {
                    System.out.println("Maaf Anda gagal menebak angka sebanyak 10x");
                    System.out.println("Jawaban yang benar adalah " + number);
                    break;
                }

                if(answer == number) {
                    System.out.println("Yay... tebakan Anda benar... Selamat!!!");
                    success = true;
                }else if(answer > number){
                    System.out.println("Nilai yang benar lebih kecil dari jawaban Anda");
                    batasMenebak++;
                    System.out.println("Sisa kesempatan menjawab " + (10-batasMenebak));
                }else if(answer < number){
                    System.out.println("Nilai yang benar lebih besar dari jawaban Anda");
                    batasMenebak++;
                    System.out.println("Sisa kesempatan menjawab " + (10-batasMenebak));
                }
            } while(!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while(menu == 'y' || menu == 'Y');
```

    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 8
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 7
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 6
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 5
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 4
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 3
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 2
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 1
    Tebak angka (1-10) : 1
    Nilai yang benar lebih besar dari jawaban Anda
    Sisa kesempatan menjawab 0
    Tebak angka (1-10) : 1
    Maaf Anda gagal menebak angka sebanyak 10x
    Jawaban yang benar adalah 10
    Apakah Anda ingin mengulang permainan (Y/y)?n
    

***
## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/Soal-01.png)

Apabila kode program sesuai _flowchart_, maka untuk nilai N = 5 akan menghasilkan output seperti gambar berikut
![Soal 1 A](images/Soal-01.1.png)


```Java
/* Jawaban Soal 1 disini */
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan Nilai N : ");
N = sc.nextInt();

 for(int i = 1; i<= N; i++){
            for(int j = N; j >= 1; j--){
                if(i < j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
          System.out.println();

        }
```

    Masukkan Nilai N : 5
        *
       **
      ***
     ****
    *****
    

Penjelasan :
- Menggunakan library Scanner untuk input nilai N
- Mendeklarasikan Scanner dan variabel 
- Menggunakan for nested loop. 
- Bagian outer loop :  for(int i = 1; i<= N; i++) digunakan untuk mengulang output dari inner loop dan juga untuk menampilkan setiap baris dari segitiga
- Inner loop : for(int j = N; j >= 1; j--) digunakan untuk menampilkan gambar bintang pada setiap kolom dan setelah satu baris terselesaikan semua akan di enter ke baris berikutnya
- kondisi :  if(i < j) digunakan untuk menampilkan spasi. Jika i kurang dari j maka outputnya kosong jika false maka menampilkan bintang.
- Akan terus berulang seperti itu sampai semua kondisi telah terpenuhi (Sesuai input N)

***
### Soal 2
Buatlah program untuk mencetak tampilan persegi angka seperti di bawah ini berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 2](images/Soal-02.png)


```Java
/* Jawaban Soal 2 disini */
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i == 1 || i == N|| j == 1 || j == N)
                    System.out.print(N + " ");
                else {
                    System.out.print("  "); // menggunakan 2 spasi
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
    

Penjelasan :
- Menggunakan library Scanner untuk input nilai N
- Deklarasi Scanner dan variabel
- Terdapat 2 loop
- Outer loop sintaks : **for (int i = 1; i <= N; i++)** digunakan untuk membuat panjang persegi yang berjumlah "N" (sesuai nilai input N)
- Inner loop sintaks : **for (int j = 1; j <= N; j++)** digunakan untuk membuat lebar persegi yang berjumlah "N" (sesuai nilai input N)
- Maksud dari **if(i == 1 || i == N|| j == 1 || j == N)** adalah jika **i** berada di baris ke 5 (N=5), maka akan mencetak * secara mendatar. Jika **j** berada di baris 1 atau baris 5 maka akan mencetak * secara menurun. 
- Pada script "else" :  **System.out.print("  ");** jika if yang diatas tidak terpenuhi kondisinya maka akan di outputkan spasi dua kali, inilah yang membuat perseginya pada bagian tengah itu menjadi kosong/bolong.

***
### Soal 3
Buatlah program untuk mencetak tampilan piramida * seperti gambar di bawah ini, tinggi piramida berdasarkan input dari _keyboard_ N (nilai N minimal 3). Contoh N = 3, dan N = 5
![Soal 3](images/Soal-03.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();

for (int i = 1; i <= N; i++) {
 
        for (int j = 1; j <= N-i; j++) {
 
            System.out.print(" ");
 
        }for (int k = 1; k <= i * 2 -1; k++) {  
 
            System.out.print("*");
        }  
 
         System.out.println("");
 
        }

```

    Masukkan nilai N : 3
      *
     ***
    *****
    


```Java
Scanner sc = new Scanner(System.in);
int N;
System.out.print("Masukkan nilai N : ");
N = sc.nextInt();



for (int i = 1; i <= N; i++) {
 
        for (int j = 1; j <= N-i; j++) {
 
            System.out.print(" ");
 
        }for (int k = 1; k <= i * 2 -1; k++) {  
 
            System.out.print("*");
        }  
 
         System.out.println("");
 
        }

```

    Masukkan nilai N : 5
        *
       ***
      *****
     *******
    *********
    

Penjelasan:
- library Scanner untuk input nilai variabel
- Dekalarasi Scanner dan variabel
- perintah : for (int i = 1; i <= N; i++) berfungsi untuk mencetak baris segitiga 
- perintah inner loop pertama : for (int j = 1; j <= N-i; j++) berfungsi untuk menampilkan spasi sebanyak i sebanyak N-i contoh==> N = 5, maka 5-1 = 4. Jadi baris pertama mencetak 4 kali spasi sehingga terlihat kosong dari kolom 1 sampai kolom ke 4 
- perintah : for (int k = 1; k <= i * 2 -1; k++) berfungsi untuk menampilkan bintang sebanyak i * 2 - 1. Sebagai contoh i= 1, maka 1 * 2 - 1 = 1. Jadi pada baris 1 kolom ke 5 akan di tampilkan gambar bintang. 
- Setelah itu akan looping mulai awal lagi dan berlanjut ke baris berikutnya. karena setelah baris ke 1 selesai dieksekusi akan enter dan berganti baris.
- Terus akan berulang sampai kondisi terpenuhi.
