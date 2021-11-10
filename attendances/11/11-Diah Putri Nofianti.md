# JOBSHEET 11 ARRAY 2



Nama : Diah Putri Nofianti

NIM : 2141720054

Kelas : 1A D4-TI

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
int nilai[][] = new int[2][3];
```

2. Isi masing-masing elemen array **nilai** sebagai berikut:

![Gambar 2](images/percobaan1-2.PNG)


```Java
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
System.out.println(nilai[0][0]+" "+nilai[0][1]+" "+nilai[0][2]);

System.out.println(nilai[1][0]+" "+nilai[1][1]+" "+nilai[1][2]);
```

    75 90 88
    79 82 67
    

#### Pertanyaan
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks 0? Jelaskan!

*Dalam mengisi elemen tidak harus berurutan, karena jika disebutkan baris dan kolom yang diinginkan dapat langsung terisi nilainya. Yang harus dimulai dari 0 adalah awal indeks setiap array bukan urutan mengisinya.*

2. Lakukan modifikasi pada Percobaan 1 Langkah 3 untuk menampilkan semua isi elemen array **nilai** menggunakan perulangan *for*


```Java
for (int i=0;i<nilai.length;i++){
    for (int j=0; j<nilai[0].length;j++){
        
        System.out.print(nilai[i][j]+" ");
    }
    
    System.out.println();
}
```

    75 90 88 
    79 82 67 
    

*Perulangan outer digunakan untuk baris dari array, lalu perulangan inner digunakan untuk memproses kolomnya. Kemudian untuk menampilkan ke layar diisi indeks dari array nilai sesuai variabel pada perulangan untuk baris yaitu i dan variabel untuk kolomnya adalah y.*

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
int rating[][] = new int [4][2];
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **rating**

![Gambar 6](images/percobaan2-3.PNG)


```Java
for (int i=0; i<rating.length; i++){
    for (int j=0; j<rating[0].length;j++){
        
        System.out.print("Masukkan rating pengguna "+ i +" untuk restoran "+ j +" : ");
        rating [i][j] = sc.nextInt();
        
    }
    System.out.println();
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 6
    
    Masukkan rating pengguna 3 untuk restoran 0 : 7
    Masukkan rating pengguna 3 untuk restoran 1 : 8
    
    

4. Dengan menggunakan perulangan *for-each*, tampilkan semua isi elemen dari array **rating**

![Gambar 7](images/percobaan2-4.PNG)


```Java
for (int[] rtg : rating){
    for (int r : rtg){
        System.out.print(r+" ");
    }
    System.out.println();
}
```

    1 2 
    3 4 
    5 6 
    7 8 
    

#### Pertanyaan
1. Pada Percobaan 2 Langkah 3, dapatkah posisi i ditukar dengan posisi j? Jelaskan alasannya!


```Java
for (int i=0; i<rating.length; i++){
    for (int j=0; j<rating[0].length; j++){
        
        System.out.print("Masukkan rating pengguna "+ i +" untuk restoran "+ j +" : ");
        rating [j][i] = sc.nextInt();
        
    }
    System.out.println();
}
```

    Masukkan rating pengguna 0 untuk restoran 0 : 9
    Masukkan rating pengguna 0 untuk restoran 1 : 9
    
    Masukkan rating pengguna 1 untuk restoran 0 : 8
    Masukkan rating pengguna 1 untuk restoran 1 : 8
    
    Masukkan rating pengguna 2 untuk restoran 0 : 7
    


    ---------------------------------------------------------------------------

    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

    	at .(#18:5)


*Error karena jika ditukar jumlah panjang untuk indeks baris dan kolomnya itu tidak sama, jadi tidak dapat menampung nilainya karena masih kurang.*

2. Tambahkan kode program untuk menentukan banyaknya baris dan kolom elemen array secara dinamis (baris dan kolom ditentukan saat program berjalan melalui input keyboard)!


```Java
System.out.print("Tentukan jumlah baris: ");
int i = sc.nextInt();

System.out.print("Tentukan jumlah kolom: ");
int j = sc.nextInt();

int rating[][] = new int[i][j];
System.out.println();

for (int i=0; i<rating.length; i++){
    for (int j=0; j<rating[0].length;j++){
        
        System.out.print("Masukkan rating pengguna "+ i +" untuk restoran "+ j +" : ");
        rating [i][j] = sc.nextInt();
        
    }
    System.out.println();
}

for (int[] rtg : rating){
    for (int r : rtg){
        System.out.print(r+" ");
    }
    System.out.println();
}
```

    Tentukan jumlah baris: 3
    Tentukan jumlah kolom: 2
    
    Masukkan rating pengguna 0 untuk restoran 0 : 1
    Masukkan rating pengguna 0 untuk restoran 1 : 2
    
    Masukkan rating pengguna 1 untuk restoran 0 : 3
    Masukkan rating pengguna 1 untuk restoran 1 : 4
    
    Masukkan rating pengguna 2 untuk restoran 0 : 5
    Masukkan rating pengguna 2 untuk restoran 1 : 6
    
    1 2 
    3 4 
    5 6 
    

*Jadi, di awal program user akan diminta untuk menentukan jumlah baris dan kolom untuk inputan selanjutnya. Variabel yang menampung inputan baris akan diinstansiasikan menjadi indeks baris dari array rating, begitu juga variabel kolomnya.*

### Percobaan 3: Melakukan Operasi Aritmatika pada Elemen Array 2 Dimensi
Pada Percobaan 3, kode program yang dibuat digunakan untuk menghitung nilai rata-rata harga setiap bahan pokok selama 1 satu semester. Terdapat 3 bahan pokok yang dicatat harganya setiap akhir bulan. Program dibuat berdasarkan flowchart berikut.

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
int harga[][] = new int [3][6];
double total, rata;
```

3. Dengan menggunakan perulangan *for*, buat input untuk mengisi elemen array **harga**. Kemudian, perhitungan total harga dilakukan untuk setiap bulan (kolom) pada setiap bahan pokok (baris). Setelah itu, nilai rata-rata dihitung untuk setiap bahan pokok (tiap satu baris) dan ditampilkan

![Gambar 11](images/percobaan3-3.PNG)


```Java
for (int i=0; i<harga.length; i++){
    
    total=0;
    rata=0;
    
    for (int j=0; j<harga[0].length; j++){
        
       System.out.printf("Masukkan harga [%d][%d] : ", i, j);
        
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
        
    }
    rata = total/harga[0].length;
    
    System.out.printf("\nRata-rata harga bahan ke-%d adalah %2f\n\n", i, rata);
    System.out.println();
}
```

    Masukkan harga [0][0] : 1
    Masukkan harga [0][1] : 1
    Masukkan harga [0][2] : 2
    Masukkan harga [0][3] : 2
    Masukkan harga [0][4] : 3
    Masukkan harga [0][5] : 3
    
    Rata-rata harga bahan ke-0 adalah 2.000000
    
    
    Masukkan harga [1][0] : 4
    Masukkan harga [1][1] : 5
    Masukkan harga [1][2] : 6
    Masukkan harga [1][3] : 7
    Masukkan harga [1][4] : 8
    Masukkan harga [1][5] : 9
    
    Rata-rata harga bahan ke-1 adalah 6.500000
    
    
    Masukkan harga [2][0] : 1
    Masukkan harga [2][1] : 9
    Masukkan harga [2][2] : 2
    Masukkan harga [2][3] : 8
    Masukkan harga [2][4] : 3
    Masukkan harga [2][5] : 7
    
    Rata-rata harga bahan ke-2 adalah 5.000000
    
    
    

#### Pertanyaan
1. Jelaskan fungsi dari **rata = total / harga[0].length**!

*Variabel rata disini adalah hasil dari variabel total dibagi dengan jumlah panjang elemen kolom dari array harga.*

2. Mengapa insialisasi variabel **total = 0** dan **rata = 0** berada di dalam perulangan *for* yang pertama? Menurut Anda, apa yang terjadi jika inisialisasi kedua variabel tersebut diletakkan di luar perulangan *for* (setelah deklarasi array)?


```Java
int harga[][] = new int [3][4];
double total, rata;
    
for (int i=0; i<harga.length; i++){
    for (int j=0; j<harga[0].length; j++){
        
       System.out.printf("Masukkan harga [%d][%d] : ", i, j);
        
        harga[i][j] = sc.nextInt();
        total += harga[i][j];
        
    }
    rata = total/harga[0].length;
    
    System.out.printf("\nRata-rata harga bahan ke-%d adalah %2f\n\n", i, rata);
    System.out.println();
}
```

    Masukkan harga [0][0] : 1
    Masukkan harga [0][1] : 1
    Masukkan harga [0][2] : 1
    Masukkan harga [0][3] : 1
    
    Rata-rata harga bahan ke-0 adalah 1.000000
    
    
    Masukkan harga [1][0] : 1
    Masukkan harga [1][1] : 1
    Masukkan harga [1][2] : 2
    Masukkan harga [1][3] : 2
    
    Rata-rata harga bahan ke-1 adalah 2.500000
    
    
    Masukkan harga [2][0] : 4
    Masukkan harga [2][1] : 4
    Masukkan harga [2][2] : 4
    Masukkan harga [2][3] : 4
    
    Rata-rata harga bahan ke-2 adalah 6.500000
    
    
    

*Jika variabel total dan rata tidak diinisialisasikan 0 pada perulangan outer maka total dan rata pada perulangan yang selanjutnya akan tertambah nilainya dari perulangan sebelumnya.*

*Jadi, fungsinya adalah untuk mengembalikan nilai awal pada setiap perulangan agar nilainya murni dari perhitungan tiap perulangan itu sendiri.*

## Tugas

1. Perhatikan flowchart berikut.

![Gambar 12](images/tugas-1.jpg)

Buat kode program sesuai dengan flowchart tersebut untuk mencari suhu tertinggi yang dicatat dari 5 kota di Jepang selama 7 hari berturut-turut!


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);

double suhu[][] = new double [3][3];
int x, y;
double max = 0;

for (x=0; x<suhu.length; x++){
    max=0;
    for (y=0; y<suhu[0].length; y++){
        
        System.out.printf("Masukkan suhu pada kota %d hari ke-%d : ", (x+1), (y+1));
        suhu[x][y] = input.nextDouble();
        
        if(suhu[x][y] > max){
            max = suhu[x][y];
        }
    }
    System.out.println("Suhu tertinggi di kota ini : "+max);
    System.out.println();
}
```

    Masukkan suhu pada kota 1 hari ke-1 : 30
    Masukkan suhu pada kota 1 hari ke-2 : 31
    Masukkan suhu pada kota 1 hari ke-3 : 32
    Suhu tertinggi di kota ini : 32.0
    
    Masukkan suhu pada kota 2 hari ke-1 : 31
    Masukkan suhu pada kota 2 hari ke-2 : 29
    Masukkan suhu pada kota 2 hari ke-3 : 30
    Suhu tertinggi di kota ini : 31.0
    
    Masukkan suhu pada kota 3 hari ke-1 : 29
    Masukkan suhu pada kota 3 hari ke-2 : 29
    Masukkan suhu pada kota 3 hari ke-3 : 28
    Suhu tertinggi di kota ini : 29.0
    
    

*Di sini saya merubah elemen array suhu untuk baris dan kolomnya menjadi masing-masing 3 saja agar tidak terlalu banyak inputan, jadi user akan diminta memasukkan data suhu dari 3 kota sampai 3 hari.*

*Setelah kota pertama sudah mencapai 3 inputan suhu, akan dibuat kondisi jika suhu yang dimasukkan melebihi nilai dari inisialisasi variabe max, maka nilai tersebut akan disimpan di variabel max itu sendiri.*

*Di akhir akan tersimpan nilainya yang tertinggi dan akan dapat ditampilkan di setiap kota, karena output untuk suhu max diletakkan pada perulangan outer.*

*Agar nilai max dari perulangan sebelumnya tidak ikut terhitung di perulangan selanjutnya, maka nilai max perlu diinisialisasi menjadi 0 di awal perulangan outer juga.*

2. Terdapat hasil pencatatan data lima mahasiswa yang berisi informasi mengenai umur, berat badan (kg), dan tinggi badan (cm). Data tersebut disimpan ke dalam array dua dimensi.

![Gambar 13](images/tugas-2.PNG)

*Keterangan: penyimpanan nilai dapat dilakukan melalui inisialisasi menggunakan operator assignment*
 * Tampilkan *berat badan terendah* di antara kelima mahasiswa tersebut
 * Tampilkan *rata-rata tinggi badan* dari kelima mahasiswa tersebut
 * Tampilkan nama mahasiswa dengan *umur tertua* di antara kelima mahasiswa tersebut


```Java
int data[][] = {
    {19,51,155},
    {18,55,163},
    {18,45,153},
    {20,46,158},
    {19,58,160}
};

String nama[] = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
String n;
int kg = 60, th;
double total, rata;

for(int baris=0; baris<data.length; baris++){
    for(int kolom=0; kolom<data[0].length; kolom++){
        
        if(data[baris][1]<kg){
            kg = data[baris][1];
        }
        
        if(data[baris][0]>th){
            th = data[baris][0];
            n = nama[baris];
        }
    }
    total += data[baris][2];
}
    
rata = total/data.length;

System.out.println("Berat badan terendah : "+kg);
System.out.println("Rata-rata tinggi badan : "+rata);
System.out.printf("Umur tertua adalah %d yaitu %s", th, n);
```

    Berat badan terendah : 45
    Rata-rata tinggi badan : 157.8
    Umur tertua adalah 20 yaitu Beky




    java.io.PrintStream@3f243c38



*Data nilai umur, berat, dan tinggi dari tabel tersebut diinisialisasi pada array 2 dimensi bernama data dahulu.*

*Lalu untuk nama-nama dari mahasiswa dibuat tampungannya dengan array dimensi 1 karena nanti masih perlu ditampilkan.*

*Beralih pada mencari berat badan terendah maka dibuat kondisi jika array data yang indeks kolomnya 1 kurang dari variabel kg yang mana disini diinisialisasi 60 karena untuk nilai patokan yang melebihi dari data berat semua mahasiswa. Jadi nanti variabel kg dapat menampung nilai yang terkecil untuk berat badan.*

*Kemudian untuk kondisi pencarian umur tertua, jadi jika array data dengan kolom indeks 0 itu lebih dari variabel th yang mana tidak diberi nilai awal, dan sama saja bernilai 0. Maka variabel th tadi diisi untuk menampung nilai yang tertinggi dari data umur di kolom indeks 0. Dan agar namanya tampil dibuat variabel n yang bisa menampung array nama yang sesuai dengan yang tertua.*

*Terakhir untuk mencari rata-rata tinggi, maka dihitung dulu totalnya dari array data pada indeks kolom 2 di perulangan outer. Untuk menghitung rata-ratanya dilakukan diluar perulangan agar nilainya keluar hanya sekali, dari total tadi dibagi oleh jumlah panjang elemen baris dari array data.*
