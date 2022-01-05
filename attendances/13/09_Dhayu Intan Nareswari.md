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

Jawaban :

fungsi beriSalam tidak menggunakan parameter didalamnya sedangkan fungsi beriUcapan terdapat parameter untuk mendefinisikan nilai input , dimana parameter fungsi beriUcapan bertipe String

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

//Cara pemanggilan fungsi void tidak berparameter :

public static void main(String[] args){ namaFungsi(); }

//Cara pemanggilan fungsi void berparameter :

namaFungsi(input nilai sesuai parameter);

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
System.out.println("Luas Persegi dengan sisi 5= " + luasan);
```

    Luas Persegi dengan sisi 5= 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

Jawaban :

Karena variable int luasan berfungsi untuk menampung hasil dari function luasPersegi dengan sisi yang diinputkan pada parameter sisi = 5

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

Untuk mengembalikan nilai int luas, dimana pernyataan diatas merupakan function dengan kata kunci static int dan ada pernyatan return.

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);
static int hitungLuas (int sisi){
    int Luas = sisi*sisi;
    return Luas;
}
int sisi, L;
System.out.println("Masukkan sisi");
sisi=input.nextInt();
L=hitungLuas(sisi);
System.out.println("Luas Persegi adalah "+L);
```

    Masukkan sisi
    5
    Luas Persegi adalah 25


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
    A = A + 7;
    B = B + 4;
    X = Kali(A, B);
    return X;
}
int nilai1, nilai2;
Scanner input =new Scanner (System.in);
System.out.println("Masukkan nilai 1:");
nilai1=input.nextInt();
System.out.println("Masukkan nilai 2:");
nilai2=input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);

```

    Masukkan nilai 1:
    3
    Masukkan nilai 2:
    4
    Hasil akhir adalah 20


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D){
    int H;
    C = C + 10;
    D = D + 19;
    H = Kurang (C, D);
    return H;
}
static int Kurang(int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = A - B;
    return X;
}
int nilai1, nilai2;
Scanner input =new Scanner (System.in);
System.out.println("Masukkan nilai 1:");
nilai1=input.nextInt();
System.out.println("Masukkan nilai 2:");
nilai2=input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1:
    10
    Masukkan nilai 2:
    1
    Hasil akhir adalah 3


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

Jawaban :

Inputkan nilai 1 dan nilai 2 yang bertipe integer

pada fungsi Kurang nilai1 identik dengan parameter A, nilai2 identik dengan parameter B

pada fungsi kurang, nilai A ditambah dengan 7, nilai B ditambah dengan 4

Nilai A dan B yang terbaru (hasil penjumlahan diatas) dimasukkan ke fungsi perkalian, dimana variable A identik dengan parameter C dan variable B identik dengan parameter D

Pada fungsi perkalian dilakukan proses dengan rumus, H = (C+10)%(D+19);

nilai dari variable H merupakan output dari fungsi perkalian diatas, yang hasilnya disimpan di variable X

Selanjutnya dioutputkan hasil dari fungsi Kurang yaitu variable X

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
int p, l, t, L, vol;
System.out.println("Masukkan panjang : ");
p=input.nextInt();
System.out.println("Masukkan lebar : ");
l=input.nextInt();
System.out.println("Masukkan tinggi : ");
t=input.nextInt();
L=p*l;
System.out.println("Luas Persegi panjang adalah " + L);
vol = p*l*t;
System.out.println("Volume balok adalah "+ vol)
```

    Masukkan panjang : 
    3
    Masukkan lebar : 
    4
    Masukkan tinggi : 
    5
    Luas Persegi panjang adalah 12
    Volume balok adalah 60


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
    int volume= hitungLuas (a,b)*tinggi;
    return volume;
}
Scanner input=new Scanner(System.in);
int p,l,t,L, vol;
System.out.println("Masukkan panjang");
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();
L=hitungLuas(p,l);
System.out.println("Luas Persegi panjang adalah "+L);
vol=hitungVolume(t,p,l);
System.out.println("Volume Balok adalah "+vol);
```

    Masukkan panjang
    3
    Masukkan lebar
    4
    Masukkan tinggi
    5
    Luas Persegi panjang adalah 12
    Volume Balok adalah 60


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Jawaban :

parameter pada fungsi hitungLuas untuk mendefinisikan inputan nilai pjg, lbr

parameter pada fungsi hitungVolume untuk mendefinisikan nilai input tinggi, a, b, dimana parameter a dan b akan dijalankan pada fungsi hitungLuas

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Jawaban :

Menurut pendapat saya program yang menggunakan fungsi lebih efisien karena untuk perhitungan Luas dan Volume selanjutnya tidak perlu dilakukan perulangan penulisan rumus, cukup dengan memanggil fungsi itu saja.

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
    for (i=0; i<array.length; i++){
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
    for (i=0; i<arr.length; i++){
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
    3
    Masukkan data ke- 0
    5
    Masukkan data ke- 1
    6
    Masukkan data ke- 2
    7
    Nilai yang anda inputkan ke 0
    5
    Nilai yang anda inputkan ke 1
    6
    Nilai yang anda inputkan ke 2
    7
    Total nilai = 18


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karena pada fungsi tampil array tidak diperlukan pengembalian, hanya mengoutputkan (menampilkan) nilai saja dengan perintah System.out.println, sedangkan pada fungsi isiArray dan hitTot perlu ada pengembalian nilai bertipe int. Pada fungsi array diperlukan pengembalian inputan, sedangkan pada fungsi hitTot dilakukan pengembalian total.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

// Tuliskan jawaban nomor 2


Tidak bisa karena ada pernyataan return yang harus mengembalikan suatu nilai, kecuali apabila pernyataan return pada function isiarray dan hitTot dihilangkan, seperti kode berikut ini :


```Java
static int total=0,i;
static void isiarray (int[] array){
    Scanner input = new Scanner (System.in);

    for (i=0; i<array.length; i++){
    System.out.println("Masukkan data ke- "+i);
    array[i]=input.nextInt();
    }
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static void hitTot(int []arr ){
    for (i=0; i<arr.length; i++){
            total+=arr[i];
    }
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum=input.nextInt();
int []dataArray=new int[jum];
isiarray(dataArray);
tampilArray(dataArray);
hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    3
    Masukkan data ke- 0
    6
    Masukkan data ke- 1
    7
    Masukkan data ke- 2
    8
    Nilai yang anda inputkan ke 0
    6
    Nilai yang anda inputkan ke 1
    7
    Nilai yang anda inputkan ke 2
    8
    Total nilai = 21


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3 (int bil1, int bil2, int bil3){
    int max = 0;
    if(bil1 > bil2 && bil1 > bil3){
        max = bil1;
    }else if(bil2 > bil1 && bil2 > bil3){
        max = bil2;
    }else if(bil3 > bil1 && bil3 > bil2){
        max = bil3;
    }return max;
    }
import java.util.Scanner;
Scanner sc=new Scanner(System.in);
int num1, num2, num3;
System.out.println("Masukkan bilangan pertama");
num1=sc.nextInt();
System.out.println("Masukkan bilangan kedua");
num2=sc.nextInt();
System.out.println("Masukkan bilangan ketiga");
num3=sc.nextInt();
System.out.println(Max3(num1, num2, num3));
```

    Masukkan bilangan pertama
    3737
    Masukkan bilangan kedua
    27263
    Masukkan bilangan ketiga
    2762
    27263


fungsi Max3 menggunakan pernyataan if-else if untuk mencari bilangan maksimal, lalu mengembalikan nilai bilangan maksimal tersebut. Pada kode diatas kita diperintahkan untuk menginputkan bilangan pertama, kedua, dan ketiga dimana bilangan yang telah kita inputkan akan diproses pada fungsi Max3, dan dioutputkan bilangan maksimalnya.

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.

Berikut kode dengan 2 fungsi :


```Java
int table[][] = {{20,15,35,24,70}, {30,40,10,28,35}, {5,10,50,48,15}};
String menu[] = {"Nasi goreng","Soto","Sate"};
String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat"};
int total1, total2, total3, pemasukan, jml;
static void menuFav(int table[][],String hari [],String menu[]){
    int max = 0;
    int maks;
    for(int j = 0;j < table[0].length;j++){
        max = 0;
        maks = table[0][j];
        for(int i =0;i<table.length;i++){
            if (table[i][j] > maks){
                max = i;
                maks = table[i][j];
            }
        }
        if(j==1 || j==4){
        System.out.println("menu favorit di hari " + hari[j] +" adalah " + menu[max]);
        }
    }
}menuFav(table,hari,menu);

static void pemasukan(int table[][]){
for(int i = 0;i<table.length;i++){
if(i==0){
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
total1 = jml*20000;
if(j==4){
System.out.println("Total porsi nasi goreng adalah " + jml);
}}
}if(i==1){
jml = 0;
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
total2 = jml*15000;
if(j==4){
System.out.println("Total porsi soto adalah " + jml);
}}
}if(i==2){
jml = 0;
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
total3 = jml*25000;
if(j==4){
System.out.println("Total porsi sate adalah " + jml);
}}
}
}pemasukan = total1+total2+total3;
System.out.println("Pemasukkan total dari hari Senin hingga Jum'at adalah " + pemasukan + " Rupiah");
}pemasukan(table);

```

    menu favorit di hari Selasa adalah Soto
    menu favorit di hari Jumat adalah Nasi goreng
    Total porsi nasi goreng adalah 164
    Total porsi soto adalah 143
    Total porsi sate adalah 128
    Pemasukkan total dari hari Senin hingga Jum'at adalah 8625000 Rupiah


Berikut kode dengan 3 fungsi :


```Java
int table[][] = {{20,15,35,24,70}, {30,40,10,28,35}, {5,10,50,48,15}};
String menu[] = {"Nasi goreng","Soto","Sate"};
String hari[] = {"Senin","Selasa","Rabu","Kamis","Jumat"};
int total1, total2, total3, pemasukan, jml;
static void menuFav(int table[][],String hari [],String menu[]){
    int max = 0;
    int maks;
    for(int j = 0;j < table[0].length;j++){
        max = 0;
        maks = table[0][j];
        for(int i =0;i<table.length;i++){
            if (table[i][j] > maks){
                max = i;
                maks = table[i][j];
            }
        }
        if(j==1 || j==4){
        System.out.println("menu favorit di hari " + hari[j] +" adalah " + menu[max]);
        }
    }
}menuFav(table,hari,menu);

static void pemasukan(int table[][]){
for(int i = 0;i<table.length;i++){
if(i==0){
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
total1 = jml*20000;}
}if(i==1){
jml = 0;
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
total2 = jml*15000;
}
}if(i==2){
jml = 0;
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
total3 = jml*25000;
}
}
}pemasukan = total1+total2+total3;
System.out.println("Pemasukkan total dari hari Senin hingga Jum'at adalah " + pemasukan + " Rupiah");
}pemasukan(table);

static void porsi(int table[][]){
for(int i = 0;i<table.length;i++){
jml = 0;
if(i==0){
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
if(j==4){
System.out.println("Total porsi nasi goreng adalah " + jml);
}}
}if(i==1){
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
if(j==4){
System.out.println("Total porsi soto adalah " + jml);
}}
}if(i==2){
for(int j=0; j<table[0].length; j++){
jml += table[i][j];
if(j==4){
System.out.println("Total porsi sate adalah " + jml);
}}
}
}

}porsi(table);
```

    menu favorit di hari Selasa adalah Soto
    menu favorit di hari Jumat adalah Nasi goreng
    Pemasukkan total dari hari Senin hingga Jum'at adalah 8625000 Rupiah
    Total porsi nasi goreng adalah 164
    Total porsi soto adalah 143
    Total porsi sate adalah 128

