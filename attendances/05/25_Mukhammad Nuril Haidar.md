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

    Masukkan sebuah bilangan : 12


- import java.util.Scanner digunakan untuk menambahkan library scanner
- Scanner input = new Scanner(System.in) untuk mendeklarasikan variabel pada scanner
- int bil deklarasi variabel bil dengan tipe data integer
- System.out.print("Masukkan sebuah bilangan : ") untuk mengeluarkan output
- bil = input.nextInt() untuk memasukkan input pada variabel bil

3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
if(bil%2 == 0){
    System.out.println("Bilangan Genap");
} else {
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Genap


Jika bil mempunyai modulus atau sisa bagi sama dengan 0, maka akan memunculkan output Bilangan Genap, sedangkan jika tidak maka akan memunculkan output Bilangan Ganjil

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap


2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

- JAWABAN
3. Hasil nya tetap bilangan genap
4. Karena "?" sama saja dengan if dan ":" sama saja dengan else pada operasi if..else..

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
int nilai;
System.out.print("Masukkan sebuah bilangan : ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan : 70


- int nilai untuk mendeklarasikan variabel nilai dengan tipe data integer
- System.out.print("Masukkan sebuah bilangan : ") untuk mengeluarkan output
- nilai = input.nextInt() untuk memasukkan input pada variabel nilai

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
if(nilai >= 100){
    nilai += 10;
} else {
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah " + nilai);
```

    Hasil akhir nilai adalah 60


+ Jalankan program. Amati apa yang terjadi!

Jika nilai lebih dari sama dengan 100 maka nilai akan ditambah 10, jika tidak maka akan dikurangi 10. Jadi, jika saya memasukkan variabel nilai 70 maka akan dikurangi 10 menjadi 60.

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

NOMOR 1
- nilai +=10 sama dengan nilai = nilai+10
- nilai -=10 sama dengan nilai = nilai-10

NOMOR 2


```Java
System.out.println("Masukkan angka kesatu : ");
angka1 = input.nextInt();
System.out.println("Masukkan angka kedua : ");
angka2 = input.nextInt();

if(angka1 > angka2){
    System.out.println("Bilangan Terbesar adalah " + angka1);
} else {
    System.out.println("Bilangan Terbesar adalah " + angka2);
}
```

    Masukkan angka kesatu : 
    12
    Masukkan angka kedua : 
    87
    Bilangan Terbesar adalah 87.0


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
System.out.print("Masukkan umur anda : ");
umur = input.nextInt();
```

    Masukkan umur anda : 18


- import java.util.Scanner untuk menambahkan library scanner
- Scanner input = new Scanner(System.in) untuk mendeklarasikan variabel pada scanner
- int umur untuk mendeklarasikan variabel umur dengan tipe data integer
- System.out.print("Masukkan umur anda : ") untuk mengeluarkan output
- umur = input.nextInt() untuk menambahkan input pada variabel umur

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
if(umur > 60)
    System.out.println("Lansia");
else if(umur > 45)
    System.out.println("Tua");
else if(umur > 17)
    System.out.println("Dewasa");
else if(umur > 5)
    System.out.println("Anak-Anak");
else
    System.out.println("Balita");
```

    Dewasa


+ Jalankan program dan amati apa yang terjadi!

Yang terjadi jika saya memasukkan 18 pada umur maka proses tidak akan berjalan pada if yang pertama, dan akan berlanjut hingga kondisi yang ditentukan sesuai dengan variabel umur, yaitu pada kondisi ke 3. Sehingga output yang diberikan adalah Dewasa.

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

- import java.util.Scanner untuk menambahkan library scanner
- Scanner sc = new Scanner(System.in) untuk mendeklarasikan variabel pada scanner
- double angka1, angka2, hasil untuk mendeklarasikan variabel angka1, angka2, dan hasil dengan tipe data double
- char operator unruk mendeklarasikan variabel operator dengan tipe data char

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
System.out.println("Masukkan angka pertama : ");
angka1 = sc.nextDouble();
System.out.println("Masukkan angka kedua : ");
angka2 = sc.nextDouble();
System.out.println("Masukkan operator (+ - * /)");
operator = sc.next().charAt(0);
```

    Masukkan angka pertama : 
    12
    Masukkan angka kedua : 
    12
    Masukkan operator (+ - * /)
    *


- System.out.println("Masukkan angka pertama : ") untuk mengeluarkan output
- angka1 = sc.nextDouble() untuk menambahkan input pada variabel angka1
- System.out.println("Masukkan angka kedua : ") untuk mengeluarkan output
- angka2 = sc.nextDouble() untuk menambahkan input pada variabel angka1
- System.out.println("Masukkan operator (+ - * /)") untuk mengeluarkan output
- operator = sc.next().charAt(0) untuk menambahkan input pada variabel angka1

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
switch(operator){
    case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "+" + angka2 + "=" + hasil);
    break;
    case '-':
        hasil = angka1 - angka2;
        System.out.println(angka1 + "-" + angka2 + "=" + hasil);
    break;
    case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + "*" + angka2 + "=" + hasil);
    break;
    case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + "/" + angka2 + "=" + hasil);
    break;
    default:
        System.out.println("Operator yang anda masukkan salah");
}
```

    12.0*12.0=144.0


5. Jalankan program. Amati apa yang terjadi!

Switch digunakan untuk mengecek value dari variabel operator, jika operator sesuai dengan salah satu case maka akan dikeluarkan output sesuai dengan casenya. Jika tidak ada case yang sesuai maka akan mengeluarkan output yang ada di default. Maka jika output an yang saya masukkan pada angka1 adalah 12 ,angka2 12 dan operator *, maka sesuai dengan case ke 3 angka 1 akan dikalikan dengan angka 2 

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

1. Fungsi break sebagai pembatas antar case, sedangkan default digunakan sebagai perintah jika tidak ada case yang sesuai
2. operator = sc.next().chartAt(0) berfungsi untuk mengambil inputan char pada baris pertama

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

NOMOR 1


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;

System.out.print("Masukkan Umur : ");
umur = input.nextInt();

if(umur >= 17){
    System.out.println("Boleh Berkendara");
} else {
    System.out.println("Tidak Boleh Berkendara");
}
```

    Masukkan Umur : 17
    Boleh Berkendara


Jika umur lebih dari sama dengan 17 maka boleh berkendara, jika tidak maka tidak boleh berkendara

NOMOR 2


```Java
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
double rata2, angka1, angka2;
System.out.print("Masukkan nilai 1 : ");
angka1 = scan.nextDouble();
System.out.print("Masukkan nilai 2 : ");
angka2 = scan.nextDouble();

rata2 = (angka1 + angka2) / 2;
if(rata2 >= 100){
    rata2 -= 5;
    System.out.print("Rata-rata = " + rata2);
} else {
    System.out.print("Rata-rata = " +rata2);
}
```

    Masukkan nilai 1 : 2398
    Masukkan nilai 2 : 234
    Rata-rata = 1311.0

Untuk mencari rata2, maka kita harus memasukkan 2 variabel lalu membaginya dengan 2. Dan jika rata2 lebih dari sama dengan 100 maka rata2 akan dikurangi 5, jika tidak maka akan langsung menampilkan hasil rata2

NOMOR 3


```Java
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
double uas, uts, kuis, tugas, nilai_akhir;

System.out.print("Masukkan nilai UAS \t: ");
uas = scan.nextDouble();
System.out.print("Masukkan nilai UTS \t: ");
uts = scan.nextDouble();
System.out.print("Masukkan nilai Kuis \t: ");
kuis = scan.nextDouble();
System.out.print("Masukkan nilai Tugas \t: ");
tugas = scan.nextDouble();

System.out.println("");

nilai_akhir = (0.4*uas)+(0.3*uts)+(0.1*kuis)+(0.2*tugas);
System.out.println("Nilai Akhir anda adalah " + nilai_akhir);

if(nilai_akhir < 65){
    System.out.println("Anda Remidi");
} else {
    System.out.println("Anda Tidak Remidi");
}
```

    Masukkan nilai UAS 	: 50
    Masukkan nilai UTS 	: 50
    Masukkan nilai Kuis 	: 50
    Masukkan nilai Tugas 	: 50
    
    Nilai Akhir anda adalah 50.0
    Anda Remidi


Pada inputan UAS, UTS, Kuis, Tugas akan dikali masing2 0.4, 0.3, 0.1, 0.2. Setelah itu jika rata2 kurang dari 65 maka akan muncul output Anda Remidi, jika tidak maka akan muncul Anda Tidak Remidi

NOMOR 4


```Java
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
double hargaA, hargaB, hargaC, jumlahA, jumlahB, jumlahC, total, diskon, hasilAkhir;

System.out.print("Masukkan harga barang A \t: ");
hargaA = scan.nextDouble();
System.out.print("Masukkan jumlah barang A \t: ");
jumlahA = scan.nextDouble();
System.out.print("Masukkan harga barang B \t: ");
hargaB = scan.nextDouble();
System.out.print("Masukkan jumlah barang B \t: ");
jumlahB = scan.nextDouble();
System.out.print("Masukkan harga barang C  \t: ");
hargaC = scan.nextDouble();
System.out.print("Masukkan jumlah barang C \t: ");
jumlahC = scan.nextDouble();

System.out.println("");

total = (hargaA * jumlahA)+(hargaB * jumlahB)+(hargaC * jumlahC);
System.out.println("Total \t\t: " + total);

if(total > 200000 && total < 500000){
    diskon = total*0.02;
    hasilAkhir = total-diskon;
    System.out.println("Diskon \t\t: " + diskon);
    System.out.println("Total Bayar \t: " + hasilAkhir);
} else if(total > 500000 && total < 1000000){
    diskon = total*0.05;
    hasilAkhir = total-diskon;
    System.out.println("Diskon \t\t: " + diskon);
    System.out.println("Total Bayar \t: " + hasilAkhir);
} else if(total > 1000000) {
    diskon = total*0.1;
    hasilAkhir = total-diskon;
    System.out.println("Diskon \t\t: " + diskon);
    System.out.println("Total Bayar \t: " + hasilAkhir);
} else {
    System.out.println("Diskon \t\t: " + "-");
    System.out.println("Total Bayar \t: " + total);
}
```

    Masukkan harga barang A 	: 100000
    Masukkan jumlah barang A 	: 10
    Masukkan harga barang B 	: 250000
    Masukkan jumlah barang B 	: 5
    Masukkan harga barang C  	: 150000
    Masukkan jumlah barang C 	: 1
    
    Total 		: 2400000.0
    Diskon 		: 240000.0
    Total Bayar 	: 2160000.0


Total dihitung dari harga dan jumlah dari masing2 barang, dan jika total memenuhi salah satu kondisi dari if..elseif.. maka output akan sesuai dengan kondisi tersebut
