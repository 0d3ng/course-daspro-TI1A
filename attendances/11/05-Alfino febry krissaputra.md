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
int[][] nilai = new int [2][3];

```

2. Isi masing-masing elemen array **nilai** sebagai berikut:
![Gambar 2](images/percobaan1-2.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2

nilai[0][1] = 90;
nilai[0][2] = 88;
nilai[1][0] = 79;
nilai[1][1] = 92;
nilai[1][2] = 67;
nilai[0][0] = 75;
```




    75



3. Tampilkan semua isi elemen array **nilai**
![Gambar 3](images/percobaan1-3.PNG)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
```

    75 90 88
    79 92 67


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

// Tuliskan jawaban nomor 1
Tidak harus berurutan karena kita memasukan nilai (assign) ke dalam alamat tertentu (indeks tertentu) bukan dari urutan assignmennya. jadi pengisian elemen array tidak perlu dilakukan secara berurutan asalkan indeks yang dituliskan benar dan tipe datanya sesuai.

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i < nilai.length; i++){
    for(int j = 0; j < nilai[0].length; j++){
        System.out.print(nilai[i][j] + " ");
    }
    System.out.println("");
}
```

    75 90 88 
    79 92 67 


#### penjelasan
perulangan pertama digunakan untuk mengganti baris, for kedua digunakan untuk mengganti kolom.

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
int[][] rating = new int[4][2];;

```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**
![Gambar 6](images/percobaan2-3.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 3
for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukan rating pengguna" +i+ " untuk restoran " +j+ " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukan rating pengguna0 untuk restoran 0 : 7
    Masukan rating pengguna0 untuk restoran 1 : 9
    
    Masukan rating pengguna1 untuk restoran 0 : 4
    Masukan rating pengguna1 untuk restoran 1 : 7
    
    Masukan rating pengguna2 untuk restoran 0 : 6
    Masukan rating pengguna2 untuk restoran 1 : 8
    
    Masukan rating pengguna3 untuk restoran 0 : 9
    Masukan rating pengguna3 untuk restoran 1 : 8
    


4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg : rating){
    for(int r : rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    7 9 
    4 7 
    6 8 
    9 8 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
for(int j = 0; j < rating.length; j++){
    for(int i = 0; i < rating[0].length; i++){
        System.out.print("Masukan rating pengguna" +j+ " untuk restoran " +i+ " : ");
        rating[j][i] = sc.nextInt();
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

    Masukan rating pengguna0 untuk restoran 0 : 6
    Masukan rating pengguna0 untuk restoran 1 : 7
    Masukan rating pengguna0 untuk restoran 2 : 8
    
    Masukan rating pengguna1 untuk restoran 0 : 4
    Masukan rating pengguna1 untuk restoran 1 : 8
    Masukan rating pengguna1 untuk restoran 2 : 9
    
    Masukan rating pengguna2 untuk restoran 0 : 9
    Masukan rating pengguna2 untuk restoran 1 : 4
    Masukan rating pengguna2 untuk restoran 2 : 7
    
    Masukan rating pengguna3 untuk restoran 0 : 7
    Masukan rating pengguna3 untuk restoran 1 : 8
    Masukan rating pengguna3 untuk restoran 2 : 5
    
    6 7 8 
    4 8 9 
    9 4 7 
    7 8 5 


// Tuliskan jawaban nomor 1
jik i dan j ditukar tidak akan ada masalah jika keseluruhanya disesuaikan, karena j dan i sifatnya hanya sebagai pembantu, yang menyesuaikan program for, jadi nama variabelnya tidak berpengaruh apapun. namun lain halnya jika hanya sebagian yang ditukar posisinya
misalnya hanya pada program rating[j][i] = sc.nextInt(); saya yang posisi i dan j nya ditukar, akan terjadi eror karena ukuran arraynya tidak sesuai.
jadi jika keseluruhan i dan j ditukar tidak akan ada masalah dalam program, namun jika hanya sebagian i dan j yang ditukar program akan eror karena variabel tidak sesuai.

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int baris, kolom;

System.out.print("Masukan jumlah baris: ");
baris = sc.nextInt();
System.out.print("Masukan jumlah kolom: ");
kolom = sc.nextInt();

int[][] rating = new int[baris][kolom];

for(int i = 0; i < rating.length; i++){
    for(int j = 0; j < rating[0].length; j++){
        System.out.print("Masukan rating pengguna" +i+ " untuk restoran " +j+ " : ");
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

    Masukan jumlah baris: 4
    Masukan jumlah kolom: 3
    Masukan rating pengguna0 untuk restoran 0 : 7
    Masukan rating pengguna0 untuk restoran 1 : 9
    Masukan rating pengguna0 untuk restoran 2 : 5
    
    Masukan rating pengguna1 untuk restoran 0 : 4
    Masukan rating pengguna1 untuk restoran 1 : 6
    Masukan rating pengguna1 untuk restoran 2 : 7
    
    Masukan rating pengguna2 untuk restoran 0 : 10
    Masukan rating pengguna2 untuk restoran 1 : 4
    Masukan rating pengguna2 untuk restoran 2 : 7
    
    Masukan rating pengguna3 untuk restoran 0 : 3
    Masukan rating pengguna3 untuk restoran 1 : 8
    Masukan rating pengguna3 untuk restoran 2 : 9
    
    7 9 5 
    4 6 7 
    10 4 7 
    3 8 9 


#### penjelasan
dengan membuat 2 variabel untuk mewakili baris dan kolom, lalu mengeluarkan perintah input untuk mengisi variabel tersebut. kemusian variabel tersebut digunakan untuk instansiasi array. sehingga instansiasinya demikian
int[][] rating = new int[baris][kolom];

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
    for (int j = 0; j < harga[0].length; j++){
        System.out.printf("Masukan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga Baham ke-%d adalah %.2f\n", i, rata);
}
```

    Masukan harga[0][0]: 1500
    Masukan harga[0][1]: 4000
    Masukan harga[0][2]: 5000
    Masukan harga[0][3]: 9000
    Masukan harga[0][4]: 12000
    Masukan harga[0][5]: 7500
    Rata-rata harga Baham ke-0 adalah 6500.00
    Masukan harga[1][0]: 45000
    Masukan harga[1][1]: 76000
    Masukan harga[1][2]: 34000
    Masukan harga[1][3]: 25000
    Masukan harga[1][4]: 48000
    Masukan harga[1][5]: 21000
    Rata-rata harga Baham ke-1 adalah 41500.00
    Masukan harga[2][0]: 100000
    Masukan harga[2][1]: 121000
    Masukan harga[2][2]: 97000
    Masukan harga[2][3]: 88000
    Masukan harga[2][4]: 120000
    Masukan harga[2][5]: 79000
    Rata-rata harga Baham ke-2 adalah 100833.33


#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

// Tuliskan jawaban nomor 1
harga[0].length digunakan untuk mendapatkan panjang array. jadi fungsi dari rata = total / harga[0].length adalah untuk meng assign hasil pembagian dari variabel total dengan panjang array harga ke dalam variabel rata.

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?

// Tuliskan jawaban nomor 2
karena dalam perulangan2 yang didalam perulangan1, nilai dari variabel total dan rata terus ditambah, sedangkan tujuan perulangan1 adalah untuk mendapat nilai rata dan total setiap selesai prulangan2. jadi inisiasi nilai variabel total dan rata dilakukan dalam perulangan agar variabel tersebut 0 setiap perulangan. jika tikat nilai dari variabel total dan rata akan terus berubah setiap perulangan.

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
int x, y;

for(x = 0; x < suhu.length; x++){
    for(y = 0; y < suhu[0].length; y++){
        System.out.printf("Masukan suhu kota %d hari ke %d: ", x, y);
        suhu[x][y] = sc.nextDouble();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
}
System.out.println("Suhu tertinggi adalah: " +max);

```

    Masukan suhu kota 0 hari ke 0: 12
    Masukan suhu kota 0 hari ke 1: 13
    Masukan suhu kota 0 hari ke 2: 14
    Masukan suhu kota 0 hari ke 3: 15
    Masukan suhu kota 0 hari ke 4: 16
    Masukan suhu kota 0 hari ke 5: 17
    Masukan suhu kota 0 hari ke 6: 18
    Masukan suhu kota 1 hari ke 0: 19
    Masukan suhu kota 1 hari ke 1: 20
    Masukan suhu kota 1 hari ke 2: 21
    Masukan suhu kota 1 hari ke 3: 22
    Masukan suhu kota 1 hari ke 4: 23
    Masukan suhu kota 1 hari ke 5: 24
    Masukan suhu kota 1 hari ke 6: 25
    Masukan suhu kota 2 hari ke 0: 24
    Masukan suhu kota 2 hari ke 1: 23
    Masukan suhu kota 2 hari ke 2: 22
    Masukan suhu kota 2 hari ke 3: 21
    Masukan suhu kota 2 hari ke 4: 20
    Masukan suhu kota 2 hari ke 5: 19
    Masukan suhu kota 2 hari ke 6: 18
    Masukan suhu kota 3 hari ke 0: 17
    Masukan suhu kota 3 hari ke 1: 16
    Masukan suhu kota 3 hari ke 2: 15
    Masukan suhu kota 3 hari ke 3: 14
    Masukan suhu kota 3 hari ke 4: 13
    Masukan suhu kota 3 hari ke 5: 18
    Masukan suhu kota 3 hari ke 6: 20
    Masukan suhu kota 4 hari ke 0: 12
    Masukan suhu kota 4 hari ke 1: 13
    Masukan suhu kota 4 hari ke 2: 14
    Masukan suhu kota 4 hari ke 3: 14
    Masukan suhu kota 4 hari ke 4: 15
    Masukan suhu kota 4 hari ke 5: 16
    Masukan suhu kota 4 hari ke 6: 20
    Suhu tertinggi adalah: 25.0


#### penjelasan
mengimport Scanner lalu mendeklarasikanya.
menginstansiasi array dan membuat variabel.
menggunakan for loop untuk mengisi nilai array.
didalam perulangan kedua menggunakan if untuk menentukan nilai tertinggi.
print nilai tertinggi.


##### 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int[][] data = {
            {19, 51, 155},
            {18, 55, 163},
            {18, 45, 153},
            {20, 46, 158},
            {19, 58, 160},
};
String[] nama = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int tua, tertua, total, berat = 150;
double rata;

for(int baris = 0; baris < data.length; baris++){
    for(int kolom = 0; kolom < data[0].length; kolom++){
        if(kolom == 0 && data[baris][kolom] > tua){
            tua = data[baris][kolom];
            tertua = baris;
        }if(kolom == 1 && data[baris][kolom] < berat){
            berat = data[baris][kolom];
        }else if(kolom == 2){
            total += data[baris][kolom];
        }
    }
}
rata = total / data.length;
System.out.printf("Berat Badan terendah dari kelima mahasiswa tersebut adalah %d kg\n", berat);
System.out.println("rata-rata tinggi badan kelima mahasiswa tersebut adalah " + rata);
System.out.println("Mahasiswa dengan umur tertua adalah " + nama[tertua]);
```

    Berat Badan terendah dari kelima mahasiswa tersebut adalah 45 kg
    rata-rata tinggi badan kelima mahasiswa tersebut adalah 157.0
    Mahasiswa dengan umur tertua adalah Beky


#### penjelasan
import dan deklarasi scanner.
buat variabel dan inisiasi array.
menggunakan perulangan for untuk berganti baris, didalamnya for kedua untuk berganti kolom,
didalam perulangan kedua terdapat if else if untuk menentukan:
1. pada kolom pertama (kolom 0) jika nilai elemen lebih besar dari nilai variabel tua, nilai elemen tersebut di assign ke variabel tua dan barisnya dicatat ke dalam tertua.
2. pada kolom kedua (kolom 1) jika nilai elemen kurang dari nilai berat, maka nilai elemen akan di assign ke dalam variabel berat. sehingga nilai berat terendah didapatkan.
3. pada kolom ketika (kolom 2) nilai elemen ditambahkan ke variabel total.
setelah selesai loop hirung rata-rata tinggi badan dengan cara total dibagi panjang baris array data.
lalu print berat, rata-rata dan array nama indeks ke 'tertua' (nama[tertua]).
