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

didalam fungsi beriSalam tidak terdapat parameter sedangkan di fungsi beriUcapan ada parameter

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

Jika berparameter maka di dalam fungsi terdapat sebuah parameter contohnya "beriUcapan(String ucapan);" sedangkan yang tanpa parameter tentu saja tidak memiliki parameter didalamnya contohnya "beriSalam();"

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

luasan berfungsi sebagai penampung nilai hasil fungsi luasPersegi

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

Kegunaan return luas adalah untuk mengembalikan nilai kepada operasi sisi *sisi

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

Scanner input = new Scanner(System.in);
int s, L;
System.out.print("Masukkan sisi : ");
s = input.nextInt();
L = luasPersegi(s);
System.out.println("Luas Persegi dengan sisi " + s + " = " + L);
```

    Masukkan sisi : 7
    Luas Persegi dengan sisi 7 = 49
    

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
    H = (C + 10) % (D + 19);
    return H;
}
static int Kurang(int A, int B) {
    int X;
    A = A + 7;
    B = B + 4;
    X = Kali(A, B);
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nilai 1: ");
nilai1 = input.nextInt();
System.out.print("Masukkan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1: 1
    Masukkan Nilai 2: 2
    Hasil akhir adalah 18
    

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
System.out.print("Masukan Nilai 1: ");
nilai1 = input.nextInt();
System.out.print("Masukan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukan Nilai 1: 1
    Masukan Nilai 2: 2
    Hasil akhir adalah 14
    

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

Alurnya adalah innputkan nilai 1 dan 2. Kemudian akan memunculkan hasilnya. Fungsi kurang perhitungannya adalah A + 7 dan B + 4 contohnya 1 + 7 dan 2 + 4 maka hasilnya (8, 6). Selanjutnya di fungsi Kali ada perhitungan (C + 10) % (D + 19) C dan D adalah hasil perhitungan dari fungsi kurang jadi (8 + 10) % (6 + 19) hasilnya adalah 18.

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
System.out.print("Masukkan panjang : ");
p = input.nextInt();
System.out.print("Masukkan lebar\t : ");
l = input.nextInt();
System.out.print("Masukkan tinggi\t : ");
t = input.nextInt();

L = p * l;
System.out.println("Luas persegi panjang adalah " + L);
vol = p * l * t;
System.out.println("volume balok adalah " + vol);
```

    Masukkan panjang : 5
    Masukkan lebar	 : 4
    Masukkan tinggi	 : 3
    Luas persegi panjang adalah 20
    volume balok adalah 60
    

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
    int volume = hitungLuas(a, b) * tinggi;
    return volume;
}

Scanner input = new Scanner(System.in);
int p,l,t,L,vol;
System.out.print("Masukkan panjang : ");
p = input.nextInt();
System.out.print("Masukkan lebar\t : ");
l = input.nextInt();
System.out.print("Masukkan tinggi\t : ");
t = input.nextInt();

L = hitungLuas(p, l);
System.out.println("Luas persegi panjang adalah " + L);
vol = hitungVolume(t, p, l);
System.out.println("Volume balok adalah " + vol);
```

    Masukkan panjang : 5
    Masukkan lebar	 : 6
    Masukkan tinggi	 : 3
    Luas persegi panjang adalah 30
    Volume balok adalah 90
    

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Kegunaan parameter ini untuk menampung nilai yang digunakan untuk perhitungan luas dan volume.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Lebih efisien menggunakan fungsi karena dapat memperpendek kodingan dengan hasil output yang sama.

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
import java.util.Scanner;
static int total = 0, i;
static int [] isiArray (int angka){
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for(i = 0; i < array.length; i++){
        System.out.print("Masukkan data ke- " + i + " : ");
        array[i] = input.nextInt();
    }
    return array;
}
static void tampilArray(int [] arr){
    for(i = 0; i < arr.length; i++){
        System.out.print("Nilai yang anda inputkan ke- " + i + " : ");
        System.out.println(arr[i]);
    }
}
static int hitTot(int [] arr){
    for(i = 0; i < arr.length; i++){
        total += arr[i];
    }
    return total;
}
Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int [] dataArray = isiArray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```

    Masukkan jumlah data yang ingin anda inputkan: 5
    Masukkan data ke- 0 : 5
    Masukkan data ke- 1 : 4
    Masukkan data ke- 2 : 3
    Masukkan data ke- 3 : 2
    Masukkan data ke- 4 : 1
    Nilai yang anda inputkan ke- 0 : 5
    Nilai yang anda inputkan ke- 1 : 4
    Nilai yang anda inputkan ke- 2 : 3
    Nilai yang anda inputkan ke- 3 : 2
    Nilai yang anda inputkan ke- 4 : 1
    Total nilai = 15
    

#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

Karena Fungsi tampilArray hanya menampilkan nilai sedangkan isiArray dan hitTot menampung nilai.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
static int total = 0, i;
static void [] isiArray (int angka){
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for(i = 0; i < array.length; i++){
        System.out.print("Masukkan data ke- " + i + " : ");
        array[i] = input.nextInt();
    }
    return array;
}
static void tampilArray(int [] arr){
    for(i = 0; i < arr.length; i++){
        System.out.print("Nilai yang anda inputkan ke- " + i + " : ");
        System.out.println(arr[i]);
    }
}
static void hitTot(int [] arr){
    for(i = 0; i < arr.length; i++){
        total += arr[i];
    }
    return total;
}
Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int [] dataArray = isiArray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = " + total);
```


    |   static void [] isiArray (int angka){

    illegal start of expression

    

    |   static void [] isiArray (int angka){

    ';' expected

    

    |   static void [] isiArray (int angka){

    '.class' expected

    

    |   static void [] isiArray (int angka){

    ';' expected

    

    |   static void [] isiArray (int angka){

    unexpected type

      required: value

      found:    class

    

    |       int array[] = new int[angka];

    cannot find symbol

      symbol:   variable angka

    

    |   }

    unreachable statement

    


Tidak bisa, akan terjadi error karena void tidak bisa menggunakan return dan fungsi isiArray mempunyai parameter bertipe data integer maka tidak bisa diubah menjadi void.

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
int max = 0;
static int Max3(int bil1, int bil2, int bil3){
    if(bil1 > max){
        max = bil1;
    }
    if(bil2 > max){
        max = bil2;
    }
    if(bil3 > max){
        max = bil3;
    }
    return max;
}
Scanner input = new Scanner(System.in);
int angka1, angka2, angka3;
System.out.print("Masukan bilangan 1 : ");
angka1 = input.nextInt();
System.out.print("Masukan bilangan 2 : ");
angka2 = input.nextInt();
System.out.print("Masukan bilangan 3 : ");
angka3 = input.nextInt();
max = Max3(angka1, angka2, angka3);
System.out.println("Bilangan yang terbesar adalah: " + max);
```

    Masukan bilangan 1: 5
    Masukan bilangan 2: 3
    Masukan bilangan 3: 2
    Bilangan yang terbesar adalah: 5
    

Alurnya adalah pertama membuat input 3 bilangan kemudian ke fungsi Max3 dengan menggunakan perulangan mencari bilangan terbesar dari 3 bilangan yang telah diinputkan. Setelah ketemu maka akan mengeluarkan output bilangan terbesar.

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
static void menuFavSel(){
    int fav1 = 0;
    int max1 = 0;
    for(int a = 0; a < menu.length; a++){
        if(porsi[a][1] > max1){
            max1 = porsi[a][1];
            fav1 = a;
        }
    }
    System.out.println("Makanan favorit hari Selasa adalah " + menu[fav1]);
}  
static void menuFavJum(){
    int fav2 =0;
    int max2 =0;
    for(int b = 0; b < menu.length; b++){
        if(porsi[b][4] > max2){
            max2 = porsi[b][4];
            fav2 = b;
        }
    }
    System.out.println("Makanan favorit hari Jumat adalah " + menu[fav2]);
} 
static void pemasukan(){
    int pemNasgor, pemSoto, pemSate;
    int totalPem = 0, nasgor = 0, soto = 0, sate = 0;
    int hrgNasgor = 20000, hrgSoto = 15000, hrgSate = 25000;
    for(int c = 0; c < porsi[0].length; c++){
        nasgor = nasgor + porsi[0][c];
        soto = soto + porsi[1][c];
        sate = sate + porsi[2][c];
    }
    pemNasgor = nasgor * hrgNasgor;
    pemSoto = soto * hrgSoto;
    pemSate = sate * hrgSate;
    totalPem = pemNasgor + pemSoto + pemSate;
    System.out.println("Pemasukan Restoran dari senin sampai jumat yaitu Rp. " + totalPem);
}  
static void terjual(){
    int nasgor = 0, soto = 0, sate = 0;
    for(int d = 0; d < porsi[0].length; d++){
        nasgor = nasgor + porsi[0][d];
        soto = soto + porsi[1][d];
        sate = sate + porsi[2][d];
    }
    System.out.println("Total Nasi goreng yang terjual : " + nasgor);
    System.out.println("Total Soto yang terjual : " + soto);
    System.out.println("Total Sate yang terjual : " + sate);
} 
menuFavSel();
menuFavJum();
pemasukan();
terjual();

```

    Makanan favorit hari Selasa adalah Soto
    Makanan favorit hari Jumat adalah Nasi goreng
    Pemasukan Restoran dari senin sampai jumat yaitu Rp. 8625000
    Total Nasi goreng yang terjual : 164
    Total Soto yang terjual : 143
    Total Sate yang terjual : 128
    

Jadi alurnya adalah membuat array untuk porsi, menu, dan hari. Kemudian memulai fungsi menuFavSel yang didalamnya terdapat pencarian porsi terbanyak pada kolom 1 atau hari selasa dan ditampilkan. Selanjutnya lanjut ke fungsi menuFavJum yang sama seperti fungsi menuFavSel namun di fungsi ini melakukan pencarian porsi terbanyak pada kolom 4 atau hari jumat dan ditampilkan. Selanjutnya lanjut ke fungsi pemasukan yang didalamnya terdapat perhitungan total pemasukan yang kemudian ditampilkan. Kemudian yang terakhir lanjut ke fungsi terjual dimana didalamnya ada perhitungan berapa banyak porsi dari ketiga menu yang telah terjual dan kemudian di tampilkan.
