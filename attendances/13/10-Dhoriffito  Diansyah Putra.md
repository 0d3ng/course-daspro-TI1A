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
```
Halo! Selamat Pagi
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
static void beriUcapan(String ucapan){
  System.out.println(ucapan);
}
beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam);
```
```
Halo! Selamat Pagi
Selamat datang di pemrograman Java
```

#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

Pada fungsi beriUcapan mempunyai parameter bertipe data `String` yang dapat kita tampilkan, sedangkan pada fungsi beriSalam sebaliknya yaitu tidak mempunyai sebuah parameter

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!
a. Dengan parameter
```Java
static TipeDatakembalian namaFungsi(TiperData namaParameter,..){
  //statement
}
```
b. tanpa parameter
```Java
static TipeDatakembalian namaFungsi(){
  //statement
  //statement
}
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
  int luas = sisi*sisi;
  return luas;
}
int luasan = luasPersegi(5);
System.out.println("Luas persegi dengan sisi 5 = "+ luasan);

```
```
Luas persegi dengan sisi 5 = 25
```

#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

Karena digunakan untuk menampung hasil dari fungsi luasPersegi

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

return luas disini memiliki fungsi untuk memberikan nilai balik terhadap pemanggilan fungsi yaitu hasil operasi luas

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!

```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.print("Masukan sisi ");
int luasan = luasPersegi(sc.nextInt());
System.out.println("Luas Persegi adalah " + luasan);
```
```
Masukan sisi 
20
Luas Persegi adalah 400
```



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
  H = (C+10)%(D+19);
  return H;
}
static int Kurang(int A, int B){
  int X;
  A = A+7;
  B = B+4;
  X = Kali(A, B);
  return X;
}
int nilai1,nilai2;
Scanner sc = new Scanner(System.in);
System.out.println("Masukkan nilai 1:");
nilai1 = sc.nextInt();
System.out.println("Masukkan nilai 2:");
nilai2 = sc.nextInt();
int hasil = Kurang(nilai1,nilai2);
System.out.println("Hasil akhir adalah "+hasil);
  
```
```
Masukkan nilai 1:
50
Masukkan nilai 2:
20
Hasil akhir adalah 24
```

#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D){
int H;
H = (C + 10) % (D + 19);
H = Kurang(H);
return H;
}
static int Kurang(int A){
A += 7 + 4;
return A;
}
int nilai1, nilai2;
Scanner sc = new Scanner(System.in);
System.out.print("Masukan Nilai 1 : ");
nilai1 = sc.nextInt();
System.out.print("Masukan Nilai 2 : ");
nilai2 = sc.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah"+ hasil);
```
```
Masukan Nilai 1 : 20
Masukan Nilai 2 : 10
Hasil akhir adalah12
```

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!
a. Masukkan nilai ke var. nilai1 dan nilai2 dan
b. Panggil fungsi Kurang ke var. hasil, kemudian masing masing ditambahkam dengan 7 dan 4
c. Fungsi Kurang memanggil fungsi Kali ditambahkan nilianya dan mendapat sisa (modulus) kemudian nilai itu di return 
d. Keluarkan var. hasil

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
Scanner sc = new Scanner(System.in);

int p,l,t,L,vol;

System.out.println("Masukkan panjang");
p=sc.nextInt();
System.out.println("Masukkan lebar");
l=sc.nextInt();
System.out.println("Masukkan tinggi");
t=sc.nextInt();

L = p*l;
System.out.println("Luas Persegi Panjang adalah "+L);

vol = p*l*t;
System.out.println("Volume balok adalah" +vol);
```
```
Masukkan panjang
10
Masukkan lebar
5
Masukkan tinggi
4
Luas Persegi Panjang adalah 50
Volume balok adalah200
```

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int  hitungLuas (int pjg, int lb){
    int Luas =pjg*lb;
    return Luas;
}
static int hitungVolume(int tinggi, int a, int b){
    int volume =hitungLuas(a,b)*tinggi;
    return volume;
}
Scanner sc = new Scanner(System.in);

int p,l,t,L,vol;

System.out.println("Masukkan panjang");
p=sc.nextInt();
System.out.println("Masukkan lebar");
l=sc.nextInt();
System.out.println("Masukkan tinggi");
t=sc.nextInt();

L = hitungLuas(p,l);
System.out.println("Luas Persegi Panjang adalah "+L);

vol = hitungVolume(t,p,l);
System.out.println("Volume balok adalah" +vol);

```
```
Masukkan panjang
20
Masukkan lebar
10
Masukkan tinggi
5
Luas Persegi Panjang adalah 200
Volume balok adalah1000
```

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Fungsinya sebagai variabel sementara yang akan digantikan dengan variabel yang lainnya saat call fungsi

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Lebih efisien yang menggunakan fungsi, karena dapat memanfaatkan fungsi secara dinamis dan berulang


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
static int [] isiarray (int angka){
    Scanner sc = new Scanner(System.in);
    int array[] = new int[angka];
    for(i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke- " + i);
        array[i] = sc.nextInt();
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
    for (i = 0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = sc.nextInt();
int []dataArray = isiarray(jum);;
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai =" + total);
```
```
Masukkan jumlah data yang ingin anda inputkan: 
3
Masukkan data ke- 0
50
Masukkan data ke- 1
20
Masukkan data ke- 2
30
Nilai yang anda inputkan ke 0
50
Nilai yang anda inputkan ke 1
20
Nilai yang anda inputkan ke 2
30
Total nilai =100
```

#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

Karena pada fungsi tampilArray tidak me return nilai dari fungsi tersebut sehingga tipenya void, sedangkan fungsi isiArray dan fungsi hitTot me return nilai yang bertipe data int

2. Menurut pendapat anda apakah fungsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

Terjadi error, karena jika diubah menjadi void maka tidak bisa return nilai
```Java
// Tuliskan jawaban nomor 2
static int total = 0, i;
static void [] isiarray (int angka){
    Scanner sc = new Scanner(System.in);
    int array[] = new int[angka];
    for(i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke- " + i);
        array[i] = sc.nextInt();
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
    for (i = 0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner sc = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = sc.nextInt();
int []dataArray = isiarray(jum);;
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai =" + total);
```
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

|       int array[] = new int[angka];
cannot find symbol
  symbol:   variable angka
```

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
static int maks = 0;
static int Maks(int nilai1, int nilai2, int nilai3){
    if(maks < nilai1){
        maks = nilai1;
    }if(maks < nilai2){
        maks = nilai2;
    }if(maks < nilai3){
        maks = nilai3;
    }
    return maks;
}

System.out.print("Masukan nilai 1: ");
int angka1 = sc.nextInt();
System.out.print("Masukan nilai 2: ");
int angka2 = sc.nextInt();
System.out.print("Masukan nilai 3: ");
int angka3 = sc.nextInt();

Maks(angka1, angka2, angka3);
System.out.println("Nilai paling besar adalah : " +maks);
```
```
Masukan nilai 1: 555
Masukan nilai 2: 444
Masukan nilai 3: 333
Nilai paling besar adalah : 555
```
## Penjelasan
a. Program dibuat untuk menampilkan bilangan terbesar dari 3 bilangan
b. Fungsi pertama dengan menggunakan parameter bernama nilai1, nilai2, dan nilai 3
c. kemudian di cek di 3 kondisi dan nilainya di kembalikan
d. masukkan nilai yang ingin di input kemudian keluar nilai yang paling besar di antara ketiganya

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
int jumPorsi[][] = {
    {20, 15, 35, 24, 70},
    {30, 40, 10, 28, 35},
    {5, 10, 50, 48, 15}
   };
  
   String menuMakan[] = {"Nasi goreng","Soto","sate"};
   String days[] = {"Senin","Selasa","Rabu","Kamis","Jumat"};
  
   static void menuFav(){
     int fav =0;
     int max = 0;
     for(int i=0;i<menuMakan.length;i++){
       if(jumPorsi[i][1] > max){
         max = jumPorsi[i][1];
         fav = i;
       }
     }
     System.out.println("====Menu Favorit====\n");
     System.out.println("Makanan favorit pada hari Selasa yaitu " + menuMakan[fav]);
   }
  
   static void menuFav1(){
     int fav1 =0;
     int maks =0;
     for(int j=0;j<menuMakan.length;j++){
       if (jumPorsi[j][4]>maks){
         maks = jumPorsi[j][4];
         fav1 = j;
       }
     }
     System.out.println("Makanan favorit pada hari Jumat yaitu "+ menuMakan[fav1]);
   }
  
   static void Pendapatan(){
     
    int totPendapatan =0;
     int jumNasgor =0;
     int jumSoto =0;
     int jumSate =0;
  
     int hargaNasgor = 20000;
     int hargaSoto = 15000;
     int hargaSate = 25000;
  
     for(int i=0;i<jumPorsi[0].length;i++){
       jumNasgor = jumNasgor + jumPorsi[0][i];
       jumSoto = jumSoto + jumPorsi[1][i];
       jumSate = jumSate + jumPorsi[2][i];
     }
     int untungNasgor = jumNasgor*hargaNasgor;
     int untungSoto = jumSoto*hargaSoto;
     int untungSate = jumSate*hargaSate;
  
     int untungTot = untungNasgor+untungSoto+untungSate;
     System.out.println("====Pendapatan Rumah Makan====\n");
     System.out.println("Pendapatan Rumah Makan tersebut dari Senin-Jumat adalah Rp. "+untungTot);
   }
  
   static void menuTerjual(){
     int jumNasgor=0;
     int jumSoto=0;
     int jumSate =0;
     
     for(int i=0;i<jumPorsi[0].length;i++){
       jumNasgor = jumNasgor + jumPorsi[0][i];
       jumSoto = jumSoto + jumPorsi[1][i];
       jumSate = jumSate + jumPorsi[2][i];
     }
     System.out.println("====Jumlah Menu yang Terjual====\n");
     System.out.println("Jumlah Nasi goreng yang terjual :"+jumNasgor);
     System.out.println("Jumlah Soto yang terjual :"+jumSoto);
     System.out.println("Jumlah Sate yang terjual :"+jumSate);
   }
  
   menuFav();
   menuFav1();
   Pendapatan();
   menuTerjual();
  
```
