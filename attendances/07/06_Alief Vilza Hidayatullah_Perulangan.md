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
Scanner input = new Scanner(System.in);

```


```Java
3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas
```


```Java
// Ketik kode program di bawah sini
int angka, faktorial =1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
// Ketik kode program di atas di bawah sini
System.out.println("-----PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR-----");
System.out.print("Masukan Bilangan : ");
angka = input.nextInt();
for(int i=1; i<=angka; i++){
    faktorial= faktorial * i;
    System.out.printf("Nilai faktorial dari %d adalah %d\n" ,i,faktorial);
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);

```

    -----PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR-----
    Masukan Bilangan : 5
    Nilai faktorial dari 1 adalah 1
    Nilai faktorial dari 2 adalah 2
    Nilai faktorial dari 3 adalah 6
    Nilai faktorial dari 4 adalah 24
    Nilai faktorial dari 5 adalah 120
    Nilai faktorial bilangan tersebut adalah : 120
    
    penejlasan dengan dengan batasnya variabel angka ketika kondisi terpenuhi melakukan operasi mengubah nilai operasi faktorial dengan mengalikan faktorial denga i  lalu diberikan output. dan kemudian i di tambah nilainya dengan operasi 1++ 



5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("Menghitung nilai faktor ");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=1;
    i++;
}
System.out.print("Nilai Faktorial bilangan tersebut adalah :"+ faktorial);
```

    Menghitung nilai faktor 
    Masukkan Bilangan : 5
    Nilai Faktorial bilangan tersebut adalah :1

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
faktorial=1;
System.out.println("===Program Menghitung Nilai Fkatorial Dengan DO-While===");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah: "+ faktorial);


```

    ===Program Menghitung Nilai Fkatorial Dengan DO-While===
    Masukkan Bilangan : 2
    Nilai faktorial bilangan tersebut adalah: 2

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
fungsi darii faktorial i adalah sebagai penanda untuk increment dan dimana menggunakan struktur perulangan do-while untuk menghitung hasil dari dari sebua nilai faktorial yang diinputkan 
```

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("===Program Menghitung Nilai Faktorial====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
System.out.print(angka + "Faktorial = "+ i);

while(i<=angka){
    faktorial*=i;
    i++;
    if(i<=angka)
        System.out.printf("x%d", i);
}
System.out.print(" = " + faktorial);



```

    ===Program Menghitung Nilai Faktorial====
    Masukkan Bilangan : 5
    5Faktorial = 1x2x3x4x5 = 120

Penjelasannya program di atas adalah menggunakan jenis perulangan do while yang dimanana mendeklarasi scanner lalu memasukan variabel ,lalu mengeluarkan output angka yang dimasukan dan  menggunakan perulangan while untuk melanjutkan output yang akan berulang selama nilai i kurang dari samadengan variabel angka, lalu membuat sebuah progarm yang akan melengkapi sebuah output

#### Percobaan 2 : Keluar dari perulangan menggunakan break

#### Waktu percobaan : 40 menit

1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break
<p align="left">
    <img width="696" height="124" src="images/for2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yangg telah diamsukkan : "+total);

```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan Bilangan : 8
    Masukkan Bilangan : 16
    Masukkan Bilangan : 32
    Jumlah angka-angka yangg telah diamsukkan : 56

penjelasan perulangan for dengan nilai awal total jumlah=0 dengan akhiran true,didalam for memasukan input angka lalu menjumlahkan total dengan angka yang dimasukan,terus diulang sampai nilai total lebih dari 50 

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("Program While Loop dengan break");
total=0;
while(true){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka angka yang telah dimasukkan : "+total);

```

    Program While Loop dengan break
    Masukkan Bilangan : 3
    Masukkan Bilangan : 5
    Masukkan Bilangan : 7
    Masukkan Bilangan : 9
    Masukkan Bilangan : 11
    Masukkan Bilangan : 13
    Masukkan Bilangan : 15
    Jumlah angka angka yang telah dimasukkan : 63

    penjelasannya perulangan while dengan nilai diawal dengan total=0 dengan batasan "true' dan didalam while memasukan input angka lalu menjumlahkan total dengan angka yang akan terus diulang sampai nilai total lebih dari 50




3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("Program Do While di Loop dengan Break");
total=0;
do
{
    System.out.print("Masukkan Bilangan: ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka yang telah dimasukkan : "+total);

```

    Program Do While di Loop dengan Break
    Masukkan Bilangan: 3
    Masukkan Bilangan: 5
    Masukkan Bilangan: 7
    Masukkan Bilangan: 9
    Masukkan Bilangan: 11
    Masukkan Bilangan: 13
    Masukkan Bilangan: 15
    Jumlah angka yang telah dimasukkan : 63


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

fungsinya dari kode program di atas adalah mengulangi terus perintah input hingga total input yang ditampilkan hingga lebih dari 50 lalu output totalnya



```Java
// Ketik jawaban disini
 adalah mengulangi terus perintah input hingga total input yang diberikan lebih dari 50 lalu dengan output totalnya




```

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>



```Java
// Ketik jawaban disini
menggunakan pengulangan dengan for dan dengan nilai diawal jumlah seluruh / total=0 dan dengan batasan nilai true
 

```

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner inpu=new Scanner(System.in);
int angka, total, count;
double avg;
count=0;
System.out.println("Program for Loop dengan continue");
for(int i=0;i<5;i++){
    System.out.print("Masukkan Bilangan : ");
    angka=input.nextInt();
    if(angka>=50) continue;
    total+=angka;
    count++;
}
System.out.println("Jumlah angka yang kurang dari 50: "+total);
avg=(double)total/count;
System.out.println("Rata-Rata angka yang kurang dari 50: "+avg);
```

    Program for Loop dengan continue
    Masukkan Bilangan : 3
    Masukkan Bilangan : 5
    Masukkan Bilangan : 7
    Masukkan Bilangan : 9
    Masukkan Bilangan : 11
    Jumlah angka yang kurang dari 50: 35
    Rata-Rata angka yang kurang dari 50: 7.0


# 5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban disini
di percobaan ke 2 di dalam program tersebut melooping hingga angka yang di tetapkan "yaitu >50 " dan terhenti di angka 15 karena total semua penjumlahan sudah lebih dari 50 yaitu 63

di percobaan ke 3 di dalam program tersebut melooping dengan menggunakaan continue dan setalh itu bilangan akan ter looping di angka 11 saja karena disana ada variabel yang menybutkan kurang dari 50 dan rata rata 

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

// Ketik jawaban disini



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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil, jmlBilGenap;
int totalGenap=0;
double avg;

System.out.print("Masukkan angka: ");
bil = input.nextInt();
jmlBilGenap = bil/2;
System.out.println("Jumlah bilangan dari 1 sampai "+ bil + " adalah "+ jmlBilGenap);
System.out.print("Angka genap dalam range tersebut adalah ");

for(int i=2; i<=bil; i+=2){
    System.out.print(i);
    if(i!=bil){
        System.out.print(", ");
    }
    totalGenap += i;
}
    avg = totalGenap/jmlBilGenap;
    System.out.println("\nhasil penjumlahan angka genap 1 sampai " + bil + " adalah " + totalGenap);
    System.out.println("Rata-rata angka genap  dari 1 sampai " + bil + " adalah " + avg);
```
```
    Masukkan angka: 10
    Jumlah bilangan dari 1 sampai 10 adalah 5
    Angka genap dalam range tersebut adalah 2, 4, 6, 8, 10
    hasil penjumlahan angka genap 1 sampai 10 adalah 30
    Rata-rata angka genap  dari 1 sampai 10 adalah 6.0

    Penjelasan saya adalah untuk meminta input angka yang dimasukkan dan batsan, lalu perulangan for dengan batasan nilai  tadi. jika bilangan ganjil continue,jika genap lanjut lalu mengeluarkan hasil yang sesuai (output).


```

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>



```Java
// Ketik kode program disini
Scanner input=new Scanner(System.in);
int angka;

System.out.print("Masukan Angka : ");
angka = input.nextInt();

for(int i = 1; i<=angka; i++){
    if(i%5==0) continue;
    System.out.printf("%d\n" ,i);
   
}

```

    Masukan Angka : 19
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

penjelasan meminta input untuk batasan, lalu selanjutnya menggunakan perulangan for dengan batasan input batsan yang tadi, dan menggunakan continue jika modulus 5 = 0


```java
3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
Scanner input=new Scanner(System.in);
int angka1, angka2, maks;
System.out.print("Masukan Angka Pertama: ");
angka1 = input.nextInt();
System.out.print("Masukan Angka Kedua: ");
angka2 = input.nextInt();
System.out.print("Masukan Angka Maksimum: ");
maks = input.nextInt();

System.out.printf(" %d, %d,",angka1, angka2);
int i=0;
while(i<=maks){ 
    i=angka1+angka2;
    angka1 = angka2;
    angka2 = i;
    System.out.printf(" %d,",angka2);
}
```

    Masukan Angka Pertama: 0
    Masukan Angka Kedua: 1
    Masukan Angka Maksimum: 80
     0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,

penjelasan meminta masukan jumlah awal pertama kedua dan pemabtasan. lalu menggunakan perulangan while untuk melakukan operasi fibonacci,jadi pertama kita jumlahkan angka1 dan angka2 ke dalam variabel i. lalu merubah nilai yang akan dijumlahkan selanjutnya untuk terus berputar.
```
