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
System.out.print("Masukkan sebuah bilangan ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan 10


Dalam code tersebut scanner di sana untuk memberikan scan library input sebuah bilangan. Lalu code program tersebut membuat program untuk memasukkan sebuah bilangan untuk dijalankan. 

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

    Bilangan Genap


Code program tersebut untuk menunjukkan hasil genap atau ganjl sebuah bilangan yang telah kita masukkan sebelumnya

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap

Jadi dalam code tersebut untuk menunjukkan hasil bilangan yang dimasukkkan hasilnya bilangan genap

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

    Masukkan sebuah bilangan: 5


Dalam code program tersebut membuat sebuah perintah untuk memasukkan sebuah bilangan untuk dijalankan

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

    Hasil akhir nilai adalah -5


jadi jika kita menggunakan perintah if nilai lebih dari sama dengan 100 maka bilangan yang kita masukkan atau input akan dtambah dengan 10 dan jika kurang dari sama dengan 100 maka dikurangi 10. Contoh bilangan yang saya pilih 5 dan 5 lebih kecil sama dengan 100 jadi dikurang 10 menjadi -5

+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

Jawab:
1. program nilai += 10 atau juga bisa ditulis dengan nilai = nilai + 10 berarti merubah value dari variabel nilai dengan valuenya sendiri ditambah 10. Jadi value dari variable nilai akan berganti dengan hasil semula ditambah 10. Begitujuga dengan nilai -= 10

2.
```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai1, nilai2;
int hasil;
System.out.print("Masukkan nilai1: ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai2: ");
nilai2 = input.nextInt();
hasil = (nilai1 + nilai2)/2;

if(hasil >= 100) {
    hasil -= 5;
}
System.out.println("Hasil akhir nilai adalah " + hasil)
```

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


Dalam Code program tersebut terdapat int yang digunakan untuk memasukkan input berupa bilangan bulat yang menunjukkan umur

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


Dalam code program tersebut tertulis bahwa jika ada perintah if umur lebih dari 60 tahun dikatakan lansia, jika umur lebih dari 45 tahun dan di bawah 60 tahun dikatakan tua, umur lebih dari 17 tahun dan di bawah 45 tahun dikatakan dewasa, umur lebih dari 5 tahun dan di bawah 17 tahun dikatakan anak-anak, dan jika umur di bawah umur 5 tahun dikatakan balita. Dan saya mengambil contoh input umur 19 tahun dan hasilnya dewasa

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

dalam code program tersebut terdapat scanner untuk memasukkan data library berupa input bilangan bulat dan sistem operator karena tipe dataya berupa double dan char

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

    Masukkan angka pertama: 10
    Masukkan angka kedua: 5
    Masukkan operator (+ - * /): +


Code program tersebut berisi perintah untuk memasukkan input berupa bilangan bulat dan operator sesuai input tipe data dari code program tersebut

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

    10.0 + 5.0 = 15.0


Dalam code tersebut berupa perintah untuk menampilkan hasil dari suatu sistem operasi aritmatika. Jika perintah berupa operator tambah maka angka 1 ditambahkan dengan angka 2 begitupun dengan pengurangan, perkalian, dan pembagian

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```
Jawab:
1. break digunakan agar program yang dijalankan berhenti pada saat kondisi telah terpenuhi, default berfungsi untuk menjalankan program jika dalam setiap case tidak ada kondisi yang terpenuhi.
2. kode tersebut merupakan variable yang memiliki value berupa string, namun karena diberi method charAt(0) maka value dari operator tersebut hanyalah sebuah character pada index ke 0 string yang diinputkan

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.

Jawab:
```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("A: ");
int a = sc.nextInt();

System.out.print("B: ");
int b = sc.nextInt();

if(a > b) {
    System.out.println(a);
}else{
    System.out.println(b);
}
```

    A: 5
    B: 2
    5

2. Perhatikan flowchart berikut ini:

![](images/02.png)

> Buatlah program sesuai dengan flowchart diatas!

Jawab:
```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Umur: ");
int umur = sc.nextInt();

if(umur >= 17) {
System.out.println("Boleh berkendara");
}else{
System.out.println("Tidak boleh berkendara");
}
```

    Umur: 17
    Boleh berkendara

3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!

Jawab:
```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Nilai akhir: ");
int nilaiAkhir = sc.nextInt();

if(nilaiAkhir < 65) {
    System.out.println("Remidi");
}else{
    System.out.println("Tidak remidi");
}
```

    Nilai akhir: 65
    Tidak remidi

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
Jawab:
```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int jumlahA, hargaA, jumlahB,  hargaB, jumlahC, hargaC;

System.out.print("Masukkan harga barang A\t\t: ");
hargaA = sc.nextInt();
System.out.print("Masukkan jumlah barang A\t: ");
jumlahA = sc.nextInt();
System.out.print("Masukkan harga barang B\t\t: ");
hargaB = sc.nextInt();
System.out.print("Masukkan jumlah barang B\t: ");
jumlahB = sc.nextInt();
System.out.print("Masukkan harga barang C\t\t: ");
hargaC = sc.nextInt();
System.out.print("Masukkan jumlah barang C\t: ");
jumlahC = sc.nextInt();

int totalA = hargaA * jumlahA;
int totalB = hargaB * jumlahB;
int totalC = hargaC * jumlahC;

int total = totalA + totalB + totalC;

double diskon = 0;

if (total >= 1000000) {
    diskon = total * 10 / 100;
} else if (total >= 500000) {
    diskon = total * 5 / 100;
} else if (total >= 200000) {
    diskon = total * 2 / 100;
}

System.out.println("----------------------------------------");
System.out.println("              Struk Total");
System.out.println("----------------------------------------");
System.out.println("Nama Barang\t|\tHarga\t|\tJumlah\t|\tTotal\t");
System.out.println("Barang A\t\t|\t\t"+hargaA+"\t\t|\t\t"+jumlahA+"\t\t|\t\t" + totalA);
System.out.println("Barang B\t\t|\t\t"+hargaB+"\t\t|\t\t"+jumlahB+"\t\t|\t\t" + totalB);
System.out.println("Barang C\t\t|\t\t"+hargaC+"\t\t|\t\t"+jumlahC+"\t\t|\t\t" + totalC);
System.out.println("Total\t\t\t: " + total);
System.out.println("Diskon\t\t\t: " + diskon);
System.out.println("Total Bayar\t\t: " + (total - diskon));
```