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
int angka, faktorial=1;
```


```Java
3. Buatlah deklarasi dan inisialisasi variabel faktorial sesuai dengan flowchart diatas
```


```Java
// Ketik kode program di bawah sini
int angka, faktorial=1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial*=i;
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
while(i<=angka){
    faktorial*=i;
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


```Java
// Ketik kode program di atas di bawah sini
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
do{
    faktorial*=i;
    i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====
    Masukkan Bilangan : 5
    Nilai faktorial bilangan tersebut adalah : 120

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>
   

// Ketik jawaban disini

baris tersebut digunakan untuk menampung hasil faktorial dari i

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka, faktorial=1;
faktorial=1;
System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====");
System.out.print("Masukkan Bilangan : ");
angka= input.nextInt();
int i=1;
System.out.print (angka + "Faktorial = ");
while(i<=angka){
    faktorial=i * faktorial;
    if(i==1)
        System.out.printf("%d", i); 
    else
        System.out.printf("x%d", i);
        i=i+1;
}
System.out.print("= : "+ faktorial);
```

    =====PROGRAM MENGHITUNG NILAI FAKTORIAL=====
    Masukkan Bilangan : 5
    5Faktorial = 1x2x3x4x5= : 120

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
    System.out.print("Masukkan bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM FOR LOOP DENGAN BREAK===
    Masukkan bilangan : 20
    Masukkan bilangan : 15
    Masukkan bilangan : 10
    Masukkan bilangan : 30
    Jumlah angka-angka yang telah dimasukkan : 75


 2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM WHILE LOOP DENGAN BREAK===");
total=0;
while(true){
    System.out.print("Masukkan bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM WHILE LOOP DENGAN BREAK===
    Masukkan bilangan : 20
    Masukkan bilangan : 15
    Masukkan bilangan : 10
    Masukkan bilangan : 30
    Jumlah angka-angka yang telah dimasukkan : 75


3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka,total;
System.out.println("===PROGRAM DO-WHILE LOOP DENGAN BREAK===");
total=0;
do
{
    System.out.print("Masukkan bilangan : ");
    angka=input.nextInt();
    total+=angka;
    if(total>50) break;
}
while(true);
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ===PROGRAM DO-WHILE LOOP DENGAN BREAK===
    Masukkan bilangan : 20
    Masukkan bilangan : 15
    Masukkan bilangan : 10
    Masukkan bilangan : 30
    Jumlah angka-angka yang telah dimasukkan : 75


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!

// Ketik jawaban disini

Kode program diatas digunakan untuk membuat sebuah perulangan for, while, dan do-while yang memanfaatkan statement break untuk keluar atau berhenti dari perulangan. pada kode program diatas perulangan akan berhenti jika total jumlah bilangan lebih besar dari 50. selanjutnya kode diluar perulangan akan dieksekusi


2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>


// Ketik jawaban disini

Jawab : kode program diatas digunakan untuk melakukan perulangan. sebelum dilakukan perulangan variabel total diberikan nilai 0 agar tidak eror. perulangan akan dilakukan saat bernilai true

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input=new Scanner(System.in);
int angka,total, count;
double avg;
count=0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
    System.out.print("Masukkan bilangan : ");
    angka=input.nextInt();
    if(angka>=50) continue;
    total+=angka;
    count++;
    
}
System.out.println("Jumlah angka-angka yang kurang dari 50: "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka-angka yang kurang dari 50: "+avg);

```

    ===PROGRAM FOR LOOP DENGAN CONTINUE===
    Masukkan bilangan : 20
    Masukkan bilangan : 15
    Masukkan bilangan : 20
    Masukkan bilangan : 15
    Masukkan bilangan : 20
    Jumlah angka-angka yang kurang dari 50: 90
    Rata-rata angka-angka yang kurang dari 50: 18.0


5. Jalankan program. Amati apa yang terjadi!

    pada program diatas menggunakan for untuk melakukan perulangan dan memanfaatkan statement continue untuk berhenti dari perulangan. statement continue hanya melewati 1 perulangan saja. saat angka lebih besar dari 50 maka perulangan akan berhenti namun setelah melewati 1 perulangan .setelah itu kode diluar perulangan yang akan dijalankan.

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3

// Ketik jawaban disini

percobaan 2 menggunakan break untuk keluar dari perulangan dan pada percobaan ke 3 menggunakan continue untuk keluar dari perulangan. perbedaannya adalah jika menggunakan break akan langsung menghentikan perulangan dan kode diluar perulangan akan dieksekusi sedangkan continue akan menghentikan perulangan yang saat ini terjadi (1 literasi saja) kemudian melanjutkan ke perulangan berikutnya atau hanya melewati 1 perulangan.

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>

// Ketik jawaban disini

perintah diatas digunakan untuk melakukan statement continue dimana saat angka lebih besar sama dengan 50 maka akan menjalankan perintah continue dan berhenti setelah melewati 1 perulangan. baris kedua digunakan untuk menampung total dari angka yang dimasukkan. count++ digunakan untuk menyimpan berapa kali perulangan terjadi, jika sudah mencapai batas yang ditentukan maka perulangan akan berhenti 

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
int bil,jmlBilGenap,totalGenap=1;
double avg;
System.out.print("Masukkan nilai bil : ");
bil= input.nextInt();
jmlBilGenap = bil/2;
System.out.println(jmlBilGenap);
int i=1;
do{
    if(i%2 == 0){
        System.out.println(i);
        totalGenap += i;
        i++;
    }else{
        i++;
        continue;
    }
}while(i<=bil);
    
avg = totalGenap/jmlBilGenap;
System.out.printf("total Genap %d \nrata - rata %f" , totalGenap, avg);


```

    Masukkan nilai bil : 12
    6
    2
    4
    6
    8
    10
    12
    total Genap 43 
    rata - rata 7.000000




    java.io.PrintStream@7cccdd75



kode program diatas yaitu untuk membuat program yang akan menghitung banyaknya jumlah bilangan genap positive di dalam range bilangan . kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara range. pada kode program diatas saat memasukkan nilai bilangan 12. maka menhasilkan jumlah bilangan genap positif yang berada pada range tersebut ada 6, yaitu 2,4,6,8,10,12 dan total genap nya adalah 43. sehingga rata-ratanya 7. untuk membuat kode program tersebut pertama kita menambahlan library scanner, deklarasi scanner, dan membuat variabel bil, jmlBilGenap,totalGenap,avg untuk menampung data yang diinput melalui keyboard. lalu kita menambahkan output untuk memasukkan input nilai bil. kode diatas menggunakan perulangan do while dan statement continue

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int angka;
System.out.print("Masukkan angka : ");
angka = input.nextInt();
int x;
for(int x = 0; x<=19; x++){
    if(x==0 && x%5!=0 || x%5==0)continue;
    System.out.printf("%d\n", x);
    
}

```

    Masukkan angka : 19
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


kode program diatas digunakan untuk menampilkan angka 1 hingga angka masukkan pengguna secara berurutan dan melompati angka kelipatan 5. untuk membuat kode program tersebut pertama kita menambahlan library scanner, deklarasi scanner, dan membuat variabel bil, jmlBilGenap,totalGenap,avg untuk menampung data yang diinput melalui keyboard. lalu kita menambahkan output untuk memasukkan input angka dan memanggil input dalam variabel tersebut. kode diatas menggunakan perulangan for. variabel x pada perulangan for berfungsi untuk menyimpan nilai hitungan. hitungan akan dimulai dari 0 (x=0) sampai 19 (x<=19) dan disetiap perulangan x akan bertambah +1(i++). dan jika ada kelipatan 5 maka akan dilanjutkan ke perulangan berikutnya.

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int f_n,f_n_1,f_n_2, n;

System.out.println("==Fibonanci series==");
System.out.println("Deret fibonanci ke -");
n= input.nextInt();
f_n_2=0;
f_n_1=1;
f_n=1;
for (int i = 0; i <= n; i++){
     System.out.print(f_n + " ");
     f_n=f_n_1 + f_n_2;
    f_n_2 = f_n_1;
    f_n_1 = f_n;
    
    

}

```

    ==Fibonanci series==
    Deret fibonanci ke -
    9
    1 1 2 3 5 8 13 21 34 55 

kode program diatas digunakan untuk menampilkan deret bilangan fibonanci . untuk membuat kode program tersebut pertama kita menambahlan library scanner, deklarasi scanner, dan membuat variabel untuk menampung data yang diinput melalui keyboard. lalu kita menambahkan output untuk memasukkan input angka dan meminta input dari user yang bertipe data integer. kode diatas menggunakan perulangan for. variabel i pada perulangan for berfungsi untuk menyimpan nilai hitungan. hitungan akan dimulai dari 0 (i=0) sampai n (i<=n) dan disetiap perulangan i akan bertambah +1(i++). System.out.print(f_n + " "); sintak tersebut digunakan untuk memproses bilangan fibonacci dan akan ditampilkan hasilnya
