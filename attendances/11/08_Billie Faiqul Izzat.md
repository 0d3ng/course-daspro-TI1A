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


```Java
// Tuliskan jawaban nomor 1
iya, karna array dimulai dari index 0 namun index ke 0 tidak harus ada nilainya akan tetapi indek ke 0 akan bernilai null
```

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
for (int i = 0; i < nilai.length; i++) {
    for(int j=0; j < nilai[0].length; j++) {
        System.out.print(nilai[i][j] + "\t");
    }
    System.out.println();
}
```

    75	90	88	
    79	82	67	


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
    for(int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 20
    Masukkan rating pengguna 0 untuk restoran 1 : 1
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 8
    Masukkan rating pengguna 2 untuk restoran 1 : 4
    
    Masukkan rating pengguna 3 untuk restoran 0 : 9
    Masukkan rating pengguna 3 untuk restoran 1 : 10
    


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

    20 1 
    3 4 
    8 4 
    9 10 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1

```

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
    Masukkan rating pengguna 0 untuk restoran 0 : 7
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 9
    Masukkan rating pengguna 1 untuk restoran 1 : 6
    
    Masukkan rating pengguna 2 untuk restoran 0 : 3
    Masukkan rating pengguna 2 untuk restoran 1 : 2
    
    7 9 
    9 6 
    3 2 


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
        System.out.printf("Masukkan harga [%d] [%d] : ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0] [0] : 2000
    Masukkan harga [0] [1] : 1000
    Masukkan harga [0] [2] : 3000
    Masukkan harga [0] [3] : 7000
    Masukkan harga [0] [4] : 9000
    Masukkan harga [0] [5] : 2000
    Rata-rata harga bahan ke-0 adalah 4000.00
    Masukkan harga [1] [0] : 7000
    Masukkan harga [1] [1] : 8000
    Masukkan harga [1] [2] : 7000
    Masukkan harga [1] [3] : 8000
    Masukkan harga [1] [4] : 7000
    Masukkan harga [1] [5] : 8000
    Rata-rata harga bahan ke-1 adalah 7500.00
    Masukkan harga [2] [0] : 4000
    Masukkan harga [2] [1] : 3000
    Masukkan harga [2] [2] : 4000
    Masukkan harga [2] [3] : 3000
    Masukkan harga [2] [4] : 4000
    Masukkan harga [2] [5] : 3000
    Rata-rata harga bahan ke-2 adalah 3500.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
untuk menghitung rata rata dari total harga setiap 6 bulan
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
agar perulangan pada baris kedua tidak ditamabhkan juga ke nilai rata, dan akibatnya adalah jumlah rata seelama 6 biulan tidak akan sesuai dengan data.
```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!



```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

double[][] suhu = new double[5][7];
double max = 0;

for(int x=0; x<suhu.length; x++){
    for(int y=0; y < suhu[0].length; y++){
     System.out.print("suhu di kota " + (x+1) + " pada hari ke " + (y+1) + " adalah ");
        suhu[x][y] = sc.nextInt();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
}
System.out.println("suhu tertinggi dari 5 kota di Jepang selama 7 hari adalah " + max);
```

    suhu di kota 1 pada hari ke 1 adalah 20
    suhu di kota 1 pada hari ke 2 adalah 20
    suhu di kota 1 pada hari ke 3 adalah 20
    suhu di kota 1 pada hari ke 4 adalah 20
    suhu di kota 1 pada hari ke 5 adalah 10
    suhu di kota 1 pada hari ke 6 adalah 40
    suhu di kota 1 pada hari ke 7 adalah 39
    suhu di kota 2 pada hari ke 1 adalah 38
    suhu di kota 2 pada hari ke 2 adalah 37
    suhu di kota 2 pada hari ke 3 adalah 37
    suhu di kota 2 pada hari ke 4 adalah 23
    suhu di kota 2 pada hari ke 5 adalah 33
    suhu di kota 2 pada hari ke 6 adalah 22
    suhu di kota 2 pada hari ke 7 adalah 23
    suhu di kota 3 pada hari ke 1 adalah 33
    suhu di kota 3 pada hari ke 2 adalah 25
    suhu di kota 3 pada hari ke 3 adalah 35
    suhu di kota 3 pada hari ke 4 adalah 3
    suhu di kota 3 pada hari ke 5 adalah 35
    suhu di kota 3 pada hari ke 6 adalah 34
    suhu di kota 3 pada hari ke 7 adalah 55
    suhu di kota 4 pada hari ke 1 adalah 66
    suhu di kota 4 pada hari ke 2 adalah 34
    suhu di kota 4 pada hari ke 3 adalah 34
    suhu di kota 4 pada hari ke 4 adalah 53
    suhu di kota 4 pada hari ke 5 adalah 45
    suhu di kota 4 pada hari ke 6 adalah 47
    suhu di kota 4 pada hari ke 7 adalah 39
    suhu di kota 5 pada hari ke 1 adalah 34
    suhu di kota 5 pada hari ke 2 adalah 33
    suhu di kota 5 pada hari ke 3 adalah 31
    suhu di kota 5 pada hari ke 4 adalah 32
    suhu di kota 5 pada hari ke 5 adalah 34
    suhu di kota 5 pada hari ke 6 adalah 45
    suhu di kota 5 pada hari ke 7 adalah 46
    suhu tertinggi dari 5 kota di Jepang selama 7 hari adalah 66.0

disini kita menggunakan array 2 dimensi yang panjangnya 5x7 dan nilainya akan diinputkan saat kode program tersebut dijalankan dan nilai tertinggi dari suhu dari setiap kota akan ditampung di max dan selanjutnya kita akan menggunakan  if yaitu jika nilai suhu yang diinputkan lebih dari max maka kita akan mendapat nlai terbesar dari nilai yang di inputkan tersebut dan ditampung di max lalu dicetak

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int[][] tabel = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}};
int tertua = 0, terendah = 163, letakBaris = 0;
int jumlah = 0;
String[] namaMahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

for(int i = 0; i<tabel.length; i++){
   if(tabel[i][0]>tertua){
        tertua = tabel[i][0];
        letakBaris = i;    
    }
    if(tabel[i][1]<terendah){
        terendah = tabel[i][1];
    }
    jumlah+= tabel[i][2];
}
double rata = jumlah/tabel.length;
System.out.println("Berat badan terendah adalah : " + terendah);
System.out.println("Rata-rata tinggi badan : " + rata);
System.out.println("Siswa tertua adalah : " + namaMahasiswa[letakBaris]);
```

    Berat badan terendah adalah : 45
    Rata-rata tinggi badan : 157.0
    Siswa tertua adalah : Beky
    
    
    disini kita akan mencari berat badan terendah, rata rata tiggi badan dan nama siswa tertua. untuk mencari berat badan terendah dengan membandinkan berat badan terbesaar pada kolom index ke=1, selanjutnya mencari rata rata tinggi badan dengan cara menambahkan semua angka pada kolom index ke 2 lalu dibagi dengan panjang barisnya, dan untuk mencari nama umur tertua dengan cara membandinkan dengan umur terkecil dan jika yang ingin ditampilkan adalah namanya maka yang di print adalah namaMahasiswa[letakBaris]
