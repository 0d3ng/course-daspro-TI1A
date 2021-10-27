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

perintah import digunakan agar kita dapat menggunakan library Scanner
deklarasi Scanner agar scanner dapat dikenali pada program


```Java
// Ketik kode program di bawah sini
int angka, faktorial = 1;
```

perintah import digunakan agar kita dapat menggunakan library Scanner
deklarasi Scanner agar scanner dapat dikenali pada program

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
for (int i = 1; i <= angka; i++)
    faktorial *= i;
System.out.print("Nilai faktorial bilangan tersebut adalah " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 3
    Nilai faktorial bilangan tersebut adalah 6

perulangan for.
ekspresi pertama menunjukkan inisialisasi int bernama i dengan nilai 1.
ekspresi kedua menunjukkan boolean yang akan mengecek kondisi sebelum mengeksekusi program perulangan.
ekspresi ketiga menunjukkan perubahan nilai, yaitu increment pada variabel i yang akan dilakukan tepat setelah program selesai dijalankan.
perintah dalam program perulangan akan dijalankan jika boolean pada ekspresi kedua menghasilkan true.
perintah faktorial *= i berarti nilai dari faktorial = faktorial * i.
setelah itu, hasil perkalian akan dicetak dengan perintah sout(System.out).


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
while (i <= angka) {
    faktorial *= i;
    i++;
}
System.out.println("Nilai faktorial bilangan tersebut adalah " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 3
    Nilai faktorial bilangan tersebut adalah 6


inisialisasi faktorial perlu dilakukan untuk mengatur ulang nilai dari variabel faktorial. hal ini perlu dilakukan karena pada sel sebelumnya, kita telah menggunakan variabel faktorial. maka dari itu, inisialisasi ulang ini sangat perlu dilakukan untuk menghindari penumpukan nilai. inisialisasi i juga dilakukan kembali untuk mengatur ulang nilai dari variabel i. perulangan while. diikuti dengan ekspresi boolean. jika ekspresi ini bernilai true, maka program perulangan akan dijalankan hingga ekspresi ini bernilai false. program yang akan dijalankan adalah perintah faktorial = faktorial * i; dengan perintah increment pada variabel i, i++;. setelah itu, hasil dari perintah akan dicetak menggunakan perintah sout.

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
do {
    faktorial *= i;
} while (++i <= angka);
System.out.println("Nilai faktorial bilangan tersebut adalah " + faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan : 3
    Nilai faktorial bilangan tersebut adalah 6


inisialisasi faktorial perlu dilakukan untuk mengatur ulang nilai dari variabel faktorial. hal ini perlu dilakukan karena pada sel sebelumnya, kita telah menggunakan variabel faktorial. maka dari itu, inisialisasi ulang ini sangat perlu dilakukan untuk menghindari penumpukan nilai. inisialisasi i juga dilakukan kembali untuk mengatur ulang nilai dari variabel i. perulangan do-while. berbeda dengan perulangan for dan while. perulangan do-while akan menjalankan program perulangan terlebih dahulu sebelum melakukan pengecekan pada ekspresi boolean pada yang ada disamping perintah {while(boolean)}. jadi, meskipun boolean yang kita masukkan bernilai false dari awal, program perulangan ini kaan menjalankan program setidaknya sekali sebelum program berhenti. 

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

// Ketik jawaban disini
untuk melakukan operasi faktorial. dengan menggunakan operasi ini, kita dapat menghitung nilai faktorial dari suatu bilangan yang telah kita masukkan.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner sama = new Scanner(System.in);

int faktorial = 1, angka;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka = sama.nextInt();
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
    Masukkan Bilangan : 4
    4 Faktorial = 1 x 2 x 3 x 4 = 24


pertama, saya cetak 5 faktorial dengan perintah pada baris kedelapan. kedua, saya menggunakan perulangan for untuk menyelesaikan operasi nilai faktorial. ketiga, saya menyisipkan perintah pemilihan if else ke dalam perintah perulangan dimana jika nilai i kurang dari nilai angka maka akan tercetak "nilai i x". selain itu, akan hanya tercetak nilai dari i. setelah itu, saya mencetak nilai total dari nilai faktorial dengan menggunakan sout pada baris terakhir.

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
for (total = 0; true;) {
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if (total > 50)
        break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 31
    Masukkan Bilangan : 12
    Masukkan Bilangan : 12
    Jumlah angka-angka yang telah dimasukkan : 55


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total = 0;
while (true) {
    System.out.print("Masukkan Bilangan  : ");
    angka = input.nextInt();
    total += angka;
    if (total > 50)
        break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan  : 31
    Masukkan Bilangan  : 12
    Masukkan Bilangan  : 12
    Jumlah angka-angka yang telah dimasukkan : 55


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total = 0;
do {
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if (total > 50)
        break;
} while (true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 14
    Masukkan Bilangan : 12
    Masukkan Bilangan : 21
    Masukkan Bilangan : 13
    Jumlah angka-angka yang telah dimasukkan : 60


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban disini
Membuat program untuk menjumlahkan hasil inputan dari user. jika jumlah seluruh inputan lebih dari 50, maka program perulangan akan berhenti.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


// Ketik jawaban disini
pada ekspresi pertama, kita melakukan inisialisasi variabel total dengan nilai 0. pada ekspresi kedua, kita menetapkan true sebagai nilai boolean pada perintah perulangan. hal ini menyebabkan perintah perulangan akan dijalankan terus menerus hingga menghabiskan kapasitas memori atau bertemu dengan keyword break atau continue.

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
total = 0;
count = 0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for (int i = 0; i < 5; i++) {
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if (angka >= 50)
        continue;
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50 : " + total);
avg = (double) total / count;
System.out.println("Rata-rata angka yang kurang dari 50 : " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 15
    Masukkan Bilangan : 16
    Masukkan Bilangan : 63
    Masukkan Bilangan : 31
    Masukkan Bilangan : 78
    Jumlah angka-angka yang kurang dari 50 : 62
    Rata-rata angka yang kurang dari 50 : 20.666666666666668



```Java
5. Jalankan program. Amati apa yang terjadi!
```

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban disini
1. nilai boolean. pada percobaan 2, nilai boolean adalah true dan itu akan menyebabkan perintah perulangan akan dijalankan terus menerus. sementara pada percobaan 3, nilai boolean sudah ditentukan, yaitu maksimal akan dijalankan 5 kali.
2. keyword. pada percobaan 2, nilai boolean pada keyword break adalah jika total melebihi angka 50, maka program perulangan akan diberhentikan. sedangkan pada percobaan 3, nilai boolean pada keyword continue adalah jika nilai yang kita masukkan melebihi 50, maka akan diabaikan dan program akan dilanjutkan ke perulangan selanjutnya.
3. adanya variabel avg. pada percobaan 2, tidak ada perhitungan rata-rata. sedangkanpada percobaan 3, terdapat perhitungan rata-rata pada variabel double bernama avg. 

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

// Ketik jawaban disini
1. jika nilai yang kita inputkan lebih dari atau sama dengan angka 50, maka perintah continue akan dijalankan dan program akan mengabaikan program di bawah perintah continue. sedangkan jika nilai yang kita masukkan kurang dari nilai 50, maka perintah continue akan diabaikan dan perintah di bawah continue akan dijalankan.

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
Scanner let = new Scanner(System.in);

int bil, jmlBilGenap, totalGenap = 0;
double avg;

System.out.print("Masukkan Angka : ");
bil = let.nextInt();

if (bil > 0) {
    jmlBilGenap = bil / 2;
    System.out.printf("\nBanyaknnya bilangan genap dari 1 sampai %d adalah %d", bil, jmlBilGenap);
    System.out.print("\nAngka genap dalam range tersebut adalah, ");

    for (int i = 1; i <= bil; i++) {
        if (i % 2 != 0)
            continue;
        else {
            if (i < bil)
                System.out.print(i + ", ");
            else {
                System.out.print(i);
            }
            totalGenap += i;
        }
    }
    avg = totalGenap / jmlBilGenap;
    System.out.printf("\nHasil penjumlahan bilangan genap dari 1 sampai %d adalah %d", bil, totalGenap);
    System.out.printf("\nRata-rata bilangan genap dari 1 sampai %d adalah %.1f", bil, avg);
} else {
    System.out.println("Angka yang Anda masukkan bukanlah bilangan bulat!");
}
```

    Masukkan Angka : 10
    
    Banyaknnya bilangan genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah, 2, 4, 6, 8, 10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0Masukkan Angka : 10
    
    Banyaknnya bilangan genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah, 2, 4, 6, 8, 10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0

pertama saya minta input dari user dengan perintah sout. kemudian, jika inputan kurang dari atau sama dengan 0, maka akan tercetak perintah pada else. jika inputan lebih dari 0, maka akan jalan perintah pada if. perintah pada if. membagi bilangan input dengan 2 akan memberikan kita informasi tentang berapa jumlah bilangan genap dalam range 1 sampai bilangan yang dimasukkan. perintah perulangan. jika i dimodulus 2 tidak sama dengan 0, maka bilangan tersebut adalah bilangan ganjil dan keyword continue akan dijalankan. sebaliknya, perintah if level 2 akan mencetak i yang termasuk bilangan genap. menghitung rata-rata antara total bilangan genap yang ada dengan banyaknya bilangan genap.

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
Scanner ulang = new Scanner(System.in);

int angka;
System.out.print("Masukkan angka : ");
angka = ulang.nextInt();

int i = 0;
while (i <= angka) {
    i++;
    if (i % 5 == 0)
        continue;
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


meminta input dari user kemudian menyimpannya pada variabel angka. menginisialisasi variabel i dengan nilai 0. kemudian menetapkan boolean untuk perintah while. saya menetapkan nilai 0 karena saya aakan melakukan increment pada awal perintah perulangan, jadi agar nilainya 1, saya inisialisasi menjadi 0 :). jika i dimodulus dengan 5 menghasilkan 0, maka perintah continue akan dijalankan. tidak lupa untuk mencetak nilai i JIKA tidak memenuhi if.

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner kan = new Scanner(System.in);

System.out.print("Masukkan iterasi : ");
int iter = kan.nextInt();
int a = 0, i = 1, u, o = 1;
while (o <= iter) {
    System.out.printf("Sum of : %d + %d = ", a, i);
    u = a + i;
    System.out.println(u);
    a = i;
    i = u;
    o++;
}
```

    Masukkan iterasi : 12
    Sum of : 0 + 1 = 1
    Sum of : 1 + 1 = 2
    Sum of : 1 + 2 = 3
    Sum of : 2 + 3 = 5
    Sum of : 3 + 5 = 8
    Sum of : 5 + 8 = 13
    Sum of : 8 + 13 = 21
    Sum of : 13 + 21 = 34
    Sum of : 21 + 34 = 55
    Sum of : 34 + 55 = 89
    Sum of : 55 + 89 = 144
    Sum of : 89 + 144 = 233


minta input dengan perintah sout. menginisialisasi beberapa variabel int yang nantinya akan digunakan. variabel a adalah nilai fibonacci pertama = 0. variabel i adalah angka fibonacci yang kedua = 1. variabel u adalah nilai ketiga fibonacci = a + i. setelah di cetak, kita menggeser kedudukan dari tiap variabel. variabel a ke nilai kedua fibonacci = 1, var i ke nilai ketiga fibonacci = 1, dan nilai u akan menjadi nilai keempat fibonacci = a + i. o adalah variabel counter yang berfungsi sebagai pembatas jumlah perulangan.
