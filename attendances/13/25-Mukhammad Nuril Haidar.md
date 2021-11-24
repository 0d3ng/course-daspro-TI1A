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

- Pada fungsi beriSalam terdapat parameter, sedangkan pada fungsi beriUcapan tidak terdapat parameter

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

- Jika ada parameternya maka parameter tersebut diisi didalam kurungnya, jika tidak ada parameter maka dalam kurung tersebut kosong

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
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

- Karena luasan berfungsi untuk menampung hasil dari fungsi luasPersegi

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

- Untuk mengemembalikan hasil dari operasi luas

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}

Scanner input = new Scanner(System.in);
System.out.println("Masukkan Sisi : ");
int i = input.nextInt();
int luasan = luasPersegi(i);
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Masukkan Sisi : 
    5
    Luas Persegi dengan sisi 5 = 25
    

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
import java.util.Scanner;
static int Kali(int c, int d){
    int h;
    h = (c + 10) % (d + 19);
    return h;
}

static int Kurang(int a, int b){
    int x;
    a = a+7;
    b = b+4;
    x = Kali(a, b);
    return x;
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Nilai 1 : ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2 : ");
nilai2 = input.nextInt();

int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1 : 
    5
    Masukkan Nilai 2 : 
    4
    Hasil akhir adalah 22
    

#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
static int Kurang(int a, int b){
    int x;
    a = a+10;
    b = b+19;
    x = a % b;
    return x;
}

static int Kali(int c, int d){
    int h;
    h = Kurang(c+7, d+4);
    return h;
}

int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Nilai 1 : ");
nilai1 = input.nextInt();
System.out.println("Masukkan Nilai 2 : ");
nilai2 = input.nextInt();

int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan Nilai 1 : 
    5
    Masukkan Nilai 2 : 
    4
    Hasil akhir adalah 22
    

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

Pertama variabel a + 7 dan variabel b + 4, kemudian hasil tersebut akan di proses di function kali yang nantinya hasil dari variabel a akan + 10 dan hasil dari variabel b + 19. Dan hasil dari pertambahan tersebut akan dicari modulusnya

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
import  java.util.Scanner;
Scanner input = new Scanner(System.in);

int p,l,t,L,vol;
System.out.println("Masukkan Panjang : ");
p = input.nextInt();
System.out.println("Masukkan Lebar : ");
l = input.nextInt();
System.out.println("Masukkan Tinggi : ");
t = input.nextInt();

L = p*l;
System.out.println("Luas Persegi Panjang Adalah " + L);
vol = p*l*t;
System.out.println("Volume Balok Adalah " + vol);
```

    Masukkan Panjang : 
    12
    Masukkan Lebar : 
    12
    Masukkan Tinggi : 
    12
    Luas Persegi Panjang Adalah 144
    Volume Balok Adalah 1728
    

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
import java.util.Scanner;
static int hitungLuas(int p, int l){
    int L = p*l;
    return L;
}

static int hitungVolume(int p, int l, int t){
    int vol = p*l*t;
    return vol;
}

int p, l, t, L, vol;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Panjang : ");
p = input.nextInt();
System.out.println("Masukkan Lebar : ");
l = input.nextInt();
System.out.println("Masukkan Tinggi : ");
t = input.nextInt();

L = hitungLuas(p,l);
System.out.println("Luas Persegi Panjang Adalah : " + L);
vol = hitungVolume(p,l,t);
System.out.println("Luas Persegi Panjang Adalah : " + vol);
```

    Masukkan Panjang : 
    12
    Masukkan Lebar : 
    13
    Masukkan Tinggi : 
    14
    Luas Persegi Panjang Adalah : 156
    Luas Persegi Panjang Adalah : 2184
    

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

- Parameter berguna untuk menampung sebuah nilai yang nanti akan diproses di dalam function hitungLuas dan hitungVolume

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

- Menurut saya lebih efisien menggunakan fungsi karena nantinya dapat akan ditentukan di akhir yang artinya dapat digunakan di banyak kodingan tanpa harus mengulang kodingan yang sama lagi

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
Scanner input = new Scanner(System.in);

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
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}
static int hitTot( int []arr ){
    for(i=0; i<arr.length; i++){
        total+=arr[i];
        
    }
    return total;
}

System.out.println("Masukkan jumlah data yang ingin anda inputkan : ");
int jum=input.nextInt();
int[]dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai "+ total);
```

    Masukkan jumlah data yang ingin anda inputkan : 
    3
    Masukkan data ke- 0
    1
    Masukkan data ke- 1
    2
    Masukkan data ke- 2
    3
    Nilai yang anda inputkan ke 0
    1
    Nilai yang anda inputkan ke 1
    2
    Nilai yang anda inputkan ke 2
    3
    Total nilai 6
    

#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

- Karena function tampilArray berguna untuk menampilkan saja, sedangkan function isiArray dan hitTot berfungsi untuk menampung nilai

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);

static int total=0,i;
static void isiarray (int [] array){
    Scanner input = new Scanner (System.in);
    
    for (i=0;i<array.length; i++){
     System.out.println("Masukkan data ke- "+i);
        array[i]=input.nextInt();
    }
}

static void tampilArray(int [] arr){
    for(i=0; i<arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke "+i);
        System.out.println(arr[i]);
    }
}

static void hitTot( int [] arr ){
    for(i=0; i<arr.length; i++){
        total+=arr[i];
        
    }
    System.out.println("Total nilai " + total);
}

System.out.println("Masukkan jumlah data yang ingin anda inputkan : ");
int jum=input.nextInt();

int[]dataArray=isiarray(jum);
tampilArray(dataArray);
hitTot(dataArray);
```
    Masukkan jumlah data yang ingin anda inputkan : 
    3
    Masukkan data ke- 0
    1
    Masukkan data ke- 1
    2
    Masukkan data ke- 2
    3
    Nilai yang anda inputkan ke 0
    1
    Nilai yang anda inputkan ke 1
    2
    Nilai yang anda inputkan ke 2
    3
    Total nilai 6
    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int Max3(int bil1, int bil2, int bil3){
    int bil[] = {bil1, bil2, bil3};
    int max = 0;
    for(int i = 0; i < bil.length; i++){
        if(bil[i] > max){
            max = bil[i];
        }
    }
    return max;
}

System.out.print(Max3(33, 24, 55));
```

    55

- kode tersebut digunakan untuk menampilkan sebuah bilangan terbesar dari array 1 dimensi. Cara untuk mencarinya adalah jika pada saat perualangan array dan array tersebut lebih besar dari hasil perulangan array sebelumnya maka dianggap yang paling besar

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
int data[][] = {
    {20, 15, 35, 24, 70},
    {30, 40, 10, 28, 35},
    {5, 10, 50, 48, 15}};
String hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
String makanan[] = {"Nasi Goreng", "Soto", "Sate"};

static void fav(){
    int a = 0, b = 0, maxS = 0, maxJ = 0;
    for(int i = 0; i < data.length; i++){
        if(data[i][1] > maxS){
            maxS = data[i][1];
            a = i;
        }
    
        if(data[i][4] > maxJ){
            maxJ = data[i][4];
            b = i;
        }
    }
    System.out.println("Makanan Favorit Hari Selasa Adalah " + makanan[a]);
    System.out.println("Makanan Favorit Hari Jumat Adalah " + makanan[b]);
}

static void jumlah(){
    int totalNasi = 0, totalSoto = 0, totalSate = 0;
    for (int j = 0; j < data[0].length; j++){
        totalNasi += data[0][j];
        totalSoto += data[1][j];
        totalSate += data[2][j];
    }
    int hasilNasi = totalNasi * 20000;
    int hasilSoto = totalSoto * 15000;
    int hasilSate = totalSate * 25000;
    int totalHasil = hasilNasi + hasilSoto + hasilSate;
    System.out.println("Jumlah Pemasukan dari Senin - Jum'at adalah " + totalHasil);
    System.out.println("Total Penjualan Nasi Goreng dari Senin - Jum'at adalah " + totalNasi);
    System.out.println("Total Penjualan Soto dari Senin - Jum'at adalah " + totalSoto);
    System.out.println("Total Penjualan Sate dari Senin - Jum'at adalah " + totalSate);
}

fav();
jumlah();
```

    Makanan Favorit Hari Selasa Adalah Soto
    Makanan Favorit Hari Jumat Adalah Nasi Goreng
    Jumlah Pemasukan dari Senin - Jum'at adalah 8625000
    Total Penjualan Nasi Goreng dari Senin - Jum'at adalah 164
    Total Penjualan Soto dari Senin - Jum'at adalah 143
    Total Penjualan Sate dari Senin - Jum'at adalah 128
    

- Pada function pertama digunakan untuk mencari paling laris dengan menggunakan cara seperti tugas nomer 1 yaitu mencari yang terbesar. Sedangkan untuk function ke 2 untuk mencari jumlah pemasukkan dari senin-jum'at maka pertama-tama harus mencari total dari setiap makanan, maka dari itu digunakan perulangan pada array, untuk mencari jumlah nasi goreng maka mencari array index baris ke 0 dan seterusnya. Setelah itu hasil dari jumlah tersebut dikalikan dengan harganya.
