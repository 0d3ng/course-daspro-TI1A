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
int[][] nilai = new int[2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
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
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 82 67


> Penjelasan Percobaan 1 : Kode program di atas menggunakan array 2 dimensi lalu memberi nilai pada masing-masing indeks, kemudian menge-print isi dari semua elemen array.

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

> Tidak harus, karena pengisian elemen array bisa dilakukan di indeks mana saja. Hanya saja pada indeks array yang tidak diisi, tidak akan ada datanya atau null.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
for(int i = 0; i < nilai.length; i++){
    for(int j = 0; j < nilai[0].length; j++){
        System.out.print(nilai[i][j] + " ");
    }
    System.out.println();
}
```

    75 90 88 
    79 82 67 


> Penjelasan : Kode program di atas menggunakan perulangan bersarang for untuk menampilkan semua isi elemen array. Pada inner loop, akan mengulang isi dari satu baris. Kemudian pada outer loopnya, perulangan akan dilakukan untuk beralih ke baris selanjutnya.

### Percobaan 2: Mengisi Elemen Array 2 Dimensi Menggunakan Input Keyboard
Pada Percobaan 2, kode program yang dibuat digunakan untuk menyimpan nilai rating restoran yang terdaftar pada aplikasi pemesanan makanan online. Rating diberikan oleh 4 orang pengguna kepada 2 restoran yang terdaftar.
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 4](images/percobaan2-1.jpg)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **rating** dengan kapasitas baris 4 elemen (menyatakan jumlah pengguna) dan kolom 2 elemen (menyatakan jumlah restoran)
![Gambar 5](images/percobaan2-2.PNG)


```Java
int[][] rating = new int[4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    
    Masukkan rating pengguna 1 untuk restoran 0 : 4
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 4
    Masukkan rating pengguna 2 untuk restoran 1 : 5
    
    Masukkan rating pengguna 3 untuk restoran 0 : 4
    Masukkan rating pengguna 3 untuk restoran 1 : 3
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
for(int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    3 4 
    4 4 
    4 5 
    4 3 


> Penjelasan Percobaan 2 : Kode program di atas menggunakan array 2 dimensi dan perulangan for untuk memberikan rating 2 restoran dari 4 pengguna. Kemudian, digunakan for each loop untuk menampilkan isi elemen array bisa tampil per baris dan kolom.

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
for(int j = 0; j < rating.length; j++){
    for(int i = 0; i < rating[0].length; i++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 0 : 4
    
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 0 untuk restoran 2 : 5



    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#27:4)


> Tidak bisa, akan terjadi error. Karena indeks kolom hanya berkapasitas 2, sedangkan perulangannya dilakukan sampai 4 kali. Akan tetapi, pada saat perualangan yang ke-3, program akan error.

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int pembeli, restoran;

System.out.print("Masukkan jumlah pembeli : ");
pembeli = sc.nextInt();
System.out.print("Masukkan jumlah restoran : ");
restoran = sc.nextInt();

int[][] rating = new int[pembeli][restoran];

for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
for(int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    Masukkan jumlah pembeli : 3
    Masukkan jumlah restoran : 2
    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 0 untuk restoran 1 : 4
    
    Masukkan rating pengguna 1 untuk restoran 0 : 5
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 4
    Masukkan rating pengguna 2 untuk restoran 1 : 4
    
    3 4 
    5 4 
    4 4 


> Penjelasan : Kode program di atas mirip dengan kode program pada percobaan 2. Namun, panjang elemen array tidak ditentukan di awal. Program akan meminta user menginputkan panjang elemen baris (jumlah pembeli) dan panjang elemen kolom (jumlah restoran). Lalu, disimpan pada variabel "pembeli" dan "restoran". Kemudian, pada saat instansiasi array, variabel tersebut akan diletakkan di dalam kurung siku yang nantinya sebagai panjang elemen baris dan kolom.

### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.
![Gambar 8](images/percobaan3.jpg)
1. Import dan deklarasikan Scanner dengan nama **sc**
![Gambar 9](images/percobaan3-1.jpg)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2.	Buat array bertipe **integer** dengan nama **harga** dengan kapasitas baris 3 elemen (menyatakan jumlah bahan pokok) dan kolom 6 elemen (menyatakan jumlah bulan). Deklarasikan juga variabel **total** dan **rata** bertipe **double**
![Gambar 10](images/percobaan3-2.PNG)


```Java
int[][] harga = new int[3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan
![Gambar 11](images/percobaan3-3.PNG)


```Java
for(int i = 0; i < harga.length; i++){
    total = 0;
    rata = 0;
    for(int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 3000
    Masukkan harga[0][1]: 5000
    Masukkan harga[0][2]: 10000
    Masukkan harga[0][3]: 12000
    Masukkan harga[0][4]: 15000
    Masukkan harga[0][5]: 20000
    Rata-rata harga bahan ke-0 adalah 10833.33
    Masukkan harga[1][0]: 20000
    Masukkan harga[1][1]: 22000
    Masukkan harga[1][2]: 24000
    Masukkan harga[1][3]: 26000
    Masukkan harga[1][4]: 28000
    Masukkan harga[1][5]: 30000
    Rata-rata harga bahan ke-1 adalah 25000.00
    Masukkan harga[2][0]: 10000
    Masukkan harga[2][1]: 12000
    Masukkan harga[2][2]: 8000
    Masukkan harga[2][3]: 10000
    Masukkan harga[2][4]: 10000
    Masukkan harga[2][5]: 12000
    Rata-rata harga bahan ke-2 adalah 10333.33


> Penjelasan Percobaan 3 : Kode program di atas menggunakan array 2 dimensi yang memilki baris berkapasitas 3 yang menunjukkan banyaknya bahan pokok dan kolom berkapasitas 6 yang menunjukkan banyaknya bulan (1 semester). Kemudian, menggunakan perulangan for untuk meminta inputan user. Terakhir, dihitung rata-rata harga bahan pokok dengan membagi total harga dengan panjang baris kolom (6) dan diprint-kan hasil perhitungan rata-ratanya.

#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

> Fungsinya adalah untuk menghitung rata-rata harga pokok tiap semester, yaitu dengan cara membagi total harga dengan banyaknya harga barang yang diinputkan. Total didapatkan dari penjumlahan semua harga yang diinputkan user, sedangkan harga[0].length adalah panjang elemen kolom, yaitu 6.

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

> Karena perhitungan total harga total dan rata-rata harga bahan pokok berbeda-beda, tidak dijumlahkan semua. Apabila inisialisasi tersebut dilakukan di luar perulangan, maka perhitungan total harga barang pokok akan dijumlah semua, tidak satu-satu sesuai bahan pokoknya. Begitu juga terjadi dengan perhitungan rata-rata harga pokok.

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double suhu[][] = new double[5][7];

for(int x = 0; x < suhu.length; x++){
    double max = 0;
    for(int y = 0; y < suhu[0].length; y++){
        System.out.print("Suhu kota ke-" + (x+1) + " pada hari ke-" + (y+1) + " adalah ");
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }    
    }
    System.out.println("Suhu tertinggi di kota ke-" + (x+1) + " selama " + suhu[0].length + " hari adalah " + max);
    System.out.println();
}
```

    Suhu kota ke-1 pada hari ke-1 adalah 30
    Suhu kota ke-1 pada hari ke-2 adalah 31
    Suhu kota ke-1 pada hari ke-3 adalah 33
    Suhu kota ke-1 pada hari ke-4 adalah 32
    Suhu kota ke-1 pada hari ke-5 adalah 31
    Suhu kota ke-1 pada hari ke-6 adalah 34
    Suhu kota ke-1 pada hari ke-7 adalah 33
    Suhu tertinggi di kota ke-1 selama 7 hari adalah 34.0
    
    Suhu kota ke-2 pada hari ke-1 adalah 21
    Suhu kota ke-2 pada hari ke-2 adalah 24
    Suhu kota ke-2 pada hari ke-3 adalah 23
    Suhu kota ke-2 pada hari ke-4 adalah 21
    Suhu kota ke-2 pada hari ke-5 adalah 20
    Suhu kota ke-2 pada hari ke-6 adalah 19
    Suhu kota ke-2 pada hari ke-7 adalah 20
    Suhu tertinggi di kota ke-2 selama 7 hari adalah 24.0
    
    Suhu kota ke-3 pada hari ke-1 adalah 27
    Suhu kota ke-3 pada hari ke-2 adalah 26
    Suhu kota ke-3 pada hari ke-3 adalah 29
    Suhu kota ke-3 pada hari ke-4 adalah 29
    Suhu kota ke-3 pada hari ke-5 adalah 28
    Suhu kota ke-3 pada hari ke-6 adalah 30
    Suhu kota ke-3 pada hari ke-7 adalah 26
    Suhu tertinggi di kota ke-3 selama 7 hari adalah 30.0
    
    Suhu kota ke-4 pada hari ke-1 adalah 18
    Suhu kota ke-4 pada hari ke-2 adalah 17
    Suhu kota ke-4 pada hari ke-3 adalah 18
    Suhu kota ke-4 pada hari ke-4 adalah 16
    Suhu kota ke-4 pada hari ke-5 adalah 16
    Suhu kota ke-4 pada hari ke-6 adalah 15
    Suhu kota ke-4 pada hari ke-7 adalah 17
    Suhu tertinggi di kota ke-4 selama 7 hari adalah 18.0
    
    Suhu kota ke-5 pada hari ke-1 adalah 26
    Suhu kota ke-5 pada hari ke-2 adalah 25
    Suhu kota ke-5 pada hari ke-3 adalah 24
    Suhu kota ke-5 pada hari ke-4 adalah 25
    Suhu kota ke-5 pada hari ke-5 adalah 27
    Suhu kota ke-5 pada hari ke-6 adalah 23
    Suhu kota ke-5 pada hari ke-7 adalah 27
    Suhu tertinggi di kota ke-5 selama 7 hari adalah 27.0
    


> Penjelasan Tugas 1 : Kode program di atas menggunakan array 2 dimensi, lalu menggunakan perulangan untuk meminta inputan suhu dari user. Deklarasi variabel max dilakukan di dalam outer loop tetapi sebelum inner loop. Hal ini bertujuan agar variabel max atau suhu tertinggi di setiap kota berbeda, atau dengan kata lain di-reset kembali nilai variabelnya. Kemudian, jika ada nilai dalam array yang nilainya lebih besar dari 0 (nilai dalam variabel max), maka nilai dari variabel tersebut akan diganti oleh nilai pada array tersebut. Terakhir, program akan menge-print variabel max tersebut sesuai masing-masing array (kota).

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
int data[][] = {{19, 51, 155}, {18, 55, 163}, {18, 45, 153}, {20, 46, 158}, {19, 58, 160}};

for(int i = 0; i < data.length; i++){
    int temp = 0;
    for(int j = 1; j < (data.length-i); j++){
        if(data[j-1][1] > data[j][1]){
            temp = data[j-1][1];
            data[j-1][1] = data[j][1];
            data[j][1] = temp;
        }
    }
}

int totalTinggi = 0;
double rata = 0;
for(int i = 0; i < data.length; i++){
        totalTinggi += data[i][2];
    }
rata = (double)totalTinggi / data.length;

String nama[] = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int max = 0;
int temp = 0;

for(int i = 0; i < data.length; i++){
    if(data[i][0] > max){
        max = data[i][0];
        temp = i;
    }    
}
System.out.println("Berat badan terendah di antara kelima mahasiswa tersebut adalah " + data[0][1]);
System.out.println("Rata-rata tinggi badan kelima mahasiswa tersebut adalah " + rata);
System.out.println("Mahasiswa dengan umur tertua adalah " + nama[temp]);
```

    Berat badan terendah di antara kelima mahasiswa tersebut adalah 45
    Rata-rata tinggi badan kelima mahasiswa tersebut adalah 157.8
    Mahasiswa dengan umur tertua adalah Beky


> Penjelasan Tugas 2 : Untuk mencari berat terendah, kita menggunakan metode bubble sort, yaitu dengan dilakukan perulangan dari elemen pertama sampai elemen terakhir dari array. Kemudian, tiap elemen dibandingkan dengan elemen berikutnya. Jika elemen tersebut lebih besar dari elemen berikutnya, maka posisinya akan ditukar. Lalu, untuk menampilkan berat terendahnya, kita akan menge-print elemen ke 0 dari hasil bubble sort tersebut. Untuk mencari rata-rata tinggi badan, kita akan menjumlahkan semua nilai pada kolom tinggi (kolom ke 2), lalu hasil tadi dibagi dengan panjang dari baris array atau banyaknya mahasiswa. Dilakukan widening ke double agar hasil rata-rata muncul dalam bentuk desimal. Untuk mencari nama mahasiswa yang memiliki umur tertua, dilakukan inisialisasi dan instansiasi array string berisi nama dari kelima mahasiswa. Lalu, dilakukan perulangan untuk mengecek nilai dari masing-masing elemen. Kemudian, jika ada nilai dalam array yang nilainya lebih besar dari 0 (nilai dalam variabel max), maka nilai dari variabel tersebut akan diganti oleh nilai pada array tersebut. Terakhir, program akan menge-print berat terendah, rata-rata tinggi, dan nama mahasiswa dengan umur tertua.
