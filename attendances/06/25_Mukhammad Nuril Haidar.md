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
System.out.print("Masukkan nilai ujian (0-100) : ");
nilai = input.nextInt();
```

    Masukkan nilai ujian (0-100) : 105
    

3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
if (nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan Prestasi Anda");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Pertahankan Prestasi Anda");
    } else if (nilai > 50 && nilai <=59){
        System.out.println("Nilai D, Pertahankan Belajar Anda");
    } else {
        System.out.println("Nilai E, Anda Tidak Lulus");
    }
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid");
}
```

    Nilai E, Anda Tidak Lulus


> Penjelasan kode program percobaan 1

Kode tersebut digunakan untuk mengukur nilai siswa berdasarkan nilai menjadi abjad. Jika input nilai lebih dari 0 dan kurang dari sama dengan 100 maka proses akan dilanjutkan ke level 2. Jika tidak maka akan mengeluarkan output Nilai Tidak Valid.

Di level 2 nilai akan dicek memenuhi kondisi yang mana sehingga akan menghasilkan outputan yang sesuai

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

**NOMOR 1**


```Java
if (nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan Prestasi Anda");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Pertahankan Prestasi Anda");
    } else if (nilai > 50 && nilai <=59){
        System.out.println("Nilai D, Pertahankan Belajar Anda");
    } else {
        System.out.println("Nilai E, Anda Tidak Lulus");
    }
} else if(nilai < 0 ) {
    System.out.println("Nilai yang Anda masukkan kurang dari 0");
} else if(nilai > 100){
    System.out.println("Nilai yang Anda masukkan lebih dari 100");
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid");
}
```

    Nilai yang Anda masukkan kurang dari 0


**NOMOR 2**

Maksud dari if (nilai >= 0 && nilai <= 100)! adalah ketika kedua kondisi tersebut benar maka akan menghasilkan input an FALSE karena mengandung operator not dibelakangnya

**NOMOR 3**


```Java
if (nilai >= 0 || nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan Prestasi Anda");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Pertahankan Prestasi Anda");
    } else if (nilai > 50 && nilai <=59){
        System.out.println("Nilai D, Pertahankan Belajar Anda");
    } else {
        System.out.println("Nilai E, Anda Tidak Lulus");
    }
} else if(nilai < 0 ) {
    System.out.println("Nilai yang Anda masukkan kurang dari 0");
} else if(nilai > 100){
    System.out.println("Nilai yang Anda masukkan lebih dari 100");
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid");
}
```

    Nilai E, Anda Tidak Lulus


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

System.out.print("Masukkan kategori : ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan : ");
penghasilan = input.nextInt();
```

    Masukkan kategori : pekerja
    Masukkan besarnya penghasilan : 2048485
    

4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
if(kategori.equalsIgnoreCase("pekerja")){
    if(penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima : " + gajiBersih);
} else if (kategori.equalsIgnoreCase("pebisnis")){
    if(penghasilan <= 2500000){
        pajak = 0.15;
    } else if(penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima : " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah");
}
```

    Gaji bersih yang Anda terima : 1741212


5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2

Kode tersebut digunakan untuk mengukur gaji bersih dari penghasilan setelah dipotong pajak berdasarkan golongan pebisnis atau pekerja.

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

1. Karena variabel gajiBersih bertipe data integer
2. Fungsi (int) adalah untuk mengcasting atau merubah dari tipe data double ke integer
3. EqualsIgnoreCase digunakan untuk menghilangkan Case Sensitive terhadap String selama kata-katanya sama
4. Equals adalah kebalikan dari EqualsIgnoreCase yang digunakan untuk memberikan Case Sensitive pada string sehingga penamaan huruf kapital dan huruf kecil nya harus sama persis dan kata-katanya juga harus sama persis

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
Scanner scan = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;

System.out.print("Masukkan bilangan pertama \t: ");
angka1 = scan.nextDouble();
System.out.print("Masukkan operator (+, -, *, /) \t: ");
operator = scan.next().charAt(0);
System.out.print("Masukkan bilangan kedua \t: ");
angka2 = scan.nextDouble();

switch(operator){
    case '+':
    hasil = angka1 + angka2;
    System.out.print(angka1 + " + " + angka2 + " = " + hasil);
    break;
    case '-':
    hasil = angka1 - angka2;
    System.out.print(angka1 + " - " + angka2 + " = " + hasil);
    break;
    case '*':
    hasil = angka1 * angka2;
    System.out.print(angka1 + " * " + angka2 + " = " + hasil);
    break;
    case '/':
    hasil = angka1 / angka2;
    System.out.print(angka1 + " / " + angka2 + " = " + hasil);
    break;
    
    default:
    System.out.print("Operator Salah");
}
```

    Masukkan bilangan pertama 	: 12
    Masukkan operator (+, -, *, /) 	: +
    Masukkan bilangan kedua 	: 12
    12.0 + 12.0 = 24.0

**Penjelasan**

Kode tersebut adalah kalkulator yang menggunakan pemilihan jenis switch case yang mengandalkan operator sebagai syaratnya

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
double panjang1, panjang2, panjang3;

System.out.print("Masukkan panjang sisi pertama \t: ");
panjang1 = scan.nextDouble();
System.out.print("Masukkan panjang sisi kedua \t: ");
panjang2 = scan.nextDouble();
System.out.print("Masukkan panjang sisi ketiga \t: ");
panjang3 = scan.nextDouble();

if(panjang1 > 0 && panjang2 > 0 && panjang3 > 0){
    if((panjang1 == panjang2) && (panjang2 == panjang3)){
        System.out.print("Segitiga Sama Sisi");
    } else if ((panjang1 == panjang2) || (panjang1 == panjang3) || (panjang2 == panjang3)){
        System.out.print("Segitiga Sama Kaki");
    } else {
        System.out.print("Segitiga Sembarang");
    }
} else {
    System.out.print("Masukkan Bilangan dengan Jelas ");
}
```

    Masukkan panjang sisi pertama 	: 12
    Masukkan panjang sisi kedua 	: 12
    Masukkan panjang sisi ketiga 	: 12
    Segitiga Sama Sisi

**Penjelasan**

Kode tersebut digunakan untuk mengetahui jenis segitiga berdasarkan sisi, jika semua sisi sama maka akan mengeluarkan output segitiga sama sisi, jika ada dua sisi yang sama maka akan mengeluarkan output segitiga sama kaki, namun jika tidak ada yang sama maka akan mengeluarkan output segitiga sembarang

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
Scanner scan = new Scanner(System.in);
String makanan;
double harga, ongkir, total;
char pengiriman;

System.out.print("Masukkan nama makanan : ");
makanan = scan.nextLine();
System.out.print("Masukkan harga makanan : ");
harga = scan.nextDouble();
System.out.print("Pengiriman Express (y/n) : ");
pengiriman = scan.next().charAt(0);
System.out.println();

if(harga >= 100000){
    ongkir = 30000;
} else {
    ongkir = 20000;
}

if(pengiriman == 'y'){
    ongkir += 25000;
}

total = harga + ongkir;

System.out.println("----------------");
System.out.println("STRUK PEMBELIAN");
System.out.println("----------------");
System.out.println(makanan + "\t\t= Rp "+ harga);
System.out.println("Biaya Pengiriman \t= Rp " + ongkir);
System.out.println("Total \t\t\t= Rp " + total);
```

    Masukkan nama makanan : Tuna Salad
    Masukkan harga makanan : 115000
    Pengiriman Express (y/n) : n
    
    ----------------
    STRUK PEMBELIAN
    ----------------
    Tuna Salad		= Rp 115000.0
    Biaya Pengiriman 	= Rp 30000.0
    Total 			= Rp 145000.0
    

**Penjelasan**

Kode tersebut digunakan untuk menghitung ongkir dari makanan yang akan dibeli, jika makanan yang dibeli < 100000 maka ongkir adalah 200000 jika > 100000 maka ongkir adalah 30000, namun jika menambah pengiriman ekspress maka ongkir akan ditambah 25000

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
import java.util.Scanner;
Scanner scan = new Scanner(System.in);

double pendapatan, biayaHidup, tanggungan;
int umur;
char sekolah, kerja;
String  status;

System.out.print("Umur anda : ");
umur = scan.nextInt();

if(umur >= 18){
    System.out.print("Masih Bekerja (y/n) ? ");
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
    System.out.print("Masih Sekolah (y/n) ? ");
    sekolah = scan.next().charAt(0);
    if(sekolah == 'y'){
        status = "Bukan Penduduk Miskin";
    } else {
        status = "Penduduk Miskin";
    }
}

System.out.println(status);
```

    Umur anda : 18
    Masih Bekerja (y/n) ? y
    Pendapatan Perbulan : 1000000
    Jumlah Tanggungan : 2
    Bukan Penduduk Miskin
    

**Penjelasan**

Kode tersebut digunakan untuk menentukan status orang yang berdasar umur, pendidikan, dan pekerjaan. Jika umur < 17 tahun dan masih sekolah maka statusnya Bukan Penduduk Miskin, namun jika tidak sekolah maka statusnya adalah Penduduk Miskin. Jika umur > 17 tahun dan sudah bekerja, akan dihitung biaya hidup berdasarkan penghasilan dibagi dengan jumlah tanggungan. Jika biaya hidup kurang dari 300000 maka statusnya Penduduk Miskin, sebaliknya jika > 300000 statusnya adalah Bukan Penduduk Miskin. Kemudian jika tidak bekerja maka statusnya adalah Penduduk Miskin.
