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
index array terbesar yaitu index 3 dan yang terkecil index 0
```

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

// Tulis Jawaban no 2 yang disini
ouputnya akan error karena tipe data yang digunakan adalah integer maka dari itu harus mengubah tipe data terlebih dahulu ke double

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
int[] bil = new int[4];
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;

for(int i = 0; i < 4; i++){
    System.out.println(bil[i]);
}
```

    5
    12
    7
    20


outputnya sama dengan sebelum dimodifikasi yaitu menampilkan data dari array bil hanya saja disini menggunakan variabel i yang merupakan index array 

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] nilaiUAS = new int[6];

for(int i = 0; i < 6; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah: " + nilaiUAS[i]);
}
```

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

    Masukkan nilai UAS ke-0: 80
    Masukkan nilai UAS ke-1: 70
    Masukkan nilai UAS ke-2: 90
    Masukkan nilai UAS ke-3: 70
    Masukkan nilai UAS ke-4: 70
    Masukkan nilai UAS ke-5: 90


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + "adalah: " + nilaiUAS[i]);
}
```

    Nilai UAS ke-0adalah: 80
    Nilai UAS ke-1adalah: 70
    Nilai UAS ke-2adalah: 90
    Nilai UAS ke-3adalah: 70
    Nilai UAS ke-4adalah: 70
    Nilai UAS ke-5adalah: 90


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
    System.out.println("Nilai UAS ke-" + i + " adalah: " + nilaiUAS[i]);
}
```

    Masukkan nilai UAS ke-0: 100
    Masukkan nilai UAS ke-1: 90
    Masukkan nilai UAS ke-2: 80
    Masukkan nilai UAS ke-3: 90
    Masukkan nilai UAS ke-4: 90
    Masukkan nilai UAS ke-5: 80
    Nilai UAS ke-0 adalah: 100
    Nilai UAS ke-1 adalah: 90
    Nilai UAS ke-2 adalah: 80
    Nilai UAS ke-3 adalah: 90
    Nilai UAS ke-4 adalah: 90
    Nilai UAS ke-5 adalah: 80


tidak terjadi perubahan karena nilaiUAS.length digunakan untuk mendapatkan panjang array sehingga ketika dari angka 6 diganti dengan nilaiUAS.length memiliki fungsi yang sama yaitu mendapatkan nilai panjang array.

2. Apa kegunaan dari `nilaiUAS.length`? 


```Java
// Tulis Jawaban nomor 2 disini
nilaiUAS.length digunakan untuk mendapatkan panjang array
```

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[] nilaiUAS = new int[6];

for(int i = 0; i < nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
for(int i = 0; i < nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){
        System.out.println("Mahasiswa ke-" + i + " lulus");
    }
}
```

    Masukkan nilai UAS ke-0: 50
    Masukkan nilai UAS ke-1: 90
    Masukkan nilai UAS ke-2: 60
    Masukkan nilai UAS ke-3: 65
    Masukkan nilai UAS ke-4: 80
    Masukkan nilai UAS ke-5: 90
    Mahasiswa ke-1 lulus
    Mahasiswa ke-4 lulus
    Mahasiswa ke-5 lulus


user menginputkan nilai yang nantinya akan disimpan pada variabel nilaiUAS dan selanjutnya jika nilai yang diinputkan lebih dari 70 maka ouputnya adalah mahasiswa lulus

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
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1:80
    Masukkan nilai Mahasiswa ke-2:90
    Masukkan nilai Mahasiswa ke-3:80
    Masukkan nilai Mahasiswa ke-4:70
    Masukkan nilai Mahasiswa ke-5:60
    Masukkan nilai Mahasiswa ke-6:80
    Masukkan nilai Mahasiswa ke-7:90
    Masukkan nilai Mahasiswa ke-8:50
    Masukkan nilai Mahasiswa ke-9:65
    Masukkan nilai Mahasiswa ke-10:80


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
System.out.println("Rata - rata nilai mahasiswa adalah "+rata);
```

    Rata - rata nilai mahasiswa adalah 74.5


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

// Tulis jawaban no 1 disini
karena jika perhitungan rata - rata berada di dalam perulangan nantinya perhitungan rata rata akan diulangi secara terus menerus dan outputnya jadi tidak sesuai

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int nilaiMHS[] = new int[10];
double totallulus = 0;
double totaltdklulus = 0;
double ratalulus, ratatdklulus, MHSlulus, MHStdklulus;


for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = sc.nextInt();
}
for(int i = 0; i<nilaiMHS.length; i++){
    if(nilaiMHS[i] > 70){
    totallulus+=nilaiMHS[i];
    MHSlulus++;
    
}else{
    totaltdklulus+=nilaiMHS[i];
    MHStdklulus++;
    } 
}
ratalulus = totallulus/MHSlulus;
ratatdklulus = totaltdklulus/MHStdklulus;
System.out.println("Rata - rata nilai mahasiswa yang lulus adalah "+ratalulus);
System.out.println("Rata - rata nilai mahasiswa yang tidak lulus adalah "+ratatdklulus);
```

    Masukkan nilai Mahasiswa ke-1:10
    Masukkan nilai Mahasiswa ke-2:80
    Masukkan nilai Mahasiswa ke-3:70
    Masukkan nilai Mahasiswa ke-4:60
    Masukkan nilai Mahasiswa ke-5:90
    Masukkan nilai Mahasiswa ke-6:70
    Masukkan nilai Mahasiswa ke-7:60
    Masukkan nilai Mahasiswa ke-8:90
    Masukkan nilai Mahasiswa ke-9:80
    Masukkan nilai Mahasiswa ke-10:100
    Rata - rata nilai mahasiswa yang lulus adalah 88.0
    Rata - rata nilai mahasiswa yang tidak lulus adalah 54.0


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
        hasil=i;
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

// Tulis jawaban no 1 disini
menghentikan paksa perulangan yang sedang berjalan ketika kondisi sudah terpenuhi

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 5;
int hasil = -1;

for(int i = 0; i < arr.length; i++){
    if(key == arr[i]){
        hasil=i;
        break;
    }
}
System.out.println("Key ada di array ke-"+hasil);
```

    Key ada di array ke--1


hasilnya adalah -1 karena key 5 tidak terdapat pada variabel array "arr"

### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0
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
for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
}
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
Scanner sc = new Scanner(System.in);
int checkNum[]=new int[10];
int evenNum[]=new int[10];
int oddNum[]=new int[10];
int cEven, cOdd=0;

for(int i = 0; i<checkNum.length; i++){
    System.out.print("Input Nilai ");
    checkNum[i]=sc.nextInt();
    
}
for(int j = 0; j<checkNum.length; j++)
        if(checkNum[j]%2==0){
            evenNum[cEven]=checkNum[j];
            cEven++;
    }else{
            oddNum[cOdd]=checkNum[j];
            cOdd++;
        }


System.out.println("Nilai Genap adalah : ");
for(int i=0; i<cEven; i++){
    System.out.print(evenNum[i]+" ");
}

System.out.println("\nNilai Ganjil adalah: ");
for(int i=0; i<cOdd; i++){
    System.out.print(oddNum[i]+" ");
}
```

    Input Nilai 1
    Input Nilai 2
    Input Nilai 3
    Input Nilai 4
    Input Nilai 5
    Input Nilai 6
    Input Nilai 7
    Input Nilai 8
    Input Nilai 9
    Input Nilai 10
    Nilai Genap adalah : 
    2 4 6 8 10 
    Nilai Ganjil adalah: 
    1 3 5 7 9 

program diatas digunakan untuk mengelompokan nilai inputan user yang ganjil dan yang genap. yang pertama user akan menginputkan angka secara acak yang nantinya akan disimpan pada array yang sudah ada. lalu dihitung dengan menggunakan program modulus selanjutnya akan dikelompokan angka ganjil dan angka genap.

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int elemen[] = new int[5];

for(int i = 0; i < 5; i++){
    System.out.print("Masukkan Angka ");
    elemen[i] = sc.nextInt();
}

System.out.print("Urutan Terbalik ");
for(int j = 4; j >= 0; j--){
    System.out.print(elemen[j]);
}
```

    Masukkan Angka 5
    Masukkan Angka 2
    Masukkan Angka 7
    Masukkan Angka 9
    Masukkan Angka 6
    Urutan Terbalik : 69725

Program diatas digunakan untuk membalikan urutan angka yang sudah diinputka oleh user dengan menggunakan decrement

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int isi;
int bilterbesar;
System.out.print("Masukkan isi array: ");
isi = sc.nextInt();
int input[] = new int[isi]; 

for(int i = 0; i < input.length; i++){
    System.out.print("Masukkan elemen array ke-"+i+": " );
    input[i] = sc.nextInt();
}
bilterbesar = input[0];
for(int j = 0; j < input.length; j++){
    if(input[j] > bilterbesar){
        bilterbesar = input[j];
    }
}
System.out.print("Bilangan terbesar adalah "+bilterbesar);
```

    Masukkan isi array: 5
    Masukkan elemen array ke-0: 25
    Masukkan elemen array ke-1: 78
    Masukkan elemen array ke-2: 12
    Masukkan elemen array ke-3: 63
    Masukkan elemen array ke-4: 99
    Bilangan terbesar adalah 99

program diatas digunakan untuk mengetahui bilangan terbesar dari urutan bilangan yang diinputkan oleh user.pada program awal setelah mendeklarasi membuat inputan untuk user yang digunakan untuk menginputkan array berdasarkan yang diinginkan oleh user, selanjutnya pada perulangan yang pertama digunakan sebagai inputan user untuk menginputkan nilai elemen setelah menginputkan array dan untuk perulangan yang terakhir digunakan untuk mengetahui bilangan mana yang palng besar dari nilai elemen yang sudah diinputkan user di perulangan sebelumnya dengan menginisialisasi variabel "j" dan kondisi melihat apakah "j" kurang dari "input" dan selanjtnya akan menampilkan hasil bilangan terbesar.


```Java

```
