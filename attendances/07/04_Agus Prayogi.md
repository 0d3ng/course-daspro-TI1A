## JOBSHEET 7

## PERULANGAN 1

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks perulangan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan for, while dan do-while

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart perulangan for dibawah ini!

    ![](images/flowchartFaktorial.png)
    

> Flowchart diatas digunakan untuk menghitung nilai faktorial, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel angka untuk menampung data yang diinput melalui keyboard




```Java
// Ketik kode program di bawah sini
import java.util.Scanner;

Scanner input = new Scanner(System.in);
```

#### Penjelasan
> melakukan import library scanner dan deklarasi variabel input digunakan untuk inputan user
___

3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
// Ketik kode program di bawah sini
int angka, faktorial = 1;
```

#### Penjelasan
> Mendefinisikan variable interger dengan nama `angka`, `faktorial`
___

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    ![](images/for.jpg)

```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial *= i;
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

#### Penjelasan
> pertama melakukan inputan angka dari user kemudian melakukan pengulangan menggunakan `for`, didalamnya terdapat perkalian variabel `faktorial` dikali variabel `i`, dengan variabel `i` menggunakan increment, jadi akan melakukan perkalian terus menerus hingga kondisi loop menjadi false dan akan mencetak output hasilnya. 
___

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    ![](images/while.jpg)


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
while(i <= angka){
    faktorial *= i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTIRIAL DENGAN WHILE=====
    angka 1 : Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 3125

#### Penjelasan
> pertama melakukan inputan angka dari user kemudian melakukan pengulangan menggunakan `while`, didalamnya terdapat perkalian variabel `faktorial` dikali variabel `i`, dengan variabel `i` menggunakan increment, jadi akan melakukan perkalian terus menerus hingga kondisi loop menjadi false dan akan mencetak output hasilnya. 
___

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    ![](images/dowhile.jpg)


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
do{
    faktorial *= i;
    i++;
}while(i<=angka);
System.out.print("Nilai faktirial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan : 5
    Nilai faktirial bilangan tersebut adalah : 120

#### Penjelasan
> pertama melakukan inputan angka dari user kemudian melakukan pengulangan menggunakan `do while`, didalamnya terdapat perkalian variabel `faktorial` dikali variabel `i`, dengan variabel `i` menggunakan increment, jadi akan melakukan perkalian terus menerus hingga kondisi loop menjadi false dan akan mencetak output hasilnya. 
___

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
    
    ![](images/hitungFaktorial.jpg)

// Ketik jawaban disini
> artinya variabel `faktorial` dikalikan dengan `i` kemudian hasilnya disimpan kedalam variabel `faktorial` itu sendiri.
___

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:

    ![](images/modifP1.jpg)


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i = 1;
System.out.printf("%d Faktorial = %d", angka, i);
while(i<=angka){
    faktorial *= i;
    ++i;
    if(i<=angka)
        System.out.printf("x%d", i);
}
System.out.printf(" = %d\n", faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan Bilangan : 5
    5 Faktorial = 1x2x3x4x5 = 120





    java.io.PrintStream@6cedbdf0



#### Penjelasan
> pertama melakukan inputan angka dari user kemudian melakukan pengulangan `while`, didalamnya terdapat perkalian variabel `faktorial` dikali variabel `i`, jika kondisi `i` lebih lebih kecil sama dengan `angka` maka  mencetak isi dari variabel `i`, dengan variabel `i` menggunakan increment, jadi akan melakukan perkalian terus menerus hingga kondisi loop menjadi false dan akan mencetak output hasilnya. 
___

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break

    ![](images/for2.jpg)

```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 2
    Masukkan Bilangan : 4
    Masukkan Bilangan : 50
    Jumlah angka-angka yang telah dimasukkan : 56


#### Penjelasan
> Melakukan pengulangan `for` terus menerus dan didalamnya terdapat inputan angka yang akan ditambahkan dengan inputan sebelumnya hingga kondisi variabel `total` lebih dari 50 maka akan `break` (Berhenti mengulang), dan akan mencetak hasil variabel `total`.
___

2. Buat perulangan yang sama dengan struktur perulangan while

    ![](images/while2.jpg)


```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total = 0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

#### Penjelasan
> Melakukan pengulangan `while` terus menerus dan didalamnya terdapat inputan angka yang akan ditambahkan dengan inputan sebelumnya hingga kondisi variabel `total` lebih dari 50 maka akan `break` (Berhenti mengulang), dan akan mencetak hasil variabel `total`.
___

3. Tuliskan perulangan diatas dalam struktur do-while
    
    ![](images/dowhile2.jpg)
    

```Java
// Ketik kode program di atas di bawah sini
int angka, total;
System.out.println("===PROGRAM Do-WHILE LOOP DENGAN BREAK===");
total = 0;
do{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " + total);
```

#### Penjelasan
> Melakukan pengulangan `do while` terus menerus dan didalamnya terdapat inputan angka yang akan ditambahkan dengan inputan sebelumnya hingga kondisi variabel `total` lebih dari 50 maka akan `break` (Berhenti mengulang), dan akan mencetak hasil variabel `total`.
___

##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban disini
> Melakukan pengulangan terus menerus dan didalamnya terdapat inputan angka yang akan ditambahkan dengan inputan sebelumnya hingga kondisi variabel `total` lebih dari 50 maka akan `break` (Berhenti mengulang), dan akan mencetak hasil variabel `total`.
___

2. Jelaskan fungsi kode berikut!
    
    ![](images/forPertanyaan2.jpg)


// Ketik jawaban disini
> pengumpulan `for` yang akan mengulang terus menerus karena kondisinya `true` , atau sering disebut infinite loop.

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 

    ![](images/forContinue.jpg)


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int anka, total, count;
double avg;
count = 0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0; i<5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka>=50) continue;
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50: " + total);
avg = (double) total / count;
System.out.println("Rata-rata angka yang kurang dari 50: "+ avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 40
    Masukkan Bilangan : 60
    Masukkan Bilangan : 40
    Masukkan Bilangan : 10
    Masukkan Bilangan : 6
    Jumlah angka-angka yang kurang dari 50: 96
    Rata-rata angka yang kurang dari 50: 24.0


#### Penjelasan
> melakukan pengulangan `for` sebanyak 5 kali dan didalamnya terdapat user inputan dengan kondisi jika variabel `angka` lebih besar sama dengan 50 maka akan lanjut, jika tidak angka akan ditambahkan dengan inputan sebelumnya dan `count` di increment. Setelah pengulangan selesai, `total` dibagi dengan `count` dan dicetak hasilnya
___


```Java
5. Jalankan program. Amati apa yang terjadi!
```

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban disini
> dalam percobaan 2 user akan selalu diminta untuk memasukkan inputan angka jika total dari inputan sebelumnya kurang dari 50, sedangkan percobaan 3, user diminta memasukkan inputan sebanyak 5 kali, dan jika inputan user lebih dari sama dengan 50 maka akan diabaikan.
___

2. Jelaskan apa fungsi perintah kode program dibawah ini?

    ![](images/continuePertanyaan.jpg)

// Ketik jawaban disini
> Jika variabel `angka` lebih besar sama dengan 50 maka akan melanjutkan loop dan mengabaikan baris dibawahnya
___

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program yang meminta masukan user sebuah bilangan bulat N (N > 0). Program kemudian menampilkan penjumlahan N bilangan genap positif pertama (bilangan genap ≥ 0).
Contoh: 
    •	Jika user memasukkan N = 10, program akan menghitung banyaknya jumlah bilangan positive di dalam range bilangan 1-10   kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara 1-10 yaitu : 
        0 + 2 + 4 + 6 + 10 = 30. 
        Setelah itu program akan menampilkan rata-rata dari bilangan positive yang telah dijumlahkan tadi.
    •	Contoh output program dan flowchart

    ![](images/hasilTugasFc.jpg)
  
    ![](images/fcTugasJS7.png)



```Java
// Ketik kode program disini
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int bil, jmbBilGenap, totalGenap = 1;
double avg;

System.out.print("Masukkan Bilangan : ");
bil = sc.nextInt();
jmbBilGenap = bil/2;
System.out.printf("Banyaknya bilangan genap dari 1 sampai %d adalah %d\n", bil, jmbBilGenap);
System.out.print("Angka genap dalam range tersebut adalah");
for(int i=1; i<=bil; i++){
    if(i%2!=0)
        continue;
    else
        System.out.printf(" %d%s", i, (i==bil||i==(bil-1)? '.' : ','));
        totalGenap += i;
}
avg = totalGenap/jmbBilGenap;
System.out.printf("\nRata-rata bilangan genap dari 1 sampai %d adalah %.1f\n", bil, avg);
```

    Masukkan Bilangan : 10
    Banyaknya bilangan genap dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah 2, 4, 6, 8, 10.
    Rata-rata bilangan genap dari 1 sampai 10 adalah 6.0





    java.io.PrintStream@6cedbdf0



#### Penjelasan
> Pertama user diminta untuk memasukkan bilangan disimpan kedalam variabel `bil`, kemudian `bil` dibagi 2 untuk mendapatkan jumlah angka bilangan genap. kemudian melakukan pengulangan `for` untuk mendapatkan dan mencetak angka dengan jenis bilangan genap dan dijumlahkan semua angka tersebut kedalam variabel `totalGenap`. setelah pengulangan selesai variabel `totalGenap` dibagi `jmbBilGenap` untuk mendapatkan rata-rata, lalu dicetak hasilnya.
___

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini

    ![](images/tugas1.jpg)


```Java
// Ketik kode program disini
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int bil;

System.out.print("Masukkan Bilangan : ");
bil = sc.nextInt();
for(int i=0; i<=bil; i++){
    if(i%5==0)
        continue;
    System.out.println(i);
}
```

    Masukkan Bilangan : 20
    1
    2
    3
    4
    6
    7
    8
    9
    11
    12
    13
    14
    16
    17
    18
    19


#### Penjelasan
> Pertama, melakukan inputan angka oleh user, lalu melakukan pengulangan untuk mencetak angka dari variabel `i` kecuali jika `i` Kuosien 5 sama dengan 0, maka akan lanjut loop.
___

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
    
    ![](images/fibo.png)



```Java
// Ketik kode program disini
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int bil, bil2 = 1, jum;

System.out.print("Masukkan Bilangan : ");
bil = sc.nextInt();
int i = 0;
while(i <= bil) {
    jum = i + bil2;
    System.out.printf("Sum of: %d + %d = %d\n", i, bil2, jum);
    i = bil2;
    bil2 = jum;
}
```

    Masukkan Bilangan : 40
    Sum of: 0 + 1 = 1
    Sum of: 1 + 1 = 2
    Sum of: 1 + 2 = 3
    Sum of: 2 + 3 = 5
    Sum of: 3 + 5 = 8
    Sum of: 5 + 8 = 13
    Sum of: 8 + 13 = 21
    Sum of: 13 + 21 = 34
    Sum of: 21 + 34 = 55
    Sum of: 34 + 55 = 89


#### Penjelasan
> Pertama, melakukan inputan angka oleh user untuk menentukan bilangan pertama, kemudian terdapat pengulangan `while` didalamnya terdapat penjumlahan untuk menampilkan deret bilangan fibonacci, dengan urutan variabel `jum` akan menampung penjumlahan antara variabel `i` dan `bil2` kemudian mencetak output, lalu `i` diganti dengan `bil2`, `bil2` diganti dengan `jum` dan meneruskan pengulangan hingga kondisi false.
___
