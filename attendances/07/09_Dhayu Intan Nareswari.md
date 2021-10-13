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
int angka, faktorial, i;
int faktorial=1;
int i=1;
```

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
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>

// Ketik kode program di atas di bawah sini



```Java
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

// Ketik jawaban disini


Baris diatas merupakan rumus untuk mencari faktorial yang dilakukan secara berulang hingga i<=angka. Dimana rumus faktorial = faktorial * i. Misal, i =3 maka :

nilai awal faktorial = 1, nilai awal i = 1,

faktorial1 = nilai awal faktorial* nilai awal i = 1 * 1 = 1

faktorial2 = hasil faktorial1 * i++ = 1 * 2 = 2

faktorial3 = hasil faktorial2 * i++ = 2 * 3 = 6

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial, i;
int faktorial=1;
int i=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
System.out.printf("%dfaktorial = ", angka);
for(int i=1; i<=angka; i++){
    faktorial*=i;
    if(i==angka){
        System.out.print(i);
    }else{
        System.out.print(i+ "x");
    }
}
    System.out.print(" = "+ faktorial);
    
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan Bilangan : 5
    5faktorial = 1x2x3x4x5 = 120

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 20
    Masukkan Bilangan : 20
    Masukkan Bilangan : 15
    Jumlah angka-angka yang telah dimasukkan : 55


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
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 20
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 15
    Jumlah angka-angka yang telah dimasukkan : 55


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
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 20
    Masukkan Bilangan : 20
    Masukkan Bilangan : 15
    Jumlah angka-angka yang telah dimasukkan : 55


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban disini


Fungsi "break" pada kode diatas adalah untuk menghentikan perulangan apabila total dari penjumlahan bilangan tersebut sudah lebih dari 50. Apabila total masih <= 50, maka perintah untuk memasukkan bilangan akan terus dijalankan. Contoh :

Bilangan 1 = 20, maka lanjut masukkan bilangan karena totalnya masih 20 (20<50)

Bilangan 2 = 20, maka lanjut masukkan bilangan karena totalnya bil1+bil2=20+20=40 (40<50)

Bilangan 3 = 15, maka perintah memasukkan bilangan akan berhenti karena totalnya sudah lebih dari 50, yaitu bil1+bil2+bil3=20+20+15=55.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


// Ketik jawaban disini : Fungsi kode diatas untuk melakukan perulangan for dengan nilai awal total=0, dan semua kondisi dianggap true sehingga untuk menghentikan perulangan harus menggunakan perintah break.


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
System.out.println("Jumlah angka-angka yang kurang dari 50: "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: "+avg)
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 21
    Masukkan Bilangan : 24
    Masukkan Bilangan : 67
    Masukkan Bilangan : 12
    Masukkan Bilangan : 95
    Jumlah angka-angka yang kurang dari 50: 57
    Rata-rata angka yang kurang dari 50: 19.0



```Java
5. Jalankan program. Amati apa yang terjadi!
```

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban disini


Percobaan 2 : Menggunakan fungsi break, yang berfungsi untuk menghentikan perulangan jika suatu kondisi terpenuhi (jika total sudah >50)

Percobaan 3 : Menggunakan fungsi continue, dimana perulangan dijalankan tetapi kode yang memenuhi kondisi continue diabaikan, jika pada percobaan 3 maka angka yang >=50 diabaikan.

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

// Ketik jawaban disini


Jika angka>=50 maka lanjutkan perulangan berikutnya dengan mengabaikan angka yang memenuhi kondisi tersebut(mengabaikan angka yang>=50).

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
Scanner input=new Scanner(System.in);
int angka, total, count, i;
double avg;
System.out.print("Masukkan Angka : ");
angka=input.nextInt();
if(angka<=0){
    System.out.println("Angka yang Anda masukkan bukan bilangan positif");
}else{
count=angka/2;
System.out.println("Banyak bilangan genap dari 1 sampai "+angka + " adalah "+count);
System.out.print("Angka genap dalam range tersebut adalah");
for(int i=1;i<=angka;i++){
    if(i%2!=0)continue;
    System.out.print(", " + i);
    total+=i;
    avg=total/count;
}
System.out.println("\nHasil penjumlahan bilangan genap dari 1 sampai "+angka + " adalah "+total);
System.out.println("Rata rata bilangan genap dari 1 sampai "+angka + " adalah "+avg);
}
```

    Masukkan Angka : 10
    Banyak bilangan genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah, 2, 4, 6, 8, 10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata rata bilangan genap dari 1 sampai 10 adalah 6.0


Keterangan :

Masukkan angka, apabila angka 0 atau bil negatif keluar pernyataan "Angka yang Anda masukkan bukan bilangan positif". Jika angka yang dimasukkan positif maka akan diproses seperti berikut :

for(int i=1;i<=angka;i++), maksudnya inisialisasi = 1, dilakukan perulangan hingga i<=angka yang dimasukkan dimana perulangan selanjutnya bilangan i ditambah 1(increment)

if(i%2!=0)continue;, jika kodenya if(i%2=0)continue maka bilangan genap (yang habis dibagi 2 yang diabaikan), akan tetapi karena ada tanda negasi (!), maka yang bukan angka genap yang diabaikan.

Menghitung total dari bilangan genap range 1-10, lalu menghitung rata rata = total/banyak bilangan genap, dan menampilkan hasilnya.

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
Scanner input=new Scanner(System.in);
int angka, i;
System.out.print("Masukkan Angka : ");
angka=input.nextInt();
for(int i=1;i<=angka;i++){
    if(i%5==0)continue;
    System.out.println(i);
    
}
```

    Masukkan Angka : 19
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


Keterangan :

for(int i=1;i<=angka;i++) : inisialisasi 1, dilakukan perulangan dengan increment (ditambahkan 1 bilangan) disetiap perulangan hingga mencapai angka yang telah diinputkan.

if(i%5==0)continue;, untuk bilangan yang habis dibagi 5 instruksi dibawahnya (System.out.println(i);) diabaikan, sehingga bilangan yang habis dibagi 5 tidak dimunculkan.

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int a, b, c, d, jmlF;
    System.out.println("======Fibonacci Series======");
    System.out.print("Masukkan bilangan Fibonacci : ");
     a=sc.nextInt();
 
    b = 0;
    c = 1;
    d = 1;
 for (jmlF=1; jmlF<=a; jmlF++){
     System.out.println("Sum of " + jmlF + " : " + b + " + " + c + " = " + d);
     b= c;
     c= d;
     d= b+c;
 }

```

    ======Fibonacci Series======
    Masukkan bilangan Fibonacci : 10
    Sum of 1 : 0 + 1 = 1
    Sum of 2 : 1 + 1 = 2
    Sum of 3 : 1 + 2 = 3
    Sum of 4 : 2 + 3 = 5
    Sum of 5 : 3 + 5 = 8
    Sum of 6 : 5 + 8 = 13
    Sum of 7 : 8 + 13 = 21
    Sum of 8 : 13 + 21 = 34
    Sum of 9 : 21 + 34 = 55
    Sum of 10 : 34 + 55 = 89


b = 0; c = 1; d = 1; kode disamping merupakan nilai awal b, c, dan d.

for (jmlF=1; jmlF<=a; jmlF++),maksudnya nilai awal jumlah fibonacci = 1 dimana perulangan dilakukan hingga fibonacci ke-n (n sesuai dengan angka yang diinputkan)

 for (jmlF=1; jmlF<=a; jmlF++){
     System.out.println("Sum of " + jmlF + " : " + b + " + " + c + " = " + d);
     b= c;
     c= d;
     d= b+c;
 } 

maksud kode diatas adalah, misal :

fibonacci 1 = b (0), c(1), d(b+c)=(0+1)=1

fibonacci 2 = b jadi c(1), c jadi d(1), d(b+c)=(1+1)=2

fibonacci 3 = b jadi c(1), c jadi d(2), d(b+c)=(1+2)=3

fibonacci 4 = b jadi c(2), c jadi d(3), d(b+c)=(2+3)=5

dan seterusnya hingga fibonacci ke-n (n sesuai bilangan yang diinputkan)
