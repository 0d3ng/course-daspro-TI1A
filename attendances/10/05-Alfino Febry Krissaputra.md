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

// Tulis Jawaban no 1 disini

array di percobaan 1 memiliki 4 indeks yakni indeks 0,1,2,3.
indeks dengan terkecil adalah indeks [0] dengan value 5
sedangkan indeks dengan terbesar adalah indeks [3] dengan value 20


2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
bil[0] = 5.0;
bil[1] = 12867;
bil[2] = 7,5;
bil[3] = 2000000;

System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);

```


    |   bil[0] = 5.0;

    incompatible types: possible lossy conversion from double to int

    


penjelasan

akan terjadi error karena nilai yang diberikan tidak sesuai dengan tipe array yang dalam kasus ini adlah integer.

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;

for(int i=0; i<4; i++){
    System.out.println(bil[i]);
}
```

    5
    12
    7
    20


output yang diberikan sama dengan program sebelumnya, karena pada dasarnya fungsi dari kedua kode program adalah sama. hanya saja program kedua lebih ringkas karena memeanfaatkan perulangan for untuk memberikan output.
alurnya adalah dari nilai i = 0, lalu print elemen ke i, kemudiaan i di increment terus sampai 4 kali yang mana itu adalah jumlah indeks array bil.

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas

```

2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

```

input dan inisiasi scanner untuk menggunakan scanner.

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
int[] nilaiUAS = new int[6];

```

membuat array 6 elemen dengan tipe data integer

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i = 0; i <6; i++){
    System.out.print("Masukan nilai UAS ke-"+ i +": ");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukan nilai UAS ke-0: 90
    Masukan nilai UAS ke-1: 91
    Masukan nilai UAS ke-2: 100
    Masukan nilai UAS ke-3: 98
    Masukan nilai UAS ke-4: 97
    Masukan nilai UAS ke-5: 92


menggunakan perulangan for untuk mengisi nilai setiap elemen pada array. 

5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-"+i+" adalah: " + nilaiUAS[i]);
}

```

    Nilai UAS ke-0 adalah: 90
    Nilai UAS ke-1 adalah: 91
    Nilai UAS ke-2 adalah: 100
    Nilai UAS ke-3 adalah: 98
    Nilai UAS ke-4 adalah: 97
    Nilai UAS ke-5 adalah: 92


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
    System.out.print("Masukan nilai UAS ke-"+ i +": ");
    nilaiUAS[i] = sc.nextInt();
}
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-"+i+" adalah: " + nilaiUAS[i]);
}
```

    Masukan nilai UAS ke-0: 91
    Masukan nilai UAS ke-1: 92
    Masukan nilai UAS ke-2: 93
    Masukan nilai UAS ke-3: 94
    Masukan nilai UAS ke-4: 95
    Masukan nilai UAS ke-5: 96
    Nilai UAS ke-0 adalah: 91
    Nilai UAS ke-1 adalah: 92
    Nilai UAS ke-2 adalah: 93
    Nilai UAS ke-3 adalah: 94
    Nilai UAS ke-4 adalah: 95
    Nilai UAS ke-5 adalah: 96


tidak ada, karena nilaiUAS.length adalah panjangnya array atau jumlah elemen array, yang mana adalah 6 dalam program diatas. sedangkan nilai yang sebelumnya adalah 6, juga menandakan jumlah elemen array nilaiUAS. maka dari itu penggunaan keduanya bisa dibilang sama sehingga tidak ada perbedaan.

2. Apa kegunaan dari `nilaiUAS.length`? 

// Tulis Jawaban nomor 2 disini

kegunaan dari nilaiUAS.length adalah untuk mengetahui atau menunjukan panjang sebuah array yang dalam kasus ini menunjukan panjang array nilaiUAS.

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] nilaiUAS = new int[6];

for(int i = 0; i < nilaiUAS.length; i++){
    System.out.print("Masukan nilai UAS ke-"+ i +": ");
    nilaiUAS[i] = sc.nextInt();
}
for(int i = 0; i < nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){
        System.out.println("Mahasisa ke-"+i+" Lulus");
    }
}
```

    Masukan nilai UAS ke-0: 20
    Masukan nilai UAS ke-1: 90
    Masukan nilai UAS ke-2: 100
    Masukan nilai UAS ke-3: 77
    Masukan nilai UAS ke-4: 98
    Masukan nilai UAS ke-5: 69
    Mahasisa ke-1 Lulus
    Mahasisa ke-2 Lulus
    Mahasisa ke-3 Lulus
    Mahasisa ke-4 Lulus


# setelah import dan inisiasi scanner, buat dan instansiasi array nilaiUAS dengan tipe data integer dan panjang array 6.
menggunakan perulangan for dengan nilai awal i = 0 dengan batas akhir i kurang dari panjang array (nilaiUAS.length) dan increment i. untuk meminta input pada setiap index array.
setelah selesai perulangan pertama, pada perulangan berikutnya yang memiliki nilai awal batas akhir dan increment yang sama seperti pada perulangan sebelumnya. pada perulangan ini ada pemilihan yakni jika value indeks i lebih dari 70 akan diberikan output.

### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
// Tulis Kode program Percobaan 3 Langkah 1 di atas, disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in)
```

2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 2 di atas, disini
int nilaiMHS[] = new int[10];
double total, rata;
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
for(int i = 0; i < nilaiMHS.length; i++){
    System.out.print("Masukan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukan nilai Mahasiswa ke-1:100
    Masukan nilai Mahasiswa ke-2:99
    Masukan nilai Mahasiswa ke-3:90
    Masukan nilai Mahasiswa ke-4:88
    Masukan nilai Mahasiswa ke-5:80
    Masukan nilai Mahasiswa ke-6:77
    Masukan nilai Mahasiswa ke-7:70
    Masukan nilai Mahasiswa ke-8:97
    Masukan nilai Mahasiswa ke-9:96
    Masukan nilai Mahasiswa ke-10:92


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i < nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}

```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata = total/nilaiMHS.length;
System.out.println("Rata=rata nilai mahasiswa adalah "+rata);
```

    Rata=rata nilai mahasiswa adalah 88.9


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

// Tulis jawaban no 1 disini

karena perhitungan rata dimaksudkan untuk menghitung nilai rata-rata. untuk menhitung nilai rata-rata diperlukan semua nilai yang kan dihitung untuk mengetahui jumlah totalnya dan banyaknya nilai, untuk kemudian dibagi. sehingga operasi rata diletakan diluar perulangan ketika semua nilai sudah terkumpul. jika diletakan didalam perulangan tidak bisa menghasilkan nilai rata-rata yang valid.

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
int nilaiMHS[] = new int[10];
double totalLulus, totalTakLulus, rataLulus, rataTakLulus;
int jumlahLulus, jumlahTakLulus;

for(int i = 0; i < nilaiMHS.length; i++){
    System.out.print("Masukan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = sc.nextInt();
}
for(int i = 0; i < nilaiMHS.length; i++){
    if(nilaiMHS[i] <= 70){
        totalTakLulus+=nilaiMHS[i];
        jumlahTakLulus++;
    }else{
        totalLulus+=nilaiMHS[i];
        jumlahLulus++;
    }
}
rataLulus = totalLulus/jumlahLulus;
rataTakLulus = totalTakLulus/jumlahTakLulus;
System.out.println("Rata=rata nilai mahasiswa yang lulus adalah "+rataLulus);
System.out.println("Rata=rata nilai mahasiswa yang lulus adalah "+rataTakLulus);
```

    Masukan nilai Mahasiswa ke-1:90
    Masukan nilai Mahasiswa ke-2:80
    Masukan nilai Mahasiswa ke-3:100
    Masukan nilai Mahasiswa ke-4:70
    Masukan nilai Mahasiswa ke-5:60
    Masukan nilai Mahasiswa ke-6:40
    Masukan nilai Mahasiswa ke-7:50
    Masukan nilai Mahasiswa ke-8:20
    Masukan nilai Mahasiswa ke-9:10
    Masukan nilai Mahasiswa ke-10:30
    Rata=rata nilai mahasiswa yang lulus adalah 90.0
    Rata=rata nilai mahasiswa yang lulus adalah 40.0


setelah import dan inisiasi scanner, buat dan instansiasi array nilaiUAS dengan tipe data integer dan panjang array 6.
menggunakan perulangan for dengan nilai awal i = 0 dengan batas akhir i kurang dari panjang array (nilaiUAS.length) dan increment i. untuk meminta input pada setiap index array.
setelah selesai perulangan pertama, pada perulangan berikutnya yang memiliki nilai awal batas akhir dan increment yang sama seperti pada perulangan sebelumnya. pada perulangan ini ada pemilihan yakni jika value indeks i kurang dari samadengan 70, value indeks i akan ditambahkan ke totalTakLulus dan nilai variabel jumlahTakLulus ditambah 1. jika kondisi tersebut tidak terpenuhi maka value indeks i akan ditambahkan ke totalLulus dan jumlahLulus akan ditambah 1.
kemudian setelah perulangan dihitung rata-rata nilai yang tidak lulus dengan cara total tak lulus dibagi jumlahTakLulus
begitu pula yang lulus, totalLulus dibagi jumlahLulus.
kemudian hasil perhitungan rata-rata tersebut dikeluarkan.

### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 3, hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i = 0; i < arr.length; i++){
    if(key == arr[i]){
        hasil=i;
        break;
    }
}

```

3. Tampilkan hasil pencarian dengan kode berikut.
![Gambar perulangan jumlah](images/P4L4.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
System.out.println("key ada di array ke-" +hasil);
```

    key ada di array ke-5


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?


```Java
// Tulis jawaban no 1 disini
kegunaan statement break adalah untuk menhentikan keadaan mengulang ketika kondisi sudah terpenuhi.
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
int[] arr = {6,4,1,9,7,3,2,8};
int key = 5, hasil = -1;

for(int i = 0; i < arr.length; i++){
    if(key == arr[i]){
        hasil=i;
        break;
    }
}
System.out.println("key ada di array ke-" +hasil);
```

    key ada di array ke--1


alur program diatas adalah, setelah menginisiasi array dan variabel, 
menggunakan perulangan for dengan nilai awal i = 0, batas akhir i kurang dari panjang arr (arr.length) i increment 1.
didalam perulangan ada kondisi jika nilai key sama dengan index ke i aray i. jika kondisi terpenuhi maka nilai hasil dirubah menjadi nilai indeks i dan kemudian ada statement break yang menghentikan kondisi 

keluaran yang diberikan adalah -1. hal ini terjadi karena nilai key yang dicari (5) tidak adal didalam array. sehingga output yang diberikan adalah nilai awal dari variabel hasil, yang mana pada awal program sudah diinisiasi bahwa nilai awal hasil adalah -1. sehingga ketika kondisi didalam perulangan tersebut tidak terpenuhi otomatis nilai dari hasil tidak berubah tetap -1.


```Java
// Tulis jawaban no 2 disini

int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;

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

```

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


alur dari program diatas adalah
setelah menginisiasi array dan variabel,
terdapat perulangan for dengan nilai awal integer i = 0, batas akhir i kurang dari panjang arr (arr.length) i increment 1.
didalamnya ada nested loop dengan nilai awal integer j = 1, batas akhir i kurang dari panjang arr (arr.length) i increment 1.
didalam nested loop ini terdapat kondisi jika nilai indeks ke j-1 (indeks sebelum j) lebih besar dari indeks ke j maka nilai indeks sebelum j akan dimasukan ke variabel temp, kemudian nilai indeks sebelum j dirubah menjadi sama dengan nilai indeks j. terakhi nilai indeks j dirubah menjadi sama dengan nilai temp.
sederhananya operasi diatas menukar value dalam antara indeks dengan indeks sebelumnya jika nilai indeks tersebut lebih kecil dari nilai indeks sebelumnya sehingga terbentuk array dengan value yang urut.
kemudian ada program untuk mengoutputkan nilai masing-masing indeks dari array arr.

## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven, cOdd;

for(int i = 0; i < checkNum.length; i++){
    System.out.print("Masukan angka : ");
    checkNum[i] = sc.nextInt();
}
for(int j = 0; j < checkNum.length; j++){
    if(checkNum[j] %2 == 0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    }else{
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}
```

    Masukan angka : 21
    Masukan angka : 33
    Masukan angka : 40
    Masukan angka : 100
    Masukan angka : 12
    Masukan angka : 77
    Masukan angka : 12
    Masukan angka : 10
    Masukan angka : 80
    Masukan angka : 27


alur dari program diatas adalah setelah menginstansiasi array dan membuat variabel.
menggunakan for loop untuk mengisikan nilai pada array checkNum.setelah selesai pada perulangan berikutnya ada dua kondisi.
jika nilai dari array indeks ke j dimodulus hasilnya sama dengan 0, maka nilai indeks tersebut dimasukan kedalam array evenNum. dan nilai dari variabel cEven ditambah 1. variabel ini digunakan untuk memantau berapapa banyak indeks dalam array evenNum terisi.
dalam kondisi selanjutnya ketika kondisi pertama tidak terpenuhi, nilai indeks ke j akan dimasukan ke array oddNum, dan variabel cOdd ditambah 1.
meskipun tidak terdapat dalam flowchart, dibawah ini adalah bagaimana output jika program tersebut diberikan kode untuk output.


```Java
System.out.println("Bilangan Genap");
for(int i = 0; i < cEven; i++){
    
    System.out.println(evenNum[i]);
}

System.out.println("Bilangan ganjil");
for(int i = 0; i < cOdd; i++){
    
    System.out.println(oddNum[i]);
}
```

    Bilangan Genap
    40
    100
    12
    12
    10
    80
    Bilangan ganjil
    21
    33
    77
    27


# Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
int arr[] = {5, 2, 7, 9, 6};
int temp, j = 0;

for(int i = arr.length-1; i > (arr.length/2); i--){
    temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
    j++;
}
System.out.println("Hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);

```

    Hasil pengurutan: 
    6
    9
    7
    2
    5


alur dari program diatas adalah setelah menginisiasi array dan membuat variabel.
menggunakan for loop dengan nilai awal integer i dengan nilai panjang array arr (arr.length), batas akhir i > setengah dari panjang array arr, i decrement 1.
kemudian didalamnya ada kode program untuk menukar posisi array ke j dan array ke i.
jadi array ke j dipindah ke variabel temp, kemudian array ke j diganti array ke i. dan terakhir array ke i diganti dengan temp.
terakhir ada increment variabel j sebanyak 1.
disini saya menggunakan batas akhir setengah panjang array supaya perulangan hanya dilakukan setengah jalan, jika perulangan diteruskan terus sepanjang array maka hasilnya akan kembali seperti semula.

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int isi, besar;

System.out.print("Masukan isi array: ");
isi = sc.nextInt();
int arr[] = new int[isi];

for(int i = 0; i < arr.length; i++){
    System.out.print("Masukan elemen array ke-" +i+ ": ");
    arr[i] = sc.nextInt();
}
for(int j = 0; j < arr.length; j++){
    if(arr[j] > besar){
        besar = arr[j];
    }
}
System.out.println("Bilangan terbesar adalah: " +besar);
```

    Masukan isi array: 5
    Masukan elemen array ke-0: 25
    Masukan elemen array ke-1: 78
    Masukan elemen array ke-2: 12
    Masukan elemen array ke-3: 63
    Masukan elemen array ke-4: 99
    Bilangan terbesar adalah: 99


alur dari program diatas adalah.
membuat kode untuk meminta input yang akan dijadikan jumlah elemen dari array.
menginstansiasi array dengan jumlah elemen yang sudah diinputkan.
menggunakan for loop untuk mengisi array.
memmbuat loop kedua untuk menentukan elemen mana yang memiliki nilai terbesar.
jadi didalam loop tersebut jika nilai elemen array ke j lebih besar dari variabel besar, nilai dari variabel besar diganti menjadi sama dengan nilai indeks ke j. begitu terus sampai semua elemen dicek.
terakhir output variabel besar yang mana sudah mewakili nilai dari elemen terbesar.

