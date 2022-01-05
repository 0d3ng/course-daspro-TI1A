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
beriSalam();
```

    Halo! Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
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
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

//jawaban no 1

fungsi beriSalam itu merupakan bagian dari pembuatan fungsi sedangkan beriUcapan merupakan pemanggilan fungsi dan pemberian nilai parameter


2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

//jawaban no 2

cara pemanggilannya cukup sederhana yaitu memberikan nilai sebelum membuat fungsinya, contoh beriUcapan;. Apabila tanpa parameter langsung memproses di dalam fungsinya, contoh seperti fungsi beriSalam.

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
    int luasan = luasPersegi(5);
    System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

//jawaban no 1

karena yang pertama merupakan variable baru dari proses pengoperasian dikarenakan untuk bagian luasan memiliki integer yg berbeda dari int luas atau untuk deklarasi dari luas persegi

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

//jawaban no 2

dikarenakan untuk mengembalikkan nilai luasnya

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan sisi persegi: ");
int sisi=input.nextInt();
static int luasPersegi(int sisi){
    int luas = sisi*sisi;
    return luas;
}
int luasan = luasPersegi(sisi);
System.out.println("Luas Persegi = " + luasan);
```

    Masukkan sisi persegi: 5
    Luas Persegi = 25


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
static int Kali(int C, int D) {
    int H;
    H = Kurang(C, D) * Kurang(D, C);
    return H - Kurang(C * D, D * C);
}
static int Kurang(int A, int B) {
    int X;
    
    A += 7;
    B += 4;
    
    return A -B;
}
int nilai1, nilai2;
Scanner i = new Scanner(System.in);
System.out.print("Masukan Nilai 1: ");
nilai1 = i.nextInt();
System.out.print("Masukan Nilai 2: ");
nilai2 = i.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukan Nilai 1: 5
    Masukan Nilai 2: 6
    Hasil akhir adalah 5


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D) {
    int H;
    H = Kurang(C, D) * Kurang(D, C);
    return H - Kurang(C * D, D * C);
}
static int Kurang(int A, int B) {
    int X;
    
    A += 7;
    B += 4;
    
    return A -B;
}
int nilai1, nilai2;
Scanner i = new Scanner(System.in);
System.out.print("Masukan Nilai 1: ");
nilai1 = i.nextInt();
System.out.print("Masukan Nilai 2: ");
nilai2 = i.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukan Nilai 1: 6
    Masukan Nilai 2: 7
    Hasil akhir adalah 5


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

//jawaban no 2

yang pertama input terlebih dahulu nilai 1 dan 2,lalu selanjutnya di fungsi Kurang nilai 1 tambahkan dengan 7 dan nilai 2 akan ditambah dengan 4, setelah itu, hasil penambahan tadi digunakan sebagai parameter fungsi Kali,operasi (C + 10) % (D + 19); dimana C dan D adalah hasil, input yang dilakukan penambahan nilai pada fungsi Kurang
setelah mendapat hasilnya maka ditampilkan.  

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
int f, a, r, I, riz;
System.out.println("Masukkan panjang");
f=input.nextInt();
System.out.println("Masukkan lebar");
a=input.nextInt();
System.out.println("Masukkan tinggi");
r=input.nextInt();
I=f*a;
System.out.println("Luas Persegi panjang adalah "+I);
riz=f*a*r;
System.out.println("Volumem balok adalah "+riz);
```

    Masukkan panjang
    5
    Masukkan lebar
    6
    Masukkan tinggi
    7
    Luas Persegi panjang adalah 30
    Volumem balok adalah 210


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
    int Luas=pjg*lb;
    return Luas;
}
static int hitungVolume (int tinggi, int a, int b){
    int volume= hitungLuas(a,b)*tinggi;
    return volume;
}
Scanner input =new Scanner (System.in);
int p,l,t,L, vol;
System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();
L=hitungLuas(p,l);
System.out.println("Luas Persegi Panjang adalah "+L);
vol=hitungVolume(t,p,l);
System.out.println("Volume Balok adalah "+vol);
```

    Masukkan panjang
    5
    Masukkan lebar
    6
    Masukkan tinggi
    7
    Luas Persegi Panjang adalah 30
    Volume Balok adalah 210


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

//jawaban no 1

parameter ini digunakan untuk menyimpan nilai yang akan diinputkan atau di masukkan ke sebuah fungsi.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

//jawaban no 2

lebih mudah menggunakan fungsi. Karena mudah dipahami.

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
static int total=0,i;
static int [] isiarray (int angka){
    Scanner input = new Scanner (System.in);
    int array[]=new int[angka];
    for(i=0; i<array.length; i++){
    System.out.println("Masukkan data ke- "+i);
    array[i]=input.nextInt();
}
return array;
}
static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
}
}
static int hitTot(int []arr ){
    for(i=0; i<arr.length; i++){
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
total= hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    4
    Masukkan data ke- 0
    5
    Masukkan data ke- 1
    9
    Masukkan data ke- 2
    3
    Masukkan data ke- 3
    4
    Nilai yang anda inputkan ke 0
    5
    Nilai yang anda inputkan ke 1
    9
    Nilai yang anda inputkan ke 2
    3
    Nilai yang anda inputkan ke 3
    4
    Total nilai = 21


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

//jawaban no 1

Karena fungsi tersebut tidak menghasilkan nilai keluaran dari proses yang ada didalamnya.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

// Tuliskan jawaban nomor 2

menurut saya tidak bisa dikarenakan fungsi isiarray dan hitTot merupakan fungsi yang menghasilkan nilai output dari proses

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil1, bil2, bil3;
int max = 0;
double mencariMax;
System.out.println("Bilangan 1: ");
bil1 = input.nextInt();
System.out.println("Bilangan 2: ");
bil2 = input.nextInt();
System.out.println("Bilangan 3: ");
bil3 = input.nextInt();

static int Max(int bil1, int bil2, int bil3){
if (bil1 > max){
            max = bil1;
        } if(bil2 > max){
           max = bil2;
        } if (bil3 > max){
            max = bil3;
        }
    return max;
}
int mencariMax = Max(bil1, bil2, bil3);
System.out.print("Nilai Terbesar Adalah: " + mencariMax);
```

    Bilangan 1: 
    19
    Bilangan 2: 
    56
    Bilangan 3: 
    39
    Nilai Terbesar Adalah: 56

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
static void favoMenu(int[][] dataSales, String[] namaMenu, int... days) {
    int[] maxSalesHariIni = new int[days.length];
    int[] maxSalesIndexMenu = new int[days.length];
    for (int indexMenu = 0; indexMenu < dataSales.length; indexMenu++) {
      for (int indexDay = 0; indexDay < days.length; indexDay++) {
        int day = days[indexDay];
        if (dataSales[indexMenu][day] > maxSalesHariIni[indexDay]) {
          maxSalesHariIni[indexDay] = dataSales[indexMenu][day];
          maxSalesIndexMenu[dayIndex] = indexMenu;
        }
      }
    }
    String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
    for (int dayIndex = 0; dayIndex < days.length; dayIndex++) {
      int day = days[dayIndex];
      int indexMenu = maxSalesIndexMenu[dayIndex];
      System.out.println("Menu favorit pada hari " + daysName[day] + " adalah " + namaMenu[indexMenu]);
    }
}
static void restaurantIncomes(int[][] dataSales, int[] prices) {
    if (dataSales.length != prices.length) {
      System.out.println("dataSales dan harga tidak sama");
      return;
    }
    int pemasukanTotal = 0;
    for (int indexMenu = 0; indexMenu < dataSales.length; indexMenu++) {
      for (int dayIndex = 0; dayIndex < dataSales[indexMenu].length; dayIndex++) {
        pemasukanTotal += dataSales[indexMenu][dayIndex] * prices[indexMenu];
      }
    }
    System.out.println("Total Pemasukan Restoran: Rp." + pemasukanTotal);
}
static void totalSalesMenu(int[][] dataSales, String[] namaMenu) {
    int[] salesTotal = new int[dataSales.length];
    for (int indexMenu = 0; indexMenu < dataSales.length; indexMenu++) {
      for (int dayIndex = 0; dayIndex < dataSales[indexMenu].length; dayIndex++) {
        salesTotal[indexMenu] += dataSales[indexMenu][dayIndex];
      }
    }
    for (int indexMenu = 0; indexMenu < salesTotal.length; indexMenu++) {
      System.out.println("Total dataSales " + namaMenu[indexMenu] + " adalah " + salesTotal[indexMenu] + " porsi");
    }
}
int[][] dataSales = { { 20, 15, 35, 24, 70 }, { 30, 40, 10, 28, 35 }, { 5, 10, 50, 48, 15 } };
String[] namaMenu = { "Nasi Goreng", "Soto", "Sate" };
int[] prices = { 20000, 30000, 25000 };
String divider = "=".repeat(40);
System.out.println("Menu Favorit");
System.out.println(divider);
// 1 = Selasa, 4 = Jumat
favoMenu(dataSales, namaMenu, 1, 4);
System.out.println(divider);
System.out.println("\nTotal Pendapatan Restoran");
System.out.println(divider);
restaurantIncomes(dataSales, prices);
System.out.println(divider);
System.out.println("\nTotal Penjualan Tiap Menu");
System.out.println(divider);
salesMenuTotal(dataSales, namaMenu);
```

    Menu Favorit
    ========================================



    |   // Tuliskan jawaban nomor 2

    |   static void favoMenu(int[][] dataSales, String[] namaMenu, int... days) {

    |       int[] maxSalesHariIni = new int[days.length];

    |       int[] maxSalesIndexMenu = new int[days.length];

    |       for (int indexMenu = 0; indexMenu < dataSales.length; indexMenu++) {

    |         for (int indexDay = 0; indexDay < days.length; indexDay++) {

    |           int day = days[indexDay];

    |           if (dataSales[indexMenu][day] > maxSalesHariIni[indexDay]) {

    |             maxSalesHariIni[indexDay] = dataSales[indexMenu][day];

    |             maxSalesIndexMenu[dayIndex] = indexMenu;

    |           }

    |         }

    |       }

    |       String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

    |       for (int dayIndex = 0; dayIndex < days.length; dayIndex++) {

    |         int day = days[dayIndex];

    |         int indexMenu = maxSalesIndexMenu[dayIndex];

    |         System.out.println("Menu favorit pada hari " + daysName[day] + " adalah " + namaMenu[indexMenu]);

    |       }

    |   }

    Unresolved dependencies:

       - variable dayIndex

       - variable daysName



```Java

```
