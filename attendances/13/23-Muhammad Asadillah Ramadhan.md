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


```Java
Jawaban: 
pada beriSalam tidak menampung nilai dan langsung mengerjakan di dalam fungsi(tanpa parameter), namun pada beriUcapan menampung nilai yang diproses di dalam fungsi(parameter).
```

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!


```Java
Jawaban:
Cara pemanggilan berparameter adalah memberikan nilai sebelum membuat fungsinya, seperti fungsi beriUcapan; Sedangkan yang tanpa parameter langsung memproses di dalam fungsinya, seprti fungsi beriSalam.
```

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


```Java
// Tuliskan jawaban nomor 1
Karena fungsi luasPersegi adalah parameter, maka harus membuat variabel baru untuk menampung fungsi tersebut agar memudahkan membuat kode program kedepannya, karena jika tidak membuat variabel baru, maka pemanggilan fungsi harus seperti ini: luasPersegi(5) yang tentu saja akan susah jika fungsi tersebut sering digunakan.
```

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!


```Java
Jawaban:
return luas berfungsi untuk mengembalikan nilai agar fungsi bisa diolah di proses selanjutnya. 
```

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 3
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Sisi: ");
int sisi = input.nextInt();
int luasan = luasPersegi(sisi);
System.out.println("Luas Persegi dengan sisi " + sisi + " adalah " + luasan);
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

```

    Masukkan Sisi: 20
    Luas Persegi dengan sisi 20 adalah 400


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
Scanner input = new Scanner (System.in);
System.out.println("Masukkan Nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil Akhir adalah " + hasil);
```

    Masukkan Nilai 1: 
    1
    Masukkan Nilai 2: 
    2
    Hasil Akhir adalah 18


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kurang(int A, int B){
A = A + 7;
B = B + 4;
return B;
}
static int Kali(int C, int D){
int H, X;
H = (C + 10) % (D + 19);
    X = Kurang(C, D);
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner (System.in);
System.out.println("Masukkan Nilai 1: ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil Akhir adalah " + hasil);
```

    Masukkan Nilai 1: 
    1
    Masukkan Nilai 2: 
    2
    Hasil Akhir adalah 6


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!


```Java
Jawaban No 2:
Pertama user akan diminta memasukkan 2 nilai, kemudian fungsi "kurang" dijadikan integer yang sesuai pada input, lalu juga akan dijadikan lagi menjadi 1 integer baru yang akan digunakan pada output nantinya, kemudian 2 nilai yang dimasukkan user sebelumnya diproses di dalam fungsi "Kurang", Lalu di dalam fungsi "kurang", setelah 2 angka tersebut diproses, dipanggil juga fungsi "Kali" di dalam fungsi "Kurang", kemudian 2 angka yang telah diproses di fungsi "Kurang" tersebut diolah di fungsi "kali". Lalu Setelah diolah akan menghasilkan 1 nilai yang ditampung dalam variabel yang telah dijelaskan sebelumnya, Lalu Hasil angka tersebut akan dijadikan output yang menghasilkan hasil dengan System.out.print yang telah dibuat.  
```

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

System.out.print("Masukkan Panjang: ");
p = input.nextInt();
System.out.print("\nMasukkan Lebar: ");
l = input.nextInt();
System.out.print("\nMasukkan Tinggi: ");
t = input.nextInt();
L = p * l;
System.out.println("\nLuas Persegi Panjang Adalah " + L);

vol = p*l*t;
System.out.println("Volume Balok Adalah " + vol);

```

    Masukkan Panjang: 3
    
    Masukkan Lebar: 3
    
    Masukkan Tinggi: 3
    
    Luas Persegi Panjang Adalah 9
    Volume Balok Adalah 27


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
int Luas = pjg*lb;
return Luas;
}
static int hitungVolume (int tinggi, int a, int b){
int volume = hitungLuas(a,b)*tinggi;
return volume;
}
Scanner input = new Scanner(System.in);
int p,l,t,L,vol;

System.out.print("Masukkan Panjang: ");
p = input.nextInt();
System.out.print("\nMasukkan Lebar: ");
l = input.nextInt();
System.out.print("\nMasukkan Tinggi: ");
t = input.nextInt();
L = hitungLuas(p,l);
System.out.println("\nLuas Persegi Panjang Adalah " + L);

vol = hitungVolume(t,p,l);
System.out.println("Volume Balok Adalah " + vol);

```

    Masukkan Panjang: 3
    
    Masukkan Lebar: 3
    
    Masukkan Tinggi: 3
    
    Luas Persegi Panjang Adalah 9
    Volume Balok Adalah 27


### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!


```Java
// Jawaban Nomor 1
parameter yang terdapat didalam fungsi hitungLuas yaitu untuk membuat fungsi perkalian dengan 2 variabel yang nantinya akan diproses menggunakan variabel baru yang diinputkan(int pjg, int lb = p,l)
Parameter yang terdapat didalam fungsi hitungVolume yaitu untuk membuat fungsi perkalian dengan 3 variabel yang nantinya akan diproses menggunakan variabel baru yang diinputkan(int tinggi, int a, int b = t,p,l)
```

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!


```Java
// Jawaban Nomor 2
Dengan fungsi, karena kode program kita akan menjadi lebih rapi, serta untuk membuat rumus baru, kita hanya harus memanggil fungsi yang sudah kita buat dan hal tersebut jelas membuat waktu semakin efisien.
```

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
static int total=0, i;
static int [] isiarray (int angka){
Scanner input = new Scanner (System.in);
int array[] = new int [angka];
for (i = 0; i < array.length; i++){
System.out.println("Masukkan Data Ke-" + (i+1));
array[i]=input.nextInt();
}
return array;
}
static void tampilArray(int [] arr){
for (i=0; i<arr.length; i++){
System.out.println("Nilai Yang Anda Inputkan Ke " + (i+1));
System.out.println(arr[i]);
}
}
static int hitTot(int []arr){
for (i = 0; i<arr.length; i++){
total+=arr[i];
}
return total;
}
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Jumlah Data Yang Ingin Anda Inputkan: ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```

    Masukkan Jumlah Data Yang Ingin Anda Inputkan: 
    7
    Masukkan Data Ke-1
    1
    Masukkan Data Ke-2
    2
    Masukkan Data Ke-3
    3
    Masukkan Data Ke-4
    4
    Masukkan Data Ke-5
    5
    Masukkan Data Ke-6
    6
    Masukkan Data Ke-7
    7
    Nilai Yang Anda Inputkan Ke 1
    1
    Nilai Yang Anda Inputkan Ke 2
    2
    Nilai Yang Anda Inputkan Ke 3
    3
    Nilai Yang Anda Inputkan Ke 4
    4
    Nilai Yang Anda Inputkan Ke 5
    5
    Nilai Yang Anda Inputkan Ke 6
    6
    Nilai Yang Anda Inputkan Ke 7
    7
    Total nilai = 28


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!


```Java
// Jawaban nomor 1
Karena fungsi tampil array tidak menampung nilai dan hanya menampilkan nilai, sedangkan fungsi isiarray dan hitTot fungsinya yiatu menampung nilai
```

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
tidak bisa, karena akan terjadi error
```


```Java
// Contoh Program Jika int diganti dengan void
static int total=0, i;
static void [] isiarray (int angka){
Scanner input = new Scanner (System.in);
int array[] = new int [angka];
for (i = 0; i < array.length; i++){
System.out.println("Masukkan Data Ke-" + (i+1));
array[i]=input.nextInt();
}
return array;
}
static void tampilArray(int [] arr){
for (i=0; i<arr.length; i++){
System.out.println("Nilai Yang Anda Inputkan Ke " + (i+1));
System.out.println(arr[i]);
}
}
static void hitTot(int []arr){
for (i = 0; i<arr.length; i++){
total+=arr[i];
}
return total;
}
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Jumlah Data Yang Ingin Anda Inputkan: ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```


    |   static void [] isiarray (int angka){

    illegal start of expression

    

    |   static void [] isiarray (int angka){

    ';' expected

    

    |   static void [] isiarray (int angka){

    '.class' expected

    

    |   static void [] isiarray (int angka){

    ';' expected

    

    |   static void [] isiarray (int angka){

    unexpected type

      required: value

      found:    class

    

    |   int array[] = new int [angka];

    cannot find symbol

      symbol:   variable angka

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
Scanner input = new Scanner (System.in);
System.out.print("Masukkan Angka Ke-1: ");
int kesatu = input.nextInt();
System.out.print("Masukkan Angka Ke-2: ");
int kedua = input.nextInt();
System.out.print("Masukkan Angka Ke-3: ");
int ketiga = input.nextInt();
static int Max3(int bil1, int bil2, int bil3){
int i, max = 0;
        if (bil1 > max){
            max = bil1;
        } if(bil2 > max){
           max = bil2;
        } if (bil3 > max){
            max = bil3;
        }
    return max;
}
int terbesar = Max3(kesatu, kedua, ketiga);
System.out.print("Nilai Terbesar Adalah: " + terbesar);
```

    Masukkan Angka Ke-1: 2
    Masukkan Angka Ke-2: 1
    Masukkan Angka Ke-3: 1
    Nilai Terbesar Adalah: 2


```Java
// Penjelasan Soal Nomor 1
Pertama user diminta menginputkan 3 nilai. Lalu 3 nilai tersebut akan dipindah variabelnya menjadi variabel di dalam fungsi "Max3", serta akan dipindah juga menjadi 1 variabel yang akan digunakan untuk mengeluarkan output nantinya. Setelah itu, Bilangan akan diseleksi sesuai dengan yang terbesar. Jika sudah menemukan bilangan terbesar, maka sistem akan mengeluarkan output nilai terbesar pad ketiga bilangan tersebut
```

# 2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
int[][] porsi = {
    {20, 15, 35, 24, 70},
    {30, 40, 10, 28, 35},
    {5, 10, 50, 48, 15}
};
String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
String[] makanan = {"Nasi Goreng", "Soto", "Sate"};
static void menuFavorit(){
int favorit = 0;
int max = 0;
for(int i = 0; i < makanan.length; i++){
        if(porsi[i][1] > max){
            max = porsi[i][1];
            favorit = (int) i;
        }
        
}
System.out.println("Makanan Favorit Di Hari Selasa Adalah " + makanan[favorit]);
}
static void menuFavorit1(){
int favorit1 = 0;
int max1 = 0;
for(int j = 0; j < makanan.length; j++){
        if(porsi[j][4] > max1){
            max1 = porsi[j][4];
            favorit1 = (int) j;
        }
        
}
System.out.println("Makanan Favorit Di Hari Jumat Adalah " + makanan[favorit1]);
}
static void pemasukan(){
int totalPemasukan = 0;
int jumlahNasgor = 0;
int jumlahSoto = 0;
int jumlahSate = 0;
int nasGor = 20000;
int Soto = 15000;
int Sate = 25000;
for(int i = 0; i < porsi[0].length; ++i){
jumlahNasgor += porsi[0][i];
jumlahSoto += porsi[1][i];
jumlahSate += porsi[2][i];
}
int pemasukanNasgor = jumlahNasgor * nasGor;
int pemasukanSoto = jumlahSoto * Soto;
int pemasukanSate = jumlahSate * Sate;
int pemasukanTotal = pemasukanNasgor + pemasukanSoto + pemasukanSate;
System.out.println("Pemasukan Restoran Tersebut Dari Senin Sampai Jumat Adalah: Rp." + pemasukanTotal);
}
static void terjual(){
int jumlahNasgor = 0;
int jumlahSoto = 0;
int jumlahSate = 0;
for(int i = 0; i < porsi[0].length; ++i){
jumlahNasgor += porsi[0][i];
jumlahSoto += porsi[1][i];
jumlahSate += porsi[2][i];
}
System.out.println("Jumlah Nasi Goreng Yang Terjual Adalah " + jumlahNasgor + " porsi");
System.out.println("Jumlah Soto Yang Terjual Adalah " + jumlahSoto + " porsi");
System.out.println("Jumlah Sate Yang Terjual Adalah " + jumlahSate + " porsi");
}

menuFavorit();
menuFavorit1();
pemasukan();
terjual();
```

    Makanan Favorit Di Hari Selasa Adalah Soto
    Makanan Favorit Di Hari Jumat Adalah Nasi Goreng
    Pemasukan Restoran Tersebut Dari Senin Sampai Jumat Adalah: Rp.8625000
    Jumlah Nasi Goreng Yang Terjual Adalah 164 porsi
    Jumlah Soto Yang Terjual Adalah 143 porsi
    Jumlah Sate Yang Terjual Adalah 128 porsi


Penjelasan: Pada kode program diatas pertama tama menulis array pada program, lalu dari menu favorit (selasa dan jumat), memproses data menggunakan looping dengan deklarasi max = 0, jika angka yang tersedia lebih besar dari max, maka angka tersebut akan menggantikan nilai max, begitu seterusnya. Lalu setelah menemukan angka, maka posisi tersebut diganti dengan posisi string(makanan), lalu membuat print out dengan String(makanan), berikut berlaku untuk selasa dan jumat. Lalu, dari pemasukan restoran tersebut Saya menghitung satu per satu jenis makanan dengan menggunakan looping penjumlahan, lalu dikalikan dengan harga masing masing makanan. Setelah itu harga dijumlahkan dan menghasilkan print out berupa harga total makanan. Kemudian jumlah makanan yang terjual menggunakan cara yang hampir sama dengan harga total, namun lebih sederhana. Setiap makanan dimasukkan di sebuah looping untuk dijumlah total dari suatu jenis makanan tersebut, lalu setelah menemukan jumlah total ketiga makanan tersebut, sistem akan mengeluarkan print out berupa jumlah total makanan, yaitu jumlah total nasi goreng, jumlah total soto, dan jumlah total sate. Setelah itu kode program berhenti dan selesai.
