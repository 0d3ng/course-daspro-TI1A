# JOBSHEET 11. ARRAY 2

## Tujuan
* Mahasiswa mampu memahami pembuatan array dua dimensi
* Mahasiswa mampu menyelesaikan studi kasus dengan memanfaatkan array dua dimensi

## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Deklarasi, Inisialisasi, dan Menampilkan Array 2 Dimensi
Pada Percobaan 1, kode program yang dibuat digunakan untuk menyimpan nilai praktikum dari 2 orang mahasiswa pada 3 mata kuliah yang berbeda.
1.	Buat array bertipe **integer** dengan nama **nilai** dengan kapasitas baris 2 elemen (menyatakan jumlah mahasiswa) dan kolom 3 elemen (menyatakan jumlah mata kuliah)
![Gambar 1](images/percobaan1-1.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
int[][] nilai = new int[2][3];
```
>kita melakukan deklarasi kepada array yang akan kita gunakan pada program pertama.

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;
```
>disini kita melakukan pemberian nilai satu satu pada tiap tiap indeks.



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67

> kita melakukan 

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
tidak, karena meskipun array akan dimulai dari indeks 0. sebenarnya, pemasukan nilai tidak harus dari 0. kita bisa memasukkan nilai dari indeks 1 atau 2. Tapi, jika kita melakukan itu, maka nilai pada indeks 0 adalah null. 

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
int[][] nilai = new int[2][3];
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;
for (int i = 0; i < nilai.length; i++) {
    int j = 0;
    while(j < nilai[0].length) {
        System.out.print(nilai[i][j] + "\t");
        j++;
    }
    System.out.println();
}
```

    75	90	88	
    79	82	67	

> perubahan yang saya lakukan ada pada saat fungsi untuk menampilkan isi elemen array. saya menggunakan perintah for each loop untuk menampilkan setiap elemen dalam array. dengan bagini, kita tidak perlu mengetik panjang panjang untuk menampilkan array dengan dimensi yang besar.


### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
int[][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
for (int i = 0; i < rating.length; i++) {
    for(int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 8
    Masukkan rating pengguna 0 untuk restoran 1 : 6
    
    Masukkan rating pengguna 1 untuk restoran 0 : 9
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 4
    Masukkan rating pengguna 2 untuk restoran 1 : 6
    
    Masukkan rating pengguna 3 untuk restoran 0 : 7
    Masukkan rating pengguna 3 untuk restoran 1 : 5
    

>yang saya lakukan disini adalah meminta input dari beberapa user mengenai rating antara 2 restoran. dan menyimpannya kedalam array 2 dimensi.

4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg : rating) {
    for (int r : rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    8 6 
    9 7 
    4 6 
    7 5 

> ini adalah perintah for each loop yang dapat saya  gunakan untuk menampilkan data. pada perulangan pertama, saya perlu mengurai array 2 dimensi dan menyimpannya ke dalam array baru berdimensi satu yang saya namai dengan rtg. kemudian, pada perulangan kedua, saya mengurainya lagi dan menyimpannya ke dalam variabel primitf yang hanya dapat menyimpan angka tanpa urutan indeks. kemudian, setelah kita masukkan kedalam ;variabel primitif, kita dapat menampilkan angka pada variabel r.

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

>tidak bisa, karena karena j merepresentasikan indeks baris(4), dan i merepresentasikan indeks kolom(2). karena itu, saat pada perintah menginputkan nilai di rating[i][j] akan error. karena indeks kolom yang seharusnya hanya ada 2, kita masukkan dengan indeks 4. ketidaksesuaian antara inisialisasi dengan penginputan nilai ini yang akan menjadi masalah(error)

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Tentukan jumlah baris : ");
int baris = sc.nextInt();
System.out.print("Tentukan jumlah kolom : ");
int kolom = sc.nextInt();

int[][] rating = new int[baris][kolom];
for (int i = 0; i < baris; i++) {
    for(int j = 0; j < kolom; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
for(int[] rtg : rating) {
    for (int r : rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Tentukan jumlah baris : 3
    Tentukan jumlah kolom : 2
    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    
    Masukkan rating pengguna 1 untuk restoran 0 : 5
    Masukkan rating pengguna 1 untuk restoran 1 : 6
    
    Masukkan rating pengguna 2 untuk restoran 0 : 8
    Masukkan rating pengguna 2 untuk restoran 1 : 6
    
    3 4 
    5 6 
    8 6 

> disini saya melakukan penambahan perintah, yakni perintah meminta input dari user mengenai jumlah baris dan kolom. nilai ini nnti yang akan dijadikan sebagai indeks dari array yang kita gunakan untuk menyimpan rating dari tiap tiap restoran. jumlah baris untuk jumlah restoran yang akan dirating. dan jumlah kolom merepresentasikan jumlah pelanggan yang memberikan nilai rating. setelah itu, perintah kodenya sama dengan percobaan sebelumnya.


### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
int[][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
for (int i = 0; i < harga.length; i++) {
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga [%d] [%d] : ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0] [0] : 10000
    Masukkan harga [0] [1] : 20000
    Masukkan harga [0] [2] : 30000
    Masukkan harga [0] [3] : 40000
    Masukkan harga [0] [4] : 50000
    Masukkan harga [0] [5] : 60000
    Rata-rata harga bahan ke-0 adalah 35000.00
    Masukkan harga [1] [0] : 100000
    Masukkan harga [1] [1] : 90000
    Masukkan harga [1] [2] : 80000
    Masukkan harga [1] [3] : 70000
    Masukkan harga [1] [4] : 60000
    Masukkan harga [1] [5] : 50000
    Rata-rata harga bahan ke-1 adalah 75000.00
    Masukkan harga [2] [0] : 50000
    Masukkan harga [2] [1] : 60000
    Masukkan harga [2] [2] : 70000
    Masukkan harga [2] [3] : 80000
    Masukkan harga [2] [4] : 30000
    Masukkan harga [2] [5] : 40000
    Rata-rata harga bahan ke-2 adalah 55000.00

> 

#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

untuk menghitung rata rata dari jumlah harga setiap 6 bulan.

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

maka nilai dari perulangan pada baris kedua juga akan ditambahkan pada nilai rata. akibatnya, nilai rata rata per enam bulan juga tidak akan sesuai dengan data yang ada.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double[][] suhu = new double[5][7];
double max = 0;

for (int x = 0; x < suhu.length; x++) {
    for ( int y = 0; y < suhu[0].length; y++) {
        System.out.print("Suhu di kota " + (x + 1) + " pada hari ke-" + (y + 1) + " : ");
        suhu[x][y] = sc.nextInt();
        if (suhu[x][y] > max) {
            max = suhu[x][y];
        }
    }
}
System.out.println("Suhu tertinggi dari 5 kota selama 7 hari adalah " + max);
```

>pertama, saya menyiapkan array suhu dan variabel max. array suhu digunakan untuk menyimpan nilai dari suhu tiap tiap kota. sedangkan variabel mac digunakan untuk menyimpan sementara nilai tertinggi dari suhu tiap tiap kota. setelah iitu. kita meminta input dari user dengan menggunakan 2 perulangan dan memasukkannya ke dalam array suhu. setelah itu, kita menggunakan perintah pemilihan yang jika nilai suhu yang diinputkan itu lebih besar daripada niali yang kita telah simpan di variabel max, maka nilai tersebut akan disimpan di vatiabel max dan menggantikan nilai dari variabel max. 

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
int[][] tabel = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}};
byte tertua = 0, terendah = 100, letakBaris = 0;
int jumlah = 0, tinggiTertinggi = 0;
double rata;
String[] namaMahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

for (int i = 0; i < tabel.length; i++) {
    if (tabel[i][0] > tertua) {
        letakBaris = (byte) i;
    }
    if (tabel[i][1] < terendah) {
        terendah = (byte) tabel[i][1];
    }
    jumlah += tabel[i][2];
}
rata = jumlah / tabel[0].length;
System.out.println("Siswa tertua adalah " + namaMahasiswa[letakBaris]);
System.out.println("Berat badan terendah seluruh mahasiswa adalah " + terendah);
System.out.println("Rata-rata tinggi badan seluruh mahasiswa adalah " + rata);
```

    Siswa tertua adalah Beky
    Berat badan terendah seluruh mahasiswa adalah 45
    Rata-rata tinggi badan seluruh mahasiswa adalah 263.0

> pertama, saya lakukan pemasukan nilai ke dalam array tabel dan menyiapkan beberapa variabel. saya juga menyimpan nama ;nama siswa ke dalam suatu arrray string. Setelah itu, saya menggunakan perulangan sekali. ada beberapa perintah yang saya gunakan disini. pada perualngan kedua, saya melakukan percabangan. percabangan pertama mengidentifikasi umur tertua dari array indeks kolom ke-0. jika nilai pada array lebih tinggi dari nilai pada varibel tertua, maka indeks letak baris akan terekam dalam variabel letakBaris. variabel letakBaris ini akan digunakan nanti untuk memanggil daftar nama siswa tertua. setelah itu, percabangan kedua saya gunakan untuk mengidentifikasi siswa dengan berat badan terendah. nilai terendah akan disimpan pada variabel terendah. kemudian, pada perintah terakhir, saya melakukan penjumlahan pada indeks kolom kedua(tinggi). diluar perulangan, saya melakukan perhitungan rata rata dari hasil jumlah perulangan dibagi dengan panjang indeks kolom. setelah itu, saya melakukan panggilan kepada array string menggunakan indeks yang telah saya siapkan pada perulangan. kemudian panggilan terhadap data berat badan terendah dan rata-rata tinggi badan.
