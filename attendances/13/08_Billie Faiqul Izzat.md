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
String salam = "Selamat datang di pemograman Java";
beriUcapan(salam);
```

    Halo! Selamat Pagi
    Selamat datang di pemograman Java


#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

perbedaanya adalah pada beriSalam tidak menggunakan parameter sedangkakn beriUcapan menggunakan prameter

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

fungsi void yang menggunakan parameter, kita membuat parameter bernama ucapan dengan tipe String, Sehingga kita bisa menggunakan variabel ucapan di dalam fungsi dan variabel yang dipanggil harus memiliki tipe data yang sama dengan parameternya karna kita menggunakan string jadi saat dipanggil harus mengnakan string.
fungsi void tanpa parameter, cukup dengan menuliskan nama fungsi itu secara lengkap.


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

untuk menampung hasil yang di kembalikan luas persegi, oleh karena itu kita kita harus membuat variabel yang bertipe data sama yaitu integer

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

return luas digunakan untuk mengembalikan hasil pengoprasian variabel luas

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
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
    H = (C+10) % (D + 19);
    return H;
}
static int Kurang (int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = Kali(A, B);
    return X;
}
int nilai1, nilai2;
Scanner input =new Scanner (System.in);
System.out.println("Masukkan Nilai 1:");
nilai1=input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2=input.nextInt();
int hasil = Kurang (nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1:
    28
    Masukkan Nilai 2:
    13
    Hasil akhir adalah 9


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D){
    int H;
    C = C + 10;
    D = D + 19;
    H = Kurang(C, D);
    return H;
}
static int Kurang (int A, int B){
    int X;
    A = A + 7;
    B = B + 4;
    X = (A%B);
    return X;
}
int nilai1, nilai2;
Scanner input =new Scanner (System.in);
System.out.println("Masukkan Nilai 1:");
nilai1=input.nextInt();
System.out.println("Masukkan Nilai 2:");
nilai2=input.nextInt();
int hasil = Kali (nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1:
    4
    Masukkan Nilai 2:
    4
    Hasil akhir adalah 21


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

    pertama membuat fungsi kali yang memiliki dua parameter betipe data integer yaitu c dan d . parameter c kita tambah 10 dan parameter d kita tambah 19. dua parameter yang telah ita oprasikan kita masukkan ke fungsi kurang.

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
System.out.println("Masukkan Panjang");
p=input.nextInt();
System.out.println("Masukkan Lebar");
l=input.nextInt();
System.out.println("Masukkan Tinggi");
t=input.nextInt();

L=p*l;
System.out.println("Luas Persegi panjang adalah "+L);

vol=p*l*t;
System.out.println("Volume Balok adalah "+vol);
```

    Masukkan Panjang
    4
    Masukkan Lebar
    5
    Masukkan Tinggi
    3
    Luas Persegi panjang adalah 20
    Volume Balok adalah 60


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas(int pjg, int lb){
    int Luas=pjg*lb;
    return Luas;
}
static int hitungVolume(int tinggi, int a, int b){
    int volume= hitungLuas(a,b)*tinggi;
    return volume;
}
Scanner input = new Scanner(System.in);
int p,l,t,L,vol;
System.out.println("Masukkan Panjang");
p=input.nextInt();
System.out.println("Masukkan Lebar");
l=input.nextInt();
System.out.println("Masukkan Tinggi");
t=input.nextInt();

L=p*l;
System.out.println("Luas Persegi panjang adalah "+L);

vol=p*l*t;
System.out.println("Volume Balok adalah "+vol);
```

    Masukkan Panjang
    4
    Masukkan Lebar
    2
    Masukkan Tinggi
    4
    Luas Persegi panjang adalah 8
    Volume Balok adalah 32


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

parameter tersebut digunakan untuk menjadi nilai nilai yang akan dioprasikan di perhitungan luas dan volume

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

menurut saya menggunakan fungsi karna dapat di panggil berkali kali dengan nilai yang berbeda

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
static int[] isiarray (int angka){
    Scanner input = new Scanner (System.in);
    int array[]=new int[angka];
    for (i=0;i<array.length; i++){
     System.out.println("Masukkan data ke- "+i);
        array[i]=input.nextInt();
    }
 return array;   
}
static void tampilArray(int [] arr){
    for(i=0; i<arr.length; i++){
        System.out.println("Nilai yan anda inputkan ke  "+i);
        System.out.println(arr[i]);
    }
}
static int hitTot( int []arr ){
    for(i=0; i<arr.length; i++){
        total+=arr[i];
        
    }
    return total;
}
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan jumlah data yang ingin anda inputkan: ");
int jum=input.nextInt();
int[]dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukkan jumlah data yang ingin anda inputkan: 
    3
    Masukkan data ke- 0
    4
    Masukkan data ke- 1
    2
    Masukkan data ke- 2
    5
    Nilai yan anda inputkan ke  0
    4
    Nilai yan anda inputkan ke  1
    2
    Nilai yan anda inputkan ke  2
    5
    Total nilai = 11


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karna fungsi array hanya mengeksekusi perintah System.out.print dan tidak perlu mengembalikan nilai apapun.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

bisa, tapi kita harus membuat array di fungsi main kemudian pada fungsi isi array kita beri parameter array. fungsi isiarray meminta inputan dari user untuk dimasukkan ke dataArray


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
static int total = 0, i;

static void isiarray(int[] angka){
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < angka.length; i++){
        System.out.printf("Masukkan data ke-%d :",i);
        angka[i] = sc.nextInt();
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
    System.out.println("Total Nilai = " + total);
}

Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = new int[jum];

isiarray(dataArray);
tampilArray(dataArray);
hitTot(dataArray);
```

    Masukkan jumlah data yang ingin anda inputkan: 3
    Masukkan data ke-0 :5
    Masukkan data ke-1 :7
    Masukkan data ke-2 :8
    Nilai yang anda inputkan ke- 0
    5
    Nilai yang anda inputkan ke- 1
    7
    Nilai yang anda inputkan ke- 2
    8
    Total Nilai = 20


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 

```Java
// Tuliskan jawaban nomor 1
static int Max3(int bil1, int bil2, int bil3) {
    int max[] = {bil1, bil2, bil3};
    int tertinggi = 0;
    for(int i = 0; i < max.length; i++) {
        if ( max[i] > tertinggi) {
            tertinggi = max[i];
        }
    }
    return tertinggi;
}
System.out.print("Nilai tertinggi dari ketiga nilai adalah: " + Max3(10,8,9));
```

    Nilai tertinggi dari ketiga nilai adalah: 10

intinya tiga parameter yang telah saya tetapkan di fungsi main akan diproses di fungsi max3

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
// Tuliskan jawaban nomor 2
    static int porsi[][] = { { 20, 15, 35, 24, 70 }, { 30, 40, 10, 28, 35 }, { 5, 10, 50, 48, 15 } };

    static void fav() {
        int i = 0, max = 0, indexTertinggi = 0;
        while (i < porsi.length) {
            if (porsi[i][1] > max) {
                max = porsi[i][1];
                indexTertinggi = i;
            }
            i++;
        }
        switch (indexTertinggi) {
        case 0:
            System.out.println("Menu favorit pada hari Selasa adalah Nasi Goreng");
            break;
        case 1:
            System.out.println("Menu favorit pada hari Selasa adalah Soto");
            break;
        case 2:
            System.out.println("Menu favorit pada hari Selasa adalah Sate");
            break;
        default:
            break;
        }
        i = 0;
        max = 0;
        do {
            if (porsi[i][4] > max) {
                max = porsi[i][4];
                indexTertinggi = i;
            }
            ++i;
        } while (i < porsi.length);
        switch (indexTertinggi) {
        case 0:
            System.out.println("Menu favorit pada hari Jum'at adalah Nasi Goreng");
            break;
        case 1:
            System.out.println("Menu favorit pada hari Jum'at adalah Soto");
            break;
        case 2:
            System.out.println("Menu favorit pada hari Jum'at adalah Sate");
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

        fav();
        System.out.println();
        System.out.println("Jumlah pemasukan dari Senin sampai Jum'at adalah " + totalKeuntungan());
        System.out.println();
        System.out.println("Jumlah porsi yang terjual untuk Nasi Goreng adalah " + NasiGoreng());
        System.out.println("Jumlah porsi yang terjual untuk Soto adalah " + Soto());
        System.out.println("Jumlah porsi yang terjual untuk Sate adalah " + Sate());


```

    Menu favorit pada hari Selasa adalah Soto
    Menu favorit pada hari Jum'at adalah Nasi Goreng
    
    Jumlah pemasukan dari Senin sampai Jum'at adalah 8625000
    
    Jumlah porsi yang terjual untuk Nasi Goreng adalah 164
    Jumlah porsi yang terjual untuk Soto adalah 143
    Jumlah porsi yang terjual untuk Sate adalah 128


diawal menginisialisasi array secara global. fungsi fav() berfungsi untuk mencari menu favoit. fungsi totalKeuntungan() akan menjumlah secara horizontal kemudian tiap barisnya akan dikalikan dengan harganya.fungsi NasiGoreng(), Soto(), Sate() akan mengembalikan nilai jumlah dari tiap tiap baris yang merepresentasikan jumlah tiap menu.
