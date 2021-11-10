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
int[] bil=new int[4];
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

    0
    0
    0
    0


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


```Java
// Tulis Jawaban no 1 disini
Indeks array dari terbesar ke terkecil:
Indeks 3, Indeks 1, Indeks 2, Indeks 0.
```

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 2 yang disini
Tidak bisa, karena array menggunakan variabel integer dimana integer hanya bisa menampung bilangan bulat.
```

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
// Tulis Jawaban no 3 yang disini
Keluar bilangan 0 sebanyak 4 kali dengan spasi baris, karena pada perintah tersebut merupakan loop dimulai dari 0 sampai 3, yang berarti mengeluarkan 4 output. Lalu pada array tidak diisi nilai, jadi akan keluar bilangan 0 sebagai nilai pertama.
```

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)

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
    System.out.print("Masukkan nilai UAS ke-" + i + ": ");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukkan nilai UAS ke-0: 123
    Masukkan nilai UAS ke-1: 234
    Masukkan nilai UAS ke-2: 345
    Masukkan nilai UAS ke-3: 456
    Masukkan nilai UAS ke-4: 567
    Masukkan nilai UAS ke-5: 678


### 5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
// Tulis Kode program Percobaan 2 Langkah 5 di atas

for(int i = 0; i < 6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah " + nilaiUAS[i]);
}
```

    Mahasiswa ke-0 lulus
    Mahasiswa ke-1 lulus
    Mahasiswa ke-2 lulus
    Mahasiswa ke-3 lulus
    Mahasiswa ke-4 lulus
    Mahasiswa ke-5 lulus


#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
// Tulis Jawaban nomor 1 disini
Tidak, karena looping mengikuti jumlah panjang dari arrray, dimana panjang array adalah 6, maka sistem akan sama keluar dimulai dengan 0 dan diakhiri dengan 5.
```

2. Apa kegunaan dari `nilaiUAS.length`? 


```Java
// Tulis Jawaban nomor 2 disini
Panjang array pada variabel nilaiUAS yang sudah dibentuk sebelumnya
```

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
// Tulis Jawaban nomor 3 disini
Alurnya yaitu pertama memasukkan nilai pada setiap mahasiswa. Lalu akan dihitung dalam loop nilai mahasiswa, jika nilai mahasiswa diatas 70, maka akan muncul output "Mahasiswa ke-i lulus". i merupakan urutan mahasiswa. Pernyataan akan dicetak berurutan dan selama tidak sama atau melebihi batas akhir loop.  
```

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
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahsiswa ke-"+(i+1)+": ");
    nilaiMHS[i] = sc.nextInt();
}
```

    Masukkan nilai Mahsiswa ke-1: 70
    Masukkan nilai Mahsiswa ke-2: 80
    Masukkan nilai Mahsiswa ke-3: 70
    Masukkan nilai Mahsiswa ke-4: 80
    Masukkan nilai Mahsiswa ke-5: 70
    Masukkan nilai Mahsiswa ke-6: 80
    Masukkan nilai Mahsiswa ke-7: 70
    Masukkan nilai Mahsiswa ke-8: 80
    Masukkan nilai Mahsiswa ke-9: 70
    Masukkan nilai Mahsiswa ke-10: 80


4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 4 di atas, disini
for(int i = 0; i<nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
// Tulis Kode program Percobaan 3 Langkah 5 di atas, disini
rata = total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah " + rata);
```

    Rata-rata nilai mahasiswa adalah 72.5


#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?


```Java
// Tulis jawaban no 1 disini
Agar sistem bisa mengulang sampai selesai, setelah itu baru dijumlahkan oleh sistem. Jika dimasukkan dalam loop maka sistem akan menjumlah secara terus menerus sesuai jumlah looping.
```

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
// Tulis jawaban no 2 disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int nilaiMHS[] = new int[10];
double total;
double rata;
double nilaiTdkLulus, nilaiLulus, totalLulus, totalTdkLulus, jmlSiswaLulus, jmlSiswaTdkLulus;
for(int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahsiswa ke-"+(i+1)+": ");
    nilaiMHS[i] = sc.nextInt();
   
}
for(int i = 0; i<nilaiMHS.length; i++){
 if(nilaiMHS[i] > 70){
    nilaiLulus+=nilaiMHS[i];
    jmlSiswaLulus++;
} else {
     nilaiTdkLulus+=nilaiMHS[i];
    jmlSiswaTdkLulus++;
}
}
totalLulus = nilaiLulus/jmlSiswaLulus;
totalTdkLulus = nilaiTdkLulus/jmlSiswaTdkLulus;
 
System.out.println("Rata-rata nilai mahasiswa yang lulus adalah " + totalLulus);
System.out.println("Rata-rata nilai mahasiswa yang tidak lulus adalah " + totalTdkLulus);
```

    Masukkan nilai Mahsiswa ke-1: 50
    Masukkan nilai Mahsiswa ke-2: 50
    Masukkan nilai Mahsiswa ke-3: 50
    Masukkan nilai Mahsiswa ke-4: 50
    Masukkan nilai Mahsiswa ke-5: 50
    Masukkan nilai Mahsiswa ke-6: 50
    Masukkan nilai Mahsiswa ke-7: 50
    Masukkan nilai Mahsiswa ke-8: 50
    Masukkan nilai Mahsiswa ke-9: 50
    Masukkan nilai Mahsiswa ke-10: 50
    Rata-rata nilai mahasiswa yang lulus adalah NaN
    Rata-rata nilai mahasiswa yang tidak lulus adalah 50.0


Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 1 di atas, disini
int[] arr = {6,4,1,9,7,3,2,8};
int key = 3;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
// Tulis Kode program Percobaan 4 Langkah 2 di atas, disini
for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
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

    Key ada di array ke--1


#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?


```Java
// Tulis jawaban no 1 disini
Kegunaan statemenet break adalah menghentikan perulangan jika key sudah ditemukan pada array, setelah berhenti maka variabel hasil akan dikonvrersi menjadi nilai key, lalu baru sistem akan menggunakan break untuk menghentikannya
```

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
// Tulis jawaban no 2 disini
Penyebabnya yaitu sistem tidak bisa menemukan angka 5 pada array, maka yang di print adalah nilai asli dari varibel hasil, yaitu -1
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


### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 1 disini
int[] arr = {16, 4, 10, 90, 27, 3, 12,  28};
int temp = 0;
```

2. Menggunakan perulangan, lakukan pengurutan bilangan dengan menukar posisi indeks tersebut dengan indeks berikutnya. Perulangan dilakukan untuk menukar posisi berulang kali. 
![Gambar sorting](images/P5L2.png)


```Java
// Tulis Kode program Percobaan 5 Langkah 2 disini
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


## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
/* Jawaban Soal 1 disini */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int checkNum[] = new int[10];
int evenNum[] = new int[10];
int oddNum[] = new int[10];
int cEven, cOdd=0;
for(int i = 0; i < checkNum.length ; i++){
    System.out.print("Masukkan Bilangan: ");
    checkNum[i] = input.nextInt();
    }
for(int j = 0; j < checkNum.length; j++){
    if(checkNum[j] %2==0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}
    System.out.print("\nNilai Ganjil: ");
     
    for(int ganjil = 0; ganjil < oddNum.length; ganjil++){
       if(oddNum[ganjil] != 0){
        System.out.print(oddNum[ganjil] + " ");
    }
    }
    System.out.print("\nNilai Genap: ");
    
    for(int genap = 0; genap < evenNum.length; genap++){
        if(evenNum[genap] != 0){
        System.out.print(evenNum[genap] + " ");
        }
    }
    

    

```

    Masukkan Bilangan: 1
    Masukkan Bilangan: 2
    Masukkan Bilangan: 3
    Masukkan Bilangan: 4
    Masukkan Bilangan: 5
    Masukkan Bilangan: 6
    Masukkan Bilangan: 7
    Masukkan Bilangan: 8
    Masukkan Bilangan: 9
    Masukkan Bilangan: 10
    
    Nilai Ganjil: 1 3 5 7 9 
    Nilai Genap: 2 4 6 8 10 

###### Penjelasan: Pada program diatas user diminta untuk menginput 10 nilai, lalu nilai ganjil akan masuk ke variabel baru,begitu juga bilangan genap, lalu sistem akan mengeluarkan output berupa pengelompokan bilangan ganjil dan pengelompokan bilangan genap.

### Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
/* Jawaban Soal 2 disini */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int[] bil=new int[5];
System.out.print("Masukkan elemen array ke-0: ");
bil[0] = input.nextInt();
System.out.print("Masukkan elemen array ke-1: ");
bil[1] = input.nextInt();
System.out.print("Masukkan elemen array ke-2: ");
bil[2] = input.nextInt();
System.out.print("Masukkan elemen array ke-3: ");
bil[3] = input.nextInt();
System.out.print("Masukkan elemen array ke-4: ");
bil[4] = input.nextInt();
System.out.println("bil[0] = " + bil[4]);
System.out.println("bil[1] = " + bil[3]);
System.out.println("bil[2] = " + bil[2]);
System.out.println("bil[3] = " + bil[1]);
System.out.println("bil[4] = " + bil[0]);
```

    Masukkan elemen array ke-0: 12
    Masukkan elemen array ke-1: 23
    Masukkan elemen array ke-2: 34
    Masukkan elemen array ke-3: 45
    Masukkan elemen array ke-4: 56
    bil[0] = 56
    bil[1] = 45
    bil[2] = 34
    bil[3] = 23
    bil[4] = 12


Penjelasan: Pertama user diminta menginputkan 5 nilai, dimulai dengan nilai ke-0 sampai nilai ke-4, lalu outputya akan dibalik mulai dari nilai ke-4.

### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
/* Jawaban Soal 3 disini */
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int[] bil=new int[5];
System.out.print("Masukkan elemen array ke-0: ");
bil[0] = input.nextInt();
System.out.print("Masukkan elemen array ke-1: ");
bil[1] = input.nextInt();
System.out.print("Masukkan elemen array ke-2: ");
bil[2] = input.nextInt();
System.out.print("Masukkan elemen array ke-3: ");
bil[3] = input.nextInt();
System.out.print("Masukkan elemen array ke-4: ");
bil[4] = input.nextInt();
if(bil[0] > bil[1]  && bil[0] > bil[2] && bil[0] > bil[3] && bil[0] < bil[4]){
    System.out.print("Bilangan Terbesar Adalah: " + bil[0]);
} else if (bil[1] > bil[0]  && bil[1] > bil[2] && bil[1] > bil[3] && bil[1] > bil[4]){
    System.out.print("Bilangan Terbesar Adalah: " + bil[1]);
} else if (bil[2] > bil[1]  && bil[2] > bil[0] && bil[2] > bil[3] && bil[2] > bil[4]){
    System.out.print("Bilangan Terbesar Adalah: " + bil[2]);
} else if (bil[3] > bil[1]  && bil[3] > bil[2] && bil[3] > bil[0] && bil[3] > bil[4]){
    System.out.print("Bilangan Terbesar Adalah: " + bil[3]);
} else if (bil[4] > bil[1]  && bil[4] > bil[2] && bil[4] > bil[0] && bil[4] > bil[3]){
    System.out.print("Bilangan Terbesar Adalah: " + bil[4]);
    }
```

    Masukkan elemen array ke-0: 123
    Masukkan elemen array ke-1: 234
    Masukkan elemen array ke-2: 345
    Masukkan elemen array ke-3: 456
    Masukkan elemen array ke-4: 567
    Bilangan Terbesar Adalah: 567

Penjelasan: Pertama tama user diminta menginputkan 5 nilai dimulai dengan array 0. Lalu sistem akan menyeleksi nilai mana yang paling terbesar. Lalu mencetak bilangan terbesarnya.
