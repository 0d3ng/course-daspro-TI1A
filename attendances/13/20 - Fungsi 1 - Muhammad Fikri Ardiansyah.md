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

Yang beriSalam adalah fungsi bertipe void dan yang untuk yang beriUcapan adalah fungsi bertipe string.

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

Cara yaitu fungsi void berparameter tersebut adalah memberikan nilai sebelum membuat fungsinya

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 & 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan sisi persegi: ");
int sisi=input.nextInt();
static int luasPersegi(int sisi){
    int luas = sisi*sisi;
    return luas;
}
int luasan = luasPersegi(5);
System.out.println("Luas Persegi = " + luasan);
```

    Masukkan sisi persegi: 10
    Luas Persegi = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

Untuk menghitung inputan dan menjalankan sebuah rumus untuk mengetahui hasilnya

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

Ialah untuk fungsi dapat mengembalikan variabel luas

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
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

    Masukkan sisi persegi: 20
    Luas Persegi = 400


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

    Masukan Nilai 1: 30
    Masukan Nilai 2: 20
    Hasil akhir adalah -94


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

    Masukan Nilai 1: 20
    Masukan Nilai 2: 20
    Hasil akhir adalah 6


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!


```Java

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
    20
    Masukkan lebar
    10
    Masukkan tinggi
    5
    Luas Persegi panjang adalah 200
    Volumem balok adalah 1000


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
    20
    Masukkan lebar
    10
    Masukkan tinggi
    5
    Luas Persegi Panjang adalah 200
    Volume Balok adalah 1000


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

Untuk menyimpan nilai yang akan diinputkan ke fungsi

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

Fungsi karena mudah untuk dimengerti

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
    5
    Masukkan data ke- 0
    80
    Masukkan data ke- 1
    80
    Masukkan data ke- 2
    70
    Masukkan data ke- 3
    60
    Masukkan data ke- 4
    50
    Nilai yang anda inputkan ke 0
    80
    Nilai yang anda inputkan ke 1
    80
    Nilai yang anda inputkan ke 2
    70
    Nilai yang anda inputkan ke 3
    60
    Nilai yang anda inputkan ke 4
    50
    Total nilai = 340


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!


```Java
Karena nilai tersebut tidak menghasilkan nilai keluaran dari proses yang terletak didalamnya
```

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

// Tuliskan jawaban nomor 2
Tidak bisa karena fungsi isiarray dan hitTot merupakan fungsi yang dapat menghasilkan nilai keluaran dari proses 

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
public class nilaimax {
    static int Max3(int bil1, int bil2, int bil3){
        int hasil;
        if (bil1 > bil2){
            hasil = bil1;
        }
        else if (bil1 > bil3){
            hasil = bil1;
        }
        else if (bil2 > bil3){
            hasil = bil2;
        }
        else{
            hasil = bil3;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int bil1,bil2,bil3;

        bil1 = 374;
        bil2 = 553;
        bil3 = 920;

        int hasil = Max3(bil1, bil2,bil3);
        System.out.println(hasil);

    }
}
```

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class fikri {

    static void terbanyak(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println("Menu favorit adalah Nasi Goreng");
        } else if (b > a && b > c) {
            System.out.println("Menu favorit adalah Soto");
        } else {
            System.out.println("Menu favorit adalah Sate");
        }
    }

    static int total() {
        Scanner in = new Scanner(System.in);
        int nasigoreng, soto, sate, total = 0;

        System.out.print("Masukkan total porsi Nasi Goreng yang terjual : ");
        nasigoreng = in.nextInt();

        System.out.print("Masukkan total porsi Soto yang terjual        : "
                + " yang terjual        : ");
        soto = in.nextInt();

        System.out.print("Masukkan total porsi Sate yang terjual        : ");
        sate = in.nextInt();

        nasigoreng *= 20000;
        soto *= 15000;
        sate *= 25000;

        total += nasigoreng + soto + sate;
        System.out.println("Total pendapatan : " + total);
        return total;
    }

    static void porsi() {
        Scanner sc = new Scanner(System.in);
        int nasigoreng, soto, sate, total;
        System.out.print("Jumlah Nasi Goreng yang terjual : ");
        nasigoreng = sc.nextInt();
        System.out.print("Jumlah Soto yang terjual        : ");
        soto = sc.nextInt();
        System.out.print("Jumlah Sate yang terjual        : ");
        sate = sc.nextInt();

        total = nasigoreng + soto + sate;
        System.out.println("Jumlah porsi yang terjual adalah : " + total);
    }

    public static void main(String[] args) {
        int totalSenin, totalSelasa, totalRabu, totalKamis, totalJumat = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("--- Menu Favorit Hari Selasa ---");
        System.out.print("Masukkan jumlah Nasi Goreng yang terjual pada hari Selasa : ");
        int nasgor = input.nextInt();
        System.out.print("Masukkan jumlah Soto yang terjual pada hari Selasa        : ");
        int soto = input.nextInt();
        System.out.print("Masukkan jumlah Sate yang terjual pada hari Selasa        : ");
        int sate = input.nextInt();
        terbanyak(nasgor, soto, sate);
        System.out.println("");

        System.out.println("--- Menu Favorit Hari Jumat ---");
        System.out.print("Masukkan jumlah Nasi Goreng yang terjual pada hari Jumat : ");
        int nasgor2 = input.nextInt();
        System.out.print("Masukkan jumlah Soto yang terjual pada hari Jumat        : ");
        int soto2 = input.nextInt();
        System.out.print("Masukkan jumlah Sate yang terjual pada hari Jumat        : ");
        int sate2 = input.nextInt();
        terbanyak(nasgor2, soto2, sate2);
        System.out.println("");

        System.out.println("--- Menghitung Pemasukan Pada Hari Senin ---");
        totalSenin = total();
        System.out.println("");
        System.out.println("--- Menghitung Pemasukan Pada Hari Selasa ---");
        totalSelasa=total();
        System.out.println("");
        System.out.println("--- Menghitung Pemasukan Pada Hari Rabu ---");
        totalRabu = total();
        System.out.println("");
        System.out.println("--- Menghitung Pemasukan Pada Hari Kamis ---");
        totalKamis = total();
        System.out.println("");
        System.out.println("--- Menghitung Pemasukan Pada Hari Jumat ---");
        totalJumat = total();
        int totalSemua = totalSenin+totalSelasa+totalRabu+totalKamis+totalJumat;
        System.out.println("");
        System.out.println("Total pendapatan dari Senin sampai Jumat : Rp "+totalSemua);
        System.out.println("");

        System.out.println("--- Menghitung jumlah porsi Pada Hari Senin ---");
        porsi();
        System.out.println("");

        System.out.println("--- Menghitung jumlah porsi Pada Hari Selasa ---");
        porsi();
        System.out.println("");

        System.out.println("--- Menghitung jumlah porsi Pada Hari Rabu ---");
        porsi();
        System.out.println("");

        System.out.println("--- Menghitung jumlah porsi Pada Hari Kamis ---");
        porsi();
        System.out.println("");

        System.out.println("--- Menghitung jumlah porsi Pada Hari Jumat ---");
        porsi();
        System.out.println("");
    }
}
```
