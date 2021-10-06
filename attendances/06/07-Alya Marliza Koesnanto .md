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
System.out.print("Masukan nilai ujian (0-100): ");
nilai = input.nextInt();
```

    Masukan nilai ujian (0-100): 87


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
if(nilai >= 0 && nilai <=100){ 
    if(nilai >= 90 && nilai <= 100){ 
        System.out.println("Nilai A, EXCELLENT !");
    }else if (nilai >= 80 && nilai <= 89){ 
        System.out.println("Nilai B, Pertahankan prestasi Anda !");
    }else if (nilai >= 60 && nilai <= 69){ 
        System.out.println("Nilai C, Tingkatkan prestasi Anda !");
    }else if (nilai >= 50 && nilai <= 59){ 
        System.out.println("Nilai D, Tingkatkan prestasi Anda !");
    }else{
        System.out.println("Nilai E, Anda dinyatakan tidak lulus!");
    }
}else{
    System.out.println("Nilai yang anda masukkan tidak Valid!");
}
```

    Nilai B, Pertahankan prestasi Anda !


Dari pemograman diatas dapat dinyatakan bahwa kita memasukkan nilai sebesar 90 sampai dengan 100, maka akan keluar tampilan "Nilai A, EXCELLENT, apabila nilai dibawah 90 maka akan keluar tampilan yang sesuai dengan nilai yang telah dimasukkan.

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukan nilai ujian (0-100): ");
nilai = input.nextInt();

if(nilai >= 0 && nilai <= 100){ 
    if(nilai >= 90 && nilai <= 100){ 
        System.out.println("Nilai A, EXCELLENT !");
    }else if (nilai >= 80 && nilai <= 89){ 
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if (nilai >= 60 && nilai <= 69){ 
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if (nilai >= 50 && nilai <= 59){ 
        System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else{
        System.out.println("Nilai E, Anda dinyatakan tidak lulus!");
        }
}else if (nilai < 0){ 
        System.out.println("Nilai yang anda masukkan kurang dari 0!");
}else{
    System.out.println("Nilai yang anda masukkan lebih dari 100!");
}
```

    Masukan nilai ujian (0-100): -50
    Nilai yang anda masukkan kurang dari 0!


1. Untuk hasil pemrograman nomor 1 berada diatas. Jika kita memasukan nilai yang kurang dari 0 yaitu seperti -50, maka tampilan yang akan dikeluarkan adalah **"Nilai yang anda masukkan kurang dari 0!"**. Apabila kita memasukan nilai yang lebih dari 100 yaitu seperti 105, maka tampilan yang akan dikeluarkan adalah **"Nilai yang anda masukkan lebih dari 100!"**.

2. Fungsi dari nilai sintaks if dengan operator && menyatakan bahwa nilai yang diinput ke dalam pemrograman merupakan nilai yang berada diantara nilai 0 hingga 100.

3. Untuk hasil pemrograman nomor 3 berada dibawah. 


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukan nilai ujian (0-100): ");
nilai = input.nextInt();

if(nilai >= 0 || nilai <= 100){ 
    if(nilai >= 90 && nilai <= 100){ 
        System.out.println("Nilai A, EXCELLENT !");
    }else if (nilai >= 80 && nilai <= 89){ 
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if (nilai >= 60 && nilai <= 69){ 
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if (nilai >= 50 && nilai <= 59){ 
        System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else{
        System.out.println("Nilai E, Anda dinyatakan tidak lulus!");
        }
}else if (nilai < 0){ 
        System.out.println("Nilai yang anda masukan kurang dari 0!");
}else{
    System.out.println("Nilai yang anda masukkan lebih dari 100!");
}
```

    Masukan nilai ujian (0-100): 105
    Nilai E, Anda dinyatakan tidak lulus!


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
System.out.print("Masukkan besarnya Penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan kategori: Pekerja
    Masukkan besarnya Penghasilan: 2000000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
if(kategori.equalsIgnoreCase ("pekerja")){ 
    if(penghasilan <= 2000000){ 
        pajak = 0.1;
    } else if (penghasilan <= 3000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.2;
    }
    gajiBersih = (int)(penghasilan - (penghasilan * pajak));
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){ 
    if(penghasilan <= 2500000){ 
        pajak = 0.15;
    } else if (penghasilan <= 3500000){  
        pajak = 0.2;
    } else{  
        pajak = 0.25;
    }
    gajiBersih = (int)(penghasilan - (penghasilan * pajak));
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println ("Kategori yang anda masukkan salah");
}
```

    Gaji bersih yang Anda terima: 1800000


5. Jalankan program di atas. Amati apa yang terjadi!

Dari pemograman diatas dapat dinyatakan bahwa kita memasukkan kategori **Pekerja** lalu memasukkan penghasilannya sebesar 2000000, maka gaji bersih yang didapat ialah 180000, berkurangnya penghasilan awal menjadi gaji bersih disebabkan oleh operator **penghasilan * pajak** yang berarti penghasilan awal terpotong oleh pajak dan menjadi gaji bersih yang sesuai dengan tampilan yang dikeluarkan

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya Penghasilan: ");
penghasilan = input.nextInt();

if(kategori.equalsIgnoreCase ("pekerja")){ 
    if(penghasilan <= 2000000){ 
        pajak = 0.1;
    } else if (penghasilan <= 3000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.2;
    }
    gajiBersih = (int)(penghasilan - (penghasilan * pajak));
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){ 
    if(penghasilan <= 2500000){ 
        pajak = 0.15;
    } else if (penghasilan <= 3500000){  
        pajak = 0.2;
    } else{  
        pajak = 0.25;
    }
    gajiBersih = (int)(penghasilan - (penghasilan * pajak));
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println ("Kategori yang anda masukkan salah");
}
```

    Masukkan kategori: Pekerja
    Masukkan besarnya Penghasilan: 2048485
    Gaji bersih yang Anda terima: 1741212


1. Kenapa koma tidak ditampilkan pada tampilan akhir pemrograman diatas ? Karena tipe data yang digunakan pada pemrograman diatas adalah Interger. Tipe data Interger merupakan tipe data yang mengeluarkan/memunculkan bilangan bulat.

2. Fungsi (int) pada sintaks gajiBersih = (int) (penghasilan - (penghasilan * pajak)); adalah menandakan variabel yang digunakan pada sintaks tersebut adalah variabel yang menghasilkan bilangan bulat melalui tipe data (int) yang merupakan tipe data interger.

3. Kegunaan dari equalsIgnoreCase adalah membedakkan jumlah string yang tertera tanpa memandang besar kecilnya huruf yang berada pada string.

4. Yang akan muncul tetap sama seperti pemrograman di nomor 3, tetapi apabilah input yang dimasukan menggunakan perpaduan antara uppercase dan lowercase



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya Penghasilan: ");
penghasilan = input.nextInt();

if(kategori.equalsIgnoreCase ("pekerja")){ 
    if(penghasilan <= 2000000){ 
        pajak = 0.1;
    } else if (penghasilan <= 3000000){  
        pajak = 0.15;
    } else{  
        pajak = 0.2;
    }
    gajiBersih = (int)(penghasilan - (penghasilan * pajak));
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){ 
    if(penghasilan <= 2500000){ 
        pajak = 0.15;
    } else if (penghasilan <= 3500000){  
        pajak = 0.2;
    } else{  
        pajak = 0.25;
    }
    gajiBersih = (int)(penghasilan - (penghasilan * pajak));
    System.out.println ("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println ("Kategori yang anda masukkan salah");
}
```

    Masukkan kategori: Pebisnis
    Masukkan besarnya Penghasilan:  2000000
    Gaji bersih yang Anda terima: 1700000


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
Scanner sc = new Scanner(System.in);
double bil1, bil2, hasil;
char operator;

System.out.print("Masukkan bilangan pertama: ");
bil1 = sc.nextDouble();
System.out.print("Masukkan bilangan kedua: ");
bil2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);

switch (operator){
    case '+':
    hasil = bil1 + bil2;
    System.out.println(bil1 + " + " + bil2 + " = " + hasil);
    break;
    case '-':
    hasil = bil1 - bil2;
    System.out.println(bil1 + " - " + bil2 + " = " + hasil);
    break;
    case '*':
    hasil = bil1 * bil2;
    System.out.println(bil1 + " * " + bil2 + " = " + hasil);
    break;
    case '/':
    hasil = bil1 / bil2;
    System.out.println(bil1 + " / " + bil2 + " = " + hasil);
    break;
    default:
System.out.println("Operator yang Anda masukan salah");

}
```

    Masukkan bilangan pertama: 2.5
    Masukkan bilangan kedua: 7
    Masukkan operator (+ - * /): *
    2.5 * 7.0 = 17.5


Pemrograman diatas menggunakan sintaks pemilihan Switch Case. Alasannya adalah karena banyak operator yang menciptakan banyak kasus yang harus diselesaikan maka alangkah baiknya menggunakan sintaks **"Switch-Case"**.

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
double panjangA, panjangB, panjangC;
System.out.print("Masukkan Panjang A: ");
panjangA = input.nextDouble();
System.out.print("Masukkan Panjang B: ");
panjangB = input.nextDouble();
System.out.print("Masukkan Panjang C: ");
panjangC = input.nextDouble();

if (panjangA == panjangB && panjangB == panjangC && panjangC == panjangA){
    System.out.println("Segitiga sama sisi");
}else if (panjangA == panjangB || panjangB == panjangC || panjangC == panjangA){
    System.out.println("Segitiga sama kaki");
}else if (panjangA != panjangB && panjangB != panjangC && panjangC != panjangA){
    System.out.println("Segitiga sembarang");
}else{
       System.out.println("Panjang yang anda masukan salah!");
}
```

    Masukkan Panjang A: 30
    Masukkan Panjang B: 30
    Masukkan Panjang C: 10
    Segitiga sama kaki


Pada pemrograman diatas menggunakan sintaks if-else if dan operator relasi. 

Karena ada 3 tampilan yang diinginkan maka alangkah baiknya menggunakan if-else if untuk mengeluarkan tampilan dengan format hasil yang bernilai berbeda dan operator relasi yang akan memproses nilai boolean yang sudah diinput ke pemrograman diatas.

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
int pilihan;

System.out.print("Masukkan Nama Makanan: ");
namaMakanan = input.nextLine();
System.out.print("Masukkan harga Makanan: ");
hargaMakanan = input.nextInt();
System.out.print("Apakah anda ingin pengiriman ekspres ? (0 = tidak, 1 = ya): ");
pilihan = input.nextInt();

if (pilihan == 0){
    if (hargaMakanan < 100000){
        biayaPengiriman = 12500;
    }else if (hargaMakanan >= 100000){
        biayaPengiriman = 25000;
}
}else if (pilihan == 1){
    if (hargaMakanan < 100000){
        biayaPengiriman = 25000;
    }else if (hargaMakanan >= 100000){
        biayaPengiriman = 50000;
    }
}

total = hargaMakanan + biayaPengiriman;

System.out.println("STRUK PEMBELIAN");
System.out.println(namaMakanan + "\t\tRp" + hargaMakanan);
System.out.println("Biaya Pengiriman" + "\tRp" + biayaPengiriman);
System.out.println("TOTAL" + "\t\t\tRp" + total);
```

    Masukkan Nama Makanan: Bistik Sapi
    Masukkan harga Makanan: 106000
    Apakah anda ingin pengiriman ekspres ? (0 = tidak, 1 = ya): 1
    STRUK PEMBELIAN
    Bistik Sapi		Rp106000
    Biaya Pengiriman	Rp50000
    TOTAL			Rp156000


Pada pemrograman diatas menggunakan sintaks if-else if dan tipe data Interger. 

Karena ingin menampilkan sebuah struk, maka alangkah baiknya menggunakan sintaks if-else if untuk menghitung nilai yang akan ditampilkan, lalu jenis variabel nilai yang akan ditampilkan adalah bilangan bulat.

Maka dari itu tipe data yang digunakan adalah Interger.

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int statusKerja, statusSekolah;
int umur, jumlahGaji, jumlahTanggungan, biayaHidup;

System.out.print("Masukkan Umur Anda: ");
umur = input.nextInt();

if (umur >= 18){
    System.out.print("Apa status anda saat ini ? (1 = Bekerja, 0 = Belum bekerja): ");
    statusKerja = input.nextInt();
    if (statusKerja == 1){
        System.out.print("Masukkan Pendapatan Perbulan: ");
        jumlahGaji = input.nextInt();
        System.out.print("Masukkan Jumlah Tanggungan: ");
        jumlahTanggungan = input.nextInt();
        biayaHidup = jumlahGaji / jumlahTanggungan;
    if(biayaHidup < 300000){
        System.out.println("Penduduk Miskin");
    }else{
        System.out.println("Bukan Penduduk Miskin");
    }
    }else if (statusKerja == 1){
        System.out.println("Penduduk Miskin");
    }
}else{
    System.out.print("Apa status anda saat ini ? (Ya = Sekolah, Tidak = Belum Sekolah): ");
    statusSekolah = input.nextInt();
    if (statusSekolah == 1 ){
        System.out.print("Bukan Penduduk Miskin");
    }else if (statusSekolah == 0){
        System.out.print("Penduduk Miskin");
    }
}
```

    Masukkan Umur Anda: 18
    Apa status anda saat ini ? (1 = Bekerja, 0 = Belum bekerja): 1
    Masukkan Pendapatan Perbulan:  20000000
    Masukkan Jumlah Tanggungan: 3
    Bukan Penduduk Miskin

