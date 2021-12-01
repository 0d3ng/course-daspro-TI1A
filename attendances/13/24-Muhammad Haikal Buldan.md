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
static void beriSalam(){
    System.out.println("Halo ! Selamat Pagi");
} 
beriSalam();
```

3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
static void beriSalam(){
    System.out.println("Halo ! Selamat Pagi");
} 

static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}

beriSalam();
String salam = "Selamat datang di pemrograman Java";
beriUcapan(salam);
```

    Halo ! Selamat Pagi
    Selamat datang di pemrograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

Jawab :

beriSalam berfungsi sebagai fungsi yang nantinya ketika dipanggil akan menampilkan Halo ! Selamat Pagi yang mana tidak terdapat parameter didalamnya

beriUcapan berfungsi sebagai fungsi yang nantinya ketika dipanggil akan menampilkan Selamat datang di pemrograman Java dengan bantuan parameter didalamnya

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

Jawab :

Dalam pemanggilan fungsi void yang berparameter ditandai dengan adanya sebuah parameter di dalam fungsi void tersebut, seperti "beriUcapan(String ucapan);" dan sebaliknya seperti "beriSalam();" yang ada dalam program diatas

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

int luasan = luasPersegi(5);
System.out.println("Luas Persegi dengan panjang sisi 5 = " + luasan);
```

#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

Jawab :

Karena disini luasan berfungsi sebagai penampungan nilai yang merupakan hasil dari luas persegi yang ada didalam fungsi luasPersegi atau yang akan direturn sebagai luasPersegi. 

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

Jawab :

Fungsinya memunculkan hasil operasi rumus luas sebagai fungsi luasPersegi

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
import java.util.Scanner;
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

Scanner haikal = new Scanner(System.in);
int si, Luas;
System.out.print("Masukkan sisi : ");
si = haikal.nextInt();
Luas = luasPersegi(si);
System.out.println("Luas Persegi dengan sisi " + si + " = " + Luas);
```

    Masukkan sisi : 2
    Luas Persegi dengan sisi 2 = 4


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
System.out.println("Masukkan Nilai 1 : ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2 : ");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);

```

#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
static int Kali(int M, int H) {
    int B;
    B = Kurang(M, H) * Kurang(H, M);
    return B - Kurang(M * H, H * M);
}

static int Kurang(int A, int B) {
    int X;
    
    A += 7;
    B += 4;
    
    return A - B;
}

int nilaiPertama, nilaiKedua;
Scanner haikal = new Scanner(System.in);

System.out.print("Silahkan memasukkan nilai pertama : ");
nilaiPertama = haikal.nextInt();
System.out.print("Silahkan memasukkan nilai kedua: ");
nilaiKedua = haikal.nextInt();

int total = Kali(nilaiPertama, nilaiKedua);
System.out.println("Hasil " + total);
```

    Silahkan memasukkan nilai pertama : 12
    Silahkan memasukkan nilai kedua: 13
    Hasil 5


# 2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

### Percobaan 4: Mengubah Program Tidak Menggunakan Fungsi dan Menggunakan Fungsi
Pada Percobaan 4, kode program yang dibuat digunakan untuk menghitung luas persegi panjang dan volume balok tanpa menggunakan fungsi dan dengan menggunakan fungsi.
1. Import dan deklarasikan Scanner dengan nama **input**
![Gambar 9](images/4.1.png)

2. Buatlah inputan panjang, lebar, dan tinggi 
![Gambar 10](images/4.2.png)

3. Hitung luas persegi panjang dan volume balok
![Gambar 10](images/4.3.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);

int p, l, t, L, vol;

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

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
static int hitungLuas (int p, int l){
    int Luas = p * l;
    return Luas;
}

static int hitungVolume (int t, int a, int b){
    int Volume = hitungLuas(a, b) * t;
    return Volume;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

int p, l, t, L, vol;

System.out.println("Masukkan panjang");
p = input.nextInt();
System.out.println("Masukkan lebar");
l = input.nextInt();
System.out.println("Masukkan tinggi");
t = input.nextInt();

L = hitungLuas(p,l);

System.out.println("Luas Persegi panjang adalah " + L);

vol = hitungVolume(t, p, l);

System.out.println("Volume balok adalah " + vol);
```

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Jawab :

Parameter tersebut digunakan untuk memberikan inisialisasi dalam fungsi yang nantinya akan digunakan dalam penghitungan rumus luas dan volume

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Jawab :

Menurut saya pribadi, penggunaan fungsi dalam program diatas bisa dibilang sedikit rumit apabila hanya digunakan untuk satu kali program tapi jika digunakan dalam beberapa program maka fungsi tersebut akan sangat membantu.

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
static int total = 0,i;

static int [] isiarray (int angka){
    Scanner input = new Scanner (System.in);
    int array [] = new int[angka];
    for (i = 0; i < array.length; i++){
        System.out.println("Masukkan data ke- " + i);
        array[i]=input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for (i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke- " + i);
        System.out.println(arr[i]);
    }
}

static int hitTotal(int []arr ){
    for (i = 0; i < arr.length; i++){
        total += arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);


System.out.println("Masukkan jumlah data yang ingin anda inputkan : ");
int jum = input.nextInt();
int [] dataArray = isiarray(jum);
tampilArray(dataArray);
total = hitTotal(dataArray);
System.out.println("Total nilai = "+ total);
```

#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

Jawab :

Karena dalam void tidak terdapat return sedangkan yang int terdapat command return didalamnya

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

Jawab :

tidak bisa karena, dalam isiArray tersebut mengandung array yang bersifat harus diterapkan dengan int, yang mana jika ingin menggunakan void harus dijabarkan satu satu arraynya


```Java
static int array[];
static void isiArray(int angka) {
    Scanner haikal = new Scanner(System.in);
    int array[] = new int[angka];
    for(int i = 0; i < array.length; i++) {
        System.out.print("Masukkan data ke-"+i+": "); 
        array[i] = haikal.nextInt();
    }
}
static void tampilArray(int []arr) {
    for(int i = 0; i < arr.length; ++i) {
        System.out.print("Nilai yang anda inputkan ke-" + i + ": ");
        System.out.println(arr[i]);
    }
}
static void hitTot(int []arr) {
    for(int i = 0; i < arr.length; ++i) {
        total += arr[i];
    }
    System.out.println(total);
}
import java.util.Scanner;
Scanner haikal = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = haikal.nextInt();
isiArray(jum);
tampilArray(array);
System.out.print("Total nilai adalah ");
hitTot(array);
```

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
import java.util.Scanner;
int max = 0;
static int Max(int bilPertama, int bilKedua, int bilKetiga){
    if(bilPertama > max){
        max = bilPertama;
    }
    if(bilKedua > max){
        max = bilKedua;
    }
    if(bilKetiga > max){
        max = bilKetiga;
    }
    return max;
}
Scanner haikal = new Scanner(System.in);
int angkaPertama, angkaKedua, angkaKetiga;
System.out.print("Masukan bilangan pertama : ");
angkaPertama = haikal.nextInt();
System.out.print("Masukan bilangan kedua : ");
angkaKedua = haikal.nextInt();
System.out.print("Masukan bilangan ketiga : ");
angkaKetiga = haikal.nextInt();
max = Max(angkaPertama, angkaKedua, angkaKetiga);
System.out.println("Bilangan yang terbesar adalah: " + max);
```

    Masukan bilangan pertama : 12
    Masukan bilangan kedua : 12
    Masukan bilangan ketiga : 12
    Bilangan yang terbesar adalah: 12


Penjelasan singkat :

Kode program diatas berfungsi untuk mencari nilai terbesar dari nilai yang diinputkan oleh pengguna, yang mana menggunakan static int Max sebagai fungsi untuk menyimpan formula perulangan dalam mencari nilai terbesar yang nantinya akan dipanggil di akhir output

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
 static int [][] porsi = { 
     { 20, 15, 35, 24, 70 }, 
     { 30, 40, 10, 28, 35 }, 
     { 5, 10, 50, 48, 15 } 
 };

    static void favorit() {
        int i = 0, max = 0, indexMax = 0;
        while (i < porsi.length) {
            if (porsi[i][1] > max) {
                max = porsi[i][1];
                indexMax = i;
            }
            i++;
        }
        switch (indexMax) {
        case 0:
            System.out.println("Pada Hari Selasa Nasi Goreng adalah menu favorit");
            break;
        case 1:
            System.out.println("Pada Hari Selasa Soto adalah menu favorit");
            break;
        case 2:
            System.out.println("Pada Hari Selasa Sate adalah menu favorit");
            break;
        default:
            break;
        }
        i = 0;
        max = 0;
        do {
            if (porsi[i][4] > max) {
                max = porsi[i][4];
                indexMax = i;
            }
            ++i;
        } while (i < porsi.length);
        switch (indexMax) {
        case 0:
            System.out.println("Pada Hari Jumat Nasi Goreng adalah menu favorit");
            break;
        case 1:
            System.out.println("Pada Hari Jumat Soto adalah menu favorit");
            break;
        case 2:
            System.out.println("Pada Hari Jumat Sate adalah menu favorit");
            break;
        default:
            break;
        }
    }

    static int totalKeuntungan() {
        int nasiGoreng = 20000, soto = 15000, sate = 25000;
        byte i = 0;
        int jumlahNasGor = 0, jumlahSoto = 0, jumlahSate = 0;
        while (i < porsi[0].length) {
            jumlahNasGor += porsi[0][i];
            jumlahSoto += porsi[1][i];
            jumlahSate += porsi[2][i];
            ++i;
        }
        jumlahNasGor *= nasiGoreng;
        jumlahSate *= sate;
        jumlahSoto *= soto;

        int jumlah = jumlahNasGor + jumlahSate + jumlahSoto;
        return jumlah;
    }

    static int NasiGoreng() {
        byte i = 0;
        int jumlahNasGor = 0;
        while (i < porsi[0].length) {
            jumlahNasGor += porsi[0][i];
            ++i;
        }
        return jumlahNasGor;
    }

    static int Soto() {
        byte i = 0;
        int jumlahSoto = 0;
        while (i < porsi[0].length) {
            jumlahSoto += porsi[1][i];
            ++i;
        }
        return jumlahSoto;
    }

    static int Sate() {
        byte i = 0;
        int jumlahSate = 0;
        while (i < porsi[0].length) {
            jumlahSate += porsi[2][i];
            ++i;
        }
        return jumlahSate;
    }

        favorit();
        System.out.println();
        System.out.println("Total pembelian seminggu : " + totalKeuntungan());
        System.out.println();
        System.out.println("Total harga untuk porsi nasi goreng " + NasiGoreng());
        System.out.println("Total harga untuk porsi soto " + Soto());
        System.out.println("Total harga untuk porsi sate " + Sate());
```

Penjelasan singkat :

Kode program diatas berfungsi untuk menampilkan menu favorit di hari selasa dan jumat dengan fungsi favorit untuk menyimpan formulanya dan menghitung pemasukan restoran tersebut mulai hari senin sampai jumat dengan fungsi totalKeuntungan sebagai penyimpan formulanya dan menghitung berapa porsi yang terjual untuk masing-masing menu dengan formula NasiGoreng, Soto , Sate sebagai penyimpan formulanya yang nantinya akan dioutputkan sebagai akhir
