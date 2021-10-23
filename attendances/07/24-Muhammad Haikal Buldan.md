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
import java.util.Scanner ;
Scanner sc = new Scanner(System.in);
```

3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas


```Java
int angka, faktorial = 1
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
faktorial = 1;
System.out.println("=====Program Menghitung Nilai Faktorial Dengan For=====");
System.out.print("Masukkan Bilangan \t : ");
angka= sc.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : "+faktorial);
```

    =====Program Menghitung Nilai Faktorial Dengan For=====
    Masukkan Bilangan 	 : 4
    Nilai faktorial bilangan tersebut adalah : 24

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("=====Program Menghitung Nilai Faktorial Dengan For=====");
System.out.print("Masukkan Bilangan \t : ");
angka= sc.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
    i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====Program Menghitung Nilai Faktorial Dengan For=====
    Masukkan Bilangan 	 : 4
    Nilai faktorial bilangan tersebut adalah : 24

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("=====Program Menghitung Nilai Faktorial Dengan For=====");
System.out.print("Masukkan Bilangan \t : ");
angka= sc.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);

```

    =====Program Menghitung Nilai Faktorial Dengan For=====
    Masukkan Bilangan 	 : 4
    Nilai faktorial bilangan tersebut adalah : 24

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>

Penjabaran dari codingan di atas adalah faktorial = faktorial * i
yang artinya nilai dari variabel faktorial didapat dari faktorial sebelum dikalikan dengan i sebelum 
jadi saat mencari faktorial pada perulangan kedua menggunakan hasil faktorial pertama dikalikan i yang sudah di increment sebelumnya.

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
Scanner sc = new Scanner(System.in);

        int faktorial = 1, angka;
        System.out.println("=====Program Menghitung Nilai Faktorial =====");
        System.out.print("Masukkan Bilangan \t : ");
        angka = sc.nextInt();
        System.out.print(angka + " Faktorial = ");

        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
            if (i < angka) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + faktorial);
```

    =====Program Menghitung Nilai Faktorial =====
    Masukkan Bilangan 	 : 4
    4 Faktorial = 1 x 2 x 3 x 4 = 24


#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
Scanner sc=new Scanner(System.in);
int angka, total;
System.out.println("=====Program For Loop Dengan Break=====");
for(total=0;true;){
    System.out.print("Masukkan Bilangan \t : ");
    angka=sc.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);

```

    =====Program For Loop Dengan Break=====
    Masukkan Bilangan 	 : 4
    Masukkan Bilangan 	 : 10
    Masukkan Bilangan 	 : 50
    Jumlah angka-angka yang telah dimasukkan : 64


2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
Scanner sc=new Scanner(System.in);
int angka, total;
System.out.println("=====Program While Loop Dengan Break=====");
total=0;
while(true){
    System.out.print("Masukkan Bilangan \t : ");
    angka=sc.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);

```

    =====Program While Loop Dengan Break=====
    Masukkan Bilangan 	 : 10
    Masukkan Bilangan 	 : 40
    Masukkan Bilangan 	 : 40
    Jumlah angka-angka yang telah dimasukkan : 90


#### 3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
Scanner sc=new Scanner(System.in);
int angka, total;
System.out.println("=====Program Do-While Loop Dengan Break=====");
total=0;
do
{
    System.out.print("Masukkan Bilangan \t : ");
    angka=sc.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);

```

    =====Program Do-While Loop Dengan Break=====
    Masukkan Bilangan 	 : 4
    Masukkan Bilangan 	 : 100
    Jumlah angka-angka yang telah dimasukkan : 104


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

Codingan diatas secara keseluruhan bertujuan menginputkan beberapa angka yang akan terus melakukan inputan sampai total nilai yang diinput lebih dari 50 maka akan menampilkan total nilai dari inputan inputan awal yang mana menandakan sebuah program berakhir


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


Codingan diatas memiliki tujuan menandai statement didalam kondisi for dengan beberapa ekspresi yaitu memberikan inisialisasi total awal 0 dan true disini berart menjalankan statement didalam for apabila hasilnya true.



#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
Scanner sc=new Scanner(System.in);
int angka, total, count;
double avg;
count=0;
System.out.println("=====Program For Loop Dengan Continue=====");
for(int i=0;i<5;i++){
    System.out.print("Masukkan Bilangan \t : ");
    angka=sc.nextInt();
    if(angka>50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka yang kurang dari 50 : "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50 : "+avg);
```

    =====Program For Loop Dengan Continue=====
    Masukkan Bilangan 	 : 4
    Masukkan Bilangan 	 : 5
    Masukkan Bilangan 	 : 7
    Masukkan Bilangan 	 : 8
    Masukkan Bilangan 	 : 9
    Jumlah angka yang kurang dari 50 : 33
    Rata-rata angka yang kurang dari 50 : 6.6


# 5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

Percobaan ke-2 menggunakan break statement yang mana ketika output sudah memenuhi syarat atau ekspresi maka proses akan berhenti dan menampilkan output yang sudah dimasukkan sedangkan percobaan ke-3 menggunakan statement continue yang mana dalam program ketika sudah melebihi 50 program tidak langsung berhenti sebelum 5 kali perulangan, lalu output akan tetap menampilkan angka yang kurang dari 50, jadi bedanya terdapat pada statement yang break langsung berhenti ketika sudah melewati limit tanpa melihat berapa kali perulangan sedangkan continue memperhatikan batas pengulangan meskipun nilai sudah terpenuhi

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

Maksud dari program diatas yaitu membuat kondisi jika angka lebih dari sama dengan 50 maka continue atau tidak dianggap, dan juga jika angka kurang dari 50 maka akan terhitung dan nantinya akan masuk ke dalam rumus total = total + angka yang diinputkan serta count disini berfungsi menyimpan jumlah angka yang memiliki nilai dibawah 50 untuk mengeksekusi rata rata nantinya.

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
Scanner sc = new Scanner(System.in);
int bil, jmlBilGenap, totalGenap;
double average;

System.out.print("Masukan Angka : ");
bil = sc.nextInt();

if(bil<=0){
    System.out.println("Angka yang anda input salah !");
}
    else{

jmlBilGenap=bil/2;
        
        System.out.println("Banyak bilangan genap dari 1 sampai "+bil+" adalah "+jmlBilGenap);
        System.out.print("Angka genap yang ada dalam daerah tersebut adalah ");
for(int i=1;i<=bil;i++){
    if(i%2!=0) continue;
    System.out.print(" "+i+",");
    totalGenap+=i;
    average=totalGenap/jmlBilGenap;
}        
    System.out.println("\nHasil Penjumlahan Bilangan Genap dari 1 sampai "+bil+" adalah "+totalGenap);
    System.out.println("Rata-rata bilangan genap dari 1 sampai "+bil+" adalah "+average);    
    }
```

    Masukan Angka : 11
    Banyak bilangan genap dari 1 sampai 11 adalah 5
    Angka genap yang ada dalam daerah tersebut adalah  2, 4, 6, 8, 10,
    Hasil Penjumlahan Bilangan Genap dari 1 sampai 11 adalah 30
    Rata-rata bilangan genap dari 1 sampai 11 adalah 6.0


2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int num;
System.out.print("Masukkan angka : ");
num = sc.nextInt();
int i = 1;
while(i<=num){
    if (i %5 != 0){
    System.out.println(i);
    }
    i++;
}
```

    Masukkan angka : 7
    1
    2
    3
    4
    6
    7


3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner sc = new Scanner(System.in); 
int nilai, b, c, d, e, f; 
System.out.println("======== Fibonacci Series ========"); 
System.out.print("Masukkan bilangan Fibonacci : "); 
nilai=sc.nextInt(); 
c = 0; 
d = 1; 
e = 1; 
for (f=1; f<=nilai; f++){ 
    System.out.println("Sum of " + f + " : " + c + " + " + d + " = " + e); 
    c= d; 
    d= e; 
    e= c+d; 
}
```

    ======== Fibonacci Series ========
    Masukkan bilangan Fibonacci : 20
    Sum of 1 : 0 + 1 = 1
    Sum of 2 : 1 + 1 = 2
    Sum of 3 : 1 + 2 = 3
    Sum of 4 : 2 + 3 = 5
    Sum of 5 : 3 + 5 = 8
    Sum of 6 : 5 + 8 = 13
    Sum of 7 : 8 + 13 = 21
    Sum of 8 : 13 + 21 = 34
    Sum of 9 : 21 + 34 = 55
    Sum of 10 : 34 + 55 = 89
    Sum of 11 : 55 + 89 = 144
    Sum of 12 : 89 + 144 = 233
    Sum of 13 : 144 + 233 = 377
    Sum of 14 : 233 + 377 = 610
    Sum of 15 : 377 + 610 = 987
    Sum of 16 : 610 + 987 = 1597
    Sum of 17 : 987 + 1597 = 2584
    Sum of 18 : 1597 + 2584 = 4181
    Sum of 19 : 2584 + 4181 = 6765
    Sum of 20 : 4181 + 6765 = 10946

