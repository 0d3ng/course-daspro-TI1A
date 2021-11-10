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
int nilai[][] = new int[2][3];
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
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2] + " ");
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2] + " ");

```

    75 90 88 
    79 82 67 
    

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1

Indeks array pada dasarnya di mulai dari 0, tetapi jika saat pengisian array tidak dimulai dari indeks ke 0 atau misalnya di isi mulai dari indeks ke 1 terlebih dahulu itu tidak masalah, akan tetapi tetap saja harus terdapat indeks ke 0, karena array selalu di awali dengan indeks ke 0, masalah urutan pengisian elemen itu terserah mulai dari indeks ke berapa mengisinya.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2

for(int baris = 0; baris < nilai.length; baris++){
    for(int kolom = 0; kolom < nilai[0].length; kolom++){
        System.out.print(nilai[baris][kolom] + " ");
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
int rating[][] = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.printf("Masukkan rating pengguna %d untuk restoran %d : ", i, j);
        rating[i][j] = sc.nextInt();
    }
    System.out.println();
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 8
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 7
    Masukkan rating pengguna 1 untuk restoran 1 : 5
    
    Masukkan rating pengguna 2 untuk restoran 0 : 9
    Masukkan rating pengguna 2 untuk restoran 1 : 8
    
    Masukkan rating pengguna 3 untuk restoran 0 : 8
    Masukkan rating pengguna 3 untuk restoran 1 : 8
    
    

4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int rtg[] : rating){
    for (int r : rtg){
         System.out.print(r + " ");
    }
    System.out.println();
   
}
```

    8 9 
    7 5 
    9 8 
    8 8 
    

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 1

Tidak bisa karena jika tempatnya di tukar maka panjang data akan melebihi kapasitas panjang data dari array yang sudah diinstansisasi diatas tadi. Sehingga akan error

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();
        int rating[][] = new int[baris][kolom];


        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.printf("Masukkan rating pengguna %d untuk restoran %d : ", i, j);
                rating[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int rtg[] : rating){
            for (int r : rtg){
                 System.out.print(r + " ");
        }
        System.out.println();
   
        }

```

    Masukkan jumlah baris : 3
    Masukkan jumlah kolom : 2
    Masukkan rating pengguna 0 untuk restoran 0 : 5
    Masukkan rating pengguna 0 untuk restoran 1 : 6
    
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 9
    Masukkan rating pengguna 2 untuk restoran 1 : 8
    
    5 6 
    8 7 
    9 8 
    

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
int harga[][] = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
// Tuliskan kode program Percobaan 3 Langkah 3

for(int i = 0; i < harga.length; i++){
    total = 0;
    rata = 0;
    for(int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga [%d] [%d]", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
        
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0] [0]10000
    Masukkan harga [0] [1]10000
    Masukkan harga [0] [2]20000
    Masukkan harga [0] [3]150000
    Masukkan harga [0] [4]15000
    Masukkan harga [0] [5]10000
    Rata-rata harga bahan ke-0 adalah 35833.33
    Masukkan harga [1] [0]10000
    Masukkan harga [1] [1]10000
    Masukkan harga [1] [2]20000
    Masukkan harga [1] [3]20000
    Masukkan harga [1] [4]20000
    Masukkan harga [1] [5]10000
    Rata-rata harga bahan ke-1 adalah 15000.00
    Masukkan harga [2] [0]12
    Masukkan harga [2] [1]12000
    Masukkan harga [2] [2]12000
    Masukkan harga [2] [3]10000
    Masukkan harga [2] [4]10000
    Masukkan harga [2] [5]20000
    Rata-rata harga bahan ke-2 adalah 10668.67
    

#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1

Berfungsi untuk mencari rata-rata pada setiap bahan pokok. dimana terdapat 3 bahan pokok. Ketika user mengisi harga pada setiap indeks maka nilai tersebut akan tersimpan ke variabel "total". Setelah tersimpan ke variabel "total" akan di lakukan operasi aritmatika yaitu membagi nilai variabel "total" dengan harga[0].length (panjang data paad indeks kolom). Setelah itu hasil dari pembagian itu akan di simpan ke variabel "rata". Hal tersebut akan berulang samapi 3 kali (karena terdapat 3 produk).

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2

inisialisai variabel **total = 0** dan **rata = 0** berada di perulangan for yang pertama untuk menampung nilai total setiap setelah user menginputkan isi dari array harga setiap indeks kolom. Jika inisialisasi kedua variabel terletak di luar perulangan for maka nilai yang di tampung atau variabel total adalah semua nilai yang di inputkan (harga ketiga produk dalam satu semester) bukan harga setiap produk dalam satu semester

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

        double suhu[][] = new double[5][7];
        double max=0;

        for(int x = 0; x < suhu.length; x++){
            for(int y = 0; y < suhu[0].length; y++) {
                System.out.print("Masukkan suhu : ");
                suhu[x][y] = sc.nextInt();
                if (suhu[x][y] > max) {
                    max = suhu[x][y];
                }
            }
        }
        System.out.println("Suhu Max : " + max);

    
```

    Masukkan suhu : 20
    Masukkan suhu : 35
    Masukkan suhu : 27
    Masukkan suhu : 39
    Masukkan suhu : 17
    Masukkan suhu : 18
    Masukkan suhu : 27
    Masukkan suhu : 26
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 11
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Masukkan suhu : 1
    Suhu Max : 39.0
    

Penjelasan :

- Menggunakan library Scanner untuk input user
- Mendeklarasikan Scanner dan variabel array
- Kode program diatas untuk menampilkan input suhu pada 5 kota dalam 7 hari. 
- Menggunakan perulangan for
- **for(int x = 0; x < suhu.length; x++)** merupakan outer loop untuk spasi setelah perulangan inner loop sudah terpenuhi perulangannya
- **for(int y = 0; y < suhu[0].length; y++)** merupakan iner loop, jika kondisi terpenuhi maka selanjutnya akan meminta input user untuk mengisi setiap indeks array suhu.
- **if (suhu[x][y] > max)** kondisi tersebut digunakan untuk menentukan suhu maksimal. jika nilai dari suhu lebih besar dari nilai max, selanjutnya suhu tertinggi tersebut di tampung ke variabel "max". dan nantinya akan di tampilkan.

# 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2

        String nama_mahasiswa[] = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
        String nama_kolom[] = {"Nama", "Umur", "Berat", "Tinggi"};
        int data [][] = {
                {19, 51, 155},
                {18, 55, 163},
                {18, 45, 153},
                {20, 46, 158},
                {19, 58, 160},

        };


        double min_bb = data[0][1];
        double total_tb = 0;
        double avg_tb = 0;
        int umur_tertua = data[0][0];
        String nama_tertua = nama_mahasiswa[0];



        for(int i = 0; i < nama_kolom[0].length(); i++){ // untuk menampilkan kolom "Nama", "Umur", "Berat", "Tinggi"
            System.out.print(nama_kolom[i] + "\t");
        }
        System.out.println();

        for(int a = 0; a < nama_mahasiswa.length; a++){ 
            System.out.print(nama_mahasiswa[a] + " \t"); // untuk menampilkan baris nama mahasiswa "Desi", "Rofan", "Lala", "Beky", "Ega"
            for(int b = 0; b < data[0].length; b++){ //digunakan untuk menyeleksi indeks setiap kolom
                System.out.print(data[a][b] + "  \t"); // menampilkan isi dari setiap indeks
                    if (b == 1 && data[a][b] < min_bb){ // untuk mencari berat badan terendah
                        min_bb = data[a][b];
                    }else if(b == 2 ){ // untuk mencari rata-rata tinggi badan mahasiswa
                        total_tb += data[a][b];
                        avg_tb = total_tb / data.length;
                    }else if(b == 0 && data[a][b] > umur_tertua){ // untuk mencari nama mahasiswa dengan umur yang tertua
                        nama_tertua = nama_mahasiswa[a];

                    }

            }
            System.out.println();
        }


        System.out.println("\n\nBerat Badan terendah adalah \t\t\t: " + min_bb);
        System.out.println("Rata-rata tinggi badan mahasiswa adalah \t: " + avg_tb);
        System.out.println("Nama Mahasiswa dengan umur tertua adalah \t: " + nama_tertua);
```

    Nama	Umur	Berat	Tinggi	
    Desi 	19  	51  	155  	
    Rofan 	18  	55  	163  	
    Lala 	18  	45  	153  	
    Beky 	20  	46  	158  	
    Ega 	19  	58  	160  	
    
    
    Berat Badan terendah adalah 			: 45.0
    Rata-rata tinggi badan mahasiswa adalah 	: 157.8
    Nama Mahasiswa dengan umur tertua adalah 	: Beky
    

Penjelasan :

- Kode program diatas digunakan untuk menampilkan tabel data mahasiswa yang berisi nama mahasiswa, umur, tinggi badan, berat badan. Kemudian untuk mencari dan menampilkan berat badan terendah, rata-rata tinggi badan, dan nama mahasiswa dengna umur tertua.
- mendeklarasikan variabel serta variabel array yang dibutuhkan sesuai persoalan
- Untuk array "data" itu di inisialisasi isi setiap indeksnya, jadi nanti tinggal di tampilkan saja(outputkan), tidak di input satu-satu melalui Scanner.
- **for(int i = 0; i < nama_kolom[0].length(); i++)** digunakan untuk menampilkan untuk menampilkan kolom "Nama", "Umur", "Berat", "Tinggi".
-  **for(int a = 0; a < nama_mahasiswa.length; a++)** igunakan untuk spasi tiap baris ketika kondisi perulangan inner loop sudah selesai
- **for(int b = 0; b < data[0].length; b++)** digunakan untuk menampilkan isi dari setiap indeks variabel array "data" yang sebelumnnya sudah di inisialisai.
- **if (b == 1 && data[a][b] < min_bb)** kondisi tersebut digunakan untuk menyeleksi berat badan mahasiswa yang paling rendah, jika kondisi tersebut terpenuhi maka variabel min_bb(minimal berat badan) akan menampung nilai dari variabel "data[a][b]" yang terendah tadi.
- **else if(b == 2 )** digunakan untuk mencari rata-rata tinggi badan mahasiswa. Jika kondisi terpenuhi maka semua tinggi badan mahasiswa akan di tambahkan dan langsung di tampung oleh variabel "total_tb". Setelah itu akan dilakukan perhitungan untuk menari nilai rata-rata nya. yaitu dengan perintah **avg_tb = total_tb / data.length;**.
- **else if(b == 0 && data[a][b] > umur_tertua)** digunakan untuk mencari nama mahasiswa dengan umur tertua.

