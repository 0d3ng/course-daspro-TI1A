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


```Java
3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas
```


```Java
// Ketik kode program di bawah sini
int angka, faktorial;
faktorial =1;
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
    faktorial *= i;
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 10
    Nilai faktorial bilangan tersebut adalah : 3628800

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
while(i <= angka){
    faktorial *= i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 10
    Nilai faktorial bilangan tersebut adalah : 3628800

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial;

faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
do{
faktorial *= i;
i++;
}
while(i <= angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan : 10
    Nilai faktorial bilangan tersebut adalah : 3628800

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

Jawaban

kegunaan dari perintah **faktorial *= i** adalah untuk membuat operasi yang dimana nilai dari variabel "faktorial" di kalikan nilai dari variabel "i". jadi baris program tersebut digunakan untuk menghitung faktorial dan sekaligus menampung variabel dari perhitungan tersebut.
sintaks yang sama dengan faktorial *= i; adalah faktorial = faktorial * i;

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();

System.out.print(angka + "Faktorial = ");
for (i=1;i<=angka;i++){
         faktorial=faktorial*i;
         if(i == angka){
             System.out.print(i);
         }else{
             System.out.print(i + "x");
         }
    }
System.out.print(" = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan Bilangan : 5
    5Faktorial = 1x2x3x4x5 = 120

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total = 0; true;){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total > 50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 0
    Masukkan Bilangan : 4
    Masukkan Bilangan : 0
    Masukkan Bilangan : 8
    Masukkan Bilangan : 6
    Masukkan Bilangan : 40
    Jumlah angka-angka yang telah dimasukkan : 58
    

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
    if(total > 50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 9
    Masukkan Bilangan : 10
    Masukkan Bilangan : 6
    Masukkan Bilangan : 18
    Masukkan Bilangan : 20
    Jumlah angka-angka yang telah dimasukkan : 63
    

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
    if(total > 50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 12
    Masukkan Bilangan : 10
    Masukkan Bilangan : 5
    Masukkan Bilangan : 15
    Masukkan Bilangan : 10
    Jumlah angka-angka yang telah dimasukkan : 52
    

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

Jawaban

- Program diatas digunakan untuk menghitung jumlah bilangan yang di input oleh user, dalam model perulangan for, while, dan do-while
- Pertama menggunakan library Scanner sebagai input nilai variabel melalui keyboard
- Kemudian mendeklarasikan Scanner dan variabel yang dibutuhkan
- Dalam variabel yang digunakan di kode pemograman diatas itu menggunakan tipe data integer karena input nilai variabel yang dibutuhkan adalah termasuk bilangan bulat
- Dalam kode pemograman diatas yang menggunakan metode perulangan pasti ada inisialisasi, syarat perulangan (kondisi), dan increment/decrement
- inisialisai  yaitu **total = 0**
- kondisi yaitu boolean **true** dan terdapat kondisi lagi **if(total > 50)**
- increment yaitu **total += angka;**
- Proses berjalannya program seperti berikut :
1. Pertama inisialisasi terlebih dahulu, dimana nilai dari variabel "total" itu adalah 0, maka selanjutnya akan ke perintah selanjutnya yaitu menginput nilai dari variabel "angka" menggunakan input scanner ==> **System.out.print("Masukkan Bilangan : ");**
2. selanjutnya nilai "total" akan dilakukan perhitungan penjumlahan dengan nilai dari variabel "angka". disini misalnya kita input angka pertama "10", maka setelah input "10" tadi akan looping lagi untuk memasukkan "angka", kenapa berulang seperti itu akan dijelaskan di no 3
3. Program akan looping ke input nilai "angka" karena terdapat kondisi di mana jika nilai yang di input kurang dari "50" maka akan looping sampai jumlah angka yang di input kan tadi jika di total lebih dari "50", dan jika sudah lebih darii "50" akan di break(berhenti dan keluar dari program). Kondisi nya ==> **if(total > 50) break;**
4.Setelah itu akan ditampilkan output dari variabel "total". sintaks ==> **System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);**


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


Jawab

Fungsi dari kode **for(total=0; true;){** adalah nilai dari variabel "total" diinialisasi yang berarti nilai "total" dimulai dari 0. "true" disini adalah sebuah boolean yang berfungsi jika nilai total=0 maka nilainya "true" (benar) dan dapat dilanjutkan ke perintah selanjutnya.


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
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINEU===");
for(int i=0; i<5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka >= 50) continue;
    total += angka;
    count++;
}
System.out.println("Jumla angka-angka yang kurang dari 50: " + total);
avg = (double) total / count;
System.out.println("Rata-rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINEU===
    Masukkan Bilangan : 20
    Masukkan Bilangan : 10
    Masukkan Bilangan : 15
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Jumla angka-angka yang kurang dari 50: 65
    Rata-rata angka yang kurang dari 50: 13.0
    

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban disini

Perbedaan percobaan 2 dan percobaan 3:

- dalam percobaan 2 itu menggunakan statement break yang berfungsi untuk keluar dari program looping
- dalam percobaan 3 itu menggunakan statement continue yang berfungsi untuk memberhentikan perulangan di tengah dan mengulangnya dari awal, atau melanjutkan ke perintah dibawahnya (skip) intrusksi dan melanjutkan instruksi selanjutnya.

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

Jawaban

Fungsi dari kode program diatas adalah jika nilai variabel "angka" yang di input oleh user lebih dari sama dengan 50, akan dilanjutkan dengan perintah "continue' yang dimana berfungsi untuk melewati dan melanjutkan ke perintah selanjutnya yang ada di bawahnya. Jadi misalnya input "55" maka akan otomatis ke perintah selanjutnya yang ada dibawahnya yaitu **total+=angka;** dimana berfungsi untuk menjumlahkan nilai variabel "total" dengan nilai variabel "angka" yang sudah di input tadi. Setelah itu perintah **count++;** berfungsi untuk meningkatkan nilai dari variabel "count" menjadi satu tingkat lebih tinggi.

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
Scanner input = new Scanner(System.in);
        int bil, jmlBilGenap, totalGenap = 1;
        double avg;

        System.out.print("Masukkan angka: ");
        bil = input.nextInt();
        jmlBilGenap = bil/2;
        System.out.printf("Jumlah Bilangan Genap dari 1 sampai %d adalah %d",bil, jmlBilGenap);

        System.out.print("\nAngka genap dalam range tersebut adalah");
        for(int i = 1; i <= bil; i++) {
            if(i % 2 != 0) continue;
            System.out.printf(", %d", i);
            totalGenap += i;
        }
        avg= totalGenap/jmlBilGenap;
        System.out.printf("\nHasil Penjumlahan bilangan genap dari 1 sampai %d adalah %d\n", bil, totalGenap -1);
        System.out.printf("Rata-rata bilangan genap dari 1 sampai %d adalah %.1f\n", bil, avg);

```

    Masukkan angka: 10
    Jumlah Bilangan Genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah, 2, 4, 6, 8, 10
    Hasil Penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0
    




    java.io.PrintStream@24d05b18



Penjelasan

- Kode program diatas digunakan untuk mencari bilangan genap dari range 1 sampai 10
- Menggunakan library Scanner
- deklarasi scanner dan variabel yang dibutuhkan sesuai kasus
- Proses berjalannya program:
1. Pertama input nilai dari variabel "bil" untuk nantinya sebagai batas dari nilai yang dicari
2. kemudian melakukan operasi pembagian, yang dimana nilai "bil" dibagi 2. Untuk mengetahui ada berapa bilangan genap yang ada
3. lalu di output kan jumlah bilangan genap nya
4. Kemudian untuk menampilkan angka genap dalam 1-10 itu kita menggunakan perulangan for. yang inisialisai nya 1 = 0 dan exp2 nya i <= bil.
5. kemudian lanjut ke instruksi selanjutnya yaitu terdapat kondisi **if(i % 2 != 0) continue;** jika hasil modulus true maka akan lanjut ke perintah selanjutnya yaitu di output kan, lalu "i" akan dijumlahkan dengan "totalGenap".
6. Kemudian program akan terus looping sampai batas angka 10.
7. setelah selesai looping maka akan menghitung "avg" ==>  avg= totalGenap/jmlBilGenap;
8. serta akan output hasil penjumlahan dari  semua bilangan genap yang terdapat di angka 1-10
9. yang terakhir akan output rata-rata dari bilangan genap 1-10 tadi

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
Scanner input = new Scanner(System.in);
int angka;
System.out.print("Masukkan angka : ");
angka = input.nextInt();

int i;
    for(i=1; i <= 20; i++){
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
    

Penjelasan

- Kode program diatas digunakan untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5
- Menggunakan library Scanner untuk input nilai dari variabel
- mendeklarasikan scanner dan variabel yang dibutuhkan]
- Menggunakan tipe data integer karena input yang akan dimasukkan adalah bilangan bulat
- Menggunakan metode perulangan for(for loop)
- inisialisasi (exp1) ==> **i=1;**
- syarat perulangan (exp20 ==> **i <= 20;**
- decrement (exp3) ==> **i++**
- Proses berjalannya program :
1. memasukkan nilai variabel "angka" terlebih dahulu memalui input sacnner(keyboard)
2. Pada inisialisasi yaitu i = 1 maka berarti program yang akan dijalankan nanti outputnya dimulai dari angka 1
3. Kemudian akan dicek persyaratannya apakah nilai "i" kurang dari sama dengan 20, jika iya maka akan di print(output)
4. Setelah di print maka nilai "i" tadi di decrement ==> i++ atau di tambahkankan satu tingkat dari nilai "i" sebelumnya.
5. Program akan terus looping seperti itu sampai jika ada kondisi dimana **if(i % 5 == 0) continue;** yang berarti jika nilai "i" di modulus 5 hasilnya sama dengan 0, maka program akan di continue atau dilewati dan akan lanjut ke perintah dibawahnya(selanjutnya). Yang berarti jika di continue maka tidak akan di output kan
6. Dan seterusnya seperti itu hingga batas perulangan yaitu sesuai dengan nilai variabel "angka" yang kita input kan di awal

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
Scanner input = new Scanner(System.in);
        int fib, fib1, fib2, n;

        System.out.println("\t\t Fibonacci seies");
        System.out.print("Masukkan banyak bilangan yang ditampilkan : ");
        n = input.nextInt();

        fib1 = 0;
        fib2 = 1;
        fib = 0;

        for(int i = 0; i <= n; i++){
            System.out.printf("sum of: %d + %d = %d \n", fib1, fib2, fib);
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            if(fib > n) break;

        }
```

    		 Fibonacci seies
    Masukkan banyak bilangan yang ditampilkan : 89
    sum of: 0 + 1 = 0 
    sum of: 1 + 1 = 1 
    sum of: 1 + 2 = 2 
    sum of: 2 + 3 = 3 
    sum of: 3 + 5 = 5 
    sum of: 5 + 8 = 8 
    sum of: 8 + 13 = 13 
    sum of: 13 + 21 = 21 
    sum of: 21 + 34 = 34 
    sum of: 34 + 55 = 55 
    sum of: 55 + 89 = 89 
    

Penjelasan 

- Kode program diatas digunakan untuk menampilkan deret bilangan fibonacci
- Menggunakan library Scanner untuk input nilai dari variabel
- Mendeklarasikan scanner dan variabel yang dibutuhkan
- Menggunakan for loop
- Terdapat variabel yang tipe data nya integer
- insialisasi ==> **int i = 0;**
- syarat perulagan ==> **i < n;**
- perubahan nilai ==> **i++**
- Proses berjalannya program :
1. Pertama kita input nilai dari variabel "n" yang dimana itu merupakan sebuah bilangan yang akan menentukan berapa banyak bilangan yang akan di tampilkan pada deret fibonacci nantinya
2. Kemudian inisialisasi yaitu i=0; yang berarti nanti perhitungannya dimulai dari 0
3. cek persyaratan perulangan (exp2) yaitu "i<n" jika sudah benar maka lanjut ke perintah selanjutnya
4. Kemudian di outputkan menjadi seperti ini ==> **System.out.printf("sum of: %d + %d = %d\n", fib1, fib2, fib);**. di awal sudah di deklarasikan nilai dari fib, fib1, fib2. maka akan di outputkan nilai dari ketiga variabel tersebut dengan perhitungan seperti ini :

fib = fib1 + fib2;

fib2 = fib1;

fib1 = fib;

itu merupakakan perhitungan dari bilangan fibonacci dimana fib1 yang bernilai 0 di tambah dengan fib 2 yaitu bernilai 1 maka hasilnya akan di taruh di variabel fib. Kemudian dibawahnya nilai fib2 tadi sama dengan fib1, dan fib1 sama dengan fib.
5. Perulangan tersebut akan terus berulang sampai nilai fib lebih dari n ==> ** if(fib > n) break;** dan akan di break (keluar dari perulangan).

                                               
