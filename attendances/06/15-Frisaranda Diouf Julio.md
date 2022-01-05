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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
```

    Masukkan nilai ujian (0-100): 92


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai A, EXCELLENT!


> Penjelasan Kode Program Percobaan 1 :
Kode program di atas berfungsi untuk menginputkan data ketika menjalankan program. Nilai inputannya akan disimpan di variabel nilai. Input yang akan dimasukkan bernilai 0 - 100. Kemudian, apabila nilai inputannya lebih dari sama dengan 90 dan kurang dari sama dengan 100 maka outputnya adalah "Nilai A, EXCELLENT!". Apabila nilai inputannya lebih dari sama dengan 80 dan kurang dari sama dengan 89 maka ouputnya adalah "Nilai B, Pertahankan prestasi Anda!". Apabila nilai inputannya lebih dari sama dengan 60 dan kurang dari sama dengan 79 maka outputnya adalah "Nilai C, Tingkatkan prestasi Anda!". Apabila nilai inputannya lebih dari sama dengan 50 dan kurang dari sama dengan 59 maka outputnya adalah "Nilai D, Tingkatkan belajar Anda!". Sedangkan, apabila nilai inputannya lebih dari sama dengan 0 dan kurang dari sama dengan 49, maka outputnya adalah "Nilai E, Anda tidak lulus!". Namun, apabila nilai inputannya kurang dari 0 atau lebih dari 100 maka outputnya "Nilai yang Anda masukkan tidak valid!".
Pada kode di atas, nilai inputan yang Saya masukkan adalah 92. Karena 92 lebih dari sama dengan 90 dan kurang dari sama dengan 100, maka output yang muncul adalah "Nilai A, EXCELLENT!".

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


#### JAWABAN
1. 
```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();

if(nilai <= 0){
    System.out.println("Nilai yang Anda masukkan kurang dari 0");
} else if (nilai >= 100){
    System.out.println("Nilai yang Anda masukkan lebih dari 100!");
    }
else {
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Masukkan nilai ujian (0-100): -2
    Nilai yang Anda masukkan kurang dari 0


2. Fungsi sintaks if (nilai >= 0 && nilai <= 100) adalah untuk membatasi nilai yang akan diinputkan. Jadi inputannya hanya bernilai 0 - 100, artinya nilai input minimalnya adalah 0 dan nilai input maksimalnya adalah 100.

3. 
```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();

if(nilai >= 0 || nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Masukkan nilai ujian (0-100): 105
    Nilai E, Anda tidak lulus!

> Penjelasan : Hal ini terjadi karena terdapat perubahan operator dari && (dan) menjadi || (atau). Pada operator && kedua kondisi harus bernilai benar agar dianggap benar, sedangkan pada operator || salah satu kondisi benar maka sudah dianggap benar. Dan pada salah satu kondisinya adalah nilai >= 0. Jadi, apabila kita menginputkan nilai = 105, maka sudah dianggap benar. Outpunya "Nilai E, Anda tidak lulus!" karena tidak memenuhi kondisi-kondisi sebelumnya.


#### Percobaan 2

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

![](images/02.png)

> Flowchart tersebut digunakan untuk menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan. 

2. Tambahkan library Scanner dan deklarasi Scanner

3. Deklarasikan variabel kategori, penghasilan, gajiBersih, dan pajak

    ![](images/05.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan kategori: pebisnis
    Masukkan besarnya penghasilan: 3500000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);

} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Gaji bersih yang Anda terima: 2800000


5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan Kode Program Percobaan 2 :
Pada kode program di atas, kita diharuskan menginputkan nilai dari variabel kategori dan penghasilan. Lalu, kedua nilai ini akan muncul di outputnya. Perintah equalsIgnoreCase berfungsi mengidentifikasi nilai variabel kategori apakah sama dengan yang ada dalam parameter method tersebut tanpa melihat kapitalnya. Pada kategori pekerja, apabila penghasilannya kurang dari sama dengan 2 juta, maka pajaknya 0.1 dari penghasilan. Apabila penghasilannya kurang dari sama dengan 3 juta, maka pajaknya 0.15 dari penghasilan. Namun, apabila tidak keduanya atau lebih dari 3 juta, maka pajaknya 0.2 dari penghasilan. Lalu, gaji bersih yang diterima adalah hasil dari penghasilan dikurangi total pajak (pajak dikali penghasilan). Untuk kategori pebisnis, apabila penghasilannya kurang dari sama dengan 2,5 juta, maka pajaknya 0.15 dari penghasilan. Apabila penghasilannya kurang dari sama dengan 3,5 juta, maka pajaknya 0.2 dari penghasilan. Namun, apabila tidak keduanya atau lebih dari 3,5 juta, maka pajaknya 0.25 dari penghasilan. Lalu, gaji bersih yang diterima adalah hasil dari penghasilan dikurangi total pajak (pajak dikali penghasilan).
Pada kode di atas, Saya menginputkan pebisnis pada variabel kategori dan penghasilannya 3500000. Sesuai kondisi-kondisi di atas, maka pajaknya adalah 0.2 dari penghasilan. Jadi, gaji bersih yang diterima adalah 2,8 juta.


##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?


#### JAWABAN
1. 
```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();

if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);

} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Masukkan kategori: pekerja
    Masukkan besarnya penghasilan: 2048485
    Gaji bersih yang Anda terima: 1741212


> Penjelasan : Pada kasus ini, gaji bersih yang diterima harusnya sebesar 1741212,25. Namun, karena menggunakan tipe data integer (int), maka hanya menampilkan bentuk bilangan bulatnya, yaitu 1741212.

2. Fungsi dari (int) pada sintaks tersebut adalah agar tidak melebihi limit dari tipe data integer. Dengan kata lain, menggunakan (int) berguna untuk memaksa variabel menggunakan tipe data integer agar output gaji bersih tidak muncul bilangan desimal.

3. 
```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();

if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);

} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Masukkan kategori: pebisnis
    Masukkan besarnya penghasilan: 2000000
    Gaji bersih yang Anda terima: 1700000


> Penjelasan : Kegunaan dari equalsIgnoreCase adalah mengidentifikasi nilai variabel kategori apakah sama dengan yang ada dalam parameter method tersbut tanpa melihat kapital atau besar kecilnya huruf tersebut.

4. 
```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();

if(kategori.equals ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);

} else if (kategori.equals ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Masukkan kategori: pebisnis
    Masukkan besarnya penghasilan: 2000000
    Gaji bersih yang Anda terima: 1700000

> Penjelasan : Fungsi perintah equals sebenarnya mirip dengan perintah equalsIgnoreCase. Namun, memiliki sedikit perbedaan yaitu pada perintah equals melihat kapital atau besar kecilnya huruf tersebut. Jadi, apabila terdapat perbedaan huruf kapital meskipun kata-katanya sama maka akan menghasilkan false.


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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
double bilanganPertama, bilanganKedua, hasil;
char operator;

System.out.print("Masukkan bilangan pertama: ");
bilanganPertama = input.nextDouble();
System.out.print("Masukkan operator (+, -, *, /): ");
operator = input.next().charAt(0);
System.out.print("Masukkan bilangan kedua: ");
bilanganKedua = input.nextDouble();

switch(operator){
    case '+':
    hasil = bilanganPertama + bilanganKedua;
    System.out.println(bilanganPertama + " " + operator + " " + bilanganKedua + " = " + hasil);
    break;
    case '-':
    hasil = bilanganPertama - bilanganKedua;
    System.out.println(bilanganPertama + " " + operator + " " + bilanganKedua + " = " + hasil);
    break;
    case '*':
    hasil = bilanganPertama * bilanganKedua;
    System.out.println(bilanganPertama + " " + operator + " " + bilanganKedua + " = " + hasil);
    break;
    case '/':
    hasil = bilanganPertama / bilanganKedua;
    System.out.println(bilanganPertama + " " + operator + " " + bilanganKedua + " = " + hasil);
}
```
    Masukkan bilangan pertama: 24
    Masukkan operator (+, -, *, /): *
    Masukkan bilangan kedua: 6
    24.0 * 6.0 = 144.0


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int sisiPertama, sisiKedua, sisiKetiga;

System.out.print("Masukkan nilai sisi pertama: ");
sisiPertama = input.nextInt();
System.out.print("Masukkan nilai sisi kedua: ");
sisiKedua = input.nextInt();
System.out.print("Masukkan nilai sisi ketiga: ");
sisiKetiga = input.nextInt();
System.out.print("Segitiga tersebut adalah ");

if(sisiPertama == sisiKedua && sisiKedua == sisiKetiga){
    System.out.print("segitiga sama sisi");
} else if (sisiPertama == sisiKedua || sisiPertama == sisiKetiga || sisiKedua == sisiKetiga){
    System.out.print("segitiga sama kaki");
} else if (sisiPertama != sisiKedua && sisiPertama != sisiKetiga && sisiKedua != sisiKetiga){
    System.out.print("segitiga sembarang");
}
```
    Masukkan nilai sisi pertama: 8
    Masukkan nilai sisi kedua: 15
    Masukkan nilai sisi ketiga: 17
    Segitiga tersebut adalah segitiga sembarang


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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String namaMakanan;
int hargaMakanan, biayaPengiriman, total;
byte ekspres;

System.out.print("Masukkan nama makanan\t: ");
namaMakanan = input.nextLine();
System.out.print("Masukkan harga makanan\t: ");
hargaMakanan = input.nextInt();

System.out.print("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? ");
ekspres = input.nextByte();
if(hargaMakanan < 100000){
    biayaPengiriman = 20000;
} else{
    biayaPengiriman = 30000;
}
if(ekspres == 1){
    biayaPengiriman += 25000;
} 

System.out.println("");
System.out.println("STRUK PEMBELIAN");
System.out.println(namaMakanan + "\t\tRp " + hargaMakanan);
System.out.println("Biaya pengiriman" + "\tRp " + biayaPengiriman);

total = hargaMakanan + biayaPengiriman;
System.out.println("TOTAL\t\t\t" + "Rp " + total);
```
    Masukkan nama makanan	: Ayam Bakar
    Masukkan harga makanan	: 25000
    Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 1

    STRUK PEMBELIAN
    Ayam Bakar		    Rp 25000
    Biaya pengiriman	Rp 45000
    TOTAL		    	Rp 70000


4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
byte umur;
int statusKerja, statusSekolah, pendapatan, tanggungan;

System.out.print("Masukkan Umur: ");
umur = input.nextByte();

if(umur < 18){
    System.out.print("Sekolah Atau Tidak (0 = Tidak, 1 = Ya): ");
    statusSekolah = input.nextInt(); 
{ if(statusSekolah == 0){
    System.out.println("Penduduk Miskin");
} else if(statusSekolah == 1){
    System.out.println("Bukan Penduduk Miskin");
} else{
    System.out.println("Tidak Valid!");
}
    }
} else{
    System.out.print("Bekerja Atau Tidak (0 = Tidak, 1 = Ya): ");
    statusKerja = input.nextInt(); 
    if(statusKerja == 0){
        System.out.println("Penduduk Miskin!");
    } else if(statusKerja == 1){
        System.out.print("Pendapatan: Rp ");
        pendapatan = input.nextInt();

        System.out.print("Tanggungan: ");
        tanggungan = input.nextInt();

    { if((pendapatan/tanggungan) < 300000){
        System.out.println("Penduduk Miskin");
    } else {
        System.out.println("Bukan Penduduk Miskin");
    }
        }
    } else {
        System.out.println("Tidak Valid!");
    }
}
```
    Masukkan Umur: 21
    Bekerja Atau Tidak (0 = Tidak, 1 = Ya): 1
    Pendapatan: Rp 1000000
    Tanggungan: 1
    Bukan Penduduk Miskin
