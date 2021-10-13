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

    <!-- ![](images/03.png) -->

```Java
// Ketik kode di sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian(0-100): ");
nilai = input.nextInt();
```

    Masukkan nilai ujian(0-100): 105

3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    <!-- ![](images/04.png) -->


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    }else{
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else{
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai yang Anda masukkan tidak valid!


> Pada program diatas kita melakukan pemilihan untuk mengecek variabel `nilai`. Pada pemilihan level 1 yang ditandai dengan sintaks `if(nilai >= 0 && nilai <= 100)` akan dicek variabel `nilai` apakah nilainya lebih dari sama dengan 0 dan apakah variabel `nilai` kurang dari sama dengan 100 atau tidak. Bila kedua kondisi tersebut terpenuhi, maka sesuai dengan operator logikanya yaitu AND, nilai `if` tersebut bernilai benar dan dilanjut ke pemilihan level 2 di dalamnya, dan dicek satu persatu. Bila nilai diluar range dari pemilihan level 2, maka akan ditangkap dengan else terakhir dan menghasilkan output `"Nilai E, Anda tidak lulus!"`.

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


```Java
// Jawaban pertanyaan
```
Jawaban Nomor 1

```Java // Jawaban Nomor 1
// Jawaban Nomor 1
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    }else{
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else if(nilai < 0){
    System.out.println("Nilai yang Anda masukkan kurang dari 0");
}else{
    System.out.println("Nilai yang Anda masukkan lebih dari 100");
}
```

    Nilai yang Anda masukkan lebih dari 100


Jawaban Nomor 2 <br>
> Sintaks tersebut berfungsi untuk melakukan pemilihan level satu yang di dalamnya terdapat pengkondisian 2 perbandingan, melibatkan operator logika AND ditunjukkan oleh simbol `&&`. Pemilihan tersebut akan bernilai `true` jika kedua perbandingan di dalam sintaks `if` bernilai `true`. Jika variabel `nilai` bernilai lebih dari sama dengan 0 dan variabel `nilai` tersebut juga bernilai kurang dari sama dengan 100 maka sintaks `if` tersebut bernilai `true` dan akan menjalankan kode program di dalam scope sintaks `if` tersebut.


Jawaban Nomor 3

```Java
// Jawaban Nomor 3
if(nilai >= 0 || nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    }else{
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else if(nilai < 0){
    System.out.println("Nilai yang Anda masukkan kurang dari 0");
}else{
    System.out.println("Nilai yang Anda masukkan lebih dari 100");
}
```

    Nilai E, Anda tidak lulus!


> Menghasilkan output `"Nilai E, Anda tidak lulus!"` Hal ini dikarenakan memenuhi salah satu kondisi yaitu pada pemilihan level 1 variabel `nilai` lebih dari 0 dan menggunakan operator logika OR. Setelah itu dilanjut pada pemilihan level 2 didalamnya, nilai 105 tidak masuk ke dalam satupun kondisi yang ada sehingga harus ditangkap dengan else terakhir dan menghasilkan output `"Nilai E, Anda tidak lulus!"`.

#### Percobaan 2

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

<!-- ![](images/02.png) -->

> Flowchart tersebut digunakan untuk menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan. 

2. Tambahkan library Scanner dan deklarasi Scanner

3. Deklarasikan variabel kategori, penghasilan, gajiBersih, dan pajak

    <!-- ![](images/05.png) -->


```Java
// Ketik kode di sini
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
    Masukkan besarnya penghasilan: 3000000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    <!-- ![](images/06.png) -->


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase("pekerja")){
    if(penghasilan <= 2000000){
        pajak = 0.1;
    }else if(penghasilan <= 3000000){
        pajak = 0.15;
    }else{
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
}else if(kategori.equalsIgnoreCase("pebisnis")){
    if(penghasilan <= 2500000){
        pajak = 0.15;
    }else if(penghasilan <= 3500000){
        pajak = 0.2;
    }else{
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
}else{
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Gaji bersih yang Anda terima: 2550000


5. Jalankan program di atas. Amati apa yang terjadi!

> Pada program diatas awalnya kita meminta inputan dari user dan menyimpannya dalam variabel `kategori` dan `penghasilan`. Setelah itu kita melakukan pemilihan dengan menggunakan sintaks `equalsIgnoreCase` yang berfungsi untuk membandingkan nilai variabel `kategori` dengan yang ada pada parameter method `equalsIgnoreCase`. Perbandingan tersebut mengabaikan huruf kapital. Setelah itu di dalam if tersebut dilakukan pemilihan level 2. Bila isi dari variabel `kategori` tidak ada yang sama, maka akan dilanjut kode program di dalam `else`. Gaji bersih yang didapat merupakan hasil dari penghasilan awal dikurangi dengan besaran pajak dikali penghasilan yang kemudian di casting ke integer.

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
```

Jawaban Nomor 1
> Karena gaji bersih memiliki tipe data Integer dan juga pada kode program terdapat casting yang melakukan casting menuju tipe data Integer.

Jawaban Nomor 2
> Sintaks `equalsIgnoreCase` berfungsi untuk melakukan perbandingan antara sebuah variabel dengan parameter method `equalsIgnoreCase` tanpa melihat huruf kapitalnya. Contohnya adalah jika membandingkan String `"Biru"` dengan `"biru"` menggunakan method `equalsIgnoreCase` akan menghasilkan nilai `true`.

Jawaban Nomor 3
> Sintaks `equalsIgnoreCase` berfungsi untuk melakukan perbandingan antara sebuah variabel dengan parameter method `equalsIgnoreCase` tanpa melihat huruf kapitalnya. Contohnya adalah jika membandingkan String `"Biru"` dengan `"biru"` menggunakan method `equalsIgnoreCase` akan menghasilkan nilai `true`.

Jawaban Nomor 4
```Java
// Jawaban Nomor 4
if(kategori.equals("pekerja")){
    if(penghasilan <= 2000000){
        pajak = 0.1;
    }else if(penghasilan <= 3000000){
        pajak = 0.15;
    }else{
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
}else if(kategori.equals("pebisnis")){
    if(penghasilan <= 2500000){
        pajak = 0.15;
    }else if(penghasilan <= 3500000){
        pajak = 0.2;
    }else{
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
}else{
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Gaji bersih yang Anda terima: 2550000

> Hasil yang ditampilkan sama saja karena pada dasarnya `equals` sama dengan `equalsIgnoreCase` hanya saja `equals` itu case sensitive sehingga perbedaan huruf kapital akan mempengaruhi hasilnya. Contohnya jika kita membandingkan `"Biru"` dengan `"biru"` hasilnya akan salah karena meskipun kata tersebut sama namun terdapat perbedaan huruf kapital. Pada kode diatas, `"pekerja"` dibandingkan dengan `"pekerja"` sehingga hasilnya sama saja yaitu bernilai `true` dan kode program di dalam `if` akan dijalankan.

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
Scanner input = new Scanner(System.in);

float bil1, bil2;
String operator;

System.out.print("Masukkan bilangan pertama: ");
bil1 = input.nextFloat();
input.nextLine();
System.out.print("Masukkan operator (+, -, *, /): ");
operator = input.nextLine();
System.out.print("Masukkan bilangan kedua: ");
bil2 = input.nextFloat();

switch(operator.charAt(0)){
    case '+': 
        System.out.println(bil1 + " " + operator + " " + bil2 + " = " + (bil1+bil2));
        break;
    case '-': 
        System.out.println(bil1 + " " + operator + " " + bil2 + " = " + (bil1-bil2));
        break;
    case '*': 
        System.out.println(bil1 + " " + operator + " " + bil2 + " = " + (bil1*bil2));
        break;
    case '/': 
        System.out.println(bil1 + " " + operator + " " + bil2 + " = " + (bil1/bil2));
        break;
    default:
        System.out.println("Maaf, operator yang anda masukkan salah");
}
```

    Masukkan bilangan pertama: 2.5
    Masukkan operator (+, -, *, /): *
    Masukkan bilangan kedua: 4
    2.5 * 4.0 = 10.0

> Pada kode diatas saya menggunakan `switch case` untuk melakukan pemilihan pada variabel `operator`. Lalu saya menambahkan sintaks `input.nextLine();` setelah `input.nextInt();` untuk mengatasi error, karena bila tidak ditambahkan ketika user memencet `enter` maka enter itulah yang akan masuk ke dalam `input.nextLine();` dibawah yang seharusnya digunakan untuk menyimpan nilai ke variabel `operator`.

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);

float sisi1, sisi2, sisi3;

System.out.print("Masukkan sisi pertama: ");
sisi1 = input.nextFloat();
System.out.print("Masukkan sisi kedua: ");
sisi2 = input.nextFloat();
System.out.print("Masukkan sisi ketiga: ");
sisi3 = input.nextFloat();

if(sisi1 == sisi2 && sisi1 == sisi3 && sisi2 == sisi3){
    System.out.println("Segitiga ini merupakan segitiga sama sisi");
}else if(sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3){
    System.out.println("Segitiga ini merupakan segitiga sama kaki");
}else{
    System.out.println("Segitiga ini merupakan segitiga sembarang");
}
```

    Masukkan sisi pertama: 1
    Masukkan sisi kedua: 2
    Masukkan sisi ketiga: 2
    Segitiga ini merupakan segitiga sama kaki

> Pada kode diatas saya memanfaatkan operator logika AND dan OR untuk melakukan pemilihan. Pemanfaatan operator logika AND ketika ketiga sisi sama jika `sisi1` dan `sisi2` sama, lalu `sisi1` dan `sisi3` sama, serta `sisi2` dan `sisi3` sama sehingga akan menghasilkan output bahwa segitiga tersebut merupakan segitiga sama sisi. Lalu pemanfaatan operator logika OR ketika terdapat 2 sisi yang sama maka akan memenuhi kriteria bahwa segitiga tersebut merupakan segitia sama kaki. Bila tidak ada yang sama maka termasuk segitiga sembarang.

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
Scanner input = new Scanner(System.in);

String namaMakanan;
int hargaMakanan, total, biayaKirim, isEkspres;

System.out.print("Masukkan nama makanan: ");
namaMakanan = input.nextLine();
System.out.print("Masukkan harga makanan: ");
hargaMakanan = input.nextInt();
System.out.print("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? ");
isEkspres = input.nextInt();

if(hargaMakanan < 100000){
    biayaKirim = 20000;
}else{
    biayaKirim = 30000;
}
if(isEkspres == 1){
    biayaKirim+=25000;
}

total = hargaMakanan + biayaKirim;

System.out.println("\nSTRUK PEMBELIAN");
System.out.println(namaMakanan+"\t\tRp " + hargaMakanan);
System.out.println("Biaya pengiriman\tRp " + biayaKirim);
System.out.println("TOTAL\t\t\tRp " + total);
```

    Masukkan nama makanan: Tonkotsu Ramen
    Masukkan harga makanan: 100000
    Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 1
    
    STRUK PEMBELIAN
    Tonkotsu Ramen		Rp 100000
    Biaya pengiriman	Rp 55000
    TOTAL			    Rp 155000

> Pada program diatas saya tidak menggunakan nested if karena menurut saya lebih cepat jika dilakukan pengecekan apakah pengiriman ekspres atau tidak di akhir, karena pada dasarnya pengiriman ekspres hanya menambahkan 25000 dari biaya standard yang ada.

4. Perhatikan flowchart berikut ini!

<!-- ![](images/01.png) -->

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
    
int umur, pendapatan, tanggungan, biayaHidup;
String status;

System.out.println("Masukkan umur anda: ");
umur = input.nextInt();
input.nextLine();

if(umur >= 18){
    System.out.println("Masukkan Status Bekerja (Sudah Bekerja / Tidak Bekerja): ");
    status = input.nextLine();
    if(status.equalsIgnoreCase("Sudah Bekerja")){
        System.out.println("Masukkan pendapatan perbulan: ");
        pendapatan = input.nextInt();
        System.out.println("Masukkan jumlah tanggungan: ");
        tanggungan = input.nextInt();
        
        biayaHidup = pendapatan/tanggungan;
        
        if(biayaHidup<300000){
            System.out.println("Penduduk Miskin");
        }else{
            System.out.println("Bukan Penduduk Miskin");
        }
    }else if(status.equalsIgnoreCase("Tidak Bekerja")){
        System.out.println("Penduduk Miskin");
    }else{
        System.out.println("Maaf inputan yang anda masukkan salah");
    }
}else{
    System.out.println("Masukkan Status Bekerja (Masih Sekolah / Tidak Sekolah): ");
    status = input.nextLine();
    if(status.equalsIgnoreCase("Masih Sekolah")){
        System.out.println("Bukan Penduduk Miskin");
    }else if(status.equalsIgnoreCase("TIdak Sekolah")){
        System.out.println("Penduduk Miskin");
    }else{
        System.out.println("Maaf inputan yang anda masukkan salah");
    }
}
```

    Masukkan umur anda: 
    18
    Masukkan Status Bekerja (Sudah Bekerja / Tidak Bekerja): 
    Sudah Bekerja
    Masukkan pendapatan perbulan: 
    5000000
    Masukkan jumlah tanggungan: 
    3
    Bukan Penduduk Miskin

> Pada program diatas user diminta inputan umur yang akan menentukan apakah user masuk kategori bekerja atau sekolah. Setelah itu dilakukan pemilihan, bila variabel `umur` lebih dari sama dengan 18 maka akan dilanjut dengan apakah `status` user sudah bekerja atau tidak bekerja. bila `umur` kurang dari sama dengan 18 maka apakah `status` user masih sekolah atau tidak sekolah. Setelah itu bila `status` nya adalah "Sudah Bekerja" maka akan dihitung `biayaHidup` nya, jika lebih dari sama dengan 300000 maka akan menghasilkan output `"Bukan Penduduk Miskin"`. Ini merupakan contoh penerapan nested if untuk menentukan apakah user merupakan Penduduk miskin atau Bukan.

```Java

```
