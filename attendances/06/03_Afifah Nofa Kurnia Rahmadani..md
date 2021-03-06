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

    Masukkan nilai ujian (0-100): 90


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if(nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if(nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai A, EXCELLENT!


> Penjelasan kode program percobaan 1
kode program diatas digunakan untuk mengetahui nilai yang berada pada rentang 0-100 dengan melakukan pengecekan pemilihan bersarang. Pemilihan bersarang (NESTED IF) merupakan jenis pemilihan yang digunakan untuk mengambil keputusan dalam bentuk level (bertingkat). langkah pertama yaitu menambahkan library scanner dan deklarasi scanner. lalu membuat variabel nilai menggunakan tipe data int.kemudian membuat struktur pemilihan bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid. pada kode program diatas saya memasukkan nilai 90 yang selanjutnya dicek pada struktur pemilihan bersarang. pada kondisi ke 1 bernilai true karena 90 berada pada rentang 0-100, maka akan dilanjutkan pada kondisi ke 2 
dan hasil outpunya adalah nilai A.

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!
jawab : fungsi sintaks if tersebut adalah digunakan untuk menyeleksi pertama kali. karena berada di posisi terluar (kondisi 1).Pengecekan pertama ini digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. menggunakan operator &&. kedua kondisi harus bernilai true agar dapat melanjutkan ke proses pengecekan yang kedua. Ketika mengevaluasi (e1 && e2), jika e1 menghasilkan FALSE, maka e2 tidak akan dievaluasi.Dengan demikian, nilai seluruh ekspresi (e1 && e2) akan dianggap salah. Namun, jika e1 menghasilkan TRUE, maka selanjutnya e2 akan dievaluasi untuk menentukan nilai seluruh ekspresi


3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?kode program tersebut mengashilkan output Nilai E. karena operator nya diubah dari operator and && menjadi Operator logika or ||. pada operator or || jika salah satu true maka akan dilanjutkan prosesnya.


```Java
// Jawaban pertanyaan No 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian : ");
nilai = input.nextInt();
if(nilai <= 0 && nilai >= 100){
    } else if(nilai <= 0){
        System.out.println("Nilai yang Anda masukkan kurang dari 0!");
    } else if(nilai >= 100){
        System.out.println("Nilai yang Anda masukkan lebih dari 100!");
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}

```

    Masukkan nilai ujian : 110
    Nilai yang Anda masukkan lebih dari 100!



```Java
// No 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();

if(nilai >= 0 || nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if(nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if(nilai >= 50 && nilai <= 59){
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

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan kategori: pekerja
    Masukkan besarnya penghasilan: 2000000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase ("pekerja")){
    if(penghasilan <= 2000000){
        pajak = 0.1;
    } else if(penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - ( penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if(penghasilan <= 2500000){
        pajak = 0.15;
    } else if(penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - ( penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Gaji bersih yang Anda terima: 1800000


5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2
 Kode program diatas digunakan untul menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan.  langkah pertama yaitu menambahkan library scanner dan deklarasi scanner. lalu membuat variabel kategori menggunkan tipe data string ,penghasilan dan gajiBersih menggunkan tipe data int karena bilangan bulat, pajak menggunakan tipe data double karena bilangan riil. Setelah itu, membuat struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak. pada percobaan ketiga nilai kategori yang dimasukkan adalah pekerja dengan penghasilan 2000000 . setelah program dijalankan menhasilkan gaji bersih yang diterima yaitu 1800000

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?
Jawab : karena menggunakan int yang akan mengonversi angka menjadi bilangan bulat
2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```
jawab : Fungsi (int) berfungsi mengkonversi gaji bersih menjadi bilangan bulat (integer)
3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?
jawab : hasilnya yaitu gaji yang diterima = 1700000. karena kategorinya pebisnis dan penghasilan 2000000. maka pajaknya sebesar 0.15. nah gaji bersih diperoleh dari gajiBersih = (int) (penghasilan - ( penghasilan * pajak));.
Di java, equals digunakan untuk membandingkan 2 String, bisa menggunakan .equals() dan .equalsIgnoreCase(), contohnya
perbedaan .equals dan .equalsIgnoreCase adalah jika equalsIgnoreCase tidak memperhatikan besar kecilnya huruf.

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals? 
jawab : hasilnya yaitu gaji yang diterima = 1700000. karena kategorinya pebisnis dan penghasilan 2000000. maka pajaknya sebesar 0.15. nah gaji bersih diperoleh dari gajiBersih = (int) (penghasilan - ( penghasilan * pajak));.
Di java, equals digunakan untuk membandingkan 2 String, bisa menggunakan .equals() dan .equalsIgnoreCase(), contohnya
perbedaan .equals dan .equalsIgnoreCase adalah jika equalsIgnoreCase tidak memperhatikan besar kecilnya huruf.


```Java
// Jawaban pertanyaan No 1
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
    if(penghasilan <= 2000000){
        pajak = 0.1;
    } else if(penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - ( penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if(penghasilan <= 2500000){
        pajak = 0.15;
    } else if(penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - ( penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}

```

    Masukkan kategori: pekerja
    Masukkan besarnya penghasilan: 2048485
    Gaji bersih yang Anda terima: 1741212



```Java
// No 3
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
    if(penghasilan <= 2000000){
        pajak = 0.1;
    } else if(penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - ( penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if(penghasilan <= 2500000){
        pajak = 0.15;
    } else if(penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - ( penghasilan * pajak));
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
} else {
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Masukkan kategori: pebisnis
    Masukkan besarnya penghasilan: 2000000
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
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double bilangan1,bilangan2,hasil;
char operator;

System.out.print("Masukkan bilangan pertama: ");
bilangan1 = sc.nextDouble();
System.out.print("Masukkan operator(+,-,*,/): ");
operator = sc.next().charAt(0);
System.out.print("Masukkan bilangan kedua: ");
bilangan2 = sc.nextDouble();

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
    System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);
    break;
    default:
    System.out.println("Operator yang anda masukkan salah");
        
}
```

    Masukkan bilangan pertama: 2.5
    Masukkan operator(+,-,*,/): *
    Masukkan bilangan kedua: 4
    2.5 * 4.0 = 10.0


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("Masukan bilangan A:");
		a = sc.nextInt();
		System.out.print("Masukan bilangan B:");
		b = sc.nextInt();
		System.out.print("Masukan bilangan C:");
		c = sc.nextInt();
		
		if(a == b && b!=c && a!=c || b==c && b!=a && a!=c || a==c && b!=a && b!=c) {
			//jika hanya dua bilangan yang nilainya sama maka cetak segitiga sama kaki
			System.out.print("maka hasilnya : segitiga sama kaki"); 
		}else if(a == b || a==c || b ==c){
			//jika  ketiga bilangan nilainya sama maka cetak segitiga sama sisi
			System.out.print("maka hasilnya : segitiga sama sisi");
		}else 
			//jika ketiga sisinya tidak sama maka cetak segitiga sembarang
			System.out.print("maka hasilnya : segitiga sembarang");
```

    Masukan bilangan A:3
    Masukan bilangan B:3
    Masukan bilangan C:3
    maka hasilnya : segitiga sama sisi

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
String makanan,jasaKirim;
int harga,ongkir = 0, totalOngkir = 0, totalBayar;

System.out.print("Masukkan nama makanan: ");
makanan = input.nextLine();
System.out.print("Masukkan harga makanan:Rp ");
harga = input.nextInt();
input.nextLine();
System.out.print("Apakah Anda ingin pengiriman ekspres ?(ya/tidak): ");
jasaKirim = input.nextLine();

if(harga < 100000 && jasaKirim.equalsIgnoreCase ("ya")){
    ongkir = 20000;
    totalOngkir = ongkir + 25000;
    } else if(harga < 100000 && jasaKirim.equalsIgnoreCase ("tidak")){
    ongkir = 20000;
    } else if(harga >= 100000 && jasaKirim.equalsIgnoreCase ("ya")){
    ongkir = 30000;
    totalOngkir = ongkir + 25000;
    } else if(harga >= 100000 && jasaKirim.equalsIgnoreCase ("tidak")){
    ongkir = 30000;
} else {
    System.out.println("Harga yang Anda masukkan salah");
}
totalOngkir = ongkir;
totalBayar = harga + totalOngkir;
System.out.println("STRUK PEMBELIAN");
System.out.println("Nama makanan : Rp " + harga);
System.out.println("Biaya pengiriman : Rp " + totalOngkir);
System.out.println("Total : Rp " + totalBayar);
```

    Masukkan nama makanan: Tuna salad
    Masukkan harga makanan:Rp 115000
    Apakah Anda ingin pengiriman ekspres ?(ya/tidak): tidak
    STRUK PEMBELIAN
    Nama makanan : Rp 115000
    Biaya pengiriman : Rp 30000
    Total : Rp 145000


4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String status;
int umur,pendapatan,tanggungan,biayaHidup;
System.out.println("Masukkan umur: ");
umur = input.nextInt();
if (umur >=18){
    Scanner input = new Scanner(System.in);
    System.out.print("Apakah Anda bekerja? (Y/N): ";
    status = input.nextLine();
    if (status.equalsIgnoreCase("Y")){
        System.out.print("Masukkan pendapatan: Rp " );
        pendapatan = input.nextInt();
        System.out.print("Jumlah tanggungan: " );
        tanggungan = input.nextInt();
        biayaHidup = pendapatan / tanggungan;
        if (biayaHidup < 300000){
            System.out.println("Penduduk miskin:");
    } else { 
        System.out.println("Bukan penduduk miskin:");
    }
} else {
    System.out.println("Penduduk miskin");
}

```

    Masukkan umur: 
    18



    Incomplete input:

    |   if (umur >=18){

    |       Scanner input = new Scanner(System.in);

    |       System.out.print("Apakah Anda bekerja? (Y/N): ";

    |       status = input.nextLine();

    |       if (status.equalsIgnoreCase("Y")){

    |           System.out.print("Masukkan pendapatan: Rp " );

    |           pendapatan = input.nextInt();

    |           System.out.print("Jumlah tanggungan: " );

    |           tanggungan = input.nextInt();

    |           biayaHidup = pendapatan / tanggungan;

    |           if (biayaHidup < 300000){

    |               System.out.println("Penduduk miskin:");

    |       } else { 

    |           System.out.println("Bukan penduduk miskin:");

    |       }

    |   } else {

    |       System.out.println("Penduduk miskin");

    |   }



```Java

```
