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




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai [0][2]);
System.out.println(nilai[1][0] + " " + nilai[0][0] + " " + nilai [1][2]);
```

    75 90 88
    79 75 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
Jawab :  Pengisian elemen array tidak harus dilakukan secara berurutan mulai indeks 0. pengisian elemen array dapat dilakukan berurutan atau random berdasarkan indeks tertentu.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
int[][] nilai = new int[2][3];
nilai[0][0] = 75;
nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 82;
nilai[1][2] = 67;

for (int i=0; i<2; i++){
    for (int j=0; j<3; j++){
        System.out.print(nilai[i][j] + " ");
    }
        System.out.println();
}
```

    75 90 88 
    79 82 67 


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
// Tuliskan kode program Percobaan 2 Langkah 2
int[][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 4
    Masukkan rating pengguna 0 untuk restoran 1 : 3
    
    Masukkan rating pengguna 1 untuk restoran 0 : 4
    Masukkan rating pengguna 1 untuk restoran 1 : 2
    
    Masukkan rating pengguna 2 untuk restoran 0 : 4
    Masukkan rating pengguna 2 untuk restoran 1 : 4
    
    Masukkan rating pengguna 3 untuk restoran 0 : 3
    Masukkan rating pengguna 3 untuk restoran 1 : 3
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) {
    for (int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    4 3 
    4 2 
    4 4 
    3 3 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 
Tidak bisa, karena posisi i menunjukan baris dan j menunjukan kolom. posisi i dan j tidak bisa ditukar

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan jumlah baris ");
int a = sc.nextInt();
System.out.print("Masukkan jumlah kolom ");
int b = sc.nextInt();
int[][] rating = new int[a][b];

for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
for (int[] rtg : rating) {
    for (int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Masukkan jumlah baris 4
    Masukkan jumlah kolom 3
    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    Masukkan rating pengguna 0 untuk restoran 2 : 3
    
    Masukkan rating pengguna 1 untuk restoran 0 : 4
    Masukkan rating pengguna 1 untuk restoran 1 : 3
    Masukkan rating pengguna 1 untuk restoran 2 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 3
    Masukkan rating pengguna 2 untuk restoran 1 : 4
    Masukkan rating pengguna 2 untuk restoran 2 : 5
    
    Masukkan rating pengguna 3 untuk restoran 0 : 3
    Masukkan rating pengguna 3 untuk restoran 1 : 4
    Masukkan rating pengguna 3 untuk restoran 2 : 5
    
    3 4 3 
    4 3 4 
    3 4 5 
    3 4 5 


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
// Tuliskan kode program Percobaan 3 Langkah 2
int[][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for (int i = 0; i < harga.length; i++) {
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga [%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga [i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0][0]: 2000
    Masukkan harga [0][1]: 1000
    Masukkan harga [0][2]: 3000
    Masukkan harga [0][3]: 4000
    Masukkan harga [0][4]: 2000
    Masukkan harga [0][5]: 1000
    Rata-rata harga bahan ke-0 adalah 2166.67
    Masukkan harga [1][0]: 2000
    Masukkan harga [1][1]: 1000
    Masukkan harga [1][2]: 3000
    Masukkan harga [1][3]: 2000
    Masukkan harga [1][4]: 1000
    Masukkan harga [1][5]: 1000
    Rata-rata harga bahan ke-1 adalah 1666.67
    Masukkan harga [2][0]: 2000
    Masukkan harga [2][1]: 1000
    Masukkan harga [2][2]: 2000
    Masukkan harga [2][3]: 3000
    Masukkan harga [2][4]: 4000
    Masukkan harga [2][5]: 4000
    Rata-rata harga bahan ke-2 adalah 2666.67


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1
untuk menghitung rata rata dengan total dibagi harga[0].length dimana harga[0].length adalah panjang array pada kolom

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2
 karena berada di dalam perulangan for yang pertama maka yang ditotal adalah harga tiap bahan pada 1 semester. apabila inisialisasi kedua variabel tersebut diletakkan diluar perulangan maka yang ditotal adalah harga semua bahan pada 1 semester.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;   // untuk menambahkan library Scanner
Scanner sc = new Scanner(System.in); // untuk membuat deklarasi Scanner
double suhu[][] = new double[5][7]; // membuat deklarasi dan instansiasi array bertipe double
double max=0; // membuat variabe max dengan tipe data double dan bernilai 0
for (int x = 0; x < suhu.length; x++) { // outer loop untuk melakukan perulangan pada baris
    for (int y = 0; y < suhu[0].length; y++){ // inner loop untuk melakukan perulangan pada kolom
        System.out.print("Masukkan suhu dari kota di indeks ke " +  x  + " pada hari di indeks ke " +  y + " : " );// untuk menginput suhu
        suhu[x][y] = sc.nextInt(); // input suhu 
        if(suhu[x][y]>max){  // kondisi jika suhu lebih besar dari max
        max=suhu[x][y]; // menyimpan nilai pada variabel max
        }
    }
    System.out.println("Suhu tertinggi adalah " + max); // menampilkan output pada suhu tertinggi
}
```

    Masukkan suhu dari kota di indeks ke 0 pada hari di indeks ke 0 : 10
    Masukkan suhu dari kota di indeks ke 0 pada hari di indeks ke 1 : 12
    Masukkan suhu dari kota di indeks ke 0 pada hari di indeks ke 2 : 13
    Masukkan suhu dari kota di indeks ke 0 pada hari di indeks ke 3 : 14
    Masukkan suhu dari kota di indeks ke 0 pada hari di indeks ke 4 : 15
    Masukkan suhu dari kota di indeks ke 0 pada hari di indeks ke 5 : 16
    Masukkan suhu dari kota di indeks ke 0 pada hari di indeks ke 6 : 19
    Suhu tertinggi adalah 19.0
    Masukkan suhu dari kota di indeks ke 1 pada hari di indeks ke 0 : 10
    Masukkan suhu dari kota di indeks ke 1 pada hari di indeks ke 1 : 15
    Masukkan suhu dari kota di indeks ke 1 pada hari di indeks ke 2 : 16
    Masukkan suhu dari kota di indeks ke 1 pada hari di indeks ke 3 : 20
    Masukkan suhu dari kota di indeks ke 1 pada hari di indeks ke 4 : 21
    Masukkan suhu dari kota di indeks ke 1 pada hari di indeks ke 5 : 23
    Masukkan suhu dari kota di indeks ke 1 pada hari di indeks ke 6 : 16
    Suhu tertinggi adalah 23.0
    Masukkan suhu dari kota di indeks ke 2 pada hari di indeks ke 0 : 18
    Masukkan suhu dari kota di indeks ke 2 pada hari di indeks ke 1 : 10
    Masukkan suhu dari kota di indeks ke 2 pada hari di indeks ke 2 : 20
    Masukkan suhu dari kota di indeks ke 2 pada hari di indeks ke 3 : 37
    Masukkan suhu dari kota di indeks ke 2 pada hari di indeks ke 4 : 24
    Masukkan suhu dari kota di indeks ke 2 pada hari di indeks ke 5 : 36
    Masukkan suhu dari kota di indeks ke 2 pada hari di indeks ke 6 : 12
    Suhu tertinggi adalah 37.0
    Masukkan suhu dari kota di indeks ke 3 pada hari di indeks ke 0 : 12
    Masukkan suhu dari kota di indeks ke 3 pada hari di indeks ke 1 : 13
    Masukkan suhu dari kota di indeks ke 3 pada hari di indeks ke 2 : 13
    Masukkan suhu dari kota di indeks ke 3 pada hari di indeks ke 3 : 16
    Masukkan suhu dari kota di indeks ke 3 pada hari di indeks ke 4 : 20
    Masukkan suhu dari kota di indeks ke 3 pada hari di indeks ke 5 : 37
    Masukkan suhu dari kota di indeks ke 3 pada hari di indeks ke 6 : 15
    Suhu tertinggi adalah 37.0
    Masukkan suhu dari kota di indeks ke 4 pada hari di indeks ke 0 : 15
    Masukkan suhu dari kota di indeks ke 4 pada hari di indeks ke 1 : 16
    Masukkan suhu dari kota di indeks ke 4 pada hari di indeks ke 2 : 27
    Masukkan suhu dari kota di indeks ke 4 pada hari di indeks ke 3 : 15
    Masukkan suhu dari kota di indeks ke 4 pada hari di indeks ke 4 : 16
    Masukkan suhu dari kota di indeks ke 4 pada hari di indeks ke 5 : 17
    Masukkan suhu dari kota di indeks ke 4 pada hari di indeks ke 6 : 15
    Suhu tertinggi adalah 37.0


2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner; // untuk menambahkan library Scanner
Scanner sc = new Scanner(System.in); // untuk membuat deklarasi Scanner
int dataMhs[][] = {                     // untuk deklarasi array
                    {19, 51, 155},
                    {18, 55, 163},
                    {18, 45, 153},
                    {20, 46, 158},
                    {19, 58, 160},
};
String namaMhs[] ={"Desi", "Rofan", "Lala", "Beky", "Ega"}; // membuat array 1 dimensi dengan elemen berisi nama mahasiswa
int max=0; // membuat variabel max dengan tipe data int dan diberi nilai awal 0 agar tidak error
double total,rata; // membuat variabel total dan rata dengan tipe data double
int min=59; // membuat variabel min dengan tipe data int dan diberi nilai awal 59 agar tidak error
String nama; // membuat variabel nama bertipe data String
for (int x = 0; x < dataMhs.length; x++) { // outer loop
    for (int y = 0; y < dataMhs[0].length; y++){ // inner loop
          if(dataMhs[x][0]>max){ // kondisi jika data mahasiswa pada x(baris) dan kolom pada indeks ke 0 lebih besar dari max
        max=dataMhs[x][0]; // untuk menyimpan nilai pada variabel max
        nama=namaMhs[x]; // untuk menyimpan nama yang ada di string
    }
        if(dataMhs[x][1]<min){ // kondisi jika data mahasiswa pada x(baris) dan kolom pada indeks ke 1 lebih kecil dari min 
            min=dataMhs[x][1]; // untuk menyimpan nilai pada variabel min
        }
        System.out.print(dataMhs[x][y] + " "); // untuk menampilkan output data mahasiswa 
         }
        System.out.println(); // untuk ganti baris 
        total += dataMhs[x][2]; // untuk melakukan penjumlahan data mahasiswa pada x(baris) dan kolom indeks ke 2
}
    rata = total/5; // untuk menghitung rata-rata tinggi badan mahasiswa
System.out.println("Nama mahasiswa dengan umur tertua adalah " + nama);// menampilkan output nama mahasiswa dengan umur tertua
System.out.println("Rata-rata tinggi badan " + rata); // untuk menampilkan output rata-rata tinggi badan mahasiswa
System.out.println("berat badan terendah adalah " + min); // untuk menampilkan berat badan terendah pada mahasiswa
```

    19 51 155 
    18 55 163 
    18 45 153 
    20 46 158 
    19 58 160 
    Nama mahasiswa dengan umur tertua adalah Beky
    Rata-rata tinggi badan 157.8
    berat badan terendah adalah 45

