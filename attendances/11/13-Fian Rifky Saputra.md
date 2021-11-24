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
int [][] nilai = new int [2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
nilai [0][0] = 75;
nilai [0][1] = 90;
nilai [0][2] = 88;
nilai [1][0] = 79;
nilai [1][1] = 82;
nilai [1][2] = 67;
```




    67



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai [0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai [1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1

menurutku saya tidak harus berurutan jika menggunakan keyboard,sedangkan jika menggunakan looping harus berurutan karena harus dimulai dari 0

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i < nilai.length; i++){
    for(int j = 0; j < nilai[0].length; j++){
        System.out.print(nilai[i][j] + " ");
    }
    System.out.println();
}
```

    0 0 0 
    0 0 0 


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
int[][] rating = new int [4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating [i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 4
    Masukkan rating pengguna 0 untuk restoran 1 : 5
    
    Masukkan rating pengguna 1 untuk restoran 0 : 6
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 8
    Masukkan rating pengguna 2 untuk restoran 1 : 5
    
    Masukkan rating pengguna 3 untuk restoran 0 : 4
    Masukkan rating pengguna 3 untuk restoran 1 : 5
    


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

    4 5 
    6 7 
    8 5 
    4 5 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int[][] rating = new int [4][2];
for (int j = 0; j < rating.length; j++) {
for (int i = 0; i < rating[0].length; i++) {


        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating [i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 2
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    Masukkan rating pengguna 1 untuk restoran 1 : 6
    
    Masukkan rating pengguna 0 untuk restoran 2 : 7



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#37:1)


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int pembeli, pengguna;
System.out.print("Masukkan jumlah pembeli: ");
pembeli = sc.nextInt();
System.out.print("Masukkan jumlah pengguna: ");
pengguna = sc.nextInt();
int[][] rating = new int [pembeli][pengguna];
for (int i = 0; i < rating.length; i++) {
    for (int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating [i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan jumlah pembeli: 4
    Masukkan jumlah pengguna: 2
    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 0 untuk restoran 1 : 5
    
    Masukkan rating pengguna 1 untuk restoran 0 : 6
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 1
    
    Masukkan rating pengguna 3 untuk restoran 0 : 3
    Masukkan rating pengguna 3 untuk restoran 1 : 4
    


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
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga [i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 4
    Masukkan harga[0][1]: 5
    Masukkan harga[0][2]: 6
    Masukkan harga[0][3]: 7
    Masukkan harga[0][3
    4]: Masukkan harga[0][5]: 2
    Rata-rata harga bahan ke-0 adalah 4.50
    Masukkan harga[1][0]: 4
    Masukkan harga[1][1]: 5
    Masukkan harga[1][2]: 6
    Masukkan harga[1][7
    3]: Masukkan harga[1][4]: 4
    Masukkan harga[1][1
    5]: Rata-rata harga bahan ke-1 adalah 4.50
    Masukkan harga[29
    ][0]: Masukkan harga[2][1]: 3
    Masukkan harga[2][4
    2]: Masukkan harga[2][3]: 6
    Masukkan harga[2][4]: 7
    Masukkan harga[2][5]: 8
    Rata-rata harga bahan ke-2 adalah 6.17


Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1
fungsi nya adalah menghitung rata rata per unit dari harga tersebut

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2
karena jika total = 0 dan rata = 0 berada di luar perulangan for maka yang terjadi programnya berantakan

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[][] suhu = new int[5][7];
double max = 0;

for (int x = 0; x < suhu.length; x++) {
    for (int y = 0; y < suhu[0].length; y++) {
        System.out.printf("Suhu pada kota ke "+ (x+1) +" pada hari "+ (y+1) +" adalah " );
        suhu [x][y] = sc.nextInt();
        if (suhu[x][y] > max){
        max =suhu[x][y];
        }
    }
    System.out.printf("Suhu tertinggi pada kota ke "+ (x+1) +" adalah "+max );
        System.out.println("");
}
    
    
```

    Suhu pada kota ke 1 pada hari 1 adalah 3
    Suhu pada kota ke 1 pada hari 2 adalah 55
    Suhu pada kota ke 1 pada hari 3 adalah 23
    Suhu pada kota ke 1 pada hari 4 adalah 11
    Suhu pada kota ke 1 pada hari 5 adalah 33
    Suhu pada kota ke 1 pada hari 6 adalah 44
    Suhu pada kota ke 1 pada hari 7 adalah 31
    Suhu tertinggi pada kota ke 1 adalah 55.0
    Suhu pada kota ke 2 pada hari 1 adalah 44
    Suhu pada kota ke 2 pada hari 2 adalah 231
    Suhu pada kota ke 2 pada hari 3 adalah 11
    Suhu pada kota ke 2 pada hari 4 adalah 30
    Suhu pada kota ke 2 pada hari 5 adalah 56
    Suhu pada kota ke 2 pada hari 6 adalah 11
    Suhu pada kota ke 2 pada hari 7 adalah 23
    Suhu tertinggi pada kota ke 2 adalah 231.0
    Suhu pada kota ke 3 pada hari 1 adalah 44
    Suhu pada kota ke 3 pada hari 2 adalah 55
    Suhu pada kota ke 3 pada hari 3 adalah 14
    Suhu pada kota ke 3 pada hari 4 adalah 15
    Suhu pada kota ke 3 pada hari 5 adalah 18
    Suhu pada kota ke 3 pada hari 6 adalah 33
    Suhu pada kota ke 3 pada hari 7 adalah 12
    Suhu tertinggi pada kota ke 3 adalah 231.0
    Suhu pada kota ke 4 pada hari 1 adalah 44
    Suhu pada kota ke 4 pada hari 2 adalah 55
    Suhu pada kota ke 4 pada hari 3 adalah 78
    Suhu pada kota ke 4 pada hari 4 adalah 21
    Suhu pada kota ke 4 pada hari 5 adalah 33
    Suhu pada kota ke 4 pada hari 6 adalah 44
    Suhu pada kota ke 4 pada hari 7 adalah 33
    Suhu tertinggi pada kota ke 4 adalah 231.0
    Suhu pada kota ke 5 pada hari 1 adalah 78
    Suhu pada kota ke 5 pada hari 2 adalah 12
    Suhu pada kota ke 5 pada hari 3 adalah 13
    Suhu pada kota ke 5 pada hari 4 adalah 14
    Suhu pada kota ke 5 pada hari 5 adalah 15
    Suhu pada kota ke 5 pada hari 6 adalah 17
    Suhu pada kota ke 5 pada hari 7 adalah 88
    Suhu tertinggi pada kota ke 5 adalah 231.0


 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int [][] dataMahasiswa = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}};
int palingTua = 0, beratTerendah = 163, letakBaris = 0;
int jumlah = 0;
String[] namaMahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

for(int i = 0; i<dataMahasiswa.length; i++){
    if(dataMahasiswa[i][1]<beratTerendah){
        beratTerendah = dataMahasiswa[i][1];    
    }
    if(dataMahasiswa[i][0]>palingTua){
        palingTua = dataMahasiswa[i][0];
        letakBaris = i;
    }
        jumlah+= dataMahasiswa[i][2];
}
            double rata = jumlah/dataMahasiswa.length;
            System.out.println("Berat badan terendah adalah : " + beratTerendah);
            System.out.println("Rata-rata tinggi badan : " + rata);
            System.out.println("Siswa tertua adalah : " + namaMahasiswa[letakBaris]);
```

    Berat badan terendah adalah : 45
    Rata-rata tinggi badan : 157.0
    Siswa tertua adalah : Beky



```Java

```
