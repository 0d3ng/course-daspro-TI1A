## JOBSHEET 5

## PEMILIHAN 1

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan if

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

    <p align="left">
    <img width="351" height="460" src="images/01.png">
    </p>
    

> Flowchart diatas digunakan untuk menentukan bilangan ganjil/genap, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel bil untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;
System.out.print("Masukkan sebuah bilangan : ");
bil = input.nextInt();
```

Dari hasil pemrograman diatas menyatakan bahwa jika kita memasukkan (input) bilangan bulat, maka hasil yang dikeluarkan (output)nya adalah bilangat bulat. Apabila yang dimasukan bilangan rill maka hasilnya akan error.

3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
if(bil%2 == 0){
    System.out.println("Bilangan Genap");
}else{
    System.out.println("Bilangan Ganjil");
}
```

Dari hasil pemrograman diatas menyatakan bahwa jika kita memasukkan (input) "Bilangan Genap", maka hasil yang dikeluarkan (output)nya adalah "Bilangan Ganjil". 

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
String output;
    if(bil%2 == 0){
    System.out.println("Bilangan Genap");
}else{
    System.out.println("Bilangan Ganjil");
System.out.println(output);
}
```

Dari hasil pemrograman diatas menyatakan bahwa jika kita memasukkan (input) "Bilangan Genap", maka hasil yang dikeluarkan (output)nya adalah "Bilangan Ganjil". 

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan sebuah bilangan : ");
nilai = input.nextInt(); 
```

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan sebuah bilangan : ");
nilai = input.nextInt();

if(nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
```

+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur Anda: ");
umur = input.nextInt();
```

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur Anda: ");
umur = input.nextInt();

if (umur > 60)
    System.out.println("Lansia");
else if (umur > 45)
    System.out.println("Tua");
else if (umur > 17)
    System.out.println("Dewasa");
else if (umur > 5)
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

Dari hasil pemograman diatas menyatakan bahwa apabila kita memasukkan umur "18" tahun maka hasil yang akan dikeluarkan adalah "Dewasa". Apabila anda memasukan nilai umur yang sesuai dengan variabel diatas maka hasil yang keluar akan sesuai dengan variabel yang sudah tertera.

+ Jalankan program dan amati apa yang terjadi!

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;
```

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);
```

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;

System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);

switch (operator){
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
System.out.println("Operator yang Anda masukan salah");

}
```

Dari hasil pemrograman diatas dapat dinyatakan bahwa apabila kita memasukan nilai pertama lalu nilai kedua lalu memasukan operator "/" maka nilai pertama akan dibagi dengan nilai kedua, dan sebaliknya seperti operator "+, -, *, dan /", maka nilai pengoperasian yang akan dikeluarkan akan sesuai dengan hasil yang tertera.

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.
2. Perhatikan flowchart berikut ini:

![](images/02.png)

> Buatlah program sesuai dengan flowchart diatas!

3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!

4. Sebuah toko memberikan diskon kepada pelanggannya dengan ketentuan sebagai berikut:

| Total Belanja     | Potongan |
|-------------------|----------|
| >Rp. 200.000,00   | 2%       |
| >Rp. 500.000,00   | 5%       |
| >Rp. 1.000.000,00 | 10%      |

> Total belanja diperoleh dari pembelian tiga barang yaitu barang A, barang B, dan barang C. Ketika menginputkan harga barang juga menginputkan jumlah barang yang dibeli.

Contoh outputnya
```
Masukkan harga barang A   :100000
Masukkan jumlah barang A  :10
Masukkan harga barang B   :250000
Masukkan jumlah barang B  :5
Masukkan harga barang C   :150000
Masukkan jumlah barang C  :1
---------------------------------------------
                Struk total
---------------------------------------------
Nama Barang 	| 	Harga 	| 	Jumlah 	| 	Total
Barang A            100000         10        1000000   
Barang B            250000         5         1250000   
Barang C            150000         1         150000    
Total       :2400000
Diskon      :240000.0
Total Bayar :2160000.0
```

**Jawaban Nomor 1


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int x, y;

x = 100;
y = 60;

System.out.print("Masukkan nilai x: ");
x = sc.nextInt();
System.out.print("Masukkan nilai y: ");
y = sc.nextInt();

if (x > y) {
    System.out.println("x lebih besar dari y");
}
```

    Masukkan nilai x: 100
    Masukkan nilai y: 90
    x lebih besar dari y


**Jawaban Nomor 2


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur : ");
umur = input.nextInt();

if (umur >= 17)
    System.out.println("Boleh berkendara");
else
     System.out.println("Tidak boleh berkendara");
```

    Masukkan umur : 13
    Tidak boleh berkendara


**Jawaban Nomor 3


```Java
import java.util.Scanner;
    Scanner sc = new Scanner(System.in);

float nilaiUas, nilaiUts, nilaiKuis, nilaiTugas;
float nilaiAkhir;

nilaiUas = 40/100f;
nilaiUas = 30/100f;
nilaiKuis = 10/100f;
nilaiTugas = 20/100f;

System.out.print("Masukkan Nilai UAS : ");
nilaiUas = 40/100f * sc.nextFloat();
System.out.print("Masukkan Nilai UTS : ");
nilaiUts = 30/100f * sc.nextFloat();
System.out.print("Masukkan Nilai Kuis : ");
nilaiKuis = 10/100f * sc.nextFloat();
System.out.print("Masukkan Nilai Tugas : ");
nilaiTugas = 20/100f * sc.nextFloat();

nilaiAkhir = nilaiUas + nilaiUts + nilaiKuis + nilaiTugas;
System.out.println("Nilai Akhir : " + nilaiAkhir);

if (nilaiAkhir > 65)
    System.out.println("Selamat anda tidak remidi");
else
System.out.println("Maaf anda remidi");

```

    Masukkan Nilai UAS : 99
    Masukkan Nilai UTS : 87
    Masukkan Nilai Kuis : 76
    Masukkan Nilai Tugas : 77
    Nilai Akhir : 88.700005
    Selamat anda tidak remidi


**Jawaban Nomor 4


```Java
import java.util.Scanner;
    Scanner sc = new Scanner(System.in);

int barangA, barangB, barangC;
int jumlahA, jumlahB, jumlahC;
int totalA, totalB, totalC, totalBelanja;
Float diskon, totalBayar;

System.out.print("Masukkan Harga Barang A : ");
barangA = sc.nextInt();
System.out.print("Masukkan Jumlah Barang A : ");
jumlahA = sc.nextInt();
totalA = barangA * jumlahA;

System.out.print("Masukkan Harga Barang B : ");
barangB = sc.nextInt();
System.out.print("Masukkan Jumlah Barang B : ");
jumlahB = sc.nextInt();
totalB = barangB * jumlahB;

System.out.print("Masukkan Harga Barang C : ");
barangC = sc.nextInt();
System.out.print("Masukkan Jumlah Barang C : ");
jumlahC = sc.nextInt();
totalC = barangC * jumlahC;

totalBelanja = totalA + totalB + totalC;
System.out.println("Total: " + totalBelanja);

if(totalBelanja > 100000)
	diskon = totalBelanja * 10/100f;

else if (totalBelanja > 500000)
	diskon = totalBelanja * 5/100f;

else if (totalBelanja > 200000)
	diskon = totalBelanja * 20/100f;

else
    diskon = 0/100f;

totalBayar = totalBelanja - diskon;


System.out.println("---------------------------------------------");
System.out.println("\t\t\tStruk Total");
System.out.println("---------------------------------------------");

System.out.println("Nama Barang\t|\tHarga|\tJumlah|\tTotal");
System.out.println("Barang A\t\t" + barangA + "\t\t"+ jumlahA + "\t\t" + totalA);
System.out.println("Barang B\t\t" + barangB + "\t\t"+ jumlahB + "\t\t" + totalB);
System.out.println("Barang C\t\t" + barangC + "\t\t"+ jumlahC + "\t\t" + totalC);
System.out.println("Total\t: " + totalBelanja);
System.out.println("Diskon\t: "+ diskon);
System.out.println("Total bayar\t: " + totalBayar);
```

    Masukkan Harga Barang A : 100000
    Masukkan Jumlah Barang A : 10
    Masukkan Harga Barang B : 250000
    Masukkan Jumlah Barang B : 5
    Masukkan Harga Barang C : 150000
    Masukkan Jumlah Barang C : 1
    Total: 2400000
    ---------------------------------------------
    			Struk Total
    ---------------------------------------------
    Nama Barang	|	Harga|	Jumlah|	Total
    Barang A		100000		10		1000000
    Barang B		250000		5		1250000
    Barang C		150000		1		150000
    Total	: 2400000
    Diskon	: 240000.0
    Total bayar	: 2160000.0

