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
System.out.print("Masukan nilai ujian ( 0-100): ");
nilai = input.nextInt();
```

    Masukan nilai ujian ( 0-100): 45


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan Ya!");
    } else if (nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan Prestasi Anda !");
    } else if (nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan Belajar Anda!");
    } else {
       System.out.println("Nilai E, Anda Tidak Lulus:("); 
    }
        
} else {
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai E, Anda Tidak Lulus:(


Penjelasan: 
Pertama Menambahkan paket Scanner yang fungsinya menginputkan data/nilai
Kedua Percabangan IF ELSE IF , yang dimana kondisi pertama bernilai false maka akan ke kode program berikutnya (lanjut ke if dibawahnya lagi) hingga ke else. sampai menghasilkan nilai true.

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukan nilai ujian ( 0-100): ");
nilai = input.nextInt();

if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan Ya!");
    } else if (nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan Prestasi Anda !");
    } else if (nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan Belajar Anda!");
    } else {
       System.out.println("Nilai E, Anda Tidak Lulus:("); 
    }     
} else if (nilai > 100){
    System.out.println("Nilai yang Anda masukkan lebih dari 100!");
} else {
    System.out.println("Nilai yang Anda masukkan kurang dari 0!");
}
```

    Masukan nilai ujian ( 0-100): -3
    Nilai yang Anda masukkan kurang dari 0!


2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!
  if disini itu, jika --> jika benar maka dilakukan.
  if && --> if and berarti bahwa jika sesuatu true, maka yg lain adalah true
  
3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?
 Outputnya tetap sama, karena pakai operator || , jika salah satu true maka hasilnya true



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukan nilai ujian ( 0-100): ");
nilai = input.nextInt();

if(nilai >= 0 || nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan Ya!");
    } else if (nilai >= 60 && nilai <=79){
        System.out.println("Nilai C, Tingkatkan Prestasi Anda !");
    } else if (nilai >= 50 && nilai <=59){
        System.out.println("Nilai D, Tingkatkan Belajar Anda!");
    } else {
       System.out.println("Nilai E, Anda Tidak Lulus:("); 
    }     
} else if (nilai > 100){
    System.out.println("Nilai yang Anda masukkan lebih dari 100!");
} else {
    System.out.println("Nilai yang Anda masukkan kurang dari 0!");
}
```

    Masukan nilai ujian ( 0-100): 105
    Nilai E, Anda Tidak Lulus:(


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
int penghasilan , gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan kategori: pekerja
    Masukkan besarnya penghasilan: 2500000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak =0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan*pajak));
    System.out.println ("Gaji bersih yang Anda terima: "+ gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")) {
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak ));
    System.out.println("Kategori yang Anda masukkan salah !");
} 
```

    Gaji bersih yang Anda terima: 2125000


5. Jalankan program di atas. Amati apa yang terjadi!

Penjelasan, yang terjadi Bisa terhitung dan hasilnya valid.

Perintah equalsIgnoreCase digunakan untuk menghilangkan case sensitive pada String selama kata-katanya sama.
Sedangkan untuk equals digunakan untuk menyamakan case sensitive dan kata-katanya harus sama.

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
int penghasilan , gajiBersih;
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
        pajak =0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan*pajak));
    System.out.println ("Gaji bersih yang Anda terima: "+ gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")) {
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak ));
    System.out.println("Kategori yang Anda masukkan salah !");
} 
```

    Masukkan kategori: pekerja
    Masukkan besarnya penghasilan: 2048485
    Gaji bersih yang Anda terima: 1741212


2. Jelaskan fungsi dari (int) pada sintaks:
fungsinya untuk tipe data integer, angka numerik yang tidaak pake koma.
3. Apa kegunaan dari equalsIgnoreCase?
fungsinya untuk menghilangkan case sensitive, untuk mengabaikan perbedaan antara huruf kecil dan besar
4. Apa kegunaan dari equals?
fungsinya untuk menyamakan case sensitive, huruf kecil besarnya berpengaruh.


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
Scanner sc = new Scanner(System.in);
double angka1, angka2, angka3, hasil;
char operator;
System.out.print("Masukkan angka pertama : ");
angka1 = sc.nextDouble();
System.out.print("Masukkan Operator (+ - * / ): ");
operator = sc.next().charAt(0);
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();

switch(operator){
    case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "+"+ angka2+"="+ hasil);
    break;
    case '-':
        hasil = angka1 - angka2;
        System.out.println(angka1 + "-"+ angka2+ "=" + hasil);
    break;
         case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + "*"+ angka2+ "=" + hasil);
    break;
         case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + "/"+ angka2+ "=" + hasil);
    break;
    default:
        System.out.println("Operator yang Anda masukkan Salah");
}

```

    Masukkan angka pertama : 26
    Masukkan Operator (+ - * / ): *
    Masukkan angka kedua: 5
    26.0*5.0=130.0


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
Scanner sc = new Scanner(System.in);
double A,B,C ;
System.out.println("Masukkan sisi A: ");
A = sc.nextDouble();
System.out.println("Masukkan sisi B: ");
B = sc.nextDouble();
System.out.println("Masukkan sisi C: ");
C = sc.nextDouble(); 

if(A==B && B!=C && C!=A || B==C && B!=A && C!=A ||C==A && B!=A && B!=C) {
    System.out.println("Segitiga sama kaki");
}else if (A==B || B==C||C==A){
    System.out.println("Segitiga sama Sisi");
}else{
    System.out.println("Segitiga Sembarang");
}
```

    Masukkan sisi A: 
    3
    Masukkan sisi B: 
    4
    Masukkan sisi C: 
    5
    Segitiga Sembarang


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
Scanner sc = new Scanner(System.in);
int harga, eks, total, bayar ;
String pengiriman , makan;
 System.out.println("Masukkan makanan : ");
 makan = sc.nextLine();
 System.out.println("Masukkan harga : ");
 harga = sc.nextInt();
 System.out.println("Apakah ingin pengiriman ekspres (y/t) ?");
 pengiriman = sc.next();

 if (pengiriman.equals("y")) {
     if (harga < 100000) {
         eks = 20000 + 25000;
     } else {
         eks = 30000 + 25000;
     }
 } else {
     if (harga < 100000) {
         eks = 20000;
     } else {
         eks = 30000;
     }
 }
System.out.println("STRUK PEMBAYARAN");
System.out.println(makan + "\t\tRp" + harga);
System.out.println("Biaya Pengiriman\tRp" + eks);
bayar = harga + eks ;
System.out.println("TOTAL\t\t\tRp" + bayar);
```

    Masukkan makanan : 
    Bakso Iga Bakar
    Masukkan harga : 
    250000
    Apakah ingin pengiriman ekspres (y/t) ?
    y
    STRUK PEMBAYARAN
    Bakso Iga Bakar		Rp250000
    Biaya Pengiriman	Rp55000
    TOTAL			Rp305000


4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
Scanner sc = new Scanner(System.in);
int umur , pdbln, jumlahTg;
double byhidup ;
char status;

System.out.println("Masukkan Umur : ");
    umur= sc.nextInt();

if (umur>= 18 ) {
    System.out.println("Sudah Bekerja atau Belum ? (y= sudah atau t= belum)");
    status = sc.next().charAt(0);
    
    if(status == 'y' ){
        System.out.print("Masukkan Pendapatan perbulan : ");
        pdbln = sc.nextInt();
        System.out.print("Masukkan Jumlah Tanggungan : ");
        jumlahTg = sc.nextInt();
        byhidup = pdbln/jumlahTg ;
        System.out.println("Biaya Hidup : " + byhidup);
        
        if(byhidup < 300000){
            System.out.println("Penduduk Miskin");
        }
        else{
            System.out.println("Bukan Pendudukan Miskin");
        }
    }
    else if(status == 't' ) {
        System.out.println("Penduduk Miskin");
    }
    else{
        System.out.println("Mohon Maaf Input Anda Salah");
    }
}

else {
    System.out.println("Status hidup : Bersekolah");
    System.out.print("Masih Bersekolah ? ( y =masih , t= belum) : ");
    status = sc.next().charAt(0);
    
    if(status == 'y' ){
        System.out.println("Bukan penduduk Miskin");
    }
    else if (status == 't' ){
        System.out.println("Penduduk Miskin");
    }
}
```

    Masukkan Umur : 
    16
    Status hidup : Bersekolah
    Masih Bersekolah ? ( y =masih , t= belum) : t
    Penduduk Miskin


Penjelasan: 
Yang pasti memasukan inputan.
penggunaan if else if untuk menentukan status

