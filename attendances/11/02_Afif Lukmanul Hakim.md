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

3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai [0][0] + " " + nilai [0][1] + " " + nilai[0][2]);
System.out.println(nilai [1][0] + " " + nilai [1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67

Penjelasan Percobaan 1

Code program tersebut menampilkan 3 nilai dari 2 mahasiswa yang di mana 3 tersebut merupakan baris dan 2 merupakan kolom.

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
Untuk pengisian elemen array boleh tidak berurutan karena tidak berpengaruh pada code program, namun lebih baik diurutkan jadi lebih enak untuk dilihat dan dibaca
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

for(int i = 0; i <= nilai.length; i++){
    for(int j = 0; j <= nilai.length; j++){
         System.out.print(nilai[i][j] + " ");
        }
    System.out.println();
}
```

    75 90 88 
    79 82 67 



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#77:1)


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
for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + ": ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0: 4
    Masukkan rating pengguna 0 untuk restoran 1: 6
    
    Masukkan rating pengguna 1 untuk restoran 0: 4
    Masukkan rating pengguna 1 untuk restoran 1: 3
    
    Masukkan rating pengguna 2 untuk restoran 0: 6
    Masukkan rating pengguna 2 untuk restoran 1: 5
    
    Masukkan rating pengguna 3 untuk restoran 0: 4
    Masukkan rating pengguna 3 untuk restoran 1: 6
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg : rating){
    for (int r : rtg){
        System.out.print(r + " ");
    }
    System.out.println(" ");
}
```

    4 6 
    4 3 
    6 5 
    4 6 

Penjelasan Percobaan 2:

Code program tersebut menampilkan rating dari 4 pengguna untuk 2 restoran dengan menggunakan code pemrograman perulangan (looping).

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
Untuk posisi i ditukar dengan j tidak dapat ditukar karena dapat bisa mengalami eror pada saat dijalankan code programnya.
```


```Java
// Tuliskan jawaban nomor 1
for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + j + " untuk restoran " + i + ": ");
        rating[j][i] = sc.nextInt();
    }
    System.out.println(" ");
}
```

    Masukkan rating pengguna 0 untuk restoran 0: 4
    Masukkan rating pengguna 1 untuk restoran 0: 6
     
    Masukkan rating pengguna 0 untuk restoran 1: 5
    Masukkan rating pengguna 1 untuk restoran 1: 4
     
    Masukkan rating pengguna 0 untuk restoran 2: 6



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#17:5)


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan jumlah baris: ");
int baris = sc.nextInt();
System.out.print("Masukkan jumlah kolom: ");
int kolom = sc.nextInt();
int[][] rating = new int[baris][kolom];
System.out.println(" ");

for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + ": ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println(" ");
}
for(int[] rtg : rating){
    for (int r : rtg){
        System.out.print(r + " ");
    }
    System.out.println(" ");
}
```

    Masukkan jumlah baris: 4
    Masukkan jumlah kolom: 2
     
    Masukkan rating pengguna 0 untuk restoran 0: 4
    Masukkan rating pengguna 0 untuk restoran 1: 6
     
    Masukkan rating pengguna 1 untuk restoran 0: 4
    Masukkan rating pengguna 1 untuk restoran 1: 3
     
    Masukkan rating pengguna 2 untuk restoran 0: 6
    Masukkan rating pengguna 2 untuk restoran 1: 5
     
    Masukkan rating pengguna 3 untuk restoran 0: 4
    Masukkan rating pengguna 3 untuk restoran 1: 6
     
    4 6  
    4 3  
    6 5  
    4 6  


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
for(int i = 0; i < harga.length; i++){
    total = 0;
    rata = 0;
    for(int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga [%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total/harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0][0]: 10000
    Masukkan harga [0][1]: 12000
    Masukkan harga [0][2]: 11000
    Masukkan harga [0][3]: 8000
    Masukkan harga [0][4]: 10000
    Masukkan harga [0][5]: 5000
    Rata-rata harga bahan ke-0 adalah 9333.33
    Masukkan harga [1][0]: 20000
    Masukkan harga [1][1]: 32000
    Masukkan harga [1][2]: 22000
    Masukkan harga [1][3]: 25000
    Masukkan harga [1][4]: 20000
    Masukkan harga [1][5]: 30000
    Rata-rata harga bahan ke-1 adalah 24833.33
    Masukkan harga [2][0]: 15000
    Masukkan harga [2][1]: 20000
    Masukkan harga [2][2]: 15000
    Masukkan harga [2][3]: 20000
    Masukkan harga [2][4]: 15000
    Masukkan harga [2][5]: 20000
    Rata-rata harga bahan ke-2 adalah 17500.00

Penjelasan Percobaan 3:

Code program tersebut dijalankan untuk menampilkan harga setiap bahan pokok tiap 1 semesternya dengan menggunakan code program looping dan menambahkan rata-rata setiap harga bahan pokok tiap 1 semesternya.

#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
Fungsi dari "rata = total/harga[0].length" yaitu di mana rata-rata dihasilkan dari total harga yang dikeluarkan sebanyak indeks yaitu total harga bahan pokok selama 1 semester dan dibagi dengan jumlah bulan dalam 1 semester.
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int[][] harga = new int[3][6];
double total, rata;
total = 0;
rata = 0;

for(int i = 0; i < harga.length; i++){
    for(int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga [%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total/harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga [0][0]: 10000
    Masukkan harga [0][1]: 10000
    Masukkan harga [0][2]: 10000
    Masukkan harga [0][3]: 10000
    Masukkan harga [0][4]: 10000
    Masukkan harga [0][5]: 10000
    Rata-rata harga bahan ke-0 adalah 10000.00
    Masukkan harga [1][0]: 10000
    Masukkan harga [1][1]: 12000
    Masukkan harga [1][2]: 11000
    Masukkan harga [1][3]: 10000
    Masukkan harga [1][4]: 12000
    Masukkan harga [1][5]: 12000
    Rata-rata harga bahan ke-1 adalah 21166.67
    Masukkan harga [2][0]: 15000
    Masukkan harga [2][1]: 10000
    Masukkan harga [2][2]: 12000
    Masukkan harga [2][3]: 12000
    Masukkan harga [2][4]: 15000
    Masukkan harga [2][5]: 10000
    Rata-rata harga bahan ke-2 adalah 33500.00



```Java
menurut saya alasan letak inisialisasi terletak pada loop yang pertama karena setiap loop butuh kembali indeks ke-0 atau bulan pertama untuk menghitung harga setiap bahan pokok dan akan menghitung total dan rata-rata setelah mengumpulkan harga bahan pokok selama 1 semester. Dan perbedaan dengan hasil percobaan sangatlah berbeda sekali, kalau yang di percobaan hasil rata-rata yang dikeluarkan sudah tepat namun pada percobaan di atas tidak sesuai dengan rata-rata yang dihasilkan, mungkin itu kurang lebih yang terjadi 
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

for(int x = 0; x < suhu.length; x++){
    for(int y = 0; y < suhu[0].length; y++){
        System.out.print("Masukkan suhu kota ke-" + (x+1) + " pada hari ke-" + (y+1) + ": ");
        suhu[x][y] = sc.nextInt();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
}
System.out.println("suhu tertinggi dari 5 kota di Jepang selama 7 hari adalah " + max + " derajat celcius");
```

    Masukkan suhu kota ke-1 pada hari ke-1: 32
    Masukkan suhu kota ke-1 pada hari ke-2: 33
    Masukkan suhu kota ke-1 pada hari ke-3: 34
    Masukkan suhu kota ke-1 pada hari ke-4: 35
    Masukkan suhu kota ke-1 pada hari ke-5: 36
    Masukkan suhu kota ke-1 pada hari ke-6: 37
    Masukkan suhu kota ke-1 pada hari ke-7: 38
    Masukkan suhu kota ke-2 pada hari ke-1: 20
    Masukkan suhu kota ke-2 pada hari ke-2: 21
    Masukkan suhu kota ke-2 pada hari ke-3: 22
    Masukkan suhu kota ke-2 pada hari ke-4: 23
    Masukkan suhu kota ke-2 pada hari ke-5: 24
    Masukkan suhu kota ke-2 pada hari ke-6: 25
    Masukkan suhu kota ke-2 pada hari ke-7: 26
    Masukkan suhu kota ke-3 pada hari ke-1: 27
    Masukkan suhu kota ke-3 pada hari ke-2: 30
    Masukkan suhu kota ke-3 pada hari ke-3: 31
    Masukkan suhu kota ke-3 pada hari ke-4: 32
    Masukkan suhu kota ke-3 pada hari ke-5: 33
    Masukkan suhu kota ke-3 pada hari ke-6: 34
    Masukkan suhu kota ke-3 pada hari ke-7: 35
    Masukkan suhu kota ke-4 pada hari ke-1: 21
    Masukkan suhu kota ke-4 pada hari ke-2: 22
    Masukkan suhu kota ke-4 pada hari ke-3: 23
    Masukkan suhu kota ke-4 pada hari ke-4: 24
    Masukkan suhu kota ke-4 pada hari ke-5: 25
    Masukkan suhu kota ke-4 pada hari ke-6: 26
    Masukkan suhu kota ke-4 pada hari ke-7: 27
    Masukkan suhu kota ke-5 pada hari ke-1: 29
    Masukkan suhu kota ke-5 pada hari ke-2: 30
    Masukkan suhu kota ke-5 pada hari ke-3: 31
    Masukkan suhu kota ke-5 pada hari ke-4: 32
    Masukkan suhu kota ke-5 pada hari ke-5: 33
    Masukkan suhu kota ke-5 pada hari ke-6: 34
    Masukkan suhu kota ke-5 pada hari ke-7: 35
    suhu tertinggi dari 5 kota di Jepang selama 7 hari adalah 38.0 derajat celcius

Penjelasan:

Untuk menampilkan suhu pada kota pertama sampai kota ke-5 pada setiap hari pertama sampai hari ke-7 dan menentukan suhu tertinggi selama 7 hari tersebut yaitu pertama dengan mendeklarasikan terlebih dahulu kota dengan baris sebanyak 5 dan hari dengan baris sebanyak 7 lalu mennginisialisasi max untuk nilai tertinggi. Selanjutnya menggunakan looping seperti biasa dengan menginisialisasikan menjadi variabel x dan y. Setelah terkumpul membuat kondisi di innerloop jika suhu lebih dari variabel max=0 maka suhu akan diganti dengan nilai suhu yang lebih tinggi begitupun seterusnya dan jika tidak ada nilai lagi maka nilai suhu tersebut nilai paling tinggi dan ditampung di variabel max dan dicetak.

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int data[][] = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}};
int umur = 0, berat = 0, tinggi = 0;

for(int x = 0; x < data.length; x++){
    int tempo = 0;
    for(int j = 1; j < (data.length-x); j++){
        if(data[j-1][1] > data[j][1]){
            tempo = data[j-1][1];
            data[j-1][1] = data[j][1];
            data[j][1] = tempo;
        }
    }
}
System.out.println("Berat badan terendah di antara kelima mahasiswa tersebut adalah " + data[0][1]);

int nilaiTinggiMHS = 0;
double rataTinggi = 0;
for(int i = 0; i < data.length; i++){
        nilaiTinggiMHS += data[i][2];
    }
rataTinggi = (double)nilaiTinggiMHS / data.length;
System.out.println("Rata-rata tinggi badan kelima mahasiswa tersebut adalah " + rataTinggi);

String nama[] = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int maxTua = 0;
int tempo = 0;

for(int i = 0; i < data.length; i++){
    if(data[i][0] > maxTua){
        maxTua = data[i][0];
        tempo = i;
    }    
}
System.out.println("Mahasiswa dengan umur tertua adalah " + nama[tempo]);
```

    Berat badan terendah di antara kelima mahasiswa tersebut adalah 45
    Rata-rata tinggi badan kelima mahasiswa tersebut adalah 157.8
    Mahasiswa dengan umur tertua adalah Beky

Penjelasan:

Untuk menampilkan berat badan terendah dari mahasiswa, sebelumnya membuat code program array 2 dimensi terlebih dahulu untuk menampung semua nilai berat badan mahasiswa dan membuat variabel untuk menentukan berat badan terendah.

Untuk menentukan rata-rata tinggi mahasiswa semua itu kita hanya menjumlahkan kolom yang menyatakan tinggi dari mahasiswa dan membagi dengan jumlah mahasiswa.

Untuk menentukan umur tertua kita hanya membuat array 1 dengan mencantumkan nama mahasiswa sesuai dengan urutan data yang di atasanya, lalu membuat variabel untuk menentukan nilai umur yang paling besar dan ditampung pada variabel tersebut dan dicetak