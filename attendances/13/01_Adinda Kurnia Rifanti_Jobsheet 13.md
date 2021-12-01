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

Perbedaan fungsi beriSalam dan beriUcapan pada praktikum 1: 
static void beriSalam(){
static void beriUcapan(String ucapan){

yaitu terletak pada parameter, pada fungsi beriSalam tidak terdapat parameter dan pada fungsi beriUcapan terdapat 1 parameter (String ucapan)

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

Contoh Fungsi void berparameter: 
beriSalam("Halo! Selamat Pagi");
Cara pemanggilan fungsi berparameter dengan menuliskan nama fungsi misal pada contoh yaitu "beriSalam" dan membuat variabel baru kemudian diisi kalimat yang diinginkan. 


Contoh Fungsi void tidak berparameter: 
beriUcapan(); 
Cara pemanggilan fungsi tanpa parameter yaitu dengan menuliskan nama fungsi saja 

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

karena variabel luasan tersebut digunakan untuk menampung nilai return (pengembalian nilai) dari fungsi luasPersegi

2. Jelaskan kegunaan return luas pada percobaan 2 diatas!

untuk mengembalikan nilai kepada pemanggil

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 3

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.print("Masukan ukuran sisi: ");
int s = input.nextInt(); 

int luasan = luasPersegi(s); 
System.out.println("Luas Persegi = " + luasan);
```

    Masukan ukuran sisi: 2
    Luas Persegi = 4


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

import java.util.Scanner; 
int nilai1, nilai2; 
Scanner input = new Scanner(System.in); 
System.out.println("Masukkan Nilai 1: "); 
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2); 
System.out.println("Hasil akhir adalah " + hasil); 
```

    Masukkan Nilai 1: 
    3
    Masukkan Nilai 2: 
    2
    Hasil akhir adalah 20


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1

import java.util.Scanner;
static int Kurang(int C, int D){
    int H;
    H = (C + 10) % (D + 19); 
    return H;
}
static int Kali(int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = Kurang(A, B);
    return X;
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai 1 : ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai 2 : ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1 : 4
    Masukkan nilai 2 : 2
    Hasil akhir adalah 21


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

Setelah diinputkan nilai 1 dan 2, program akan berjalan seperti ini: 
a. Nilai 1 akan diolah di fungsi "kali" yaitu dengan cara nilai 1 dimasukkan ke operasi A, begitupun dengan nilai 2
Jadi A = 1 + 7 = 8
B = 1 + 4 = 5 

b. Setelah kedua nilai diolah di fungsi "kali" selanjutnya diolah di fungsi "kurang", pada H = (C + 10) % (D + 19);
jadi H = (8 + 10) % (5 + 19);
H = (18) % (24) 
pada modulus, nilai yang terkecil dari kedua bilangan tersebut adalah hasil modulusnya. Jadi hasil akhirnya pada contoh percobaan 3 adalah 18. 

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
    7
    Masukkan lebar
    9
    Masukkan tinggi
    5
    Luas Persegi panjang adalah 63
    Volume balok adalah 315


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
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

System.out.println("Masukkan panjang");
p=input.nextInt(); 
System.out.println("Masukkan lebar");
l=input.nextInt(); 
System.out.println("Masukkan tinggi");
t=input.nextInt(); 

L=hitungLuas(p,l); 
System.out.println("Luas Persegi panjang adalah "+L); 

vol=hitungVolume(t,p,l); 
System.out.println("Volume balok adalah "+vol);

```

    Masukkan panjang
    7
    Masukkan lebar
    9
    Masukkan tinggi
    5
    Luas Persegi panjang adalah 63
    Volume balok adalah 315


##### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Pada fungsi hitungLuas: 
parameter pjg menampung panjang dari persegi panjang
lb menampung lebar dari persegi panjang. 

Pada fungsi hitungVolume: 
parameter tinggi menampung tinggi dari balok
sedangkan a menampung panjang dari persegi panjang alas balok 
parameter b menampung lebar dari persegi panjang alas balok.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Menurut saya, menggunakan fungsi karena jika menggunakan fungsi ini menjadi lebih efisien apalagi jika proses dalam fungsi dilakukan berulang-ulang kali, maka penggunaan fungsi sangat tepat karena dapat menjadi lebih mudah dan efisien, yaitu dalam pemanggilan fungsi, tidak perlu dilakukan secara berulang, cukup reuse saja. 

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

static int total = 0,i; 

static int [] isiarray (int angka){
    Scanner input = new Scanner(System.in); 
    int array[] = new int[angka]; 
    for (i=0; i<array.length; i++){
    System.out.println("Masukkan data ke- "+i); 
    array[i] = input.nextInt(); 
    }
    return array; 
}

static void tampilArray(int [] arr){
    for (i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i); 
        System.out.println(arr[i]); 
    }
}

static int hitTot(int [] arr ){
    for (i=0; i<arr.length; i++){
        total += arr[i]; 
    }
    return total; 
}

import java.util.Scanner; 
Scanner input = new Scanner(System.in); 
System.out.println("Masukkan jumlah data yang ingin anda inputkan: "); 
int jum = input.nextInt(); 
int []dataArray = isiarray(jum); 
tampilArray(dataArray); 
total = hitTot(dataArray); 
System.out.println("Total nilai = "+total);

```

    Masukkan jumlah data yang ingin anda inputkan: 
    2
    Masukkan data ke- 0
    5
    Masukkan data ke- 1
    2
    Nilai yang anda inputkan ke 0
    5
    Nilai yang anda inputkan ke 1
    2
    Total nilai = 7


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

Karena fungsi tampilArray tidak perlu ada nilai yang dikembalikan (return nilai dari fungsi) sehingga bertipe void, sedangkan pada fungsi isiArray dan hitTot perlu untuk mengembalikan nilai sehingga bertipe integer.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2

static int total = 0, i;
static void [] isiarray (int angka){
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for(i = 0; i<array.length; i++){
        System.out.println("Masukkan data ke- " + i);
        array[i] = input.nextInt();
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
Scanner input = new Scanner(System.in);

System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiarray(jum);
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

    

    |       int array[] = new int[angka];

    cannot find symbol

      symbol:   variable angka

    


Jadi jika diganti dengan void tidak bisa, karena terjadi error. 

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1

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

import java.util.Scanner; 
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan Bilangan 1: ");
int bil1 = sc.nextInt();
System.out.print("Masukkan Bilangan 2: ");
int bil2 = sc.nextInt();
System.out.print("Masukkan Bilangan 3: ");
int bil3 = sc.nextInt();

int maksimum = Max3(bil1, bil2, bil3);
System.out.print("Nilai maksimum diantara ketiga bilangan tersebut adalah: " + maksimum);
```

    Masukkan Bilangan 1: 300
    Masukkan Bilangan 2: 257
    Masukkan Bilangan 3: 1080
    Nilai maksimum diantara ketiga bilangan tersebut adalah: 1080

Kode program tersebut digunakan untuk mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. Pertama, diminta untuk memasukkan 3 bilangan, kemudian program akan dijalankan untuk memilih 1 bilangan terbesar dari 3 bilangan yang dimasukkan. 

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2

int[][] dataJual = {
    {20, 15, 35, 24, 70},
    {30, 40, 10, 28, 35},
    {5, 10, 50, 48, 15},
};

String[] dataHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
String[] dataMenu = {"Nasi Goreng", "Soto", "Sate"};
String menu, hari;
int total;

//menu favorit
static void favorit(){
    for(int i = 1; i < dataJual[0].length; i += 3){
        int maks = 0;
        for(int j = 0; j < dataJual.length; j++){
            if (dataJual[j][i] > maks){
                maks = dataJual[j][i];
                menu = dataMenu[j];
                hari = dataHari[i];
            } 
        }
        System.out.println("Masakan favorit hari " + hari + " adalah " + menu );
    }
}

//pemasukan
static void duit(){
    for(int i = 0; i < dataJual.length; i++){
        int totalJual = 0, totalHarga = 0;
        for(int j = 0; j < dataJual[0].length; j++){
            totalJual += dataJual[i][j];
            if(i == 0){
                totalHarga = totalJual * 20000;
            }else if(i == 1){
                totalHarga = totalJual * 15000;
            }else{
                totalHarga = totalJual * 25000;
            }
        }
        total += totalHarga;
    }
    System.out.println("Total pemasukan dari hari Senin hingga hari Jumat adalah Rp" + total);
}

//jumlah porsi
static void jumlah(){
    for(int i = 0; i < dataJual.length; i++){
        int totalJual = 0, totalHarga = 0;
        for(int j = 0; j < dataJual[0].length; j++){
            totalJual += dataJual[i][j];
        }
        menu = dataMenu[i];
        System.out.println("Banyak " + menu + " yang terjual adalah: " + totalJual + " porsi");
    }
}
favorit();
duit();
jumlah();
```

    Masakan favorit hari Selasa adalah Soto
    Masakan favorit hari Jumat adalah Nasi Goreng
    Total pemasukan dari hari Senin hingga hari Jumat adalah Rp8625000
    Banyak Nasi Goreng yang terjual adalah: 164 porsi
    Banyak Soto yang terjual adalah: 143 porsi
    Banyak Sate yang terjual adalah: 128 porsi


Pada bagian awal program terdapat data jual makanan, kemudian untuk menampilkan output yang diminta menggunakan fungsi. 
Fungsi pertama untuk menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
Fungsi kedua untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
Fungsi ketiga untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.
