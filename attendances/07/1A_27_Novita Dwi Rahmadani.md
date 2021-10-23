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
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan: ");
angka = input.nextInt();
for(int i=1; i<angka; i++)
	faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan: 12
    Nilai faktorial bilangan tersebut adalah : 39916800

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial =1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan: ");
angka = input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan: 12
    Nilai faktorial bilangan tersebut adalah : 479001600

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial =1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan: ");
angka = input.nextInt();
int i=1;
do{
    faktorial*=1;
    i++;
}
while(i<angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan: 12
    Nilai faktorial bilangan tersebut adalah : 1

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
untuk menampung nilai atau perkalian dari i
```

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan: ");
angka = input.nextInt();
int i=1;
System.out.print(angka + "Faktorial = " + i);

while(i<=angka){
faktorial*=i;
i++;
if(i<=angka)
System.out.printf("x%d",i);
}
System.out.print(" = " + faktorial);

```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan: 5
    5Faktorial = 1x2x3x4x5 = 120

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input=new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK");
for(total=0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);

```

    ===PROGRAM FOR LOOP DENGAN BREAK
    Masukkan Bilangan : 40
    Masukkan Bilangan : 40
    Jumlah angka-angka yang telah dimasukkan : 80


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK");
total=0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK
    Masukkan Bilangan : 20
    Masukkan Bilangan : 40
    Jumlah angka-angka yang telah dimasukkan : 60


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK");
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

    ===PROGRAM FOR LOOP DENGAN BREAK
    Masukkan Bilangan : 30
    Masukkan Bilangan : 50
    Jumlah angka-angka yang telah dimasukkan : 80


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!


```Java
// Ketik jawaban disini
Membuat program untuk menjumlahkan hasil inputan dan akan berhenti jika jumlah inputan lebih dari 50
```

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>



```Java
// Ketik jawaban disini
pada ekspresi pertama. kita melakukan inisialisasi pada variabel total dengan nilai 0,jika true maka akan looping terus sampai memeorinya habis atau jika  bertemu break akan berhenti
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
    total+= angka;
    count++;
}
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    if(angka>50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50: "+avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    Masukkan Bilangan : 45
    Jumlah angka-angka yang kurang dari 50: 450
    Rata-rata angka yang kurang dari 50: 45.0


### 5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3


```Java
// Ketik jawaban disini
-pada percobaan 2 booleannya true maka akan looping terus 
-sedangkan pada percobaan 3 nilai booleanya sudah ditentukan maksimal akan dijalankan 5 kali

-pada percobaan 2 jika nilai yang dimasukkan lebih dari 50 maka akan break atau berakhir/terputus
-sedangkan pada percobaan 3 jika nilai yang dimasukkan lebih dari 50 maka akan continue atau dilewati

```

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
jika angka bernilai lebih dari sama dengan 50 maka kode program yang ada di bawah perintah continue akan di lewati dan proses perulangan lanjut 
dan jika angka kurang dari sama dengan 50 maka akan dijumlahkan dengan angka yang akan di masukkan/inputkan.
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
int bil,jmlBilGenap,totalGenap=0;
double avg;
int i = 0;
System.out.print("masukkan nilai bil : ");
bil = input.nextInt();
jmlBilGenap = bil/2;
System.out.printf("banyaknya bil genap dari 1-%d adalah %d  \n" , bil, jmlBilGenap);
System.out.print("angka genap dalam range tersebut adalah ");

do{
    i++;
    
    if(i %2 == 0){
        totalGenap += i;
        if(i == bil){
            System.out.print(i);
        }else{
            System.out.print(i+" , ");
        }
        
    }else{
        continue;
    }
}while(i<bil);
avg =(double) totalGenap/jmlBilGenap;
System.out.printf("\ntotal Genap %d \nrata - rata %.1f",totalGenap,avg);

```

    masukkan nilai bil : 10
    banyaknya bil genap dari 1-10 adalah 5  
    angka genap dalam range tersebut adalah 2 , 4 , 6 , 8 , 10
    total Genap 30 
    rata - rata 6.0




    java.io.PrintStream@1d05d353



menampilkan penjumlahan bilangan genap positif pertama (bilangan genap ≥ 0). memasukkan n = 10, program akan menghitung banyaknya jumlah bilangan positive di dalam range bilangan 1-10 kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara 1-10 yaitu :
 0 + 2 + 4 + 6 + 10 = 30. 
 Setelah itu program akan menampilkan rata-rata dari bilangan positive yang telah dijumlahkan tadi

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner in = new Scanner(System.in);
int angka = in.nextInt();
for(int i = 1; i <= angka ; i++){
    if (i %5 == 0){
        continue;
    }
    System.out.println(i);
}
```

    19
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


if (i %5 == 0){
        continue;
yang berfungsi untuk melompati/melewati angka kelipatan 5

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner in = new Scanner(System.in);
int angka = in.nextInt();
int angka1 = 0;
int angka2 = 1;
int sumof;
for(int i = 0;i <= angka; ++i){
    System.out.print("Sum of: " + angka1 +" + " + angka2 +" = ");
    sumof = angka1 + angka2;
    angka1 = angka2;
    angka2 = sumof;
    System.out.println(sumof);
}

```

    10
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



