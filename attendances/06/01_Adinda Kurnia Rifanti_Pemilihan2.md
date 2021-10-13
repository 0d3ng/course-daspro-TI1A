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

    Masukkan nilai ujian (0-100): 89


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
if (nilai >= 0 && nilai <= 100){
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

    Nilai B, Pertahankan prestasi Anda!


Menggunakan scanner untuk menginput nilai dan untuk memunculkan keterangan yang didapat dengan nilai yang diinput. Pengecekan dilakukan dalam kondisi bersarang. pada level 1 (baris pertama) dimasukkan syarat atau keterangan pada variabel nilai yaitu angka yang dimasukkan berkisar 0 sampai 100. Pada level 2 (baris 2) itu dimasukkan jika nilai 90 sampai 100, maka keterangan yang muncul adalah "Nilai A, EXCELLENT!" dan selanjutnya menggunakan else if / if untuk kondisi yang lain. Sistem akan melakukan pengecekan pada input nilai yang dimasukkan. Pada contoh diatas, saya menginput nilai 89 yang setelah di run maka muncul keterangan "Nilai B, Pertahankan prestasi Anda!"

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in); 
int nilai; 
System.out.print("Masukkan nilai ujian (0-100): "); 
nilai = input.nextInt();

if (nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!"); 
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!"); 
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!"); 
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!"); 
    } else if (nilai >= 1 && nilai <= 49){
        System.out.println("Nilai E, Anda tidak lulus!"); 
    }
} else if (nilai < 0){
    System.out.println("Nilai yang Anda masukkan kurang dari 0!"); 
}else {
    System.out.println("Nilai yang Anda masukkan lebih dari 0!"); 
}
```

    Masukkan nilai ujian (0-100): 159
    Nilai yang Anda masukkan lebih dari 0!


2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

pada variabel nilai akan memunculkan ("Masukkan nilai ujian (0-100): ");
Sintak if berfungsi untuk menyatakan suatu kondisi yaitu (nilai >= 0 && nilai <= 100). 

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in); 
int nilai; 
System.out.print("Masukkan nilai ujian (0-100): "); 
nilai = input.nextInt(); 
```

    Masukkan nilai ujian (0-100): 105



```Java
if (nilai >= 0 || nilai <= 100){
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

    Nilai E, Anda tidak lulus!


Ketika operator diganti menjadi || maka ketika dimasukkan nilai 105, yang muncul adalah "Nilai E, Anda Tidak lulus". Begitupun dengan memasukkan angka -20 akan terdetect sistem "Nilai E, Anda Tidak lulus". Hal ini dikarenakan operator || memiliki arti  kondisi akan terpenuhi bila salah satu sisi ada yang bernilai benar, tidak perlu kedua sisi bernilai benar.

Berdasarkan percobaan jika menggunakan operator || maka else pada baris terakhir tidak dijalankan. 
Sebelumnya menggunakan operator && maka jika dimasukkan nilai 105, akan muncul "nilai yang anda masukkan tidak valid". jika memasukkan nilai -30 maka akan muncul "nilai yang anda masukkan tidak valid" atau artinya kondisi else pada baris terakhir dijalankan. Hal ini dikarenakan operator && memiliki arti kondisi akan terpenuhi bila kedua sisi bernilai benar, bila salah satu saja salah maka kondisi tersebut akan bernilai salah.

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

    Masukkan kategori: pekerja
    Masukkan besarnya penghasilan: 1500000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1; 
    } else if (penghasilan <= 3000000){
        pajak = 0.15; 
    }else {
        pajak = 0.2; 
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak)); 
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih); 
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){
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

    Gaji bersih yang Anda terima: 1350000


5. Jalankan program di atas. Amati apa yang terjadi!

Menggunakan scanner untuk menginput kategori, besar penghasilan untuk dihasilkan besar penghasilan setelah dikurangi oleh pajak. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan. karena ada 2 kategori yaitu pekerja dan pebisnis maka, pada pekerja meliputi (besar penghasilan, dan pajak penghasilan). sama halnya dengan kondisi 2, pada pebisnis. Kemudian diperoleh gaji bersih yang didapat dari (penghasilan - (penghasilan * pajak). 

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?


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

    Masukkan kategori: pekerja
    Masukkan besarnya penghasilan: 2048485



```Java
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1; 
    } else if (penghasilan <= 3000000){
        pajak = 0.15; 
    }else {
        pajak = 0.2; 
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak)); 
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih); 
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){
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

    Gaji bersih yang Anda terima: 1741212


 Angka di belakang koma tidak ditampilkan karena, gaji Bersih tipe datanya integer.

2. Jelaskan fungsi dari (int) pada sintaks:
 gajiBersih = (int) (penghasilan - (penghasilan * pajak)); 

karena pada kode diatas menggunakan tipe data double pada pajak, jadi untuk mengubah tipe data double ke int harus pakai (int). 

3. Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?


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
    Masukkan besarnya penghasilan: 2000000



```Java
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1; 
    } else if (penghasilan <= 3000000){
        pajak = 0.15; 
    }else {
        pajak = 0.2; 
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak)); 
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih); 
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){
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

    Gaji bersih yang Anda terima: 1700000


Kegunaan dari equalsIgnoreCase adalah untuk membandingkan string (kategori)
jika equalsIgnoreCase tidak memperhatikan besar kecilnya huruf

4. Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?


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
    Masukkan besarnya penghasilan: 2000000



```Java
if(kategori.equals ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1; 
    } else if (penghasilan <= 3000000){
        pajak = 0.15; 
    }else {
        pajak = 0.2; 
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak)); 
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih); 
    
} else if(kategori.equals ("pebisnis")){
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

    Gaji bersih yang Anda terima: 1700000


Hasilnya sama dengan penggunaan equalsIgnoreCase, karena penulisan kategori pebisnis sama tidak ada perbedaan huruf jadi hasilnya sama. 
Jika dimasukkan kategori "Pebisnis" maka hasil menggunakan equals adalah maka akan muncul "Kategori yang Anda Masukkan salah" karena equals memperhatikan besar kecilnya huruf. 

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
double x, y, hasil;
char operator;
System.out.print("Masukkan bilangan pertama: ");
x = input.nextDouble();
System.out.print("Masukkan operator (+, -, *, /): ");
operator = input.next().charAt(0);
System.out.print("Masukkan bilangan kedua: ");
y = input.nextDouble();

switch(operator) {
 case '+':
 hasil = x + y;
 break;
 case '-':
 hasil = x - y;
 break;
 case '*':
 hasil = x * y;
 break;
 case '/':
 hasil = x / y;
 break;
 default:
 System.out.println("Operator yang Anda masukkan salah!");
 break;
 }

 System.out.println("Hasil: " + hasil);

```

    Masukkan bilangan pertama: 5
    Masukkan operator (+, -, *, /): *
    Masukkan bilangan kedua: 9
    Hasil: 45.0


Kode program diatas menggunakan switch-case, untuk mengoperasikan bilangan. Dengan memasukkan bilangan pertama, operator, dan bilangan kedua. Kemudian akan muncul hasil dari operasi bilangan tersebut. 

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
    int sisiA, sisiB, sisiC;
    System.out.println("Masukkan sisi A :");
    sisiA = input.nextInt();
    System.out.println("Masukkan sisi B :");
    sisiB = input.nextInt();
    System.out.println("Masukkan sisi C :");
    sisiC = input.nextInt();

if (sisiA == sisiB && sisiB == sisiC) {
 System.out.println("Jenis segitiga\t: Segitiga sama sisi ");
}else if ((sisiA == sisiB) || (sisiA == sisiC) || (sisiC == sisiB)){
 System.out.println("Jenis segitiga\t: Segitiga sama kaki ");
}else {
 System.out.println("Jenis segitiga\t: Segitiga sembarang ");
}
```

    Masukkan sisi A :
    9
    Masukkan sisi B :
    5
    Masukkan sisi C :
    9
    Jenis segitiga	: Segitiga sama kaki 


Menggunakan scanner untuk menginput sisi-sisi pada segitiga. Untuk kemudian, dapat menentukan jenis segitiga. 
Jika nilai ketiga sisi yang diinput sama maka jenis segitiga yang muncul adalah segitiga sama sisi
Jika nilai kedua sisi yang diinput sama maka jenis segitiga yang muncul adalah segitiga sama sisi
Jika nilai ketiga sisi tidak ada yang sama maka jenis segitiga yang muncul adalah segitiga sama sembarang. 

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
int hargaMakanan, jenisPengiriman;  
int biayaKirim = 0;
  
System.out.print("Masukkan nama makanan: ");
namaMakanan = input.nextLine();
System.out.print("Masukkan harga makanan: Rp ");
hargaMakanan = input.nextInt();
System.out.print("Apakah Anda ingin pengiriman express? (0 = tidak, 1 = ya) ");
jenisPengiriman = input.nextInt();

if(hargaMakanan < 100000) {
    biayaKirim = 20000;
} else {
    biayaKirim = 30000;
}
if(jenisPengiriman == 1) {
  biayaKirim += 25000;

}

System.out.println("STRUK PEMBELIAN");
System.out.println(namaMakanan + "\t\t Rp " + hargaMakanan);
System.out.println("Biaya pengiriman\t Rp " + biayaKirim);
System.out.println("Total\t\t\t Rp " + (hargaMakanan + biayaKirim));
```

    Masukkan nama makanan: Tuna Salad
    Masukkan harga makanan: Rp 95000
    Apakah Anda ingin pengiriman express? (0 = tidak, 1 = ya) 1
    STRUK PEMBELIAN
    Tuna Salad		 Rp 95000
    Biaya pengiriman	 Rp 45000
    Total			 Rp 140000


Kode program diatas dibuat untuk menampilkan struk yang berisi nama makanan yang dibeli + harga, biaya pengiriman, dan total yang harus dibayar. 

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in); 
int umur,statusKerja, statusSekolah, pendapatan, tanggungan;

System.out.println("Masukkan Umur: ");
umur = input.nextInt();
if (umur < 18){
    System.out.println("Sekolah Atau Tidak (0 = Tidak, 1 = Ya): ");
statusSekolah = input.nextInt(); 

{if (statusSekolah == 0){
    System.out.println("Kategori: Penduduk Miskin");
} else if (statusSekolah == 1){
    System.out.println("Kategori: Bukan Penduduk Miskin");
} else {
    System.out.println("Cek ulang!");
}
}
} else {
    System.out.println("Bekerja Atau Tidak (0 = Tidak, 1 = Ya): ");
    statusKerja = input.nextInt(); 
    if (statusKerja == 0){
        System.out.println("Kategori: Penduduk Miskin!");
    } else if (statusKerja == 1){
        System.out.println("Pendapatan: ");
        pendapatan = input.nextInt(); 
        System.out.println("Tanggungan: ");
        tanggungan = input.nextInt(); 
        {if ((pendapatan/tanggungan) < 300000){
            System.out.println("Kategori: Penduduk Miskin");
        } else {
            System.out.println("Kategori: Bukan Penduduk Miskin");
        }
         }
    } else {
        System.out.println("Cek ulang!");
    }
}
```

    Masukkan Umur: 
    22
    Bekerja Atau Tidak (0 = Tidak, 1 = Ya): 
    1
    Pendapatan: 
    750000
    Tanggungan: 
    2
    Kategori: Bukan Penduduk Miskin


Menggunakan scanner untuk input umur,statusKerja, statusSekolah, pendapatan, tanggungan. Untuk menentukan kategori yang diberikan kepada orang denan umur yang diinput. 
