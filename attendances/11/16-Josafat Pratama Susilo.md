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
// Tidak, pengisian array tidak harus dari indeks 0. Kita bisa mengisi array dari indeks manapun, namun jika kita melewati
// pengisian suatu indeks maka indeks tersebut akan kosong (jika tipe datanya integer maka akan bernilai 0).
// Jadi kita bisa mengisi indeks 1 terlebih dahulu, baru nanti mengisi indeks 0. Tetapi lebih baik mengisi indeks dari 0
// karena akan mempermudah kita dan orang lain dalam memahami suatu baris kode.
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i < nilai.length; i++){
    for(int a = 0; a < nilai[i].length; a++){
        System.out.print(nilai[i][a] + " ");
    }
    System.out.println("");
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

    Masukkan rating pengguna 0 untuk restoran 0 : 9
    Masukkan rating pengguna 0 untuk restoran 1 : 10
    
    Masukkan rating pengguna 1 untuk restoran 0 : 7
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 10
    Masukkan rating pengguna 2 untuk restoran 1 : 10
    
    Masukkan rating pengguna 3 untuk restoran 0 : 8
    Masukkan rating pengguna 3 untuk restoran 1 : 6
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg: rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    9 10 
    7 7 
    10 10 
    8 6 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
// Tidak bisa, karena ordo atau ukuran dari array tidak sama yaitu 4 dan 2. Jika dibalik maka akan terjadi error 
// ArrayIndexOutOfBoundsException karena program tidak bisa mengakses indeks ke 2 jika panjang kolom dari array tersebut hanya 2
// yang berarti indeks terbesar dari kolom array tersebut adalah 1.
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int baris, kolom;
System.out.print("Masukkan jumlah pengguna: ");
baris = sc.nextInt();
System.out.print("Masukkan jumlah restoran: ");
kolom = sc.nextInt();
System.out.println("");

int[][] rating = new int[baris][kolom];

for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan jumlah pengguna: 3
    Masukkan jumlah restoran: 2
    
    Masukkan rating pengguna 0 untuk restoran 0 : 8
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 6
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 10
    Masukkan rating pengguna 2 untuk restoran 1 : 10
    


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

    Masukkan harga[0][0]: 1000
    Masukkan harga[0][1]: 5000
    Masukkan harga[0][2]: 6000
    Masukkan harga[0][3]: 8000
    Masukkan harga[0][4]: 10000
    Masukkan harga[0][5]: 5000
    Rata-rata harga bahan ke-0 adalah 5833.33
    Masukkan harga[1][0]: 9000
    Masukkan harga[1][1]: 5000
    Masukkan harga[1][2]: 6000
    Masukkan harga[1][3]: 2000
    Masukkan harga[1][4]: 4000
    Masukkan harga[1][5]: 2000
    Rata-rata harga bahan ke-1 adalah 4666.67
    Masukkan harga[2][0]: 5000
    Masukkan harga[2][1]: 4000
    Masukkan harga[2][2]: 2000
    Masukkan harga[2][3]: 6000
    Masukkan harga[2][4]: 5000
    Masukkan harga[2][5]: 8000
    Rata-rata harga bahan ke-2 adalah 5000.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
// Baris kode tersebut berfungsi untuk menghitung rata-rata dari bahan pada semester tersebut. Hal itu dilakukan dengan cara 
// membagi total yang telah diakumulasi dari setiap bulan pada inner-loop dengan panjang kolom array harga yang menunjukkan
// panjang bulan pada semester itu.
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
// Inisialisasi variabel total = 0 dan rata = 0 yang berada di dalam perulangan for yang pertama berfungsi untuk mereset nilai
// dari perhitungan sebelumnya atau menjadikan nilainya 0 untuk digunakan kembali. Karena pada perulangan yang pertama
// kedua variabel tersebut sudah diisi dengan nilai, maka pada perulangan berikutnya jika variabel tersebut tidak inisialisasi
// ulang menjadi 0 maka akan mempengaruhi perhitungan pada perulangan berikutnya. Menurut saya, jika inisialisasi kedua  variabel
// berada diluar perulangan for, maka hasil yang diinginkan akan salah. Karena pada perulangan kedua, total dan rata tidak 
// nol, maka total akan menjumlahkan total dari perhitungan pertama dengan total pada perulangan kedua tersebut, begitu pula 
// dengan perulangan ketiga.
```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;

Scanner input = new Scanner(System.in);

double suhu[][] = new double[5][7];
int x,y;
double max = 0;

for(int x = 0; x < suhu.length; x++){
    for(int y = 0; y < suhu[0].length; y++){
        System.out.printf("Masukkan suhu pada kota ke-%d hari ke-%d ", x+1, y+1);
        suhu[x][y] = input.nextFloat();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
}

System.out.println("Suhu tertinggi : " + max);

// Baris kode diatas berfungsi untuk mencari suhu tertinggi dari 5 kota selama 7 hari. Hal tersebut bisa dilakukan dengan
// cara membuat variabel yang akan menampung suhu maksimal. Kita membandingkan variabel suhu maksimal tersebut dengan
// inputan user pada inner loop supaya dapat mencakup semua suhu, jika suhu yang di inputkan user lebih besar dari variabel suhu
// maksimal maka variabel suhu maksimal akan diganti nilainya dengan inputan user tadi.
```

    Masukkan suhu pada kota ke-1 hari ke-1 35
    Masukkan suhu pada kota ke-1 hari ke-2 36
    Masukkan suhu pada kota ke-1 hari ke-3 25
    Masukkan suhu pada kota ke-1 hari ke-4 24
    Masukkan suhu pada kota ke-1 hari ke-5 45
    Masukkan suhu pada kota ke-1 hari ke-6 15
    Masukkan suhu pada kota ke-1 hari ke-7 25
    Masukkan suhu pada kota ke-2 hari ke-1 60
    Masukkan suhu pada kota ke-2 hari ke-2 35
    Masukkan suhu pada kota ke-2 hari ke-3 45
    Masukkan suhu pada kota ke-2 hari ke-4 32
    Masukkan suhu pada kota ke-2 hari ke-5 36
    Masukkan suhu pada kota ke-2 hari ke-6 25
    Masukkan suhu pada kota ke-2 hari ke-7 28
    Masukkan suhu pada kota ke-3 hari ke-1 24
    Masukkan suhu pada kota ke-3 hari ke-2 21
    Masukkan suhu pada kota ke-3 hari ke-3 35
    Masukkan suhu pada kota ke-3 hari ke-4 65
    Masukkan suhu pada kota ke-3 hari ke-5 25
    Masukkan suhu pada kota ke-3 hari ke-6 20
    Masukkan suhu pada kota ke-3 hari ke-7 34
    Masukkan suhu pada kota ke-4 hari ke-1 35
    Masukkan suhu pada kota ke-4 hari ke-2 37
    Masukkan suhu pada kota ke-4 hari ke-3 40
    Masukkan suhu pada kota ke-4 hari ke-4 25
    Masukkan suhu pada kota ke-4 hari ke-5 21
    Masukkan suhu pada kota ke-4 hari ke-6 25
    Masukkan suhu pada kota ke-4 hari ke-7 26
    Masukkan suhu pada kota ke-5 hari ke-1 35
    Masukkan suhu pada kota ke-5 hari ke-2 36
    Masukkan suhu pada kota ke-5 hari ke-3 37
    Masukkan suhu pada kota ke-5 hari ke-4 25
    Masukkan suhu pada kota ke-5 hari ke-5 21
    Masukkan suhu pada kota ke-5 hari ke-6 25
    Masukkan suhu pada kota ke-5 hari ke-7 21
    Suhu tertinggi : 65.0


# 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int data_mhs[][] = {
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {19, 58, 160}
};

String nama_mhs[] = {"Desi", "Rofan", "Lala", "Beky", "Ega"};

int bb_rendah = data_mhs[0][1];
int umur_tertua = 0;
double total_tb = 0;
double avg_tb;
String mhs_tertua = "";

for(int i = 0; i < data_mhs.length; i++){
    if(data_mhs[i][1] < bb_rendah){
        bb_rendah = data_mhs[i][1];
    }
    if(data_mhs[i][0] > umur_tertua){
        umur_tertua = data_mhs[i][0];
        mhs_tertua = nama_mhs[i];
    }
    total_tb+=data_mhs[i][2];
}

avg_tb = total_tb/data_mhs.length;

System.out.printf("Berat badan terendah dari %d mahasiswa\t\t: %d\n", data_mhs.length, bb_rendah);
System.out.printf("Rata-rata tinggi dari %d mahasiswa\t\t: %.2f\n", data_mhs.length, avg_tb);
System.out.printf("Mahasiswa dengan umur tertua dari %d mahasiswa\t: %s", data_mhs.length, mhs_tertua);

// Baris kode diatas berfungsi untuk mencari berat badan terendah, rata-rata tertinggi dan mahasiswa dengan umur tertua dari
// 5 mahasiswa. Pada hal ini, kita bisa hanya menggunakan satu perulangan karena ketiga indeks kolom yang ingin diakses bisa 
// diakses secara manual. Untuk mencari berat badan terendah kita membuat variabel yang menampung berat badan terendah, kita 
// menginisialisasinya dengan data berat badan mahasiswa pertama lalu di dalam perulangan kita membandingkannya dengan data 
// berat badan mahasiswa lainnya. Jika ada yang lebih rendah, maka kita mengganti nilai dari variabel berat badan terendah 
// tersebut dengan berat badan mahasiswa yang lebih rendah tersebut. Kemudian untuk Mahasiswa dengan umur tertinggi kita bisa
// menggunakan logika yang sama, namun kita perlu membuat array baru untuk menampung nama dari mahasiswa. Karena indeksnya
// saling berhubungan kita bisa mengibaratkan bahwa indeks 1 pada array nama sama berhubungan dengan indeks baris 1 array data 
// mahasiswa. Sehingga jika terdapat mahasiswa yang umurnya lebih tua dari variabel umur tertua, kita dapat mengganti variabel 
// nama mahasiswa tertua dengan elemen dari array nama mahasiswa yang indeksnya sama dengan data mahasiswa yang umurnya lebih tua.
// Sedangkan untuk rata-rata, kita dapat mengakumulasi total dari tinggi badan di perulangan kemudian membaginya dengan banyak
// baris pada kolom yang menunjukkan banyak mahasiswa.
```

    Berat badan terendah dari 5 mahasiswa		: 45
    Rata-rata tinggi dari 5 mahasiswa		: 157.80
    Mahasiswa dengan umur tertua dari 5 mahasiswa	: Beky




    java.io.PrintStream@5dee65ac




```Java

```
