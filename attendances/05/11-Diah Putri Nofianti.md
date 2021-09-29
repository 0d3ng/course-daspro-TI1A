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
System.out.print("Masukkan sebuah bilangan: ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan: 9


**import library Scanner** *berguna agar bisa meminta masukan **input** melalui keyboard, lalu input tersebut ditentukan berupa **tipe data int** yaitu bilangan bulat, penampung nilai inputnya sendiri diberi **variabel** bernama **bil**. Contoh saya memasukkan input angka 9.*

3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png) 


```Java
if(bil%2 == 0){
    System.out.println("Bilangan Genap");
}else{
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Ganjil


*Pemilihan kondisi yang menentukan apakah input berupa bilangan genap atau ganjil dengan syarat jika bilangan tersebut **modulus 2 nya menghasilkan 0** maka **output** akan keluar sebagai **Bilangan Genap**, jika **modulusnya bukan 0** maka **output** berupa **Bilangan Ganjil**. Contoh dari inputan tadi yaitu 9, lalu 9 modulus 2 adalah 1 (sisa) bukan 0 maka tampil output Bilangan Ganjil.*

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
String output = (bil % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Ganjil


*Pemilihan kondisi dengan **ternary operator** yang langsung menentukan antara genap atau ganjil dari input (variabel bil) dengan tipe data dari **output** tersebut berupa **String** (kalimat) yang tampilan keluaran nantinya bisa Bilangan Genap atau Bilangan Ganjil sesuai hasil modulus 2 dari input. Contohnya tetap dengan inputan angka 9, jadi output pun juga Bilangan Ganjil.*

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!


*Cara yang modifikasi menggunakan **ternary operator**, fungsinya sama dengan **if else** tapi lebih simpel yang hanya dengan satu baris kode dalam pemilihan dua kondisi (dalam hal ini Ganjil atau Genapnya input yang dimasukkan) jadi output pun juga sama karena fungsinya tadi sama saja dengan if else.*

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
int nilai;
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan: 50


*Deklarasi tipe data berupa **int** (bilangan bulat) dengan variabel **nilai** yang bisa meminta masukan input melalui keyboard. Misal, saya menginputkan angka 50.*

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
if(nilai >=100){
    nilai +=10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah "+nilai);
```

    Hasil akhir nilai adalah 40


+ Jalankan program. Amati apa yang terjadi!

*Dari kasus ini pemilihan **if else** jika nilai dari **input lebih dari sama dengan 100** maka nilai input akan **ditambah 10**, sedangkan jika nilai input itu **kurang dari 100** maka nilai input **dikurangi 10**, outputnya akan muncul berupa nilai yang telah ditentukan sesuai kondisi tadi. Dengan contoh inputan 50 tadi, outputnya menjadi 40 karena 50 itu kondisinya kurang dari 100 jadi 50 dikurangi 10 dan hasil untuk outputnya 40.*

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```
    
    **nilai+=10;** *berarti isi dari variabel **nilai** ditambah dengan 10 dan sebaliknya untuk* **nilai-=10;** *maka **nilai** tersebut akan dikurangi 10.*
    

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!


```Java
float nilai1, nilai2, rata;

System.out.print("Masukkan bilangan pertama: ");
nilai1 = input.nextFloat();

System.out.print("Masukkan bilangan kedua: ");
nilai2 = input.nextFloat();

rata = (nilai1+nilai2)/2;

if(rata >=100){
    rata -=5;
}

System.out.println("Hasil akhir rata-rata nilai adalah "+rata);
```

    Masukkan bilangan pertama: 125
    Masukkan bilangan kedua: 100
    Hasil akhir rata-rata nilai adalah 107.5


*Kedua input dan diproses rata-ratanya dideklarasikan berupa **tipe data float** (karena rata-rata bisa jadi desimal) lalu memasuki pemilihan, jika rata-ratanya lebih dari sama dengan 100 maka hasil outputnya akan dikurangi 5, namun bila rata-ratanya kurang dari 100 maka akan langsung ditampilkan nilai rata-rata dari kedua inputan. Contoh inputan 125 dan 100, jadi rata-ratanya adalah 112.5 karena memenuhi syarat lebih dari 100, maka 112.5 tadi dikurangi 5 dan menghasilkan output 107.5.*

#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
int umur;
System.out.print("Masukkan umur Anda: ");
umur = input.nextInt();
```

    Masukkan umur Anda: 18


*Deklarasi tipe data berupa **int** (bilangan bulat) dengan variabel **umur** yang bisa meminta masukan input melalui keyboard. Misal, saya menginputkan 18 karena berumur 18 tahun.*

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
if (umur > 60)
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


+ Jalankan program dan amati apa yang terjadi!

**If - else if - else** *memilih kondisi yang paling sesuai dari pernyataan yang lebih dari 2. Untuk program ini, jika inputan umur lebih dari 60 maka output akan menampilkan Lansia, jika inputan tidak mencapai 60 maka akan mencari pilihan kondisi yang selanjutnya sampai menemukan yang tepat. Contoh inputan umur saya 18 maka yang keluar adalah Dewasa karena sudah ditentukan disitu jika umur yang lebih dari 17 akan masuk dalam kategori Dewasa.*

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;
```

*Deklarasi **Scanner** untuk bisa memasukkan **input**, lalu **variabel angka1, angka2, dan hasil** berupa **tipe data double** yang dapat menampung **bilangan desimal**, serta **tipe data char** disini untuk menampung hanya **satu karakter** dengan **variabel operator**.*

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator(+ - * /): ");
operator = sc.next().charAt(0);
```

    Masukkan angka pertama: 3
    Masukkan angka kedua: 8
    Masukkan operator(+ - * /): /


*angka 1 merupakan variabel untuk menyimpan nilai angka inputan pertama, lalu angka 2 itu variabel untuk inputan angka kedua, dan yang variabel operator menampung inputan ketiga berupa karakter operator. Contoh, saya memasukkan input angka pertama 3 lalu angka kedua itu 8 dan operator **(/)** untuk pembagian.*

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
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

    3.0 / 8.0 = 0.375


5. Jalankan program. Amati apa yang terjadi!

*switch ini merupakan kondisi dan case adalah beberapa pernyataan yang harus dipilih salah satu yang sesuai dengan kondisi. Dalam kasus ini kondisinya adalah inputan operator, untuk case harus dicek satu persatu dari atas apakah cocok dengan switch. Jika tidak ada nilai pada case yang sesuai dengan nilai kondisi, maka proses akan dilanjutkan ke pernyataan yang ada di dalam default. Contohnya, input operator yang saya masukkan adalah **(/)** maka program akan melakukan pengecekan mulai dari case '+' sampai menemukan case '/' dan outputnya akan menampilkan 3.0 / 8.0 = 0.875 (berupa bilangan desimal karena memakai tipe data double)*

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!

*break digunakan untuk menghentikan proses yang terjadi jika sudah menemukan case yang sesuai kondisi, sedangkan pernyataan pada default digunakan jika tidak ada nilai pada case yang sesuai dengan nilai kondisi.*

2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```
    
*untuk membaca nilai inputan berupa tipe data char (unicode) yang mana variabelnya bernama operator.*

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.


```Java
int a, b;

System.out.print("Masukkan bilangan 1: ");
a = input.nextInt();

System.out.print("Masukkan bilangan 2: ");
b = input.nextInt();

if(a > b){
    System.out.println("Bilangan yang terbesar adalah "+a);
}else{
    System.out.println("Bilangan yang terbesar adalah "+b);
}
```

    Masukkan bilangan 1: 9
    Masukkan bilangan 2: 11
    Bilangan yang terbesar adalah 11


*Program ini ada dua inputan, tipe data berupa int (bilangan bulat) lalu variabel a dan b untuk bilangan 1 serta 2, selanjutnya ada pemilihan, jika nilai a lebih dari b maka output akan menampilkan a, jika sebaliknya maka outputnya adalah nilai b. Contoh disini saya memasukkan 9 dan 11 dan menghasilkan output dengan bilangan yang terbesar adalah 11.*

2. Perhatikan flowchart berikut ini:

![](images/02.png)

> Buatlah program sesuai dengan flowchart diatas!



```Java
int umur;

System.out.print("Masukkan umur kamu: ");
umur = input.nextInt();

if(umur >= 17){
    System.out.println("Kamu boleh berkendara");
}else{
    System.out.println("Kamu tidak boleh berkendara");
}
```

    Masukkan umur kamu: 18
    Kamu boleh berkendara


*Inputan berupa int untuk variabel umur, jika sudah 17 tahun atau lebih maka output akan menampilkan boleh berkendara, jika kurang dari 17 tahun maka yang tampil adalah tidak boleh berkendara.*

3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!



```Java
float uas, uts, kuis, tugas, nilaiAkhir;

System.out.print("Masukkan nilai UAS: ");
uas = input.nextFloat();

System.out.print("Masukkan nilai UTS: ");
uts = input.nextFloat();

System.out.print("Masukkan nilai kuis: ");
kuis = input.nextFloat();

System.out.print("Masukkan nilai tugas: ");
tugas = input.nextFloat();

nilaiAkhir = (uas*40/100) + (uts*30/100) + (kuis*10/100) + (tugas*20/100);

System.out.println("\nNilai akhir kamu adalah "+nilaiAkhir);

if(nilaiAkhir >= 65){
    System.out.println("Selamat, kamu tidak remidi");
}else{
    System.out.println("Kamu harus remidi");
}
```

    Masukkan nilai UAS: 97
    Masukkan nilai UTS: 87
    Masukkan nilai kuis: 94
    Masukkan nilai tugas: 85
    
    Nilai akhir kamu adalah 91.3
    Selamat, kamu tidak remidi


*Meminta inputan berupa nilai untuk variabel UAS, UTS, kuis, dan tugas yang disini dideklarasikan dengan tipe data float. Lalu inputan diproses untuk mendapat nilai akhir dengan 40% dari 97 (nilai UAS), 30%  dari 87 (nilai UTS), 10% dari 94 (nilai kuis), dan 20% dari 85 (nilai tugas). Kemudian muncul kondisi jika nilai akhir dari mahasiswa kurang dari 65 maka output tampil dengan mahasiswa harus remidi, sebaliknya jika nilai lebih dari 65 maka mahasiswa tidak remidi. Karena hasil nilai akhirnya 91.3 maka tidak remidi.*

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
int hargaA, hargaB, hargaC, jumlahA, jumlahB, jumlahC, a, b, c, total;
float diskon, bayar;

System.out.print("Masukkan harga barang A  : ");
hargaA = input.nextInt();
System.out.print("Masukkan jumlah barang A : ");
jumlahA = input.nextInt();

System.out.print("Masukkan harga barang B  : ");
hargaB = input.nextInt();
System.out.print("Masukkan jumlah barang B : ");
jumlahB = input.nextInt();

System.out.print("Masukkan harga barang C  : ");
hargaC = input.nextInt();
System.out.print("Masukkan jumlah barang C : ");
jumlahC = input.nextInt();

a = hargaA * jumlahA;
b = hargaB * jumlahB;
c = hargaC * jumlahC;

total = a + b + c;

if(total > 1000000){
    diskon = total*10/100;
}else if(total > 500000){
    diskon = total*5/100;
}else if(total > 200000){
    diskon = total*2/100;
}else{
    diskon = 0;
}

System.out.println("-----------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t   Struk Total");
System.out.println("-----------------------------------------------------------------------------------------");
System.out.println("Nama Barang\t|\tHarga\t\t|\tJumlah\t\t|\tTotal");

System.out.print("Barang A\t        "+hargaA);
System.out.print("\t\t\t  "+jumlahA);
System.out.print("\t\t       "+a);

System.out.print("\nBarang B\t        "+hargaB);
System.out.print("\t\t\t  "+jumlahB);
System.out.print("\t\t       "+b);

System.out.print("\nBarang C\t        "+hargaC);
System.out.print("\t\t\t  "+jumlahC);
System.out.print("\t\t       "+c);

bayar = total-diskon;

System.out.println("\n\nTotal\t\t:"+total);
System.out.println("Diskon\t\t:"+diskon);
System.out.println("Total Bayar\t:"+bayar);
```

    Masukkan harga barang A  : 100000
    Masukkan jumlah barang A : 10
    Masukkan harga barang B  : 250000
    Masukkan jumlah barang B : 5
    Masukkan harga barang C  : 150000
    Masukkan jumlah barang C : 1
    -----------------------------------------------------------------------------------------
    				   Struk Total
    -----------------------------------------------------------------------------------------
    Nama Barang	|	Harga		|	Jumlah		|	Total
    Barang A	        100000			  10		       1000000
    Barang B	        250000			  5		       1250000
    Barang C	        150000			  1		       150000
    
    Total		:2400000
    Diskon		:240000.0
    Total Bayar	:2160000.0


*Program untuk struk belanja dengan inputan harga dan jumlah barang A, B, C dengan tipe data int. Lalu diproses untuk mengetahui total dari pembelian, setelah itu jika total pembelian tersebut memenuhi syarat untuk mendapat diskon tertentu (dengan tipe data float), maka akan dihitung kembali totalnya dikurangi diskon yang sesuai. Outputnya ada keterangan nama barang, harga, jumlah, total, diskon, dan total bayar yang setelah mendapat diskon.*
