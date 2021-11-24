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

fungsi beriSalam tidak memiliki parameter sedangkan fungsi beriUcapan memiliki satu parameter.
fungsi dari parameter ini adalah sebagai tempat data dari luar.

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

untuk fungsi tanpa parameter, pemanggilanya hanya perlu dituliskan nama fungsinya saja contohnya beruUcapan(). sedangkan untuk fungsi berparameter kita perlu juga memasukan variabel yang akan mengisi parameter tersebut contohnya beriUcapan(salam).

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

karena kita ingin mengeluarkan output hasil operasi fungsi, yakni variabel luas. namun variabel luas adalah variabel lokal sehingga tidak bisa diakses diluar fungsi, sehingga perlu meng assign hasil return fungsi ke dalam variabel baru diluar fungsi.

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

return adalah keyword untuk mengembalikan nilai setelah proses fungsi selesai. jadi pada fungsi diatas pemngembalian nilainya adalah variabel nilai.

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
// Tuliskan jawaban nomor 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);

static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}
    System.out.print("Masukan panjang sisi : ");
    int panjang = input.nextInt();
    int luasan = luasPersegi(panjang);
    System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Masukan panjang sisi : 6
    Luas Persegi dengan sisi 5 = 36


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
    X = Kali(A,B);
    return X;
}
int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.print("Masukan Nilai 1 : ");
nilai1 = input.nextInt();
System.out.print("Masukan Nilai 2 : ");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah "+ hasil);

```

    Masukan Nilai 1 : 20
    Masukan Nilai 2 : 25
    Hasil akhir adalah 37


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
    
    A = A + 7 + 4;
    return A;
}
int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.print("Masukan Nilai 1 : ");
nilai1 = input.nextInt();
System.out.print("Masukan Nilai 2 : ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah "+ hasil);

```

    Masukan Nilai 1 : 30
    Masukan Nilai 2 : 21
    Hasil akhir adalah 11


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

pertama input nilai dalam variabel nilai1 dan nilai2.
kemudian memanggil fungsi kurang ke dalam variabel hasil dengan input variabel nilai 1 dan nilai2.
fungsi kurang dijalankan disini nilai1 dan nilai2 masing-masing ditambang dengan 7 dan 4.
kemudian fungsi kurang memanggil fungsi kali. disini variabel ditambahkan nilainya lalu dimodulus. kemudian nilainya dikembalikan.
terakhir variabel hasil dikeluarkan.

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

System.out.println("Masukan panjang");
p = input.nextInt();
System.out.println("Masukan lebar");
l = input.nextInt();
System.out.println("Masukan tinggi");
t = input.nextInt();

L = p*l;
System.out.println("Luas Persegi panjang adalah " +L);

vol = p * l * t;
System.out.println("Volume balok adalah " +vol);
```

    Masukan panjang
    12
    Masukan lebar
    13
    Masukan tinggi
    5
    Luas Persegi panjang adalah 156
    Volume balok adalah 780


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas(int pnj, int lb){
    int Luas = pnj * lb;
    return Luas;
}
static int hitungVolume(int tinggi, int a, int b){
    int volume = hitungLuas(a,b)*tinggi;
    return volume;
}

Scanner input = new Scanner(System.in);
int p, l, t, L, vol;
System.out.println("Masukan panjang");
p = input.nextInt();
System.out.println("Masukan lebar");
l = input.nextInt();
System.out.println("Masukan tinggi");
t = input.nextInt();

L = hitungLuas(p,l);
System.out.println("Luas Persegi panjang adalah " +L);

vol = hitungVolume(t, p, l);
System.out.println("Volume balok adalah " +vol);
```

    Masukan panjang
    4
    Masukan lebar
    5
    Masukan tinggi
    10
    Luas Persegi panjang adalah 20
    Volume balok adalah 200


#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

fungsi dari parameter adalah sebagai variabel sementara yang nantinya akan digantikan oleh variabel lain ketika proses pemanggilan.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

keefektifan fungsi adalah relatif, jika dalam program sederhana yang hanya memerlukan operasi satu kali, pemakaian fungsi tidak memiliki perbedaan yang signifikan. namun jika proses dalam fungsi diperlukan berulang-ulang kali, maka memakai fungsi akan mempersingkat keseluruhan program sehingga juga lebih efisien.

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
static int [] isiArray (int angka){
    Scanner input = new Scanner (System.in);
    int array[] = new int[angka];
    for(i = 0; i < array.length; i++){
        System.out.println("Masukan data ke-" +i);
        array[i] = input.nextInt();
    }
    return array;
}
static void tampilArray(int [] arr){
    for(i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke " +i);
        System.out.println(arr[i]);
    }
}
static int hitTot(int []arr){
    for(i = 0; i < arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiArray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = "+ total)
```

    Masukan jumlah data yang ingin anda inputkan: 
    4
    Masukan data ke-0
    7
    Masukan data ke-1
    9
    Masukan data ke-2
    4
    Masukan data ke-3
    1
    Nilai yang anda inputkan ke 0
    7
    Nilai yang anda inputkan ke 1
    9
    Nilai yang anda inputkan ke 2
    4
    Nilai yang anda inputkan ke 3
    1
    Total nilai = 21


##### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karena fungsi tampilArray tidak memerlukan return, sedangkan fungsi isiArray dan hitTot memerlukan return dalam penggunaanya. maka dari itu fungsi isiArray dan hitTot menggunakan tipe int yang juga memerlukan return nilai. sedangkan fungsi tampilArray menggunakan tipe data void karena tipe data void tidak mengharuskan adanya return nilai.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!

akan terjadi eror karena fungsi isiArray variabelnya adalah array dengan tipe data integer, akan eror ketika diganti dengan tipe void. selain itu tipe data void tidak menggunakan keyword return.


```Java
// Tuliskan jawaban nomor 2
static int total = 0, i;
static void [] isiArray (int angka){
    Scanner input = new Scanner (System.in);
    int array[] = new int[angka];
    for(i = 0; i < array.length; i++){
        System.out.println("Masukan data ke-" +i);
        array[i] = input.nextInt();
    }
    return array;
}
static void tampilArray(int [] arr){
    for(i = 0; i < arr.length; i++){
        System.out.println("Nilai yang anda inputkan ke " +i);
        System.out.println(arr[i]);
    }
}
static void hitTot(int []arr){
    for(i = 0; i < arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

System.out.println("Masukan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiArray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai = "+ total)
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

    


## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
static int max = 0;
static int Max3(int bil1, int bil2, int bil3){
    if(max < bil1){
        max = bil1;
    }
    if(max < bil2){
        max = bil2;
    }
    if(max < bil3){
        max = bil3;
    }
    return max;
}
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka1, angka2, angka3;

System.out.print("Masukan bilangan pertama: ");
angka1 = input.nextInt();
System.out.print("Masukan bilangan kedua: ");
angka2 = input.nextInt();
System.out.print("Masukan bilangan ketiga: ");
angka3 = input.nextInt();

Max3(angka1, angka2, angka3);
System.out.println("angka terbesar adalah: " +max);

```

    Masukan bilangan pertama: 3
    Masukan bilangan kedua: 4
    Masukan bilangan ketiga: 1
    angka terbesar adalah: 4


fungsi menggunakan 3 if (bukan if else if) supaya ketiga if tersebut dijalankan.

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
// Tuliskan jawaban nomor 2
static int total, harga, x = 0, y;
static String makanan;

static void jenis(int nama){
    if(nama == 0){
        makanan = "nasi goreng";
    }else if(nama == 1){
        makanan = "soto";
    }else if(nama == 2){
        makanan = "sate";
    }
}
static void favorit (int [][] arr){
    for(int i = 0; i < arr[0].length; i++){
        x = 0;
        if(i == 1){
            
            for(int j = 0; j < arr.length; j++){
                if( arr[j][i] > x){
                    x = arr[j][i];
                    jenis(j);
                }
            }
            
            System.out.println("Makanan Favorit hari selasa adalah " +makanan);
        
        }else if(i == 4){
            
            for(int j = 0; j < arr.length; j++){
                if( arr[j][i] > x){
                    x = arr[j][i];
                    jenis(j);
                }
            }
            
            System.out.println("Makanan Favorit hari jumat adalah " +makanan);
        
        }
    }
}
static void pemasukan(int [][] arr){
     for(int i = 0; i < arr.length; i++){
         if (i == 0){
             harga = 20000;
             for(int j = 0; j < arr[0].length; j++){
                 total+= arr[i][j] * harga;
             }
         }else if(i == 1){
             harga = 15000;
             for(int j = 0; j < arr[0].length; j++){
                 total+= arr[i][j] * harga;
             }
         }else{
             harga = 25000;
             for(int j = 0; j < arr[0].length; j++){
                 total+= arr[i][j] * harga;
             }
         }
     }
}
static void hitungPorsi(int [][] arr){
     for(int i = 0; i < arr.length; i++){
         int porsi = 0;
         for(int j = 0; j < arr[0].length; j++){
             porsi+= arr[i][j];
         }
         jenis(i);
         System.out.println("banyaknya " + makanan + " yang terjual adalah " + porsi);
         
     }
}
int [][] menu = {{20, 15, 35, 24, 70},
                        {30, 40, 10, 28, 35},
                         {5, 10, 50, 48, 15}};
favorit(menu);
pemasukan(menu);
System.out.println("pemasukan restoran tersebut  adalah sebesar Rp " +total);
hitungPorsi(menu);
```

    Makanan Favorit hari selasa adalah soto
    Makanan Favorit hari jumat adalah nasi goreng
    pemasukan restoran tersebut  adalah sebesar Rp 8625000
    banyaknya nasi goreng yang terjual adalah 164
    banyaknya soto yang terjual adalah 143
    banyaknya sate yang terjual adalah 128


karena saya menjadikan isi tabel pada soal sebagai satu array 2 dimensi, saya menambahkan satu fungsi lagi intuk menentukan nama makanan, berdasarkan baris pada array.
