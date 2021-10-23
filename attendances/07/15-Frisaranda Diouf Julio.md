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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
```

3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
int angka, faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 4
    Nilai faktorial bilangan tersebut adalah : 24

> Penjelasan : Kode program di atas meminta user untuk menginputkan sebuah bilangan. Selanjutnya, program tersebut menggunakan perintah perulangan for. Pada perulangan for, ekspresi 1 (inisialisasi), ekspresi 2 (syarat pengulangan), dan ekspresi 3 (increment atau decrement) berada di dalam kurung setelah kata 'for' dan di antara ekspresi diberi tanda titik koma (;) sebagai pemisah. Inisialisasi berfungsi sebagai tempat memberikan nilai awal pada variabel tersebut. Syarat pengulangan berfungsi sebagai syarat agar perulangan bisa dilakukan. Increment atau decrement adalah perubahan yang dilakukan tiap loop agar tidak terjadi infinite loop. Pada kode di atas, inisialisasinya adalah int i=1, batasnya adalah i<=angka, dan increment-nya adalah i++. Lalu, perintah faktorial*=i berguna untuk mengalikan variabel faktorial dengan variabel i. Dengan catatan, nilai dari variabel faktorial akan berubah sesuai hasil perkalian variabel faktorial dengan variabel i sebelumnya. Perubahan nilai ini ditampung pada perintah i++. Kemudian, program akan menampilkan nilai faktorial dari bilangan yang diinputkan user.

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 4
    Nilai faktorial bilangan tersebut adalah : 24

> Penjelasan : Kode program di atas meminta user untuk menginputkan sebuah bilangan. Selanjutnya, program tersebut menggunakan perintah perulangan while. Pada perulangan while, ekspresi 1 (inisialisasi) diketikkan sebelum perintah while, ekspresi 2 (syarat pengulangan) berada di dalam kurung setelah kata 'while', dan ekspresi 3 (increment atau decrement) diketikkan setelah statement. Pada kode di atas, inisialisasinya adalah int i=1, batasnya adalah i<=angka, dan increment-nya adalah i++. Lalu, perintah faktorial*=i berguna untuk mengalikan variabel faktorial dengan variabel i. Dengan catatan, nilai dari variabel faktorial akan berubah sesuai hasil perkalian variabel faktorial dengan variabel i sebelumnya. Perubahan nilai ini ditampung pada perintah i++. Kemudian, program akan menampilkan nilai faktorial dari bilangan yang diinputkan user. Secara keseluruhan, kode program di atas mirip dengan kode program sebelumnya, hanya berbeda penggunaan perintah perulangan.

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan : 4
    Nilai faktorial bilangan tersebut adalah : 24

> Penjelasan : Kode program di atas meminta user untuk menginputkan sebuah bilangan. Selanjutnya, program tersebut menggunakan perintah perulangan do-while. Pada perulangan do-while, prinsipnya mirip dengan perintah while. Hanya saja perintah do-while menjalankan statement-nya terlebih dahulu baru dilakukan pengecekan syarat. Jadi, perintah ini akan menjalankan statement-nya minimal satu kali. Pada kode di atas, inisialisasinya adalah int i=1, batasnya adalah i<=angka, dan increment-nya adalah i++. Lalu, perintah faktorial*=i berguna untuk mengalikan variabel faktorial dengan variabel i. Dengan catatan, nilai dari variabel faktorial akan berubah sesuai hasil perkalian variabel faktorial dengan variabel i sebelumnya. Perubahan nilai ini ditampung pada perintah i++. Kemudian, program akan menampilkan nilai faktorial dari bilangan yang diinputkan user.

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

> Kegunaan baris tersebut adalah untuk mengalikan variabel faktorial dengan variabel i. Dengan catatan, nilai dari variabel faktorial akan berubah sesuai hasil perkalian variabel faktorial dengan variabel i sebelumnya. Jadi, nilainya akan ditampung terlebih dahulu di variavel faktorial.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
System.out.print(angka + "Faktorial = " + i);

while(i<=angka){
    faktorial*=i;
    i++;
    if(i<=angka)
        System.out.printf("x%d", i);
}
System.out.print(" = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan Bilangan : 5
    5Faktorial = 1x2x3x4x5 = 120

> Penjelasan : Kode program di atas meminta user untuk menginputkan sebuah bilangan. Perintah perulangan yang digunakan adalah perintah while. Di dalam perintah while, digunakan perintah if, yaitu if(i<=angka) yang berfungsi untuk membatasi nilai i agar tidak melebihi nilai angka yang diinputkan. Agar output yang dihasilkan sesuai gambar, maka digunakan perintah System.out.printf("x%d", i) supaya di antara angka tersebut akan muncul tanda x.

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
for(total=0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 50
    Masukkan Bilangan : 1
    Jumlah angka-angka yang telah dimasukkan : 51


> Penjelasan : Kode program di atas meminta user untuk menginputkan beberapa bilangan secara berulang/loop menggunakan perintah perulangan for. Lalu, bilangan-bilagan yang diinputkan tadi akan dijumlahkan. Apabila penjumlahannya melebihi 50, maka perulangan ini akan berhenti dan hasil penjumlahannya akan ditampilkan di output.

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total=0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 50
    Masukkan Bilangan : 1
    Jumlah angka-angka yang telah dimasukkan : 51


> Penjelasan : Kode program di atas meminta user untuk menginputkan beberapa bilangan secara berulang/loop menggunakan perintah perulangan while. Lalu, bilangan-bilagan yang diinputkan tadi akan dijumlahkan. Apabila penjumlahannya melebihi 50, maka perulangan ini akan berhenti dan hasil penjumlahannya akan ditampilkan di output.

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
int angka, total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total=0;
do
{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 50
    Masukkan Bilangan : 1
    Jumlah angka-angka yang telah dimasukkan : 51


> Penjelasan : Kode program di atas meminta user untuk menginputkan beberapa bilangan secara berulang/loop menggunakan perintah perulangan do-while. Lalu, bilangan-bilagan yang diinputkan tadi akan dijumlahkan. Apabila penjumlahannya melebihi 50, maka perulangan ini akan berhenti dan hasil penjumlahannya akan ditampilkan di output.

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

> Kode program di atas meminta user untuk menginputkan beberapa bilangan secara berulang/loop menggunakan perintah perulangan for, while, dan do-while. Lalu, bilangan-bilagan yang diinputkan tadi akan dijumlahkan. Apabila penjumlahannya melebihi 50, maka perulangan ini akan berhenti dan hasil penjumlahannya akan ditampilkan di output.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


> Fungsi kode tersebut adalah menginputkan variabel total bernilai 0. Kenapa 0? Agar ketika nanti user menginputkan bilangannya, penjumlahannya tidak terpengaruh oleh nilai awal variabel total. Lalu, syaratnya (ekspresi 2) adalah true. Artinya, jika total bernilai lebih dari 50 (true), loop/perulangannya akan berhenti. Apabila masih bernilai false atau total kurang dari 50, maka loop/perulangannya akan berlanjut.

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
for(int i=0; i<5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka>=50) continue;
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: " + total);
avg = (double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 40
    Masukkan Bilangan : 60
    Masukkan Bilangan : 30
    Masukkan Bilangan : 20
    Masukkan Bilangan : 10
    Jumlah angka-angka yang kurang dari 50: 100
    Rata-rata angka yang kurang dari 50: 25.0


2. Jalankan program. Amati apa yang terjadi!

> Kode program di atas meminta user menginputkan 5 bilangan (i=0, i<5) secara berulang/loop menggunakan perintah perulangan for. Apabila bilangan yang diinputkan lebih dari sama dengan 50, maka dilewati atau di skip atau dihiraukan. Lalu, bilangan-bilangan tersebut dijumlahkan dan bilangan yang lebih dari sama dengan 50 tidak akan diikutkan dalam perhitungan. Kemudian, hasil penjumlahan tersebut akan ditampilkan di output. Selanjutnya, variabel avg akan menghitung rata-rata angka yang kurang dari 50 saja dari hasil penjumlahan dibagi banyaknya bilangan yang diinputkan. Sekali lagi, bilangan yang lebih dari sama dengan 50 akan dilewati atau tidak diikutkan dalam perhitungan.

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

> Pada percobaan 2 menggunakan statement break. Statement break akan menghentikan paksa loop/perulangan dan kode di luar loop akan tetap dijalankan. Sedangkan pada percobaan 3 menggunakan statement continue. Statement continue akan melewati 1 perulangan saja, lalu perulangan iterasi berikutnya akan tetap dilanjutkan.

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

> Fungsi perintah kode program di atas adalah melewati inputan variabel angka yang bernilai lebih dari sama dengan 50. Lalu, jika bilangan yang diinputkan kurang dari 50, maka akan dijumlahkan. Kemudian, count++ berfungsi untuk menyimpan inputan banyaknya angka yang memenuhi syarat (kurang dari 50).

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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil, jmlBilGenap, totalGenap = 0;
double avg;

System.out.print("Masukkan angka : ");
bil = input.nextInt();

jmlBilGenap = bil/2;
System.out.print("Banyaknya bilangan genap dari 1 sampai " + bil + " adalah " + jmlBilGenap);

System.out.println("");
System.out.print("Angka genap dalam range tersebut adalah ");
int i;
for(i=1; i<=bil; i++){
    if(i%2 != 0){
        continue;
    }
    
    System.out.print(i);
    if(!(i==bil || i+1==bil)){
        System.out.print(", ");
    }
    totalGenap += i;
}

avg = totalGenap/jmlBilGenap;
System.out.printf("\nHasil penjumlahan bilangan genap dari 1 sampai %d adalah %d\n", bil, totalGenap);

System.out.printf("Rata-rata bilangan genap dari 1 sampai %d adalah %.1f\n", bil, avg);
```

    Masukkan angka : 24
    Banyaknya bilangan genap dari 1 sampai 24 adalah 12
    Angka genap dalam range tersebut adalah 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24
    Hasil penjumlahan bilangan genap dari 1 sampai 24 adalah 156
    Rata-rata bilangan genap dari 1 sampai 24 adalah 13.0





    java.io.PrintStream@57c5616d

> Penjelasan : Kode program di atas meminta user menginputkan sebuah bilangan. Karena diminta banyaknya bilangan genap dalam suatu range, maka diketikkan syarat bilangan dikatakan bilangan genap terlebih dahulu, yaitu habis dibagi 2. Lalu, program akan menampilkan banyaknya bilangan genap dalam range tersebut. Kemudian, akan ditampilkan angka genap dalam range tersebut. Jika bilangan dalam range tersebut modulus 2 hasilnya tidak sama dengan 0, maka dilewati atau di skip. Apabila modulus 2 sama dengan 0 maka diprint dan ditambahi tanda koma (,). Angka-angka yang diprint akan dijumlahkan dan disimpan dalam variabel totalGenap. Terakhir, menghitung rata-rata bilangan genap dengan cara membagi jumlah total angka genap (totalGenap) dengan banyaknya bilangan genap (jmlBilGenap).


2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int a, bil;

System.out.print("Masukkan angka : ");
bil = input.nextInt();
for (a=1; a<=bil; a++){
    if (a%5==0) continue;
    System.out.println(a);
}
```

    Masukkan angka : 24
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
    21
    22
    23
    24


> Penjelasan : Kode program di atas meminta user menginputkan sebuah bilangan. Inisialisasi a=1 berfungsi untuk memberikan nilai awal dari variabel a. Kemudian, syarat a<=bil berfungsi untuk membatasi nilai a agar tidak melebihi bilangan yang diinputkan user. Increment a++ berfungsi agar nilai variabel a bertambah 1 di setiap loop. Kemudian, terdapat perintah if yang menyebutkan jika nilai a modulus 5 sama dengan 0, maka dilewati atau di skip. Hal ini karena pada output diminta untuk melewati angka kelipatan 5. Terakhir, perintah print nilai a itu sendiri.


3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int baris, angka1 = 0, angka2 = 1, angka3;

System.out.print("Masukkan baris Fibonacci : ");
baris = input.nextInt();
int i = 1;
while(i<=baris){
    angka3 = angka1 + angka2;
    System.out.printf("Sum of: %d + %d = %d\n", angka1, angka2, angka3);
    angka1 = angka2;
    angka2 = angka3;
    i++;
}
```

    Masukkan baris Fibonacci : 10
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


> Penjelasan : Kode program di atas meminta user menginputkan baris ke berapa dalam deret bilangan Fibonacci. Inisialisasinya adalah int i = 1, karena tidak ada baris ke-0 dalam sebuah deret. Syaratnya adalah i<=baris, agar nilai dari variabel i hanya sampai baris yang diinputkan user. Karena dalam deret Fibonacci bilangan di sebelah kanan adalah jumlah dari 2 bilangan sebelumnya, maka programnya angka3 = angka1 + angka2. Kemudian, program akan mencetak perhitungan tersebut. Selanjutnya, nilai dari variabel angka2 akan menjadi nilai dari variabel angka1 pada loop berikutnya. Begitu pun juga dengan angka 3, nilai dari variabel angka3 akan menjadi nilai dari variabel angka2 pada loop berikutnya. Nilai variabel angka3 pada loop berikutnya adalah penjumlahan dari angka1 dan angka2.