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


Pengisian elemen array tidak harus dilakukan berurutan mulai dari indeks 0, selama pengisian elemen dilakukan didalam range array maka akan benar/berhasil meskipun pengisiannya tidak dilakukan secara urut.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0;i < nilai.length;i++){
for(int j = 0;j < nilai[0].length; j++){
System.out.println(nilai [i][j]);
}
}
```

    75
    90
    88
    79
    82
    67


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
        System.out.println("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 
    3
    Masukkan rating pengguna 0 untuk restoran 1 : 
    4
    
    Masukkan rating pengguna 1 untuk restoran 0 : 
    4
    Masukkan rating pengguna 1 untuk restoran 1 : 
    5
    
    Masukkan rating pengguna 2 untuk restoran 0 : 
    3
    Masukkan rating pengguna 2 untuk restoran 1 : 
    5
    
    Masukkan rating pengguna 3 untuk restoran 0 : 
    5
    Masukkan rating pengguna 3 untuk restoran 1 : 
    4
    


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

    3 4 
    4 5 
    3 5 
    5 4 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 1


Iya, posisi i dapat ditukar dengan posisi j, namun urutan input akan menjadi berbeda. Jika awalnya i lalu j maka urutan berdasarkan pengguna misal pengguna 0 untuk rating restoran 1 dan 2, pengguna 1 untuk rating restoran 1 dan 2, dan seterusnya. Namun jika ditukar posisinya j lalu i, maka input berdasarkan urutan restoran contohnya rating untuk restoran 0 dari pengguuna 0,1,2,3, rating untuk restoran 1 dari pengguuna 0,1,2,3. Berikut merupakan kode apabila posisi i ditukar dengan posisi j :


```Java
for (int j = 0; j < rating[0].length; j++){
    for (int i = 0; i < rating.length; i++){
        System.out.println("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}

```

    Masukkan rating pengguna 0 untuk restoran 0 : 
    3
    Masukkan rating pengguna 1 untuk restoran 0 : 
    4
    Masukkan rating pengguna 2 untuk restoran 0 : 
    4
    Masukkan rating pengguna 3 untuk restoran 0 : 
    5
    
    Masukkan rating pengguna 0 untuk restoran 1 : 
    3
    Masukkan rating pengguna 1 untuk restoran 1 : 
    5
    Masukkan rating pengguna 2 untuk restoran 1 : 
    5
    Masukkan rating pengguna 3 untuk restoran 1 : 
    4
    


Namun jika tukar posisi i dengan j yang dimaksud seperti ini : 


```Java
for (int j = 0; j < rating.length; j++){
    for (int i = 0; i < rating[0].length; i++){
        System.out.println("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 
    3
    Masukkan rating pengguna 1 untuk restoran 0 : 
    4
    
    Masukkan rating pengguna 0 untuk restoran 1 : 
    4
    Masukkan rating pengguna 1 untuk restoran 1 : 
    5
    
    Masukkan rating pengguna 0 untuk restoran 2 : 
    3



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#78:4)


jika ditukar seperti kode diatas maka tidak bisa karena ada elemen yang tidak ditemukan dalam range array. Contohnya dengan elemen terakhir ber indeks [1][3] tidak ditemukan dalam array dengan jumlah baris 4, jumlah kolom 2.

 2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int i, j;
System.out.print("Masukkan banyak pelanggan (baris) : ");
int i = sc.nextInt();
System.out.print("Masukkan jumlah restoran (kolom) : ");
int j = sc.nextInt();
int[][] rating = new int[i][j];
for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.println("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
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

    Masukkan banyak pelanggan (baris) : 5
    Masukkan jumlah restoran (kolom) : 3
    Masukkan rating pengguna 0 untuk restoran 0 : 
    4
    Masukkan rating pengguna 0 untuk restoran 1 : 
    5
    Masukkan rating pengguna 0 untuk restoran 2 : 
    3
    
    Masukkan rating pengguna 1 untuk restoran 0 : 
    4
    Masukkan rating pengguna 1 untuk restoran 1 : 
    5
    Masukkan rating pengguna 1 untuk restoran 2 : 
    3
    
    Masukkan rating pengguna 2 untuk restoran 0 : 
    3
    Masukkan rating pengguna 2 untuk restoran 1 : 
    4
    Masukkan rating pengguna 2 untuk restoran 2 : 
    5
    
    Masukkan rating pengguna 3 untuk restoran 0 : 
    5
    Masukkan rating pengguna 3 untuk restoran 1 : 
    4
    Masukkan rating pengguna 3 untuk restoran 2 : 
    3
    
    Masukkan rating pengguna 4 untuk restoran 0 : 
    3
    Masukkan rating pengguna 4 untuk restoran 1 : 
    5
    Masukkan rating pengguna 4 untuk restoran 2 : 
    4
    
    4 5 3 
    4 5 3 
    3 4 5 
    5 4 3 
    3 5 4 


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
    for(int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d]", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]10000
    Masukkan harga[0][1]11000
    Masukkan harga[0][2]12000
    Masukkan harga[0][3]13000
    Masukkan harga[0][4]14000
    Masukkan harga[0][5]15000
    Rata-rata harga bahan ke-0 adalah 12500.00
    Masukkan harga[1][0]5000
    Masukkan harga[1][1]6000
    Masukkan harga[1][2]6500
    Masukkan harga[1][3]7000
    Masukkan harga[1][4]7500
    Masukkan harga[1][5]8000
    Rata-rata harga bahan ke-1 adalah 6666.67
    Masukkan harga[2][0]4000
    Masukkan harga[2][1]5000
    Masukkan harga[2][2]6000
    Masukkan harga[2][3]7000
    Masukkan harga[2][4]8000
    Masukkan harga[2][5]9000
    Rata-rata harga bahan ke-2 adalah 6500.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1


Fungsi dari kode diatas adalah untuk menghitung rata-rata suatu bahan selama satu semester (6 bulan), jadi untuk menghitung rata-ratanya yaitu total dari harga jenis bahan setiap bulannya dibagi jumlah kolom (jumlah bulan yaitu 6).

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2

inisialisasi variabel total = 0 dan rata = 0 harus berada di dalam perulangan for yang pertama supaya apabila total dan rata-rata dari bahan sebelumnya sudah terhitung, untuk bahan selanjutnya total dan rata dikembalikan ke 0 lalu dihitung lagi untuk total dan rata bahan selanjutnya tanpa terpengaruh oleh loop sebelumnya. Jadi total dan rata-rata bahan B tidak terpengaruh dengan bahan A, dan bahan C tidak terpengaruh total dan rata-rata bahan B. Untuk mengulangi perhitungan total dan rata-rata persemester setiap ganti bahan.

Apabila inisialisasi kedua variabel tersebut diletakkan di luar perulangan for (setelah deklarasi array) maka perhitungan total dan rata-rata bahan akan dipengaruhi oleh perhitungan total dan rata-rata bahan sebelumnya.

# Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double[][] suhu = new double[5][7];
int x, y;
double max = 0;
for(x = 0; x < suhu.length; x++){
    for(y = 0; y < suhu[0].length; y++){
        int xx = x+1;
        int yy = y+1;
        System.out.println("Masukkan suhu hari ke-" + yy +  " pada kota " + xx);
        suhu[x][y]=sc.nextDouble();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
        }
}System.out.println("Suhu tertinggi dari lima kota Jepang selama 7 hari adalah " + max);
```

    Masukkan suhu hari ke-1 pada kota 1
    17.17
    Masukkan suhu hari ke-2 pada kota 1
    16.28
    Masukkan suhu hari ke-3 pada kota 1
    16.28
    Masukkan suhu hari ke-4 pada kota 1
    17.29
    Masukkan suhu hari ke-5 pada kota 1
    18.28
    Masukkan suhu hari ke-6 pada kota 1
    18.27
    Masukkan suhu hari ke-7 pada kota 1
    19.27
    Masukkan suhu hari ke-1 pada kota 2
    27.21
    Masukkan suhu hari ke-2 pada kota 2
    21.19
    Masukkan suhu hari ke-3 pada kota 2
    19.27
    Masukkan suhu hari ke-4 pada kota 2
    28.27
    Masukkan suhu hari ke-5 pada kota 2
    26.88
    Masukkan suhu hari ke-6 pada kota 2
    17.27
    Masukkan suhu hari ke-7 pada kota 2
    15.2
    Masukkan suhu hari ke-1 pada kota 3
    2.1
    Masukkan suhu hari ke-2 pada kota 3
    4.3
    Masukkan suhu hari ke-3 pada kota 3
    5.1
    Masukkan suhu hari ke-4 pada kota 3
    16.3
    Masukkan suhu hari ke-5 pada kota 3
    18.5
    Masukkan suhu hari ke-6 pada kota 3
    18.6
    Masukkan suhu hari ke-7 pada kota 3
    28.28
    Masukkan suhu hari ke-1 pada kota 4
    18.27
    Masukkan suhu hari ke-2 pada kota 4
    29.28
    Masukkan suhu hari ke-3 pada kota 4
    18.27
    Masukkan suhu hari ke-4 pada kota 4
    19.28
    Masukkan suhu hari ke-5 pada kota 4
    19.2
    Masukkan suhu hari ke-6 pada kota 4
    21.45
    Masukkan suhu hari ke-7 pada kota 4
    22.45
    Masukkan suhu hari ke-1 pada kota 5
    22.44
    Masukkan suhu hari ke-2 pada kota 5
    22.33
    Masukkan suhu hari ke-3 pada kota 5
    21.45
    Masukkan suhu hari ke-4 pada kota 5
    25.6
    Masukkan suhu hari ke-5 pada kota 5
    38.1
    Masukkan suhu hari ke-6 pada kota 5
    40.32
    Masukkan suhu hari ke-7 pada kota 5
    36.2
    Suhu tertinggi dari lima kota Jepang selama 7 hari adalah 40.32


2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
int[][] informasi = {{19,51,155},
                     {18,55,163},
                     {18,45,153},
                     {20,46,158},
                     {19,58,160}};
String[] mahasiswa = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int min = informasi[0][1]; //acuan berat badan ada pada kolom dengan indeks 1 (kolom ke 2)
int max = informasi[0][0]; //acuan umur ada pada kolom dengan indeks 0 (kolom ke 1)
int mahasiswaTertua;
int total;
for(int i = 0; i < informasi.length; i++)
    for(int j = 0; j < informasi[0].length; j++) {
        //mencari umur tertua
        if(j == 0 && max < informasi[i][j]) {//setiap kali ada i terbaru yang lebih besar maka i tersebut niai maksimalnya
        max = informasi[i][j];
        mahasiswaTertua = i;
        }//mencari berat badan terendah
        else if(j == 1 && min > informasi[i][j]){//setiap kali ada i terbaru yang lebih kecil maka i tersebut niai minimalnya
        min = informasi[i][j];
        }//mencari rata-rata tinggi badan
        else if(j == 2){
        total += informasi[i][j];
        }
    };
System.out.println("Berat badan terendah di antara kelima mahasiswa tersebut adalah " + min);
System.out.println("Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah " + (double) total/informasi.length);
System.out.println("mahasiswa dengan umur tertua adalah " + mahasiswa[mahasiswaTertua] + " dengan umur " + max );
```

    Berat badan terendah di antara kelima mahasiswa tersebut adalah 45
    Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah 157.8
    mahasiswa dengan umur tertua adalah Beky dengan umur 20

