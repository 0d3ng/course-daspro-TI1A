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

- Indeks terbesar ke terkecil = bil[3], bil[1], bil[2], bil[0]

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
bil[0] = 5.0;
bil[1] = 12876;
bil[2] = 7.5;
bil[3] = 2000000;
```


    |   bil[0] = 5.0;

    incompatible types: possible lossy conversion from double to int

    


- Karena tipe data dari array bil adalah integer, sedangkan untuk 5.0 dan 7.5 termasuk tipe data float

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i=0; i<4 ; i++){
    System.out.println(bil[i]);
}
```

    5
    12
    7
    20
    

- Pada perulangan tersebut variabel i didefinisikan sebagai indeks array, dan terjadi perulangan pada variabel i mulai dari 1 hingga 3 sehingga akan memunculkan nilai dari array bil mulai dari indeks 1 hingga 3

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;

Scanner scan = new Scanner(System.in);
int nilaiUAS[] = new int[6];

for(int i=0; i<6; i++){
    System.out.printf("Masukkan Nilai UAS Ke-%d: ", i);
    nilaiUAS[i] = scan.nextInt();
}

for(int i=0; i<6; i++){
    System.out.printf("Nilai UAS ke-%d adalah %d \n", i, nilaiUAS[i]);
}
```

    Masukkan Nilai UAS Ke-0: 70
    Masukkan Nilai UAS Ke-1: 70
    Masukkan Nilai UAS Ke-2: 70
    Masukkan Nilai UAS Ke-3: 70
    Masukkan Nilai UAS Ke-4: 70
    Masukkan Nilai UAS Ke-5: 70
    Nilai UAS ke-0 adalah 70 
    Nilai UAS ke-1 adalah 70 
    Nilai UAS ke-2 adalah 70 
    Nilai UAS ke-3 adalah 70 
    Nilai UAS ke-4 adalah 70 
    Nilai UAS ke-5 adalah 70 
    

2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
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
    nilaiUAS[i] = scan.nextInt();
}
```

    Masukkan nilai UAS ke-0: 60
    Masukkan nilai UAS ke-1: 60
    Masukkan nilai UAS ke-2: 60
    Masukkan nilai UAS ke-3: 60
    Masukkan nilai UAS ke-4: 60
    Masukkan nilai UAS ke-5: 60
    

5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah : " + nilaiUAS[i]);
}
```

    Nilai UAS ke-0 adalah : 60
    Nilai UAS ke-1 adalah : 60
    Nilai UAS ke-2 adalah : 60
    Nilai UAS ke-3 adalah : 60
    Nilai UAS ke-4 adalah : 60
    Nilai UAS ke-5 adalah : 60
    

#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
for(int i = 0; i < nilaiUAS.length; i++){
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = scan.nextInt();
}
```

    Masukkan nilai UAS ke-0: 50
    Masukkan nilai UAS ke-1: 70
    Masukkan nilai UAS ke-2: 80
    Masukkan nilai UAS ke-3: 30
    Masukkan nilai UAS ke-4: 90
    Masukkan nilai UAS ke-5: 40
    

- nilaiUAS.length berfungsi untuk menghitung jumlah indeks yang ada di dalam array sehingga dapat dijadikan parameter pada perulangan

2. Apa kegunaan dari `nilaiUAS.length`? 

- nilaiUAS.length berfungsi untuk menghitung jumlah atau panjangnya indeks array

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for (int i = 0; i < nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){
        System.out.println("Mahasiswa ke-" + i + " lulus");
    }
}
```

    Mahasiswa ke-2 lulus
    Mahasiswa ke-4 lulus
    

- Pada program tersebut input nilai yang ada di array nilaiUAS akan dicek satu persatu yang dimana jika nilaiUAS nya lebih dari 70 maka akan menghasilkan sebuah output print

### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
// Tulis Kode program Percobaan 3 Langkah 1 di atas, disini
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
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
    nilaiMHS[i] = scan.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1:70
    Masukkan nilai Mahasiswa ke-2:80
    Masukkan nilai Mahasiswa ke-3:70
    Masukkan nilai Mahasiswa ke-4:50
    Masukkan nilai Mahasiswa ke-5:90
    Masukkan nilai Mahasiswa ke-6:60
    Masukkan nilai Mahasiswa ke-7:80
    Masukkan nilai Mahasiswa ke-8:90
    Masukkan nilai Mahasiswa ke-9:70
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
// Tulis Kode program Percobaan 3 Langkah 5 di atas, disini
rata = total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah "+rata);
```

    Rata-rata nilai mahasiswa adalah 74.0


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?


- Karena jika ada di dalam perulangan maka akan perhitungan rata-rata akan diulangi terus dan akan mengakibatkan hasil yang salah

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
int nilaiMHS[] = new int[10];
int totalLulus, totalTdkLulus;
int lulus = 0, tdklulus = 0;
double rataLulus, rataTdkLulus;

for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = scan.nextInt();
}

for(int i = 0; i<nilaiMHS.length; i++){
    if(nilaiMHS[i] < 70){
        totalTdkLulus+=nilaiMHS[i];
        tdklulus++;
    } else {
        totalLulus+=nilaiMHS[i];
        lulus++;
    }
}

rataLulus = totalLulus/lulus;
System.out.println("Rata-Rata nilai mahasiswa yang lulus adalah "+rataLulus);
rataTdkLulus = totalTdkLulus/tdklulus;
System.out.println("Rata-Rata nilai mahasiswa yang tidak lulus adalah "+rataTdkLulus);
```

    Masukkan nilai Mahasiswa ke-1:50
    Masukkan nilai Mahasiswa ke-2:50
    Masukkan nilai Mahasiswa ke-3:50
    Masukkan nilai Mahasiswa ke-4:50
    Masukkan nilai Mahasiswa ke-5:50
    Masukkan nilai Mahasiswa ke-6:90
    Masukkan nilai Mahasiswa ke-7:90
    Masukkan nilai Mahasiswa ke-8:90
    Masukkan nilai Mahasiswa ke-9:90
    Masukkan nilai Mahasiswa ke-10:90
    Rata-Rata nilai mahasiswa yang lulus adalah 90.0
    Rata-Rata nilai mahasiswa yang tidak lulus adalah 50.0
    

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
for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
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

- Break digunakan untuk menghentikan perulangan

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 5;
int hasil = -1;

for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break;
    }
}

System.out.println("Key ada di array ke-"+hasil);
```

    Key ada di array ke--1


- Karena pada array arr[] tidak terdapat value 5 sehingga pemiligan nya dilewati dan variabel hasil valuenya tetap -1

### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int[] arr = {16,4,10,90,27,3,12,28};
int temp = 0;
```

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 2 di atas, disini
for(int i = 0; i < arr.length; i++){
    for(int j=1; j<(arr.length-i);j++){
        if(arr[j-1]>arr[j]){
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
System.out.println("Hasil Pengurutan : ");
for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
}
```

    Hasil Pengurutan : 
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
Scanner scan = new Scanner(System.in);
int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven = 0, cOdd = 0;

for(int i=0; i<checkNum.length; i++){
    System.out.print("Masukan Bilangan : ");
    checkNum[i] = scan.nextInt();
}

for(int j=0; j<checkNum.length; j++){
    if(checkNum[j]%2 == 0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}

System.out.print("Angka Genap Adalah : ");
for(int x=0; x<evenNum.length; x++){
    System.out.print(evenNum[x]+", ");
}
System.out.println("");
System.out.print("Angka Ganjil Adalah : ");
for(int z=0; z<oddNum.length; z++){
    System.out.print(oddNum[z]+", ");
}
```

    Masukan Bilangan : 1
    Masukan Bilangan : 2
    Masukan Bilangan : 3
    Masukan Bilangan : 4
    Masukan Bilangan : 5
    Masukan Bilangan : 6
    Masukan Bilangan : 7
    Masukan Bilangan : 8
    Masukan Bilangan : 9
    Masukan Bilangan : 10
    Angka Genap Adalah : 2, 4, 6, 8, 10, 0, 0, 0, 0, 0, 
    Angka Ganjil Adalah : 1, 3, 5, 7, 9, 0, 0, 0, 0, 0, 

- Program diatas digunakan untuk menentukan jumlah bilangan ganjil dan genap dari suatu inputan pada array. Awalnya kita memasukkan angka-angka yang akan dimasukkan kedalam array, kemudian ditentukan ganjil genapnya dengan menghitung modulusnya. Jika modulusnya 0 maka bilangan tersebut genap dan akan ditampung ke evenNum namun jika bukan 0 maka bilangan tersebut ganjil dan akan ditampung ke oddNum. Terakhir kita munculkan outputnya berdasarkan evenNum dan oddNum nya.

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
int a[] = new int[5];

Scanner scan = new Scanner(System.in);

for(int i=0; i<5; i++){
    System.out.print("Masukkan Angka : ");
    a[i] = scan.nextInt();
}

for(int j=4; j>=0; j--){
    System.out.print(a[j]+" ");
}
```

    Masukkan Angka : 1
    Masukkan Angka : 2
    Masukkan Angka : 3
    Masukkan Angka : 4
    Masukkan Angka : 5
    5 4 3 2 1 

- Program diatas digunakan untuk menentukan urutan dari bilangan array dari belakang ke depan. Maka setelah memasukkan input berupa angka dan ditampung dalam array, kemudian ditampilkan secara terbalik menggunakan decrement

###### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;

Scanner scan = new Scanner(System.in);
int jumlah;

System.out.print("Masukkan Isi Array : ");
jumlah = scan.nextInt();

int arr[] = new int[jumlah];

for(int i=0; i < arr.length; i++){
    System.out.print("Masukkan Elemen Array ke-"+ i + ": ");
    arr[i] = scan.nextInt();
}

for(int x = 0; x < arr.length; x++){
    for(int j=1; j<(arr.length-x);j++){
        if(arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
    }
}

System.out.print("Bilangan terbesar adalah : " + arr[jumlah-1]);
```

    Masukkan Isi Array : 5
    Masukkan Elemen Array ke-0: 5
    Masukkan Elemen Array ke-1: 2
    Masukkan Elemen Array ke-2: 6
    Masukkan Elemen Array ke-3: 2
    Masukkan Elemen Array ke-4: 2
    Bilangan terbesar adalah : 6

- Program diatas digunakan untuk mencari bilangan terbesar dari sebuah array. Setelah memasukkan input angka dan ditampung pada array, kemudian array tersebut akan diurutkan menggunakan metode bubble sort. Dan untuk mencari bilangan terbesarnya maka yang ditampilkan adalah angka pada urutan yang terakhir saja
