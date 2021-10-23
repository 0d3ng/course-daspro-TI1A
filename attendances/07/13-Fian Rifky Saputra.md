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
int angka, faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.print("Masukkan angka : ");
angka= input.nextInt();
for(int i=1; i<=angka; i++){
    faktorial = faktorial * i;
    System.out.printf("ketika i=&d, faktorialnya %d\n",i,faktorial);
}
System.out.printf("Hasilnya dari %d adalah %d\n", angka, faktorial);
```

    Masukkan angka : 5
    ketika i=&d, faktorialnya 1
    ketika i=&d, faktorialnya 2
    ketika i=&d, faktorialnya 3
    ketika i=&d, faktorialnya 4
    ketika i=&d, faktorialnya 5
    Hasilnya dari 5 adalah 120





    java.io.PrintStream@79cab8ac



5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.print("Masukkan angka : ");
angka= input.nextInt();
int i=1; 
while(i<=angka){
    faktorial = faktorial * i;
    System.out.printf("ketika i=&d, faktorialnya %d\n",i,faktorial);
    i++;
}
System.out.printf("Hasilnya dari %d adalah %d\n", angka, faktorial);
```

    Masukkan angka : 5
    ketika i=&d, faktorialnya 1
    ketika i=&d, faktorialnya 2
    ketika i=&d, faktorialnya 3
    ketika i=&d, faktorialnya 4
    ketika i=&d, faktorialnya 5
    Hasilnya dari 5 adalah 14400





    java.io.PrintStream@79cab8ac



6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.print("Masukkan angka : ");
angka= input.nextInt();
int i=1;
do{
    faktorial = faktorial * i;
    System.out.printf("ketika i=&d, faktorialnya %d\n",i,faktorial);
    i++;
}
while(i<=angka);
System.out.printf("Hasilnya dari %d adalah %d\n", angka, faktorial);
```

    Masukkan angka : 4
    ketika i=&d, faktorialnya 1
    ketika i=&d, faktorialnya 2
    ketika i=&d, faktorialnya 3
    ketika i=&d, faktorialnya 4
    Hasilnya dari 4 adalah 345600





    java.io.PrintStream@79cab8ac



##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

// Ketik jawaban no 1

untuk yang faktorial itu adalah nama variabelnya dan untuk *=i untuk menampung hasil perhitungan dari faktorial ini

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan angka : ");
angka= input.nextInt();
int i=1;
System.out.println(angka + "Faktorial = " + i);

while(i<=angka){
    faktorial*=i;
    i++;
    if(i<=angka)
        System.out.printf("x%d", i);
}
System.out.printf(" = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan angka : 5
    5Faktorial = 1
    x2x3x4x5 = 120




    java.io.PrintStream@79cab8ac



#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.println("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 
    10
    Masukkan Bilangan : 
    50
    Jumlah angka-angka yang telah dimasukkan : 60


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total=0;
while(true){
    System.out.println("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 
    10
    Masukkan Bilangan : 
    20
    Masukkan Bilangan : 
    50
    Jumlah angka-angka yang telah dimasukkan : 80


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total=0;
do
{
    System.out.println("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 
    60
    Jumlah angka-angka yang telah dimasukkan : 60


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban no 1

pertama int adalah jenis tipe datanya,angka dan total merupakan nama variabelnya,do while ini adalah jenis perulangannya,if total>50 break itu maksudnya adalah apabila angka tersebut lebih dari 50 maka sistem akan menghentikan perulangan secara paksa dan untuk yang "true" tipe data boolean yang menunjukkan benar atau salah


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


// Ketik jawaban disini
untuk yang bagian for itu adalah jenis perulangannya,terus untuk yang total=0 itu menunjukkan input berupa totalnya 0,terus true ini penjelasan mengenai apakaha pernyataan total=0 ini benar atau salah atau bisa disebut tipe data boolean

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, total,  count;
double avg;
count=0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.println("Masukkan Bilangan : ");
    angka=input.nextInt();
    if(angka>=50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: "+avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 
    10
    Masukkan Bilangan : 
    40
    Masukkan Bilangan : 
    50
    Masukkan Bilangan : 
    20
    Masukkan Bilangan : 
    30
    Jumlah angka-angka yang kurang dari 50: 100
    Rata-rata angka yang kurang dari 50: 25.0



```Java
5. Jalankan program. Amati apa yang terjadi!
```

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban no 1

untuk perbedaan dari percobaan 2 dan percobaan 3 terletak pada cara menghentikan program nya dimana percobaan 2 menggunakan break sedangkan percobaan 3 menggunakan continue,ini sangat beda karena break ini cara memberhentikannya perulangan secara paksa sedangkan continue hanya menghentikan perulangan yang sedang terjadi(satu literasi) atau bisa dibilang melewati 1 perulangan

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

// Ketik jawaban no 2

menurut fungsi diatas bagian if adalah jenis kondisi nya dan untuk yg (angka>=50) ini untuk menentukan apabila angka tersebut lebih dari 50 sedangkan continue ini untuk mengatur perulangan nya sama seperti break dan untuk yang count digunakan untuk menghitung angka

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
int angka, jumlahBilgenap;
float ratarata;

System.out.println("Masukkan Angka : ");
angka = input.nextInt();
System.out.println("Banyaknya bilangan genap dari 1 sampai 10 adalah");
jumlahBilgenap = input.nextInt();

 System.out.println("Angka genap dalam range tersebut adalah ");
        int i=1, genap=2,jumlah=0;

            while(i<=5){
            System.out.println(genap);
                jumlah += genap;
                genap = genap+2;
                i++;
            }
            System.out.println("Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah "+jumlah);
            
            ratarata = jumlah / 5;
                System.out.println ("Rata-rata bilangan genap dari 1 sampai 10 adalah: "+jumlah/5);
```

    Masukkan Angka : 
    10
    Banyaknya bilangan genap dari 1 sampai 10 adalah
    5
    Angka genap dalam range tersebut adalah 
    2
    4
    6
    8
    10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata-rata bilangan genap dari 1 sampai 10 adalah: 6


2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;

System.out.println("Masukkan Angka : ");
angka = input.nextInt();

        int i, deret=1,jumlah=0;

            while(i<=18){
                jumlah += deret;
                deret = deret+1;
                i++;
                if (i == 5)continue;
                System.out.print(i);
              
                
        }
```

    Masukkan Angka : 
    19
    1234678910111213141516171819

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int num1 = 0;
int num2 = 1;
int sumOf;
for(int i =0;i <= n; ++i){
    System.out.print("Sum of: " + num1 + " + " + num2 +" = ");
    sumOf = num1 + num2;
    num1 = num2;
    num2 = sumOf;
    System.out.println(sumOf);
}
```

    11
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
    Sum of: 55 + 89 = 144
    Sum of: 89 + 144 = 233



```Java

```
