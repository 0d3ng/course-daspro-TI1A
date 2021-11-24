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
int x, y;
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
// Tuliskan kode program Percobaan 1 Langkah 3
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
Tidak, pengisian elemen array bisa dilakukan secara acak asal dengan jelas menyatakan di baris/kolom mana yang akan diisi
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i < nilai.length; i++){
    for(int j = 0; j < nilai[0].length; j++){
    System.out.print(nilai[i][j] + " ");
   if (j == 2){
       System.out.println();
    }
}
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

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 2
    
    Masukkan rating pengguna 2 untuk restoran 0 : 1
    Masukkan rating pengguna 2 untuk restoran 1 : 2
    
    Masukkan rating pengguna 3 untuk restoran 0 : 3
    Masukkan rating pengguna 3 untuk restoran 1 : 2
    


# 4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
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

    1 2 
    3 2 
    1 2 
    3 2 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
Bisa, namun urutannya akan terbalik, bukan penggunanya yang bisa lebih dari 2, namun restorannya akan lebih dari 2, dan hanya bisa menginputkan rating dari 2 orang pengguna
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan Jumlah Pengunjung: ");
x = sc.nextInt();
System.out.print("Masukkan Jumlah Restoran: ");
y = sc.nextInt();
int[][] rating = new int[x][y];
for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + (i+1) + " untuk restoran " + (j+1) + ": ");
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

    Masukkan Jumlah Pengunjung: 5
    Masukkan Jumlah Restoran: 1
    Masukkan rating pengguna 1 untuk restoran 1: 1
    
    Masukkan rating pengguna 2 untuk restoran 1: 2
    
    Masukkan rating pengguna 3 untuk restoran 1: 2
    
    Masukkan rating pengguna 4 untuk restoran 1: 2
    
    Masukkan rating pengguna 5 untuk restoran 1: 4
    
    1 
    2 
    2 
    2 
    4 


## Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
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
    Masukkan harga[0][1]: 2000
    Masukkan harga[0][2]: 3000
    Masukkan harga[0][3]: 4000
    Masukkan harga[0][4]: 5000
    Masukkan harga[0][5]: 6000
    Rata-rata harga bahakn ke-0 adalah 3500.00
    Masukkan harga[1][0]: 7000
    Masukkan harga[1][1]: 8000
    Masukkan harga[1][2]: 9000
    Masukkan harga[1][3]: 10000
    Masukkan harga[1][4]: 11000
    Masukkan harga[1][5]: 12000
    Rata-rata harga bahakn ke-1 adalah 9500.00
    Masukkan harga[2][0]: 13000
    Masukkan harga[2][1]: 14000
    Masukkan harga[2][2]: 15000
    Masukkan harga[2][3]: 16000
    Masukkan harga[2][4]: 17000
    Masukkan harga[2][5]: 18000
    Rata-rata harga bahakn ke-2 adalah 15500.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
untuk merata-rata harga di setiap baris. Sistemnya yaitu seluruh harga pada satu baris dibagi dengan panjang baris ke-0 yang panjang barisnya sama dengan panjang baris lainnya
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
Karena pada sistem akan menghitung rata rata sebanyak 3 kali, dan jika dilakukan diluar for, maka nilai pada baris sebelumnya akan diakumulasikan dengan baris yang diinputkan sehingga menyebabkan kesalahan data
```

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

for(x = 0; x < suhu.length; x++){
double max = 0;
    for(y = 0; y < suhu[0].length; y++){
        System.out.print("Masukkan Suhu Kota Ke-" + (x + 1) + " Untuk Hari Ke-" + (y+1) + " (Celcius): ");
        suhu[x][y]= input.nextDouble();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
System.out.println("========================");
System.out.println("Suhu Tertinggi Di Kota Ke-" + (x+1) + " Adalah: " + max + "°C");
System.out.println("========================");
}

```

    Masukkan Suhu Kota Ke-1 Untuk Hari Ke-1 (Celcius): 100
    Masukkan Suhu Kota Ke-1 Untuk Hari Ke-2 (Celcius): 99
    Masukkan Suhu Kota Ke-1 Untuk Hari Ke-3 (Celcius): 98
    Masukkan Suhu Kota Ke-1 Untuk Hari Ke-4 (Celcius): 97
    Masukkan Suhu Kota Ke-1 Untuk Hari Ke-5 (Celcius): 96
    Masukkan Suhu Kota Ke-1 Untuk Hari Ke-6 (Celcius): 95
    Masukkan Suhu Kota Ke-1 Untuk Hari Ke-7 (Celcius): 94
    ========================
    Suhu Tertinggi Di Kota Ke-1 Adalah: 100.0°C
    ========================
    Masukkan Suhu Kota Ke-2 Untuk Hari Ke-1 (Celcius): 93
    Masukkan Suhu Kota Ke-2 Untuk Hari Ke-2 (Celcius): 92
    Masukkan Suhu Kota Ke-2 Untuk Hari Ke-3 (Celcius): 96
    Masukkan Suhu Kota Ke-2 Untuk Hari Ke-4 (Celcius): 91
    Masukkan Suhu Kota Ke-2 Untuk Hari Ke-5 (Celcius): 90
    Masukkan Suhu Kota Ke-2 Untuk Hari Ke-6 (Celcius): 89
    Masukkan Suhu Kota Ke-2 Untuk Hari Ke-7 (Celcius): 21
    ========================
    Suhu Tertinggi Di Kota Ke-2 Adalah: 96.0°C
    ========================
    Masukkan Suhu Kota Ke-3 Untuk Hari Ke-1 (Celcius): 4
    Masukkan Suhu Kota Ke-3 Untuk Hari Ke-2 (Celcius): 325
    Masukkan Suhu Kota Ke-3 Untuk Hari Ke-3 (Celcius): 14
    Masukkan Suhu Kota Ke-3 Untuk Hari Ke-4 (Celcius): 42
    Masukkan Suhu Kota Ke-3 Untuk Hari Ke-5 (Celcius): 57
    Masukkan Suhu Kota Ke-3 Untuk Hari Ke-6 (Celcius): 97
    Masukkan Suhu Kota Ke-3 Untuk Hari Ke-7 (Celcius): 35
    ========================
    Suhu Tertinggi Di Kota Ke-3 Adalah: 325.0°C
    ========================
    Masukkan Suhu Kota Ke-4 Untuk Hari Ke-1 (Celcius): 84
    Masukkan Suhu Kota Ke-4 Untuk Hari Ke-2 (Celcius): 1
    Masukkan Suhu Kota Ke-4 Untuk Hari Ke-3 (Celcius): 4
    Masukkan Suhu Kota Ke-4 Untuk Hari Ke-4 (Celcius): 85
    Masukkan Suhu Kota Ke-4 Untuk Hari Ke-5 (Celcius): 3
    Masukkan Suhu Kota Ke-4 Untuk Hari Ke-6 (Celcius): 5
    Masukkan Suhu Kota Ke-4 Untuk Hari Ke-7 (Celcius): 53
    ========================
    Suhu Tertinggi Di Kota Ke-4 Adalah: 85.0°C
    ========================
    Masukkan Suhu Kota Ke-5 Untuk Hari Ke-1 (Celcius): 4
    Masukkan Suhu Kota Ke-5 Untuk Hari Ke-2 (Celcius): 24
    Masukkan Suhu Kota Ke-5 Untuk Hari Ke-3 (Celcius): 53
    Masukkan Suhu Kota Ke-5 Untuk Hari Ke-4 (Celcius): 84
    Masukkan Suhu Kota Ke-5 Untuk Hari Ke-5 (Celcius): 8
    Masukkan Suhu Kota Ke-5 Untuk Hari Ke-6 (Celcius): 35
    Masukkan Suhu Kota Ke-5 Untuk Hari Ke-7 (Celcius): 53
    ========================
    Suhu Tertinggi Di Kota Ke-5 Adalah: 84.0°C
    ========================



```Java
//Penjelasan
Pada kode program tersebut awal mula user diminta untuk menginputkan 35 data suhu yang menunjukkan suhu di kota dan hari yang berbeda, lalu jika suhu lebih dari angka maksinal(max), maka "max" akan diganti dengan angka suhu terakhir. begitu dilakukan sampai input suhu terakhir.
Lalu sistem akan mencetak output berupa angka suhu tertinggi di setiap selama 7 hari tersebut.
```


    |   Pada kode program tersebut awal mula user diminta untuk menginputkan 35 data suhu yang menunjukkan suhu di kota dan hari yang berbeda, lalu jika suhu lebih dari angka maksinal(max), maka "max" akan diganti dengan angka suhu terakhir. begitu dilakukan sampai input suhu terakhir.

    ';' expected

    


#### 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int[][] data = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}};
String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int baris = 0;
int max = 0;
int rendah = 0;
double jumlah = 0;
int berat = 1234578;

for(int i = 0; i < data.length; i++){
        if(data[i][0] > max){
            max = data[i][0];
            baris = (int) i;
        }
     if(data[i][1] < berat){
            berat = data[i][1];
        }
    jumlah += data[i][2];
    }
double rata = jumlah/data.length;
System.out.println("Berat Badan Terendah Kelima Mahasiswa Tersebut Adalah " + berat + " kg");
System.out.println("Rata-Rata Tinggi Badan Kelima Mahasiswa Tersebut Adalah " + rata + " cm");
System.out.print("Mahasiswa Dengan Umur Tertua Adalah " + nama[baris]);
```

    Berat Badan Terendah Kelima Mahasiswa Tersebut Adalah 45 kg
    Rata-Rata Tinggi Badan Kelima Mahasiswa Tersebut Adalah 157.8 cm
    Mahasiswa Dengan Umur Tertua Adalah Beky

Penjelasan: 
Pada kode program tersebut pertama tama akan menghitung umur tertua dari mahasiswa dengan cara "jika umur mahasiswa lebih besar dari umur tertua data sebelumnya, maka akan otomatis diganti dengan umur paling tua, begitu sampai akhir loop, lalu jika sudah mencapai akhir, baris pada data integer akan diganti String sehingga menghasilkan nama", kedua akan menghitung berat terendah dengan cara "Jika berat mahasiswa lebih kecil dari angka terkecil data sebelumnya, maka akan otomatis diganti dengan data paling rendah", saya juga menggunakan nilai berat awal "1234578" yang tidak akan ada orang yang memiliki berat badan sebesar itu. Lalu pada rata rata saya hanya menjumlahkan seluruh angka pada kolom 2, lalu akan dibagi dengan panjang baris pada data yang berarti juga jumlah mahasiswa pada data. Lalu yang terakhir sistem akan mengeluarkan output berat badan terendah kelima mahasiswa, rata rata tinggi badan kelima mahasiswa, dan nama mahasiswa dengan umur tertua.


```Java

```


```Java

```
