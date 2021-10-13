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

    <p align="left">
    <img width="197" height="259" src="images/flowchartFaktorial.png">
    </p>
    

> Flowchart diatas digunakan untuk menghitung nilai faktorial, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel angka untuk menampung data yang diinput melalui keyboard




```Java
// Ketik kode program di bawah sini
import java.util.Scanner;
Scanner in = new Scanner(System.in);
```

```Java
3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas
```

```Java
// Ketik kode program di bawah sini
int angka;
int faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR =====");
System.out.print("Masukkan Bilangan : ");
angka = in.nextInt();
for(int i = 1; i <= angka; i++){
    faktorial *=i;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    ====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR =====
    Masukkan Bilangan : 3
    Nilai faktorial bilangan tersebut adalah : 6

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial =1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = in.nextInt();
int i = 1;
while(i <= angka){
    faktorial *=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>

// Ketik kode program di atas di bawah sini



```Java
faktorial = 1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.println("Masukkan Bilangan : ");
angka = in.nextInt();
int i = 1;
do{
    faktorial *= i;
    i++;
}
while(i <= angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : " + faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan : 
    6
    Nilai faktorial bilangan tersebut adalah : 720

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

// Ketik jawaban disini
untuk mengkalikan value faktorial dengan value i yang terus bertambah satu setiap perulangan.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>

// Ketik kode program di atas di bawah sini
setelah line "angka = in.nextInt();" rubah code dengan code berikut
```java
System.out.print(angka + "! = ");
for(int i = 1; i <= angka; i++){
    if (i< angka ){
        System.out.print(i + "x");
    }else{
        System.out.print(i);
    }
    faktorial *= i;
}
System.out.println(" = " + faktorial);
```

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total = 0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50)break;
}
System.out.println("Jumlah angka - angka yang telah dimasukkan : " + total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 8
    Masukkan Bilangan : 9
    Masukkan Bilangan : 10
    Masukkan Bilangan : 11
    Masukkan Bilangan : 12
    Masukkan Bilangan : 13
    Jumlah angka - angka yang telah dimasukkan : 63


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total = 0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50)break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : " +total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 51
    Jumlah angka-angka yang telah dimasukkan : 51


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total = 0;
do{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50)break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : " +total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan Bilangan : 100
    Jumlah angka-angka yang telah dimasukkan : 100


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban disini
kode program diatas berfungsi untuk menjumlahkan angka - angka yang ketika total angka - angka tersebut ditambahkan lebih dari 50, maka user tidak dapat menjumlahkan angka lagi atau program selesai.

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


// Ketik jawaban disini
total = 0 adalah expresi 1 yang berfungsi untuk inisialisasi, sedangkan true adalah ekspresi 2 yang berfungsi sebagai kondisi. Jadi ketika kondisi total > 50 terpenuhi maka program akan melakukan break atau menghentikan program.


#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka,total,count;
double avg;
count=0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka>=50)continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka - angka yang kurang dari 0: "+ total);
avg = (double)total/count;
System.out.println("Rata - rata angka yang kurang dari 50: " + avg);
```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan Bilangan : 16
    Masukkan Bilangan : 52
    Masukkan Bilangan : 23
    Masukkan Bilangan : 12
    Masukkan Bilangan : 13
    Jumlah angka - angka yang kurang dari 0: 64
    Rata - rata angka yang kurang dari 50: 16.0



```Java
5. Jalankan program. Amati apa yang terjadi!
```

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

perbedaan paling mendasar antara 2 percobaan tersebut terletak pada kondisi dan perintah program pada body, di percobaan 2 menggunakan kondisi if(angka >50) dengan perintah break. Hal ini berarti ketika angka sudah menyentuh di atas 50 maka loop otomatis berhenti. Sementara percobaan 3 menggunakan for loop dengan ekspresi ekspresi (int i = 0; i < 5 ; i++) yang berarti user hanya dapat menginput data sebanyak 5 kali. Jadi perbedaan nya terletakj pada jumlah loop, jika percobaan 2  loop bergantung pada nilai angka sementara percobaan 3 loop sudah jelas hanya dapat berjalan 5 kali.

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>


pada code tersebut terdapat if(angka >=50 )continue; . hal ini berarti ketika value angka yang diinputkan user lebih dari sama dengan 50, maka program tidak akan menyimpan value tersebut namun program tetap berjalan sesuai kondisi loop. pada code total += angka; berarti value pada variabel total terus ditambah dengan value yang diinputkan user di variabel angka selama loop dengan syarat angka yang diinputkan tidak lebih besar sama dengan 50. count++; berarti menghitung berapa angka yang tidak lebih besar sama dengan 50 yang diinputkan user selama loop,


### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program yang meminta masukan user sebuah bilangan bulat N (N > 0). Program kemudian menampilkan penjumlahan N bilangan genap positif pertama (bilangan genap ≥ 0).
Contoh: 
    •	Jika user memasukkan N = 10, program akan menghitung banyaknya jumlah bilangan positive di dalam range bilangan 1-10   kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara 1-10 yaitu : 
        0 + 2 + 4 + 6 + 10 = 30. 
        Setelah itu program akan menampilkan rata-rata dari bilangan positive yang telah dijumlahkan tadi.
    •	Contoh output program dan flowchart
<br/><img width="303" height="529" src="images/hasilTugasFc.jpg" align="left"><br/>
  

<br/><img width="303" height="529" src="images/fcTugasJS7.png" align="left">



```Java
// Ketik kode program disini
Scanner in = new Scanner(System.in);
int bil, jmlBilGenap,totalGenap=0;
double avg=0;
bil = in.nextInt();
System.out.println("Masukkan angka : " + bil);
jmlBilGenap = bil/2;
System.out.println("Banyaknya bilangan genap dari 1 sampai 10 adalah " + jmlBilGenap);
System.out.print("Angka bilangan genap tersebut adalah");
for(int i = 1; i <= bil;i++ ){
    if(i %2 !=0){
        continue;
    }else{
        System.out.print(", "+i);
    }
    totalGenap += i;
}
avg = totalGenap/jmlBilGenap;
System.out.println("\nHasil penjumlahan bilangan genap dari 1 sampai " + bil + " adalah " + totalGenap);
System.out.println("Rata - rata bilangan genap tersebut adalah " + avg);

```
    Masukkan angka : 10
    Banyaknya bilangan genap dari 1 sampai 10 adalah 5
    Angka bilangan genap tersebut adalah, 2, 4, 6, 8, 10
    Hasil penjumlahan bilangan genap dari 1 sampai 10 adalah 30
    Rata - rata bilangan genap tersebut adalah 6.0

Program tersebut berfungsi untuk menghitung banyaknya bilangan genap dari satu sampai angka yang diinginkan user,mencari angka - angka genapnya tersebut, lalu mencari jumlahnya, kemudian menghitung rata ratanya. Untuk menghitung banyaknya bilangan genap, kita hanya perlu membuat program yang dapat membagi 2 bilangan yang diinputkan user. Untuk mencari berpa saja bilangan genapnya, kita harus membuat program perulangan, di sini kita memakai for yang menginisialisasi i = 1,berkondisi i <= bilangan yang diinputkan user, lalu increment. Hal ini bertujuan agar perulangan dilakukan sebanyak bilangan yang diinputkan user. Lalu untuk statement kita melakukan pengecekan, apakah value dari i(banyaknya bilangan bulat dari 1 sampai bilangan yang diinputkan user) itu menghasilkan sisa jika dibagi dengan 2, jika iya maka angka tersebut tidak akan disimpan di variabel i, namun jika tidak maka angka tersebut akan ditampilkan. Setelah mendapatkan seluruh bilangan - bilangan genapnya, kita ingin menjumlahkan seluruh bilangan genap tersebut. Kita membuat kode totalGenap += i; agar value totalGenap yang berisikan 0 pada awal program bisa ditambahkan dengan value dari variabel i yang sudah terseleksi menyisakan bilangan genap. Perintah ini dilakukan didalam loop agar value dari totalGenap dapat terus ditambah sesuai dengan kondisi loop. Lalu untuk menghitung rata-ratanya, kita hanya perlu membuat kode yang bisa merubah value dari variabel avg dengan operasi pembagian dari value totalGenap dengan jmlBilGenap. Terakhir kita hanya perlu menampilkan rata - rata tersebut sesuai dengan format yang tertera dengan perintah System.out.println .

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
Scanner in = new Scanner(System.in);
int angka = in.nextInt();
for(int i = 1; i <= angka ; i++){
    System.out.println(i);
}
```

    19
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    11
    12
    13
    14
    15
    16
    17
    18
    19

program tersebut sangat sederhana. Pada program tersebut terdapat for loop yang berfungsi mencetak value i sebanyak value yang diinputkan user pada variabel angka. Karena terdapat increment pada variabel i, jadi nilai dari i terus bertambah 1 seiring berjalannya loop.

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int num1 = 0;
int num2 = 1;
int sumOf;
for(int i = 0;i < n; ++i){
    System.out.print("Sum of: " + num1 + " + " + num2 +" = ");
    sumOf = num1 + num2;
    num1 = num2;
    num2 = sumOf;
    System.out.println(sumOf);
}
```

    11
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
    Sum of: 55 + 89 = 144

Pada program tersebut. terdapat variabel n yang berfungsi sebagai wadah untuk menampung value yang diinputkan user. Lalu terdapat inisialisasi variabel num1 dan num2 karena pada gambar angka pertama dan kedua yang ditambahkan adalah 0 dan 1 serta variabel sumOf untuk menampung nilai nantinya . Kemudian pada for loop dibuat seperti for(int i = 0;i < n; ++i) bertujuan agar loop terjadi sebanyak n kali. Untuk code - code dalam body, pertama kita harus mencetak value num1 dan num2 nya terlebih dahulu sebelum mengalami perubahan. Setelah itu, kita baru membuat operasinya yaitu seperti perintah, angka ke n merupakan penjumlahan dari dua angka sebelumnya, sehingga untuk mencari nilai n diperlukan kode untuk menjumlahkannya yaitu variabel sumOf berisi value dari penjumlahan value dari variabel num1 dan num2. Karena setiap kali loop nilai dari num1 dan num2 selalu berubah sesua nilai n mengingat nilai n adalah hasil penjumlahan dua angka sebelumnya, maka kita perlu untuk mengumbah value num1 dengan num2, num2 dengan sumOf. Sehingga variabel num1 dan num2 selalu berisikan value 2 angka sebelum n. Jika sudah kita hanya perlu menampilkan value dari sumOf dengan perintah print(sumOf).