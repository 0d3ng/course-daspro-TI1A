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

    Masukkan sebuah bilangan: 15


Kode ini mempunyai fungsi untuk memasukkan data agar dapat diseleksi pada program setelahnya. 

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


Kode tersebut mempunyai fungsi untuk menyeleksi bilangan agar menjadi salah satu dari dua output, yaitu bilangan ganjil atau bilangan genap.

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Ganjil


Kode tersebut sekedar atau hanya memiliki sintaks yang beda, namun memiliki konsep yang sama.

Karena kode tersebut mempunyai fungsi untuk menginput atau memasukkan data agar bisa diseleksi pada program setelahnya.

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

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

    Masukkan sebuah bilangan: 15


Kode ini berfungsi untuk menghitung suatu bilangan. Apabila bilangan tersebut diatas 100, maka nilai bilangan akan ditambah 10. Apabila sebaliknya, maka nilai bilangan akan dikurangi dengan 10. 

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

    Hasil akhir nilai adalah 5




+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

Kode tersebut fungsinya adalah untuk menambah atau mengurangi bilangan awal dengan angka 10.

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

    Masukkan umur Anda: 19


Kode program diatas adalah berguna untuk menginput atau memasukkan umur.

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


Program diatas adalah berfungsi untuk mengetahui umur yang diinput adalah diantaranya lansia, tua, dewasa, anak-anak, atau balita. 

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

Program diatas digunakan untuk membuat suatu variabel.

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
    Masukkan angka kedua: 3
    Masukkan operator (+ - * /): +


Kode tersebut berguna dipakai untuk memasukkan 2 bilangan, dan menghitung bilangan tersebut (menambah, mengurangi, mengali, membagi).

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

    2.0 + 3.0 = 5.0


Kode diatas adalah untuk mengetahui hasil dari penghitungan bilangan di atas.

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

1.Dipakai untuk apabila input atau masukkan tidak sesuai dengan program.

2.Dipakai untuk mengambil suatu karakter.

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
//1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil1, bil2;
System.out.print("Masukkan bilangan pertama: ");
bil1 = input.nextInt();
System.out.print("Masukkan bilangan kedua: ");
bil2 = input.nextInt();
if(bil1 > bil2){
System.out.println(bil1);
}else{
System.out.println(bil2);
} 

```

    Masukkan bilangan pertama: 2
    Masukkan bilangan kedua: 3
    3


Kode tersebut dipakai untuk membandingkan dua bilangan, dengan cara yaitu memasukkan atau menginput kedua bilangan, kemudian menyeleksi, dan mengeluarkan output atau keluaran bilangan yang jumlahnya paling besar.


```Java
//2
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur: ");
umur = input.nextInt();
if(umur >= 17){
System.out.print("Boleh berkendara");
}else{
System.out.print("Belum boleh berkendara");
}

```

    Masukkan umur: 19
    Boleh berkendara

Kode program di atas mempunyai fungsi untuk mengetahui pada umur berapa warga negara boleh mengendarai kendaraan bermotor. Cara kerjanya adalah dengan cara memasukkan umur, kemudian menyeleksinya, apabila umur kurang dari 17 maka akan mengeluarkan output tidak boleh berkendara dan sebaliknya apabila umur 17 keatas maka akan mengeluarkan output boleh berkendara. 


```Java
//3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai1, nilai2, nilai3, nilai4, nilai5;
System.out.print("Masukkan nilai uas");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai uts");
nilai2 = input.nextInt();
System.out.print("Masukkan nilai kuiz");
nilai3 = input.nextInt();
System.out.print("Masukkan nilai tugas");
nilai4 = input.nextInt();
nilai5 = (nilai1 * 40/100) + (nilai2 * 30/100) + (nilai3 * 10/100) + (nilai4 * 20/100);
if(nilai5 < 65){
System.out.print("Remidi");
}else{
System.out.print("Tidak remidi");
}

```

    Masukkan nilai uas80
    Masukkan nilai uts80
    Masukkan nilai kuiz80
    Masukkan nilai tugas80
    Tidak remidi

Kode diatas adalah untuk mengetahui siswa tersebut remidi atau tidak. Cara bekerjanya adalah dengan cara menginput atau memasukkan 4 nilai, yaitu uas, uts, kuis, dan tugas. Kemudian dibagi setiap bagian, contoh uas mengambil nilai 40%, uts 30%, kuiz 10%, dan tugas 20%. Selanjutnya nilai akan diseleksi, apabila nilai diatas 65 maka akan mengeluarkan output tidak remidi, namun apabila nilai dibawah 65 maka akan mengeluarkan output remidi. 


```Java
//4
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int hargaA, hargaB, hargaC, jumlahA, jumlahB, jumlahC, totalbarangA, totalbarangB, totalbarangC, totalkeseluruhan, totalbayar, diskon, totaldiskon1, totaldiskon2, totaldiskon3;
System.out.print("Masukkan Harga Barang A: ");
hargaA = input.nextInt();
System.out.print("Masukkan Jumlah Barang A: ");
jumlahA = input.nextInt();
System.out.print("Masukkan Harga Barang B: ");
hargaB = input.nextInt();
System.out.print("Masukkan Jumlah Barang B: ");
jumlahB = input.nextInt();
System.out.print("Masukkan Harga Barang C: ");
hargaC = input.nextInt();
System.out.print("Masukkan Jumlah Barang C: ");
jumlahC = input.nextInt();
System.out.print("Struk total");
totalbarangA = hargaA * jumlahA;
totalbarangB = hargaB * jumlahB;
totalbarangC = hargaC * jumlahC;
totalkeseluruhan = totalbarangA + totalbarangB + totalbarangC;
totalbayar = totalkeseluruhan - diskon;
System.out.println("Barang A");
System.out.println("Harga barang A: " + jumlahA);
System.out.println("Jumlah barang A: " + jumlahA);
System.out.println("Total Harga Barang A: " + totalbarangA);
System.out.println("Barang B");
System.out.println("Harga barang B: " + jumlahB);
System.out.println("Jumlah barang B: " + jumlahB);
System.out.println("Total Harga Barang B: " + totalbarangB);
System.out.println("Barang C");
System.out.println("Harga barang C: " + jumlahC);
System.out.println("Jumlah barang C: " + jumlahC);
System.out.println("Total Harga Barang C: " + totalbarangC);
System.out.println("Total      :" + totalkeseluruhan);
if(totalkeseluruhan > 1000000)
System.out.println("Diskon     :" + totalkeseluruhan * 10 / 100);
else if(totalkeseluruhan > 500000)
System.out.println("Diskon     :" + totalkeseluruhan * 5 / 100);
else if(totalkeseluruhan > 200000)
System.out.println("Diskon     :" + totalkeseluruhan * 2 / 100);
else
System.out.println("Total      :" + totalkeseluruhan);
if(totalkeseluruhan > 1000000)
System.out.println("Diskon     :" + totalkeseluruhan * 10 / 100);
else if(totalkeseluruhan > 500000)
System.out.println("Diskon     :" + totalkeseluruhan * 5 / 100);
else if(totalkeseluruhan > 200000)
System.out.println("Diskon     :" + totalkeseluruhan * 2 / 100);
else
System.out.println("Diskon     : 0");
if(totalkeseluruhan > 1000000)
System.out.println("Total Bayar:" + (totalkeseluruhan - totalkeseluruhan * 10 / 100));
else if(totalkeseluruhan > 500000)
System.out.println("Total Bayar:" + (totalkeseluruhan - totalkeseluruhan * 5 / 100));
else if(totalkeseluruhan > 200000)
System.out.println("Total Bayar:" + (totalkeseluruhan - totalkeseluruhan * 2 / 100));
else
System.out.println("Total Bayar:" + totalkeseluruhan);
```

    Masukkan Harga Barang A: 100000
    Masukkan Jumlah Barang A: 10
    Masukkan Harga Barang B: 250000
    Masukkan Jumlah Barang B: 5
    Masukkan Harga Barang C: 150000
    Masukkan Jumlah Barang C: 1
    Struk totalBarang A
    Harga barang A: 10
    Jumlah barang A: 10
    Total Harga Barang A: 1000000
    Barang B
    Harga barang B: 5
    Jumlah barang B: 5
    Total Harga Barang B: 1250000
    Barang C
    Harga barang C: 1
    Jumlah barang C: 1
    Total Harga Barang C: 150000
    Total      :2400000
    Diskon     :240000
    Diskon     :240000
    Total Bayar:2160000


Kode program di atas berfungsi untuk menghitung diskon pada belanjaan. Cara kerjanya yaitu memasukkan input Barang A, Barang B, dan Barang C, baik jumlah barang maupun harga barang. Kemudian selanjutnya akan memunculkan total harga pada setiap barang berdasarkan harga barang dan jumlah yang dibeli. Selanjutnya semua harga barang akan ditotal. Diskon akan muncul berdasarkan harga barang. Jika harga barang tersebut diatas 1000000, maka akan memunculkan diskon 10%, jika harga barang tersebut diatas 500000, maka akan memunculkan diskon 5%, jika harga barang tersebut diatas 200000, maka akan memunculkan diskon 2%, namun apabila barang dibawah nilai  tersebut, maka tidak akan muncul diskon. Setelah menentukan diskon maka harga total pada barang akan dikurangkan dengan harga total barang * diskon. Kemudian akan memunculkan output berapa harga total akhir yang harus dibayar pembeli.


