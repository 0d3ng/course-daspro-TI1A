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
int angka, faktorial = 1;
```

4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for
    
    <p align="left">
    <img width="696" height="124" src="images/for.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
System.out.println("----Program Menghitung Nilai Faktorial Dengan FOR----");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
for(int i=1; i<=angka; i++)
    faktorial *= i;
System.out.print("Nilai Faktorial bilangan tersebut adalah : " + faktorial);
```

    ----Program Menghitung Nilai Faktorial Dengan FOR----
    Masukkan Bilangan : 5
    Nilai Faktorial bilangan tersebut adalah : 120

Menggunakan pengulangan for dengan inisialisasi variabel i = 1, kondisi i lebih kecil sama dengan angka dan increment i++ kemudian jika memenuhi kondisi maka akan dilanjutkan dengan pernyataan faktorial dikalikan i

5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/while.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("----Program Menghitung Nilai Faktorial Dengan FOR----");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
while(i<=angka){
    faktorial *= i;
    i++
;}
System.out.print("Nilai Faktorial bilangan tersebut adalah : " + faktorial);
```

    ----Program Menghitung Nilai Faktorial Dengan FOR----
    Masukkan Bilangan : 5
    Nilai Faktorial bilangan tersebut adalah : 120

Mirip dengan for hanya saja tempat inisiasi di atas while dan increment dibawah pernyataan

6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan
    
    <p align="left">
    <img width="696" height="124" src="images/dowhile.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("----Program Menghitung Nilai Faktorial Dengan FOR----");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
do{
    faktorial *= i;
    i++;
}
while(i<=angka);
System.out.print("Nilai Faktorial bilangan tersebut adalah : " + faktorial);
```

    ----Program Menghitung Nilai Faktorial Dengan FOR----
    Masukkan Bilangan : 5
    Nilai Faktorial bilangan tersebut adalah : 120

Mirip dengan while hanya saja di atas while terdapat do yang didalamnya terdapat pernyataan dan increment

##### Pertanyaan
1. Pada program diatas, apakah kegunaan baris berikut?
<p align="left">
    <img src="images/hitungFaktorial.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
Untuk melakukan operasi perkalian variabel dan ditampung di variabel faktorial
```

2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:
<p align="left">
    <img src="images/modifP1.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
faktorial = 1;
System.out.println("----Program Menghitung Nilai Faktorial Dengan FOR----");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
System.out.print(angka + " Faktorial = ");
for(int i = 1; i <= angka; i++) {
    System.out.print(i);
    if(i!=angka){
        System.out.print("x");
    }
    faktorial *= i;
}

System.out.print(" = " + faktorial);
```

    ----Program Menghitung Nilai Faktorial Dengan FOR----
    Masukkan Bilangan : 5
    5 Faktorial = 1x2x3x4x5 = 1

Disini ditambahkan memunculkan nilai i dan pemilihan if didalam pengulangan untuk memberikan x dengan kondisi nilai i tidak sama dengan nilai angka.

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
System.out.println("----Program FOR LOOP dengan BREAK----");
for(total = 0; true; ){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ----Program FOR LOOP dengan BREAK----
    Masukkan Bilangan : 10
    Masukkan Bilangan : 10
    Masukkan Bilangan : 50
    Jumlah angka-angka yang telah dimasukkan : 70

Menggunakan pengulangan for dengan inisialisasi variabel total = 0, dengan batas true kemudian memasukkan input ke variabel angka kemudian menambahkan nilai variabel total dan angka. selanjutnya menggunakan if dimana saat kondisi nilai total lebih dari 50 maka akan berhenti dan mengaluarkan output total.

2. Buat perulangan yang sama dengan struktur perulangan while
<p align="left">
    <img width="696" height="124" src="images/while2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("----Program FOR LOOP dengan BREAK----");
total = 0;
while( true ){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ----Program FOR LOOP dengan BREAK----
    Masukkan Bilangan : 5
    Masukkan Bilangan : 343
    Jumlah angka-angka yang telah dimasukkan : 348

Mirip dengan for hanya saja inisialisasi variabel ada dia atas while

3. Tuliskan perulangan diatas dalam struktur do-while
    <p align="left">
    <img width="696" height="124" src="images/dowhile2.jpg" align="left">
    </p>


```Java
// Ketik kode program di atas di bawah sini
int angka,total;
System.out.println("----Program FOR LOOP dengan BREAK----");
total = 0;
do{
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    total += angka;
    if(total>50) break;
}
while( true );
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);
```

    ----Program FOR LOOP dengan BREAK----
    Masukkan Bilangan : 49
    Masukkan Bilangan : 5
    Jumlah angka-angka yang telah dimasukkan : 54


##### Pertanyaan
1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!


```Java
// Ketik jawaban disini
Menggunakan pengulangan do-while dengan inisialisasi variabel total = 0, kemudian memasukkan input ke variabel angka kemudian menambahkan nilai variabel total dan angka. selanjutnya menggunakan if dimana saat kondisi nilai total lebih dari 50 maka akan berhenti dengan batas true dan mengeluarkan output total.
```

2. Jelaskan fungsi kode berikut!
    <p align="left">
    <img src="images/forPertanyaan2.jpg" align="left">
    </p>



```Java
// Ketik jawaban disini
inisialisasi variabel total, dan sebagai batasan true
```

#### Percobaan 3 : Keluar dari step perulangan menggunakan continue

#### Waktu percobaan : 40 menit

1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: 
<p align="left">
    <img src="images/forContinue.jpg" align="left">
    </p>



```Java
// Ketik kode program di atas di bawah sini
Scanner input = new Scanner(System.in);
int angka, total, count;
double avg;
count = 0;
System.out.println("----Program FOR LOOP dengan Continue----");
for(int i=0; i<5; i++){
    System.out.print("Masukkan Bilangan : ");
    angka = input.nextInt();
    if(angka>=50) continue;
    total += angka;
    count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50 : "+total);
avg = (double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50 : "+avg);
```

    ----Program FOR LOOP dengan Continue----
    Masukkan Bilangan : 5
    Masukkan Bilangan : 40
    Masukkan Bilangan : 25
    Masukkan Bilangan : 10
    Masukkan Bilangan : 60
    Jumlah angka-angka yang kurang dari 50 : 80
    Rata-rata angka yang kurang dari 50 : 20.0

Menggunakan pengulangan for dengan inisialisasi variabel i = 0, dengan batas i<5 dengan increment i++ dan selanjutnya memasukkan input ke variabel angka selanjutnya menggunakan if dimana saat kondisi nilai total lebih dari 50 maka akan akan tetap lanjut kemudian menambahkan nilai variabel total dan angka.  dan mengeluarkan output total. kemudian menghitung variabel avg dan mengeluarkan rata rata.

```Java
5. Jalankan program. Amati apa yang terjadi!
```

##### Pertanyaan
1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3


```Java
// Ketik jawaban disini
Di percobaan 2 menggunakan break dimana program akan berhenti saat syarat dari break terpenuhi sedangkan pada percobaan 3 menggunakan continue dimana program akan tetap lanjut meskipun syaratnya terpenuhi.
```

2. Jelaskan apa fungsi perintah kode program dibawah ini?
<p align="left">
    <img width="352" height="79" src="images/continuePertanyaan.jpg" align="left">
    </p>


```Java
// Ketik jawaban disini
Jika nilai lebih dari sama dengan 50 masih akan tetap lanjut
```

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
        int bil, bilGenap, totalGenap=0;
        double avg;
        System.out.print("Masukkan Angka : ");
        bil = input.nextInt();
        bilGenap = bil / 2;
        System.out.printf("Banyak bilangan genap dari 1 sampai %d adalah %d\n",bil,bilGenap);
        System.out.printf("Bilangan genap dari 1-%d adalah ",bil);
        int i = 1;
        for(; i<=bil; ){
            if(i%2 == 0){
                System.out.print(i);
                if(i!=bil){
                    System.out.print(",");
                }
                totalGenap += i;
                i++;
            }else{
                i++;
                continue;
            }
        }
        avg = totalGenap/bilGenap;
        System.out.printf("\nTotal bilangan genap ada %d, dan rata-rata nya adalah %f",totalGenap,avg);
```

2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini
<p align="left">
<img width="184" height="328" src="images/tugas1.jpg" align="left">
</p>


```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan Angka : ");
        angka = input.nextInt();
        for(int i=1; i<=angka; i++){
            if(i%5==0){
                continue;
            }
            System.out.println(i);
        }
```

3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya
 <p align="left">
    <img width="451" height="226" src="images/fibo.png" align="left">
    </p>



```Java
// Ketik kode program disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
        int angka,num1=0,num2=1,sum=0;
        System.out.print("Masukkan angka : ");
        angka = input.nextInt();
        for(int i = 0;i < angka; i++){
            sum = num1 + num2;
            System.out.printf("Sum of: %d + %d = %d\n",num1,num2,sum);
            num1 = num2;
            num2 = sum;
        }
```
