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
int[] bil=new int[4];
```

2. Isi masing-masing elemen array bil tadi dengan angka 5, 12, 7, 20.
![Gambar 0](images/P1L3.png)


```Java
bil[0] = 5;
bil[1] = 12;
bil[2] = 7;
bil[3] = 20;
```




    20



3. Tampilkan ke layar semua isi elemennya:
![Gambar 4](images/P1L4.png)


```Java
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

Jawab :

Indeks terbesar yaitu 3 dengan element 20

Indeks terkecil yaitu 0 dengan element 5

2. Jika Isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?

Program akan eror karena tipe data yang digunakan merupakan integer yang merupakan bilangan bulat bukan bilangan decimal.

3. Ubah statement pada langkah No 3 menjadi seperti berikut
![Gambar pertanyaan 3](images/P1T3.png)
Apa keluaran dari program? Mengapa bisa demikian?


```Java
for(int i=0; i<4; i++){
    System.out.println(bil[i]);
}
```

    5
    12
    7
    20


Penjelasan :

Cara yang digunakan pada sebelumnya yaitu cara manual, sedangkan dengan menggunakan for atau perulangan akan lebih ringkas dengan hasil yang sama 

### Percobaan 2: Meminta Inputan Pengguna untuk Mengisi Elemen Array
1. Pada percobaan ke-2 akan dilakukan percobaan yang meminta inputan pengguna untuk mengisi elemen array seperti pada flowchart berikut
![Gambar Flowchart](images/FCpercobaan2.png)

2. Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar import scanner](images/P2L2.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

3. Buat array bertipe integer dengan nama nilaiUAS, dengan kapasitas 6 elemen.
![Gambar deklarasi array](images/P2L3.png)


```Java
int[] nilaiUAS = new int[6];
```

4. Menggunakan perulangan, buat input untuk mengisi elemen dari array nilaiUAS.
![Gambar perulangan input](images/P2L4.png)


```Java
for(int i = 0; i < 6; i++){
    System.out.print("Masukkan Nilai UAS ke-" + i + ":");
    nilaiUAS[i] = sc.nextInt();
}
```

    Masukkan Nilai UAS ke-0:100
    Masukkan Nilai UAS ke-1:100
    Masukkan Nilai UAS ke-2:100
    Masukkan Nilai UAS ke-3:100
    Masukkan Nilai UAS ke-4:

5. Menggunakan perulangan, tampilkan semua isi elemen dari array nilaiUAS.
![Gambar perulangan print](images/P2L5.png)


```Java
for(int i=0; i<6; i++){
    System.out.println("Nilai UAS ke-" + i + " adalah : "+ nilaiUAS[i]);
}
```

#### Pertanyaan
1. Ubah statement pada langkah No 4 menjadi seperti berikut ini :
![Gambar pertanyaan1](images/P2T1.png)
Jalankan program, apakah terjadi perubahan? Mengapa demikian?



```Java
for(int i=0; i<nilaiUAS.length; i++){
    System.out.println("Nilai UAS ke-" + i + " : ");
    nilaiUAS[i] = sc.nextInt();
}
```

Jawab :

Tidak ada perubahan, karena pada dasarnya namaArray.length memiliki fungsi sebagai penghitung jumlah array yang ada, jika sebelumnya menggunakan angka yang menunjukan total indeks yang ada secara manual, namun length secara otomatis. 

2. Apa kegunaan dari `nilaiUAS.length`? 

Menurut sepemahaman saya nilaiUAS.length berfungsi sebagai pengganti dari total jumlah semua nilai UAS yang ada dalam suatu array jadi nanti tidak menghitung jumlah array satu persatu namun dengan otomatis.

3. Ubah statement pada langkah No 5 menjadi seperti berikut ini sehingga program hanya menampilkan status mahasiswa yang lulus saja:
![Gambar pertanyaan1](images/P2T3.png)
Jalankan program dan Jelaskan alur program!


```Java
for(int i=0; i<nilaiUAS.length; i++){
    if(nilaiUAS[i] > 70){
     System.out.println("Mahasiswa ke-" + i + " lulus ");   
    }
}
```

Jawab :

for(int i=0; i<nilaiUAS.length; i++){

- disini program meng inisialisasi perulangan dengan berbagai ekspresi untuk memproses inputan yang nantinya akan dimasukkan ke dalam variabel array

    
 if(nilaiUAS[i] > 70){
     System.out.println("Mahasiswa ke-" + i + " lulus ");   

- Kemudian didalam perulangan terdapat pemilihan yang mana nantinya ketika ada nilai dalam variabel array yang lebih dari 70, maka akan mengeluarkan tampilan "Mahasiswa Ke-i Lulus"

    }
}

### Percobaan 3: Melakukan Operasi Aritmatika terhadap Elemen Array
Pada praktikum ini, akan dilakukan percobaan untuk menjumlahkan Array. Program akan menerima input sebanyak 10 nilai mahasiswa. Kemudian program akan menampilkan nilai rata-rata nilai dari 10 Mahasiswa. Seperti flowchart berikut
![Gambar flowchart](images/FCpercobaan3.png)

1.Import dan deklarasikan Scanner untuk keperluan input. 
![Gambar deklarasi scanner](images/P3L1.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
```

2. Buat array nilaiMHS bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata seperti gambar berikut ini
![Gambar deklarasi variabel](images/P3L2.png)



```Java
int nilaiMHS[] = new int[10];
double total;
double rata;
```

3. Menggunakan perulangan, buat input untuk mengisi array nilaiMHS
![Gambar perulangan input](images/P3L3.png)



```Java
for (int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = sc.nextInt();
}
```

4. Menggunakan perulangan untuk menghitung jumlah keseluruhan nilai.
![Gambar perulangan jumlah](images/P3L4.png)



```Java
for(int i = 0; i < nilaiMHS.length; i++){
    total+=nilaiMHS[i];
}
```

5. Kemudian hitung nilai rata-rata dengan cara nilai total dibagi jumlah elemen dari array nilaiMHS\
![Gambar hitung rata2](images/P3L5.png)



```Java
rata = total/nilaiMHS.length;
System.out.println("Rata-rata nilai mahasiswa adalah "+rata)
```

#### Pertanyaan 
1. Pada Percobaan 3 langkah ke-5. Mengapa perhitungan rata berada diluar perulangan?

Jawab :

Karena unsur variable yang ada didalam rumus rata merupakan hasil final dari perulangan yang ada pada sebelum rumus rata, jika rata dimasukkan diawal atau didalam perulangan maka tidak akan mendapatkan hasil yang final.

2. Modifikasi program pada percobaan 3 sehingga bisa mengeluarkan output  seperti gambar berikut ini!
syarat lulus nilai >70
![Gambar pertanyaan 2](images/P3T2.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int nilaiMHS[] = new int[10];
int mhslulus, mhstidaklulus;
double totallulus, totaltidaklulus;
double ratalulus, ratatidaklulus;

for (int i = 0; i<nilaiMHS.length; i++){
    System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+":");
    nilaiMHS[i] = sc.nextInt();
}
for(int i = 0; i < nilaiMHS.length; i++){
    if(nilaiMHS[i] > 70){
    totallulus += nilaiMHS[i];
    mhslulus++;
    }else{
    totaltidaklulus += nilaiMHS[i];
    mhstidaklulus++;
}
}

ratalulus = totallulus/mhslulus;
ratatidaklulus = totaltidaklulus/mhstidaklulus;
System.out.println("Rata-rata nilai mahasiswa lulus adalah "+ratalulus);
System.out.println("Rata-rata nilai mahasiswa tidak lulus adalah "+ratatidaklulus);
```

### Percobaan 4: Pencarian menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mencari lokasi/indeks sebuah angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart searching](images/FCpercobaan4.png) 

1. Buat array arr[] bertipe integer dengan kapasitas 6 dan isi dengan nilai 6, 4, 1, 9, 7, 3, 2 dan 8. Kemudian deklarasikan variabel integer `key` untuk kata kunci pencarian dan variabel `hasil` untuk hasil indeks pencarian. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi variabel](images/P4L2.png)



```Java
int[] arr = {6,4,1,9,7,3,2,8};
int key = 3;
int hasil = -1;
```

2. Menggunakan perulangan, lakukan pencarian untuk mendapatkan nilai array yang sesuai dengan key. Bila ada yang sesuai, simpan indeksnya sebagai hasil pencarian
![Gambar perulangan search](images/p4L3.png)



```Java
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
System.out.println("Key ada di array ke-"+hasil);
```

#### Pertanyaan 
1. Pada Percobaan 4 langkah ke-2. Apa kegunaan dari statement `break`?

Jawab :

kegunaannya untuk menghentikan program ketika array sudah sampai pada indeks yang elemennya sama dengan nilai pada variabel key

2. Modifikasi program pada percobaan 4 sehingga key yang dicari adalah angka 5. Kemudian jalankan program, amati hasilnya! Jelaskan penyebab dari hasil tersebut! 


```Java
int[] arr = {6,4,1,9,7,3,2,8};
int key = 5;
int hasil = -1;

for(int i=0; i<arr.length; i++){
    if(key==arr[i]){
        hasil=i;
        break;
    }
}

System.out.println("Key ada di array ke-"+hasil);
```

Jawab : 

Mengapa hasil outputnya -1 ? karena dalam array tidak ditemukan variabel yang bernilai 5 maka dari itu program langsung memberikan output -1 sebagai hasil default yang telah diinisialisasi diawal. 

### Percobaan 5: Pengurutan bilangan menggunakan Array
Pada praktikum ini, akan dilakukan percobaan untuk mengurutkan angka dalam array. Sesuai dengan flowchart di bawah ini:
![Gambar flowchart sorting](images/FCpercobaan5.png)
1.Buat array arr[] bertipe integer dengan kapasitas 8 dan isi dengan nilai 16, 4, 10, 90, 27, 3, 12 dan 28. Kemudian deklarasikan variabel integer `temp` untuk media penukaran nilai pada variabel. Deklarasi dan inisialisasi seperti gambar berikut ini
![Gambar deklarasi dan inisialisasi](images/P5L1.png)


```Java
int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
int temp = 0;
```


```Java
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
System.out.println("Hasil pengurutan: ");
for(int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);
```

## Tugas
### Soal 1
Buatlah program yang **sesuai** dengan alur _flowchart_ di bawah ini
![Soal 1](images/soal1.png)

Flowchart diatas menggambarkan alur program yang membaca 10 masukan pengguna berupa integer dan menyimpannya. Kemudian angka ganjil dan genap disimpan kembali ke dalam variabel lain yang terpisah


```Java
import java.util.Scanner;
Scanner haikal =  new Scanner(System.in);

int evenNum[] = new int[10];
int oddNum[] = new int[10];
int checkNum[] = new int[10];
int cEven, cOdd = 0;

for(int i=0; i<checkNum.length; i++){
    System.out.print("Silahkan masukkan nilai "+ (i+1) +" : ");
    checkNum[i] = haikal.nextInt();
} 

for(int j=0; j<checkNum.length; j++){
    if(checkNum[j] %2 == 0){
        evenNum[cEven] = checkNum[j];
        cEven++;
    } else {
        oddNum[cOdd] = checkNum[j];
        cOdd++;
    }
}

System.out.print("Bilangan ganjil : ");
for(int k=0; k<cOdd; k++){
    System.out.print(oddNum[k] + " ");
}
System.out.print("\nBilangan genap : ");
for(int l=0; l<cEven; l++){
    System.out.print(evenNum[l] + " ");
}
```

# Soal 2
Buatlah program yang terdapat array dengan jumlah elemen 5, buatlah input untuk mengisi elemen array tersebut, kemudian tampilkan isi array tersebut dengan urutan terbalik. Seperti ilustrasi gambar dibawah ini.
![Soal 2](images/T2.png)


```Java
import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

int arrayhaikal[] = new int[5];
int i;

for (i = 0; i<arrayhaikal.length; i++){
    System.out.print("Masukkan angka ke-"+ (i+1) + " : ");
    arrayhaikal[i] = haikal.nextInt();
}

for (i = arrayhaikal.length-1; i>=0; i--){
    System.out.print("\n");
    System.out.println(+arrayhaikal[i]+"");
}
```

##### Soal 3
Buatlah program yang menerima input jumlah elemen array, inputkan isi arraynya, kemudian tampilkan bilangan terbesar dari isi elemen arraynya. Contoh hasil program:
![Soal 3](images/t3.png)


```Java
import java.util.Scanner;
Scanner haikal = new Scanner(System.in);

int angka, max;

System.out.print("Total elemen array yang diinginkan : ");
int angka [] = new int[haikal.nextInt()];

for(int i=0; i<angka.length; i++){
    System.out.print("Silahkan masukkan elemen array ke-" + (i+1) + ": ");
    angka[i] = haikal.nextInt();
} 

max = angka[0];
for(int i=0; i<angka.length; i++){
    if(angka[i] > max){
        max = angka[i];
    }
}

System.out.println("Bilangan terbesar adalah "+ max);
```
