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
nilai[1][1] = 67;
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
    79 67 0


#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!


```Java
// Tuliskan jawaban nomor 1
tidak harus, yang penting harus jelas dalam pengisiannya 
```

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
// Tuliskan jawaban nomor 2
for(int i = 0; i < nilai.length; i++) {
    for(int j = 0; j < nilai[0].length; j++) {
        System.out.printf("nilai[%d][%d] = %d\n", i, j, nilai[i][j]);
    }   
}
```

    nilai[0][0] = 75
    nilai[0][1] = 90
    nilai[0][2] = 88
    nilai[1][0] = 79
    nilai[1][1] = 67
    nilai[1][2] = 0


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
for(int i = 0; i<rating.length; i++){
    for(int j = 0; j<rating[0].length; j++){
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    System.out.println("");
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 43
    Masukkan rating pengguna 0 untuk restoran 1 : 53
    
    Masukkan rating pengguna 1 untuk restoran 0 : 32
    Masukkan rating pengguna 1 untuk restoran 1 : 32
    
    Masukkan rating pengguna 2 untuk restoran 0 : 43
    Masukkan rating pengguna 2 untuk restoran 1 : 32
    
    Masukkan rating pengguna 3 untuk restoran 0 : 43
    Masukkan rating pengguna 3 untuk restoran 1 : 32
    


### 4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**
![Gambar 7](images/percobaan2-4.PNG)


```Java
// Tuliskan kode program Percobaan 2 Langkah 4
for(int[] rtg : rating){
    for(int r: rtg){
        System.out.print(r + " ");
    }
    System.out.println("");
}
```

    43 53 
    32 32 
    43 32 
    43 32 


#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
// Tuliskan jawaban nomor 1
Tidak bisa karena jika ditukar posisi i dan j maka kolom dan baris akan tertukar juga dan terjadi eror.
```

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

System.out.print("Masukkan jumlah pengguna: ");
int jPengguna= sc.nextInt();
System.out.print("Masukkan jumlah restoran: ");
int jRestor= sc.nextInt();

int[][] rating = new int[jPengguna][jRestor];

for(int i = 0; i < rating.length; i++) {
    for(int j = 0; j < rating[0].length; j++) {
        System.out.print("Masukkan rating pengguna " + i + " untuk restoran " + j + " : ");
        rating[i][j] = sc.nextInt();
    }
    
    System.out.println("");
}
```

    Masukkan jumlah pengguna: 5
    Masukkan jumlah restoran: 4
    Masukkan rating pengguna 0 untuk restoran 0 : 3
    Masukkan rating pengguna 0 untuk restoran 1 : 5
    Masukkan rating pengguna 0 untuk restoran 2 : 4
    Masukkan rating pengguna 0 untuk restoran 3 : 3
    
    Masukkan rating pengguna 1 untuk restoran 0 : 4
    Masukkan rating pengguna 1 untuk restoran 1 : 3
    Masukkan rating pengguna 1 untuk restoran 2 : 2
    Masukkan rating pengguna 1 untuk restoran 3 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 2
    Masukkan rating pengguna 2 untuk restoran 1 : 4
    Masukkan rating pengguna 2 untuk restoran 2 : 3
    Masukkan rating pengguna 2 untuk restoran 3 : 5
    
    Masukkan rating pengguna 3 untuk restoran 0 : 3
    Masukkan rating pengguna 3 untuk restoran 1 : 3
    Masukkan rating pengguna 3 untuk restoran 2 : 2
    Masukkan rating pengguna 3 untuk restoran 3 : 4
    
    Masukkan rating pengguna 4 untuk restoran 0 : 5
    Masukkan rating pengguna 4 untuk restoran 1 : 2
    Masukkan rating pengguna 4 untuk restoran 2 : 4
    Masukkan rating pengguna 4 untuk restoran 3 : 3
    


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
for(int i = 0; i<harga.length; i++){
    total = 0;
    rata = 0;
    for(int j = 0; j<harga[0].length; j++){
        System.out.printf("Masukkan harga[%d][%d]: ", i, j);
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
    }
    rata = total / harga[0].length;
    System.out.printf("Rata-rata harga bahan ke-%d adalah %.2f\n", i, rata);
}
```

    Masukkan harga[0][0]: 5000
    Masukkan harga[0][1]: 6000
    Masukkan harga[0][2]: 5000
    Masukkan harga[0][3]: 4000
    Masukkan harga[0][4]: 3000
    Masukkan harga[0][5]: 3500
    Rata-rata harga bahan ke-0 adalah 4416.67
    Masukkan harga[1][0]: 543
    Masukkan harga[1][1]: 43242
    Masukkan harga[1][2]: 432
    Masukkan harga[1][3]: 43242
    Masukkan harga[1][4]: 432
    Masukkan harga[1][5]: 5436
    Rata-rata harga bahan ke-1 adalah 15554.50
    Masukkan harga[2][0]: 654
    Masukkan harga[2][1]: 874
    Masukkan harga[2][2]: 7464
    Masukkan harga[2][3]: 87686
    Masukkan harga[2][4]: 5345
    Masukkan harga[2][5]: 65464
    Rata-rata harga bahan ke-2 adalah 27914.50


##### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!


```Java
// Tuliskan jawaban nomor 1
rata = total / harga[0].length maksudnya adalah cara mencari rata yaitu  rata sama dengan dibagi panjangnya kolom dari harga
```

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
// Tuliskan jawaban nomor 2
karena apabila diletakkan di luar perulangan for akan terjadi eror, eror tersebut dikarenakan kedua vaariabel belum dideklarasikan.
```

## Tugas

1. Perhatikan flowchart berikut.
![Gambar 12](images/tugas-1.jpg)
Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
double[][] suhu = new double[7][5];

int x, y;
double max = 0;
for(x = 0; x < suhu.length; x++){
    for(y = 0; y < suhu[0].length; y++){
        System.out.print("Masukkan celcius Ke-" + (x + 1) + " untuk daerah Ke-" + (y + 1) + " (Celcius): ");
        suhu[x][y]= input.nextDouble();
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
}
System.out.println("========================");
System.out.print("celcius tertinggi adalah: " + max + "°C")
```

    Masukkan celcius Ke-1 untuk daerah Ke-1 (Celcius): 65
    Masukkan celcius Ke-1 untuk daerah Ke-2 (Celcius): 53
    Masukkan celcius Ke-1 untuk daerah Ke-3 (Celcius): 64
    Masukkan celcius Ke-1 untuk daerah Ke-4 (Celcius): 32
    Masukkan celcius Ke-1 untuk daerah Ke-5 (Celcius): 423
    Masukkan celcius Ke-2 untuk daerah Ke-1 (Celcius): 56
    Masukkan celcius Ke-2 untuk daerah Ke-2 (Celcius): 43
    Masukkan celcius Ke-2 untuk daerah Ke-3 (Celcius): 54
    Masukkan celcius Ke-2 untuk daerah Ke-4 (Celcius): 54
    Masukkan celcius Ke-2 untuk daerah Ke-5 (Celcius): 54
    Masukkan celcius Ke-3 untuk daerah Ke-1 (Celcius): 5
    Masukkan celcius Ke-3 untuk daerah Ke-2 (Celcius): 64
    Masukkan celcius Ke-3 untuk daerah Ke-3 (Celcius): 7
    Masukkan celcius Ke-3 untuk daerah Ke-4 (Celcius): 87
    Masukkan celcius Ke-3 untuk daerah Ke-5 (Celcius): 9
    Masukkan celcius Ke-4 untuk daerah Ke-1 (Celcius): 67
    Masukkan celcius Ke-4 untuk daerah Ke-2 (Celcius): 65
    Masukkan celcius Ke-4 untuk daerah Ke-3 (Celcius): 453
    Masukkan celcius Ke-4 untuk daerah Ke-4 (Celcius): 6
    Masukkan celcius Ke-4 untuk daerah Ke-5 (Celcius): 75
    Masukkan celcius Ke-5 untuk daerah Ke-1 (Celcius): 54
    Masukkan celcius Ke-5 untuk daerah Ke-2 (Celcius): 75
    Masukkan celcius Ke-5 untuk daerah Ke-3 (Celcius): 53
    Masukkan celcius Ke-5 untuk daerah Ke-4 (Celcius): 65
    Masukkan celcius Ke-5 untuk daerah Ke-5 (Celcius): 86
    Masukkan celcius Ke-6 untuk daerah Ke-1 (Celcius): 87
    Masukkan celcius Ke-6 untuk daerah Ke-2 (Celcius): 53
    Masukkan celcius Ke-6 untuk daerah Ke-3 (Celcius): 75
    Masukkan celcius Ke-6 untuk daerah Ke-4 (Celcius): 43
    Masukkan celcius Ke-6 untuk daerah Ke-5 (Celcius): 75
    Masukkan celcius Ke-7 untuk daerah Ke-1 (Celcius): 42
    Masukkan celcius Ke-7 untuk daerah Ke-2 (Celcius): 64
    Masukkan celcius Ke-7 untuk daerah Ke-3 (Celcius): 75
    Masukkan celcius Ke-7 untuk daerah Ke-4 (Celcius): 43
    Masukkan celcius Ke-7 untuk daerah Ke-5 (Celcius): 5
    ========================
    celcius tertinggi adalah: 453.0°C

###### 2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.
![Gambar 13](images/tugas-2.PNG)
*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner sc= new Scanner(System.in);

int angka[][] = {
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {19, 58, 160},
};

int bbTerendah = 0;
int ttlTinggi = 0;
int idksMhsTertua = 0;
int umrTertua = 0;

for(int x = 0; x < angka.length; x++) {
    if(angka[x][0] > umrTertua) {
        idksMhsTertua = x;
        umrTertua = angka[x][0];
    }
    
    if(angka[x][1] < bbTerendah) {
        bbTerendah = angka[x][1];
    }
    
    ttlTinggi += angka[x][2];
}

String nmTertua = switch(idksMhsTertua) {
    case 0 -> "Desi";
    case 1 -> "Rofan";
    case 2 -> "Lala";
    case 3 -> "Beky";
    case 4 -> "Ega";
    default -> "Tidak dikenal";
};

System.out.println("Berat badan terendah: " + bbTerendah);
System.out.println("Rata rata tinggi: " + ttlTinggi / angka.length);
System.out.println("Mahasiswa tertua: " + nmTertua);
```

    Berat badan terendah: 0
    Rata rata tinggi: 157
    Mahasiswa tertua: Beky



```Java

```
