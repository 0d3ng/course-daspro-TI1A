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


Pertama menambah library scanner dengan import java.util.Scanner. Kemudian mendeklarasikan variabel pada scanner, dan deklerasi variabel bil dengan tipe data integer. Selanjutnya System.out.print untuk menampilkan output dan baris terakhir untuk memasukkan input ke variabel bil. 

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


Jika variabel bil mempunyai modulus 0, maka akan keluar bilangan genap, jika tidak maka keluar bilangan ganjil

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap ":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Ganjil


2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

Hasilnya akan sama karena tanda ? sama dengan if dan : sama dengan else.

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

    Masukkan sebuah bilangan: 104

Pertama mendeklarasikan variabel nilai dengan tipe data integer. Kemudian mengeluarkan output dan baris terakhir untuk memasukkan input ke variabel nilai.

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
// Ketik kode program di atas di bawah sini
if(nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah " + nilai);
```

    Hasil akhir nilai adalah 114


+ Jalankan program. Amati apa yang terjadi!

jika variabel nilai lebih besar sama dengan 100 maka nilai akan ditambah 10 jika kurang dari 100 maka akan dikurangi 10 dan di baris terakhir untuk mengeluarkan output nilai.

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

1. nilai+=10; berfungsi untuk menambahkan variabel nilai jadi nilai = nilai + 10 sedangkan nilai-=10; berfungsi untuk mengurangi variabel nilai jadi nilai = nilai - 10

2. 
```Java
int rata, nilai1;
System.out.print("Masukkan bilangan 1: ");
nilai1 = input.nextInt();

int nilai2;
System.out.print("Masukkan bilangan 2: ");
nilai2 = input.nextInt();

rata = nilai1 + nilai2 / 2;
if(rata >= 100){
    rata -= 5;
}
System.out.println("Hasil akhir nilai adalah " + rata);
```

    Masukkan bilangan 1: 100
    Masukkan bilangan 2: 100
    Hasil akhir nilai adalah 145


#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur anda: ");
umur = input.nextInt();
```
Pertama menambah library scanner. Kemudian mendeklarasikan variabel pada scanner, dan deklerasi variabel umur dengan tipe data integer. Selanjutnya System.out.print untuk menampilkan output dan baris terakhir untuk memasukkan input ke variabel umur. 

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

    Tua

Jika inputan variabel umur lebih besar dari 60 maka akan menghasilkan lansia. jika ternyata lebih kecil dari 60 maka akan mengeluarkan tua. jika lebih kecil lagi dari 45 maka akan mengeluarkan dewasa. jika lebih kecil dari 17 maka mengeluarkan anak-anak. Jika lebih kecil lagi maka akan mengeluarkan balita.

+ Jalankan program dan amati apa yang terjadi!

Yang terjadi adalah jika memasukkan umur 50 maka akan melewati proses pertama kemudian akan dilanjutkan sampai bertemu dengan ketentuan yang sesuai yaitu yang mengeluarkan output Tua.

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

Deklarasikan variabel pada scanner, dan deklerasi variabel angka1, angka2, hasil dengan tipe data double dan juga operator menggunakan tipe data char.

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

    Masukkan angka pertama: 1
    Masukkan angka kedua: 4
    Masukkan operator (+ - * /): +

Mengeluarkan keluaran kemudian inputan untuk variabel angka1 dan seterusnya

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

    1.0 + 4.0 = 5.0

Switch digunakan untuk mengecek value dari variabel operator, jika operator sesuai dengan salah satu case maka akan dikeluarkan output sesuai dengan casenya. Jika tidak ada case yang sesuai maka akan mengeluarkan output yang ada di default.

5. Jalankan program. Amati apa yang terjadi!

Saat saya memasukkan pada variabel angka1 = 1, angka2 = 4, operator = + maka akan sesuai dengan case pertama dan melakukan perintah 1 + 4 dan hasilnya adalah 5.

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```
1. Fungsi dari break sendiri adalah sebagai pembatas antar case, sedangkan default sebagai perintah jika tidak ada case yang sesuai (sama dengan else).
2. 

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

1. 


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bil1;
System.out.print("Masukkan bilangan 1: ");
bil1 = sc.nextInt();

int bil2;
System.out.print("Masukkan bilangan 2: ");
bil2 = sc.nextInt();

if(bil1 > bil2){
    System.out.println(bil1);
}else{
    System.out.println(bil2);
}
```

    Masukkan bilangan 1: 10
    Masukkan bilangan 2: 12
    12


2. 


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur anda: ");
umur = sc.nextInt();
String output = (umur >= 17) ? "Boleh berkendara ":"Tidak boleh berkendara";
System.out.println(output);
```

    Masukkan umur anda: 19
    Boleh berkendara 

3. 


```Java
import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    int uas, uts, kuis, tugas, nilaiA;

    System.out.print("Masukkan nilai UAS   : ");
    uas = sc.nextInt();
    System.out.print("Masukkan nilai UTS   : ");
    uts = sc.nextInt();
    System.out.print("Masukkan nilai Kuis  : ");
    kuis = sc.nextInt();
    System.out.print("Masukkan nilai Tugas : ");
    tugas = sc.nextInt();

    nilaiA = (40 * uas / 100) + (30 * uts / 100) + (10 * kuis / 100) + (20 * tugas / 100);

    System.out.println("Nilai akhir : " + nilaiA);
    if(nilaiA < 65){
        System.out.println("Perlu Remidi");
    }else{
        System.out.println("Tidak perlu Remidi");
    }
```

    Masukkan nilai UAS   : 100
    Masukkan nilai UTS   : 50
    Masukkan nilai Kuis  : 60
    Masukkan nilai Tugas : 95
    Nilai akhir : 80
    Tidak perlu Remidi


4. 


```Java
import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    int hargaA, hargaB, hargaC, total, totalA, totalB, totalC, bayar, jumlahA, jumlahB, jumlahC;

    System.out.print("Masukkan harga barang A  : ");
    hargaA = sc.nextInt();
    System.out.print("Masukkan jumlah barang A : ");
    jumlahA = sc.nextInt();
    System.out.print("Masukkan harga barang B  : ");
    hargaB = sc.nextInt();
    System.out.print("Masukkan jumlah barang B : ");
    jumlahB = sc.nextInt();
    System.out.print("Masukkan harga barang C  : ");
    hargaC = sc.nextInt();
    System.out.print("Masukkan jumlah barang C : ");
    jumlahC = sc.nextInt();

    totalA = (hargaA * jumlahA); 
    totalB = (hargaB * jumlahB);
    totalC = (hargaC * jumlahC);
    total = (hargaA * jumlahA) + (hargaB * jumlahB) + (hargaC * jumlahC);
    
    System.out.println("-----------------------------------------------");
    System.out.println("|                 Struk total                 |");
    System.out.println("-----------------------------------------------");
    System.out.println("| Nama Barang |  Harga  |  Jumlah |   Total   |");
    System.out.println(" Barang A       " + hargaA + " \t" + jumlahA + " \t" + totalA);
    System.out.println(" Barang B       " + hargaB + " \t" + jumlahB + " \t" + totalB);
    System.out.println(" Barang C       " + hargaC + " \t" + jumlahC + " \t" + totalC);

    System.out.println("Total : " + total);
    int diskon1, diskon2, diskon3;
    if(total >= 1000000){
        diskon1 = 10 * total /100;
        bayar = total - diskon1;
        System.out.println("Diskon : " + diskon1);
        System.out.println("Total bayar : " + bayar);
    }else if(total >= 500000){
        diskon2 = 5 * total /100;
        bayar = total - diskon2;
        System.out.println("Diskon : " + diskon2);
        System.out.println("Total bayar : " + bayar);
    }else if(total >= 200000){
        diskon3 = 2 * total /100;
        bayar = total - diskon3;
        System.out.println("Diskon : " + diskon3);
        System.out.println("Total bayar : " + bayar);
    }else{
        bayar = total;
        System.out.println("Tidak mendapat diskon");
        System.out.println("Total bayar : " + bayar);
    }
```

    Masukkan harga barang A  : 100000
    Masukkan jumlah barang A : 10
    Masukkan harga barang B  : 250000
    Masukkan jumlah barang B : 5
    Masukkan harga barang C  : 150000
    Masukkan jumlah barang C : 1
    -----------------------------------------------
    |                 Struk total                 |
    -----------------------------------------------
    | Nama Barang |  Harga  |  Jumlah |   Total   |
     Barang A       100000 	10 	1000000
     Barang B       250000 	5 	1250000
     Barang C       150000 	1 	150000
    Total : 2400000
    Diskon : 240000
    Total bayar : 2160000

