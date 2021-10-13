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

    Masukkan sebuah bilangan: 10


Penjelasan :
1.	 Pada kode program diatas import java.util.Scanner;  digunakan untuk menambahkan library scanner. 
2.	Setelah itu, membuat deklarasi scanner dengan  Scanner input = new Scanner(System.in);
3.	Kemudian membuat variable bil untuk menampung data yaitu int bil;
4.	Selanjutnya menuliskan perintah untuk menginputkan sebuah bilangan menggunakan
System.out.print("Masukkan sebuah bilangan: ");
bil = input.nextInt();


3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
// Ketik kode program di atas di bawah sini
if(bil%2 == 0){
    System.out.print("Bilangan Genap: ");
}else{
    System.out.print("Bilangan Ganjil: ");
}

```

    Bilangan Genap: 

Penjelasan : kode program diatas digunakan untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil dengan menggunakan struktur pemilihan if.. else. Karena bilangan 10 bernilai benar maka pernyataan 1 yang akan dijalankan dan hasilnya adalah bilangan genap 



##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap


Penjelasan : pada kode program diatas itu menggunkan operator  ternary  yang memiliki bentuk umum sintaks (Condition) ? (kondisi jika true) : (kondisi jika false). Walaupun strktur pemilihan telah dimodifikasi outputnya tetap sama yaitu bilangan genap

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!
   Jawab : Karena yang dimodifikasi hanya di bagian penulisan struktur pemilihannya saja. Kondisi dan pernyataannya masih sama, sehingga walaupun struktur pemilihan dimodifikasi menggunakan operator ternary outputnya akan sama. Kode program yang telah dimodifikasi lebih singkat dari sebelumnya.

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

    Masukkan sebuah bilangan: 14


Penjelasan : int nilai; pada kode program diatas adalah sebuah variable nilai untuk menyimpan input dari keyboard. Int itu tipe data dan nilai merupakan variabel. Kemudian menuliskan perintah untuk menginputkan sebuah nilai  menggunakan 
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt(); 


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

    Hasil akhir nilai adalah 4


Penjelasan : kode program diatas digunakan untuk menambahkan sebuah kondisi  dimana dimana jika nilai kurang dari 100 maka nilai akan dikurangi 10 dan jika tidak maka akan ditambah 10. Kode program diatas menggunakan struktur pemilihan if..else. output kode program diatas yaitu hasil akhir nilai adalah 4. karena bilangan yang dimasukkan adalah 14 dimana 14 itu lebih kecil dari 100 sehingga nilai dikurangi dengan 10

+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```
    Jawab : 
    nilai+=10; ini adalah pernyataan 1, saat nilai tidak kurang dari 100 nilai akan ditambah 10
    nilai-=10; ini sebagai pernyataan 2, saat nilai kurang dari 100 maka nilai akan dikurang 10

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai1, nilai2,rataRata,hasil;

System.out.print("Masukkan nilai pertama: ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai kedua: ");
nilai2 = input.nextInt();
rataRata = (nilai1 + nilai2)/2;

if(rataRata >= 100){
    hasil -= 5;
}else{
    hasil = rataRata;
}
System.out.println("Hasil akhir nilai adalah " +hasil);

```

    Masukkan nilai pertama: 70
    Masukkan nilai kedua: 80
    Hasil akhir nilai adalah 75


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


Penjelasan : int umur; pada kode program diatas adalah sebuah variable umur untuk menyimpan input dari keyboard. Int itu tipe data dan umur merupakan variabel. Kemudian menuliskan perintah untuk menginputkan umur menggunakan 
System.out.print("Masukkan umur Anda: ");
umur = input.nextInt();


+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
// Ketik kode program di atas di bawah sini
if(umur > 60)
    System.out.println("Lansia");
else if(umur > 45)
    System.out.println("Tuaa");
else if(umur > 17)
    System.out.println("Dewasa");
else if(umur > 5)
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

    Dewasa


Penjelasan :   kode program diatas digunakan untuk mengecek variabel umur menggunakan struktur pemilihan ifelse-ifelse. Hasilnya adalah umur 18 itu masuk dalam pernyataan dewasa

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

Scanner sc = new Scanner(System.in); 
Perintah diatas digunakan untuk membuat deklarasi scanner, setelah itu yaitu membuat variabel-variabel seperti dibawah ini
double angka1, angka2, hasil;
char operator;


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

    Masukkan angka pertama: 14
    Masukkan angka kedua: 12
    Masukkan operator (+ - * /): +


Penjelasan : Kode program diatas digunakan untuk meminta inputan angka pertama, angka kedua , dan operator dari keyboard.

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
// Ketik kode program di atas di bawah sini
switch (operator){
    case '+':
    hasil = angka1 + angka2;
    System.out.println(angka1 + " + " + angka2 + " = " + hasil);
    break;
    case '-':
    hasil = angka1 + angka2;
    System.out.println(angka1 + " - " + angka2 + " = " + hasil);
    break;
    case '*':
    hasil = angka1 + angka2;
    System.out.println(angka1 + " * " + angka2 + " = " + hasil);
    break;
    case '/':
    hasil = angka1 + angka2;
    System.out.println(angka1 + " / " + angka2 + " = " + hasil);
    break;
    default:
    System.out.println("Operator yang Anda masukkan salah");
}
```

    14.0 + 12.0 = 26.0


Penjelasan : kode program diatas digunakan untuk mengecek operator yang digunakan sebelum dilakukan operasi aritmatika. Menggunakan sintaks pemilihan switch case. Sintaks pemilihan ini akan menjalankan salah satu dari beberapa pernyataan “case” sesuai dengan nilai kondisi yang ada di dalam “switch”. Selanjutnya proses akan dilanjutkan sampai ditemukan pernyataan “break”. Namun, jika tidak ada nilai pada case yang sesuai dengan nilai kondisi, maka proses akan dilanjutkan ke pernyataan yang ada di dalam “default”. output pada kode program diatas adalah 14.0 + 12.0 = 26.0

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
   Jawab : 
   -fungsi break adalah untuk melakukan stop jika perintah yang diberikan sudah dirasa cukup untuk case tersebut.
   -fungsi default adalah untuk mengeksekusi statement alternatif, yaitu jika nilai yang kita masukkan ternyata tidak sesuai  dengan nilai-nilai konstanta yang telah didefinisikan.
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```
    Jawab : kode diatas digunakan untuk memasukkan inputan

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.
    import java.util.Scanner;
    Scanner input = new Scanner(System.in);
    int bilBulat1,bilBulat2;
    System.out.print("Masukkan bilangan pertama: ");
    bilBulat1 = input.nextInt();
    System.out.print("Masukkan bilangan kedua: ");
    bilBulat2 = input.nextInt();

    if(bilBulat1>bilBulat2){
        System.out.println("Bilangan Terbesar");
    }else{
        System.out.println("Bilangan Terkecil");
    }

2. Perhatikan flowchart berikut ini:

![](images/02.png)

> Buatlah program sesuai dengan flowchart diatas!
    import java.util.Scanner;
    Scanner input = new Scanner(System.in);
    Int umur;

    System.out.print("Masukkan umur anda: ");
    umur = input.nextInt();

    if(umur >= 17){
        System.out.println("Boleh berkendara");
    }else{
        System.out.println("Tidak boleh berkendara ");
    }


3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!
    import java.util.Scanner;
    Scanner input = new Scanner(System.in);
    int nilaiUas,nilaiUts,kuis,tugas,nilaiAkhir;

    System.out.print("Masukkan nilai UAS: ");
    nilaiUas = input.nextInt();
    System.out.print("Masukkan nilai UTS: ");
    nilaiUts = input.nextInt();
    System.out.print("Masukkan nilai Kuis: ");
    kuis = input.nextInt();
    System.out.print("Masukkan nilai Tugas: ");
    tugas = input.nextInt();
    nilaiAkhir =  ( nilaiUas * 40/100 + nilaiUts * 30/100 + kuis * 10/100 + tugas * 20/100);

    if(nilaiAkhir <= 65){
        System.out.println("remidi");
    }else{
        System.out.println("Tidak remidi");
    }


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
    import java.util.Scanner;
    Scanner input = new Scanner(System.in);
    int hargaA,jumlahA,hargaB,jumlahB,hargaC,jumlahC;

    System.out.print("Masukkan harga barang A: ");
    hargaA = input.nextInt();
    System.out.print("Masukkan jumlah barang A: ");
    jumlahA = input.nextInt();
    System.out.print("Masukkan harga barang B: ");
    hargaB = input.nextInt();
    System.out.print("Masukkan jumlah barang B: ");
    jumlahB = input.nextInt();
    System.out.print("Masukkan harga barang C: ");
    hargaC = input.nextInt();
    System.out.print("Masukkan jumlah barang C: ");
    jumlahC = input.nextInt();

    int totalA = hargaA * jumlahA;
    int totalB = hargaB * jumlahB;
    int totalC = hargaC * jumlahC;

    int total = totalA + totalB +totalC;
    double diskon = 0;

    if (total >= 1000000) {
        diskon = total * 10 / 100;
    } else if (total >= 500000) {
        diskon = total * 5 / 100;
    } else if (total >= 200000) {
        diskon = total * 2 / 100;
    }

    System.out.println("----------------------------------");
    System.out.println("          Struk Total");
    System.out.println("----------------------------------");
    System.out.println("Nama barang\t\t\t|Harga\t\t\t|Jumlah\t\t\t|Total\t\t\t|");
    System.out.println("Barang A\t\t\t"+hargaA+"\t\t\t"+jumlahA+"\t\t\t"+totalA);
    System.out.println("Barang B\t\t\t"+hargaB+"\t\t\t"+jumlahB+"\t\t\t"+totalB);
    System.out.println("Barang C\t\t\t"+hargaC+"\t\t\t"+jumlahC+"\t\t\t"+totalC);
    System.out.println("Total\t\t\t: " + total);
    System.out.println("Diskon\t\t\t: " + diskon);
    System.out.println("Total Bayar\t\t: " + (total - diskon));



```Java

import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bilBulat1,bilBulat2;
System.out.print("Masukkan bilangan pertama: ");
bilBulat1 = input.nextInt();
System.out.print("Masukkan bilangan kedua: ");
bilBulat2 = input.nextInt();

if(bilBulat1>bilBulat2){
    System.out.println("Bilangan Terbesar");
}else{
     System.out.println("Bilangan Terkecil");
}

```

    Masukkan bilangan pertama: 18
    Masukkan bilangan kedua: 10
    Bilangan Terbesar



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;

System.out.print("Masukkan umur anda: ");
umur = input.nextInt();

if(umur >= 17){
System.out.println("Boleh berkendara");
}else{
System.out.println("Tidak boleh berkendara ");
}

```

    Masukkan umur anda: 18
    Boleh berkendara



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilaiUas,nilaiUts,kuis,tugas,nilaiAkhir;

System.out.print("Masukkan nilai UAS: ");
nilaiUas = input.nextInt();
System.out.print("Masukkan nilai UTS: ");
nilaiUts = input.nextInt();
System.out.print("Masukkan nilai Kuis: ");
kuis = input.nextInt();
System.out.print("Masukkan nilai Tugas: ");
tugas = input.nextInt();
nilaiAkhir =  ( nilaiUas * 40/100 + nilaiUts * 30/100 + kuis * 10/100 + tugas * 20/100);

if(nilaiAkhir <= 65){
System.out.println("remidi");
}else{
System.out.println("Tidak remidi");
}

```

    Masukkan nilai UAS: 70
    Masukkan nilai UTS: 80
    Masukkan nilai Kuis: 70
    Masukkan nilai Tugas: 90
    Tidak remidi



```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int hargaA,jumlahA,hargaB,jumlahB,hargaC,jumlahC;

System.out.print("Masukkan harga barang A: ");
hargaA = input.nextInt();
System.out.print("Masukkan jumlah barang A: ");
jumlahA = input.nextInt();
System.out.print("Masukkan harga barang B: ");
hargaB = input.nextInt();
System.out.print("Masukkan jumlah barang B: ");
jumlahB = input.nextInt();
System.out.print("Masukkan harga barang C: ");
hargaC = input.nextInt();
System.out.print("Masukkan jumlah barang C: ");
jumlahC = input.nextInt();

int totalA = hargaA * jumlahA;
int totalB = hargaB * jumlahB;
int totalC = hargaC * jumlahC;

int total = totalA + totalB +totalC;
double diskon = 0;

if (total >= 1000000) {
    diskon = total * 10 / 100;
} else if (total >= 500000) {
    diskon = total * 5 / 100;
} else if (total >= 200000) {
    diskon = total * 2 / 100;
}

System.out.println("----------------------------------");
System.out.println("          Struk Total");
System.out.println("----------------------------------");
System.out.println("Nama barang\t\t\t|Harga\t\t\t|Jumlah\t\t\t|Total\t\t\t|");
System.out.println("Barang A\t\t\t"+hargaA+"\t\t\t"+jumlahA+"\t\t\t"+totalA);
System.out.println("Barang B\t\t\t"+hargaB+"\t\t\t"+jumlahB+"\t\t\t"+totalB);
System.out.println("Barang C\t\t\t"+hargaC+"\t\t\t"+jumlahC+"\t\t\t"+totalC);
System.out.println("Total\t\t\t: " + total);
System.out.println("Diskon\t\t\t: " + diskon);
System.out.println("Total Bayar\t\t: " + (total - diskon));

```

    Masukkan harga barang A: 100000
    Masukkan jumlah barang A: 10
    Masukkan harga barang B: 250000
    Masukkan jumlah barang B: 5
    Masukkan harga barang C: 150000
    Masukkan jumlah barang C: 1
    ----------------------------------
              Struk Total
    ----------------------------------
    Nama barang			|Harga			|Jumlah			|Total			|
    Barang A			100000			10			1000000
    Barang B			250000			5			1250000
    Barang C			150000			1			150000
    Total			: 2400000
    Diskon			: 240000.0
    Total Bayar		: 2160000.0

