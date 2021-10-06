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

    Masukkan nilai ujian (0-100): -8


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if (nilai >= 0 && nilai <= 100) {
    if (nilai >= 90 && nilai <= 100) {
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89) {
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <= 79) {
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <= 59) {
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else{
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai yang Anda masukkan tidak valid!


> Penjelasan kode program percobaan 1

Pada percobaan 1 menggunakan tipe data int dengan variabel nilai yang berarti integer atau bilangan bulat. Terdapat perintah untuk menginputkan nilai ujian dari 0 sampai 100. Jika nilai 0 sampai 100 maka proses. Jika nilai >= 90 sampai <= 100 maka outputnya "Nilai A, EXCELLENT!". Jika nilai >= 80 sampai <= 89 maka outputnya "Nilai B, pertahankan prestasi Anda!". Jika nilai >= 60 sampai <= 79 maka outputnya "Nilai C, tingkatkan prestasi Anda!". Jika nilai >= 50 sampai <= 59 maka outputnya "Nilai D, tingkatkan belajar Anda!". Jika nilai 0 sampai 49 maka outpunya "Nilai E, Anda tidak lulus!". Jika nilai yang kita masukkan selain dari yang disebutkan di atas seperti -8 maka outputnya "Nilai yang Anda masukkan tidak valid!"

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

// Jawaban pertanyaan

1. Memodifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”


```Java
// Nomor 1

import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();

if (nilai >= 0 && nilai <= 100) {
    if (nilai >= 90 && nilai <= 100) {
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89) {
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <= 79) {
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <= 59) {
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else if (nilai < 0) {
        System.out.println("Nilai yang Anda masukkan kurang dari 0");
} else {
        System.out.println("Nilai yang Anda masukkan lebih dari 100");
}
```

    Masukkan nilai ujian (0-100): -12
    Nilai yang Anda masukkan kurang dari 0


2. Fungsi sintax if (nilai >= 0 && nilai <= 100) digunakan untuk struktur pemilihan. Yang mana didalam pemilihan tersebut terdapat 2 kondisi yang harus terpenuhi secara bersama-sama. Kedua kondisi tersebut ditandai dengan adanya operator logika and (&&).

3. Hal ini terjadi karena nilai yang dimasukkan memenuhi kondisi pada if terluar namun tidak dapat memenuhi kondisi pada if berikutnya. Sehingga kondisi tersebut dibuang ke dalam kondisi else.


```Java
//Nomor 3

import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();

if (nilai >= 0 || nilai <= 100) {
    if (nilai >= 90 && nilai <= 100) {
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89) {
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    } else if (nilai >= 60 && nilai <= 79) {
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    } else if (nilai >= 50 && nilai <= 59) {
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else if (nilai < 0) {
        System.out.println("Nilai yang Anda masukkan kurang dari 0");
} else {
        System.out.println("Nilai yang Anda masukkan lebih dari 100");
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
    Masukkan besarnya penghasilan: 4000000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else{
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

    Gaji bersih yang Anda terima: 3200000


5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2

Pada percobaan 2 menggunakan tipe data String untuk variabel kategori, tipe data int yang berupa bilangan bulat untuk variabel penghasilan dan gajiBersih, tipe data double yang berupa bilangan riil untuk variabel pajak. Jika kategori pekerja dengan penghasilan <= 2000000 maka akan mendapat pajak 0.1, jika penghasilannya <= 3000000 maka akan mendapat pajak 0.15, jika penghasilannya selain yang disebutkan maka mendapat pajak 0.2. Jika kategori pekerja dengan penghasilan <= 2500000 maka mendapat pajak 0.15, jika penghasilannya <= 3500000 maka mendapat pajak 0.2, jika penghasilannya selain yang disebutkan maka mendapat pajak 0.25. Setelah itu diproses untuk mencari gajiBersih dari perhitungan penghasilan dan pajak yang sesuai. Jika kita memasukkan kategori selain pekerja dan pebisnis maka outputnya adalah "Kategori yang Anda masukkan salah!".

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

// Jawaban pertanyaan

1. Hal ini dikarenakan (int) setelah gajiBersih = yang membuat data tersebut bertipe integer. Sehingga angka dibelakang koma tidak ditampilkan.


```Java
// Ketik kode di sini
// Nomor 1

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
    } else{
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


2. Fungsinya yaitu karena tipe data variabel pajak adalah double, tetapi perhitungan tidak dapat dilakukan dengan tipe data yang berbeda, karena variabel penghasilan berupa tipe data int, maka perhitungan gaji bersih dicasting menjadi int.

3. equalsIgnoreCase memiliki kegunaan untuk membuat sintak input tidak terjadi sensitif case. Sehingga ketika equalsIgnoreCase("pebisnis") meskipun kita memasukkan case atau karakter yang tidak sama contohnya PEBISNIS, selama urutan atau hurufnya sama akan tetap terbaca pebisnis.


```Java
// Ketik kode di sini
// Nomor 3

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
    } else{
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


4. Outputnya tetap sama seperti sebelumnya, karena pebisnis dan pebisnis sama, semua menggunakan huruf kecil.


```Java
// Ketik kode di sini
// Nomor 4

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
    } else{
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
        double bil1, bil2, hasil;
        char operator;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = sc.nextDouble();
        System.out.print("Masukkan operator(+, -, *, /): ");
        operator = sc.next().charAt(0);
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = sc.nextDouble();
        
        switch(operator){
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
            System.out.println("Operator Yang Anda Masukkan Salah");
        }
```

    Masukkan bilangan pertama: 15
    Masukkan operator(+, -, *, /): *
    Masukkan bilangan kedua: 2
    15.0 * 2.0 = 30.0


Pada tugas nomor 1 ini saya menggunakan switch case. Pada program ini saya menggunakan tipe data double padA variabel bil1, bil2, bil3, dan hasil. Hal ini karena tipe data double dapat menangkap angka dibelakang koma. Hal ini dimana menggunakan konstanta ( +, -, *, / ). Jika user menginputkan operator yang tidak sesuai dengan konstanta tersebut maka akan keluar output "Operator Yang Anda Masukkan Salah". Hal ini membantu jika dalam program menggunakan operator bagi ( / ) yang mana hasil dari pembagian belum tentu bilangan bulat, biasanya dapat berupa bilangan koma.

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;

        Scanner sc = new Scanner(System.in);

        int sisiA, sisiB, sisiC;

        System.out.println("Masukkan Panjang Sisi Pertama: ");
        sisiA = sc.nextInt();
        System.out.println("Masukkan Panjang Sisi Kedua: ");
        sisiB = sc.nextInt();
        System.out.println("Masukkan Panjang Sisi Ketiga: ");
        sisiC = sc.nextInt();

        if(sisiA == sisiB && sisiB == sisiC && sisiA == sisiC){
        System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
        }
        else if(sisiA == sisiB || sisiB == sisiC || sisiA == sisiC){
            System.out.println("Segitiga Tersebut Adalah Segitiga Sama Kaki");
        }
        else{
        System.out.println("Segitiga Tersebut Adalah Segitiga Sembarang");
        }
```

    Masukkan Panjang Sisi Pertama: 
    8
    Masukkan Panjang Sisi Kedua: 
    6
    Masukkan Panjang Sisi Ketiga: 
    4
    Segitiga Tersebut Adalah Segitiga Sembarang


> Penjelasan kode program tugas nomor 2

Pada tugas nomor 2 ini saya menggunakan tipe data int untuk variabel sisiA, sisiB, dan sisiC yang berarti integer atau bilangan bulat. Jika input yang kita masukkan pada sisiA, sisiB, dan sisiC sama maka outputnya adalah "Segitiga Tersebut Adalah Segitiga Sama Sisi", jika input yang kita masukkan pada sisiA dan sisiB sama, tetapi pada sisiC berbeda maka outputnya adalah "Segitiga Tersebut Adalah Segitiga Sama Kaki", jika kita menginputkan ke 3 sisi tersebut dengan angka yang berbeda maka outputnya adalah "Segitiga Tersebut Adalah Segitiga Sembarang". Saya menggunakan if else karena kondisinya sejajar. Oleh karena itu, dapat disingkat menggunakan operator logika.

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

        Scanner sc = new Scanner (System.in);
        String makanan;
        int harga, pengiriman, biaya;
            System.out.print("Masukkan Nama Makanan: ");
            makanan = sc.nextLine();
            System.out.print("Masukkan Harga Makanan: Rp ");
            harga = sc.nextInt();
            System.out.print("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? ");
            pengiriman = sc.nextInt();

            if (pengiriman == 0){
                if (harga <= 100000){
                    biaya = 20000;
                } else{
                    biaya = 30000;
                }
            } else{
                if (harga <= 100000){
                    biaya = 45000;
                } else {
                    biaya = 55000;
                }
            }
            System.out.println("STRUK PEMBELIAN");
            System.out.println(makanan + "\t\t Rp " + harga);
            System.out.println("Biaya pengiriman\t Rp " + biaya);
            System.out.println("TOTAL\t\t\t Rp " + (harga + biaya));
```

    Masukkan Nama Makanan: Tuna Salad
    Masukkan Harga Makanan: Rp 115000
    Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 0
    STRUK PEMBELIAN
    Tuna Salad		 Rp 115000
    Biaya pengiriman	 Rp 30000
    TOTAL			 Rp 145000


> Penjelasan kode program tugas nomor 3

Pada tugas nomor 3 ini saya menggunakan tipe data String untuk variabel makanan dan int yang berupa integer atau bilangan bulat untuk variabel harga, pengiriman dan biaya. Terdapat perintah untuk menginputkan nama makanan, harga makanan, dan ingin menggunakan pengiriman ekspres atau tidak. Jika tidak, maka jika memesan makanan dengan harga <= 100000 maka dikenakan biaya pengiriman 20000, jika harga makanan > 100000 maka dikenakan biaya pengiriman 30000. Jika memilih 1 pada pengiriman ekspres maka jika memesan makanan dengan harga <= 100000 dikenakan biaya pengiriman 45000, jika harga makanan > 100000 maka dikenakan biaya pengiriman 55000. Untuk memproses total dari yang dipesan maka harga + biaya.

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
        Scanner input = new Scanner (System.in);
        int umur, pendapatan, tanggungan, biayaHidup;
        String status;
        System.out.println("Masukkan umur: ");
        umur = input.nextInt();

        if (umur >= 18){
            Scanner input = new Scanner(System.in);
            System.out.print("Apakah anda bekerja? (Y/N): ");
            status = input.nextLine();
            if (status.equalsIgnoreCase("Y")){
                System.out.print("Masukkan pendapatan perbulan: Rp. ");
                pendapatan = input.nextInt();
                System.out.print("Masukkan jumlah tanggungan: ");
                tanggungan = input.nextInt();
                biayaHidup = pendapatan / tanggungan;
                if (biayaHidup < 300000){
                    System.out.println("Penduduk miskin");
                } else {
                    System.out.println("Bukan penduduk miskin");
                }
            } else {
                System.out.println("Penduduk miskin");
            }
        } else {
            Scanner input = new Scanner (System.in);
            System.out.print("Apakah anda sekolah? (Y/N): ");
            status = input.nextLine();
            if (status.equalsIgnoreCase("Y")){
                System.out.println("Bukan penduduk miskin");
            } else {
                System.out.println("Penduduk miskin");
            }
        }
```

    Masukkan umur: 
    20
    Apakah anda bekerja? (Y/N): Y
    Masukkan pendapatan perbulan: Rp. 5000000
    Masukkan jumlah tanggungan: 4
    Bukan penduduk miskin


> Penjelasan kode program tugas nomor 4

Pada tugas nomor 4 ini saya menggunakan tipe data int yang vberupa integer atau bilangan bulat untuk variabel umur, pendapatan, tanggungan, dan biayaHidup serta tipe data string untuk variabel status. Saya menginputkan umur sendiri pada progam ini. Jika umur >= 18 maka outputnya "Apakah anda bekerja? (Y/N): ", jika "Y" maka terdapat perintah masukkan pendapatan perbulan dan jumlah tanggungan. Untuk dapat menghitung biayaHidup maka pendapatan / tanggungan. Jika biaya hidupnya < 300000 maka outputnya "Penduduk miskin" jika >= 300000 maka outputnya "Bukan penduduk miskin". Jika "N" maka outputnya "Penduduk miskin". Jika umur <18 maka akan ada output "Apakah anda sekolah? (Y/N): ", jika "Y" maka outputnya "Bukan penduduk miskin" jika "N" maka outputnya "Penduduk miskin".
