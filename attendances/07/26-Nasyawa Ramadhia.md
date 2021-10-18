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
Scanner sc = new Scanner(System.in);
```


```Java
3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas
```


```Java
int angka;
int faktorial=1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka= sc.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 720

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("=== PROGRAM MENGHITUNG NILAI FAKTORIAL WHILE ===");
System.out.print("Masukan Bil : ");
angka = sc.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Niali faktorial bil tersebut : "+ faktorial);
```

    === PROGRAM MENGHITUNG NILAI FAKTORIAL WHILE ===
    Masukan Bil : 5
    Niali faktorial bil tersebut : 120

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE===");
System.out.print("Masukkan Bilangan : ");
angka = scan.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
} while (i<=angka);

System.out.print("Nilai Faktorial bilangan tersebut adalah : "+ faktorial);
```

    ===PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE===
    Masukkan Bilangan : 5
    Nilai Faktorial bilangan tersebut adalah : 120

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

// Ketik jawaban disini
sama saja dengan faktorial*i , mengalikan bilangan


2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int angka;
int faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka= sc.nextInt();
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
// Ketik kode program di atas di bawah 
Scanner input=new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.print("Masukan bil : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukan : "+total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukan bil : 26
    Masukan bil : 20
    Masukan bil : 6
    Jumlah angka-angka yang telah dimasukan : 52


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total-0;
while(true){
    System.out.print("Masukkan Bil: ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yg telah dimasukkan : "+total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bil: 3
    Masukkan Bil: 4
    Masukkan Bil: 7
    Masukkan Bil: 40
    Jumlah angka-angka yg telah dimasukkan : 54


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM DO WHILE LOOP DG BREAK===");
total=0;
do
{
    System.out.print("Masukkan Bil : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka yg telah dimaukan : "+total);
```

    ===PROGRAM DO WHILE LOOP DG BREAK===
    Masukkan Bil : 56
    Jumlah angka yg telah dimaukan : 56


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban disini
Kode nya untuk membuat kita memasukkan bilangan secara terus menerus, dan akan berhenti jika sudah memenuhi 50. intinya kalau a sampe 50 kita terus menerus memasukkan bil.


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


Kode ini akan mengulang terus menerus jika totalnya 0 , dan bisa berhenti jika ada break.

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
System.out.println("===PROGRAM FOR LOOP DG CONTINUE===");
for(int i=0;i<=5;i++){
    System.out.print("Masukan Bil : ");
    angka=input.nextInt();
    if(angka>=50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka yg kurang dari 50 : "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka yg kurang dari 50: "+avg);

```

    ===PROGRAM FOR LOOP DG CONTINUE===
    Masukan Bil : 26
    Masukan Bil : 56
    Masukan Bil : 70
    Masukan Bil : 3
    Masukan Bil : 5
    Masukan Bil : 60
    Jumlah angka yg kurang dari 50 : 34
    Rata-rata angka yg kurang dari 50: 11.333333333333334


#### 5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

- pada pecobaan 2 , ada penggunaan break yang dimana untuk membuat perulangan berhenti
- pada pecobaan 3 , ada penggunaan continue untuk melanjutkan ke perulangan selanjutnya



2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

jika inputan lebih dari 50 atau sama dengan 50 maka nantinya kan lanjut ke perulangan


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
Scanner sc = new Scanner(System.in);
int bil, jmlGenap;
int totalGenap=0;
double avg;
System.out.print("Masukkan angka: ");
bil = sc.nextInt();
jmlGenap = bil/2;
System.out.println("Banyaknya bil genap dari 1 sampai " + bil + " adalah " + jmlGenap);

System.out.print("Angka genap dalam range tersebut adalah ");
for(int i = 2; i <= bil; i+=2) {
  
    
    System.out.print(i);
    
    if(i != bil) {
        System.out.print(", ");
       
    }
    totalGenap+=i; 

}

avg=totalGenap/jmlGenap;



System.out.println("\nHasil penjumlahan angka genap dari 1 sampai " + bil + " adalah " + totalGenap);    
System.out.println("Rata-rata angka genap dari 1 sampai " + bil + " adalah " + avg);
```

    Masukkan angka: 10
    Banyaknya bil genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah 2, 4, 6, 8, 10
    Hasil penjumlahan angka genap dari 1 sampai 10 adalah 30
    Rata-rata angka genap dari 1 sampai 10 adalah 6.0


2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
 Scanner sc = new Scanner(System.in);
   System.out.print("Masukkan angka: ");
int angka=sc.nextInt();
    for(int i=1; i <= angka;i++){
        if(i%5 == 0) continue;
        System.out.println(i);
    }
```

    Masukkan angka: 19
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
int bil1=0;
int bil2=1; 
int hasil;
System.out.print("0 1 ");

while(bil1 <= 34){
    hasil = bil1 + bil2;
    System.out.printf("%d ", hasil);
    
    bil1=bil2;
    bil2=hasil;
}
```

    0 1 1 2 3 5 8 13 21 34 55 89 


```Java

```
