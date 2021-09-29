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

2. Tambahkan library **Scanner**, deklarasi Scanner, dan buat variabel bil untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
int bil;

System.out.print("Masukan sebuah bilangan: ");
bil = input.nextInt();
```

    Masukan sebuah bilangan: 290


> Kode di atas mengimport java.util.Scanner, kemudian membuat sebuah scanner untuk mendapatkan user input yang nantinya akan disimpan di variable bil

---

3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
// Ketik kode program di atas di bawah sini
if(bil % 2 == 0) {
    System.out.println("Bilangan Genap");
} else {
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Genap


> Outputnya adalah bilangan Genap karena variabel bil bernilai 290 yang jika dibagi 2 hasilnya tidak bersisa

---

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
String output = (bil % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap


> Outputnya adalah bilangan genap karena pada dasarnya kode ini sama dengan kode di atas, hanya saja menggunakan ternary operator

---

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
int nilai;
System.out.print("Masukan sebuah bilangan: ");
nilai = input.nextInt();
```

    Masukan sebuah bilangan: 321


> Kode diatas membuat sebuah variable nilai dan kemudian meminta input ke user yang akan disimpan di variable nilai

---

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
if(nilai  >= 100) {
    nilai += 10;
} else {
    nilai -= 10;
}

System.out.println("Hasil akhir nilai adalah " + nilai);
```

    Hasil akhir nilai adalah 331


> Hasil akhir adalah 331 karena variable nilai berisi 321, artinya lebih dari 100 dan akhirnya nilainya ditambah dengan 10. 321 + 10 = 331. a += b sama dengan a = a + b

---

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
int umur;
System.out.print("Masukan umur Anda: ");
umur =  input.nextInt();
```

    Masukan umur Anda: 19


> Kode di atas membuat variable umur, kemudian meminta user input yang akan disimpan di  variable umur

---

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
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

    Dewasa


> Output dari kode di atas adalah Dewasa karena variable umur bernilai 19 yang berarti kurang dari 60 dan 45 tapi lebih besar dari 17. Meskipun umur lebih besar dari 5, kode untuk umur > 5 tidak dijalankan, karena if sudah menemukan kondisi yang sesuai.

---

+ Jalankan program dan amati apa yang terjadi!

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

Kode diatas membuat sebuah scanner dan variable angka1, angka2, serta hasil dalam bentuk double, dan operator dalam bentuk char

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
System.out.print("Masukan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukan operator (+ - * /): ");
operator = sc.next().charAt(0);
```

    Masukan angka pertama: 4
    Masukan angka kedua: 5
    Masukan operator (+ - * /): +


> Kode diatas meminta inputan user untuk mengisi variable yang telah dibuat tadi

---

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
switch(operator) {
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

    4.0 + 5.0 = 9.0


> Output dari kode diatas dikarenakan operator yang dimasukan adalah +, oleh karena itu, perintah switch akan menjalankan kode di case '+' dimana akan dilakukan penjumlahan dan juga  menampilkanya menggunakan System.out.println(). Kode di bawahnya tidak ikut dijalankan karena terdapat penggunakan break;

---

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

### Jawaban

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.


```Java
Scanner sc =  new Scanner(System.in);

System.out.print("A: ");
int a = sc.nextInt();

System.out.print("B: ");
int b = sc.nextInt();

if(a > b) {
    System.out.println(a);
} else {
    System.out.println(b);
}
```

    A: 7
    B: 1
    7

> Penjelasan: Buat scanner untuk  mendapat user input, kemudian minta user input untuk nilai A dan B, setelah itu gunakan perintah if untuk melakukan pengecekan nilai mana yang lebih besar.

---

2. Perhatikan flowchart berikut ini:
    Buatlah program sesuai dengan flowchart diatas!


```Java
Scanner sc =  new Scanner(System.in);

System.out.print("umur: ");
int umur = sc.nextInt();

if(umur >= 17) {
    System.out.println("Boleh berkendara");
} else {
    System.out.println("Tidak boleh berkendara");
}
```

    umur: 17
    Boleh berkendara

> Penjelasan: Buat scanner untuk mengambil input dari user, kemudian cek jika umur user >= 17. Jika iya, tampilkan boleh berkendara, jika tidak, tampilkan tidak boleh berkendara.

---

3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!


```Java
Scanner sc = new Scanner(System.in);

System.out.print("Nilai UAS: ");
int uas = sc.nextInt();
System.out.print("Nilai UTS: ");
int uts = sc.nextInt();
System.out.print("Nilai Kuis: ");
int kuis = sc.nextInt();
System.out.print("Nilai Tugas: ");
int tugas = sc.nextInt();

float nilaiAkhir = (uas * 40f / 100f) + (uts * 30f / 100f) + (kuis * 10f / 100f) + (tugas * 20f / 100f);


if(nilaiAkhir < 65) {
    System.out.println("Remidi");
} else {
    System.out.println("Tidak remidi");
}
```

    Nilai UAS: 98
    Nilai UTS: 81
    Nilai Kuis: 96
    Nilai Tugas: 87  
    nilaiAkhir: 90.5
    Tidak remidi

> Penjelasan: membuat sebuah scanner, kemudian meminta user untuk input nilai uas, uts, kuis dan tugas. Setelah itu menjumlahkan seluruhnya berdasarkan bobot yang telah ditentukan. Hasil penjumlahanya dicek untuk menentukan status remidinya berdasarkan kriteria nilaiAkhir < 65

---

4. Sebuah toko memberikan diskon kepada pelanggannya dengan ketentuan sebagai berikut:

    Total Belanja	Potongan
    >Rp. 200.000,00	2%
    >Rp. 500.000,00	5%
    >Rp. 1.000.000,00	10%
    Total belanja diperoleh dari pembelian tiga barang yaitu barang A, barang B, dan barang C. Ketika menginputkan harga barang juga menginputkan jumlah barang yang dibeli.


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
    System.out.println("Nama Barang\t\t|\t\tHarga\t\t|\t\tJumlah\t\t|\t\tTotal\t\t");
    System.out.println("Barang A\t\t|\t\t"+hargaA+"\t\t|\t\t"+jumlahA+"\t\t|\t\t" + totalA);
    System.out.println("Barang B\t\t|\t\t"+hargaB+"\t\t|\t\t"+jumlahB+"\t\t|\t\t" + totalB);
    System.out.println("Barang C\t\t|\t\t"+hargaC+"\t\t|\t\t"+jumlahC+"\t\t|\t\t" + totalC);
    System.out.println("Total\t\t\t: " + total);
    System.out.println("Diskon\t\t\t: " + diskon);
    System.out.println("Total Bayar\t\t: " + (total - diskon));
```

    Masukkan harga barang A		: 100000
    Masukkan jumlah barang A	: 10
    Masukkan harga barang B		: 250000
    Masukkan jumlah barang B	: 5
    Masukkan harga barang C		: 150000
    Masukkan jumlah barang C	: 1
    ----------------------------------------
                  Struk Total
    ----------------------------------------
    Nama Barang		|		Harga		|		Jumlah		|		Total		
    Barang A		|		100000		|		10		|		1000000
    Barang B		|		250000		|		5		|		1250000
    Barang C		|		150000		|		1		|		150000
    Total			: 2400000
    Diskon			: 240000.0
    Total Bayar		: 2160000.0


> Penjelasan: Membuat sebuah scanner, kemudian meminta user input barang jumlah barang belanjaan beserta harganya. Kemudian totalkan harganya dengan jumlah yang dibeli, setelah itu tentukan diskon  berdasarkan total pembelian. Jika sudah tampilkan semua data yang sudah dikalkulasi
