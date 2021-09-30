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

    Masukkan sebuah bilangan: 132


-kode digunakan untuk mengimport scanner, sehingga kita bisa memasukkan bilangan bertipe integer

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


-Maksud kode diatas adalah, apabila sebuah bilangan dibagi oleh 2 dan sisanya 0 maka bilangan tersebut termasuk bilangan genap. Jika tidak (apabila bilangan dibagi 2 dan bersisa) maka bilangan tersebut termasuk bilangan ganjil.

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap


2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

Jawaban no.3 :

Karena output program modifikasi diatas menggunakan ternary operators yang fungsinya sama dengan if..else.. Makna struktur diatas pun memiliki arti yang sama dengan if..else.., yaitu apabila sebuah bilangan dibagi oleh 2 dan sisanya 0 maka bilangan tersebut termasuk bilangan genap. Jika tidak maka bilangan tersebut termasuk bilangan ganjil.

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
// Ketik kode program di atas di bawah sini
int nilai;
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan: 100


-Kode program diatas digunakan supaya dapat menginput nilai yang bertipe integer

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
// Ketik kode program di atas di bawah sini
if(nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah " +nilai);
```

    Hasil akhir nilai adalah 110


+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!

Jawaban no.1:

Maksud kode program diatas adalah, apabila nilai yang diinput >=100, maka nilai akhir = nilai yang diinput + 10; Jika nilai yang diinput tidak >=100 atau <100, maka nilai akhir = nilai yang diinput - 10.

Jawaban no.2:


```Java
Scanner sc = new Scanner(System.in);
double nilai1, nilai2, rerata, hasil;
System.out.print("Masukkan nilai pertama: ");
nilai1 = sc.nextDouble();
System.out.print("Masukkan nilai kedua: ");
nilai2 = sc.nextDouble();
rerata = (nilai1 + nilai2)/2;
if(rerata >= 100){
    hasil =rerata-5;
}else{
    hasil = rerata;
}
System.out.println("Hasil akhir nilai adalah " +hasil);
```

    Masukkan nilai pertama: 12
    Masukkan nilai kedua: 24
    Hasil akhir nilai adalah 18.0


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

    Masukkan umur Anda: 17


Kode diatas bertujuan supaya kita dapat menginput data umur bertipe integer

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
// Ketik kode program di atas di bawah sini
if(umur > 60)
    System.out.println("Lansia");
else if(umur > 45)
    System.out.println("Tua");
else if(umur>17)
    System.out.println("Dewasa");
else if(umur>5)
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

    Anak-anak


Kode program diatas dieksekusi/dijalankan urut dari atas ke bawah. Apabila instruksi yang lebih diatas sudah terpenuhi maka eksekusi programsudah selesai (tidak dilanjutkan lagi).Jadi maksud kode program diatas adalah jika seseorang berumur 60 keatas keluar pernyataan lansia; jika seseorang berumur 45 keatas keluar pernyataan tua; jika seseorang berumur 17 keatas keluar pernyataan dewasa; jika seseorang berumur 5 keatas keluar pernyataan Anak-anak; selain dari instruksi2 diatas maka keluar pernyataan balita.

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

Kode diatas digunakan untuk mengimport/memanggil scanner, sehingga kita bisa memasukkan bilangan dan operator dengan tipenya masing-masing. double angka1, angka2, hasil : kode tersebut menyatakan bahwa variabel angka1, angka2, hasil bertipe double; char operator : kode tersebut menyatakan bahwa operator bertipe character.

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

    Masukkan angka pertama: 80
    Masukkan angka kedua: 12
    Masukkan operator (+ - * /): +


-Kode System.out.print("Masukkan angka pertama: "); angka1 = sc.nextDouble(); (untuk memasukkan bilangan bertipe double)

-Kode System.out.print("Masukkan angka kedua: "); angka2 = sc.nextDouble(); (untuk menginput bilangan bertipe double)

-Kode System.out.print("Masukkan operator (+ - * /): "); operator = sc.next().charAt(0); (untukenginput operator + - * / yang bertipe character)

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
// Ketik kode program di atas di bawah sini
switch(operator){
    case '+' :
    hasil = angka1 + angka2;
    System.out.println(angka1 + " + " + angka2 + " = "+hasil);
    break;
    case '-' :
    hasil = angka1 - angka2;
    System.out.println(angka1 + " - " + angka2 + " = "+hasil);
    break;
    case '*' :
    hasil = angka1 * angka2;
    System.out.println(angka1 + " * " + angka2 + " = "+hasil);
    break;
    case '/' :
    hasil = angka1 / angka2;
    System.out.println(angka1 + " / " + angka2 + " = "+hasil);
    break;
    default:
    System.out.println("Operator yang Anda masukkan salah");
}

```

    80.0 + 12.0 = 92.0


5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

Jawaban no.1:

Fungsi break pada percobaan diatas untuk melakukan stop jika perintah yang diberikan sudah di rasa cukup untuk case tersebut. Default pada percobaan 4 artinya apabila operator yang diinput tidak sesuai dengan semua instruksi yang ada diatasnya, maka jalankan x.

Jawaban no.2:

Fungsi dari operator = sc.next().chartAt(0) adalah untuk menginput operator + - * / yang bertipe character.

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

Jawaban no.1:


```Java
Scanner sc = new Scanner(System.in);
int bilangan1, bilangan2, output;
System.out.print("Masukkan bilangan pertama: ");
bilangan1 = sc.nextInt();
System.out.print("Masukkan bilangan kedua: ");
bilangan2 = sc.nextInt();
if(bilangan1 >= bilangan2){
    output = bilangan1;
}else{
    output = bilangan2;
}
System.out.println("Output adalah " +output);
```

    Masukkan bilangan pertama: 16
    Masukkan bilangan kedua: 18
    Output adalah 18


Jawaban no.2:


```Java
Scanner sc = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur Anda: ");
umur = sc.nextInt();
if(umur >= 17){
    System.out.println("Boleh Berkendara");
}else{
    System.out.println("Tidak boleh berkendara");
    }
```

    Masukkan umur Anda: 17
    Boleh Berkendara


Jawaban no.3:


```Java
Scanner sc = new Scanner(System.in);
int nilaiUAS, nilaiUTS, nilaiKuis, nilaiTugas;
double nilaiMahasiswa;
System.out.print("Masukkan nilai UAS: ");
nilaiUAS = sc.nextInt();
System.out.print("Masukkan nilai UTS: ");
nilaiUTS = sc.nextInt();
System.out.print("Masukkan nilai Kuis: ");
nilaiKuis = sc.nextInt();
System.out.print("Masukkan nilai Tugas: ");
nilaiTugas = sc.nextInt();
nilaiMahasiswa = ((4*nilaiUAS)+(3*nilaiUTS)+(1*nilaiKuis)+(2*nilaiTugas))/10;
System.out.println("Nilai akhir mahasiswa adalah" + nilaiMahasiswa);

if(nilaiMahasiswa<65){
    System.out.println("Mahasiswa Remidi");
}else{
    System.out.println("Mahasiswa Tidak Remidi");
}
```

    Masukkan nilai UAS: 88
    Masukkan nilai UTS: 92
    Masukkan nilai Kuis: 95
    Masukkan nilai Tugas: 90
    Nilai akhir mahasiswa adalah90.0
    Mahasiswa Tidak Remidi


Jawaban no.4:


```Java
Scanner sc = new Scanner(System.in); 
int hargaA, jumlahA, hargaB, jumlahB, hargaC, jumlahC, totalA, totalB, totalC, totalSemua;
double Diskon, totalBayar, Disc;
System.out.print("Masukkan harga barang A: "); 
hargaA = sc.nextInt(); 
System.out.print("Masukkan jumlah barang A: "); 
jumlahA = sc.nextInt(); 
System.out.print("Masukkan harga barang B: "); 
hargaB = sc.nextInt(); 
System.out.print("Masukkan jumlah barang B: "); 
jumlahB = sc.nextInt(); 
System.out.print("Masukkan harga barang C: "); 
hargaC = sc.nextInt(); 
System.out.print("Masukkan jumlah barang C: "); 
jumlahC = sc.nextInt(); 
System.out.println("--------------------------------------------- "); 
System.out.println("\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s Struk Total \s\s\s\s\s\s "); 
System.out.println("--------------------------------------------- "); 
System.out.println("Nama Barang\s\s\s\s\s\sHarga\s\s\s\s\s\sJumlah\s\s\s\s\s\sTotal ");
totalA = hargaA * jumlahA;
System.out.println(String.format("Barang A          %s         %s         %s", hargaA, jumlahA, totalA));
totalB = hargaB * jumlahB;
System.out.println(String.format("Barang B          %s         %s         %s", hargaB, jumlahB, totalB));
totalC = hargaC * jumlahC;
System.out.println(String.format("Barang C          %s         %s         %s", hargaC, jumlahC, totalC));
totalSemua = totalA + totalB +totalC;
System.out.println("Total :" + totalSemua);
if (totalSemua > 1000000)
    Diskon = 0.1;
else if(totalSemua > 500000)
    Diskon = 0.05;
else if(totalSemua > 200000)
    Diskon = 0.02;
else 
    Diskon = 0;
    Disc = Diskon * totalSemua;
System.out.println("Diskon adalah " + Disc );
    totalBayar = totalSemua - (Diskon * totalSemua);
    System.out.println("Total Bayar : " + totalBayar);
    

```

    Masukkan harga barang A: 100000
    Masukkan jumlah barang A: 10
    Masukkan harga barang B: 250000
    Masukkan jumlah barang B: 5
    Masukkan harga barang C: 150000
    Masukkan jumlah barang C: 1
    --------------------------------------------- 
                     Struk Total        
    --------------------------------------------- 
    Nama Barang      Harga      Jumlah      Total 
    Barang A          100000         10         1000000
    Barang B          250000         5         1250000
    Barang C          150000         1         150000
    Total :2400000
    Diskon adalah 240000.0
    Total Bayar : 2160000.0


##### 
