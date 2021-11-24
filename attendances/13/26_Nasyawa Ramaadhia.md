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
    System.out.println("Halo Selamat Pagi");
}
beriSalam();
```

    Halo Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam(){
    System.out.println("Halo Selamat Pagi");
}
static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}
beriSalam();
String salam ="Selamat datang di pemrogaman Java";
beriUcapan(salam);

```

    Halo Selamat Pagi
    Selamat datang di pemrogaman Java
    

#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!


2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

Jawaban :
1."beriSalam" pemanggilan fungsi seperti biasa method void yg tidak ada return (fungsi tersebut tidak mengebalikan nilai apa-apa.)
  "beriUcapan" ada parameter bertipe string dan bisa menerima argumen
2.klo tanpa berparameter biasa saja, langsung di fungsinya
klo dg parameter seperti adanya pemberian nilai variabel seperti beriUcapan

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
int luasan = luasPersegi(6);
System.out.println("Luas Persegi dengan sisi 6 = "+ luasan);
```

    Luas Persegi dengan sisi 6 = 36


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
1.adanya variabel bertipe integer luasan ini untuk memanggil nilai yg ada di fungsi luasPersegi
2.agar sebuah function bisa mengembalikan nilai kita menggunakan return luas
```


```Java
// modifikasi dengan menambahkan javautil
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Inputkan sisi : ");

int luasan = luasPersegi(sc.nextInt());

System.out.println("Luas nya = "+ luasan);
```

    Inputkan sisi : 3
    Luas nya = 9
    

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
static int Kali (int C, int D) {
    int H;
    H= (C + 10) % (D + 19);
    return H;
}

static int Kurang(int A, int B){
    int X;
    A= A+7;
    B= B+4;
    X= Kali(A,B);
    return X;
}

int nilai3, nilai4;
Scanner input =new Scanner(System.in);
System.out.println("Masukkan Nilai 3:");
nilai3=input.nextInt();
System.out.println("MAsukkan nilai 4:");
nilai4=input.nextInt();
int hasil = Kurang(nilai3, nilai4);
System.out.println("Hasil akhir adalah " +hasil);
```

    Masukkan Nilai 3:
    4
    MAsukkan nilai 4:
    6
    Hasil akhir adalah 21
    

###### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kurang (int C, int D) {
    int H;
    H= (C + 10) % (D + 19);
    return H;
}

static int Kali(int A, int B){
    int X;
    A= A+7;
    B= B+4;
    X= Kurang(A,B);
    return X;
}

int nilai3, nilai4;
Scanner input =new Scanner(System.in);
System.out.println("Masukkan Nilai 3:");
nilai3=input.nextInt();
System.out.println("MAsukkan nilai 4:");
nilai4=input.nextInt();
int hasil = Kurang(nilai3, nilai4);
System.out.println("Hasil akhir adalah " +hasil);
 // ?????? wait bingung

```

    Masukkan Nilai 3:
    3
    MAsukkan nilai 4:
    4
    Hasil akhir adalah 13
    

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

jawab : awalnya menginputkan nilai3 dan nilai4
        lalu nilai itu masuk ke parameter fungsi Kurang, yang dimana nilai3 sebagai intA nilai4 sebagai intB
        Lalu adanya operasi yg dimana dijumlahkan dg 7 dan 4
        Lalu direturn (kembali dipanggil) ke Fungsi Kali,
        disini, parameter pertama dari hasil A yg parameter kedua dari hasil B
        lalu dijumlahkan lagi lalu masing2 hasil di moduluskan.
        Dan output akhirnya yaitu hasil keseluruhan tadi.

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
p=input.nextInt();
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();

L=p*l;
System.out.println("Luas Persegi panjang adalah "+L);

vol=p*l*t;
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang
    3
    Masukkan lebar
    4
    Masukkan tinggi
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
    int Luas =pjg*lb;
    return Luas;
}

static int hitungVolume (int tinggi, int a,int b){
    int volume=hitungLuas(a,b)*tinggi;
    return volume;
}

Scanner input= new Scanner (System.in);
int p,l,t,vol;
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
    4
    Masukkan lebar
    3
    Masukkan tinggi
    5
    Luas Persegi Panjang adalah 12
    Volume Balok adalah 60
    

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!
-parameter ini untuk nilai inputan pada fungsi
-parameter di fungsi hitungLuas : pjg untuk panjang , lb untuk lebar
-parameter di fungsi hitungVolume :tinggi, a,b untuk pjg dan lebar 

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!
- mungkin lebih efisien dengan fungsi, karena terlihat rapi dan bisa untuk menghindari penulisan yang sama berulang-ulang

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


static int[] isiarray(int angka){
    Scanner sc = new Scanner(System.in);
    int array[] = new int[angka];
    for(int i = 0; i < array.length; i++){
        System.out.printf("Masukkan data ke- :",i);
        array[i] = sc.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for(i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke " +i);
        System.out.println(arr[i]);
    }
}
static int hitTot(int[] arr){
    for(int i = 0; i < arr.length; i++){
        total += arr[i];
    }
    return total;
}
import java.util.Scanner;
Scanner input= new Scanner(System.in);
System.out.println("Masukkan jumlah data yg ingin diinputkn: ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai= "+total);
```

    Masukkan jumlah data yg ingin diinputkn: 
    3
    Masukkan data ke- :4
    Masukkan data ke- :2
    Masukkan data ke- :3
    Nilai yang anda inputkan ke 0
    4
    Nilai yang anda inputkan ke 1
    2
    Nilai yang anda inputkan ke 2
    3
    Total nilai= 9
    

#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!
- karena di fungsi tampilArray tidak ada return, sedangkan di hitTot dan isiarray ada returnnya

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
static int total=0,i;


static void[] isiarray(int angka){
    Scanner sc = new Scanner(System.in);
    int array[] = new int[angka];
    for(int i = 0; i < array.length; i++){
        System.out.printf("Masukkan data ke- :",i);
        array[i] = sc.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for(i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke " +i);
        System.out.println(arr[i]);
    }
}
static void hitTot(int[] arr){
    for(int i = 0; i < arr.length; i++){
        total += arr[i];
    }
    return total;
}
import java.util.Scanner;
Scanner input= new Scanner(System.in);
System.out.println("Masukkan jumlah data yg ingin diinputkn: ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai= "+total);
```


    |   static void[] isiarray(int angka){

    illegal start of expression

    

    |   static void[] isiarray(int angka){

    ';' expected

    

    |   static void[] isiarray(int angka){

    '.class' expected

    

    |   static void[] isiarray(int angka){

    ';' expected

    

    |   static void[] isiarray(int angka){

    unexpected type

      required: value

      found:    class

    

    |       int array[] = new int[angka];

    cannot find symbol

      symbol:   variable angka

    


Ternyata terjadi Error, namun kemungkinan bisa jika returnnya dihilangi

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner sc= new Scanner (System.in);

static int max=0;
static int Max3(int bilA, int bilB, int bilC){
    if(max < bilA){
        max = bilA;
    }
    if(max < bilB){
        max = bilB;
    }
    if(max < bilC){
        max = bilC;
    }
    return max;  
}

System.out.print("Masukkan bil Ke-1: ");
int A = sc.nextInt();
System.out.print("Masukkan bil Ke-2: ");
int B = sc.nextInt();
System.out.print("Masukkan bil Ke-3: ");
int C = sc.nextInt();

int max = Max3(A, B, C);
System.out.print("Bil Terbesar Adalah: " + max);
```

    Masukkan bil Ke-1: 5
    Masukkan bil Ke-2: 2
    Masukkan bil Ke-3: 3
    Bil Terbesar Adalah: 5

Penjelasan: meinputkan 3 bil agar bisa ditentukan nilai max nya ,
dengan fungsi yang ada parameternya dan ada if untuk menentukan max nya.

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2

String[] menu = {"Nasgor", "Soto", "Sate"};
int[][] porsijual = { {20, 15, 35, 24, 70}, {30, 40, 10, 28, 35}, {5, 10, 50, 48, 15} };
String[] day = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

static void favMenuA(){
int favA = 0;
int maxA = 0;
for(int j = 0; j < menu.length; j++){
        if(porsijual[j][4] > maxA){
            maxA = porsijual[j][4];
            favA = (int) j;
        }
        
}
System.out.println("Menu Favorit Dihari Jumat Adalah " + menu[favA]);
}

static void favMenu(){
int fav = 0;
int max = 0;
for(int i = 0; i < menu.length; i++){
        if(porsijual[i][1] > max){
            max = porsijual[i][1];
            fav = (int) i;
        }
        
}
System.out.println("Menu Favorit Dihari Selasa Adalah " + menu[fav]);
}

static void masuk(){
int totalmasukan = 0;
int totNasgor = 0;
int totSoto = 0;
int totSate = 0;
int nasgor = 20000;
int soto = 15000;
int sate = 25000;
for(int i = 0; i < porsijual[0].length; ++i){
totNasgor += porsijual[0][i];
totSoto += porsijual[1][i];
totSate += porsijual[2][i];
}
int hasilNasgor = totNasgor * nasgor;
int hasilSoto = totSoto * soto;
int hasilSate = totSate * sate;
int Total = hasilNasgor + hasilSoto + hasilSate;
System.out.println("Pemasukan Resto Dari Senin - Jumat : Rp." + Total);
}
static void terjual(){
int totNasgor = 0;
int totSoto = 0;
int totSate = 0;
for(int i = 0; i < porsijual[0].length; ++i){
totNasgor += porsijual[0][i];
totSoto += porsijual[1][i];
totSate += porsijual[2][i];
}
System.out.println("Total Nasgor Terjual " + totNasgor + " porsijual");
System.out.println("Total Soto Terjual " + totSoto + " porsijual");
System.out.println("Total Sate Terjual " + totSate + " porsijual");
}

masuk();
terjual();
favMenuA();
favMenu();
```

    Pemasukan Resto Dari Senin - Jumat : Rp.8625000
    Total Nasgor Terjual 164 porsijual
    Total Soto Terjual 143 porsijual
    Total Sate Terjual 128 porsijual
    Menu Favorit Dihari Jumat Adalah Nasgor
    Menu Favorit Dihari Selasa Adalah Soto
    


