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
static void beriSalam() {
    System.out.println("Selamat Pagi");
}

beriSalam();
```

    Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam() {
    System.out.println("Halo! Selamat Pagi");
}

static void beriUcapan(String ucapan) {
    System.out.println(ucapan);
}

beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam);
```

    Halo! Selamat Pagi
    Selamat datang di pemrograman Java
    

#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

> Fungsi `beriSalam` tidak terdapat parameter jadi hanya , sedangkan fungsi `beriUcapan` bertipe `int` mengembalikan nilai.
___

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

> cara pemanggilannya hampir sama berbedanya harus menambahkan parameter pada fungsi berparameter.<br>
> contoh berparameter `namaFungsi(parameter1, parameter1);`.<br>
> contoh tidak berparameter `namaFungsi();`.
___

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2
static int luasPersegi(int sisi) {
    int luas = sisi * sisi; 
    return luas;
}

int luasan = luasPersegi(5);
System.out.println("Luas Persegi dengan sisi 5 = "+luasan);
```

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

> variabel `luasan` digunakan untuk menampung nilai dari pemgembalian fungsi `luasPersegi`.
___

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

> `return luas` digunakan untuk memberi nilai dari pembembalian fungsi disini yaitu hasil dari perkalian `sisi * sisi`
___

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;

static int luasPersegi(int sisi) {
    int luas = sisi * sisi;
    
    return luas;
}

Scanner input = new Scanner(System.in);

System.out.print("Massukan sisi: ");
int sisi = input.nextInt();
int luasan = luasPersegi(sisi);
System.out.printf("Luas Persegi dengan sisi %d = %d", sisi, luasan);
```

    Massukan sisi: 5
    Luas Persegi dengan sisi 5 = 25




    java.io.PrintStream@2be24ec5



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
import java.util.Scanner;

static int Kali(int C, int D) {
    int H;
    H = (C+10) % (D+19);
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
System.out.print("Masukkan nilai 1: ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai 2: ");
nilai2 = input.nextInt();

int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1: 4
    Masukkan nilai 2: 5
    Hasil akhir adalah 21
    

#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;

static int Kali(int C, int D) {
    int H;
    H = (C+10) % (D+19);
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
System.out.print("Masukkan nilai 1: ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai 2: ");
nilai2 = input.nextInt();

int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1: 4
    Masukkan nilai 2: 5
    Hasil akhir adalah 14
    

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

> 1. User memasukkan 2 inputan angka
> 2. Input tersebut digunakan sebagai parameter fungsi Kurang atau Kali
> 3. Pada fungsi Kurang, nilai 1 akan + 7 dan nilai 2 akan + 4
> 4. Kemudian, hasil penambahan tersebut digunakan sebagai parameter fungsi Kali
> 5. Pada fungsi ini, dilakukan operasi (C + 10) % (D + 19); dimana C dan D adalah hasil input yang dilakukan penambahan nilai pada fungsi Kurang.
> 6. Kemudian hasilnya dicetak kelayar
___

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
System.out.print("Masukkan panjang: ");
p = input.nextInt();
System.out.print("Masukkan lebar: ");
l = input.nextInt();
System.out.print("Masukkan tinggi: ");
t = input.nextInt();
L = p*l;
System.out.println("Luas persegi panjang = "+L);

vol = p*l*t;
System.out.println("Luas persegi panjang = "+vol);
```

    Masukkan panjang: 4
    Masukkan lebar: 6
    Masukkan tinggi: 8
    Luas persegi panjang = 24
    Luas persegi panjang = 192
    

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas(int pjg, int lbr){
    int Luas = pjg * lbr;
    return Luas;
}

static int hitungVolume(int tinggi, int a, int b){
    int volume = hitungLuas(a,b) * tinggi;
    return volume;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);
int p, l, t, L, vol;
System.out.print("Masukkan panjang : ");
p = input.nextInt();
System.out.print("Masukkan lebar : ");
l = input.nextInt();
System.out.print("Masukkan tinggi : ");
t = input.nextInt();

L = hitungLuas(p, l);
System.out.println("Luas Persegi panjang adalah : " + L);

vol = hitungVolume(t, p, l);
System.out.println("Volume Balok adalah : " + vol);

```

    Masukkan panjang : 5
    Masukkan lebar : 7
    Masukkan tinggi : 9
    Luas Persegi panjang adalah : 35
    Volume Balok adalah : 315
    

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

>Parameter pada fungsi tersebut digunakan untuk menampung nilai yang akan digunakan untuk menjalankan rumus perhitungan luas dan volume. Dengan begitu kita dapat memanggil fungsi tersebut dengan nilai yang berbeda untuk mendapatkan hasil yang berbeda.
___

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

> Menurut saya, lebih efisien menggunakan fungsi karena bisa digunakan berulang-ulang dengan cukup memanggil fungsi tersebut, dan jika terdapat perubahan rumus lebih mudah, dengan hanya mengubah isi fungsinya.
___

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
import java.util.Scanner;
static int total = 0, i;

static int[] isiarray(int angka){
    Scanner sc = new Scanner(System.in);
    int array[] = new int[angka];
    for(int i = 0; i < array.length; i++){
        System.out.printf("Masukkan data ke-%d :",i);
        array[i] = sc.nextInt();
    }
    return array;
}

static void tampilArray(int[] arr){
    for(int i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke- " + i);
        System.out.println(arr[i]);
    }
    
}

static int hitTot(int[] arr){
    for(int i = 0; i < arr.length; i++){
        total += arr[i];
    }
    return total;
}

Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```

    Masukkan jumlah data yang ingin anda inputkan: 4
    Masukkan data ke-0 :5
    Masukkan data ke-1 :4
    Masukkan data ke-2 :3
    Masukkan data ke-3 :3
    Nilai yang anda inputkan ke- 0
    5
    Nilai yang anda inputkan ke- 1
    4
    Nilai yang anda inputkan ke- 2
    3
    Nilai yang anda inputkan ke- 3
    3
    Total nilai = 15
    

## Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

> karena fungsi `tampilArray` tidak mengembalikan nilai apapun dan hanya langsung menampilkan print kelayar, sedangkan fungsi `isiArray` dan `hitTot` mengembalikan nilai integer dengan `isiarray` akan mengembalikan array dari sekumpulan inputan dari user, dan `hitTot` mengembalikan total dari sekumpulan nilai dari array dalam parameter.

2. Menurut pendapat anda apakah fungsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

> Bisa, pada fungsi `isiArray` dapat memanfaatkan `function pass by refference`, dan untuk `hitTot` kita dapat langsung menampilkan outputnya di dalam fungsi.


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
static int total = 0, i;

static void isiarray(int[] array){
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i < array.length; i++){
        System.out.printf("Masukkan data ke-%d :",i);
        array[i] = sc.nextInt();
    }
}

static void tampilArray(int[] arr){
    for(int i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke- " + i);
        System.out.println(arr[i]);
    }
    
}

static void hitTot(int[] arr){
    for(int i = 0; i < arr.length; i++){
        total += arr[i];
    }
    
    System.out.println("Total nilai = " + total);
}

Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = new int[jum];

isiarray(dataArray);
tampilArray(dataArray);
hitTot(dataArray);
```

    Masukkan jumlah data yang ingin anda inputkan: 4
    Masukkan data ke-0 :5
    Masukkan data ke-1 :6
    Masukkan data ke-2 :7
    Masukkan data ke-3 :8
    Nilai yang anda inputkan ke- 0
    5
    Nilai yang anda inputkan ke- 1
    6
    Nilai yang anda inputkan ke- 2
    7
    Nilai yang anda inputkan ke- 3
    8
    Total nilai = 26
    

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int a, int b, int c){
    int max;
    if(a > b && a > c){
        max = a;
    }else if(b > a && b > c){
        max = b;
    }else{
        max = c;
    }
    return max;
}

printf("Nilai tertinggi adalah %d", Max3(10, 20, 30));
```

    Nilai tertinggi adalah 30

### Penjelasan
>1. membuat fungsi dengan nama Max3 yang menerima 3 parameter bilangan integer
>2. didalamnya membuat variable yang bernama max yang bertipe integer
>3. mencari nilai maksimum dari 3 parameter bilangan integer, dengan menggunakan perintah <b>if-else if-else</b>, jika a lebih besar dari b dan c maka max = a, jika b lebih besar dari a dan c maka max = b, jika c lebih besar dari a dan b maka max = c
>4. mengembalikan nilai max

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
static String Menu(int i){
    String[] mn = { "Nasi Goreng", "Soto", "Sate" };
    return mn[i];
}

static String Hari(int i){
    String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
    return hari[i];
}

static void FavoritMenu(int[][] sales, int... days) {
    int[] maxPerHari = new int[days.length];
    int[] maxMenuIndex = new int[days.length];

    for (int menuIndex = 0; menuIndex < sales.length; menuIndex++) {
      for (int dayIndex = 0; dayIndex < days.length; dayIndex++) {
        int day = days[dayIndex];

        if (sales[menuIndex][day] > maxPerHari[dayIndex]) {
          maxPerHari[dayIndex] = sales[menuIndex][day];
          maxMenuIndex[dayIndex] = menuIndex;
        }
      }
    }

    for (int i = 0; i < days.length; i++) {
      System.out.println(" Menu favorit hari " + Hari(days[i]) + " = " + Menu(maxMenuIndex[i]));
    }
}

static void Pemasukan(int[][] sales, int[] prices) {
    int total = 0;

    for (int mIndex = 0; mIndex < sales.length; mIndex++) {
      for (int hIndex = 0; hIndex < sales[mIndex].length; hIndex++) {
        total += sales[mIndex][hIndex] * prices[mIndex];
      }
    }

    System.out.println(" Total Pemasukan Restoran: Rp." + total);
}

static void HitungPorsi(int[][] sales) {
    int[] total = new int[sales.length];

    for (int mIndex = 0; mIndex < sales.length; mIndex++) {
      for (int hIndex = 0; hIndex < sales[mIndex].length; hIndex++) {
        total[mIndex] += sales[mIndex][hIndex];
      }
    }

    for (int i = 0; i < total.length; i++) {
      System.out.println(" Jumlah " + Menu(i) + " adalah " + total[i] + " porsi");
    }
}

static String buatGaris(int jml){
    return "=".repeat(jml);
}

int[][] salesData = { { 20, 15, 35, 24, 70 }, { 30, 40, 10, 28, 35 }, { 5, 10, 50, 48, 15 } };
int[] prices = { 20000, 15000, 25000 };

System.out.println(buatGaris(40));
System.out.println(buatGaris(13)+" Menu Favorit "+buatGaris(13));
System.out.println(buatGaris(40));
// 1 = Selasa, 4 = Jumat
FavoritMenu(salesData, 1, 4);
System.out.println(buatGaris(40));

System.out.println(buatGaris(11)+" Total Pendapatan "+buatGaris(11));
System.out.println(buatGaris(40));
Pemasukan(salesData, prices);
System.out.println(buatGaris(40));

System.out.println(buatGaris(13)+" Total Penjualan "+buatGaris(10));
System.out.println(buatGaris(40));
HitungPorsi(salesData);
System.out.println(buatGaris(40));

```

    ========================================
    ============= Menu Favorit =============
    ========================================
     Menu favorit hari Selasa = Soto
     Menu favorit hari Jumat = Nasi Goreng
    ========================================
    =========== Total Pendapatan ===========
    ========================================
     Total Pemasukan Restoran: Rp.8625000
    ========================================
    ============= Total Penjualan ==========
    ========================================
     Jumlah Nasi Goreng adalah 164 porsi
     Jumlah Soto adalah 143 porsi
     Jumlah Sate adalah 128 porsi
    ========================================
    

#### Penjelasan
>1. Membuat fungsi `Menu` yang menerima parameter `i` bertipe integer, dan mengembalikan nilai string, untuk mencari menu dari data yang ada.
>2. Membuat funsi `Hari` yang menerima parameter `i` bertipe integer, dan mengembalikan nilai string untuk mencari hari dari senini hingga jumaat.
>3. Membuat fungsi `FavoritMenu` yang menerima parameter data sales dan hari, untuk mencari menu favorit di hari tersebut.
>4. Membuat fungsi `Pemasukan` yang menerima parameter data sales dan hari, untuk mencari pemasukan restoran tersebut.
>5. Membuat fungsi `HitungPorsi` yang menerima parameter data sales dan hari, untuk mencari porsi yang terjual untuk masing-masing menu.
>6. Menampilkan hasil dari fungsi-fungsi tersebut kelayar.

