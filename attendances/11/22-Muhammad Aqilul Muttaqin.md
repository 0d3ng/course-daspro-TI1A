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
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
indeks array dimulai dari 0 namun untuk pengisiannya elemen array tidak harus dilakukan secara berurutan mulai dari indeks 0, karena sebenarnya pengisian elemen bisa dikosongi atau tidak diberi nilai.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
int[][] nilai ={
    {75,90,88},
    {79,82,67},
};
for (int i = 0; i < nilai.length; i++){
    for (int j = 0; j < nilai[0].length; j++){
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
for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 80
    Masukkan rating pengguna 0 untuk restoran 1 : 70
    
    Masukkan rating pengguna 1 untuk restoran 0 : 75
    Masukkan rating pengguna 1 untuk restoran 1 : 65
    
    Masukkan rating pengguna 2 untuk restoran 0 : 85
    Masukkan rating pengguna 2 untuk restoran 1 : 90
    
    Masukkan rating pengguna 3 untuk restoran 0 : 90
    Masukkan rating pengguna 3 untuk restoran 1 : 95
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating){
    for (int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    80 70 
    75 65 
    85 90 
    90 95 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 1
bisa ditukar dan outputnya akan sama saja apabila semua posisi i di tukar dengan posisi j, namun jika hanya sebagian saja yang ditukar maka outputnya akan berbeda dan bisa saja akan terjadi error.

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Tentukan jumlah baris : ");
int baris = sc.nextInt();
System.out.print("Tentukan jumlah kolom : ");
int kolom = sc.nextInt();

int[][] rating = new int[baris][kolom];
for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
for (int[] rtg : rating){
    for (int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Tentukan jumlah baris : 4
    Tentukan jumlah kolom : 2
    Masukkan rating pengguna 0 untuk restoran 0 : 80
    Masukkan rating pengguna 0 untuk restoran 1 : 70
    
    Masukkan rating pengguna 1 untuk restoran 0 : 75
    Masukkan rating pengguna 1 untuk restoran 1 : 65
    
    Masukkan rating pengguna 2 untuk restoran 0 : 85
    Masukkan rating pengguna 2 untuk restoran 1 : 90
    
    Masukkan rating pengguna 3 untuk restoran 0 : 90
    Masukkan rating pengguna 3 untuk restoran 1 : 95
    
    80 70 
    75 65 
    85 90 
    90 95 


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
for (int i = 0; i < harga.length; i++){
    total = 0;
    rata = 0;
    for (int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 3500
    Masukkan harga[0][1]: 3000
    Masukkan harga[0][2]: 4000
    Masukkan harga[0][3]: 5000
    Masukkan harga[0][4]: 4500
    Masukkan harga[0][5]: 3000
    Rata-rata harga bahan ke-0 adalah 3833.33
    Masukkan harga[1][0]: 2000
    Masukkan harga[1][1]: 3000
    Masukkan harga[1][2]: 2500
    Masukkan harga[1][3]: 8000
    Masukkan harga[1][4]: 5000
    Masukkan harga[1][5]: 6000
    Rata-rata harga bahan ke-1 adalah 4416.67
    Masukkan harga[2][0]: 8000
    Masukkan harga[2][1]: 10000
    Masukkan harga[2][2]: 2500
    Masukkan harga[2][3]: 4000
    Masukkan harga[2][4]: 5000
    Masukkan harga[2][5]: 4500
    Rata-rata harga bahan ke-2 adalah 5666.67


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1
untuk menghitung rata2 dari total dibagi dengan panjang kolom dari harga

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2
apabila ditaruh di luar perulangan maka baris sebelumnya akan ikut terhitung dan perhitungan bukan dimulai dari 0.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double[][] suhu = new double[5][7];

for (int x = 0; x < suhu.length; x++){
    double max = 0;
    for ( int y = 0; y < suhu[0].length; y++){
        System.out.print("Suhu di kota " + (x+1) + " pada hari ke-" + (y+1) + " : ");
        suhu[x][y] = sc.nextInt();
        if (suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
    System.out.println("Suhu tertinggi di kota " + (x+1) + " selama 7 hari adalah " + max);
}
```

    Suhu di kota 1 pada hari ke-1 : 30
    Suhu di kota 1 pada hari ke-2 : 28
    Suhu di kota 1 pada hari ke-3 : 22
    Suhu di kota 1 pada hari ke-4 : 25
    Suhu di kota 1 pada hari ke-5 : 34
    Suhu di kota 1 pada hari ke-6 : 35
    Suhu di kota 1 pada hari ke-7 : 22
    Suhu tertinggi di kota 1 selama 7 hari adalah 35.0
    Suhu di kota 2 pada hari ke-1 : 28
    Suhu di kota 2 pada hari ke-2 : 29
    Suhu di kota 2 pada hari ke-3 : 25
    Suhu di kota 2 pada hari ke-4 : 7
    Suhu di kota 2 pada hari ke-5 : 11
    Suhu di kota 2 pada hari ke-6 : 20
    Suhu di kota 2 pada hari ke-7 : 18
    Suhu tertinggi di kota 2 selama 7 hari adalah 29.0
    Suhu di kota 3 pada hari ke-1 : 30
    Suhu di kota 3 pada hari ke-2 : 32
    Suhu di kota 3 pada hari ke-3 : 35
    Suhu di kota 3 pada hari ke-4 : 29
    Suhu di kota 3 pada hari ke-5 : 28
    Suhu di kota 3 pada hari ke-6 : 22
    Suhu di kota 3 pada hari ke-7 : 24
    Suhu tertinggi di kota 3 selama 7 hari adalah 35.0
    Suhu di kota 4 pada hari ke-1 : 34
    Suhu di kota 4 pada hari ke-2 : 29
    Suhu di kota 4 pada hari ke-3 : 20
    Suhu di kota 4 pada hari ke-4 : 28
    Suhu di kota 4 pada hari ke-5 : 30
    Suhu di kota 4 pada hari ke-6 : 31
    Suhu di kota 4 pada hari ke-7 : 27
    Suhu tertinggi di kota 4 selama 7 hari adalah 34.0
    Suhu di kota 5 pada hari ke-1 : 24
    Suhu di kota 5 pada hari ke-2 : 27
    Suhu di kota 5 pada hari ke-3 : 29
    Suhu di kota 5 pada hari ke-4 : 22
    Suhu di kota 5 pada hari ke-5 : 21
    Suhu di kota 5 pada hari ke-6 : 25
    Suhu di kota 5 pada hari ke-7 : 23
    Suhu tertinggi di kota 5 selama 7 hari adalah 29.0

Kode program diatas digunakan untuk mencari suhu tertinggi dalam beberapa hari disetiap kota dengan menampung nilai tertinggi di max

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int[][] data ={
    {19,51,155},
    {18,55,163},
    {18,45,153},
    {20,46,158},
    {19,58,160},
};
String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int beratTerendah = 100;
int umur = 0;
int umurTertua = 0;
int rataTinggi = 0;
int total = 0;
double rata;
for (int x = 0; x < data.length; x++){
    if (data[x][0] > umur){
        umur = data[x][0];
        umurTertua = x;
    }
    if (data[x][1] < beratTerendah){
        beratTerendah = data[x][1];
    }
    total += data[x][2];
}
rata = total / data.length;
System.out.println("Berat badan terendah di antara kelima mahasiswa adalah" + beratTerendah);
System.out.println("Rata-rata tinggi badan seluruh mahasiswa adalah " + rata);
System.out.println("Siswa tertua adalah " + nama[letakBaris]);
```

    Berat badan terendah seluruh mahasiswa adalah 45
    Rata-rata tinggi badan seluruh mahasiswa adalah 157.0
    Siswa tertua adalah Beky

kode program diatas untuk mencari berat badan terendah dengan membandingkan berat badan pada baris 1, mencari rata-rata tinggi dengan cara pembagian total pada baris 3 dibagi total data, mencari siswa tertua dengan membandingkan umur di baris 2.
