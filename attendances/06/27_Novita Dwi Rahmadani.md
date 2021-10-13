## JOBSHEET 6

## PEMILIHAN 2

### Tujuan

Mahasiswa memahami tentang operator logika; Mahasiswa mampu menyelesaikan permasalahan dengan menggunakan sintaks pemilihan bersarang; Mahasiswa mampu membuat sebuah program Java yang memanfaatkan sintaks pemilihan bersarang


### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1

#### Waktu percobaan : 40 menit

1. Tambahkan library Scanner, deklarasi Scanner

2. Buatlah variabel nilai yang memiliki tipe data int untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
// Ketik kode di sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();

```

    Masukkan nilai ujian (0-100): 88


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <= 100){
    if(nilai >=90 && nilai <= 100){
} else if (nilai >= 80 && nilai <= 89){
System.out.println("Nilai B,Pertahankan prestasi Anda!");
} else if (nilai >= 60 && nilai <= 79){
System.out.println("Nilai C,Tingkatkan belajar Anda!");
} else if (nilai >= 50 && nilai <= 59){
System.out.println("Nilai D,Tingkatkan belajar Anda!");
} else {
System.out.println("Nilai E,Anda tidak lulus!");
} else {
    System.out.println("Nilai E,Anda tidak lulus!");
}

```


    Incomplete input:

    |   // Ketik kode di sini

    |   if(nilai >= 0 && nilai <= 100){

    |       if(nilai >=90 && nilai <= 100){

    |   } else if (nilai >= 80 && nilai <= 89){

    |   System.out.println("Nilai B,Pertahankan prestasi Anda!");

    |   } else if (nilai >= 60 && nilai <= 79){

    |   System.out.println("Nilai C,Tingkatkan belajar Anda!");

    |   } else if (nilai >= 50 && nilai <= 59){

    |   System.out.println("Nilai D,Tingkatkan belajar Anda!");

    |   } else {

    |   System.out.println("Nilai E,Anda tidak lulus!");

    |   } else {

    |       System.out.println("Nilai E,Anda tidak lulus!");

    |   }


> Penjelasan kode program percobaan 1
pada percobaan 1 yaitu struktur pengecekan kondisi bersarang dimana Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa. jika nilai di antara 90 – 100 maka tidak mengeluarkan output, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


```Java
// Jawaban pertanyaan
if(nilai >= 0 && nilai <= 100){
    if(nilai >=90 && nilai <= 100){
} else if (nilai >= 80 && nilai <= 89){
System.out.println("Nilai B,Pertahankan prestasi Anda!");
} else if (nilai >= 60 && nilai <= 79){
System.out.println("Nilai C,Tingkatkan belajar Anda!");
} else if (nilai >= 50 && nilai <= 59){
System.out.println("Nilai D,Tingkatkan belajar Anda!");
} else {
System.out.println("Nilai E,Anda tidak lulus!");
} else {
    System.out.println("Nilai E,Anda tidak lulus!");
} else if (nilai < 0){
        System.out.println("Nilai yang anda masukkan kurang dari 0");
    } else if (nilai > 100){
        System.out.println("Nilai yang anda masukkan lebih dari 0");
    }
```


    Incomplete input:

    |   // Jawaban pertanyaan

    |   if(nilai >= 0 && nilai <= 100){

    |       if(nilai >=90 && nilai <= 100){

    |   } else if (nilai >= 80 && nilai <= 89){

    |   System.out.println("Nilai B,Pertahankan prestasi Anda!");

    |   } else if (nilai >= 60 && nilai <= 79){

    |   System.out.println("Nilai C,Tingkatkan belajar Anda!");

    |   } else if (nilai >= 50 && nilai <= 59){

    |   System.out.println("Nilai D,Tingkatkan belajar Anda!");

    |   } else {

    |   System.out.println("Nilai E,Anda tidak lulus!");

    |   } else {

    |       System.out.println("Nilai E,Anda tidak lulus!");

    |   } else if (nilai < 0){

    |           System.out.println("Nilai yang anda masukkan kurang dari 0");

    |       } else if (nilai > 100){

    |           System.out.println("Nilai yang anda masukkan lebih dari 0");

    |       }


Penjelasan:
sintaks else if (nilai < 0) menampilkan output nilai yang anda masukkan kurang dari 0
dan sintaks else if (nilai > 100) maka output yang akan ditampilkan yaitu nilai yang anda masukkan lebih dari 0

fungsi sintaks if (nilai >= 0 && nilai <= 100)! yaitu digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100


```Java
if(nilai >= 0 || nilai <= 105){
    if(nilai >=90 && nilai <= 105){
} else if (nilai >= 80 && nilai <= 89){
System.out.println("Nilai B,Pertahankan prestasi Anda!");
} else if (nilai >= 60 && nilai <= 79){
System.out.println("Nilai C,Tingkatkan belajar Anda!");
} else if (nilai >= 50 && nilai <= 59){
System.out.println("Nilai D,Tingkatkan belajar Anda!");
} else {
System.out.println("Nilai E,Anda tidak lulus!");
} else {
    System.out.println("Nilai E,Anda tidak lulus!");
} 
```


    Incomplete input:

    |   if(nilai >= 0 || nilai <= 105){

    |       if(nilai >=90 && nilai <= 105){

    |   } else if (nilai >= 80 && nilai <= 89){

    |   System.out.println("Nilai B,Pertahankan prestasi Anda!");

    |   } else if (nilai >= 60 && nilai <= 79){

    |   System.out.println("Nilai C,Tingkatkan belajar Anda!");

    |   } else if (nilai >= 50 && nilai <= 59){

    |   System.out.println("Nilai D,Tingkatkan belajar Anda!");

    |   } else {

    |   System.out.println("Nilai E,Anda tidak lulus!");

    |   } else {

    |       System.out.println("Nilai E,Anda tidak lulus!");

    |   }


Penjelasan:
jika operator && diganti dengan  || atau OR output yang akan ditampilkan tidak berubah seperti sebelumnya(seperti diatas),karena  semua nilai yang dimasukkan berada pada rentang 0 – 105 atau nilai lebih besar sama dengan 0 atau lebih kecil sama dengan 105. 

#### Percobaan 2

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

![](images/02.png)

> Flowchart tersebut digunakan untuk menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan. 

2. Tambahkan library Scanner dan deklarasi Scanner

3. Deklarasikan variabel kategori, penghasilan, gajiBersih, dan pajak

    ![](images/05.png)


```Java
// Ketik kode di sini

import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan,gajiBersih;
double pajak = 0;

System.out.println("Masukkan ketogori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan ketogori: 
    pekerja
    Masukkan besarnya penghasilan: 2048485


Penjelasan:
sintaks System.out.println("Masukkan ketogori: "); untuk memunculkan output kategori
dan sintaks System.out.print("Masukkan besarnya penghasilan: "); untuk memunculkan besar penghasilan.

4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang anda masukkan salah!");
}
```

    Gaji bersih yang anda terima: 1800000


Penjelasan :
hasil gaji bersih didapatkan dari sintaks gajiBersih = (int) (penghasilan - (penghasilan * pajak));

5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?


```Java
// Jawaban pertanyaan
if(kategori.equalsIgnoreCase("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang anda masukkan salah!");
}
```

    Gaji bersih yang anda terima: 1741212


karena tipe data gaji bersih yaitu integer

untuk mengcasting tipe data double menjadi tipe data integer

kegunaan dari equalsIgnoreCase untuk menghilangkan case sensitif seperti string huruf kapital

kegunaan dari equals untuk memberikan case sensitif 

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program kalkulator sederhana menggunakan bahasa pemrograman Java. User akan menginputkan dua buah bilangan riil dan satu buah operator aritmatika (+, -, *, atau /), kemudian program akan mengoperasikan dua bilangan tersebut dengan operator yang sesuai. Petunjuk: gunakan pernyataan switch-case.
Contoh tampilan program:

```
Masukkan bilangan pertama: 2.5
Masukkan operator (+, -, *, /): *
Masukkan bilangan kedua: 4
2.5 * 4.0 = 10.0

```


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;
System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);
    
switch(operator){
    case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "+" + angka2 + "=" + hasil);
    break;
    case '-':
        hasil = angka1 - angka2;
        System.out.println(angka1 + "-" + angka2 + "=" + hasil);
    break;
    case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + "*" + angka2 + "=" + hasil);
    break;
    case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + "/" + angka2 + "=" + hasil);
    break;
    default:
        System.out.println("Operator yang anda masukkan salah");
}
```

    Masukkan angka pertama: 2.5
    Masukkan angka kedua: 4.0
    Masukkan operator (+ - * /): *
    2.5*4.0=10.0


Penjelasan : memasukkkan dua bilangan dengan tipe data double dan operator yang digunakan + , - , * , / .

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int sisi1,sisi2,sisi3;
System.out.println("Masukkan sisi 1");
sisi1 = sc.nextInt();
System.out.println("Masukkan sisi 2");
sisi2 = sc.nextInt();
System.out.println("Masukkan sisi 3");
sisi3 = sc.nextInt();
if(sisi1 == sisi2 && sisi3 == sisi2){
    System.out.println("segitiga sama sisi");
} else if(sisi1 == sisi2 || sisi3 == sisi2 || sisi1 == sisi3){
    System.out.println("segitiga sama kaki");
} else {
    System.out.println("segitiga sembarang");
}
```

    Masukkan sisi 1
    3
    Masukkan sisi 2
    3
    Masukkan sisi 3
    3
    segitiga sama sisi


Penjelasan:
sintaks if(sisi1 == sisi2 && sisi3 == sisi2) yaitu menyatakan jika sisi satu sama dengan sisi 2 dan sisi tiga sama dengan sisi 2,maka nilai bilangan yang sama outputnya segitiga sama sisi.
dan untuk mengoutputkan hasil segitiga sama kaki kita menggunakan sintaks else if(sisi1 == sisi2 || sisi3 == sisi2 || sisi1 == sisi3) dengan penggunaan operator && dan || dan  karna jika satu nilai true maka juga true dan jika nilai false maka juga false yang mengartikan jika segitiga sama kaki kemugkinan ada dua sisi yg sama dan satu sisi yang berbeda.

3. Warung Padang Gembira meminta Anda membuat sebuah program untuk menerima pesanan dari internet. Program yang Anda buat meminta user untuk memasukkan nama makanan dan harga. Setelah itu, user ditawarkan untuk menggunakan pengiriman ekspres. Jika pengguna menolak, maka jenis pengiriman yang digunakan adalah pengiriman reguler. Biaya pengiriman reguler untuk harga makanan kurang dari Rp 100.000 adalah Rp 20.000, sedangkan untuk harga makanan sama dengan atau lebih dari Rp 100.000 biaya pengirimannya adalah Rp 30.000. Untuk jenis pengiriman ekspres, tambahkan biaya tambahan sebesar Rp 25.000 dari standar biaya pengiriman reguler. Tampilkan struk yang berisi nama makanan yang dibeli + harga, biaya pengiriman, dan total yang harus dibayar!
Contoh hasil output program:

```
Masukkan nama makanan: Tuna salad
Masukkan harga makanan: Rp 115000
Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 0

STRUK PEMBELIAN
Tuna salad        Rp 115000
Biaya pengiriman  Rp 30000
TOTAL             Rp 145000

```

```
Masukkan nama makanan: Beef bulgogi
Masukkan harga makanan: Rp 78000
Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 1

STRUK PEMBELIAN
Beef bulgogi      Rp 115000
Biaya pengiriman  Rp 45000
TOTAL             Rp 123000

```




```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
String makanan;
int harga,ongkir,total;
char pengiriman;


System.out.print("Masukkan makanan");
makanan = sc.nextLine();
System.out.print("Masukkan harga");
harga = sc.nextInt();
System.out.print("Masukkan pengiriman");
pengiriman = sc.next().charAt(0);
if(harga < 100000){
    ongkir = 20000;
} else if(harga >= 100000){
    ongkir = 30000;
}
if(pengiriman == 'Y'){
    ongkir += 25000;
}
total = harga + ongkir;
System.out.println(total);

```

    Masukkan makananTuna salad
    Masukkan harga115000
    Masukkan pengiriman30000
    145000


4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

double pendapatan, biayaHidup, tanggungan;
int umur;
char sekolah, kerja;
String  status;

System.out.print("Umur anda : ");
umur = scan.nextInt();

if(umur >= 18){
    System.out.print("Bekerja (y/n) ? ");
    kerja = scan.next().charAt(0);
    if(kerja == 'y'){
        System.out.print("Pendapatan Perbulan : ");
        pendapatan = scan.nextDouble();
        System.out.print("Jumlah Tanggungan : ");
        tanggungan = scan.nextDouble();
        biayaHidup = pendapatan / tanggungan;
        if(biayaHidup < 300000){
            status = "Penduduk Miskin";
        } else {
            status = "Bukan Penduduk Miskin";
        }
    } else {
        status = "Penduduk Miskin";
    }
} else {
    System.out.print("Sekolah (y/n) ? ");
    sekolah = scan.next().charAt(0);
    if(sekolah == 'y'){
        status = "Bukan Penduduk Miskin";
    } else {
        status = "Penduduk Miskin";
    }
}

System.out.println(status);
```

    Umur anda : 20
    Bekerja (y/n) ? y
    Pendapatan Perbulan : 500000
    Jumlah Tanggungan : 2
    Penduduk Miskin



```Java

```
