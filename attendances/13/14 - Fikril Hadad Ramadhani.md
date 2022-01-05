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
static void beriSalam() {
    System.out.println("Halo! Selamat Pagi");
}
beriSalam();
```

    Halo! Selamat Pagi

> void berati fungsi ini merupakan fungsi yang tidak mengembalikan nilai apapun. dengan begini, setelah code dalam fungsi dijalankan(dengan  cara memanggil code di bagian fungsi main), fungsi ini tidak  akan mengembalikan nilai apapun. jadi hanya akan mencetak Halo! Selamat Pagi.

3. Buat fungsi **beriUcapan** dengan sebuah parameter bertipe String.
![Gambar 3](images/1.3.png)

4. Buatlah variabel **salam** bertipe String kemudian eksekusi atau panggil fungsi **beriUcapan** dengan mengisi parameternya dengan variable **salam** yang sudah dibuat.
![Gambar 3](images/1.4.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3 & 4
static void beriSalam() {
    System.out.println("Halo! Selamat Pagi");
}

static void beriUcapan(String ucapan) {
    System.out.println(ucapan);
}
beriSalam();
String salam = "Selamat Datang di pemrograman Java";
beriUcapan(salam);
```

    Halo! Selamat Pagi
    Selamat datang di Pemrograman Java

> kita dapat memberi atribut atau parameter ke dalam suatu fungsi tertentu. pada hal ini, kita mengisi parameter berupa String. string pada parameter ini akan di print menggunakan perintah sout pada badan fungsi. parameter bisa kita masukkan apapun dengan tipe data String. maka dari itu, pada badan main, kita masukkan String salam. Hasilnya, nilai yang ada pada variabel salam di cetak.

#### Pertanyaan
1. Jelaskan perbedaan fungsi **beriSalam** dan **beriUcapan** pada praktikum 1!

beriSalam adalah fungsi yang menyimpan perintah sout yang berisi "Halo! Selamat Pagi".
beriUcapan adalah fungsi yang menyimpan perintah sout juga. perbedaannya terdapat pada parameter yang hanya ada pada fungsi beriUcapan. pada fungsi beriUcapan, kita membuat parameter bertipe data String bernama ucapan. jadi jika kita memanggil fungsi beriUcapan dan kita beri parameter dengan tipe data String, maka akan tampil parameter tersebut. dengan begini, fungsi beriUcapan lebih fleksibel dibanding dengan fungsi beriSalam dimana fungsi beriUcapan dapat kita ubah parameternya sesuai dengan keinginan kita.

2. Jelaskan cara pemanggilan sebuah fungsi void yang berparameter dan tanpa parameter!

pemanggilan fungsi void tanpa parameter dapat kita lakukan dengan menuliskan namaFungsi dan tanpa kurung, diikuti dengan tanda titik koma(;) untuk mengakhiri sebuah perintah seperti biasa (namaFungsi();). sedangkan untuk fungsi void dengan parameter, kita dapat memanggilnya dengan menggunakan cara yang sama. perbedaannya terletak pada dalam kurung. kita dapat meletakkan parameter yang diinginkan ke dalam kurung. dengan begini, fungsi void akan menggunakan parameter tersebut untuk menjalankan perintah di fungsi void berparameter.

### Percobaan 2: Fungsi dengan return value (Bukan void)
Pada Percobaan 2, kode program yang dibuat digunakan untuk menghitung luas persegi dengan membuat fungsi **luasPersegi** yang menggunakan parameter.
1. Buat fungsi **luasPersegi**  untuk menghitung luas persegi yang mengembalikan nilai luas (int) dan parameter masukan sisi (int).
![Gambar 4](images/2.1.png)

2.	Eksekusi atau panggil fungsi luasPersegi dengan cara membuat variabel baru yaitu **luasan**, kemudian isi variabel tersebut dengan memanggil fungsi luasPersegi dan mengisi parameter sisi. Selanjutnya cetak variabel luasan untuk menampilkan luas persegi panjang
![Gambar 5](images/2.2.png)


```Java
static int luasPersegi(int sisi) {
    int luas = sisi * sisi;
    return luas;
}
int luasan = luasPersegi(5);
System.out.println("Luas Persegi dengan sisi 5 = " + luasan);
```

    Luas Persegi dengan sisi 5 = 25

> pada fungsi kali ini, parameternya berupa int. maka dari itu, pada fungsi main, kita memasukkan nilai angka pada (). nilai 5 yang telah diinputkan akan di tampung pada sisi, kemudian diolah sesuai dengan kode. kemudian, nilai luas akan di kembalikan ke fungsi main.


#### Pertanyaan
1. jelaskan mengapa ketika memanggil fungsi **luasPersegi** harus membuat variabel baru yaitu luasan?

karena fungsi return hanya mengembalikan nilai tanpa bisa menampilkannya langsung. makanya kita perlu menyiapkan variabel untuk menampung nilai return agar dapat kita panggil saat kita menuliskan perintah sout.

2. Jelaskan kegunaan **return luas** pada percobaan 2 diatas!

untuk mengembalikan nilai perkalian dari parameter sisi.

3. Modifikasilah program di percobaan 2, dengan membuat panjang **sisi** sebagai inputan!


```Java
static int luasPersegi(int sisi) {
    int luas = sisi * sisi;
    return luas;
}
import java.util.Scanner;
Scanner boi = new Scanner(System.in);
System.out.print("Masukkan sisi persegi: ");
int sisiInput = boi.nextInt();
int luasan = luasPersegi(sisiInput);
System.out.println("Luas Persegi dengan sisi "+ sisiInput +" = " + luasan);
```

    Masukkan sisi persegi: 5
    Luas Persegi dengan sisi 5 = 25

> pada kode kali ini, kita mencoba untuk meminta input dari user. inputan dari user ini akan dimasukkan ke parameter fungsi LuasPersegi(). kemudian akan diolah dan nilai yang ditampung dalam variabel luas akan di kembalikan di fungsi main.

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
    A += 7;
    B += 4;
    X = Kali(A, B);
    return X;
}
import java.util.Scanner;
int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai 1: ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kurang(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1: 9
    Masukkan nilai 2: 1
    Hasil akhir adalah 2


#### Pertanyaan
1. Modifikasilah percobaan diatas dimana di fungsi **Kali** dapat memanggil fungsi **Kurang** kemudian eksekusi atau panggil fungsi Kali


```Java
// Tuliskan jawaban nomor 1
static int Kali(int C, int D) {
    int H;
    H = Kurang((C + 10), (D + 19));
    return H;
}
static int Kurang(int A, int B) {
    int X;
    A += 7;
    B += 4;
    X = A + B;
    return X;
}
import java.util.Scanner;
int nilai1, nilai2;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai 1: ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai 2: ");
nilai2 = input.nextInt();
int hasil = Kali(nilai1, nilai2);
System.out.println("Hasil akhir adalah " + hasil);
```

    Masukkan nilai 1: 7
    Masukkan nilai 2: 2
    Hasil akhir adalah 49


2. Jelaskan alur jalannya program di percobaan 3 mulai dari input sampai keluar output!

pertama, kita meminta 2 nilai dari user. kemudian, nilai tersebut akan menjadi parameter dari fungsi Kurang. pada fungsi kurang, nilai pertama akan ditambah 7 sedangkan nilai kedua akan ditambah dengan 4. kemudian, keduanya akan dijadikan parameter dari fungsi Kali. pada fungsi kali, nilai pertama akan ditambahkan 10 sedangkan nilai kedua akan ditambahkan dengan 19. kedua nilai tersebut akan di modulus. hasil modulus akan ditampilkan di hasil akhir yang kita tampung pada variabel bernama hasil.

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
System.out.println("Masukkan panjang: ");
p = input.nextInt();
System.out.println("Masukkan lebar: ");
l = input.nextInt();
System.out.println("Masukkan tinggi: ");
t = input.nextInt();
L  = p * l;
System.out.println("Luas Persegi panjang adalah " + L);
vol = p * l * t;
System.out.println("Volume Balok adalah " + vol);
```

    Masukkan panjang: 
    5
    Masukkan lebar: 
    8
    Masukkan tinggi: 
    3
    Luas Persegi panjang adalah 40
    Volume Balok adalah 120

> pertama, kita meminta nilai dari panjang, lebar, dan tinggi dari balok. kemudian, akan diolah seperti kode. setelah diolah, akan dioutput seperti pada di perintah sout.

4. Program menghitung luas persegi dan volume balok diatas jika dibuatkan fungsi maka terdapat 3 fungsi yaitu hitungLuas, hitungVolume dan fungsi main, seperti dibawah ini:

Fungsi hitungLuas

![Gambar 10](images/4.4Luas.png)

Fungsi hitungVolume
![Gambar 10](images/4.4Volume.png)



5. Eksekusi/panggil fungsi **hitungLuas** dan **hitungVolume**

![Gambar 10](images/4.5.png)


```Java
// Tuliskan kode program Percobaan 4 Langkah 1, 2, & 3
static int hitungLuas(int pjg, int lb) {
    int Luas = pjg * lb;
    return Luas;
}
static int hitungVolume(int tinggi, int a, int b) {
    int volume = hitungLuas(a, b) * tinggi;
    return volume;
}
Scanner input = new Scanner(System.in);
int p, l, t, L, vol;
System.out.println("Masukkan panjang: ");
p = input.nextInt();
System.out.println("Masukkan lebar: ");
l = input.nextInt();
System.out.println("Masukkan tinggi: ");
t = input.nextInt();
L = hitungLuas(p, l);
vol = hitungVolume(t, p, l);
System.out.println("Luas Persegi Panjang adalah " + L);
System.out.println("Volume Balok adalah " + vol);
```

    Masukkan panjang: 
    5
    Masukkan lebar: 
    8
    Masukkan tinggi: 
    3
    Luas Persegi Panjang adalah 40
    Volume Balok adalah 120

> secara garis besar hampir sama dengan apa yang kita lakukan pada kode program sebelumnya. perbedaannya terletak pada penggunaan fungsi.

#### Pertanyaan
1. Jelaskan kegunaan parameter yang terdapat didalam fungsi hitungLuas dan hitungVolume!

pada hitungLuas, parameter merupakan representasi dari panjang dan lebar persegi panjang. pada hitungVolume, parameter merupakan representasi dari tinggi, panjang, dan lebar balok.

2. Setelah melakukan percobaan 4, menurut anda manakah program yg lebih efisien apakah menggunakan fungsi atau tanpa fungsi? Jelaskan!

menurut saya, program tanpa fungsi lebih efisien karena tanpa fungsi kita sudah bisa menuliskannya dalam 2 baris kode. tapi dengan adanya fungsi, kita harus menuliskan lebih banyak kode untuk menggantikan 2 baris kode tersebut.

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
static int[] isiArray(int angka) {
    Scanner input = new Scanner(System.in);
    int []array = new int[angka];
    for(int i = 0; i < array.length; i++) {
        System.out.print("Masukkan data ke-"+i+": "); 
        array[i] = input.nextInt();
    }
    return array;
}
static void tampilArray(int []arr) {
    for(int i = 0; i < arr.length; ++i) {
        System.out.print("Nilai yang anda inputkan ke-" + i + ": ");
        System.out.println(arr[i]);
    }
}
static int hitTot(int []arr) {
    for(int i = 0; i < arr.length; ++i) {
        total += arr[i];
    }
    return total;
}
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiArray(jum);
tampilArray(dataArray);
total = hitTot(dataArray);
System.out.println("Total nilai adalah " + total);
```

    Masukkan jumlah data yang ingin anda inputkan: 4
    Masukkan data ke-0: 7
    Masukkan data ke-1: 3
    Masukkan data ke-2: 5
    Masukkan data ke-3: 8
    Nilai yang anda inputkan ke-0: 7
    Nilai yang anda inputkan ke-1: 3
    Nilai yang anda inputkan ke-2: 5
    Nilai yang anda inputkan ke-3: 8
    Total nilai adalah 23

> pertama, kita meminta jumlah data yang akan dimasukkan. nilai ini akan menjadi panjang dari array pada fungsi isiArray. kemudian, kita akan memanggil fungsi isiArray, dimana fungsi ini akan meminta inputan dari kita dan akan merekamnya ke dalam array. setelah itu, kita juga memanggil fungsi tampilArray. fungsi tampilArray akan menampilkan nilai dari nilai yang telah kita inputkan satu persatu. kemudian, kita menampung nilai dari fungsi hitTot ke dalam variabel total. 

###### Pertanyaan
1. Jelaskan mengapa fungsi tampil array dibuat bertipe void, sedangkan isiarray dan hitTot bertipe int!

karena fungsi tampilArray hanya mengeksekusi perintah sout dan tidak perlu mengembalikan nilai apapun. sedangkan fungsi isiArray dan hitTot perlu mengembalikan nilai yaitu nilai array dan nilai total dari array.

2. Menurut pendapat anda apakah fugsi isiarray dan hitTot dapat diganti dengan tipe void? Jelaskan dan buktikan dengan program!


```Java
static int array[];
static void isiArray(int angka) {
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for(int i = 0; i < array.length; i++) {
        System.out.print("Masukkan data ke-"+i+": "); 
        array[i] = input.nextInt();
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
Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
isiArray(jum);
tampilArray(array);
System.out.print("Total nilai adalah ");
hitTot(array);
```

    Masukkan jumlah data yang ingin anda inputkan: 3
    Masukkan data ke-0: 1
    Masukkan data ke-1: 5
    Masukkan data ke-2: 3



    ---------------------------------------------------------------------------

    java.lang.NullPointerException: Cannot read the array length because "<parameter1>" is null

    	at .tampilArray(#22:1)

    	at .(#32:1)



```Java
static int total = 0;
static int []isiArray(int angka) {
    Scanner input = new Scanner(System.in);
    int array[] = new int[angka];
    for(int i = 0; i < array.length; i++) {
        System.out.print("Masukkan data ke-"+i+": "); 
        array[i] = input.nextInt();
    }
    return array;
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
Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah data yang ingin anda inputkan: ");
int jum = input.nextInt();
int []dataArray = isiArray(jum);
tampilArray(dataArray);
System.out.print("Total nilai adalah ");
hitTot(dataArray);
```

    Masukkan jumlah data yang ingin anda inputkan: 4
    Masukkan data ke-0: 2
    Masukkan data ke-1: 4
    Masukkan data ke-2: 7
    Masukkan data ke-3: 4
    Nilai yang anda inputkan ke-0: 2
    Nilai yang anda inputkan ke-1: 4
    Nilai yang anda inputkan ke-2: 7
    Nilai yang anda inputkan ke-3: 4
    Total nilai adalah 17


dari program di atas, dapat disimpulkan bahwa sebenarnya fungsi hitTot dapat menampilkan jumlah dari keseluruhan nilai dalam array. tapi tidak dengan fungsi isiArray yang harus menggunakan fungsi return. karena fungsi isiArray sendiri adalah fungsi untuk meminta dan menampung array dimana array ini yang akan kita olah pada 2 fungsi lainnya. maka dari itu,, fungsi isiArray harus dapat mengembalikan nilai dari array yang telah disimpan.

## Tugas

1. Buatlah sebuah static method yang bernama Max3(int bil1, int bil2, int bil3) yang menerima 3 buah parameter bilangan integer dan mengembalikan sebuah bilangan integer yang merupakan nilai maksimum diantara ketiga bilangan tersebut. 


```Java
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
Scanner inp = new Scanner(System.in);
System.out.print("Masukkan nilai pertama\t: ");
int nilai1 = inp.nextInt();
System.out.print("Masukkan nilai kedua\t: ");
int nilai2 = inp.nextInt();
System.out.print("Masukkan nilai ketiga\t: ");
int nilai3 = inp.nextInt();
System.out.print("Nilai tertinggi dari ketiga nilai adalah: " + Max3(nilai1, nilai2, nilai3));
```

    Masukkan nilai pertama	: 4
    Masukkan nilai kedua	: 3
    Masukkan nilai ketiga	: 72
    Nilai tertinggi dari ketiga nilai adalah: 72

> pertama, kita meminta input kepada user. ketiga nilai tersebut akan di olah pada fungsi Max3. pada fungsi Max3 ketiga nilai akan di masukkan pada array. kemudian, kita akan melakukan pemeriksaan terhadap nilai pada array satu satu dimana nilai terbesar akan disimpan di variabel tertinggi. setelah itu, fungsi akan mereturn nilai return.

2. Disebuah restoran terdapat 3 menu yang dijual yaitu nasi goreng, soto, dan sate. Harga nasi goreng Rp. 20.000, soto Rp. 15.000, dan sate Rp. 25.000. Restoran tersebut buka dari hari senin sampai jumat. Berikut ini merupakan tabel pejualan perhari untuk masing-masing menu di restoran tersebut dari hari senin sampai jumat
![Gambar 13](images/soal3.png)

Buatlah Fungsi sebagai berikut:
 * Fungsi menampilkan menu favorit di hari selasa dan jumat (menu favorit diasumsikan adalah menu yang paling banyak terjual di hari tersebut)
 * Fungsi untuk menghitung pemasukan restoran tersebut mulai hari senin sampai jumat.
 * Fungsi untuk menghitung berapa porsi yang terjual untuk masing-masing menu yaitu nasi goreng, soto, dan sate mulai senin sampai jumat.


```Java
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

> pertama saya menginisialisasi array secara global. fungsi fav() berfungsi untuk mencari menu favoit dengan menscan kolom index 1 dan index 4. fungsi totalKeuntungan() akan menjumlah secara horizontal. kemudian akan dikalikan tiap2 baris dengan harganya. fungsi NasiGoreng(), Soto(), Sate() akan mengembalikan nilai jumlah dari tiap tiap baris yang merepresentasikan jumlah tiap menu. 