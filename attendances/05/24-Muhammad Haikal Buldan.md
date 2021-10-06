## JOBSHEET 5

## PEMILIHAN 1

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan if

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

    <p align="left">
    <img width="351" height="460" src="images/01.png">
    </p>
    

> Flowchart diatas digunakan untuk menentukan bilangan ganjil/genap, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel bil untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;
System.out.print("Masukkan sebuah bilangan: ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan: 12


Penjelasan:

import java.util.Scanner;
Scanner input = new Scanner(System.in);
- Command di atas berguna untuk membuat data berupa inputan sehingga saat dijalankan pengguna diperintahkan untuk memasukkan angka.

int bil;
- Memasukkan tipe data integer dengan variable bil

System.out.print("Masukkan sebuah bilangan: ");
- Untuk memunculkan kalimat Masukkan Sebuah Bilangan :

bil = input.nextInt();
- Membuat variabel bil menjadi sebuah inputan yang dimasukkan user.


3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
if(bil%2 == 0){
    System.out.println("Bilangan Genap");
}else{
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Genap


Penjelasan:

if(bil%2 == 0){
    System.out.println("Bilangan Genap");}
- Perintah ini artinya jika bilangan memiliki hasil 0 bila dibagi 2 maka akan memunculkan tulisan Bilangan Genap

else{
    System.out.println("Bilangan Ganjil");}
- Sedangkan untuk perintah ini artinya, jika setelah dibagi 2 masih memiliki sisan 1 atau kebalikan dari pernyataan pertama, akan mengeluarkan hasil Bilangan Ganjil


##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap


Penjelasan :

String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
- Perintah ini artinya sama dengan if else diatas namun lebih ringkas di codingan, artinya yaitu jika sebuah nilai habis dibagi 2 maka akan mengeluarkan bilangan genap dan sebaiknya
- Karena program yang telah dimodifikasi adalah cara singkat yang sama fungsinya dengan if else


2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
int nilai;
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan: 13


Penjelasan :

int nilai;
- untuk membuat tipe data integer berupa variabel nilai dala program

System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
- Membuat variabel nilai dapat diinput oleh user secara manual


+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
if (nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah "+nilai);
```

    Hasil akhir nilai adalah 3


Penjelasan :

if (nilai >= 100){
    nilai += 10;
}
- Jika nilai yang diinputkan lebih dari sama dengan 100 maka nilai akan ditambah 10

else{
    nilai -= 10;
}
- Jika tidak lebih dari 100 maka nilai akan dikurangi dengan 10

System.out.println("Hasil akhir nilai adalah "+nilai);
- Memunculkan hasil akhir dengan memanggil data nilai yang sudah melalui proses if else


+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

1. nilai += 10; memiliki arti sama dengan nilai = nilai + 10, nilai yang diinputkan akan ditambah 10, sedangkan nilai -= 10; memiliki arti sama dengan nilai = nilai - 10, nilai yang diinputkan akan dikurangi 10



```Java
import java.util.Scanner ;
    Scanner sc = new Scanner(System.in); 
    int nilai1, nilai2;
    double hasil1;
    System.out.print("Masukkan bilangan 1: ");
    nilai1 = sc.nextInt(); 
    System.out.print("Masukkan bilangan 2: ");
    nilai2 = sc.nextInt();

    hasil1=(nilai1+nilai2) * 1.0/2.0;

    if(hasil1>=100){
        hasil1 -= 5;
    }else{
        hasil1 += 10;
    }
    System.out.println("Hasil akhir nilai adalah "+hasil1);
```

    Masukkan bilangan 1: 12
    Masukkan bilangan 2: 12
    Hasil akhir nilai adalah 22.0


#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur anda: ");
umur = input.nextInt();
```

    Masukkan umur anda: 17


Penjelasan :

import java.util.Scanner;
Scanner input = new Scanner(System.in);
- Membuat program menjadi sebuah inputan 

int umur;
- Menyiapkan tipedata integer dengan variabel nilai

System.out.print("Masukkan umur anda: ");
- Memunculkan nilai umur

umur = input.nextInt();
- Memasukkan nilai inputan umur pada systemoutprint diatas 


+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
if(umur > 60)
    System.out.println("Lansia");
else if(umur > 45)
    System.out.println("Tua");
else if(umur > 17)
    System.out.println("Dewasa");
else if(umur > 5)
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

    Anak-anak


Penjelasan :

if(umur > 60)
    System.out.println("Lansia");
- Jika umur yang dimasukkan lebih dari 60 maka akan mengeluarkan Lansia sebagai hasil

else if(umur > 45)
    System.out.println("Tua");
- Jika umur lebih dari 45 maka akan mengeluarkan Tua sebagai hasil

else if(umur > 17)
    System.out.println("Dewasa");
- Jika umur lebih dari 17 akan mengeluarkan Dewasa sebagai hasil

else if(umur > 5)
    System.out.println("Anak-anak");
- Jika umur lebih dari 5 maka akan memunculkan hasil Anak anak

else
    System.out.println("Balita");
- Jika umur yang dimasukkan diluar program if else if diatas maka akan memunculkan nilai balita


+ Jalankan program dan amati apa yang terjadi!

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;
```

Penjelasan:

Scanner sc = new Scanner(System.in);
- membuat program berupa inputan data

double angka1, angka2, hasil;
- memasukkan variabel angka 1, 2, dan hasil sebagai tipe data doubel

char operator;
- Memasukkan tipe data char dengan variabel operator

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);
```

    Masukkan angka pertama: 12
    Masukkan angka kedua: 12
    Masukkan operator (+ - * /): +


Penjelasan:

System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
- Menginputkan nilai sebagai angka 1 sebagai double

System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
- Menginputkan nilai sebagai angka 2 sebagai doubel

System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);
- Menginputkan nilai sebagai operator yang berfungsi untuk melakukan operasi bilangan

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
switch(operator){
    case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        break;
    case '-':
        hasil = angka1 - angka2;
        System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        break;
    case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + " x " + angka2 + " = " + hasil);
        break;
    case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + " / " + angka2 + " = " + hasil);
        break;
    default:
        System.out.println("Operator yang anda masukan salah");
}
```

    12.0 + 12.0 = 24.0


Penjelasan :

switch(operator){
- membuat program switch dengan operator sebagai sasaran pegerjaan

case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        break;
- membuat aturan bahwa jika operator yang dimasukkan + maka akan menambahkan angka 1 dengan angka 2 sebagai hasil, dan break berfungsi memberhentikan program pada satu case

case '-':
        hasil = angka1 - angka2;
        System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        break;
- membuat aturan bahwa jika operator yang dimasukkan - maka akan mengurangkan angka 1 dengan angka 2 sebagai hasil, dan break berfungsi memberhentikan program pada satu case

case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + " x " + angka2 + " = " + hasil);
        break;
- membuat aturan bahwa jika operator yang dimasukkan * maka akan mengalikan angka 1 dengan angka 2 sebagai hasil, dan break berfungsi memberhentikan program pada satu case

case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + " / " + angka2 + " = " + hasil);
        break;
- membuat aturan bahwa jika operator yang dimasukkan / maka akan membagi angka 1 dengan angka 2 sebagai hasil, dan break berfungsi memberhentikan program pada satu case

default:
        System.out.println("Operator yang anda masukan salah");}
- jika operator yang dimasukkan tidak sesuai dengan setiap case diatas maka akan mengeluarkan operator salah


5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

1. break berfungsi memberhentikan program pada setiap case jadi program akan terus mencari dengan data yang sesuai dengan awal sampai bertemu denga case yang dicari, default berfungsi untuk memunculkun jawaban lain ketika inputan tidak sesuai case yang ada


2. fungsi perintah dari kode program tersebut yaitu memunculkan karakter maupun huruf yang bernilai string dan berdasarkan index java yang semua nya diawali dari angka 0 

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.
2. Perhatikan flowchart berikut ini:

![](images/02.png)

> Buatlah program sesuai dengan flowchart diatas!

3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!

4. Sebuah toko memberikan diskon kepada pelanggannya dengan ketentuan sebagai berikut:

| Total Belanja     | Potongan |
|-------------------|----------|
| >Rp. 200.000,00   | 2%       |
| >Rp. 500.000,00   | 5%       |
| >Rp. 1.000.000,00 | 10%      |

> Total belanja diperoleh dari pembelian tiga barang yaitu barang A, barang B, dan barang C. Ketika menginputkan harga barang juga menginputkan jumlah barang yang dibeli.

Contoh outputnya
```
Masukkan harga barang A   :100000
Masukkan jumlah barang A  :10
Masukkan harga barang B   :250000
Masukkan jumlah barang B  :5
Masukkan harga barang C   :150000
Masukkan jumlah barang C  :1
---------------------------------------------
                Struk total
---------------------------------------------
Nama Barang 	| 	Harga 	| 	Jumlah 	| 	Total
Barang A            100000         10        1000000   
Barang B            250000         5         1250000   
Barang C            150000         1         150000    
Total       :2400000
Diskon      :240000.0
Total Bayar :2160000.0
```

Nomor 1


```Java
import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
      int ang1, ang2, maks;
      System.out.print("Masukkan bilangan I: ");
      ang1 = sc.nextInt();
      System.out.print("Masukkan bilangan II: ");
      ang2 = sc.nextInt();
        if (ang1>ang2){
            maks = ang1;
        } else {
            maks = ang2;
        }
        System.out.println("Angka Maksimum = "+maks);
```

    Masukkan bilangan I: 12
    Masukkan bilangan II: 12
    Angka Maksimum = 12


Penjelasan :

import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
- membuat program berupa inputan manual
      
int ang1, ang2, maks;
- membuat tipe data integer dengan variabel ang1, 2, maks

System.out.print("Masukkan bilangan I: ");
      ang1 = sc.nextInt();
- menginputkan nilai sebagai ang1

System.out.print("Masukkan bilangan II: ");
      ang2 = sc.nextInt();
- menginputkan nilai sebagai ang1

if (ang1>ang2){
            maks = ang1
- jika nilai angka 1 lebih besar dari angka 2 maka akan memunculkan nilai angka 1 sebagai nilai maksimal;

} else {
            maks = ang2;
        }
- jika nilai angka 2 lebih besar dari angka 1 maka akan memunculkan nilai angka 2 sebagai nilai maksimal;

System.out.println("Angka Maksimum = "+maks);
- memunculkan agka maksimum dengan memanggil nilai maks

Nomor 2


```Java
import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
      int umur, keputusan;
      System.out.print("Berapakah Umur Anda: ");
      umur = sc.nextInt();
        if (umur>=17){
            System.out.print("Anda Boleh Berkendara");
        } else {
            System.out.print("Anda Belum Boleh Berkendara");
        }
```

    Berapakah Umur Anda: 18
    Anda Boleh Berkendara

Penjelasan:

import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
- membuat program berupa inputan manual

int umur, keputusan;
- membuat tipe data integer dengan variabel umur dan keputusan

System.out.print("Berapakah Umur Anda: ");
      umur = sc.nextInt();
- menginputkan nilai sebagai umur

if (umur>=17){
            System.out.print("Anda Boleh Berkendara");
- jika umur lebih dari sama dengan 17 maka akan memunculkan hasil anda boleh berkendara

} else {
            System.out.print("Anda Belum Boleh Berkendara");}
- jika umur kurang dari 17 maka akan memunculkan hasil anda belum boleh berkendara

Nomor 3


```Java
import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
      double uas, uts, kuis, tugas, na;
      System.out.print("Masukkan Nilai UAS: ");
      uas = sc.nextDouble();
      System.out.print("Masukkan Nilai UTS: ");
      uts = sc.nextDouble();
      System.out.print("Masukkan Nilai Kuis: ");
      kuis = sc.nextDouble();
      System.out.print("Masukkan Nilai Tugas: ");
      tugas = sc.nextDouble();

      na = (uas * 40/100)+(uts * 30/100)+(kuis * 10/100)+(tugas * 20/100);

        if (na<65){
            System.out.print("Silahkan Melakukan Remedial");
        } else {
            System.out.print("Selamat Nilai Anda Aman");
        }
```

    Masukkan Nilai UAS: 80
    Masukkan Nilai UTS: 80
    Masukkan Nilai Kuis: 80
    Masukkan Nilai Tugas: 80
    Selamat Nilai Anda Aman

Penjelasan:

import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
- membuat program berupa inputan manual

double uas, uts, kuis, tugas, na;
- membuat tipe data doubel dengan variabel uas, uts, kuis, tugas, dan nilai akhir

System.out.print("Masukkan Nilai UAS: ");
      uas = sc.nextDouble();
- menginputkan nilai sebagai uas

System.out.print("Masukkan Nilai UTS: ");
      uts = sc.nextDouble();
- menginputkan nilai sebagai uts

System.out.print("Masukkan Nilai Kuis: ");
      kuis = sc.nextDouble();
- menginputkan nilai sebagai kuis

System.out.print("Masukkan Nilai Tugas: ");
      tugas = sc.nextDouble();
- menginputkan nilai sebagai tugas


na = (uas * 40/100)+(uts * 30/100)+(kuis * 10/100)+(tugas * 20/100);
- memasukkan pengerjaan dari variabel na, agar bisa menjadi Nilai akhir


if (na<65){
            System.out.print("Silahkan Melakukan Remedial");
- Jika nilai kurang dari 65 maka akan memunculkan Silahkan Melakukan Remedial

} else {
            System.out.print("Selamat Nilai Anda Aman");}
- jika nilai lebih dari sama dengan 65 maka nilai aman



Nomor 4


```Java
import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
      double b1, b2, b3, jb1, jb2, jb3, tb1, tb2, tb3, disc, t, tb;
      System.out.print("Harga Barang 1: ");
      b1 = sc.nextDouble();
      System.out.print("Jumlah Barang : ");
      jb1 = sc.nextDouble();
      System.out.print("Harga Barang 2: ");
      b2 = sc.nextDouble();
      System.out.print("Jumlah Barang : ");
      jb2 = sc.nextDouble();
      System.out.print("Harga Barang 3: ");
      b3 = sc.nextDouble();
      System.out.print("Jumlah Barang : ");
      jb3 = sc.nextDouble();

      tb1=b1*jb1;
      tb2=b2*jb2;
      tb3=b3*jb3;
      
      System.out.println("--------------------------------");
      System.out.println("           Total Harga          ");
      System.out.println("--------------------------------");
      System.out.println(" Nama Barang " + " Harga " + " Jumlah " + " Total ");
      System.out.println(String.format(" Barang A \t\t %f \t\t %f \t\t %f", b1, jb1, tb1));
      System.out.println(String.format(" Barang B \t\t %f \t\t %f \t\t %f", b2, jb2, tb2));
      System.out.println(String.format(" Barang C \t\t %f \t\t %f \t\t %f", b3, jb3, tb3));

      t=tb1+tb2+tb3;
      System.out.print(" Total : "+t);

        if (t>200000){
            disc = t * 2/100;
        } else if (t>500000){
            disc = t * 5/100;
        } else if (t>1000000){
            disc = t * 10/100;
        } else {
            disc = 0;
        }
        System.out.println(" Diskon " +disc);
        tb = t - disc;
        System.out.print("Total Bayar :"+tb);
```

    Harga Barang 1: 12000
    Jumlah Barang : 120
    Harga Barang 2: 13000
    Jumlah Barang : 50
    Harga Barang 3: 12000
    Jumlah Barang : 100
    --------------------------------
               Total Harga          
    --------------------------------
     Nama Barang  Harga  Jumlah  Total 
     Barang A 		 12000.000000 		 120.000000 		 1440000.000000
     Barang B 		 13000.000000 		 50.000000 		 650000.000000
     Barang C 		 12000.000000 		 100.000000 		 1200000.000000
     Total : 3290000.0 Diskon 65800.0
    Total Bayar :3224200.0

Penjelasan: 

import java.util.Scanner ;
    Scanner sc = new Scanner(System.in);
- membuat program berupa inputan manual

double b1, b2, b3, jb1, jb2, jb3, tb1, tb2, tb3, disc, t, tb;
- membuat tipe data doubel dengan variabel b1, b2, b3, jb1, jb2, jb3, tb1, tb2, tb3, disc, t, tb

System.out.print("Harga Barang 1: ");
      b1 = sc.nextDouble();
- menginputkan nilai sebagai b1

System.out.print("Jumlah Barang : ");
      jb1 = sc.nextDouble();
- menginputkan nilai sebagai jb1

System.out.print("Harga Barang 2: ");
      b2 = sc.nextDouble();
- menginputkan nilai sebagai b2

System.out.print("Jumlah Barang : ");
      jb2 = sc.nextDouble();
- menginputkan nilai sebagai jb2

System.out.print("Harga Barang 3: ");
      b3 = sc.nextDouble();
- menginputkan nilai sebagai b3

System.out.print("Jumlah Barang : ");
      jb3 = sc.nextDouble();
- menginputkan nilai sebagai jb3


tb1=b1*jb1;
- memasukkan pengerjaan dari variabel tb1, dengan mengalikan b1 dengan jb1

tb2=b2*jb2;
- memasukkan pengerjaan dari variabel tb2, dengan mengalikan b2 dengan jb2

tb3=b3*jb3;
- memasukkan pengerjaan dari variabel tb3, dengan mengalikan b3 dengan jb3
      

System.out.println("--------------------------------");
- mencetak garis garis

System.out.println("           Total Harga          ");
- mencetak tulisan Totanl Harga

System.out.println("--------------------------------");
- mencetak garis garis

System.out.println(" Nama Barang " + " Harga " + " Jumlah " + " Total ");
- mencetak tulisan Nama Barang    Harga      Jumlah     Total

System.out.println(String.format(" Barang A \t\t %f \t\t %f \t\t %f", b1, jb1, tb1));
- Mengeluarkan rincian barang A dengan memancing dengan %f 

System.out.println(String.format(" Barang B \t\t %f \t\t %f \t\t %f", b2, jb2, tb2));
- Mengeluarkan rincian barang B dengan memancing dengan %f 

System.out.println(String.format(" Barang C \t\t %f \t\t %f \t\t %f", b3, jb3, tb3));
- Mengeluarkan rincian barang C dengan memancing dengan %f 


t=tb1+tb2+tb3;
- membuat operasi penyelesaian dari variabel t

System.out.print(" Total : "+t);
- memunculkan total dengan memanggil variabel T yang sudah di operasikan


if (t>200000){
            disc = t * 2/100;
- jika total lebih dari 200000 maka akan mendapat diskon 2% dari total 

} else if (t>500000){
            disc = t * 5/100;
- jika total lebih dari 500000 maka akan mendapat diskon 5% dari total 

} else if (t>1000000){
            disc = t * 10/100;
- jika total lebih dari 1000000 maka akan mendapat diskon 10% dari total 

} else {
            disc = 0;}
- jika total tidak memenuhi aturan diatas maka akan mendapat diskon 0 persen 


System.out.println(" Diskon " +disc);
- menampilkan total diskon

tb = t - disc;
- membuat aturan dari tb dengan mengurangkan t dengan disc 

System.out.print("Total Bayar :"+tb);
- memunculkan total yang harus dibayar dengan memanggil tb

