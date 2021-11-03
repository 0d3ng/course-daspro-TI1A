# JOBSHEET 10 - Array 1

## Tujuan
+ Mahasiswa mampu memahami pembuatan Array 1 dimensi dan pengaksesan elemenya di Java. 
+ Mahasiswa mampu membuat program dengan menggunakan konsep array satu dimensi.


## Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet
+ Anaconda3 + Java kernel (opsional)

## Praktikum
### Percobaan 1: Mengisi Elemen Array
1. Pada percobaan ke-1 akan dilakukan percobaan untuk mengisi elemen array. Buat array bertipe integer dengan nama bil dengan kapasitas 4 elemen.
![Gambar 0](images/P1L2.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 2 di atas
int[] bil =  new int[4];
```

2. Isi masing-masing elemen array bil tadi dengan angka 5, 12, 7, 20.
![Gambar 0](images/P1L3.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 3 di atas
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;
```




    20



3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
// Tulis Kode program Percobaan 1 Langkah 4
System.out.println(bil[0]);
System.out.println(bil[1]);
System.out.println(bil[2]);
System.out.println(bil[3]);
```

    5
    12
    7
    20
    

#### Pertanyaan 
1. Dari percobaan 1 berapakah indeks array terbesar dan terkecil?

    Indeks array terbesarnya adalah indeks ke-3 dan indeks array terkecilnya adalah indeks ke-0

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

jika di ubah maka akan error, karena tipe data array adalah int sedangkan nilai yang di ubah itu bukan bilangan bulat melainkan terdapat bilangan rill(koma). Seharusnya jika tidak mau error, tipe data variabel "array" di ganti menjadi double.

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
for(int i=0; i < 4; i++){
        System.out.println(bil[i]);
    }
```

    5
    12
    7
    20
    

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas

```

2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 1 di atas
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 3 di atas
int[] nilaiUAS = new int[6];
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 4 di atas
for(int i = 0; i < 6; i++){
            System.out.printf("Masukkan nilai UAS dari indeks %d: ", i);
            nilaiUAS[i] = sc.nextInt();
        }
```

    Masukkan nilai UAS dari indeks 0: 1
    Masukkan nilai UAS dari indeks 1: 20
    Masukkan nilai UAS dari indeks 2: 50
    Masukkan nilai UAS dari indeks 3: 75
    Masukkan nilai UAS dari indeks 4: 90
    Masukkan nilai UAS dari indeks 5: 100
    

##### 5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas
for(int i = 0; i < 6; i++){
            System.out.printf("Nilai UAS dari indeks ke %d adalah %d \n",i, nilaiUAS[i]);
        }
```

    Nilai UAS dari indeks ke 0 adalah 10 
    Nilai UAS dari indeks ke 1 adalah 50 
    Nilai UAS dari indeks ke 2 adalah 54 
    Nilai UAS dari indeks ke 3 adalah 70 
    Nilai UAS dari indeks ke 4 adalah 80 
    Nilai UAS dari indeks ke 5 adalah 95 
    

#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
for(int i = 0; i < nilaiUAS.length; i++){
            System.out.printf("Masukkan nilai UAS dari indeks %d: ", i);
            nilaiUAS[i] = sc.nextInt();
        }
```

    Masukkan nilai UAS dari indeks 0: 10
    Masukkan nilai UAS dari indeks 1: 0
    Masukkan nilai UAS dari indeks 2: 90
    Masukkan nilai UAS dari indeks 3: 100
    Masukkan nilai UAS dari indeks 4: 20
    Masukkan nilai UAS dari indeks 5: 35
    

2. Apa kegunaan dari `nilaiUAS.length`? 

    Kegunaan nilaiUAS.length adalah untuk menghitung panjang indeks array dari variabel "nilaiUAS". Perubahan kode diatas hasil akhirnya akan tetap sama, tidak berubah. i < 6 itu sama saja dengan i < nilaiUAS.length. angka 6 dan nilaiUAS.length itu artinya sama yaitu panjang indeks array adalah 6.

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
for(int i = 0; i < nilaiUAS.length; i++) {
    if(nilaiUAS[i] > 70) {
        System.out.println("Mahasiswa ke-"+ i +" lulus");   
    }
}
```

    Mahasiswa ke-2 lulus
    Mahasiswa ke-3 lulus
    

Penjelasan :
- Kode program di atas digunakan untuk menampilkan isi array yang di input kan melalui user Scanner. Jumlah indeks array ada 6, yang berarti kita akan mengisi setiap indeks array menggunakan library Scanner.
- mengisi array pada setiap indeks dilakukan dengan menggunakan perulangan for.
- Setelah menginput isi array, akan menampilkan nilai UAS yang lulus dengan persyaratan nilai > 70
- Cara mengetahui nilai yang kita input lebih besar dari 70 adalah dengan cek satu per satu nilai indeks array nya. Dengan menggunakan metode perulangan for.
- **if(nilaiUAS[i] > 70)** adalah kondisi untuk menyeleksi apakah nilai array lebih dari 70.
- Setelah diketahui bahwa nilai tersebut lebih dari 70, maka akan ditampilkan output nya.
- jika nilai kurang dari 70 maka tidak akan menampilkan apapun

### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
// Tulis Kode program Percobaan 3 Langkah 1 di atas, disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 2 di atas, disini
int nilaiMHS[] = new int[10];
double total;
double rata;
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
for(int i = 0; i < nilaiMHS.length; i++){
    System.out.printf("Masukkan nilai Mahasiswa ke-%d : ", i+1);
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahasiswa ke-1 : 50
    Masukkan nilai Mahasiswa ke-2 : 45
    Masukkan nilai Mahasiswa ke-3 : 90
    Masukkan nilai Mahasiswa ke-4 : 100
    Masukkan nilai Mahasiswa ke-5 : 85
    Masukkan nilai Mahasiswa ke-6 : 80
    Masukkan nilai Mahasiswa ke-7 : 55
    Masukkan nilai Mahasiswa ke-8 : 70
    Masukkan nilai Mahasiswa ke-9 : 75
    Masukkan nilai Mahasiswa ke-10 : 98
    

4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i<nilaiMHS.length; i++){
    total += nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 3 di atas, disini
rata = total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah " + rata);
```

    Rata-rata nilai mahasiswa adalah 74.8


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

Karena nilai rata-rata tidak akan di ulang maka tidak masuk ke perulangan. Sehingga akan menampilkan nilai rata-rata saat di akhir program saja. Penulisan sintaks rata-rata juga berada di luar for loop.

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

    int nilaiMHS[] = new int[10];
    int total1 = 0, total2 = 0;
    double rataLulus, rataTidakLulus;
    int jumlah1 = 0, jumlah2 =0;

        for(int i = 0; i < nilaiMHS.length; i++){
            System.out.printf("Masukkan nilai Mahasiswa ke-%d : ", i+1);
            nilaiMHS[i] = sc.nextInt();
    
        }
        for(int i = 0; i < nilaiMHS.length; i++){
            if(nilaiMHS[i] > 70){
            total1 += nilaiMHS[i];
            jumlah1 += 1;
            }else{
            total2 += nilaiMHS[i];
            jumlah2 += 1;        
            }
        }
        rataLulus = total1/jumlah1; 
            rataTidakLulus = total2/jumlah2;
            System.out.println("Rata-rata nilai mahasiswa yang lulus adalah " + rataLulus);
            System.out.println("Rata-rata nilai mahasiswa yang tidak lulus adalah " + rataTidakLulus);


```

    Masukkan nilai Mahasiswa ke-1 : 85
    Masukkan nilai Mahasiswa ke-2 : 70
    Masukkan nilai Mahasiswa ke-3 : 75
    Masukkan nilai Mahasiswa ke-4 : 65
    Masukkan nilai Mahasiswa ke-5 : 90
    Masukkan nilai Mahasiswa ke-6 : 100
    Masukkan nilai Mahasiswa ke-7 : 98
    Masukkan nilai Mahasiswa ke-8 : 55
    Masukkan nilai Mahasiswa ke-9 : 45
    Masukkan nilai Mahasiswa ke-10 : 35
    Rata-rata nilai mahasiswa yang lulus adalah 89.0
    Rata-rata nilai mahasiswa yang tidak lulus adalah 54.0
    

# Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int arr[] ={6, 4, 1, 9, 7, 3, 2, 8};
int key = 3;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i = 0; i < arr.length; i++){
    if(key == arr[i]){
        hasil = i;
        break;
    }
}
```

3. Tampilkan hasil pencarian dengan kode berikut.
![Gambar perulangan jumlah](images/P4L4.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 3 di atas, disini
System.out.println("Key ada di array ke-" + hasil);
```

    Key ada di array ke-5


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?

Kegunaan statement break pada percobaan 4 langkah ke-2 adalah untuk menghentikan perulangan atau keluar dari perulangan, sehingga jika kondisi sudah terpenuhi yaitu **if(key == arr[i])** maka akan langsung keluar dari perulangan menggunakan perintah "break" tadi.

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini

int arr[] ={6, 4, 1, 9, 7, 3, 2, 8};
int key = 5;
int hasil = -1;

for(int i = 0; i < arr.length; i++){
    if(key == arr[i]){
        hasil = i;
        break;
    }
}

System.out.println("Key ada di array ke-" + hasil);
```

    Key ada di array ke--1


Penjelasan :

Setelah program dijalankan hasilnya adalah array ke -1. Kenapa hasilnya array ke -1, karena angka 5 tidak terdapat pada isi array.

### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int arr[] = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;
```


```Java
// Tulis Kode program Percobaan 5 Langkah 2 di atas, disini
for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            
    
        }
```

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)

3. Tampilkan hasil pengurutan dengan menggunakan perulangan
![Gambar print](images/P5L3.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 3 di atas, disini
 System.out.println("Hasil pengurutan: ");
            for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
```

    Hasil pengurutan: 
    3
    4
    10
    12
    16
    27
    28
    90
    

Penjelasan :

- Kode program diatas digunakan untuk menampilkan hasil pengurutan bilangan dari yang terkecil hingga yang terbesar
- Menggunakan metode for loop
- Mendeklarasikan array dan menginisialisasinya.

## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
        int checkNum[] = new int[10];
        int eventNum[] = new int[10];
        int oddNum[] = new int[10];
        int cEven = 0, cOdd = 0;

        for(int i = 0; i < checkNum.length; i++){ // digunakan untuk melakukan masukkan nilai dari array checkNum[10]
            System.out.print("Masukkan checkNum : ");
            checkNum[i] = sc.nextInt();
        }
        for(int j =0; j < checkNum.length; j++){ 
           if(checkNum[j] % 2 == 0){ // digunakan untuk memilah bilangan genap. Jika hasil modulus 0 maka outputnya bilangan genap
            eventNum[cEven] = checkNum[j]; // menampung bilangan genap di variabel baru yaitu di variabel "eventNum"
            cEven++; //meningkatkan indeks cEven
           }else{
               oddNum[cOdd] = checkNum[j];  // menampung bilangan ganjil di variabel baru yaitu di variabel "oddNum"
               cOdd++; //meningkatkan indeks cEven
           }
            
        }

    System.out.println("====bilangan Genap====");
    for(int p : eventNum){
        System.out.print(p + " ");
    }

    System.out.println ("");
    System.out.println("====bilangan Ganjil====");
    for(int p : oddNum){
        System.out.print(p + " ");
    }
```

    Masukkan checkNum : 1
    Masukkan checkNum : 2
    Masukkan checkNum : 3
    Masukkan checkNum : 4
    Masukkan checkNum : 5
    Masukkan checkNum : 6
    Masukkan checkNum : 7
    Masukkan checkNum : 8
    Masukkan checkNum : 9
    Masukkan checkNum : 10
    ====bilangan Genap====
    2 4 6 8 10 0 0 0 0 0 
    ====bilangan Ganjil====
    1 3 5 7 9 0 0 0 0 0 

Penjelasan :
- Menggunakan Library Scanner untuk memasukkan input user melalui keyboard
- Mendeklarasikan Scanner dan array
- Dalam Kode program diatas akan menampilkan 10 input nilai array, dan kemudian angka genap dan ganjil akan di masukkan ke variabel baru. Setelah itu bilangan ganji dan genap yang berada di variabel baru di keluarkan.
- Pertama yang di lakukan adalah membuat wadah/tempat untuk memasukkan bilangan dari setiap indeks array. Disini terdapat 10 indeks, maka kita akan memasukkan 10 input (bilangan) melalui Scanner(input user melalui keyboard).
- setelah mengisi semua indeks, maka selanjutnya memilah bilangan ganjil dan genap.
- Perintah **if(checkNum[j] % 2 == 0)** digunakan untuk menyeleksi setiap bilangan yang kita input kan tadi. Apakah jika bilangan tersebut di modulus 2 hasilnya 0. Maka bilangan tersebut masuk ke dalam kategori Genap. Jika hasilnya tidak sama dengan 0 atau hasilnya 1. Maka masuk kategori bilangan ganjil
- Setelah diseleksi Masuk kategori bilnagan Genap atau Ganjil, maka akan di masukkan ke dalam variabel baru yaitu variabel **eventNum ==> sebagai variabel kategori bilangan genap** dan variabel **oddNum ==> sebagai variabel kategori bilangan ganjil**
- Kemudian Menampilkan bilangan Genap dan Ganjil yang sudah di tampung di variabel baru. Dengan menggunakan for each. 

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

        int array[];
        array = new int[5];
        
  
        for(int i = 0; i < array.length; i++){
            System.out.print("");
            array[i]= sc.nextInt(); // input nilai array setiap indeks nya.
        }
        System.out.println("");
        for(int i = array.length-1; i >= 0; i--){ // mengurutkan isi array dengan urutan terbalik
            System.out.print(array[i] + " "); //menampilkan isi array secara terbalik
            
        
        }

```

    5
    2
    7
    9
    6
    
    6 9 7 2 5 

penjelasan :
- Menggunakan Library Scanner
- Deklarasi Scanner dan arrray
- Kode program di atas digunakan untuk menampilkan isi array dan kemudian menampilkannya lagi dengan urutan terbalik
- Pertama untuk mengisi array pada setiap indeks nya yaitu menggunakan perulangan for. Kemudian variabel "array[i]" digunakan sebagai variabel penampung input dari user. 
- pengisian array akan berulang samapi batas panjang array yaitu 5. Setelah itu akan berhenti melakukan perulangan.
- Untuk menampilkan isi array secara terbalik yaitu sama menggunakan for loop akan tetapi pada nilai indeks array di mulai dari indeks yang paling terakhir, yaitu indeks ke 4.
- Perintah **for(int i = array.length-1; i >= 0; i--)** digunakan untuk menampilkan isi array seacra terbalik
- **int i = array.length-1** berarti indeks di mulai dari yang paling akhir. array.length itu bernilai 5, jadi jika di kurangi 1 hasilnya akan 4 (indeks array paling akhir).
- Agar indeks array yang di mulai dari yang paling akhir atau indeks ke-4 itu bisa looping, maka perulangan untuk menampilkan isi array secara terbalik tersebut menggunakan decrement. Sehingga urutannya yaitu dari indeks terbesar ke indeks terkecil.

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
        int array[];
        int jumlah;

        System.out.print("Masukkan isi array: "); // digunakan untuk menampung input jumlah indeks/ panjang data yang akan diisikan
        jumlah = input.nextInt();

        array = new int[jumlah]; // nilai variabel "array" sama dengan nilai variabel "jumlah"
        for(int i = 0; i< jumlah; i++){ // sebagai pengisian setiap indeks
            System.out.printf("Masukkan elemen array ke-%d: ", i);
            array[i] = input.nextInt();

        }
        int max = array[0];
        for(int i = 0; i < jumlah; i++){
            if(array[i] > max){ // mencari bilangan terbesar dengan melihat satu per satu nilai dari setiap indeks. Apakah lebih besar atau lebih kecil
                max = array[i]; // Setelah terdapat bilangan paling besar maka akan di masukkan atau di simpan pada variabel "max"
            }
        }
        System.out.printf("Bilangan terbesar adalah %d \n",max); //menampilkan bilangan max (terbesar)
```

    Masukkan isi array: 5
    Masukkan elemen array ke-0: 25
    Masukkan elemen array ke-1: 78
    Masukkan elemen array ke-2: 12
    Masukkan elemen array ke-3: 63
    Masukkan elemen array ke-4: 99
    Bilangan terbesar adalah 99 
    




    java.io.PrintStream@a19730c



Penjelasan :
- Menggunakan library Scanner untuk input nilai variabel oleh user menggunakan keyboard
- Mendeklarasikan Scanner dan variabel serta variabel array yang di butuhkan.
- Disini saya menggunakan tipe data integer karena nilai variabel adalah bilangan bulat
- Kode program duatas digunakan untuk menginput jumlah array atau berapa elemen yang akan kita isikan nilainya, serta menmapilkan nilai array yang terbesar (max).
- Maka yang pertama di lakukan adalah membuat variabel yang dapat menampung nilai untuk variabel "jumlah" yang di mana isi dari variabel "jumlah" adalah "jumlah indeks atau panjang data yang akan kita isi kan nilainya.
- Kode program **array = new int[jumlah];** digunakan untuk inisialisasi variabel "array" bahwa nilai dari variabel "array" adalah tergantung dengan input user yang memasukkan nilai dari variabel "jumlah". Misalkan nilai dari variabel "jumlah" adalah 5, maka nilai variabel "array" adalah 5.
- Setelah memasukkan jumlah indeks yang akan diisikan nilai, maka akan dibuat kode program untuk melakukan pengisian array, dengan menggunakan metode perulangan for (for loop). Peruangan tersebut akan terus berjalan sampai batas yang telah ditentukan yaitu **i < jumlah**. setelah itu akan berhenti dan menjalankan kode program selanjutnya (di bawahnya).
- Setelah mengisi semua indeks melalui perulangan. Sekarang akan mencari bilangan yang terbesar dari nilai indeks yang sudah kita inputkan tadi.
- kode program **int max = array[0];** berarti variabel max itu nilainya sama dengan nilai dari variabel "array[0]".
- **if(array[i] > max)** digunakan untuk mencari bilangan terbesar dengan cara looping satu persatu indeks array. Jika nilai dari array lebih besar dari variabel "max" maka nilai dari variabel "max" sama dengan nilai array yang lebih besar itu : **max = array[i];**
- Setelah itu akan keluar perulangan dan akan di output kan nilai max tersebut.
