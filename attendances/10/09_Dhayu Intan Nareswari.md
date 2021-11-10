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
int[] bil=new int[4];
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
// Indeks array terbesar adalah 3, dan index array terkecil adalah 0
```

Maka akan terjadi error karena tipe datanya adalah integer, apabila insialisasi yang dilakukan bukan bilangan bulat (integer) yaitu desimal maka tipe data seharusnya double atau float.

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
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

    


Maka akan terjadi error karena tipe datanya adalah integer, apabila insialisasi yang dilakukan bukan bilangan bulat (integer) yaitu desimal maka tipe data seharusnya double atau float.

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i=0; i<4; i++){
    System.out.println(bil[i]);
}
```

    5
    12
    7
    20



```Java
// Output yang keluar akan sama dengan kode pada langkah no.3 yaitu : 5, 12, 7, 20
// Hal tersebut karena looping for digunakan untuk mengoutputkan bilangan indeks 0 sampai dengan indeks < 4 (indeks 3) 
```

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

    Masukkan nilai UAS ke-0: 90
    Masukkan nilai UAS ke-1: 92
    Masukkan nilai UAS ke-2: 94
    Masukkan nilai UAS ke-3: 96
    Masukkan nilai UAS ke-4: 98
    Masukkan nilai UAS ke-5: 100


5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah : " + nilaiUAS[i]);
}
```

    Nilai UAS ke-0 adalah : 90
    Nilai UAS ke-1 adalah : 92
    Nilai UAS ke-2 adalah : 94
    Nilai UAS ke-3 adalah : 96
    Nilai UAS ke-4 adalah : 98
    Nilai UAS ke-5 adalah : 100


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
```

    Masukkan nilai UAS ke-0: 90
    Masukkan nilai UAS ke-1: 92
    Masukkan nilai UAS ke-2: 94
    Masukkan nilai UAS ke-3: 96
    Masukkan nilai UAS ke-4: 98
    Masukkan nilai UAS ke-5: 100


Statement diatas bertujuan supaya kita menginputkan nilai sebanyak i kali, dimana i merupakan panjang dari array.

Pada langkah tiga kapasitas array diatur sebanyak 6 elemen, oleh karena itu kita dapat menginputkan data sebanyak 6 kali 
dari indeks 0 hingga indeks<6 (5)

Hal tersebut yang menyebabkan tidak terjadi perubahan, karena sebenarnya langkah No 4 dengan kode diatas bermakna sama 
yaitu untuk menginputkan nilai sebanyak 6 kali (indeks 0 hingga <6 atau 5)

2. Apa kegunaan dari `nilaiUAS.length`? 


```Java
// Tulis Jawaban nomor 2 disini
// Tujuannya untuk mengetahui panjang array dari nilaiUAS (ada berapa elemen yang ada pada nilai UAS)
// Apabila pada loop diatas nilaiUAS.length berarti bahwa nilai akan diinputkan sebanyak panjang array yang telah diinisialisasi
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
```

    Mahasiswa ke-0 lulus
    Mahasiswa ke-1 lulus
    Mahasiswa ke-2 lulus
    Mahasiswa ke-3 lulus
    Mahasiswa ke-4 lulus
    Mahasiswa ke-5 lulus


Alur program : Kita menginputkan nilai UAS sebanyak 6 kali, setelah itu dilihat mulai dari indeks 0 hingga indeks 5, apakah nilai UAS > 70 ? 
apabila nilai > 70 maka akan keluar pernyataan mahasiswa ke i lulus

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
    System.out.print("Masukkan nilai Mahasiswa ke-"+ (i + 1)+ ":");
                     nilaiMHS[i] = sc.nextInt();
                     }
```

    Masukkan nilai Mahasiswa ke-1:81
    Masukkan nilai Mahasiswa ke-2:85
    Masukkan nilai Mahasiswa ke-3:90
    Masukkan nilai Mahasiswa ke-4:92
    Masukkan nilai Mahasiswa ke-5:84
    Masukkan nilai Mahasiswa ke-6:78
    Masukkan nilai Mahasiswa ke-7:90
    Masukkan nilai Mahasiswa ke-8:87
    Masukkan nilai Mahasiswa ke-9:98
    Masukkan nilai Mahasiswa ke-10:80


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i<nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata= total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah "+rata);
```

    Rata-rata nilai mahasiswa adalah 86.5


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

// Tulis jawaban no 1 disini


Karena yang perlu dilakukan perulangan yaitu inputan untuk menginput nilai sebanyak 10 kali, dan totalnya, artinya nilai mahasiswa 1 dijumlah dengan nilai mahasiswa 2, lalu hasil penjumlahan tersebut ditambahkan dengan nilai mahasiswa 3, dan seterusnya hingga mahasiswa ke 10.

Setelah diketahui totalnya maka untuk mencari rata-ratanya hanya perlu total/banyak siswa(length)


2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int nilaiMHS[] = new int[10];
double totalGagal, totalLulus;
double rataLulus, rataGagal;
int a=0;
int b=0;
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+ (i + 1)+ ":");
                     nilaiMHS[i] = sc.nextInt();
                     }
for(int i = 0; i < nilaiMHS.length; i++){
    if(nilaiMHS[i] > 70){
        totalLulus+=nilaiMHS[i];
        a++;
    }else{
        totalGagal+=nilaiMHS[i];
        b++;
    }
}
rataLulus = totalLulus/a;
rataGagal = totalGagal/b;
System.out.println("Rata-rata nilai mahasiswa yang lulus adalah"+rataLulus);
System.out.println("Rata-rata nilai mahasiswa yang gagal adalah"+rataGagal);
```

    Masukkan nilai Mahasiswa ke-1:60
    Masukkan nilai Mahasiswa ke-2:62
    Masukkan nilai Mahasiswa ke-3:60
    Masukkan nilai Mahasiswa ke-4:62
    Masukkan nilai Mahasiswa ke-5:60
    Masukkan nilai Mahasiswa ke-6:62
    Masukkan nilai Mahasiswa ke-7:90
    Masukkan nilai Mahasiswa ke-8:95
    Masukkan nilai Mahasiswa ke-9:90
    Masukkan nilai Mahasiswa ke-10:95
    Rata-rata nilai mahasiswa yang lulus adalah92.5
    Rata-rata nilai mahasiswa yang gagal adalah61.0


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


```Java
// Tulis jawaban no 1 disini
// Untuk menghentikan loop, apabila key sudah ditemukan.
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 5;
int hasil = -1; // penyebab hasil yang keluar -1
for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break;
    }
}
System.out.println("Key ada di array ke-"+hasil);
```

    Key ada di array ke--1


Hasil output -1 karena kondisi if(key==arr[i]) tidak ada yang memenuhi, tidak ditemukan 5 sebagai key, sehingga akan dioutputkan hasil sesuai dengan inisialisasi awal yaitu int hasil = -1

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
Scanner sc = new Scanner(System.in);
int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven, cOdd=0;
for(int i = 0; i < checkNum.length; i++){
    System.out.print("Masukkan Bilangan :");
    checkNum[i] = sc.nextInt();
}for(int j = 0; j < checkNum.length; j++){
    if(checkNum[j] % 2 == 0) {
        evenNum[cEven] = checkNum[j];
        cEven++;
}else{
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }}
for(int j=0; j<cEven; j++){
    System.out.println("Bilangan Genap " + evenNum[j]);
}
for(int j=0; j<cOdd; j++){
    System.out.println("Bilangan Ganjil " + oddNum[j]);
}

```

    Masukkan Bilangan :10
    Masukkan Bilangan :9
    Masukkan Bilangan :8
    Masukkan Bilangan :7
    Masukkan Bilangan :6
    Masukkan Bilangan :5
    Masukkan Bilangan :4
    Masukkan Bilangan :3
    Masukkan Bilangan :2
    Masukkan Bilangan :1
    Bilangan Genap 10
    Bilangan Genap 8
    Bilangan Genap 6
    Bilangan Genap 4
    Bilangan Genap 2
    Bilangan Ganjil 9
    Bilangan Ganjil 7
    Bilangan Ganjil 5
    Bilangan Ganjil 3
    Bilangan Ganjil 1


### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bilangan[] = new int[5];
for(int i = 0; i < bilangan.length; i++){
    System.out.print("Masukkan Bilangan :");
    bilangan[i] = sc.nextInt();
} // untuk menginputkan bilangan sebanyak 5 kali
for(int i = bilangan.length - 1; i >= 0; i--) {
  System.out.println("indeks bilangan ke-" + i + "=" + bilangan[i]);
} // untuk mengoutputkan bilangan dari indeks terakhir hingga indeks 0 
```

    Masukkan Bilangan :1
    Masukkan Bilangan :2
    Masukkan Bilangan :3
    Masukkan Bilangan :4
    Masukkan Bilangan :5
    indeks bilangan ke-4=5
    indeks bilangan ke-3=4
    indeks bilangan ke-2=3
    indeks bilangan ke-1=2
    indeks bilangan ke-0=1


### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bil, maks;
System.out.print("Jumlah elemen array: ");
int[] bil = new int[sc.nextInt()];
for(int i = 0; i < bil.length; i++){
    System.out.print("Masukkan elemen array ke-" + i + ": ");
    bil[i] = sc.nextInt();
} // untuk menginputkan elemen sebanyak jumlah yang diinginkan
maks = bil[0];
for(int i = 0; i < bil.length; i++){
    if(bil[i] > maks){
        maks = bil[i];
    } // setiap kali ada i terbaru yang lebih besar maka i tersebut niai maksimalnya
}System.out.println("Bilangan terbesar adalah "+ maks);

```

    Jumlah elemen array: 6
    Masukkan elemen array ke-0: 10
    Masukkan elemen array ke-1: 29
    Masukkan elemen array ke-2: 31
    Masukkan elemen array ke-3: 88
    Masukkan elemen array ke-4: 21
    Masukkan elemen array ke-5: 99
    Bilangan terbesar adalah 99

