# JOBSHEET 10 - Array 1

## Tujuan
+ Mahasiswa mampu memahami pembuatan Array 1 dimensi dan pengaksesan elemenya di Java. 
+ Mahasiswa mampu membuat program dengan menggunakan konsep array satu dimensi.


## Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet
+ Anaconda3 + Java kernel (opsional)

## Praktikum
### Percobaan 1: Mengisi Elemen Array
1. Pada percobaan ke-1 akan dilakukan percobaan untuk mengisi elemen array. Buat array bertipe integer dengan nama bil dengan kapasitas 4 elemen.
![Gambar 0](images/P1L2.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 2 di atas
int[] bil = new int[4];
```

2. Isi masing-masing elemen array bil tadi dengan angka 5, 12, 7, 20.
![Gambar 0](images/P1L3.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 3 di atas
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;
```
    20

3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4
System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);
```

    5
    12
    7
    20

Penjelasan:

Dalam code program tersebut menampilkan output dari 4 indeks, di mana langkah pertama melakukan yang namanya deklarasi sekaligus instansiasi code program array tersebut.

#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?

     // Tulis jawaban pertanyaan nomor 1

    Dari percobaan 1 indeks array terbesar adalah 3 dan yang terkecil adalah 0


2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
int[] bil = new int[4];
bil[0] = 5.0;
bil[1] = 12867;
bil[2] = 7.5;
bil[3] = 2000000;
System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);
```

    |   bil[0] = 5.0;

    incompatible types: possible lossy conversion from double to int

// Tulis jawaban pertanyaan nomor 2

yang terjadi jika diganti dengan 5.0, 12867, 7.5, 2000000 adalah terjadi eror karena terdapat nilai desimal pada contoh di atas yang di mana tipe data dari code program di atas adalah int

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
int[] bil = new int[4];
for(int i = 0; i <4; i++){
    System.out.println(bil[i]);
}
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;
```

    0
    0
    0
    0





    20



// Tulis Jawaban no 3 yang disini

Output yang dihasilkan yaitu 0 sebanyak 4 kali karena indeks yang dimasukkan sebanyak 4 kali dan tidak ada nilai yang dimasukkan ke dalam code program array tersebut.

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)



2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
int[] nilaiUAS = new int[6];
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukkan nilai UAS ke-0: 50
    Masukkan nilai UAS ke-1: 55
    Masukkan nilai UAS ke-2: 56
    Masukkan nilai UAS ke-3: 70
    Masukkan nilai UAS ke-4: 78
    Masukkan nilai UAS ke-5: 80


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah " + nilaiUAS[i]);
}
```

    Nilai UAS ke-0 adalah 50
    Nilai UAS ke-1 adalah 55
    Nilai UAS ke-2 adalah 56
    Nilai UAS ke-3 adalah 70
    Nilai UAS ke-4 adalah 78
    Nilai UAS ke-5 adalah 80

Penjelasan:

 Code program tersebut menampilkan output dari nilai UAS mahasiswa dari 1 sampai 6 kali dengan menggunakan code program array dengan mendeklarasikan dan menginstansiasikan nilai UAS dengan 6 indeks dan juga menggunakan perulangan untuk menyusun nilai UAS tersebut.

#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] nilaiUAS = new int[6];
for(int i = 0; i < nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah " + nilaiUAS[i]);
}
```

    Masukkan nilai UAS ke-0: 50
    Masukkan nilai UAS ke-1: 55
    Masukkan nilai UAS ke-2: 56
    Masukkan nilai UAS ke-3: 70
    Masukkan nilai UAS ke-4: 78
    Masukkan nilai UAS ke-5: 80
    Nilai UAS ke-0 adalah 50
    Nilai UAS ke-1 adalah 55
    Nilai UAS ke-2 adalah 56
    Nilai UAS ke-3 adalah 70
    Nilai UAS ke-4 adalah 78
    Nilai UAS ke-5 adalah 80


// Tulis Jawaban nomor 1 disini

Pada code program tersebut tidak terjadi perubahan.

2. Apa kegunaan dari `nilaiUAS.length`? 

// Tulis Jawaban nomor 2 disini

nilaiUAS.length tersebut berguna untuk menunjukkan panjang atau jumlah dari indeks

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] nilaiUAS = new int[6];
for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
for(int i = 0; i < nilaiUAS.length; i++){
if(nilaiUAS[i] > 70){
System.out.println("Mahasiswa ke-" + i + " lulus");
}
}
```

    Masukkan nilai UAS ke-0: 65
    Masukkan nilai UAS ke-1: 78
    Masukkan nilai UAS ke-2: 80
    Masukkan nilai UAS ke-3: 85
    Masukkan nilai UAS ke-4: 90
    Masukkan nilai UAS ke-5: 95
    Mahasiswa ke-1 lulus
    Mahasiswa ke-2 lulus
    Mahasiswa ke-3 lulus
    Mahasiswa ke-4 lulus
    Mahasiswa ke-5 lulus


// Tulis Jawaban nomor 3 disini

Jadi alur pada code program tersebut jika telah dijalankan yaitu menampilkan output nilai dan sekaligus tertera mahasiswa yang lulus di mana nilai yamh diperoleh haruslah lebih dari 70

### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
// Tulis Kode program Percobaan 3 Langkah 1 di atas, disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 2 di atas, disini
int nilaiMHS[] = new int[10];
double total;
double rata;
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + ": ");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1: 75
    Masukkan nilai Mahasiswa ke-2: 85
    Masukkan nilai Mahasiswa ke-3: 70
    Masukkan nilai Mahasiswa ke-4: 75
    Masukkan nilai Mahasiswa ke-5: 85
    Masukkan nilai Mahasiswa ke-6: 70
    Masukkan nilai Mahasiswa ke-7: 75
    Masukkan nilai Mahasiswa ke-8: 80
    Masukkan nilai Mahasiswa ke-9: 85
    Masukkan nilai Mahasiswa ke-10: 70


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i < nilaiMHS.length; i++){
    total += nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata = total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalaha " + rata);
```

    Rata-rata nilai mahasiswa adalaha 77.0

Penjelasan:

Code program tersebut menampilkan ooutput setiap nilai mahasiswa dan rata-rata dengan menggunakan code program array dengan mendeklarasikan dan menginstansiasikan nilai mahasiswa sebanyak 10 indeks dan melakukan perulangan untuk menampilkan nilai mahasiswa. Lalu, melakukan perhitungan rata-rata dengan menghitung terlebih dahulu jumlah nilai mahasiswa ditotal dengan mengetikkan "nilaiMHS.length" dan membagi dengan jumlah keseluruhan mahasiswa.

#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

// Tulis jawaban no 1 disini

dari code perulangan ini nilai dapat dimasukkan terlebih dahulu dang dijumlahkan terlebih dahulu dan setelahnya baru melakukan rata-rata dengan membagikan dengan jumlah nilai

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int nilaiMHS[] = new int[10];
double totalMHSLulus = 0;
int jmlMHSLulus = 0;
double totalMHSTidakLulus = 0;
int jmlMHSTidakLulus = 0;
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + ": ");
    nilaiMHS[i] = sc.nextInt();
}
for(int i = 0; i<nilaiMHS.length; i++){
    if(nilaiMHS[i] > 70){
        totalMHSLulus+=nilaiMHS[i];
        jmlMHSLulus++;
    } else {
        totalMHSTidakLulus+=nilaiMHS[i];
        jmlMHSTidakLulus++;
    }
    
}
double rataRataLulus = totalMHSLulus/jmlMHSLulus;
double rataRataTidakLulus = totalMHSTidakLulus/jmlMHSTidakLulus;
System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rataRataLulus);
System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataRataTidakLulus);
```

    Masukkan nilai Mahasiswa ke-1: 70
    Masukkan nilai Mahasiswa ke-2: 77
    Masukkan nilai Mahasiswa ke-3: 87
    Masukkan nilai Mahasiswa ke-4: 67
    Masukkan nilai Mahasiswa ke-5: 65
    Masukkan nilai Mahasiswa ke-6: 87
    Masukkan nilai Mahasiswa ke-7: 90
    Masukkan nilai Mahasiswa ke-8: 67
    Masukkan nilai Mahasiswa ke-9: 66
    Masukkan nilai Mahasiswa ke-10: 88
    Rata-rata nilai mahasiswa yang lulus = 85.8
    Rata-rata nilai mahasiswa yang tidak lulus = 67.0

Penjelasan pertanyaan nomor 2

melakukan code program array dengan memasukkan sebanyak 10 indeks dan melakukan code program looping untuk memasukkan nilai mahasiswa sebanyak indeks array dan memberikan syarat yang lulus lebih dari 70 dan melakukan rata-rata setiap mahasiswa yang lulus dan yang tidak lulus.

### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 3;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i = 0; i < arr.length; i++){
    if(key == arr[i]){
        hasil = i;
        break;
    }
}
```

3. Tampilkan hasil pencarian dengan kode berikut.
![Gambar perulangan jumlah](images/P4L4.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
System.out.println("Key ada di array ke-" + hasil)
```

    Key ada di array ke-5

Penjelasan:

Code program tersebut menampilkan output key yang ada yaitu di array ke-5 dengan mencantumkan tipe data dan key yang dicari dan mencantumkan tipe data dan variabel yang tidak ada pada nilai indeks dengan menampilkan "-1"

#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?

// Tulis jawaban no 1 disini

statement break di sana berguna untuk menghentikan code program jika keynya telah terpenuhi atau ditemukan di code array-nya.

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini

int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;
int key = 5;
int hasil = -1;
for(int i = 0; i < arr.length; i++){
    for(int j = 1; j < (arr.length-i); j++){
        if(arr[j-1] > arr[j]){
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}

System.out.println("Hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
System.out.println("Key ada di array ke- " + hasil)
```

    Hasil pengurutan: 
    3
    4
    10
    12
    16
    27
    28
    90
    Key ada di array ke- -1


// Tulis jawaban no 2 disini

Hasilnya akan menampilkan output yang telah berurutan dari indeks yang tertera dan key tidak tersedia sehingga hanya menampilkan "-1". Karena angka 5 tidak tertera pada sistem code array tersebut.

### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;
```

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 2 disini
for(int i = 0; i < arr.length; i++){
    for(int j = 1; j < (arr.length-i); j++){
        if(arr[j-1] > arr[j]){
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}
```

3. Tampilkan hasil pengurutan dengan menggunakan perulangan
![Gambar print](images/P5L3.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 3 di atas, disini
System.out.println("Hasil Pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
```

    Hasil Pengurutan: 
    3
    4
    10
    12
    16
    27
    28
    90




## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
/* Jawaban Soal 1 disini */
Import java.util.Scanner;
Scanner input = new Scanner(System.in);
int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven, cOdd = 0;

for(int i = 0; i < checkNum.length; i++){
    System.out.print("Masukkan angka: ");
    checkNum[i] = input.nextInt(); 
}
for(int j = 0; j < checkNum.length; j++){
    if(checkNum[j] %2== 0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}
System.out.print("\nNilai Ganjil: ");

for(int angkaGanjil = 0; angkaGanjil < oddNum.length; angkaGanjil++){
if(oddNum[angkaGanjil] != 0){
System.out.print(oddNum[angkaGanjil] + " ");
}
}
System.out.print("\nNilai Genap: ");

for(int angkaGenap = 0; angkaGenap < evenNum.length; angkaGenap++){
if(evenNum[angkaGenap] != 0){
System.out.print(evenNum[angkaGenap] + " ");
}
}
```

    Masukkan angka: 65
    Masukkan angka: 66
    Masukkan angka: 67
    Masukkan angka: 68
    Masukkan angka: 69
    Masukkan angka: 70
    Masukkan angka: 71
    Masukkan angka: 72
    Masukkan angka: 73
    Masukkan angka: 74
    
    Nilai Ganjil: 65 67 69 71 73 
    Nilai Genap: 66 68 70 72 74 

Penjelasan:

Untuk menampilkan output berupa nilai ganjil dan nilai genap dengan cara menggunakan code array di mana dengan mendeklarasikan dan menginstansiasikan dari semua indeks dan melakukan code looping dari setiap indeksnya agar terkumpul semua datanya lalu menambahkan code cEven++ dan cOdd++ di kondisi yang menyeleksi bilangan genap atau ganjil.

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];

for(int i = 0; i < arr.length; i++) {
  System.out.print("Masukan nilai ke-" + i + ": ");
  arr[i] = sc.nextInt();
}

System.out.println("\nUrutan nilai setelah dibalik: ");
for(int i = arr.length - 1; i >= 0; i--){
  System.out.print(arr[i] + " ");
}
```

    Masukan nilai ke-0: 5
    Masukan nilai ke-1: 2
    Masukan nilai ke-2: 7
    Masukan nilai ke-3: 9
    Masukan nilai ke-4: 6
    
    Urutan nilai setelah dibalik: 
    6 9 7 2 5 

Penjelasan:

Untuk mengurutkan nilai secara terbalik bisa dengan cara menginisiasikan dengan arr.length ditambahkan -1

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bilanganTerbesar, jumlah;
int[] arr;
System.out.print("Masukkan isi array: ");
jumlah = sc.nextInt();
arr = new int[jumlah];

for(int i = 0; i < jumlah; i++){
    System.out.print("Masukkan elemen array ke-" + (i) + ": ");
    arr[i] = sc.nextInt();
}
bilanganTerbesar = arr[0];

for(int i = 0; i < jumlah; i++){
    if(arr[i] > bilanganTerbesar){
        bilanganTerbesar = arr[i];
    }
}
System.out.println("Bilangan terbesar adalah " + bilanganTerbesar);
```

    Masukkan isi array: 5
    Masukkan elemen array ke-0: 25
    Masukkan elemen array ke-1: 78
    Masukkan elemen array ke-2: 12
    Masukkan elemen array ke-3: 63
    Masukkan elemen array ke-4: 99
    Bilangan terbesar adalah 99

Penjelasan:

Untuk menampilkan output memasukkan elemen array sampai yang ke-5 dan menampilkan bilangan terbesarnya , menurut code program saya dengan cara Mendeklarasikan terlebih dahulu variable scan untuk input user dan melakukan input nilai kedalam variable jumlah array. Lalu, melakukan perulangan sebanyak nilai variable jumlah untuk menginputkan nilai kedalam index variable array. Dan untuk menentukan bilangan terbesar bisa dengan cara melakukan perulangan sebanyak nilai variable jumlah untuk membandingkan atau menentukan nilai maksimum dari nilai yang berada didalam array.