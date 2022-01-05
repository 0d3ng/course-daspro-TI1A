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


#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?


```Java
// Tulis Jawaban no 1 disini
// Indeks terbesar: 3
// Indeks terkecil: 0
```

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
// Maka akan terjadi error, karena ketika diinstansiasi, array bil bertipe data integer, 
// sedangkan 5.0 dan 7.5 merupakan tipe data float/double
```

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i = 0; i<4; i++){
    System.out.println(bil[i]);
}

// Keluaran dari program sama dengan keluaran dari statement langkah No 3 yang sebelumnya. Hal ini karena kita 
// menggunakan perulangan untuk secara berurutan meng-output setiap isi dari array bil berdasarkan indeksnya. Hal ini lebih efisien
// karena semua statement pada langkah No 3 sama, hanya berbeda pada masing-masing indeksnya (yang statement pertama indeks 0, kedua indeks 1, dst.).
```

    5
    12
    7
    20


### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
```

2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 2 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
int nilaiUAS[] = new int[6]
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

    Masukkan nilai UAS ke-0: 90
    Masukkan nilai UAS ke-1: 100
    Masukkan nilai UAS ke-2: 80
    Masukkan nilai UAS ke-3: 95
    Masukkan nilai UAS ke-4: 80
    Masukkan nilai UAS ke-5: 100


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah: " + nilaiUAS[i]);
}
```

    Nilai UAS ke-0 adalah: 90
    Nilai UAS ke-1 adalah: 100
    Nilai UAS ke-2 adalah: 80
    Nilai UAS ke-3 adalah: 95
    Nilai UAS ke-4 adalah: 80
    Nilai UAS ke-5 adalah: 100


#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
for(int i = 0; i < nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}

// Tidak terjadi perubahan, input yang dilakukan tetap 6. Hal ini dikarenakan nilaiUAS.length yang menggantikan angka 6 itu
// nilainya juga 6. nilaiUAS.length mengembalikan panjang elemen dari array nilaiUAS. Di awal kita sudah menginstansiasi array 
// nilaiUAS dengan panjang 6, sehingga jika kita mengambil panjang elemen array tersebut, nilainya adalah 6.
```

    Masukkan nilai UAS ke-0: 90
    Masukkan nilai UAS ke-1: 100
    Masukkan nilai UAS ke-2: 50
    Masukkan nilai UAS ke-3: 80
    Masukkan nilai UAS ke-4: 90
    Masukkan nilai UAS ke-5: 40


2. Apa kegunaan dari `nilaiUAS.length`? 


```Java
// Tulis Jawaban nomor 2 disini
// nilaiUAS.length berguna untuk mengembalikan panjang elemen dari array nilaiUAS. Hal tersebut berguna untuk mengubah pengkondisi
// pada perulangan supaya lebih dinamis. Karena, jika kita menggunakan fixed number atau menentukan sendiri pengkondisi pada perulangan
// maka jika kita suatu saat mengubah mengubah panjang elemen pada instansiasi, kita akan kesusahan untuk mengganti satu per satu
// pengkondisi pada perulangan yang menggunakan nilaiUAS.length. Hal tersebut akan sangat berguna untuk menghindari error dan baris kode
// lebih mudah untuk dimaintenance.
```

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for(int i = 0; i < nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){
        System.out.println("Mahasiswa ke-" + i + " lulus"); 
    }
}

// Program diatas hanya akan menampilkan mahasiswa yang lulus dengan nilai lebih dari 70. Di dalam perulangan, kita 
// menggunakan pengkondisi nilaiUAS.length supaya lebih dinamis. Kemudian di dalam perulangan kita melakukan pemilihan
// array yang indeksnya sesuai nilai i saat itu. Jika nilai dari array indeks itu lebih dari 70 maka akan menampilkan 
// mahasiswa ke-indeks itu lulus. Jika tidak lebih dari 70, maka tidak akan ditampilkan dan melanjutkan perulangan.
// Contohnya pada perulangan pertama, maka nilai i adalah 0. Kemudian akan dilakukan pemilihan, karena nilai
// array nilaiUAS dengan indeks ke i (i dalam hal ini bernilai 0) itu nilainya 90 lebih dari 70, maka akan ditampilkan lulus.
```

    Mahasiswa ke-0 lulus
    Mahasiswa ke-1 lulus
    Mahasiswa ke-3 lulus
    Mahasiswa ke-4 lulus


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
for(int i = 0; i < nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + ":");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1:90
    Masukkan nilai Mahasiswa ke-2:100
    Masukkan nilai Mahasiswa ke-3:80
    Masukkan nilai Mahasiswa ke-4:50
    Masukkan nilai Mahasiswa ke-5:90
    Masukkan nilai Mahasiswa ke-6:40
    Masukkan nilai Mahasiswa ke-7:50
    Masukkan nilai Mahasiswa ke-8:80
    Masukkan nilai Mahasiswa ke-9:100
    Masukkan nilai Mahasiswa ke-10:90


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
System.out.println("Rata-rata nilai mahasiswa adalah " + rata);
```

    Rata-rata nilai mahasiswa adalah 77.0


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?


```Java
// Tulis jawaban no 1 disini
// Karena dengan begitu, jalannya program akan lebih efisien. Hal ini karena jika dilakukan dalam perulangan,
// maka kita akan melakukan perhitungan perulangan dan program akan berjalan lebih berat jika perulangannya banyak. Namun 
// jika kita melakukan perhitungan hanya di akhir, maka akan lebih ringan, karena melakukan perhitungan rata-rata hanya satu kali.
```

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini

int totalLulus = 0;
int jumlahLulus = 0;
int totalTidakLulus = 0;
int jumlahTidakLulus = 0;
double rataLulus, rataTidakLulus;

for(int i = 0; i < nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + ":");
    nilaiMHS[i] = sc.nextInt();
    
    if(nilaiMHS[i] > 70){
        totalLulus+=nilaiMHS[i];
        jumlahLulus+=1;
    }else{
        totalTidakLulus+=nilaiMHS[i];
        jumlahTidakLulus+=1;
    }
}

rataLulus = totalLulus/jumlahLulus;
rataTidakLulus = totalTidakLulus/jumlahTidakLulus;

System.out.println("Rata-rata nilai mahasiswa yang lulus adalah " + rataLulus);
System.out.println("Rata-rata nilai mahasiswa yang tidak lulus adalah " + rataTidakLulus);
```

    Masukkan nilai Mahasiswa ke-1:90
    Masukkan nilai Mahasiswa ke-2:80
    Masukkan nilai Mahasiswa ke-3:100
    Masukkan nilai Mahasiswa ke-4:70
    Masukkan nilai Mahasiswa ke-5:60
    Masukkan nilai Mahasiswa ke-6:40
    Masukkan nilai Mahasiswa ke-7:50
    Masukkan nilai Mahasiswa ke-8:20
    Masukkan nilai Mahasiswa ke-9:10
    Masukkan nilai Mahasiswa ke-10:30
    Rata-rata nilai mahasiswa yang lulus adalah 90.0
    Rata-rata nilai mahasiswa yang tidak lulus adalah 40.0


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
System.out.println("Key ada di array ke-"+hasil);
```

    Key ada di array ke-5


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?


```Java
// Tulis jawaban no 1 disini
// Statement break berfungsi untuk memnghentikan perulangan jika key telah ditemukan. Hal tersebut dapat terjadi jika nilai key
// sama dengan nilai array pada indeks i saat itu.
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini

key = 5;

for(int i = 0; i < arr.length; i++){
    if(key == arr[i]){
        hasil = i;
        break;
    }
}

System.out.println("Key ada di array ke-"+hasil);

// Hasil output dari program diatas adalah -1. Hal ini karena ketika melakukan pencarian, tidak ditemukan elemen array yang nilainya
// sama dengan key, dalam permasalah ini adalah 5. Karena tidak ditemukan, maka variabel hasil tidak berubah. Di awal kita
// sudah menginisialisasi variabel hasil dengan nilai -1, sehingga output jika hasil tidak berubah adalah -1.
```

    Key ada di array ke--1


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


```Java
// Tulis Kode program Percobaan 5 Langkah 2 di atas, disini
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

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)

3. Tampilkan hasil pengurutan dengan menggunakan perulangan
![Gambar print](images/P5L3.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 3 di atas, disini
System.out.println("Hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
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


## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
/* Jawaban Soal 1 disini */

import java.util.Scanner;
Scanner input = new Scanner(System.in);

int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven, cOdd = 0;

for(int i = 0; i<checkNum.length; i++){
    System.out.print("Masukkan bilangan anda: ");
    checkNum[i] = input.nextInt();
}

for(int j = 0; j<checkNum.length; j++){
    if(checkNum[j]%2 == 0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    }else{
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}

// Kode diatas berfungsi untuk memilah sebuah array menjadi dua array yang berbeda. Array tersebut ialah array evenNum dan oddNum.
// Array evenNum nantinya akan berisi elemen-elemen dari array checkNum yang bernilai genap. Sedangkan array oddNum nantinya akan berisi
// elemen-elemen dari array checkNum yang bernilai ganjil.
```

    Masukkan bilangan anda: 11
    Masukkan bilangan anda: 7
    Masukkan bilangan anda: 5
    Masukkan bilangan anda: 2
    Masukkan bilangan anda: 10
    Masukkan bilangan anda: 8
    Masukkan bilangan anda: 9
    Masukkan bilangan anda: 10
    Masukkan bilangan anda: 11
    Masukkan bilangan anda: 7


### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int arr[] = new int[5];

for(int i = 0; i<arr.length; i++){
    System.out.print("Masukkan bilangan anda: ");
    arr[i] = input.nextInt();
}

System.out.println("Urutan terbalik: ");
for(int j = arr.length-1; j>=0; j--){
    System.out.printf("%d ", arr[j]);
}

// Kode diatas menampilkan inputan array secara terbalik. Array tersebut sudah diinstansiasi dengan panjang elemen 5.
// Untuk menampilkan secara terbalik kita hanya harus menampilkannya dari indeks terbesar menuju indeks terkecil. Hal ini
// dapat dicapai dengan menggunakan for yang menggunakan decrement. Untuk variabel perulangan, karena kita mulai dari
// indeks terbesar, kita dapat menggunakan arr.length-1 yang menghasilkan panjang array dikurang 1, yaitu indeks terbesarnya.
// Contohnya karena panjang arraynya adalah 5, jika dikurang 1 maka hasilnya 4. Kemudian, karena indeks dimulai dari 0, maka
// indeks terbesarnya adalah 4 jika dihitung 5 dari 0.
```

    Masukkan bilangan anda: 5
    Masukkan bilangan anda: 2
    Masukkan bilangan anda: 7
    Masukkan bilangan anda: 9
    Masukkan bilangan anda: 6
    Urutan terbalik: 
    6 9 7 2 5 

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int arrLength, largest = 0;
System.out.print("Masukkan jumlah elemen array: ");
arrLength = input.nextInt();

int arr[] = new int[arrLength];

for(int i = 0; i<arr.length; i++){
    System.out.print("Masukkan elemen array ke-" + i + ": ");
    arr[i] = input.nextInt();
    if(arr[i] > largest){
        largest = arr[i];
    }
}

System.out.println("Bilangan terbesar adalah " + largest);

// Kode program diatas berfungsi untuk mencari nilai terbesar dari sebuah array yang panjang array nya ditentukan oleh inputan.
// Di awal kita meminta input user supaya dapat menginstansiai panjang array dengan menggunakan input user, Kemudian kita
// melakukan perulangan untuk meminta user mengisi array yang sudah kita instansiasi. Di dalam perulangan terdapat pemilihan yang
// berfungsi untuk menyeleksi bilangan terbesar. Hal tersebut dapat dilakukan karena, jika user melakukan input, kemudian inputan 
// tersebut lebih besar dari bilangan terbesar sebelumnya, maka bilangan tersebut adalah bilangan terbesar selama perulangan tersebut berjalan.
// Hal tersebut terus berlanjut hingga perulangan berakhir, sehingga ditemukan bilangan terbesarnya. Meskipun bilangan terbesarnya
// berada di awal, variabel largest tidak akan berubah jika bilangan selanjutnya lebih kecil dari variabel largest.
```

    Masukkan jumlah elemen array: 5
    Masukkan elemen array ke-0: 25
    Masukkan elemen array ke-1: 78
    Masukkan elemen array ke-2: 12
    Masukkan elemen array ke-3: 63
    Masukkan elemen array ke-4: 99
    Bilangan terbesar adalah 99



```Java

```
