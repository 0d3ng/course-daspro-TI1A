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
System.out.println (nilai [0] [0] + " " + nilai [0] [1] + " " + nilai [0] [2]);
System.out.println (nilai [1] [0] + " " + nilai [1] [1] + " " + nilai [1] [2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
Tidak selalu dimulai dari 0, bisa juga dimulai dari 1. Namun, jika tidak ada isinya indeks akan diisi dengan 0.  

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
int i;
for (int i = 0; i < nilai.length; i++){
    System.out.println (nilai [0] [0] + " " + nilai [0] [1] + " " + nilai [0] [2]);
    System.out.println (nilai [1] [0] + " " + nilai [1] [1] + " " + nilai [1] [2]);
}
```

    75 90 88
    79 82 67
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
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : " );
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 5
    Masukkan rating pengguna 0 untuk restoran 1 : 7
    
    Masukkan rating pengguna 1 untuk restoran 0 : 2
    Masukkan rating pengguna 1 untuk restoran 1 : 8
    
    Masukkan rating pengguna 2 untuk restoran 0 : 6
    Masukkan rating pengguna 2 untuk restoran 1 : 7
    
    Masukkan rating pengguna 3 untuk restoran 0 : 9
    Masukkan rating pengguna 3 untuk restoran 1 : 7
    


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

    5 7 
    2 8 
    6 7 
    9 7 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 1
tidak bisa, i sebagai baris dan j sebagai kolom. Dalam penulisan indeks, baris selalu terlentak di depan. 

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
 System.out.print("Masukkan data baris : " );
    int baris = sc.nextInt(); 
 System.out.print("Masukkan data kolom : " );
    int kolom = sc.nextInt(); 
int[][] rating = new int[baris][kolom];
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : " );
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

    Masukkan data baris : 3
    Masukkan data kolom : 2
    Masukkan rating pengguna 0 untuk restoran 0 : 10
    Masukkan rating pengguna 0 untuk restoran 1 : 8
    
    Masukkan rating pengguna 1 untuk restoran 0 : 2
    Masukkan rating pengguna 1 untuk restoran 1 : 8
    
    Masukkan rating pengguna 2 untuk restoran 0 : 6
    Masukkan rating pengguna 2 untuk restoran 1 : 8
    
    10 8 
    2 8 
    6 8 


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
        System.out.printf("Masukkan harga[%d] [%d]: ", i, j);
        harga[i][j] = sc.nextInt(); 
        total += harga[i][j]; 
    }
        rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0] [0]: 3000
    Masukkan harga[0] [1]: 5000
    Masukkan harga[0] [2]: 1000
    Masukkan harga[0] [3]: 2000
    Masukkan harga[0] [4]: 4000
    Masukkan harga[0] [5]: 3000
    Rata-rata harga bahan ke-0 adalah 3000.00
    Masukkan harga[1] [0]: 20000
    Masukkan harga[1] [1]: 1000
    Masukkan harga[1] [2]: 5000
    Masukkan harga[1] [3]: 3000
    Masukkan harga[1] [4]: 2000
    Masukkan harga[1] [5]: 1000
    Rata-rata harga bahan ke-1 adalah 5333.33
    Masukkan harga[2] [0]: 10000
    Masukkan harga[2] [1]: 3000
    Masukkan harga[2] [2]: 2000
    Masukkan harga[2] [3]: 2000
    Masukkan harga[2] [4]: 5000
    Masukkan harga[2] [5]: 1000
    Rata-rata harga bahan ke-2 adalah 3833.33


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1
Fungsinya adalah untuk menghitung rata rata harga bahan yang didapat dari total / harga. 
Length digunakan untuk mengetahui panjang array. 

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2
inisialisasi variabel total = 0 dan rata = 0 diletakkan pada bagian for pertama digunakan untuk menghitung rata rata dari semua harga bahan.  

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner; //untuk menambahkan library scanner
Scanner sc = new Scanner(System.in); //untuk deklarasi scanner
double [][]suhu = new double[5][7]; // deklarasi dan instansiasi array
double max = 0; // membuat variabel max dengan tipe data double
for(int x = 0; x < suhu.length; x++){ //outer loop
    for(int y = 0; y < suhu[0].length; y++){ //inner loop 
        System.out.print("Masukkan suhu dari kota " + x + " pada hari " + y + " : "); //menginput suhu 
        suhu[x][y] = sc.nextInt(); 
        if(suhu[x][y]>max){ // menyatakan kondisi jika suhu > max
            max=suhu[x][y]; // untuk menyimpan nilai pada variabel max
        }
    }
     System.out.println("Suhu tertinggi pada kota tersebut adalah :" + max); // menampilkan suhu yang tertinggi (output)
}
```

    Masukkan suhu dari kota 0 pada hari 0 : 28
    Masukkan suhu dari kota 0 pada hari 1 : 33
    Masukkan suhu dari kota 0 pada hari 2 : 29
    Masukkan suhu dari kota 0 pada hari 3 : 30
    Masukkan suhu dari kota 0 pada hari 4 : 25
    Masukkan suhu dari kota 0 pada hari 5 : 27
    Masukkan suhu dari kota 0 pada hari 6 : 26
    Suhu tertinggi pada kota tersebut adalah :33.0
    Masukkan suhu dari kota 1 pada hari 0 : 33
    Masukkan suhu dari kota 1 pada hari 1 : 32
    Masukkan suhu dari kota 1 pada hari 2 : 28
    Masukkan suhu dari kota 1 pada hari 3 : 29
    Masukkan suhu dari kota 1 pada hari 4 : 25
    Masukkan suhu dari kota 1 pada hari 5 : 26
    Masukkan suhu dari kota 1 pada hari 6 : 24
    Suhu tertinggi pada kota tersebut adalah :33.0
    Masukkan suhu dari kota 2 pada hari 0 : 33
    Masukkan suhu dari kota 2 pada hari 1 : 32
    Masukkan suhu dari kota 2 pada hari 2 : 31
    Masukkan suhu dari kota 2 pada hari 3 : 30
    Masukkan suhu dari kota 2 pada hari 4 : 28
    Masukkan suhu dari kota 2 pada hari 5 : 33
    Masukkan suhu dari kota 2 pada hari 6 : 38
    Suhu tertinggi pada kota tersebut adalah :38.0
    Masukkan suhu dari kota 3 pada hari 0 : 40
    Masukkan suhu dari kota 3 pada hari 1 : 37
    Masukkan suhu dari kota 3 pada hari 2 : 36
    Masukkan suhu dari kota 3 pada hari 3 : 36
    Masukkan suhu dari kota 3 pada hari 4 : 34
    Masukkan suhu dari kota 3 pada hari 5 : 38
    Masukkan suhu dari kota 3 pada hari 6 : 32
    Suhu tertinggi pada kota tersebut adalah :40.0
    Masukkan suhu dari kota 4 pada hari 0 : 29
    Masukkan suhu dari kota 4 pada hari 1 : 30
    Masukkan suhu dari kota 4 pada hari 2 : 32
    Masukkan suhu dari kota 4 pada hari 3 : 31
    Masukkan suhu dari kota 4 pada hari 4 : 32
    Masukkan suhu dari kota 4 pada hari 5 : 29
    Masukkan suhu dari kota 4 pada hari 6 : 25
    Suhu tertinggi pada kota tersebut adalah :40.0


2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;            //untuk menambahkan library scanner
Scanner scn = new Scanner(System.in); // untuk deklarasi scanner
int [][]dataMahasiswa = { //inisialisasi 
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {19, 58, 160},
}; 

String[] namaMahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"}; //variabel nama tipe data string pada array
int tertinggi = 0; // membuat variabel tertinggi tipe data int
double total, rata; // membuat variabel total dan rata-rata dgn tipe data double
int terendah = 59; // membuat variabel terendah dengan tipe data int
String nama; // membuat variabel nama dgn tipe data String
for(int a = 0; a < dataMahasiswa.length; a++){ // outer loop
    for(int b = 0; b < dataMahasiswa[0].length; b++){ // inner loop
        if(dataMahasiswa[a][0] > tertinggi){ // menyatakan kondisi jika data mahasiswa > tertinggi 
            tertinggi = dataMahasiswa[a][0]; // untuk menyimpan nilai pada variabel tertinggi 
            nama = namaMahasiswa[a];
    }
        if(dataMahasiswa[a][1]<terendah){ // menyatakan kondisi jika data mahasiswa < terendah 
           terendah = dataMahasiswa[a][1]; // menyimpan nilai pada variabel terendah
        }
        System.out.print(dataMahasiswa[a][b]+ " "); // menampilkan data mahasiswa 
            }
        System.out.println(); 
        total += dataMahasiswa[a][2]; //untuk menotal data mahasiswa dari indeks kedua (tinggi)
}
        rata = total/5; 
    System.out.println("Berat badan terendah di antara kelima mahasiswa tersebut " + min); //menampilkan output berat badan terendah
    System.out.println("Rata-rata tinggi badan dari kelima mahasiswa tersebut " + rata); //menampilkan output rata-rata tinggi badan
    System.out.println("Nama mahasiswa dengan umur tertua di antara kelima mahasiswa tersebut adalah " + nama); //menampilkan output nama mahasiswa dengan umur tertua 
```

    19 51 155 
    18 55 163 
    18 45 153 
    20 46 158 
    19 58 160 
    Berat badan terendah di antara kelima mahasiswa tersebut 45
    Rata-rata tinggi badan dari kelima mahasiswa tersebut 157.8
    Nama mahasiswa dengan umur tertua di antara kelima mahasiswa tersebut adalah Beky


Menggunakan import untuk mengetahui tampilan atau perintah yang diminta, yaitu berat badan terendah, rata-rata tinggi, nama mahasiswa dengan umur tertua. 
