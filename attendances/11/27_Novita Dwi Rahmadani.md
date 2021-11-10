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
int[][] nilai = new int [2][3]
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
tidak selalu pengisian elemen secara berurutan dari indeks 0, boleh juga memulai pengisiannya dari indeks 1 atau 2 namun nanti indeks ke 0 tetap di isi
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for (int baris = 0; baris < nilai.length; baris++){ //baris=0 untuk menyatakan jumlah mahasiswa dan nilai.length digunakan untuk menyatakan panjang indeks baris(jumlah mahasiswa)
     for(int kolom = 0; kolom < nilai[0].length; kolom++){  // kolom=0 untuk menampilkan isi dari setiap indeks array
          System.out.print(nilai[baris][kolom] + " " );
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
// Tuliskan kode program Percobaan 2 Langkah 2\
int[][] rating = new int[4][2] //untuk deklarasi dan instansiasi
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : " );
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 2
    Masukkan rating pengguna 1 untuk restoran 1 : 3
    
    Masukkan rating pengguna 2 untuk restoran 0 : 3
    Masukkan rating pengguna 2 untuk restoran 1 : 4
    
    Masukkan rating pengguna 3 untuk restoran 0 : 5
    Masukkan rating pengguna 3 untuk restoran 1 : 6
    
    

4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for (int[] rtg : rating){
    for (int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    1 2 
    2 3 
    3 4 
    5 6 
    

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
jika variabel nya saja di tukarkan yaitu j di tukar dengan i tidak akan error,namun jika yang ditukar variabelnya dan sintaks nya maka akan error.
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int baris,kolom;
    System.out.print("Masukkan jumlah baris : ");
    baris = sc.nextInt();
    System.out.print("Masukkan jumlah kolom : ");
    kolom = sc.nextInt();
for (int i = 0; i < rating.length; i++){
    for (int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : " );
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
for (int[] rtg : rating){
    for (int r: rtg) {
        System.out.print(r + " ");
    }
    System.out.println("");
}

```

    Masukkan jumlah baris : 1
    Masukkan jumlah kolom : 2
    Masukkan rating pengguna 0 untuk restoran 0 : 5
    Masukkan rating pengguna 0 untuk restoran 1 : 6
    
    Masukkan rating pengguna 1 untuk restoran 0 : 7
    Masukkan rating pengguna 1 untuk restoran 1 : 8
    
    Masukkan rating pengguna 2 untuk restoran 0 : 9
    Masukkan rating pengguna 2 untuk restoran 1 : 10
    
    Masukkan rating pengguna 3 untuk restoran 0 : 11
    Masukkan rating pengguna 3 untuk restoran 1 : 12
    
    5 6 
    7 8 
    9 10 
    11 12 
    

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
    for(int j = 0; j < harga[0].length; j++) {
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i,rata);
}
```

    Masukkan harga[0][0]: 1000
    Masukkan harga[0][1]: 2000
    Masukkan harga[0][2]: 3000
    Masukkan harga[0][3]: 4000
    Masukkan harga[0][4]: 5000
    Masukkan harga[0][5]: 6000
    Rata-rata harga bahan ke-0 adalah 3500.00
    Masukkan harga[1][0]: 7000
    Masukkan harga[1][1]: 8000
    Masukkan harga[1][2]: 9000
    Masukkan harga[1][3]: 10000
    Masukkan harga[1][4]: 11000
    Masukkan harga[1][5]: 12000
    Rata-rata harga bahan ke-1 adalah 9500.00
    Masukkan harga[2][0]: 13000
    Masukkan harga[2][1]: 14000
    Masukkan harga[2][2]: 15000
    Masukkan harga[2][3]: 16000
    Masukkan harga[2][4]: 17000
    Masukkan harga[2][5]: 18000
    Rata-rata harga bahan ke-2 adalah 15500.00
    

#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
untuk menghitung rata-rata dari total harga dibagi dengan jumlah panjang harga
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
jika inisialisasi variabel total = 0 dan rata = 0 diletakkan di luar perulangan for maka akan terjumlahkan semua harga bahan pokok selama satu semester
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
for (int x = 0; x < suhu.length; x++) {
    double max = 0;
    for ( int y = 0; y < suhu[0].length; y++) {
        System.out.print("Suhu di kota " + (x + 1) + " pada hari ke-" + (y + 1) + " : ");
        suhu[x][y] = sc.nextDouble();
        if (suhu[x][y] > max) {
            max = suhu[x][y];
        }
    }
    System.out.println("Suhu tertinggi di kota " + (x + 1) + " selama " + suhu[0].length + " hari adalah " + max);
}
```

    Suhu di kota 1 pada hari ke-1 : 1
    Suhu di kota 1 pada hari ke-2 : 2
    Suhu di kota 1 pada hari ke-3 : 3
    Suhu di kota 1 pada hari ke-4 : 4
    Suhu di kota 1 pada hari ke-5 : 5
    Suhu di kota 1 pada hari ke-6 : 6
    Suhu di kota 1 pada hari ke-7 : 7
    Suhu tertinggi di kota 1 selama 7 hari adalah 7.0
    Suhu di kota 2 pada hari ke-1 : 8
    Suhu di kota 2 pada hari ke-2 : 9
    Suhu di kota 2 pada hari ke-3 : 10
    Suhu di kota 2 pada hari ke-4 : 11
    Suhu di kota 2 pada hari ke-5 : 12
    Suhu di kota 2 pada hari ke-6 : 13
    Suhu di kota 2 pada hari ke-7 : 14
    Suhu tertinggi di kota 2 selama 7 hari adalah 14.0
    Suhu di kota 3 pada hari ke-1 : 15
    Suhu di kota 3 pada hari ke-2 : 16
    Suhu di kota 3 pada hari ke-3 : 17
    Suhu di kota 3 pada hari ke-4 : 18
    Suhu di kota 3 pada hari ke-5 : 19
    Suhu di kota 3 pada hari ke-6 : 20
    Suhu di kota 3 pada hari ke-7 : 21
    Suhu tertinggi di kota 3 selama 7 hari adalah 21.0
    Suhu di kota 4 pada hari ke-1 : 22
    Suhu di kota 4 pada hari ke-2 : 23
    Suhu di kota 4 pada hari ke-3 : 24
    Suhu di kota 4 pada hari ke-4 : 25
    Suhu di kota 4 pada hari ke-5 : 26
    Suhu di kota 4 pada hari ke-6 : 27
    Suhu di kota 4 pada hari ke-7 : 28
    Suhu tertinggi di kota 4 selama 7 hari adalah 28.0
    Suhu di kota 5 pada hari ke-1 : 29
    Suhu di kota 5 pada hari ke-2 : 30
    Suhu di kota 5 pada hari ke-3 : 31
    Suhu di kota 5 pada hari ke-4 : 32
    Suhu di kota 5 pada hari ke-5 : 33
    Suhu di kota 5 pada hari ke-6 : 34
    Suhu di kota 5 pada hari ke-7 : 35
    Suhu tertinggi di kota 5 selama 7 hari adalah 35.0
    

pertama saya mendeklarasikan suhu dari ke 5 kota selama 7 hari,setelah itu merepresentasikan nilai x atau sbg baris dan nilai y sebagai kolom

###### 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
String nama[] = {"desi","rofan","lala","beky","ega"};
        int bil [][] = {
                {19,51,155},
                {18,55,163},
                {18,45,153},
                {20,46,158},
                {19,58,160},
        };

        double bbTerendah = 0;
        double rataTb;
        double umurMax = 0;
        String mhsTua;
        double total = 0;

        for (int x = 0; x < bil.length; x++) {
            for (int y = 0; y < bil[0].length; y++) {
                if ( y == 1 &&( bil[x][y]  < bbTerendah || bbTerendah == 0)) {
                        bbTerendah = bil[x][y];

                }else if (y == 2) {
                    total += bil[x][y];

                }else if (y == 0) {
                    if (bil[x][y] > umurMax) {
                        umurMax = bil[x][y];
                        int idx = y;
                        //mhsTua = idx;
                    }
                }
            }

        }
        rataTb = total / bil[0].length;
        System.out.println("Berat badan terendah : " + bbTerendah);
        System.out.println("Rata-rata tinggi badan : " + rataTb);
        System.out.println("Nama mahasiswa tertua : " + umurMax);

```

    Berat badan terendah : 45.0
    Rata-rata tinggi badan : 263.0
    Nama mahasiswa tertua : 20.0
    

pertama saya mendeklarasikan nama setelah itu menginisialisasi nilai bilangan dan mendeklarasikan bb terendah,rataTB,umurMax,mhsTua,dan total.
kemudian merepresentasikan baris dan kolom.untuk mencari bb terendah yaitu dengan menggunakan if dimana jika kolom samadengan 1(bb berada pada indeks ke satu) maka bbterendah samadengan bil[x][y].
setelah itu elseif y == 2 atau data tinggi berada di indeks ke 2,caranya yaitu dengan rataTb= total dibagi dengan jumlah panjang bil.dan untuk mencari umurMax nya yaitu y == 0 atau umur berada pada indeks ke nol.
kemudian memberikan system.out.print untuk menginputkan nilai dari keyboard.
