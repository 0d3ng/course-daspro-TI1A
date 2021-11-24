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

fungsi beriSalam itu merupakan bagian dari pembuatan fungsi sedangkan beriUcapan merupakan pemanggilan fungsi dan pemberian nilai parameter

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

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

// jawaban no 1
karena yang pertama merupakan variable baru dari proses pengoperasian dikarenakan untuk bagian luasan memiliki integer yg berbeda dari int luas atau untuk deklarasi dari luas persegi

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

//jawaban no 2

dikarenakan untuk mengembalikkan nilai luasnya

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
H = (c + 10) % (D + 19);
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
System.out.println("Masukkan Nilai 1:");
nilai2=input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
```

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

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
l=p*l;
System.out.println("Luas Persegi panjang adalah "+L);
vol=p*l*t;
System.out.println("VOlume balok adalah "+vol);
```

    Masukkan panjang
    5
    Masukkan lebar
    7
    Masukkan tinggi
    4
    Luas Persegi panjang adalah 0
    VOlume balok adalah 700


4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
Static int hitungLuas(int pjg, int lb){
int Luas=pjg*lb;
return Luas;
}
static int hitungVolume(int tinggi, int a, int b){
int volume= hitungLuas(a,b)*tinggi;
return volume;
}
Scanner input = new Scanner (System.in);
int p,l,t,L, vol;
System.out.println("Masukkan lebar");
l=input.nextInt();
System.out.println("Masukkan tinggi");
t=input.nextInt();
L=hitungLuas(p,l);
System.out.println("Luas Persegi Panjang adalah "+L);
vol=hitungVolume(t,p,l);
System.out.println("Volume Balok adalah "+vol);
```

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

//jawaban no 1
menyesuaikan kebutuhan dari int luas dan int volume

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

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
static void tampilArray(int [] arr){
for (i=0; i<arr.length; i++){
System.out.println("Nilai yang anda inputkan ke "+i);
System.out.println(arr[i]);
}
}
static int [] isiarray (int angka){
Scanner input = new Scanner (System.in);
int array[]=new int[angka];
for (i=0;  i<array.length; i++){
System.out.println("Masukkan data ke-"+i);
array[i]=input.nextInt();
}
return array;
}
static int [] isiarray (int angka){
Scanner input = new Scanner (System.in);
int array[]=new int[angka];
for (i=0;  i<array.length; i++){
System.out.println("Masukkan data ke-"+i);
array[i]=input.nextInt();
}
return array;
}
static int hitTot(int []arr){
for (i=0; i<arr.length; i++){
total+=arr[i];
}
return total;
}
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.println("Masukka jumlah data yang ingin anda inputkan: ");
int jum=input.nextInt();
int []dataArray=isiarray(jum);
tampilArray(dataArray);
total= hitTot(dataArray);
System.out.println("Total nilai = "+total);
```

    Masukka jumlah data yang ingin anda inputkan: 
    4
    Masukkan data ke-0
    5
    Masukkan data ke-1
    10
    Masukkan data ke-2
    6
    Masukkan data ke-3
    7
    Nilai yang anda inputkan ke 0
    5
    Nilai yang anda inputkan ke 1
    10
    Nilai yang anda inputkan ke 2
    6
    Nilai yang anda inputkan ke 3
    7
    Total nilai = 28


#### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
// Tuliskan jawaban nomor 2
```

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
// Tuliskan jawaban nomor 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int [] bil1 = {2,5,7};
int [] bil2 = {3,5,6};
int [] bil3 = {10,3,4};
int max1=7;
int max2=6;
int max3=10;
System.out.println("Nilai max bil 1 adalah:"+max1);
static int mencariMax1(int[] arr){
    int max1 =arr[0];
    for(int i=l;i<arr.length;i++){
        if (max1<arr[i]){
            max1 = arr[i];
        }
    }
    return max1;
}
System.out.println("Nilai max bil 2 adalah:"+max2);
static int mencariMax2(int[] arr){
    int max2 =arr[0];
    for(int i=l;i<arr.length;i++){
        if (max2<arr[i]){
            max2 = arr[i];
        }
    }
    return max1;
}
System.out.println("Nilai max bil 3 adalah:"+max3);
static int mencariMax3(int[] arr){
    int max3 =arr[0];
    for(int i=l;i<arr.length;i++){
        if (max1<arr[i]){
            max3 = arr[i];
        }
    }
    return max3;
}
```


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil1, bil2, bil3;
int max = 0;
System.out.println("Bilangan 1: ");
bil1 = input.nextInt();
System.out.println("Bilangan 2: ");
bil2 = input.nextInt();
System.out.println("Bilangan 3: ");
bil3 = input.nextInt();

static int bil1, bil2, bil3;
if (bil1 > max){
System.out.println("Nilai maksimum dari bil1 adalah"+max);
else if (bil2 > max && bil2 > bil1){
System.out.println("Nilai maksimum dari bil2 adalah"+max);
else if (bil3 > max && bil3 > bil2 && bil3 > bil1){
System.out.println("Nilai maksimum dari bil3 adalah"+max);
}
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
Scanner input = new Scanner(System.in);
static int bil1, bil2,
```
