## JOBSHEET 6

## PEMILIHAN 2

### Tujuan

Mahasiswa memahami tentang operator logika; Mahasiswa mampu menyelesaikan permasalahan dengan menggunakan sintaks pemilihan bersarang; Mahasiswa mampu membuat sebuah program Java yang memanfaatkan sintaks pemilihan bersarang


### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1

#### Waktu percobaan : 40 menit

1. Tambahkan library Scanner, deklarasi Scanner

2. Buatlah variabel nilai yang memiliki tipe data int untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
// Ketik kode di sini
import java.util.Scanner;
Scanner input = new Scanner (System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
```

    Masukkan nilai ujian (0-100): 80


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT");
    }else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    }else{
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    System.out.println("Nilai yang anda masukan tidak valid!");
}
        
```

    Nilai B, Pertahankan prestasi Anda!


> Penjelasan kode program percobaan 1

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?


```Java
// Jawaban pertanyaan
if(nilai >= 0 && nilai <= 100){
    if(nilai >=90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi anda!");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi anda!");
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar anda!");
    } else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
} else {
    if(nilai < 0){
        System.out.println("Nilai yang Anda masukkan kurang dari 0");
    } else {
        System.out.println("Nilai yang Anda masukkan lebih dari 100");
    }
}
```

    Nilai B, Pertahankan prestasi anda!


2.Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang 
dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang 
dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 
100”!

Karena fungsi dari ekspresi logika ( | | ) digunakan untuk perbandingan kondisi OR. Akan 
menghasilkan true jika salah satunya bernilai true. Operator ini dijalankan dari kiri ke kanan 
dan juga termasuk short-circuit operator. Short-circuit operator disini maksudnya adalah jika 
kondisi yang kiri bernilai true, makan operasi yang kanan tidak dijalankan, sebab sudah pasti 
hasilnya true

#### Percobaan 2

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

![](images/02.png)

> Flowchart tersebut digunakan untuk menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan. 

2. Tambahkan library Scanner dan deklarasi Scanner

3. Deklarasikan variabel kategori, penghasilan, gajiBersih, dan pajak

    ![](images/05.png)


```Java
// Ketik kode di sini
import java.util.Scanner;
Scanner input = new Scanner (System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print ("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan : ");
penghasilan = input.nextInt();

```

    Masukkan kategori: pebisnis
    Masukkan besarnya penghasilan : 2000000


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima : " + gajiBersih);
    
} else if(kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima : " + gajiBersih);
} else {
    System.out.println("Kategori yang anda masukkan salah!"); 
}
```

    Gaji bersih yang anda terima : 1700000


5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

// Jawaban pertanyaan
1.karena pada saat menuliskan rumus telah didaftarkan (int) sehingga tidak 
menggunakan koma

2.int (Integer) adalah tipe data untuk angka numerik yang tidak menggunakan koma, 
untuk tipe data 32 bit.

3.Digunakan untuk membandingkan 2 buah variable, yang bertipe data String.
Pada equalsIgnoreCase, tidak akan melihat huruf besar ataupun kecil, yang terpenting 
mempunyai nilai yang sama, maka akan tetap menghasilkan true.

4.equals() digunakan untuk membandingkan 2 buah variable, yang bertipe data String, jika nilai dari 
kedua variable tersebut mempunyai karakter yang sama, baik dari segi huruf besar, huruf kecil atau 
spasi, maka akan menghasilkan nilai boolean true dan jika tidak sesuai, maka akan menghasilkan 
nilai false



### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program kalkulator sederhana menggunakan bahasa pemrograman Java. User akan menginputkan dua buah bilangan riil dan satu buah operator aritmatika (+, -, *, atau /), kemudian program akan mengoperasikan dua bilangan tersebut dengan operator yang sesuai. Petunjuk: gunakan pernyataan switch-case.
Contoh tampilan program:

```
Masukkan bilangan pertama: 2.5
Masukkan operator (+, -, *, /): *
Masukkan bilangan kedua: 4
2.5 * 4.0 = 10.0

```


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        float angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan Bilangan Pertama :");
        angka1 = sc.nextFloat();

        System.out.println("Masukkan operator (+ - * /) : ");
        operator = sc.next() . charAt(0);

        System.out.println("Masukkan Bilangan Kedua :");
        angka2 = sc.nextFloat();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("Operator yang Anda masukkan salah");
        }
    


```

    Masukkan Bilangan Pertama :
    10
    Masukkan operator (+ - * /) : 
    -
    Masukkan Bilangan Kedua :
    5
    10.0 - 5.0 = 5.0


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        int sisi1, sisi2, sisi3;

        System.out.println("Masukkan sisi 1 :");
        sisi1 = sc.nextInt();

        System.out.println("Masukkan sisi 2 :");
        sisi2 = sc.nextInt();

        System.out.println("Masukkan sisi 3 :");
        sisi3 = sc.nextInt();

        if ((sisi1 == sisi2) && (sisi3 == sisi1)){
            System.out.println("Segitiga sama sisi");
        }else if ((sisi1 == sisi2) || (sisi1 == sisi3) || (sisi2 == sisi3)){
            System.out.println("Segitiga sama kaki");

        }else {
            System.out.println("Segitiga sembarang");
        }
    

```

    Masukkan sisi 1 :
    4
    Masukkan sisi 2 :
    4
    Masukkan sisi 3 :
    3
    Segitiga sama kaki


3. Warung Padang Gembira meminta Anda membuat sebuah program untuk menerima pesanan dari internet. Program yang Anda buat meminta user untuk memasukkan nama makanan dan harga. Setelah itu, user ditawarkan untuk menggunakan pengiriman ekspres. Jika pengguna menolak, maka jenis pengiriman yang digunakan adalah pengiriman reguler. Biaya pengiriman reguler untuk harga makanan kurang dari Rp 100.000 adalah Rp 20.000, sedangkan untuk harga makanan sama dengan atau lebih dari Rp 100.000 biaya pengirimannya adalah Rp 30.000. Untuk jenis pengiriman ekspres, tambahkan biaya tambahan sebesar Rp 25.000 dari standar biaya pengiriman reguler. Tampilkan struk yang berisi nama makanan yang dibeli + harga, biaya pengiriman, dan total yang harus dibayar!
Contoh hasil output program:

```
Masukkan nama makanan: Tuna salad
Masukkan harga makanan: Rp 115000
Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 0

STRUK PEMBELIAN
Tuna salad        Rp 115000
Biaya pengiriman  Rp 30000
TOTAL             Rp 145000

```

```
Masukkan nama makanan: Beef bulgogi
Masukkan harga makanan: Rp 78000
Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 1

STRUK PEMBELIAN
Beef bulgogi      Rp 115000
Biaya pengiriman  Rp 45000
TOTAL             Rp 123000

```




```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        String namaMakanan;
        int hargaMakanan , pengiriman , pengirimanExpress , pengirimanReguler , total;

        System.out.println("Masukkan Nama Makanan :");
        namaMakanan = sc.nextLine();

        System.out.println("Masukan Harga Makanan :");
        hargaMakanan = sc.nextInt();

        System.out.println("Apakah anda ingin pengiriman express (0 = tidak , 1 = iya) ?");
        pengiriman = sc.nextInt();

        System.out.println("" + namaMakanan + "\t\t" + hargaMakanan);

        if (pengiriman == 0){
            if (hargaMakanan < 100000){
                pengirimanReguler = 20000;
                System.out.println("Biaya pengiriman :" + pengirimanReguler);
                System.out.println("Total :" +(hargaMakanan + pengirimanReguler));
            }else if (hargaMakanan == 100000 || hargaMakanan >= 100000){
              pengirimanReguler = 30000;
                System.out.println("Biaya Pengiriman :" +pengirimanReguler);
                System.out.println("Total :" +(hargaMakanan + pengirimanReguler));

            }else{
                pengirimanReguler = 0;
                System.out.println("Biaya pengiriman :" +pengirimanReguler);
                System.out.println("Total :" +(hargaMakanan + pengirimanReguler));
            }
        }else if (pengiriman == 1){
            if (hargaMakanan < 100000){
                pengirimanExpress = 45000;
                System.out.println("Biaya Pengiriman Anda Adalah :" +pengirimanExpress);
                System.out.println("Total :" + (hargaMakanan + pengirimanExpress));
            }else if (hargaMakanan < 100000 || hargaMakanan > 100000){
                pengirimanExpress = 550000;
                System.out.println("Biaya Pengiriman Anda Adalah :" +pengirimanExpress);
                System.out.println("Total :" + (hargaMakanan + pengirimanExpress));

            }
        }
    


```

    Masukkan Nama Makanan :
    Tuna salad
    Masukan Harga Makanan :
    30000
    Apakah anda ingin pengiriman express (0 = tidak , 1 = iya) ?
    0
    Tuna salad		30000
    Biaya pengiriman :20000
    Total :50000



```Java
import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        String namaMakanan;
        int hargaMakanan , pengiriman , pengirimanExpress , pengirimanReguler , total;

        System.out.println("Masukkan Nama Makanan :");
        namaMakanan = sc.nextLine();

        System.out.println("Masukan Harga Makanan :");
        hargaMakanan = sc.nextInt();

        System.out.println("Apakah anda ingin pengiriman express (0 = tidak , 1 = iya) ?");
        pengiriman = sc.nextInt();

        System.out.println("" + namaMakanan + "\t\t" + hargaMakanan);

        if (pengiriman == 0){
            if (hargaMakanan < 100000){
                pengirimanReguler = 20000;
                System.out.println("Biaya pengiriman :" + pengirimanReguler);
                System.out.println("Total :" +(hargaMakanan + pengirimanReguler));
            }else if (hargaMakanan == 100000 || hargaMakanan >= 100000){
              pengirimanReguler = 30000;
                System.out.println("Biaya Pengiriman :" +pengirimanReguler);
                System.out.println("Total :" +(hargaMakanan + pengirimanReguler));

            }else{
                pengirimanReguler = 0;
                System.out.println("Biaya pengiriman :" +pengirimanReguler);
                System.out.println("Total :" +(hargaMakanan + pengirimanReguler));
            }
        }else if (pengiriman == 1){
            if (hargaMakanan < 100000){
                pengirimanExpress = 45000;
                System.out.println("Biaya Pengiriman Anda Adalah :" +pengirimanExpress);
                System.out.println("Total :" + (hargaMakanan + pengirimanExpress));
            }else if (hargaMakanan < 100000 || hargaMakanan > 100000){
                pengirimanExpress = 550000;
                System.out.println("Biaya Pengiriman Anda Adalah :" +pengirimanExpress);
                System.out.println("Total :" + (hargaMakanan + pengirimanExpress));

            }
        }
    
```

    Masukkan Nama Makanan :
    Beef bulgogi
    Masukan Harga Makanan :
    115000
    Apakah anda ingin pengiriman express (0 = tidak , 1 = iya) ?
    0
    Beef bulgogi		115000
    Biaya Pengiriman :30000
    Total :145000


4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur, statusKerja, statusSekolah, pendapatan, tanggungan;

System.out.println("Masukkan Umur: ");
umur = input.nextInt();
if (umur < 18){
    System.out.println("Sekolah Atau Tidak (0 = Tidak, 1 = Ya): ");
statusSekolah = input.nextInt(); 

{if (statusSekolah == 0){
    System.out.println("Hasil: Penduduk Miskin");
} else if (statusSekolah == 1){
    System.out.println("Hasil: Bukan Penduduk Miskin");
} else {
    System.out.println("Tidak Valid!");
}
}
} else {
    System.out.println("Bekerja Atau Tidak (0 = Tidak, 1 = Ya): ");
    statusKerja = input.nextInt(); 
    if (statusKerja == 0){
        System.out.println("Hasil: Penduduk Miskin!");
    } else if (statusKerja == 1){
        System.out.println("Pendapatan: Rp ");
        pendapatan = input.nextInt(); 
        System.out.println("Tanggungan: Rp ");
        tanggungan = input.nextInt(); 
        {if ((pendapatan/tanggungan) < 300000){
            System.out.println("Hasil: Penduduk Miskin");
        } else {
            System.out.println("Hasil: Bukan Penduduk Miskin");
        }
         }
    } else {
        System.out.println("Tidak Valid!");
    }
}
```

    Masukkan Umur: 
    17
    Sekolah Atau Tidak (0 = Tidak, 1 = Ya): 
    1
    Hasil: Bukan Penduduk Miskin



```Java

```
