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

    Masukkan nilai ujian (0-100): 49


Pada code program di atas scanner untuk menginput tipe data int yang di mana berupa bilangan bulat dari 0-100

3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <= 100){
    if(nilai >=90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi anda!");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi anda!");
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    System.out.println("Nilai yang anda masukkan tidak valid");
}
```

    Nilai E, Anda tidak lulus!


> Penjelasan kode program percobaan 1
Code program percobaan 1 pada cell 1 menunjukkan predikat apa yang kita dapat dari setiap nilai. 
Terlihat di atas memasukkan scanner untuk memasukkan suatu input dan di mana input tersebut berupa tipe data int jadi nanti kita perlu memasukkan input berupa bilangan bulat di antara 1 sampai 100.
Di code program yabg berada di cell 2 memberikan perintah untuk menampilkan jika nilai lebih dari sama dengan 90 dan lebih kecil dari sama dengan 100 mendapatkan predikat A begitu juga dengan predikat B di antara nilai 80-89, 
C nilainya di antara 60-79, D di antara 50-59. Dan untuk di bawah nilai tersebut mendapatkan predikat E.

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

Jawab
1. 
```Java
// Jawaban pertanyaan
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
```

    Masukkan nilai ujian (0-100): 101

```Java
if(nilai >= 0 && nilai <= 100){
    if(nilai >=90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi anda!");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi anda!");
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    if(nilai < 0){
        System.out.println("Nilai yang Anda masukkan kurang dari 0");
    } else {
        System.out.println("Nilai yang Anda masukkan lebih dari 100");
    }
}
```

    Nilai yang Anda masukkan lebih dari 100

2. Fungsi dari sintaks if (nilai >= 0 && nilai <= 100) yaitu jika nilai yang diinputkan tidak sesuai dengan suatu kondisi dimana nilai lebih besar sama dengan 0 dan lebih kecil dari sama dengan 100 maka hasilnya akan false

3. Yang terjadi adalah nilai sama dengan E karena kalau menggunakan || (or) yang terjadi ialah jika nilai dari salah satu benar maka nilai lainnya ikut benar dan nilai 105 di sana telah memenuhi kondisi >=0 oleh karenanya termasuk pada predikat E karena predikat E tidak diuraikan dari nilai berapa sampai nilai berapa

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
    Masukkan besarnya penghasilan: 2048485


Dalam code program tersebut dibuat perintah scanner untuk memasukkan input berupa tipe data string berupa kategori dan int berupa bilangan bulat besar penghasilan.

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
    System.out.println("Gaji bersih yang anda terima : " + gajiBersih);
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima : " + gajiBersih);
} else {
    System.out.println("Kategori yang anda masukkan salah!"); 
}
```

    Gaji bersih yang anda terima : 1741212


5. Jalankan program di atas. Amati apa yang terjadi!

> program percobaan 2
Code program tersebut menunjukkan adanya potongan pajak dari setiap penghasilan dari pekerja ataupun pebisnis dan dalam code terebut memberikan perintah berapa gaji bersih yang didapatkan dari seorang pekerja ataupun pebisnis berdasarkan penghasilannya. Misal pekerja berpenghasilan 2048485 dan berarti gaji bersih yang diterima 1741212

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

Jawab
1. Karena gaji bersih menggunakan tipe data Int

2. Funsi dari int pada sintaks gajiBersih = (int) (penghasilan - (penghasilan * pajak)); yaitu merupakan tipe data dari gaji bersih di mana outputnya nanti akan berupa bilangan bulat.

3. Yang terjadi yaitu menghitung gaji bersih dari pebisnis, fungsi dari equalsIgnoreCase adalah menyeleksi string yang akan disajikan di sistem pemrograman dengan mengabaikan format huruf

4. Yang terjadi yaitu hasil outputnya sama, karena fungsi dari equals sama dengan equalsIgnoreCase yaitu menyeleksi dari string yang akan disajikan hanya saja beda di format penulisan kalau pada equals memerhatikan format penulisan pada input terhadap variabel misal memerhatikan huruf kapital

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
Jawab
```Java
//ketik kode program dan lampirkan hasilnya disini
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;

System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();

switch(operator){
    case '+':
    hasil = angka1 + angka2;
    System.out.println(angka1 + " + " + angka2 + " = " + hasil);
    break;
    case '-':
    hasil = angka1 - angka2;
    System.out.println(angka1 + " - " + angka2 + " = " + hasil);
    break;
    case '*':
    hasil = angka1 * angka2;
    System.out.println(angka1 + " * " + angka2 + " = " + hasil);
    break;
    case '/':
    hasil = angka1 / angka2;
    System.out.println(angka1 + " / " + angka2 + " = " + hasil);
    break;
    default:
    System.out.println("Operator yang Anda masukkan salah");
}
```

    Masukkan angka pertama: 2.5
    Masukkan operator (+ - * /): *
    Masukkan angka kedua: 4
    2.5 * 4.0 = 10.0

2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 

Jawab
```Java
//ketik kode program dan lampirkan hasilnya disini
Scanner sc = new Scanner(System.in);
    int sisi1, sisi2, sisi3;
    System.out.println("Masukkan sisi 1 :");
    sisi1 = sc.nextInt();
    System.out.println("Masukkan sisi 2 :");
    sisi2 = sc.nextInt();
    System.out.println("Masukkan sisi 3 :");
    sisi3 = sc.nextInt();

    if ((sisi1 == sisi2) && (sisi3 == sisi1)){
        System.out.println("Segitiga sama sisi");
    }else if ((sisi1 == sisi2) || (sisi1 == sisi3) || (sisi2 == sisi3)){
        System.out.println("Segitiga sama kaki");

    }else {
        System.out.println("Segitiga sembarang");
}
```

    Masukkan sisi 1 :
    3
    Masukkan sisi 2 :
    4
    Masukkan sisi 3 :
    5
    Segitiga sembarang

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

Jawab
```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
    String namaMakanan;
    int hargaMakanan , pengiriman , pengirimanExpress , pengirimanReguler , total;

    System.out.print("Masukkan Nama Makanan :");
    namaMakanan = sc.nextLine();

    System.out.print("Masukan Harga Makanan :Rp ");
    hargaMakanan = sc.nextInt();

    System.out.print("Apakah anda ingin pengiriman express (0 = tidak , 1 = iya) ?");
    pengiriman = sc.nextInt();

    System.out.println("" + namaMakanan + "\t :Rp " + hargaMakanan);
    if (pengiriman == 0){
        if (hargaMakanan < 100000){
            pengirimanReguler = 20000;
            System.out.println("Biaya pengiriman :Rp " + pengirimanReguler);
            System.out.println("Total\t\t :Rp " +(hargaMakanan + pengirimanReguler));
        }else if (hargaMakanan == 100000 || hargaMakanan >= 100000){
            pengirimanReguler = 30000;
            System.out.println("Biaya Pengiriman :Rp " +pengirimanReguler);
            System.out.println("Total\t\t :Rp " +(hargaMakanan + pengirimanReguler));

        }else{
            pengirimanReguler = 0;
            System.out.println("Biaya pengiriman :Rp " +pengirimanReguler);
            System.out.println("Total\t\t :Rp " +(hargaMakanan + pengirimanReguler));
        }
    }else if (pengiriman == 1){
        if (hargaMakanan < 100000){
            pengirimanExpress = 45000;
            System.out.println("Biaya Pengiriman Anda Adalah :Rp " +pengirimanExpress);
            System.out.println("Total\t\t :Rp " + (hargaMakanan + pengirimanExpress));
        }else if (hargaMakanan < 100000 || hargaMakanan > 100000){
            pengirimanExpress = 550000;
            System.out.println("Biaya Pengiriman Anda Adalah :Rp " +pengirimanExpress);
            System.out.println("Total\t\t :Rp " + (hargaMakanan + pengirimanExpress));
        }
}
```
    ```
    Masukkan Nama Makanan :Tuna salad
    Masukan Harga Makanan :Rp 115000
    Apakah anda ingin pengiriman express (0 = tidak , 1 = iya) ?0
    Tuna salad	 :Rp 115000
    Biaya Pengiriman :Rp 30000
    Total		 :Rp 145000

    ```
    Masukkan Nama Makanan :Beef bulgogi
    Masukan Harga Makanan :Rp 78000
    Apakah anda ingin pengiriman express (0 = tidak , 1 = iya) ? 1
     
    STRUK PEMBELIAN
    Beef bulgogi	 :Rp 78000
    Biaya Pengiriman Anda Adalah :Rp 45000
    Total		 :Rp 123000
    ```

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!

Jawab
```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur, statusKerja, statusSekolah, pendapatan, tanggungan;

System.out.println("Masukkan Umur: ");
umur = input.nextInt();
```

    Masukkan Umur: 
    19



```Java
if (umur < 18){
    System.out.println("Sekolah Atau Tidak (0 = Tidak, 1 = Ya): ");
statusSekolah = input.nextInt(); 

{if (statusSekolah == 0){
    System.out.println("Hasil: Penduduk Miskin");
} else if (statusSekolah == 1){
    System.out.println("Hasil: Bukan Penduduk Miskin");
} else {
    System.out.println("Tidak Valid!");
}
}
} else {
    System.out.println("Bekerja Atau Tidak (0 = Tidak, 1 = Ya): ");
    statusKerja = input.nextInt(); 
    if (statusKerja == 0){
        System.out.println("Hasil: Penduduk Miskin!");
    } else if (statusKerja == 1){
        System.out.println("Pendapatan: Rp ");
        pendapatan = input.nextInt(); 
        System.out.println("Tanggungan: ");
        tanggungan = input.nextInt(); 
        {if ((pendapatan/tanggungan) < 300000){
            System.out.println("Hasil: Penduduk Miskin");
        } else {
            System.out.println("Hasil: Bukan Penduduk Miskin");
        }
         }
    } else {
        System.out.println("Tidak Valid!");
    }
}
```

    Bekerja Atau Tidak (0 = Tidak, 1 = Ya): 
    1
    Pendapatan: Rp 
    1500000
    Tanggungan: 
    3
    Hasil: Bukan Penduduk Miskin
