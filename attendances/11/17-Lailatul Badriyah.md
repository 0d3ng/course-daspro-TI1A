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
System.out.println(nilai[0][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    75 82 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1

*Tidak harus berututan (dimulai dari indeks pertama). Yang terpenting semua array dapat terisi. Hal ini dikarenakan setiap array memiliki indeks atau urutan nomor isi dalam array tersebut dimulai dari angka 0. Ketika kita ingin mengisikan indeks ke 5 terlebih dahulu sebelum indeks pertama itu bisa saja.*

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i=0; i<nilai.length; i++){
    for(int j=0; j<nilai[0].length; j++){
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
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

for (int i = 0; i< rating.length; i++) {
    for (int j = 0; j< rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 4
    Masukkan rating pengguna 0 untuk restoran 1 : 6
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 7
    
    Masukkan rating pengguna 2 untuk restoran 0 : 8
    Masukkan rating pengguna 2 untuk restoran 1 : 9
    
    Masukkan rating pengguna 3 untuk restoran 0 : 6
    Masukkan rating pengguna 3 untuk restoran 1 : 8
    


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

    4 6 
    3 7 
    8 9 
    6 8 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!

// Tuliskan jawaban nomor 1

*Tidak bisa, karena posisi nilai pada baris dan kolom tertukar dan akan terjadi error index out of bounds. Berikut kode programnya.*


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int[][] rating = new int[4][2];
for (int j = 0; j < rating.length; j++) {
    for (int i = 0; i < rating[0].length; i++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 7
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    
    Masukkan rating pengguna 0 untuk restoran 1 : 6
    Masukkan rating pengguna 1 untuk restoran 1 : 9
    
    Masukkan rating pengguna 0 untuk restoran 2 : 5



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#16:1)


2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in); 

System.out.print("Banyak baris : ");
int baris = sc.nextInt();
System.out.print("Banyak kolom : ");
int kolom = sc.nextInt();
int[][] rating = new int[baris][kolom];

for (int i = 0; i < rating.length; i++){ 
    for (int j = 0; j < rating[0].length; j++){ 
        System.out.print("Rating pengguna "+ i + " untuk restoran " + j + " : "); 
        rating[i][j] = sc.nextInt(); 
    }
    System.out.println("");
}
for(int[] rtg : rating){
    for(int r : rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Banyak baris : 2
    Banyak kolom : 3
    Rating pengguna 0 untuk restoran 0 : 8
    Rating pengguna 0 untuk restoran 1 : 9
    Rating pengguna 0 untuk restoran 2 : 7
    
    Rating pengguna 1 untuk restoran 0 : 6
    Rating pengguna 1 untuk restoran 1 : 8
    Rating pengguna 1 untuk restoran 2 : 5
    
    8 9 7 
    6 8 5 


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
        total += harga[i][j];
    }
    rata =total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
} 
```

    Masukkan harga[0][0]: 1000
    Masukkan harga[0][1]: 2000
    Masukkan harga[0][2]: 3000
    Masukkan harga[0][3]: 4000
    Masukkan harga[0][4]: 5000
    Masukkan harga[0][5]: 6000
    Rata-rata harga bahan ke-0 adalah 3500.00
    Masukkan harga[1][0]: 10000
    Masukkan harga[1][1]: 11000
    Masukkan harga[1][2]: 12000
    Masukkan harga[1][3]: 13000
    Masukkan harga[1][4]: 14000
    Masukkan harga[1][5]: 15000
    Rata-rata harga bahan ke-1 adalah 12500.00
    Masukkan harga[2][0]: 20000
    Masukkan harga[2][1]: 21000
    Masukkan harga[2][2]: 22000
    Masukkan harga[2][3]: 23000
    Masukkan harga[2][4]: 24000
    Masukkan harga[2][5]: 25000
    Rata-rata harga bahan ke-2 adalah 22500.00


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1

*Fungsi dari rata = total / harga[0].length yaitu untuk menghitung rata-rata dari setiap bahan dengan cara total harga pada pada bahan tersebut dibagi panjang data pada indeks kolom yaitu 6.*

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2

*Insialisasi variabel total = 0 dan rata = 0 berada di dalam perulangan for yang pertama karena berfungsi untuk mereset nilai dari perhitungan sebelumnya. Pada perulangan yang pertama kedua variabel tersebut sudah diisi dengan nilai, maka pada perulangan berikutnya jika variabel tersebut tidak inisialisasi ulang menjadi 0 maka akan mempengaruhi perhitungan pada looping berikutnya. Jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan for maka perhitungan total dan rata-rata bahan akan dipengaruhi oleh perhitungan total dan rata-rata bahan sebelumnya sehingga rata-rata yang muncul tidak sesuai. Berikut kode program jika inisialisasi kedua variabel diletakkan di luar perulangan for. Berikut kode programnya.*


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System .in);

int[][] harga = new int[3][6];
double total, rata;
    total = 0;
    rata = 0;

for (int i = 0; i < harga.length; i++) {
    for (int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 1000
    Masukkan harga[0][1]: 1200
    Masukkan harga[0][2]: 1500
    Masukkan harga[0][3]: 2000
    Masukkan harga[0][4]: 2100
    Masukkan harga[0][5]: 2400
    Rata-rata harga bahan ke-0 adalah 1700.00
    Masukkan harga[1][0]: 3000
    Masukkan harga[1][1]: 3500
    Masukkan harga[1][2]: 3100
    Masukkan harga[1][3]: 2200
    Masukkan harga[1][4]: 2000
    Masukkan harga[1][5]: 1500
    Rata-rata harga bahan ke-1 adalah 4250.00
    Masukkan harga[2][0]: 4500
    Masukkan harga[2][1]: 4000
    Masukkan harga[2][2]: 3200
    Masukkan harga[2][3]: 3000
    Masukkan harga[2][4]: 2100
    Masukkan harga[2][5]: 2000
    Rata-rata harga bahan ke-2 adalah 7383.33


## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int suhu[][] = new int[5][7];
int x, y;
double max = 0;
    
for (x = 0; x < suhu.length; x++){
    for(y = 0; y < suhu[0].length; y++){
        System.out.print("Masukkan suhu kota "  + (x + 1)+ " pada hari ke-" + (y + 1)+ " : ");
        suhu[x][y] = sc.nextInt();
         if(suhu[x][y]>max){
            max = suhu[x][y];
         }
    }
    System.out.println("");
}
    System.out.print("Suhu tertinggi dari 5 kota di Jepang selama 7 hari berturut-turut adalah "+ max);
```

    Masukkan suhu kota 1 pada hari ke-1 : 12
    Masukkan suhu kota 1 pada hari ke-2 : 34
    Masukkan suhu kota 1 pada hari ke-3 : 65
    Masukkan suhu kota 1 pada hari ke-4 : 89
    Masukkan suhu kota 1 pada hari ke-5 : 98
    Masukkan suhu kota 1 pada hari ke-6 : 70
    Masukkan suhu kota 1 pada hari ke-7 : 59
    
    Masukkan suhu kota 2 pada hari ke-1 : 39
    Masukkan suhu kota 2 pada hari ke-2 : 10
    Masukkan suhu kota 2 pada hari ke-3 : 121
    Masukkan suhu kota 2 pada hari ke-4 : 13
    Masukkan suhu kota 2 pada hari ke-5 : 45
    Masukkan suhu kota 2 pada hari ke-6 : 76
    Masukkan suhu kota 2 pada hari ke-7 : 89
    
    Masukkan suhu kota 3 pada hari ke-1 : 54
    Masukkan suhu kota 3 pada hari ke-2 : 32
    Masukkan suhu kota 3 pada hari ke-3 : 46
    Masukkan suhu kota 3 pada hari ke-4 : 66
    Masukkan suhu kota 3 pada hari ke-5 : 89
    Masukkan suhu kota 3 pada hari ke-6 : 125
    Masukkan suhu kota 3 pada hari ke-7 : 12
    
    Masukkan suhu kota 4 pada hari ke-1 : 75
    Masukkan suhu kota 4 pada hari ke-2 : 34
    Masukkan suhu kota 4 pada hari ke-3 : 28
    Masukkan suhu kota 4 pada hari ke-4 : 16
    Masukkan suhu kota 4 pada hari ke-5 : 76
    Masukkan suhu kota 4 pada hari ke-6 : 56
    Masukkan suhu kota 4 pada hari ke-7 : 42
    
    Masukkan suhu kota 5 pada hari ke-1 : 21
    Masukkan suhu kota 5 pada hari ke-2 : 78
    Masukkan suhu kota 5 pada hari ke-3 : 97
    Masukkan suhu kota 5 pada hari ke-4 : 69
    Masukkan suhu kota 5 pada hari ke-5 : 75
    Masukkan suhu kota 5 pada hari ke-6 : 44
    Masukkan suhu kota 5 pada hari ke-7 : 39
    
    Suhu tertinggi dari 5 kota di Jepang selama 7 hari berturut-turut adalah 125.0

*Pada kode program di atas import java.util.Scanner; digunakan untuk menambahkan library scanner yang diimport ke dalam program java. Scanner sc = new Scanner(System.in); merupakan perintah deklarasi scanner. Kemudian int suhu[][] = new int[5][7]; merupakan inisialisasi array dengan nama array suhu dan tipe data double 5 baris dan 7 kolom. Kemudian int x, y; merupakan tipe data int dengan variabel x dan y. double max = 0; merupakan deklarasi variabel dengan tipe data double variabel max. Menggunakan perulangan for sebanyak 2 perulangan yaitu for (x = 0; x < suhu.length; x++){ dan for(y = 0; y < suhu[0].length; y++){. Kemudian System.out.print("Masukkan suhu kota "  + (x + 1)+ " pada hari ke-" + (y + 1)+ " : "); untuk menampilkan output suhu kota ke berapa pada hari ke berapa. Kemudian suhu[x][y] = sc.nextInt(); user menginputkan ke dalam array suhu. Kemudian if(suhu[x][y]>max){ dan max = suhu[x][y]; inputan akan dimasukkan ke dalam variabel max, jika nilai yang diinput lebih besar dari nilai variabel max. Kemudian akan terdapat output Suhu tertinggi dari 5 kota di Jepang selama 7 hari berturu-turut.*

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
int[][] dataMhs = {{19, 51, 155},
                   {18, 55, 163},
                   {18, 45, 153},
                   {20, 46, 158},
                   {19, 58, 160}};
int a, b, indeks, minberatBdn=100, umurTertua = 0;
String[] daftarNama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
double totaltinggiBdn = 0, ratatinggiBdn = 0;


    for(a = 0; a < dataMhs.length; a++){
        for(b = 0; b < dataMhs[1].length; b++){
            if(dataMhs[a][1] < minberatBdn){
            minberatBdn = dataMhs[a][1];
        }
    }
}
System.out.print("Berat badan terendah di antara kelima mahasiswa tersebut adalah " + minberatBdn +" kg");


    for(a = 0; a < dataMhs.length; a++){
        for(b = 0; b < dataMhs[0].length; b++){
            if(b == 2)
            totaltinggiBdn += dataMhs[a][b];
    }
}

    ratatinggiBdn = totaltinggiBdn / dataMhs.length;
        System.out.print('\n'+ "Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah " + ratatinggiBdn +" cm");

    for(a = 0; a < dataMhs.length; a++){
        for(b = 0; b < dataMhs[0].length; b++){
            if(dataMhs[a][0] > umurTertua){
            umurTertua = dataMhs[a][0];
            indeks = a;
        }
    }
}
System.out.print('\n'+"Mahasiswa dengan umur tertua diantara kelima mahasiswa tersebut adalah " + daftarNama[indeks] +" dengan umur " + umurTertua +" tahun");
```

    Berat badan terendah di antara kelima mahasiswa tersebut adalah 45 kg
    Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah 157.8 cm
    Mahasiswa dengan umur tertua diantara kelima mahasiswa tersebut adalah Beky dengan umur 20 tahun

*Pada kode program di atas import java.util.Scanner; digunakan untuk menambahkan library scanner yang diimport ke dalam program java. Scanner sc = new Scanner(System.in); merupakan perintah deklarasi scanner. Kemudian int[][] dataMhs = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}}; sebagai inisialisasi array dengan tipe data int. int a,b, indeks, minberatBdn=100, umurTertua = 0; yang merupakan tipe data int dengan variabel a, b, indeks, minberatBdn, dan umurTertua. Terdapat String[] daftarNama = {"Desi", "Rofan", "Lala", "Beky", "Ega"}; yang merupakan deklarasi variabel dengan tipe data String dengan nama array daftarNama. double totaltinggiBdn = 0, ratatinggiBdn = 0; yang merupakan deklarasi variabel dengan tipe data double dengan variabel totaltinggiBdn dan ratatinggiBdn. for(a = 0; a < dataMhs.length; a++){ merupakan outer loop yang merepresentasikan baris. for(b = 0; b < dataMhs[1].length; b++){ sebagai outer loop yang merepresentasikan kolom.if(dataMhs[a][1] < minberatBdn){ yaitu jika elemen array pada kolom ke 1 merupakan angka yang terkecil maka akan ditampilkan. System.out.print("Berat badan terendah diantara kelima mahasiswa tersebut adalah " + minberatBdn +" kg"); untuk menampilkan output beran badan terendah di antara kelima mahasiswa. Kemudian terdapat perulangan for dengan dua perulangan yaitu for(a = 0; a < dataMhs.length; a++){ dan for(b = 0; b < dataMhs[0].length; b++){.if(b == 2) digunakan untuk menyatakan jika kondisi berada pada indeks ke 2. totaltinggiBdn += dataMhs[a][b]; untuk menghitung total tinggi badan kelima mahasiswa tersebut. Selanjutnya ratatinggiBdn = totaltinggiBdn / dataMhs.length; dan System.out.print('\n'+ "Rata-rata tinggi badan dari kelima mahasiswa tersebut adalah " + ratatinggiBdn +" cm"); digunakan untuk menghitung rata-rata tinggi badan dengan cara total tinggi badan dibagi panjang data mahasiswa. Kemudian ditampilkan output rata-rata tinggi badan dari kelima mahasiswa tersebut. Kemudian terdapat perulangan for dengan 2 perulangan yaitu for(a = 0; a < dataMhs.length; a++){ dan for(b = 0; b < dataMhs[0].length; b++){.if(dataMhs[a][0] > umurTertua){
umurTertua = dataMhs[a][0]; jika nilai suatu elemen lebih besar dari nilai dalam variabel umurTertua maka elemen tersebut diinput ke dalam variabel umurTertua. Kemudian indeks = a; untuk memasukkan indeks baris yang elemennya masuk dalam variabel umurTertua ke variabel indeks. Kemudian akan terdapat output nama mahasiswa dengan umur tertua beserta umurnya.*
