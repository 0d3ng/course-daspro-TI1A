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

3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
// Ketik kode program di bawah sini
int angka, faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 8
    Nilai faktorial bilangan tersebut adalah : 40320

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 8
    Nilai faktorial bilangan tersebut adalah : 40320

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 8
    Nilai faktorial bilangan tersebut adalah : 40320

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

// Ketik jawaban disini : gambar diatas sama seperti faktorial = faktorial * i dimana nilai variabel faktorial dikalikan dengan i pertama kemudian melakukan perulangan yang menggunakan hasil faktorial sebelumnya dikalikan dengan i yang sudah di increment, dan akan melakukan perulangan sampai memenuhi syarat yang dimasukkan.


2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
System.out.print(angka + " Faktorial = ");
for (int i = 1; i <= angka; i++) {
    faktorial *= i;
    if (i < angka) {
        System.out.print(i + " x ");
    } else {
        System.out.print(i);
    }
}
System.out.println(" = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan Bilangan : 8
    8 Faktorial = 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 = 40320


#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0; true;){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+ total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 8
    Masukkan Bilangan : 3
    Masukkan Bilangan : 65
    Jumlah angka-angka yang telah dimasukkan : 76


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total = 0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+ total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 34
    Masukkan Bilangan : 23
    Jumlah angka-angka yang telah dimasukkan : 57


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total = 0;
do
{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+ total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 23
    Masukkan Bilangan : 12
    Masukkan Bilangan : 10
    Masukkan Bilangan : 23
    Jumlah angka-angka yang telah dimasukkan : 68


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban disini : kode program diatas  merupakan program perulangan (for,while,dan do-while) yang menggunakan statement break, statement break ini akan menghentikan paksa perulangan ketika jumlah nilai telah melebihi syarat. pada program di atas fungsi dari statement break untuk menghentikan paksa program jika total nilai yang di inputkan  lebih dari 50 


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


// Ketik jawaban disini : for(total=0;true;){ dimana total=0; merupakan ekspresi untuk inisialisasi nilai awal yang dimulai dari angka 0 dan true; adalah syarat perulangan hingga jumlah nilai yang di inputkan bernilai true


#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total, count;
double avg;
count = 0;
    System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0; i<5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka>=50) continue;
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: "+ total);
avg = (double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: "+ avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 23
    Masukkan Bilangan : 12
    Masukkan Bilangan : 10
    Masukkan Bilangan : 23
    Masukkan Bilangan : 52
    Jumlah angka-angka yang kurang dari 50: 68
    Rata-rata angka yang kurang dari 50: 17.0


5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban disini : dalam percobaan 2 menggunakan kode program dengan statement break yang akan menghentikan paksa perulangan ketika jumlah nilai telah melebihi syarat, sedangkan percobaan ke 3 menggunakan kode program perulangan dengan statement continue yang berfungsi melanjutkan perulangan selanjutnya dan mengabaikan kode yang ada dibawahnya


2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

// Ketik jawaban disini : fungsi dari kode program tersebut untuk melanjutkan ke perulangan berikutnya ketika angka yang di inputkan lebih dari 50


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
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil, jmlBilGenap;
int totalGenap = 0;
double avg;
System.out.print("Masukkan angka : ");
bil = input.nextInt();
jmlBilGenap = bil/2;
System.out.println("Banyaknya bilangan genap dari 1 sampai " + bil + "adalah " + jmlBilGenap);
System.out.print("Angka genap dalam range tersebut adalah ");
for(int i=2; i<=bil; i+=2){
    System.out.print(i);
    if(i!=bil){
        System.out.print(", ");
    }
    totalGenap += i;
}
avg = totalGenap/jmlBilGenap;
System.out.println("\nHasil penjumlahan angka genap 1 sampai " + bil + " adalah " + totalGenap);
System.out.println("Rata-rata angka genap dari 1 sampai " + bil + " adalah " + avg);
```

    Masukkan angka : 10
    Banyaknya bilangan genap dari 1 sampai 10adalah 5
    Angka genap dalam range tersebut adalah 2, 4, 6, 8, 10
    Hasil penjumlahan angka genap 1 sampai 10 adalah 30
    Rata-rata angka genap dari 1 sampai 10 adalah 6.0

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
System.out.print("Masukkan angka : ");
angka = input.nextInt();
int i = 1;
while(i<=angka){
    if (i%5!=0){
    System.out.println(i);
    }
    i++;
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

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int total, bil;
int x = 0;
int y = 1;
System.out.print("Masukkan banyak bilangan Fibbonaci : ");
bil = input.nextInt();
int i;
for(i = 0; i<bil; ++i){
    System.out.print("Sum of :" + x + " + " + y + " = ");
    total = x + y;
    x = y;
    y = total;
    System.out.println(total);
}
```

    Masukkan banyak bilangan Fibbonaci : 4
    Sum of :0 + 1 = 1
    Sum of :1 + 1 = 2
    Sum of :1 + 2 = 3
    Sum of :2 + 3 = 5
