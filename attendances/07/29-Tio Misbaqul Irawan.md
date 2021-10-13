## JOBSHEET 7

## PERULANGAN 1

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks perulangan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan for, while dan do-while

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart perulangan for dibawah ini!

    <p align="left">
    <img width="197" height="259" src="images/flowchartFaktorial.png">
    </p>
    

> Flowchart diatas digunakan untuk menghitung nilai faktorial, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel angka untuk menampung data yang diinput melalui keyboard




```Java
// Ketik kode program di bawah sini
import java.util.Scanner;

Scanner input = new Scanner(System.in);
```

Kode di atas membuat scanner

3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
// Ketik kode program di bawah sini
int angka;
int faktorial = 1;
```

koda di atas membuat dan deklarasi variable angka dan faktorial

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

for(int i = 1; i <= angka; i++) {
        faktorial *= i;
}

System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

Kode di atas menghitung faktorial dengan cara melakukan perulangan dan mengalikan variable i dengan variable faktorial, sehingga mendapatkan hasil perlakian dari i sampai angka yang dimasukkan

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

int i = 1;
while(i <= angka) {
    faktorial *= i;
    i++;
}

System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

Kode di atas menghitung faktorial dengan cara melakukan perulangan dan mengalikan variable i dengan variable faktorial, sehingga mendapatkan hasil perlakian dari i sampai angka yang dimasukkan

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

int i = 1;
do {
    faktorial *= i;
    i++;
} while(i <= angka);

System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

Kode di atas menghitung faktorial dengan cara melakukan perulangan dan mengalikan variable i dengan variable faktorial, sehingga mendapatkan hasil perlakian dari i sampai angka yang dimasukkan

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

faktorial *= i; itu sama dengan
faktorial = faktorial * i;

kesimpulanya adalah untuk melakukan operasi dan langsung menyimpanya di variable tersebut

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
faktorial = 1;

System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

System.out.print(angka + "Faktorial = ");
for(int i = 1; i <= angka; i++) {
    System.out.print(i);
    
    if(i != angka){
        System.out.print("x");
    }
    
    faktorial *= i;
}

System.out.print("= " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 19
    19Faktorial = 1x2x3x4x5x6x7x8x9x10x11x12x13x14x15x16x17x18x19= 109641728

Kode di atas menghitung faktorial dengan cara melakukan perulangan dan mengalikan variable i dengan variable faktorial, sehingga mendapatkan hasil perlakian dari i sampai angka yang dimasukkan

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");

for(total = 0; true;) {
    System.out.print("Masukkan Bilangan : ");
    
    angka = input.nextInt();
    total += angka;
    
    if(total > 50) break;
}

System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 12
    Masukkan Bilangan : 31
    Masukkan Bilangan : 49
    Jumlah angka-angka yang telah dimasukkan : 92
    

Kode di atas menghitung faktorial dengan cara melakukan perulangan dan mengalikan variable i dengan variable faktorial, sehingga mendapatkan hasil perlakian dari i sampai angka yang dimasukkan

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
int angka, total;

System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");

total = 0;

while(true) {
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total > 50) break;
}

System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Jumlah angka-angka yang telah dimasukkan : 60
    

Kode program diatas meminta user untuk input bilangan bulat secara terus menerus sampai total keseluruhan bilangan yang dimasukan berjumlah lebih dari 50

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
int angka, total;

System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");

total = 0;

do {
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total > 50) break;
} while(true);

System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Jumlah angka-angka yang telah dimasukkan : 60
    

Kode program diatas meminta user untuk input bilangan bulat secara terus menerus sampai total keseluruhan bilangan yang dimasukan berjumlah lebih dari 50

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

Kode program diatas meminta user untuk input bilangan bulat secara terus menerus sampai total keseluruhan bilangan yang dimasukan berjumlah lebih dari 50

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


fungsi dari kode diatas yaitu membuat sebuah perulangan for dengan inisialisasi total = 0 dan kondisi pengecekan yang selalu true, sehingga untuk keluar dari looping ini harus dilakukan dengan perintah break


#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
Scanner input = new Scanner(System.in);
int angka, total, count;
double avg;
count = 0;

System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");

for(int i = 0;i < 5;i++) {
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    
    if(angka >= 50) continue;
    
    total += angka;
    count++;
}

System.out.println("Jumlah angka-angka yang kurang dari 50: " + total);

avg = (double) total / count;

System.out.println("Rata-rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 1
    Masukkan Bilangan : 1
    Masukkan Bilangan : 2
    Masukkan Bilangan : 3
    Masukkan Bilangan : 4
    Jumlah angka-angka yang kurang dari 50: 11
    Rata-rata angka yang kurang dari 50: 2.2
    

Kode di atas berfungsi untuk menampilkan jumlah total angka yang dimasukan kurang dari 50 dan juga menampilkan rata-ratanya

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

Percobaan ke 2 membahas tentang **break**, percobaan ke 3 membahas tentang **continue**

**break** berfungsi untuk keluar dari perulangan<br />**continue** berfungsi untuk melanjutkan ke perulangan selanjutnya dan mengabaikan kode di bawahnya

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

Jika angka yang dimasuukan lebih atau sama dengan 50, maka lanjutkan ke perulangan berikutnya dan abaikan kode di bawahanya


### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program yang meminta masukan user sebuah bilangan bulat N (N > 0). Program kemudian menampilkan penjumlahan N bilangan genap positif pertama (bilangan genap ≥ 0).
Contoh: 
    •	Jika user memasukkan N = 10, program akan menghitung banyaknya jumlah bilangan positive di dalam range bilangan 1-10   kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara 1-10 yaitu : 
        0 + 2 + 4 + 6 + 10 = 30. 
        Setelah itu program akan menampilkan rata-rata dari bilangan positive yang telah dijumlahkan tadi.
    •	Contoh output program dan flowchart
<br/><img width="303" height="529" src="images/hasilTugasFc.jpg" align="left"><br/>
  

<br/><img width="303" height="529" src="images/fcTugasJS7.png" align="left">



```Java
Scanner input = new Scanner(System.in);
int bil, jmlBilGenap;
int totalGenap = 0;
double avg;

System.out.print("Masukkan angka : ");
bil = input.nextInt();

jmlBilGenap = bil / 2;

System.out.println("Banyaknya bilangan genap dari 1 sampai " + bil + " adalah " + jmlBilGenap);

System.out.print("Angka genap dalam range tersebut adalah ");
for(int i = 1; i <= bil; i++) {
    if(i % 2 != 0) {
        continue;
    }
    
    System.out.print(i);
    
    if(!(i == bil || i + 1 == bil)) {
        System.out.print(", ");
    }
    
    totalGenap += i;
}

avg = totalGenap / jmlBilGenap;

System.out.printf("\nHasil penjumlahan bilangan genap dari 1 sampai %d adalah %d\n", bil, totalGenap);
System.out.printf("Rata-rata bilangan genap dari 1 sampai %d adalah %.1f\n", bil, avg);
```

    Masukkan angka : 10
    Banyaknya bilangan genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah 2, 4, 6, 8, 10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0
    




    java.io.PrintStream@49a3a716



Kode di atas berfungsi untuk

1. menampilkan jumlah bilangan genap di antara 1 sampai dengan angka yang diinputkan
2. mencari bilangan genap dari range tersebut
3. menjumlahkan seluruh bilangan genap dari range tersebut
4. mencari rata rata dari seluruh bilangan genap tersebut

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
Scanner input = new Scanner(System.in);

System.out.print("Masukkan angka : ");
int angka = input.nextInt();

for(int i = 1; i <= angka; i++) {
    if(i % 5 == 0) continue;
    
    System.out.println(i);
}
```

    Masukkan angka : 19
    1
    2
    3
    4
    6
    7
    8
    9
    11
    12
    13
    14
    16
    17
    18
    19
    

Kode di atas berfungsi untuk menampilkan angka darri 1 sampai angka yang telah dimasukan dan melewati angka kelipatan 5 (n % 5 == 0)

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
Scanner input = new Scanner(System.in);

int n1 = 0, n2 = 1, sum = 0;

System.out.print("Masukkan angka : ");
int angka = input.nextInt();

for(int i = 1; i <= angka; i++) {
    sum = n1 + n2;
    
    System.out.printf("Sum of: %d + %d = %d\n", n1, n2, sum);
    
    n1 = n2;
    n2 = sum;
}
```

    Masukkan angka : 10
    Sum of: 0 + 1 = 1
    Sum of: 1 + 1 = 2
    Sum of: 1 + 2 = 3
    Sum of: 2 + 3 = 5
    Sum of: 3 + 5 = 8
    Sum of: 5 + 8 = 13
    Sum of: 8 + 13 = 21
    Sum of: 13 + 21 = 34
    Sum of: 21 + 34 = 55
    Sum of: 34 + 55 = 89
    

Kode di atas berfungsi untuk menampilkan deret fibonacci sejumlah angka yang dimasukan.
