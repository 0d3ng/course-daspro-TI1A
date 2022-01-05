# JOBSHEET 13 Fungsi 1

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
    System.out.println("Halo! Selamat Pagi");
}
beriSalam();
```

    Halo! Selamat Pagi


3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.

![Gambar 3](images/1.3.png)


```Java
static void beriSalam(){
    System.out.println("Halo! Selamat Pagi");
}

static void beriUcapan(String ucapan){
    System.out.println(ucapan);
}

beriSalam();
```

    Halo! Selamat Pagi


4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.

![Gambar 3](images/1.4.png)


```Java
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

*Jawab: fungsi beriSalam berisi statement Halo! Selamat Pagi, dan tidak ada parameternya. Lalu fungsi beriUcapan mempunyai parameter bertipe data String dengan nama ucapan, yang nanti jika dipanggil dapat diisi dengan variabel lain di luar fungsi itu sendiri.*

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

*Jawab: cara pemanggilan fungsi yang mempunyai parameter maupun tidak, dapat langsung mengetikkan nama fungsi tersebut lalu tambahkan dalam kurung, di dalam kurung tersebut dapat diisikan variabel lain yang akan dieksekusi sesuai yang ditentukan di dalam fungsi.*

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).

![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang.

![Gambar 5](images/2.2.png)


```Java
static int luasPersegi(int sisi){
    int luas = sisi*sisi;
    return luas;
}

    int luasan = luasPersegi(5);
    System.out.println("Luas Persegi dengan sisi 5 = "+luasan);
```

    Luas Persegi dengan sisi 5 = 25


#### Pertanyaan
1. Jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

*Jawab: variabel luasan dibuat memang untuk menampung nilai pada fungsi luasPersegi saat dipanggil.*

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

*Jawab: keyword return ditambahkan agar perhitungan di variabel luas dikembalikan nilainya kepada fungsi luasPersegi.*

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
static int luasPersegi(int sisi){
    int luas = sisi*sisi;
    return luas;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

    System.out.print("Masukkan sisi = ");
    int n = input.nextInt();

    int luasan = luasPersegi(n);
    System.out.println("Luas Persegi = "+luasan);
```

    Masukkan sisi = 8
    Luas Persegi = 64
    

*Jawab: ditambahkan import Scanner untuk pengguna dapat menginput, lalu membuat variabel n untuk menampung inputan panjang sisinya. Setelah itu variabel luasan yang sama dengan memanggil fungsi persegi didalam kurungnya diisi variabel n yang tadi menampung input.*

### Percobaan 3: Fungsi dapat meng-CALL Fungsi Lain
Pada Percobaan 3, kode program yang dibuat digunakan untuk mengimplementasikan bahwa fungsi dapat meng-CALL fungsi yang lain. Dimana dalam percobaan ini terdapat fungsi **Kali dan Kurang**. 
1. Buatlah fungsi **Kali** yang mengembalikan nilai H (int) dan parameter masukan C dan D (int).

![Gambar 9](images/3.1.png)

2.	Buatlah fungsi **Kurang** yang mengembalikan nilai X (int) dan parameter masukan A dan B (int) dan memanggil fungsi Kali.

![Gambar 10](images/3.2.png)

3. Lakukan import class Scanner sebagai inputan di langkah selajutnya.

4. Eksekusi atau panggil fungsi **Kurang**.

![Gambar 11](images/3.4.png)


```Java
static int Kali(int C, int D){
    int H;
    H = (C+10)%(D+19);
    return H;
}

static int Kurang(int A, int B){
    int X;
    A = A+7;
    B = B+4;
    X = Kali(A,B);
    return X;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

int nilai1, nilai2;

System.out.print("Masukkan Nilai 1 : ");
nilai1=input.nextInt();

System.out.print("Masukkan Nilai 2 : ");
nilai2=input.nextInt();

int hasil = Kurang(nilai1, nilai2);

System.out.println("\nHasil akhir : "+hasil);
```

    Masukkan Nilai 1 : 5
    Masukkan Nilai 2 : 7
    
    Hasil akhir : 22
    

#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
static int Kurang(int A, int B){
    A = A+7;
    B = B+4;
    return A%B;
}

static int Kali(int C, int D){
    int X;
    C = C+10;
    D = D+19;
    X = Kurang(C,D);
    return X;
}

import java.util.Scanner;
Scanner input = new Scanner(System.in);

int nilai1, nilai2;

System.out.print("Masukkan nilai 1 : ");
nilai1 = input.nextInt();

System.out.print("Masukkan nilai 2 : ");
nilai2 = input.nextInt();

int hasil = Kali(nilai1, nilai2);
System.out.println("\nHasil akhir adalah "+hasil);
```

    Masukkan nilai 1 : 5
    Masukkan nilai 2 : 7
    
    Hasil akhir adalah 22
    

*Jawab: jadi, fungsi Kali disini parameter C akan ditambah 10 dan parameter D ditambah 19 lalu dipanggillah fungsi Kurang yang mana seperti di percobaan, namun returnnya parameter A dimodulus parameter B.*

2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

*Jawab: pengguna dimintai inputan 2 kali berupa nilai angka, untuk variabel output adalah hasil yang merupakan pemanggilan dari fungsi Kurang. Lalu nilai 1 diproses dalam fungsi Kurang yang akan ditambah 7, dan nilai 2 ditambah 4. Di dalam fungsi Kurang dipanggil fungsi Kali yang disini nilai 1 akan ditambah 10 kemudian dimodulus nilai 2 ditambah 19. Hasil akhir operasi lalu dikembalikan ke fungsi Kurang.*

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
Scanner input=new Scanner(System.in);

int p,l,t,L,vol;

System.out.print("Masukkan panjang : ");
p = input.nextInt();
System.out.print("Masukkan lebar : ");
l = input.nextInt();
System.out.print("Masukkan tinggi : ");
t = input.nextInt();

L=p*l;
System.out.println("\nLuas persegi panjang adalah "+L);

vol=p*l*t;
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang : 3
    Masukkan lebar : 6
    Masukkan tinggi : 2
    
    Luas persegi panjang adalah 18
    Volume balok adalah 36
    

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume

![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
static int hitungLuas(int pjg, int lb){
    int Luas=pjg*lb;
    return Luas;
}

static int hitungVolume(int tinggi, int a, int b)
{
    int volume=hitungLuas(a,b)*tinggi;
    return volume;
}

Scanner input=new Scanner(System.in);
int p,l,t,L,vol;

System.out.print("Masukkan panjang : ");
p = input.nextInt();
System.out.print("Masukkan lebar : ");
l = input.nextInt();
System.out.print("Masukkan tinggi : ");
t = input.nextInt();   

L=hitungLuas(p,l);
System.out.println("\nLuas persegi panjang adalah "+L);

vol=hitungVolume(t,p,l);
System.out.println("Volume balok adalah "+vol);
```

    Masukkan panjang : 2
    Masukkan lebar : 6
    Masukkan tinggi : 4
    
    Luas persegi panjang adalah 12
    Volume balok adalah 48
    

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

*Jawab: di dalam fungsi hitungLuas dan hitungVolume terdapat parameter, dimana parameter-parameter tersebut digunakan untuk proses perhitungan yang akan dilakukan di dalam fungsi tersebut.*

2. Setelah melakukan percobaan 4, menurut Anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

*Jawab: menurut saya yang tanpa fungsi lebih efisien untuk percobaan 4, karena fungsi tersebut hanya digunakan masing-masing satu kali saja. Namun, jika dalam program yang membutuhkan operasi yang sama berulang-ulang kali lebih efisien dibuatnya fungsi agar tidak bolak-balik menyatakan operasi.*

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
static int total=0,i;

static int [] isiarray(int angka){
    Scanner input=new Scanner(System.in);
    int array[]=new int[angka];
    
    for(i=0; i<array.length; i++){
        System.out.printf("Masukkan data ke-%d : ",i+1);
            array[i]=input.nextInt();
    }
    return array;
}

static void tampilArray(int [] arr){
    for(i=0; i<arr.length; i++){
        System.out.println("\nNilai yang Anda inputkan ke-"+(i+1));
        System.out.println(arr[i]);
    }
}

static int hitTot(int [] arr){
    for (i=0; i<arr.length; i++){
        total+=arr[i];
    }
    return total;
}

import java.util.Scanner;
Scanner input=new Scanner(System.in);

System.out.print("Masukkan jumlah data yang ingin Anda inputkan : ");
int jum=input.nextInt();

int []dataArray=isiarray(jum);
tampilArray(dataArray);

total=hitTot(dataArray);
System.out.println("\nTotal nilai = "+total);
```

    Masukkan jumlah data yang ingin Anda inputkan : 3
    Masukkan data ke-1 : 7
    Masukkan data ke-2 : 4
    Masukkan data ke-3 : 8
    
    Nilai yang Anda inputkan ke-1
    7
    
    Nilai yang Anda inputkan ke-2
    4
    
    Nilai yang Anda inputkan ke-3
    8
    
    Total nilai = 19
    

#### Pertanyaan
1. Jelaskan mengapa fungsi tampilArray dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

*Jawab: karena di dalam fungsi tampilArray hanya digunakan untuk menampilkan data yang langsung dicetak ke layar dan tidak memerlukan pengembalian nilai karena bukan operasi perhitungan, tidak seperti fungsi isiarray yang harus mengembalikan nilai karena fungsinya ada inputan dan hitTot yang merupakan perhitungan nilai total.*

2. Menurut pendapat Anda apakah fungsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
static int total=0,i;

static void isiarray(int [] array){
    Scanner input=new Scanner(System.in);
    
    for(i=0; i<array.length; i++){
        System.out.printf("Masukkan data ke-%d : ",i+1);
            array[i]=input.nextInt();
    }
}

static void tampilArray(int [] arr){
    for(i=0; i<arr.length; i++){
        System.out.println("\nNilai yang Anda inputkan ke-"+(i+1));
        System.out.println(arr[i]);
    }
}

static void hitTot(int []arr){
    for (i=0; i<arr.length; i++){
        total+=arr[i];
    }
}

import java.util.Scanner;
Scanner input=new Scanner(System.in);

System.out.print("Masukkan jumlah data yang ingin Anda inputkan : ");
int jum=input.nextInt();

int []dataArray=isiarray(jum);
tampilArray(dataArray);

total=hitTot(dataArray);
System.out.println("\nTotal nilai = "+total);
```

    Masukkan jumlah data yang ingin Anda inputkan : 2
    


    |   int []dataArray=isiarray(jum);

    incompatible types: void cannot be converted to int[]

    


*Jawab: tidak bisa jika langsung diganti void karena tidak dapat dikonvert ke array yang bertipe data int.*

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
static int Max3(int bil1, int bil2, int bil3){
    int max=0;
    if (bil1>max){
        max=bil1;
    }if(bil2>max){
        max=bil2;
    }if(bil3>max){
        max=bil3;
    }
    return max;
}

import java.util.Scanner;
Scanner input = new Scanner (System.in);

System.out.print("Masukkan bilangan 1 : ");
int a=input.nextInt();

System.out.print("Masukkan bilangan 2 : ");
int b=input.nextInt();

System.out.print("Masukkan bilangan 3 : ");
int c=input.nextInt();

int x=Max3(a, b, c);
System.out.println("\nNilai maksimum : "+x);
```

    Masukkan bilangan 1 : 3
    Masukkan bilangan 2 : 5
    Masukkan bilangan 3 : 7
    
    Nilai maksimum : 7
    

*Penjelasan: buat fungsi Max3 dengan di dalamnya terdapat kondisi dari ketiga parameter yang hanya jika salah satunya dengan nilai tertinggi maka nilai yang berada di parameter tersebut akan disimpan pada variabel max. Lalu nilai-nilai tersebut diinputkan oleh pengguna, dan untuk output agar menampilkan nilai maksimumnya maka dipanggil fungsi tadi yang sama dengan variabel x.*

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat

![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
String menu[]={"Nasi goreng", "Soto", "Sate"};
int harga[]={20000, 15000, 25000};
int jual[][]= {
    {20,15,35,24,70}, //nasi goreng
    {30,40,10,28,35}, //soto
    {5,10,50,48,15} //sate
};

static void menuFS(){
    int max=0;
    for (int i=1; i<jual.length; i++) {
    if (jual[i][1]>max) {
    max=jual[i][1];
    System.out.printf("Menu favorit hari Selasa adalah %s yang terjual %d porsi",menu[i],max);
    }
  }  
}
    
static void menuFJ(){
    int max=0;
    for (int j=0; j<jual.length; j++) {
    if (jual[j][4]>max) {
    max=jual[j][4];
    System.out.printf("\nMenu favorit hari Jumat adalah %s yang terjual %d porsi",menu[j],max);
    }
  }
}

static void hitungUang() {
    int masuk=0;
    for (int k=0; k<jual.length; k++) {
            for (int l=0; l<jual[0].length; l++) {
                masuk+=jual[k][l]*harga[k];
  }
}
    System.out.println("\n\nPemasukan restoran mulai hari Senin sampai Jumat sebanyak Rp."+masuk);
}

static void jualPorsi(){
    for(int m=0; m<jual.length; m++){
        int total=0;
        for(int n=0; n<jual[0].length; n++){
            total+=jual[m][n];
        }
        System.out.printf("\nPorsi menu %s yang terjual sejumlah %d",menu[m],total);
    }
}

menuFS();
menuFJ();
hitungUang();
jualPorsi();
```

    Menu favorit hari Selasa adalah Soto yang terjual 40 porsi
    Menu favorit hari Jumat adalah Nasi goreng yang terjual 70 porsi
    
    Pemasukan restoran mulai hari Senin sampai Jumat sebanyak Rp.8625000
    
    Porsi menu Nasi goreng yang terjual sejumlah 164
    Porsi menu Soto yang terjual sejumlah 143
    Porsi menu Sate yang terjual sejumlah 128

*Penjelasan: Untuk fungsi menu favorit ada 2 fungsi untuk hari Selasa dan Jumat. Fungsi menuFS menggunakan kolom dengan indeks satu dan menuFJ memakai indeks kolom 4 sesuai tabel. Untuk pendapatannya dengan fungsi hitungUang yang mana array jual akan dikali dengan array harga yang telah ditentukan. Dan fungsi yang terakhir yaitu jumlah porsi yang dijual dengan fungsi jualPorsi dengan menotalkan semua elemen yang ada di dalam array jual sesuai dengan jenis menunya.*
