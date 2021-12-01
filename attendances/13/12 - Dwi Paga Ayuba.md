# JOBSHEET 13. Fungsi 1

## Tujuan
* Mahasiswa mampu memahami penggunaan fungsi static pada Java dengan parameter dan mengembalikan nilai.
* Mahasiswa mampu membuat program menggunakan fungsi static dan mengeksekusi fungsi tersebut.


## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1: Fungsi Void (tidak menggunakan return value)

1.	Buat fungsi **beriSalam** bertipe void yang digunakan untuk mencetak **“Halo! Selamat Pagi”**.
![Gambar 1](images/1.1.png)

2. Eksekusi atau panggil fungsi **beriSalam**.
![Gambar 2](images/1.2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1 & 2
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}

static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
```

3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}

static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}

static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}
beriSalam();

static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}
static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}
 beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam);
```

    Halo! Selamat Pagi
    Halo! Selamat Pagi
    Selamat datang di pemrograman Java
    

#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

untuk yang fungsi beriSalam tidak menggunakan parameter sedangkan fungsi yang beriUcapan menggunakan parameter

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

kita dapat memanggil sebuah fungsi void yang tidak berparameter dengan cara menuliskan nama fungsi lalu tanda kurung buka dan kurung tutup yang kosong atau tidak ada isinya contohnya "beriSalam();". lalu jika ingin memanggil yang berparameter yaitu dengan cara menuliskan nama fungsi lalu tanda kurung buka dan kurung tutup yang berisi tipe data dan parameter yang kita inginkan.

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}
int luasan = luasPersegi(5);
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

variabel luasan dibuat untuk menampung hasil dari fungsi luasPersegi agar dapat ditampilkan.

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

return luas digunakan untuk mengembalikan nilai pada operasi luas yang berasal dari perkalian parameter sisi

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.println("Masukkan Sisi: ");
int ss = sc.nextInt();
int luasan = luasPersegi(ss);
System.out.println("Luas Persegi: "+ luasan);
```

    Masukkan Sisi: 
    5
    Luas Persegi: 25
    

### Percobaan 3: Fungsi dapat meng-CALL Fungsi Lain
Pada Percobaan 3, kode program yang dibuat digunakan untuk mengimplementasikan bahwa fungsi dapat meng-CALL fungsi yang lain. Dimana dalam percobaan ini terdapat fungsi **Kali dan Kurang**. 
1. Buatlah fungsi **Kali** yang mengembalikan nilai H (int) dan parameter masukan C dan D (int).
![Gambar 9](images/3.1.png)

2.	Buatlah fungsi **Kurang** yang mengembalikan nilai X (int) dan parameter masukan A dan B (int) dan memanggil fungsi Kali.
![Gambar 10](images/3.2.png)

3. Lakukan import class Scanner sebagai inputan di langkah selajutnya.

4. Eksekusi atau panggil fungsi **Kurang** .
![Gambar 11](images/3.4.png)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1, 2, 3 & 4
static int Kali(int C, int D){
    int H;
    H = (C + 10) % (D + 19);
    return H;
}

static int Kurang(int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = Kali(A, B);
    return X;
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Nilai 1:");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1:
    10
    Masukkan Nilai 2:
    11
    Hasil akhir adalah 27
    

#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D) {
    int H;
    H = (C + 10) % (D + 19);
    H = Kurang(C, D);
    return H;
}

static int Kurang(int A, int B) {
    int X;
    A = A + 7;
    B = B + 4;
    X = A + B;
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukan Nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukan Nilai 1: 
    1
    Masukan Nilai 2: 
    2
    Hasil akhir adalah 14
    

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

yang pertama user menginputkan nilai selanjutnya dilanjutkan dengan fungsi kurang A dan B merupakan nilai dari inputan user A + 7 dan B + 4 misalnya A adalah 1 dan B adalah 2 (1 + 7) dan ( 2 + 4) yang ,engeluarkan hasil (8 dan 6) selanjutnya merupakan fungsi kali dengan perhitungan C + 10 % D + 19, C dan D merupakan hasil dari operasi fungsi kurang yang berarti 8 + 10 % 6 + 19 adalah 18

### Percobaan 4: Mengubah Program Tidak Menggunakan Fungsi dan Menggunakan Fungsi
Pada Percobaan 4, kode program yang dibuat digunakan untuk menghitung luas persegi panjang dan volume balok tanpa menggunakan fungsi dan dengan menggunakan fungsi.
1. Import dan deklarasikan Scanner dengan nama **input**
![Gambar 9](images/4.1.png)

2. Buatlah inputan panjang, lebar, dan tinggi 
![Gambar 10](images/4.2.png)

3. Hitung luas persegi panjang dan volume balok
![Gambar 10](images/4.3.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int p,l,t,L,vol;

System.out.println("Masukkan panjang");
p = input.nextInt();
System.out.println("Masukkan lebar");
l = input.nextInt();
System.out.println("Masukkan tinggi");
t = input.nextInt();

L = p * l;
System.out.println("Luas Persegi panjang adalah " + L);

vol = p * l * t;
System.out.println("Volume balok adalah " + vol);
```

    Masukkan panjang
    5
    Masukkan lebar
    7
    Masukkan tinggi
    8
    Luas Persegi panjang adalah 35
    Volume balok adalah 280
    

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas (int pjg, int lb){
    int Luas = pjg * lb;
    return Luas;
}

static int hitungVolume (int tinggi, int a, int b){
    int volume = hitungLuas(a,b) * tinggi;
    return volume;
}

Scanner input = new Scanner(System.in);
int p,l,t,L, vol;
System.out.println("Masukkan panjang");
p = input.nextInt();
System.out.println("Masukkan lebar");
l = input.nextInt();
System.out.println("Masukkan tinggi");
t = input.nextInt();

L = hitungLuas(p,l);
System.out.println("Luas Persegi Panjang adalah "+L);
vol = hitungVolume(t,p,l);
System.out.println("Volume Balok adalah "+vol);
```

    Masukkan panjang
    10
    Masukkan lebar
    5
    Masukkan tinggi
    4
    Luas Persegi Panjang adalah 50
    Volume Balok adalah 200
    

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

fugsi hitungLuas dan Hitung Volume digunakan untuk menampung nilai yang selanjutnya akan digunakan untuk operasi seanjutnya

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

menurut saya lebih efisien dengan tidak menggunakan fungsi karena untuk kodingannya sendiri lebih mudah untuk dikerjakan dak tidak membingungkan.

### Percobaan 5: Fungsi Menggunakan Array dan Variabel Global
Pada Percobaan 5, kode program yang dibuat digunakan untuk menghitung total nilai yang ada didalam array dengan membuat 3 fungsi yaitu isiarray, hitTol, dan tampilArray.
1. Buatlah **variable global total dan i** bertipe int
![Gambar 9](images/5.1pertama.png)

2. Buatlah fungsi **isiarray** bertipe int dengan parameter angka bertipe int 

![Gambar 10](images/5.1.png)

3. Buatlah fungsi **tampilArray** bertipe **void** dengan parameter data array **arr** bertipe int

![Gambar 10](images/5.2.png)

4. Buatlah fungsi **hitTot** bertipe int dengan parameter data array **arr** bertipe int

![Gambar 10](images/5.3.png)

5. Import dan deklarasikan Scanner dengan nama **input**

![Gambar 10](images/4.1.png)

6. Eksekusi atau panggil ketiga fungsi yaitu **isiarray, tampilArray, dan hitTot**, kemudian jalankan program!

![Gambar 10](images/5.6.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1 s/d 6
static int total = 0, i;
static int [] isiarray(int angka) {
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for (i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke- "+i);
        array[i]=input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i = 0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static int hitTot(int []arr){
    for(i = 0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total=hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    5
    Masukkan data ke- 0
    1
    Masukkan data ke- 1
    2
    Masukkan data ke- 2
    3
    Masukkan data ke- 3
    4
    Masukkan data ke- 4
    5
    Nilai yang anda inputkan ke 0
    1
    Nilai yang anda inputkan ke 1
    2
    Nilai yang anda inputkan ke 2
    3
    Nilai yang anda inputkan ke 3
    4
    Nilai yang anda inputkan ke 4
    5
    Total nilai = 15
    

#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karena pada tampil array tidak mengeluarkan output berupa angka hanya mengeluarkan output berupa huruf dan juga tampil array tidak perlu mengembalikan nilai berbeda dengan isiarray dan hitTot karena mengeluarkan output berupa angka yang mana memerlukan tipe data int dan juga pada fungsi ini perlu mengembalikan nilai

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
static int total = 0, i;
static void [] isiarray(int angka) {
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for (i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke- "+i);
        array[i]=input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i = 0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static void hitTot(int []arr){
    for(i = 0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total=hitTot(dataArray);
System.out.println("Total nilai = "+total);
```


    |   static void [] isiarray(int angka) {

    illegal start of expression

    

    |   static void [] isiarray(int angka) {

    ';' expected

    

    |   static void [] isiarray(int angka) {

    '.class' expected

    

    |   static void [] isiarray(int angka) {

    ';' expected

    

    |   static void [] isiarray(int angka) {

    unexpected type

      required: value

      found:    class

    

    |       int array[] = new int[angka];

    cannot find symbol

      symbol:   variable angka

    

    |   }

    unreachable statement

    


akan terjadi error karena tipe data void tidak bisa digunakan untuk mengembalikan nilai, untuk isiarray juga terjadi error karena memiliki parameter yang bertipe int dan nilai yang dikeluarkan juga berupa angka maka harus menggunakan int

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
int terbesar = 0;
static int Max3(int bil1, int bil2, int bil3){
    if(bil1 > terbesar){
        terbesar = bil1;
    }else if(bil2 > terbesar){
        terbesar = bil2;
    }else if(bil3 > terbesar){
        terbesar = bil3;
    }
    return terbesar;
}

import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int in1, in2, in3;
System.out.println("Masukkan Bilangan 1: ");
in1 = sc.nextInt();
System.out.println("Masukkan Bilangan 2: ");
in2 = sc.nextInt();
System.out.println("Masukkan Bilangan 3: ");
in3 = sc.nextInt();
terbesar = Max3(in1, in2, in3);
System.out.println("Bilangan Maksimum adalah " + terbesar);
```

    Masukkan Bilangan 1: 
    5
    Masukkan Bilangan 2: 
    4
    Masukkan Bilangan 3: 
    3
    Bilangan Maksimum adalah 5
    

yang pertama user memasukan nilai kepada 3 bilangan yang akan dioperasikan oleh fungsi Max3. dan selanjutnya akan dicari bilangan terbesar dengan kondisi ketika bilangan lebih besar dari variabel terbesar yang bernilai 0 maka bilangan itu lah yang merupakan akan menjadi output sebagai bilangan maksimum.

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
int porsi[][] = {{20, 15, 35, 24, 70}, {30, 40, 10, 28, 35}, {5, 10, 50, 48, 15}};
String menu[] = {"Nasi goreng", "Soto", "Sate"};
String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

static void menuFavSelasa(){
    int favorit1 = 0;
    int max1 = 0;
    for(int a = 0; a < menu.length; a++){
        if(porsi[a][1] > max1){
            max1 = porsi[a][1];
            favorit1 = a;
        }
    }
    System.out.println("Makanan favorit dihari Selasa adalah " + menu[favorit1]);
}  

static void menuFavJumat(){
    int favorit2 =0;
    int max2 =0;
    for(int b = 0; b < menu.length; b++){
        if(porsi[b][4] > max2){
            max2 = porsi[b][4];
            favorit2 = b;
        }
    }
    System.out.println("Makanan favorit dihari Jumat adalah " + menu[favorit2]);
} 

static void pemasukan(){
    int pemNasigor, pemSoto, pemSate;
    int totalPem = 0, nasigor = 0, soto = 0, sate = 0;
    int hrgNasigor = 20000, hrgSoto = 15000, hrgSate = 25000;
    for(int c = 0; c < porsi[0].length; c++){
        nasigor = nasigor + porsi[0][c];
        soto = soto + porsi[1][c];
        sate = sate + porsi[2][c];
    }
    pemNasigor = nasigor * hrgNasigor;
    pemSoto = soto * hrgSoto;
    pemSate = sate * hrgSate;
    totalPem = pemNasigor + pemSoto + pemSate;
    System.out.println("Pemasukan Restoran dari senin sampai jumat yaitu Rp. " + totalPem);
}  

static void terjual(){
    int nasigor = 0, soto = 0, sate = 0;
    for(int d = 0; d < porsi[0].length; d++){
        nasigor = nasigor + porsi[0][d];
        soto = soto + porsi[1][d];
        sate = sate + porsi[2][d];
    }
    
    System.out.println("Total Nasi goreng yang terjual : " + nasigor);
    System.out.println("Total Soto yang terjual : " + soto);
    System.out.println("Total Sate yang terjual : " + sate);
} 

menuFavSelasa();
menuFavJumat();
pemasukan();
terjual();
```

    Makanan favorit dihari Selasa adalah Soto
    Makanan favorit dihari Jumat adalah Nasi goreng
    Pemasukan Restoran dari senin sampai jumat yaitu Rp. 8625000
    Total Nasi goreng yang terjual : 164
    Total Soto yang terjual : 143
    Total Sate yang terjual : 128
    

yang pertama dengan membuat array jumlah porsi, menu dan hari. selanjutnya fungsi yang pertama yaitu menuFavSelasa yang digunakan untuk mencari jumlah porsi terbanyak pada hari selasa dan akan dijadikan output untuk makanan favorit dihari selasa. selanjutnya fungsi kedua yaitu menuFavJumat yang memiliki kegunaan yang sama dengan fungsi yang sebelumnya hanya saja pada fungsi ini mencari jumlah porsi terbanyak pada kolom jumat atau kolom 4 yang akan menjadi output untuk makanan favorit dihari jumat.selanjutnya fungsi yang ketiga yaitu pemasukan yang digunakan untuk menghitung total penjualan. dan fungsi yang terakhir merupakan fungsi terjual yang digunakan untuk menghitung total porsi yang terjual dari 3 mnu tersebut.


```Java

```


```Java

```
