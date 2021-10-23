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
for(int i = 1; i<=angka; i++){
    faktorial*=i;
    System.out.printf("i = %d, faktorial = %d\n", i, faktorial);
}
System.out.printf("Nilai faktorial dari %d! adalah %d", angka, faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    i = 1, faktorial = 1
    i = 2, faktorial = 2
    i = 3, faktorial = 6
    i = 4, faktorial = 24
    i = 5, faktorial = 120
    Nilai faktorial dari 5! adalah 120




    java.io.PrintStream@7f48f7c3



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
int i = 1;
while(i<=angka){
    faktorial*=i;
    System.out.printf("i = %d, faktorial = %d\n", i, faktorial);
    i++;
}
System.out.printf("Nilai faktorial dari %d! adalah %d", angka, faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    i = 1, faktorial = 1
    i = 2, faktorial = 2
    i = 3, faktorial = 6
    i = 4, faktorial = 24
    i = 5, faktorial = 120
    Nilai faktorial dari 5! adalah 120




    java.io.PrintStream@7f48f7c3



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
int i = 1;
do{
    faktorial*=i;
    System.out.printf("i = %d, faktorial = %d\n", i, faktorial);
    i++;
}
while(i<=angka);
System.out.printf("Nilai faktorial dari %d! adalah %d", angka, faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    i = 1, faktorial = 1
    i = 2, faktorial = 2
    i = 3, faktorial = 6
    i = 4, faktorial = 24
    i = 5, faktorial = 120
    Nilai faktorial dari 5! adalah 120




    java.io.PrintStream@7f48f7c3



##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
```
>Fungsinya sama dengan `faktorial = faktorial * i`, yaitu untuk menyimpan hasil kali variabel `faktorial` dengan variabel `i` yang sudah diinisialisasi dalam `for` dan variabel `i` terus bertambah setiap perulangan. Perkalian dilakukan setiap perulangan dan kemudian menyimpan hasilnya dalam variabel `faktorial` tersebut hingga kondisi dalam `for` terpenuhi.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
System.out.printf("%dFaktorial = ", angka);
for(int i = 1; i<=angka; i++){
    faktorial*=i;
    
    if (i == 1){
        System.out.printf("%d", i);
    }else{
        System.out.printf("x%d", i);
    }
}
System.out.printf(" = %d", faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    5Faktorial = 1x2x3x4x5 = 120




    java.io.PrintStream@7f48f7c3

>Untuk menghasilkan output seperti itu, kita bisa melakukan print di dalam perulangan tanpa menggunakan new line. Ketika mengoutput dalam perulangan, kita melakukan pemilihan, jika sama dengan 1 maka menampilkan angka 1 saja, jika tidak sama maka menambahkan simbol kali didepan angka.



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
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 42
    Masukkan Bilangan : 12
    Jumlah angka-angka yang telah dimasukkan : 54


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
total = 0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 55
    Jumlah angka-angka yang telah dimasukkan : 55


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
total = 0;
do{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 25
    Masukkan Bilangan : 25
    Masukkan Bilangan : 5
    Jumlah angka-angka yang telah dimasukkan : 55


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!


```Java
// Ketik jawaban disini
Melakukan perulangan terus menerus hingga ada statement break. Hal itu dikarenakan kondisinya true. Ketika totalnya lebih dari 50, maka akan menjalankan statement break untuk menghentikan perulangan tersebut.
```

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>



```Java
// Ketik jawaban disini
Untuk melakukan perulangan dengan menginisialisasi variabel total dengan nilai 0, dan kondisi true yang berarti akan menjalankan perulangan terus menerus hingga ada statement break.
```

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
for(int i = 0; i<5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka >= 50) continue;
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: " + total);
avg = (double) total/count;
System.out.println("Rata-rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 2
    Masukkan Bilangan : 1
    Masukkan Bilangan : 7
    Masukkan Bilangan : 9
    Masukkan Bilangan : 52
    Jumlah angka-angka yang kurang dari 50: 19
    Rata-rata angka yang kurang dari 50: 4.75


5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3


```Java
// Ketik jawaban disini
Pada percobaan ke 2 kita menggunakan break untuk keluar dari perulangan yang terus menerus, dan statement break tersebut dijalankan ketika nilai dari variabel total lebih dari 50. Sedangkan untuk percobaan 3, melakukan perulangan yang batasnya sudah ditentukan yaitu 5 dan menggunakan statement continue untuk menghitung jumlah angka yang kurang dari 50 serta mengabaikan bilangan yang lebih dari 50.
```

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
Sintaks tersebut mengandung statement continue yang akan dijalankan bila nilai variabel angka yang diinput oleh user lebih dari 50. Jika statement tersebut dijalankan maka akan mengabaikan baris kode dibawahnya dan melanjutkan perulangan.
```

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
int bil, jmlBilGenap, totalGenap = 0;
double avg;

System.out.print("Masukkan angka : ");
bil = input.nextInt();

jmlBilGenap = bil/2;

System.out.printf("Banyaknya bilangan genap dari 1 sampai %d adalah %d \n", bil, jmlBilGenap);
System.out.print("Angka genap dalam range tersebut adalah");
    
for(int i = 1; i<=bil; i++){
    if(i%2!=0) continue;
    System.out.printf(", %d", i);
    totalGenap+=i;
}

avg = (double) totalGenap/jmlBilGenap;

System.out.printf("\nHasil penjumlahan Bilangan Genap dari 1 sampai %d adalah %d", bil, totalGenap);
System.out.printf("\nRata-rata Bilangan Genap dari 1 sampai %d adalah %f", bil, avg);
```

    Masukkan angka : 10
    Banyaknya bilangan genap dari 1 sampai 10 adalah 5 
    Angka genap dalam range tersebut adalah, 2, 4, 6, 8, 10
    Hasil penjumlahan Bilangan Genap dari 1 sampai 10 adalah 30
    Rata-rata Bilangan Genap dari 1 sampai 10 adalah 6.000000




    java.io.PrintStream@7f48f7c3

>Pada kode program diatas berfungsi untuk mencari penjumlahan bilangan genap dan rata-ratanya dengan menggunakan perulangan beserta statement `continue`. Bila nilai variabel `i` yang diinisialisasi pada perulangan dimodulus 2 hasilnya bukan 0 maka akan menjalankan statement `continue` yang berarti mengabaikan baris kode dibawahnya. Jika hasil modulusnya adalah 0 maka akan menjalankan baris kode dibawahnya dan menyimpan hasil penjumlahan tersebut. Lalu menghitung rata-rata setelah perulangan selesai.

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;

System.out.print("Masukkan angka : ");
bil = input.nextInt();

for(int i = 1; i<=bil; i++){
    if(i%5 == 0) continue;
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

>Pada kode program diatas berfungsi untuk menampilkan output bilangan yang bukan kelipatan 5. Hal tersebut dapat dilakukan dengan menggunakan statement `continue`. Jadi di dalam perulangan untuk menampilkan baris bilangan, akan dilakukan cek, apabila bilangan tersebut dimodulus 5 hasilnya 0, maka bilangan tersebut adalah kelipatan 5 dan akan menjalankan statement `continue` sehingga tidak mengoutputkan bilangan tersebut melainkan melewati baris kode dibawahnya.

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int bil1 = 0, bil2 = 1;
int total = 0;
int panjang;

System.out.print("Masukkan panjang deret:");
panjang = input.nextInt();

// Menampilkan Deret
for(int i = 1; i <= panjang; i++){
    total = bil1 + bil2;
    System.out.print(bil1 + " ");
    bil1 = bil2;
    bil2 = total; 
}

bil1 = 0;
bil2 = 1;

// Rincian Perhitungan Deret
for(int i = 1; i <= (panjang-2); i++){
    total = bil1 + bil2;
    System.out.printf("\nSum of: %d + %d = %d", bil1, bil2, total);
    bil1 = bil2;
    bil2 = total; 
}
```

    Masukkan panjang deret:12
    0 1 1 2 3 5 8 13 21 34 55 89 
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

>Pada kode program diatas kita menghitung deret fibonacci. Kita membutuhkan variabel untuk menyimpan hasil dari penjumlahan serta menyimpan bilangan sebelumnya untuk menghasilkan nilai di depannya. Hal ini dapat dilakukan dengan melakukan perulangan, dan setiap perulangan kita menyimpan nilai baru ke dalam 2 variabel bilangan yaitu `bil1` dan `bil2`. Kita menyimpan bilangan ke 2 ke dalam variabel `bil1` dan total ke dalam variabel `bil2`. Dengan begitu kita bisa menghitung nilai selanjutnya dalam perulangan selanjutnya dengan 2 variabel tadi yang hasilnya kita dapat dari penjumlahan tadi. Untuk menampilkan dalam bentuk deret, kita dapat melakukan print di dalam perulangan tanpa menggunakan new line, dengan begitu akan tampil dalam bentuk horizontal. Sedangkan untuk rincian, kita menggunakan printf supaya lebih mudah.

```Java

```
