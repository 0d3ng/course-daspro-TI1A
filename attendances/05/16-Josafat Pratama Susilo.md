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
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;
System.out.print("Masukkan sebuah bilangan: ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan: 7

>Kode diatas berfungsi untuk menyimpan input user ke dalam variabel ```bil``` yang bertipe data integer. Diawali dengan import dan menginisialisasi ```Scanner```  yang nantinya digunakan untuk menyimpan variabel.


3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
// Ketik kode program di atas di bawah sini
if(bil%2 == 0){
    System.out.println("Bilangan Genap");
}else{
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Ganjil

>Kode diatas berfungsi untuk melakukan pemilihan atau percabangan. Dengan pengkondisian apakah variabel ```bil``` bila dilakukan operasi modulus dengan bilangan dua menghasilkan nilai 0 atau bukan. Bila hasilnya adalah 0 maka akan ada output yang menyatakan bahwa variabel ```bil``` adalah ```"Bilangan Genap"```, sebaliknya jika bukan 0 maka akan ada output yang menyatakan bahwa variabel ```bil``` adalah ```"Bilangan Ganjil"```. Operasi modulus adalah operasi yang menghasilkan sisa dari pembagian, jadi apabila sebuah bilangan dilakukan operasi modulus dengan 2 hasilnya adalah 0 alias habis dibagi dengan bilangan 2 maka bilangan tersebut adalah bilangan genap.

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Ganjil

>Kode diatas merupakan penerapan dari ternary operator. Bila kita ubah ke bahasa manusia, sebenarnya ternary operator itu mudah dipahami karena struktur kalimatnya sederhana. Contohnya adalah Apakah (kondisi benar atau salah) ? jika iya maka lakukan hal ini : jika salah lakukan hal ini. Pada kode diatas kita melakukan inisialisasi variabel ```output``` dan melakukan pengecekan apakah variabel ```bil``` bila dilakukan operasi modulus dengan 2 hasilnya adalah 0, bila iya maka variabel ```output``` akan berisi nilai ```"Bilangan Genap"```, jika salah maka akan berisi nilai ```"Bilangan Ganjil"```. Pada kode diatas menhasilkan output ```"Bilangan Ganjil"``` karena 7 modulus 2 adalah 1 alias 7 dibagi 2 sisa 1.


2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

>Jawaban nomor 3:<br>Karena memiliki logika yang sama yaitu melakukan pengecekan apakah sebuah varibel ```bil``` dapat habis dibagi 2 atau tidak. Hanya beda syntax saja.

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
// Ketik kode program di atas di bawah sini
int nilai;
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan: 2

>Kode diatas berfungsi untuk menginisialisasi varibel ```nilai``` yang bertipe data integer dan menerima input berupa integer lalu menyimpannya ke variabel nilai.


+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
// Ketik kode program di atas di bawah sini
if(nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah "+nilai);
```

    Hasil akhir nilai adalah -8

>Kode diatas melakukan pengecekan apakah nilai yang diinputkan user pada variabel ```nilai``` lebih atau sama dengan 100 atau tidak. Bila iya maka nilai tersebut akan dijumlahkan dengan 10 jika tidak maka nilai tersebut akan dikurangi dengan 10 lalu di print hasilnya. Pada kode diatas menghasilkan nilai -8 karena variabel ```nilai``` bernilai 2 tidak lebih dari 100 lalu dikurangi 10 maka menghasilkan nilai -8.


+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

>Jawaban pertanyaan 1: <br>
>Kode program tersebut merupakan assignment operator dan merupakan singkatan. Jadi arti dari ```nilai+=10``` itu sama dengan ```nilai=nilai+10``` atau nilai tersebut ditambah 10 begitu juga dengan ```nilai-=10``` itu sama dengan ```nilai=nilai-10``` atau nilai tersebut dikurangi 10.

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

>Jawaban pertanyaan 2: <br>
```Java
import java.util.Scanner;

float nilai1, nilai2, avg;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan bilangan 1: ");
nilai1 = input.nextFloat();
System.out.print("Masukkan bilangan 2: ");
nilai2 = input.nextFloat();

avg = (nilai1 + nilai2)/2;

if(avg >= 100){
    avg -= 5;
}

System.out.println("Hasil akhir nilai adalah "+avg);
```
    Masukkan bilangan 1: 2
    Masukkan bilangan 2: 8
    Hasil akhir nilai adalah 5.0

#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
// Ketik kode program di atas di bawah sini
int umur;
System.out.print("Masukkan umur Anda: ");
umur = input.nextInt();
```

    Masukkan umur Anda: 18
    
>Kode diatas berfungsi untuk menginisialisasi variabel ```umur``` yang bertipe data integer dan menyimpan inputan user ke variabel ```umur``` yang telah diinisialisasikan tadi.


+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
// Ketik kode program di atas di bawah sini
if(umur > 60)
    System.out.println("Lansia");
else if(umur > 45)
    System.out.println("Tua");
else if(umur > 17)
    System.out.println("Dewasa");
else if(umur > 5)
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

    Dewasa

>Kode program di atas berfungsi untuk melakukan pengecekan variabel ```umur``` bila memenuhi kondisi tertentu. Dimulai dari apabila nilai variabel ```umur``` lebih dari 60 atau tidak, bila benar maka akan melakukan baris kode dalam scope ```if``` tersebut, bila tidak maka akan dilanjut ke pengkondisian kedua yaitu apakah variabel ```umur``` lebih dari 45 atau tidak dan jika benar akan melakukan baris kode dalam scope ```else if``` bila tidak maka akan dilanjut ke pengkondisian berikutnya sampai ke scope ```else``` yaitu variabel ```umur``` tidak lebih dari 5.
><br>
><br/>Kode diatas menghasilkan output ```"Dewasa"``` karena umur lebih dari 17 dan kurang dari 60 serta 45
><br>
><br> Urutan pengecekkan merupakan salah satu poin yang krusial juga, apabila kita melakukan pengecekkan variabel ```umur``` dari yang kecil maka akan ada kemungkinan kesalahan. Contohnya bila kita melakukan pengecekkan apakah variabel ```umur``` lebih dari 5 terlebih dahulu dan ternyata umurnya 81 yang seharusnya adalah ```"Lansia"``` malah ter-output ```"Balita"```


+ Jalankan program dan amati apa yang terjadi!

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
// Ketik kode program di atas di bawah sini
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;
```

>Kode diatas berfungsi untuk menginisialisasi Scanner, serta variabel ```angka1, angka2```, dan ```hasil``` yang bertipe data double lalu variabel ```operator``` yang bertipe data char.

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
// Ketik kode program di atas di bawah sini
System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);
```

    Masukkan angka pertama: 2
    Masukkan angka kedua: 4
    Masukkan operator (+ - * /): *

>Kode diatas berfungsi untuk menyimpan inputan user ke dalam masing-masing variabel. Dapat dilihat ada kode ```operator = sc.next().charAt(0);``` yang berarti untuk menyimpan character pertama dari inputan user karena next() menerima inputan berupa String.


4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
// Ketik kode program di atas di bawah sini
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

    2.0 * 4.0 = 8.0

>Kode tersebut berfungsi untuk melakukan pengecekan menggunakan switch case. Kita melakukan pengecekkan pada variabel ```operator``` apakah ada dari case-case tersebut yang sama dengan nilai variabel ```operator``` dan bila ada, maka akan dijalankan kode program di dalam scope ```case '':``` tersebut sampai baris kode ```break;``` bila tidak ada yang sama maka akan dijalaknan kode program pada scope ```default:``` tersebut.
><br>Kode program tersebut menghasilkan nilai 8.0 karena pada saat inputan kita memilih operator ```"*"``` yang masuk ke dalam ```case '*':``` maka 2.0 akan dikalikan dengan 4.0 yang menghasilkan 8.0 


5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
>Jawaban pertanyaan 1: <br>
> + Fungsi dari break adalah menghentikan jalan program dan keluar dari scope ```switch``` serta lanjut ke baris kode setelah scope ```switch```. Karena bila tidak diberi ```break;``` maka case berikutnya akan dijalankan dan dapat menyebabkan program tidak berjalan dengan sesuai.
> + Fungsi dari ```default``` pada switch case sama dengan ```else``` pada if else yaitu meng-handle kemungkinan yang tidak benar atau tidak dapat ditangkap oleh case-case yang ada. Contohnya adalah pada kode program percobaan 4 diatas terdapat 4 case yang menunjukkan aritmatika sederhana, bila kita memasukkan operator modulus (%) yang tidak ada pada 4 case tersebut maka kita dapat meng-handlenya dengan ```default:``` dan menghasilkan output bahwa Operator yang dimasukkan salah.
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```
>Jawaban Pertanyaan 2: <br>
>Kode tersebut berfungsi untuk menyimpan karakter pertama dari inputan user ke dalam variabel ```operator```. Mengapa harus ada ```charAt(0)```? karena ```sc.next()``` itu menerima input berupa String sehingga kita harus mengkonversinya ke char dan kita harus mengambil 1 karakter dari String itu. ```charAt(0)``` disini berarti kita mengambil karakter index ke-0 dari String tersebut, kita mengambil index ke-0 karena index String itu dimulai dari 0 bukan 1.

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

__Jawaban__

Nomor 1:


```Java
import java.util.Scanner;

int bilangan1, bilangan2, bilanganTerbesar;
Scanner in = new Scanner(System.in);

System.out.print("Masukkan Bilangan Bulat Pertama: ");
bilangan1 = in.nextInt();
System.out.print("Masukkan Bilangan Bulat Kedua: ");
bilangan2 = in.nextInt();

bilanganTerbesar = (bilangan1 > bilangan2) ? bilangan1 : bilangan2;
System.out.println("Bilangan Terbesar: " + bilanganTerbesar);
```

    Masukkan Bilangan Bulat Pertama: 4
    Masukkan Bilangan Bulat Kedua: 5
    Bilangan Terbesar: 5

>Kode diatas diawali dengan menginisialisasi variabel ```bilangan1, bilangan2, bilanganTerbesar``` bertipe integer serta import dan menginisialisasi Scanner untuk menerima inputan. Lalu kita menyimpan inputan user ke dalam variabel ```bilangan1``` dan ```bilangan2```. Setelah itu kita menggunakan ternary operator untuk menentukan apakah nilai ```bilangan1``` lebih besar dari nilai ```bilangan2```, lalu dari situ ditentukan bilangan mana yang lebih besar dan memasukkannya ke dalam variabel ```bilanganTerbesar``` yang akan pada akhirnya di outputkan.

Nomor 2:


```Java
import java.util.Scanner;

int umur;
Scanner in =  new Scanner(System.in);

System.out.print("Masukkan umur kamu: ");
umur = in.nextInt();

if(umur >= 17){
    System.out.println("Boleh berkendara");
}else{
    System.out.println("Tidak boleh berkendara");
}
```

    Masukkan umur kamu: 18
    Boleh berkendara

>Kode diatas diawali dengan menginisialisasi variabel ```umur``` bertipe integer serta import dan menginisialisasi Scanner untuk menerima inputan. Lalu kita menyimpan inputan user ke dalam variabel ```umur```. Setelah itu kita melakukan pengecekkan dengan ```if``` apakah nilai umur lebih dari sama dengan 17. Bila iya maka akan output ```"Boleh berkendara"``` bila tidak maka akan output ```"Tidak boleh berkendara"```.

Nomor 3:


```Java
import java.util.Scanner;

float nilaiAkhir, nilaiUas, nilaiUts, nilaiKuis, nilaiTugas;
Scanner in = new Scanner(System.in);

System.out.print("Masukkan Nilai Tugas: ");
nilaiTugas = 0.2F * in.nextFloat();
System.out.print("Masukkan Nilai Kuis: ");
nilaiKuis = 0.1F * in.nextFloat();
System.out.print("Masukkan Nilai UTS: ");
nilaiUts = 0.3F * in.nextFloat();
System.out.print("Masukkan Nilai UAS: ");
nilaiUas = 0.4F * in.nextFloat();

nilaiAkhir = nilaiTugas + nilaiKuis + nilaiUts + nilaiUas;
System.out.println("Nilai akhir mahasiswa: " + nilaiAkhir);
if(nilaiAkhir < 65){
    System.out.println("Mahasiswa Remidi");
}
```

    Masukkan Nilai Tugas: 100
    Masukkan Nilai Kuis: 0
    Masukkan Nilai UTS: 0
    Masukkan Nilai UAS: 100
    Nilai akhir mahasiswa: 60.0
    Mahasiswa Remidi

>Kode diatas diawali dengan menginisialisasi variabel ```nilaiAkhir, nilaiUas, nilaiUts, nilaiKuis, nilaiTugas``` bertipe float serta import dan menginisialisasi Scanner untuk menerima inputan. Lalu kita mengalikan inputan dengan masing-masing desimal dari aturan nilai yang ada, contohnya ```nilaiTugas = 0.2F * in.nextFloat()```, diketahui bahwa nilai tugas diambil 20%, bentuk desimalnya 0.2. Kemudian kita mengalikan 0.2 tersebut dengan nilai inputan dan memasukkan hasilnya ke dalam variabel ```nilaiTugas```. Mengapa ada huruf "F" di belakang desimal? itu untuk menunjukkan bahwa 0.2 merupakan bilangan float. Setelah kita melakukan operasi masing-masing nilai, kita lalu mengakumulasi nilainya menjadi ```nilaiAkhir``` dan melakukan output nilai akhir tersebut. Setelah itu kita melakukan pengecekkan apakah variabel ```nilaiAkhir``` kurang dari 65, jika iya maka akan output ```"Mahasiswa Remidi"``` jika tidak maka tidak akan melakukan output.

Nomor 4:


```Java
import java.util.Scanner;

int hargaA, jmlA, totalA, hargaB, jmlB, totalB, hargaC, jmlC, totalC, totalBeli;
float diskon, totalBayar;
Scanner in = new Scanner(System.in);

//Barang A
System.out.print("Masukkan harga barang A\t\t:");
hargaA = in.nextInt();
System.out.print("Masukkan jumlah barang A\t:");
jmlA = in.nextInt();
totalA = hargaA * jmlA;

//Barang B
System.out.print("Masukkan harga barang B\t\t:");
hargaB = in.nextInt();
System.out.print("Masukkan jumlah barang B\t:");
jmlB = in.nextInt();
totalB = hargaB * jmlB;

//Barang C
System.out.print("Masukkan harga barang C\t\t:");
hargaC = in.nextInt();
System.out.print("Masukkan jumlah barang C\t:");
jmlC = in.nextInt();
totalC = hargaC * jmlC;

System.out.println("---------------------------------");
System.out.println("\tStruk Total");
System.out.println("---------------------------------");

System.out.println("Nama Barang\t|\tHarga\t|\tJumlah\t|\tTotal");
System.out.println("Barang A\t\t" + hargaA + "\t\t" + jmlA + "\t\t" + totalA);
System.out.println("Barang B\t\t" + hargaB + "\t\t" + jmlB + "\t\t" + totalB);
System.out.println("Barang C\t\t" + hargaC + "\t\t" + jmlC + "\t\t" + totalC);

//Hitung Total Pembelian sebelum diberi diskon
totalBeli = totalA + totalB + totalC;
System.out.println("Total\t\t:" + totalBeli);

//Hitung Diskon
if(totalBeli > 1000000){
    diskon = 0.1F * totalBeli;
}else if(totalBeli > 500000){
    diskon = 0.05F * totalBeli;
}else if(totalBeli > 200000){
    diskon = 0.02F * totalBeli;
}else{
    diskon = 0;
}
System.out.println("Diskon\t\t:" + diskon);

//Hitung Total yang perlu dibayar setelah diberi diskon
totalBayar = totalBeli - diskon;
System.out.println("Total Bayar\t:" + totalBayar);
```

    Masukkan harga barang A		:100000
    Masukkan jumlah barang A	:10
    Masukkan harga barang B		:250000
    Masukkan jumlah barang B	:5
    Masukkan harga barang C		:150000
    Masukkan jumlah barang C	:1
    ---------------------------------
    	Struk Total
    ---------------------------------
    Nama Barang	|	Harga	|	Jumlah	|	Total
    Barang A		100000		10		1000000
    Barang B		250000		5		1250000
    Barang C		150000		1		150000
    Total	    :2400000
    Diskon	    :240000.0
    Total Bayar	:2160000.0

>Kode diatas diawali dengan menginisialisasi variabel ```hargaA, jmlA, totalA, hargaB, jmlB, totalB, hargaC, jmlC, totalC, totalBeli``` bertipe integer dan variabel ```diskon, totalBayar``` bertipe float serta import dan menginisialisasi Scanner untuk menerima inputan.
><br>
>Lalu kita memasukkan inputan user ke dalam variabel yang sesuai, harga barang A ke dalam variabel ```hargaA``` lalu jumlah barang A ke dalam variabel ```jmlA```. Setelah itu kita mengakumulasikan jumlah barang dan harga tersebut dan memasukkan total harga barang A kedalam variabel ```totalA```. Langkah tadi juga dilakukan sama untuk barang B dan barang C. Setelah itu kita melakukan output variabel tadi dalam bentuk struk total. Lalu kita mengakumulasikan total harga barang A, B dan C dan memasukkan nilainya ke variabel ```totalBeli``` serta menampilkanya dalam bentuk output. 
><br>
>Setelah itu kita melakukan perhitungan diskon dengan melakukan pengecekan terlebih dahulu kepada variabel ```totalBeli```, jika ```totalBeli``` lebih dari 1000000 maka ktia menghitung diskon dengan rumus 10% dari ```totalBeli``` atau 0.1F dari ```totalBeli```, jika tidak lebih maka akan dilakukan pengecekan apakah lebih 500000, jika iya maka akan dihitung berdasar ketentuan diskon yang ada. Akan dicek terus sampai jika ```totalBeli``` tidak lebih dari 200000 yang berarti pembeli tidak mendapatkan diskon alias ```diskon = 0;```. Setelah itu ditampilkan jumlah diskonnya dalam bentuk output.
><br>
>Yang terakhir, kita menghitung ```totalBayar``` dengan mengurangi ```totalBeli``` dengan ```diskon``` untuk menentukan jumlah biaya yang harus dibayar pembeli dan menampilkannya dalam bentuk output.
```Java

```
