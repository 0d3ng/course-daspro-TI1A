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
System.out.println("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
```

    Masukkan nilai ujian (0-100): 
    70


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <= 100){
    if(nilai >=90 && nilai <= 100){
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
    System.out.println("Nilai yang anda masukkan tidak valid!");
}
```

    Nilai C, Tingkatkan prestasi Anda!


> Penjelasan kode program percobaan 1

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


```Java
// Jawaban pertanyaan no 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.println("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
if(nilai >= 0 && nilai <= 100){
    if(nilai >=90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else if(nilai <= 0){
        System.out.println("Nilai yang Anda masukkan kurang dari 0!");  
    } else if (nilai >= 100){
        System.out.println("Nilai yang Anda masukkan lebih dari 100 !");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    System.out.println("Nilai yang anda masukkan kurang dari 0 !");
}
  
```

    Masukkan nilai ujian (0-100): 
    -20
    Nilai yang anda masukkan kurang dari 0 !


jawaban pertanyaan no 2 fungsi dari sintaks if (nilai >= 0 && nilai <= 100)! adalah untuk memasukkan input yang akan dieksekusi berupa operator and dan untuk mencari output nya.


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.println("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
if(nilai >= 0 || nilai <= 100){
        System.out.println("Nilai yang Anda masukkan lebih dari 100!");  
}
```

    Masukkan nilai ujian (0-100): 
    105
    Nilai yang Anda masukkan lebih dari 100!


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
int penghasilan, gajiBersih;
double pajak = 0;

System.out.println("Masukkan kategori: ");
kategori = input.nextLine();
System.out.println("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan kategori: 
    pekerja
    Masukkan besarnya penghasilan: 
    2000000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
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
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Gaji bersih yang Anda terima: 1800000


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
// Jawaban pertanyaan no 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.println("Masukkan kategori: ");
kategori = input.nextLine();
System.out.println("Masukkan besarnya penghasilan: ");
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
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Masukkan kategori: 
    pekerja
    Masukkan besarnya penghasilan: 
    2048485
    Gaji bersih yang Anda terima: 1741212


angka koma dibelakang tidak ditampilkan karena disini untuk keterangan angka nya adalah dalam nominal harga dan karena angka tersebut dibulatkan

Jawaban pertanyaan no 2

fungsi (int) pada sintaks: gajiBersih = (int) (penghasilan - (penghasilan * pajak)); adalah untuk melakukan eksekusi perhitungan gaji bersih antara penghasilan dengan pajak nya


```Java
// Jawaban no 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.println("Masukkan kategori: ");
kategori = input.nextLine();
System.out.println("Masukkan besarnya penghasilan: ");
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
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Masukkan kategori: 
    pebisnis
    Masukkan besarnya penghasilan: 
    2000000
    Gaji bersih yang Anda terima: 1700000


fungsi equalIgnorecase adalah objek string yang bersangkutan akan dibandingkan dengan objek string dengan tanpa memperdulikan perbedaan antara huruf besar dengan huruf kecil.


```Java
// Jawaban pertanyaan no 4
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;


System.out.println("Masukkan kategori: ");
kategori = input.nextLine();
System.out.println("Masukkan besarnya penghasilan: ");
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
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Masukkan kategori: 
    pebisnis
    Masukkan besarnya penghasilan: 
    2000000
    Gaji bersih yang Anda terima: 1700000


fungsi equals adalah objek string yang bersangkutan akan dibandingkan dengan objek string dengan membedakan antara huruf besar dengan huruf kecil.

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
double bilangan1, bilangan2, hasil;
char operator;

System.out.println("Masukkan bilangann pertama: ");
bilangan1 = sc.nextDouble();
System.out.println("Masukkan bilangan kedua: ");
bilangan2 = sc.nextDouble();
System.out.println("Masukkan operator (+, -, *, /): ");
operator = sc.next().charAt(0);

switch(operator){
    case '+':
    hasil = bilangan1 + bilangan2;
    System.out.println(bilangan1 + " + " + bilangan2 + " = " + hasil);
    break;
    case '-':
    hasil = bilangan1 - bilangan2;
    System.out.println(bilangan1 + " - " + bilangan2 + " = " + hasil);
    break;
    case '*':
    hasil = bilangan1 * bilangan2;
    System.out.println(bilangan1 + " * " + bilangan2 + " = " + hasil);
    break;
    case '/':
    hasil = bilangan1 / bilangan2;
    System.out.println(bilangan1 + "/" + bilangan2 + " = " + hasil);
    default:
    System.out.println("Operator yang Anda masukkan salah");
}

```

    Masukkan bilangann pertama: 
    2.5
    Masukkan bilangan kedua: 
    4
    Masukkan operator (+, -, *, /): 
    *
    2.5 * 4.0 = 10.0


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.print("Masukan bilangan A: ");
    a = input.nextInt();
    System.out.print("Masukan bilangan B:");
    b = input.nextInt();
    System.out.print("Masukan bilangan C:");
    c = input.nextInt();

        if(a == b && b!=c && a!=c || b==c && b!=a && a!=c || a==c && b!=a && b!=c) {
        System.out.print("maka hasilnya : segitiga sama kaki"); 
        } else if(a == b || a==c || b ==c){
        System.out.print("maka hasilnya : segitiga sama sisi");
        } else { 
        System.out.print("maka hasilnya : segitiga sembarang");
    }
```

    Masukan bilangan A: 3
    Masukan bilangan B:4
    Masukan bilangan C:5
    maka hasilnya : segitiga sembarang

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
    String makanan, pengiriman;
    int harga, biayapengiriman = 0, totalpengiriman = 0, totalpembayaran;

    System.out.println("Masukan nama makanan: ");
    makanan = input.nextLine();
    System.out.println("Masukan harga makanan pertama :");
    harga = input.nextInt();
    input.nextLine();
    System.out.println("Tentukan memilih pengiriman ekspres atau tidak (y/n) :");
    pengiriman = input.nextLine();
    
        if(harga < 100000 && pengiriman.equalsIgnoreCase ("y")){
        biayapengiriman = 20000;
        totalpengiriman = biayapengiriman + 25000;
        } else if(harga < 100000 && pengiriman.equalsIgnoreCase ("n")){
        biayapengiriman = 20000;
        } else if(harga >= 100000 && pengiriman.equalsIgnoreCase ("y")){
        biayapengiriman = 30000;
        totalpengiriman = biayapengiriman + 25000;
        } else if(harga >= 100000 && pengiriman.equalsIgnoreCase ("n")){
        biayapengiriman = 30000;
        }else {
        System.out.println("Kata yang anda masukan salah");
        }
            
            totalpembayaran = harga + totalpengiriman;
            System.out.println("STRUK PEMBELIAN");
            System.out.println(makanan + " Rp " + harga);
            System.out.println("Biaya Pengiriman Rp " + totalpengiriman);
            System.out.println("Total Rp " + totalpembayaran);
```

    Masukan nama makanan: 
    spageti
    Masukan harga makanan pertama :
    120000
    Tentukan memilih pengiriman ekspres atau tidak (y/n) :
    y
    STRUK PEMBELIAN
    spageti Rp 120000
    Biaya Pengiriman Rp 55000
    Total Rp 175000


4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int umur, statusBekerja, statusSekolah, pendapatan, tanggungan;
int status1;
int status2;
int sekolah;
int bekerja;

    System.out.println("Masukan umur anda ");
    umur = input.nextInt();
if(umur >= 18){
    System.out.println("Sekolah Atau Tidak (0 = Tidak, 1 = Ya): ");
    statusSekolah = input.nextInt();
}
    if (statusSekolah == 0){
        System.out.println("Hasil: Penduduk Miskin");
    } else if (statusSekolah == 1){
        System.out.println("Hasil: Bukan Penduduk Miskin");
    } else {
    System.out.println("Data yang anda masukan salah");
    }
    
        System.out.println("Bekerja Atau Tidak (0 = Tidak, 1 = Ya: ");
        statusBekerja = input.nextInt();
    if (statusBekerja == 0){
        System.out.println("Hasil: Penduduk Miskin!");
    } else if (statusBekerja == 1){
        System.out.println("Pendapatan: Rp ");
        pendapatan = input.nextInt();
        System.out.println("Tanggungan: Rp ");
        tanggungan = input.nextInt();
        if ((pendapatan/tanggungan) < 300000){
            System.out.println("Hasil: Penduduk Miskin");
        } else {
            System.out.println("Hasil: Bukan Penduduk Miskin");
        }
         }
    
        
            
```

    Masukan umur anda 
    19
    Sekolah Atau Tidak (0 = Tidak, 1 = Ya): 
    1
    Hasil: Bukan Penduduk Miskin
    Bekerja Atau Tidak (0 = Tidak, 1 = Ya: 
    1
    Pendapatan: Rp 
    500000
    Tanggungan: Rp 
    100000
    Hasil: Penduduk Miskin



```Java

```
