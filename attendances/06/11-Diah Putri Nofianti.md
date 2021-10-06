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

    Masukkan nilai ujian (0-100): 95


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
if(nilai >=0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <=89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
    
} else {
        System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai A, EXCELLENT!


*Jika inputan nilai yang dimasukkan berada diantara 90 sampai 100, maka output akan menampilkan nilai A,
Jika berada diantara 80 sampai 89, maka output akan menampilkan nilai B,
Jika berada diantara 60 sampai 79, maka output akan menampilkan nilai C,
Jika berada diantara 50 sampai 59, maka output akan menampilkan nilai D,
Lalu jika nilai tidak termasuk antara 50 sampai 100, yakni 0 sampai 49, maka output akan menampilkan nilai E,
Kemudian jika menginputkan nilai yang tidak termasuk dalam 0 sampai 100, misal bilangan negatif atau 101 lebih, maka output akan menampilkan nilai tidak valid.*

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

**if (nilai >= 0 && nilai <= 100)**    *nilai tersebut harus berada di antara 0 sampai 100, (lebih dari sama dengan 0 dan kurang dari sama dengan 100) baru bernilai benar, selain angka di range tersebut maka akan bernilai salah, misal bilangan negatif atau angka 101 dst*


```Java
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();

if(nilai < 0){ // no.1
        System.out.println("Nilai yang Anda masukkan kurang dari 0!");
} else if (nilai > 100){
        System.out.println("Nilai yang Anda masukkan lebih dari 100!");
}

if(nilai >=0 || nilai <= 100){ // no. 3
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <=89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
            System.out.println("Nilai E, Anda tidak lulus!");
    }
}
```

    Masukkan nilai ujian (0-100): 105
    Nilai yang Anda masukkan lebih dari 100!
    Nilai E, Anda tidak lulus!


*Dengan input 105, kode yang telah dimodifikasi akan menampilkan 2 output, yaitu lebih dari 100 dan satu lagi nilai E tidak lulus karena operator || (or) bernilai salah semua, jadi yang ditampilkan adalah pernyataan else.*

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
    Masukkan besarnya penghasilan: 2000000


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

    Gaji bersih yang Anda terima: 1700000


5. Jalankan program di atas. Amati apa yang terjadi!

*Menentukan kondisi dulu dari inputan pertama berupa kategori pebisnis atau pekerja. Misal, jika kategori masuk pekerja maka penghasilan tadi yang juga sudah diinputkan akan dicari dalam range penghasilan mana dulu, baru ditentukan nilai pajaknya. Setelah itu baru diproses untuk gaji bersih dari perhitungan penghasilan dan pajak yang sesuai.*

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

***Jawab***

*1. Karena proses perhitungan gaji bersih menggunakan tipe data int yang tidak bisa menampilkan bilangan desimal*

*2. Awalnya tipe data dari variabel pajak adalah double, namun perhitungan tidak bisa dilakukan dengan tipe data yang berbeda, karena variabel penghasilan berupa tipe data int, makanya perhitungan gaji bersih disini di casting menjadi int.*

*3. Kegunaan equalsIgnoreCase adalah untuk membaca inputan dari variabel kategori disini tanpa memerhatikan case sensitivenya, jika sudah ditentukan "pebisnis" walaupun inputannya "PeBisniS" pun masih bisa diproses.*

*4. Dan untuk equals saja berarti tidak ada perintah untuk mengabaikan case sensitive, jadi harus sama persis besar kecilnya huruf sesuai dengan ketentuan.*

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
double bil1, bil2, hasil;
char op;

System.out.print("Masukkan bilangan pertama: ");
bil1 = input.nextDouble();
System.out.print("Masukkan operator (+, -, *, /): ");
op = input.next().charAt(0);
System.out.print("Masukkan bilangan kedua: ");
bil2 = input.nextDouble();

switch(op){
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
    System.out.println("Operator yang Anda masukkan salah");
}
```

    Masukkan bilangan pertama: 2.5
    Masukkan operator (+, -, *, /): *
    Masukkan bilangan kedua: 4
    2.5 * 4.0 = 10.0


*switch ini merupakan kondisi dan case adalah beberapa pernyataan yang harus dipilih salah satu yang sesuai dengan kondisi. Dalam kasus ini kondisinya adalah inputan operator, untuk case harus dicek satu persatu dari atas apakah cocok dengan switch. Jika tidak ada nilai pada case yang sesuai dengan nilai kondisi, maka proses akan dilanjutkan ke pernyataan yang ada di dalam default. Contohnya, input operator yang saya masukkan adalah (*) maka program akan melakukan pengecekan mulai dari case '+' sampai menemukan case '*' dan outputnya akan menampilkan 2.5 / 4.0 = 10.0 (berupa bilangan desimal karena memakai tipe data double)*

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
int a, b, c;

System.out.print("Masukkan sisi pertama: ");
a = input.nextInt();
System.out.print("Masukkan sisi kedua: ");
b = input.nextInt();
System.out.print("Masukkan sisi ketiga: ");
c = input.nextInt();

if(a == b && a == c){
        System.out.println("Segitiga sama sisi");
    } else if (a == b || a == c || b == c){
        System.out.println("Segitiga sama kaki");
    } else {
        System.out.println("Segitiga sembarang");
}
```

    Masukkan sisi pertama: 2
    Masukkan sisi kedua: 4
    Masukkan sisi ketiga: 2
    Segitiga sama kaki


*Input dulu tiga sisi dari segitiga tersebut, jika semua sisi panjangnya sama maka akan menghasilkan output berupa segitiga sama sisi, jika ada dua sisi yang sama maka outputnya segitiga sama kaki, dan jika sisinya tidak ada yang sama maka akan berupa segitiga sembarang.*

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

String makan, ex;
int harga, kirim ,total;

System.out.print("Masukkan nama makanan: ");
makan = input.nextLine();
System.out.print("Masukkan harga makanan: ");
harga = input.nextInt();
input.nextLine();
System.out.print("Apakah Anda ingin pengiriman express (0 = tidak, 1 = ya)?  ");
ex = input.nextLine();

if(ex.equals("1")){
    if (harga < 100000){
        kirim = 45000;
    } else if (harga >= 100000){
        kirim = 55000;
    }
    total = (harga + kirim);
    
} else {
     if (harga < 100000){
        kirim = 20000;
    } else if (harga >= 100000){
        kirim = 30000;
    }
    total = (harga + kirim);

    System.out.println("\n\nSTRUK PEMBELIAN\n"+makan);
    System.out.println("Harga Rp "+harga);
    System.out.println("Biaya Pengiriman Rp "+kirim);
    System.out.println("Total Rp "+total);
}
```

    Masukkan nama makanan: Ramen
    Masukkan harga makanan: 100000
    Apakah Anda ingin pengiriman express (0 = tidak, 1 = ya)?  0
    
    
    STRUK PEMBELIAN
    Ramen
    Harga Rp 100000
    Biaya Pengiriman Rp 30000
    Total Rp 130000


*Pada program ini perlu menginputkan dulu nama makanan dan harganya, lalu memilih untuk menggunakan jasa pengiriman express atau tidak, dengan menginputkan 0 untuk tidak dan 1 untuk iya. Misal saya tidak memilih express yakni reguler saja, maka akan diproses untuk total pembayaran dengan ketentuan jika harganya lebih dari sama dengan 100 ribu maka ongkirnya menjadi 30 ribu, dan jika kurang maka ongkirnya 20 ribu. Untuk express sendiri ketentuan tadi ditambahi 25 ribu. 
Jadi pemesanan saya tadi output total menjadi 130 ribu.*

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
String status;
int umur, pendapatan, tanggungan, biaya;

System.out.print("Masukkan umur: ");
umur = input.nextInt();
input.nextLine();

if(umur >=18){
    System.out.print("Apakah Anda sudah bekerja? (y/n) ");
    status = input.nextLine();
    
    if (status.equalsIgnoreCase ("y")){
        System.out.print("Masukkan pendapatan per bulan: Rp ");
        pendapatan = input.nextInt();
        System.out.print("Masukkan jumlah tanggungan: ");
        tanggungan = input.nextInt();
        
        biaya = pendapatan/tanggungan;
        System.out.print("\nBiaya hidup Anda Rp "+biaya);
        
    if (biaya > 300000){
      System.out.println("\nAnda tidak termasuk penduduk miskin");
    } else {
      System.out.println("\nAnda termasuk penduduk miskin");
    }
        
} else {
    System.out.println("Anda termasuk penduduk miskin");
}
    
} else {
    System.out.print("Apakah Anda masih sekolah? (y/n) ");
    status = input.nextLine();
    
     if (status.equalsIgnoreCase ("y")){
        System.out.println("Anda tidak termasuk penduduk miskin");
    } else {
         System.out.println("Anda termasuk penduduk miskin");
    }
}
```

    Masukkan umur: 18
    Apakah Anda sudah bekerja? (y/n) y
    Masukkan pendapatan per bulan: Rp 8000000
    Masukkan jumlah tanggungan: 2
    
    Biaya hidup Anda Rp 4000000
    Anda tidak termasuk penduduk miskin


*Program ini untuk menentukan termasuk penduduk miskin atau tidak, dimulai dari inputan umur, jika lebih dari sama dengan 18 maka akan muncul pertanyaan apakah sudah bekerja. Bisa direspon dengan inputan y untuk iya dan n untuk tidak. Jika sudah bekerja maka akan diminta inputan berupa penghasilan dan tanggungan untuk menentukan termasuk penduduk miskin atau tidak. Tapi jika tadi sudah berumur 18 tapi belum bekerja maka dianggap penduduk miskin, dan untuk yang belum berumur 18 jika dia masih sekolah, maka bukan penduduk miskin, jika sudah putus sekolah maka termasuk penduduk miskin.*
