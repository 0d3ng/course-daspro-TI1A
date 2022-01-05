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
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

**Tuliskan jawaban nomor 1**

**Jawaban :** Pengisian elemen Array [][] tidak perlu dilakukan atau diisi dengan nilai yang berurutan apabila tidak melakukan looping.

Apabila menggunakan looping, maka pengisian elemen Array harus berurutan agar hasil keluaran tertata dan rapi.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i <= nilai.length; i++){
    for(int a = 0; a <= nilai.length; a++){
        System.out.println(nilai[i][a]);
            }
    System.out.println();
}
```

    75
    90
    88
    
    79
    82
    67
    



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#21:4)


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
int [][] rating = new int [4][2];
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

    Masukkan rating pengguna 0 untuk restoran 0 : 10
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 6
    Masukkan rating pengguna 2 untuk restoran 1 : 5
    
    Masukkan rating pengguna 3 untuk restoran 0 : 4
    Masukkan rating pengguna 3 untuk restoran 1 : 3
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating) {
    for (int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    10 9 
    8 7 
    6 5 
    4 3 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
for (int j = 0; j < rating.length; j++) {
    for (int i = 0; i < rating[0].length; i++) {
        System.out.print("Masukkan rating pengguna " + j + " untuk restoran " + i + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#27:5)


**Tuliskan jawaban nomor 1**

**Jawaban :** Dapat tidak dapat ditukar, namun hasil keluaran menjadi berbeda daripada sebelumnya. Alasannya adalah karena posisi nilai pada elemen baris dan kolom tertukar. 

Awalnya **"int [][] rating = new int [4][2];"** menjadi **"int [][] rating = new int [2][4];"** karena nilai i menjadi elemen baris yang bernilai 4, sedangkan nilai j menjadi elemen kolom bernilai 2 menjadi terbalik dan hanya mengeluarkan hasil keluaran yang berbeda atau kebalikannya seperti hasil pemrograman diatas.

Lalu terdapat sebuah peringatan/error yang menunjukkan bahwa ada 2 indeks yang hilang.

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
System.out.print("Masukkan jumlah baris: ");
    int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
            int kolom = sc.nextInt();

int[][] rating = new int[baris][kolom];

System.out.println("Jumlah baris saat ini : " + rating.length);
System.out.println("Jumlah kolom saat ini : " + rating[0].length);
```

    Masukkan jumlah baris: 2
    Masukkan jumlah kolom: 4
    Jumlah baris saat ini : 2
    Jumlah kolom saat ini : 4


### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1// Tuliskan kode program Percobaan 3 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 2
int harga[][] = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3
for(int i = 0; i < harga.length; i++) {
    total = 0;
    rata = 0;
    for(int j = 0; j < harga[0].length; j++) {
        System.out.print("Masukkan harga: ");
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total/harga[0].length;
    System.out.println("Rata-rata = " + rata);
}
```

    Masukkan harga: 10000
    Masukkan harga: 10000
    Masukkan harga: 11000
    Masukkan harga: 25000
    Masukkan harga: 43000
    Masukkan harga: 57000
    Rata-rata = 26000.0
    Masukkan harga: 30000
    Masukkan harga: 4500
    Masukkan harga: 50000
    Masukkan harga: 67500
    Masukkan harga: 77000
    Masukkan harga: 89000
    Rata-rata = 53000.0
    Masukkan harga: 43
    Masukkan harga: 22300
    Masukkan harga: 45000
    Masukkan harga: 2450
    Masukkan harga: 7600
    Masukkan harga: 7800
    Rata-rata = 14198.833333333334


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

**Tuliskan jawaban nomor 1**

**Jawaban :** Fungsi dari rata total / harga[0].length adalah untuk membagi seluruh nilai hasil masukkan dengan total keseluruhan dari penjumlahan keseluruhan nilai hasil masukkan yang menjadi hasil keluaran (output) dari **"Rata"**

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

**Tuliskan jawaban nomor 2**

**Jawaban :** Karena untuk melakukan suatu perulangan, perlu inisialisasi variabel berada di dalam for yang pertama. Alasannya karena agar bisa membaca inisiliasi variabel tersebut dengan benar dan menghasilkan hasil keluaran yang benar.

Apabila inisialisasi variabel berada di luar for/setelah deklarasi Array, maka hasil yang dikeluarkan tidak sesuai dengan perhitungan yang sesuai dengan variabel yang sudah dimasukkan dan dihitung.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);

double[][] suhu = new double[5][7];
int x, y;
double max = 0;

for(int x = 0; x < suhu.length; x++) {
    for(int y = 0; y < suhu[0].length; y++) {
        System.out.printf("Suhu kota %d pada hari %d: ", x, y);
        suhu[x][y] = input.nextDouble();
    }
    if(suhu[x][y] > max) {
         max = suhu[x][y];
    }     
}

System.out.println("Suhu maksimal/tertinggi = " + max);
```

    Suhu kota 0 pada hari 0: 16
    Suhu kota 0 pada hari 1: 17
    Suhu kota 0 pada hari 2: 18
    Suhu kota 0 pada hari 3: 19
    Suhu kota 0 pada hari 4: 20
    Suhu kota 0 pada hari 5: 21
    Suhu kota 0 pada hari 6: 22
    Suhu kota 1 pada hari 0: 23
    Suhu kota 1 pada hari 1: 24
    Suhu kota 1 pada hari 2: 25
    Suhu kota 1 pada hari 3: 26
    Suhu kota 1 pada hari 4: 27
    Suhu kota 1 pada hari 5: 28
    Suhu kota 1 pada hari 6: 29
    Suhu kota 2 pada hari 0: 30
    Suhu kota 2 pada hari 1: 29
    Suhu kota 2 pada hari 2: 28
    Suhu kota 2 pada hari 3: 27
    Suhu kota 2 pada hari 4: 26
    Suhu kota 2 pada hari 5: 25
    Suhu kota 2 pada hari 6: 24
    Suhu kota 3 pada hari 0: 23
    Suhu kota 3 pada hari 1: 22
    Suhu kota 3 pada hari 2: 21
    Suhu kota 3 pada hari 3: 20
    Suhu kota 3 pada hari 4: 19
    Suhu kota 3 pada hari 5: 17
    Suhu kota 3 pada hari 6: 18
    Suhu kota 4 pada hari 0: 16
    Suhu kota 4 pada hari 1: 18
    Suhu kota 4 pada hari 2: 20
    Suhu kota 4 pada hari 3: 22
    Suhu kota 4 pada hari 4: 24
    Suhu kota 4 pada hari 5: 26
    Suhu kota 4 pada hari 6: 28
    Suhu maksimal/tertinggi = 30.0




2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner scn = new Scanner(System.in);

int[][] daftarMhs = {{19, 51, 155},
                    {18, 55, 163},
                    {18, 45, 153},
                    {20, 46, 158},
                    {19, 58, 160}};

String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int a,b;
int beratBadan=100;
for(a = 0; a < daftarMhs.length; b++){
    for(b = 0; b < daftarMhs[1].length; b++){
        if(daftarMhs[a][1] < beratBadan){
            beratBadan = daftarMhs[a][1];
        }
    }
}
System.out.print("Berat badan terendah di antara kelima mahasiswa tersebut adalah : " + beratBadan);

double totalTingba = 0;
double rataTingba = 0;
for(a = 0; a < daftarMhs.length; a++){
    for(b = 0; b < daftarMhs[0].length; b++){
    if(b == 2)
        totalTingba += daftarMhs[a][b];
    }
}

rataTingba = totalTingba / daftarMhs.length;
System.out.print("Total tinggi badan = " + totalTingba);
System.out.print("Rerata tinggi badan di antara kelima mahasiswa tersebut adalah " + rataTingba);

int index;
int tertua=0;
for(a = 0; a < daftarMhs.length; a++){
    for(b = 0; j < daftarMhs[0].length; b++){
        if(daftarMhs[a][0] > tua){
            tertua = daftarMhs[a][0];
            index = a;
        }
    }
}
System.out.print("Umur tertua di antara kelima mahasiswa tersebut adalah " + tertua +" bernama " + nama[index]);
```


```Java
Berat badan terendah di antara kelima mahasiswa tersebut adalah : 45
Total tinggi badan = 789.0
Rerata tinggi badan di antara kelima mahasiswa tersebut adalah 157.8
Umur tertua di antara kelima mahasiswa tersebut adalah 20 bernama Beky
```
