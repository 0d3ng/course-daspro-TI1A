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

Kode diatas berfungsi untuk menambahkan library scanner


```Java
3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas
```


```Java
// Ketik kode program di bawah sini
int angka;
int faktorial=1;
```

Kode diatas berfungsi untuk mendeklarasikan variabel

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 3
    Nilai faktorial bilangan tersebut adalah : 6

Kode diatas berfungsi untuk menghitung faktorial bilangan yang diinputkan, dengan cara mengalikan bilangan mulai dari 1 sampai bilangan yang diinputkan

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah :" + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 3
    Nilai faktorial bilangan tersebut adalah :6

Sama seperti sebelumnya, kode diatas berfungsi untuk menghitung faktorial bilangan yang diinputkan, dengan cara mengalikan bilangan mulai dari 1 sampai bilangan yang diinputkan

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
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
    Masukkan Bilangan : 3
    Nilai faktorial bilangan tersebut adalah : 6

Tetap sama seperti sebelumnya, kode diatas berfungsi untuk menghitung faktorial bilangan yang diinputkan, dengan cara mengalikan bilangan mulai dari 1 sampai bilangan yang diinputkan

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
Kegunaanya yaitu program akan mengkali seluruh bilangan yang ada di input program/hasil looping
```

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
int faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
System.out.print(angka + " Faktorial = ");
for(int i=1; i<=angka; i++){
    faktorial*=i;
    System.out.print(i);
    
    if(i!=angka){
        System.out.print("x");
    }
}
System.out.print(" = " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    5 Faktorial = 1x2x3x4x5 = 120

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
for(total=0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan :" + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 32
    Masukkan Bilangan : 32
    Jumlah angka-angka yang telah dimasukkan :64


Kode diatas berfungsi untuk menjumlah angka yang dimasukkan, tetapi sistem akan berhenti saat jumlah angka yang dimasukkan melebihi 50 dan akan mentotal lalu mengeluarkan output total angka yang diinputkan

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
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan :" + total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 57
    Jumlah angka-angka yang telah dimasukkan :57


Sama seperti sebelumnya, Kode diatas berfungsi untuk menjumlah angka yang dimasukkan, tetapi sistem akan berhenti saat jumlah angka yang dimasukkan melebihi 50 dan akan mentotal lalu mengeluarkan output total angka yang diinputkan

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total=0;
do
{
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 24
    Masukkan Bilangan : 27
    Jumlah angka-angka yang telah dimasukkan : 51


Tetap sama seperti sebelumnya, Kode diatas berfungsi untuk menjumlah angka yang dimasukkan, tetapi sistem akan berhenti saat jumlah angka yang dimasukkan melebihi 50 dan akan mentotal lalu mengeluarkan output total angka yang diinputkan

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!


```Java
// Ketik jawaban disini
Fungsinya yaitu membuat looping/perulangan sampai jumlah angka yang telah dimasukkan lebih dari 50, lalu berhenti
```

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>



```Java
// Ketik jawaban disini
fungsi kode berikut adalah perulangan akan dimulai dengan total bilangan 0, serta perulangan akan terus dilakukan selama input benar
```

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka, total, count;
double avg;
count=0;
    System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    if(angka>=50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: " + total);
avg=(double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 51
    Masukkan Bilangan : 51
    Masukkan Bilangan : 51
    Masukkan Bilangan : 51
    Masukkan Bilangan : 51
    Jumlah angka-angka yang kurang dari 50: 0
    Rata-rata angka yang kurang dari 50: NaN


Kode program diatas berfungsi untuk menjumlah bilangan dibawah 50, cara kerjanya yaitu menginputkan 5 bilangan, lalu sistem akan menyeles=ksi bilangan. Sistem hanya akan mentotal dan merata rata bilangan yang kurang dari 50, lalu sistem akan mengeluarkan output berupa jumlah dan rata rata angka yang nilainya kurang dari 50.

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3


```Java
// Ketik jawaban disini
pada percobaan 2 sistem akan berhenti jika jumlah bilangan yang dimasukkan lebih dari 50
pada percobaan 3 sistem tidak akan berhenti sampai kita menginput 5 kali, tetapi jika ada bilangan 50 keatas, sistem tidak akan mentotalnya, dan hanya akan mentotal bilangan yang dibawah 50
```

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
jika angka lebih dari 50, maka angka tersebut tidak akan dihitung, lalu dilanjutkan dengan menghitung angka angka lain dibawah 50 dan mentotalnya.
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
int bil, jmlBilGenap;
int totalGenap=0;
double avg;
System.out.print("Masukkan angka: ");
bil = input.nextInt();
jmlBilGenap = bil/2;
System.out.println("Banyaknya bilangan genap dari 1 sampai " + bil + " adalah " + jmlBilGenap);

System.out.print("Angka genap dalam range tersebut adalah ");
for(int i = 2; i <= bil; i+=2) {
  
    
    System.out.print(i);
    
    if(i != bil) {
        System.out.print(", ");
       
    }
    totalGenap+=i; 

}

avg=totalGenap/jmlBilGenap;



System.out.println("\nHasil penjumlahan angka genap dari 1 sampai " + bil + " adalah " + totalGenap);    
System.out.println("rata-rata angka genap dari 1 sampai " + bil + " adalah " + avg);    
```

    Masukkan angka: 20
    Banyaknya bilangan genap dari 1 sampai 20 adalah 10
    Angka genap dalam range tersebut adalah 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
    Hasil penjumlahan angka genap dari 1 sampai 20 adalah 110
    rata-rata angka genap dari 1 sampai 20 adalah 11.0


# Kode program tersebut berfungsi untuk menghitung jumlah bilangan genap, banyaknya bilangan genap, rata rata bilangan genap, dan bilangan genap dalam range tertentu. Pertama kita harus menginputkan bilangan, lalu sistem akan otomatis menyeleksi bilangan genap yang ada di range 1 sampai angka yang diinputkan tadi. Sistem akan menyeleksi banyaknya bilangan, rata rata bialngan, jumlah bilangan, serta output dari bilangan genap tersebut.

## 10# 2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
 Scanner input = new Scanner(System.in);
   System.out.print("Masukkan angka: ");
int angka=input.nextInt();
    for(int i=1; i <= angka;i++){
        if(i%5 == 0) continue;
        System.out.println(i);
    }

```

    Masukkan angka: 5
    1
    2
    3
    4


Kode program diatas berfungsi untuk mengurutkan bilangan tapi meloncati angka kelipatan 5. Cara kerjanya yaitu sistem akan terus mengeluarkan output angka urut, lalu jika ada angka kelipatan 5 maka tidak akan diprint oleh sistem, lalu melanjutkan lagi dengan angka yang bukan kelipatan 5, begitu seterusnya sampai angka maksimalnya yaitu angka yang kita inputkan pada sistem.

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
Scanner input = new Scanner(System.in);
int total;
int no1 = 0;
int no2 = 1;
System.out.print("Masukkan Banyak Bilangan Fibonacci Yang Diinginkan: ");
int fibo = input.nextInt();
for(i=0; i<fibo; ++i){
    System.out.print("Sum of:" + no1 + " + " + no2 + " = ");
    total = no1 + no2;
    no1 = no2;
    no2 = total;
    System.out.println(total);
}

```

    Masukkan Banyak Bilangan Fibonacci Yang Diinginkan: 5
    Sum of:0 + 1 = 1
    Sum of:1 + 1 = 2
    Sum of:1 + 2 = 3
    Sum of:2 + 3 = 5
    Sum of:3 + 5 = 8


# Kode di atas berfungsi untuk menampilkan bilangan fibonacci sesuai dengan jumlah angka yang dimasukkan, maksudnya jika kita memasukkan 12, maka akan muncul 12 bilangan fibonacci
