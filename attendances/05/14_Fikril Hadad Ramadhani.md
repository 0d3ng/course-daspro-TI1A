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
System.out.print("Masukkan sebuah bilangan : ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan : 45

    penjelasan :
    perintah import ditulis agar kita bisa menggunakan library Scanner untuk mengambil input dari user.
    sebelum digunakan, kita harus mendeklarasikannya dengan perintah Scanner.
    untuk mengambil input dari user, kita perlu menyiapkan wadahnya, yaitu variabel. 
    disini kita memakai variabel integer yang dapat menampung bilangan bulat.
    perintah system out kita jalankan untuk meminta input dari user, kemudian kita simpan ke dalam variabel bil yang dideklarasikan dengan perintah bil. = input.nextInt();


3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
// Ketik kode program di atas di bawah sini
if (bil % 2 == 0) {
    System.out.println("Bilangan Genap");
} else {
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Ganjil

    perintah if else adalah perintah pemilihan.
    kita akan memasukkan kondisi ke dalam tanda kurung (...) setelah perintah if.
    kondisi yang kita terapkan pada program sederhana ini adalah apakah int bil dimodulus dengan 2 dan hasilnya 0
    jika kondisi ini benar, maka akan perintah system out pertama akan berjalan dan mencetak Bilangan Genap
    jika kondisi tidak terpenuhi atau salah, maka akan tercetak system out kedua, yaitu Bilangan Ganjil. 

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Ganjil

    memiliki dasar yang hampir sama dengan perintah if else, namun operator ternary satu ini berfokus pada 2 pilihan output saja, apakah sesuai dengan kondisi atau tidak.
    

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
// Ketik kode program di atas di bawah sini
 int nilai;
System.out.print("Masukkan sebuah bilangan : ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan : 56

    perintah system out meminta input dari user. 
    namun input hanya sebatas bilangan bulat saja 
    yang akan disimpan pada variabel bernama nilai

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
// Ketik kode program di atas di bawah sini
if (nilai >= 100) {
    nilai += 10;
} else {
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah " + nilai);
```

    Hasil akhir nilai adalah 46

    kondisi yang ditetapkan pada perintah if else ini adalah jika input user lebih dari 100, maka input tersebut akan di tambah 10 kemudian akan dicetak hasilnya
    selain itu, nilai akan dikurang 10 kemudian akan dicetak hasilnya

+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

kedua perintah tersebut akan menambahkan atau mengurangi nilai dari variabel. operasi akan dijalankan sesuai dengan kondisi yang telah kita tetapkan di if else

    1. fungsi dari kedua kode program tersebut adalah menambah atau mengurangi nilai pada variabel yang telah ada. tergantung apakah kondisi terpenuhi atau tidak
    2.

```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai1, nilai2;
System.out.print("Masukkan bilangan 1 : ");
nilai1 = input.nextInt();
System.out.print("Masukkan bilangan 2 : ");
nilai2 = input.nextInt();

float average = (nilai1 + nilai2) / 2f;

if (average >= 100) {
    average -= 5;
} 
System.out.println("Hasil rata-rata kedua bilangan : " + average);
input.close();
```

    Masukkan bilangan 1 : 23
    Masukkan bilangan 2 : 34
    Hasil rata-rata kedua bilangan : 28.5

    perintah import digunakan agar kita dapat menggunakan library Scanner.
    kemudian kita mendeklarasikan perintah scanner.
    menyiapkan variabel yang akan menampung input dari user.
    meminta input dari user dengan perintah system.out.print
    kemudian menyimpannya pada kedua variabel yang telah kita siapkan sebelumnya
    setelah itu, pada variabel average, kita menentukan rata-rata nilai.
    jika rata rata nilai diatas seratus, maka nilai rata-rata akan dikurangi 5 terlebh dahulu sebelum dicetak.
    selain itu, nilai rata-rata akan langsung dicetak dengan perintah system.out.print
    perintah input.close(); digunakan untuk menutup deklarasi Scanner pada awal kode program


#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner (System.in);
int umur;
System.out.print("Masukkan umur Anda : ");
umur = input.nextInt();
```

    Masukkan umur Anda : 20

    perintah system out meminta input dari user. 
    namun input hanya sebatas bilangan bulat saja 
    yang akan disimpan pada variabel bernama umur.

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
// Ketik kode program di atas di bawah sini
if (umur > 60) {
    System.out.println("Lansia");
} else if (umur >45) {
    System.out.println("Tua");
} else if (umur > 17) {
    System.out.println("Dewasa");
} else if (umur > 5 ) {
    System.out.println("Anak-anak");
} else {
    System.out.println("Balita");
}
```

    Dewasa

    perintah if else menandakan pemilihan
    terdapat beberapa kondisi yang telah kita tetapkan, yaitu
    pertama, jika input umur yang dimasukkan user nilainya lebih dari 60, maka 'Lansia' akan dicetak
    kedua, jika input umur yang dimasukkan user nilainya lebih dari 45, maka 'Tua' akan dicetak
    ketiga, jika input umur yang dimasukkan user nilainya lebih dari 17, maka 'Dewasa' akan dicetak
    keempat, jika input umur yang dimasukkan user nilainya lebih dari 5, maka 'Anak-anak' akan dicetak
    selain keempat kondisi itu, 'Balita' akan dicetak.

+ Jalankan program dan amati apa yang terjadi!

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;
```

    perintah import digunakan agar kit dapat menggunakan library Scanner
    kemudian kita mendeklarasikan Scanner sebelum memakainya
    membuat variabel yang digunakan untuk menampung input dari user

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
// Ketik kode program di atas di bawah sini
System.out.print("Masukkan angka pertama : ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua : ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /) : ");
operator = sc.next().charAt(0);
```

    Masukkan angka pertama : 4
    Masukkan angka kedua : 6
    Masukkan operator (+ - * /) : *

    ketiga perintah System.out.print digunakan untuk meminta input dari user
    yang nantinya akan disimpan pada tiga variabel yang berbeda, yaitu angka1, angka2, dan operator.


###### 4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
// Ketik kode program di atas di bawah sini
swith (operator) {
    case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 " = " + hasil);
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
    System.out.println("Operator yang anda masukkan salah");
}
```

    perintah switch case adalah perintah pemilihan
    bedanya dengan if else adalah switch case lebih mudah digunakan untuk inputan yang terbatas
    seperti pada kasus diatas, input dari user hanya diperbolehkan diantara 4 simbol aritmatika 
    jika user menginput salah satu dari simbol ini, program akan menjalankan operasi aritmatika untuk mengoperasikan dua angka yang sebelumnya telah diinput oleh user.
    selain dari 4 input yang diperbolehkan, maka akan muncul "Operator yang anda masukkan salah"

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

1. untuk memberi tanda kepada program agar hanya mencetak kalimat sebelum break dan mengakhiri program untuk perintah switch-case bila telah dipenuhi oleh salah satu kondisi.
2. untuk menyimpan input dari user berbentuk karakter.
    kode programnya agak berbeda dengan variabel lainnya. terutama pada kode next().charAt(0) yang artinya adalah, program akan menyimpan karakter pada indeks ke-0 pada suatu string.

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


```Java
import java.util.Scanner;
Scanner util = new Scanner(System.in);
int bil1,bil2;
System.out.print("Masukkan angka acak : ");
bil1 = util.nextInt();
System.out.print("Masukkan angka acak : ");
bil2 = util.nextInt();

if (bil1 > bil2) {
    System.out.println(bil1);
} else {
    System.out.println(bil2);
}
```
    Masukkan angka acak : 3
    Masukkan angka acak : 6
    6
```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur : ");
umur = input.nextInt();

String hasil = (umur >= 17) ? "Boleh berkendara":"Tidak boleh berkendara";
System.out.println(hasil);
```

    Masukkan umur : 34
    Boleh berkendara

```Java
import java.util.Scanner;
        Scanner soul = new Scanner(System.in);

        int uas, uts, kuis, tugas;
        float nilai;

        System.out.print("Masukkan nilai UAS : ");
        uas = soul.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        uts = soul.nextInt();
        System.out.print("Masukkan nilai kuis : ");
        kuis = soul.nextInt();
        System.out.print("Masukkan nilai tugas : ");
        tugas = soul.nextInt();

        nilai = (uas * 40 / 100f) + (uts * 30 / 100f) + (kuis * 10 / 100f) + (tugas * 20 / 100f);

        String hasil = (nilai < 65) ? "Remidi" : "Lulus";
        System.out.print(hasil);

        soul.close();
```

    Masukkan nilai UAS : 85
    Masukkan nilai UTS : 60
    Masukkan nilai kuis : 55
    Masukkan nilai tugas : 80
    Lulus

```Java
import java.util.Scanner;
        Scanner in = new Scanner(System.in);
        int hargaA, jumlahA, hargaB, jumlahB, hargaC, jumlahC;
        int totalA, totalB, totalC, jumlahTotal;
        float diskon, totalBayar;

        System.out.print("Masukkan harga barang A\t\t: ");
        hargaA = in.nextInt();
        System.out.print("Masukkan jumlah barang A\t: ");
        jumlahA = in.nextInt();
        System.out.print("Masukkan harga barang B\t\t: ");
        hargaB = in.nextInt();
        System.out.print("Masukkan jumlah barang B\t: ");
        jumlahB = in.nextInt();
        System.out.print("Masukan harga barang C\t\t: ");
        hargaC = in.nextInt();
        System.out.print("Masukkan jumlah barang C\t: ");
        jumlahC = in.nextInt();

        totalA = hargaA * jumlahA;
        totalB = hargaB * jumlahB;
        totalC = hargaC * jumlahC;
        jumlahTotal = totalA + totalB + totalC;

        System.out.println("--------------------------------------------------");
        System.out.println("\t\t\t\tStruk total");
        System.out.println("--------------------------------------------------");

        if (jumlahTotal > 1000000) {
            diskon = jumlahTotal * 10 / 100;
        } else if (jumlahTotal > 500000) {
            diskon = jumlahTotal * 5 / 100;
        } else if (jumlahTotal > 200000) {
            diskon = jumlahTotal * 2 / 100;
        } else {
            diskon = 0;
        }

        totalBayar = jumlahTotal - diskon;

        System.out.println("Nama Barang\t|\tHarga\t|\tJumlah\t|\tTotal");
        System.out.println(String.format("Barang A\t\t%d\t\t\t%d\t%d", hargaA, jumlahA, totalA));
        System.out.println(String.format("Barang B\t\t%d\t\t\t%d\t%d", hargaB, jumlahB, totalB));
        System.out.println(String.format("Barang C\t\t%d\t\t\t%d\t%d", hargaC, jumlahB, totalC));
        System.out.println("Total\t: " + jumlahTotal);
        System.out.println("Diskon\t: " + diskon);
        System.out.println("Total Bayar\t: " + totalBayar);

        in.close();
```

    Masukkan harga barang A		: 100000
    Masukkan jumlah barang A	: 10
    Masukkan harga barang B		: 250000
    Masukkan jumlah barang B	: 5
    Masukan harga barang C		: 150000
    Masukkan jumlah barang C	: 1
    --------------------------------------------------
        	    	Struk total
    --------------------------------------------------
    Nama Barang	|	Harga	|	Jumlah	|	Total
    Barang A		100000			10	1000000
    Barang B		250000			5	1250000
    Barang C		150000			5	150000
    Total	: 2400000
    Diskon	: 240000.0
    Total Bayar	: 2160000.0