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
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100): ");
nilai = input.nextInt();
```

    Masukkan nilai ujian (0-100): 105
    

3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <= 89){
          System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <= 79){
          System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <= 59){
          System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else{
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai yang Anda masukkan tidak valid!


> Penjelasan kode program percobaan 1

- Pada percobaan 1 yang pertama menggunakan library Scanner yang berfungsi agar user dapat memasukkan nilai variabel melalui keyboard.
- Kemudian mendeklarasikan Scanner dan variabel yang dibutuhkan sesuai soal diatas.
- Pada dasar nya program diatas digunakan untuk mengecek nilai dari rentang 0-100 memiliki nilai A//B/C/D/E sesuai dengan kondisinya.
- Proses berjalannya kode program sebagai berikut :
1. variabel "nilai" nantinya akan dimasukkan value memalui keyboard
2. kemudian pada kondisi pertama yaitu **if(nilai >= 0 && nilai <= 100)** yang dimana artinya jika nilai variabel antara 0-100 maka selanjutnya,
3. Akan dilihat lagi kondisi nya seperti **if(nilai >= 90 && nilai <= 100)** yang berarti jika diawal tadi kita memasukkan nilai "95" maka output yang akan dikeluarkan **Nilai A, EXCELLENT!**. Begitu pula seterusnya. jika nilai yang di input sesuai dengan salah satu kondisi di atas maka akan di proses dan hasil outputnya mengikuti kondisi yang terpenuhi tadi.
4. Jika nilai variabel yang di input tidak sesuai kondisi awal, contohnya "105", itu langsung masuk ke "else" yang pernyataannya **Nilai yang Anda masukkan tidak valid!**. karena tidak ada kondisi yang terpenuhi di awal.  


##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

Jawaban 

2. fungsi sintak **if(nilai >= 0 && nilai <= 100)** adalah jika ada kondisi dimana nilai dari variabel "nilai" lebih dari sama dengan 0 "dan" nilai variabel "nilai" kurang dari sama dengan 100. arti "&&" ini adalah operator logika yang dimana kedua kondisi harus menghasilkan "true" agar hasil akhirnya "true". Misalnya : (20 >= 0 && 70 <= 100) pernyataannya benar semua, maka output nya "true". Tapi jika salah satu pernyataan salah maka hasilnya "false".
3. Yang terjadi adalah hasil output nya **Nilai E, Anda tidak lulus!**. Hal ini terjadi karena nilai variabel yang di input adalah "105" yang mana pada sintaks **if(nilai >= 0 || nilai <= 100)** (105 >= 0 || 105 <= 100). Salah satu syarat di operator logika "OR" (||) itu jika alah satu benar "true" maka hasil akhirnya "true". Hasil akhir dari sintaks diatas adalah "true" namun tidak termasuk kedalam salah satu kondisi yang ada pada kode program tersebut. Sehingga masuk kedalam "else" yang output nya **Nilai E, Anda tidak lulus!**


```Java
// Jawaban pertanyaan 1
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <= 89){
          System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <= 79){
          System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <= 59){
          System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else if(nilai < 0){
    System.out.println("Nilai yang Anda masukkan kurang dari 0");
}else if(nilai > 100){
    System.out.println("Nilai yang Anda masukkan lebih dari 100");
}else{
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai yang Anda masukkan lebih dari 100



```Java
// Jawaban pertanyaan 3
if(nilai >= 0 || nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    }else if(nilai >= 80 && nilai <= 89){
          System.out.println("Nilai B, Pertahankan prestasi Anda!");
    }else if(nilai >= 60 && nilai <= 79){
          System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }else if(nilai >= 50 && nilai <= 59){
          System.out.println("Nilai D, Tingkatkan prestasi Anda!");
    }else {
        System.out.println("Nilai E, Anda tidak lulus!");
    }
}else{
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai E, Anda tidak lulus!


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
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori: ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan: ");
penghasilan = input.nextInt();
```

    Masukkan kategori: PEBISNIS
    Masukkan besarnya penghasilan: 2000000
    

4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    }else if (penghasilan <= 3000000){
        pajak = 0.15;
    }else{
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yan Anda terima: " + gajiBersih);
    
}else if(kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    }else if (penghasilan <= 3500000){
        pajak = 0.2;
    }else{
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yan Anda terima: " + gajiBersih);
}else{
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Gaji bersih yan Anda terima: 1700000


5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2
- Pada percobaan 2 ini menggunakan perintah Scanner untuk input nilai dari variabel.
- Lalu deklarasi Scanner dan variabel yang dibutuhkan sesuai soal diatas.
- kode program diatas berfungsi untuk menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan.
- menggunakan struktur if bersarang yang berfungsi menampung banyak kondisi
- perintah **equalsIgnoreCase** berfungsi agar input nilai variabel yang kita masukkan meskipun besar kecil huruf nya tidak sama dengan yang di deklarasikan itu tidak akan berpengaruh terhadap hasil akhirnya nanti. seperti kode program di atas pada kondisi pertama **if(kategori.equalsIgnoreCase ("pekerja"))**. jika nanti input nilai variabel "kategori" kita masukkan "Pelajar"(huruf P nya besar) itu tidak masalah dan tidak berpengaruh apapun ke hasil akhir. Namun jika kita menggunakan perintah **equals** saja, maka jika kita input dengan "Pelajar" hasilnya akan bertolak belakang dan mempengaruhi hasil akhir.
- Proses berjalannya program seperti berikut :
1. memasukkan nilai dari variabel kategori yang mana tipe datanya "String" dan input variabel penghasilan. Pada kondisi pertama jika nilai variabel "kategori" **pekerja** maka dilanjutkan dengan kondisi jika penghasilan lebih dari sama dengan 2000000 maka akan di kenakan pajak sebesar 0.1
2. Kemudian melakukan perhitungan seperti ini **gajiBersih = (int) (penghasilan - (penghasilan * pajak));**. nanti hasilnya menjadi output dari kondisi pertama tadi.
3. Proses tersebut juga akan dijalankan jika nilai variabel sesuai dengan kondisi "pebisnis"
4. Jika kondisi tidak terpenuhi sama sekali maka akan masuk ke "else" denga  pernyataan seperti ini **Kategori yang Anda masukkan salah!**


##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

JAWABAN 

1. Angka di belakang koma tidak ditampilkan karena menggunakan tipe data integer yang dimana tipe data integer menampung bilangan bulat.
2. Fungsi "int" pada sintaks diatas berfungsi agar variabel "pajak" yang bertipe data "double" dikonversikan menjadi tipe data integer.
3. Yang terjadi program berjalan dengan normal, tidak ada perubahan hasil. Fungsi dari equalsIgnoreCase adalah untuk menyeleksi nilai tipe data String namun menghiraukan besar kecil nya huruf. Jadi penulisan huruf kapita atau kecil tidak akan berpengaruh.
4. Yang terjadi hasil ouput nya **Kategori yang Anda masukkan salah!**. karena saat memasukkan kategori "PEBISNIS" itu tidak terindikasi kedalam kondisi yang ada. Sehingga masuk ke else yang pernyataannya **Kategori yang Anda masukkan salah!**. Perintah "equals" itu ketika input nilai String maka besar kecil nya huruf sangat berpengaruh. Jadi harus sesuai dengan apa yang di deklarasikan.


```Java
// Jawaban pertanyaan
if(kategori.equals ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    }else if (penghasilan <= 3000000){
        pajak = 0.15;
    }else{
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yan Anda terima: " + gajiBersih);
    
}else if(kategori.equals ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    }else if (penghasilan <= 3500000){
        pajak = 0.2;
    }else{
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yan Anda terima: " + gajiBersih);
}else{
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Kategori yang Anda masukkan salah!


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
double bilangan1, bilangan2, hasil;
char operator;

System.out.print("Masukkan bilangan pertama: ");
bilangan1 = sc.nextDouble();
System.out.print("Masukkan operator: ");
operator = sc.next().charAt(0);
System.out.print("Masukkan bilangan kedua: ");
bilangan2 = sc.nextDouble();

switch(operator){
    case '+':
        hasil = bilangan1 + bilangan2;
        System.out.println(bilangan1 + " + " + bilangan2 + " = " + hasil);
        break;
    case '-':
        hasil = bilangan1 - bilangan2;
        System.out.println(bilangan1 + " - " + bilangan2 + " = " + hasil);
        break;
    case '*':
        hasil = bilangan1 * bilangan2;
        System.out.println(bilangan1 + " * " + bilangan2 + " = " + hasil);
        break;
    case '/':
        hasil = bilangan1 / bilangan2;
        System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil);
        break;
         
}
```

    Masukkan bilangan pertama: 10
    Masukkan operator: +
    Masukkan bilangan kedua: 28.5
    10.0 + 28.5 = 38.5
    

Penjelasan Tugas no 1 :
- Pada kode program diatas menggunakan library scanner. Pertama nya mendeklarasikan Scanner dan variabel yang dibutuhkan sesuai soal diatas.
- Program di atas merupakan program kalkulator yang berfungsi menghitung perhitungan seperti pengurangan, pembagian, pengurangan, pertambahan.
- Menggunakan metode Switch case
- Proses berjalannya program :
1. input nilai dari variabel "bilangan1" "operator" dan "bialngan2".
2. Kemudian jika semisal menginput nilai variabel "+" maka nanti pada mode pemilihan Switch case, pada kondisi pertama yaitu **case '+'** maka kondisi terpenuhi dan akan menjalankan proses dan pernyataan yang sesuai dengan kondisi tersebut. Begitu pula seterusnya. sesuai dengan input dan kondisi yang terpenuhi


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
double sisi1, sisi2, sisi3;
String sisi;

System.out.print("Masukkan sisi pertama: ");
sisi1 = sc.nextDouble();
System.out.print("Masukkan sisi kedua: ");
sisi2 = sc.nextDouble();
System.out.print("Masukkan sisi ketiga: ");
sisi3 = sc.nextDouble();

if (sisi1 == sisi2 && sisi2 == sisi3){
    System.out.println("Segitiga Sama sisi");
}else if(sisi1 == sisi2 || sisi2 == sisi3 || sisi1 == sisi3){
    System.out.println("Segitiga Sama kaki");
}else{
    System.out.print("Segitiga sembarang");
}

```

    Masukkan sisi pertama: 10
    Masukkan sisi kedua: 15
    Masukkan sisi ketiga: 17
    Segitiga sembarang

Penjelasan Tugas no 2:

- Menggunakan library Scanner. Mengdeklarasikan Scanner dan variabel.
- Menggunakan metode if else if else
- Pada program di atas digunakan untuk menentukan bentuk dari segitiga yang dimana jika ketiga nilai mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)
- Proses berjalannya program:
1. Memasukkan nilai dari variabel "sisi1", "sisi2", "sisi3"
2. Kemudian nanti akan diseleksi pada kondisi pertama jika **sisi1 == sisi2 && sisi2 == sisi3** yang hasil nya true semua maka output yang dikeluarkan adalah **Segitiga Sama sisi**
3. Tetapi jika nilai sisi segitiga hanya dua yang sama maka akan diseleksi pada kondisi kedua yaitu **sisi1 == sisi2 || sisi2 == sisi3 || sisi1 == sisi3** dan menghasilkan output **Segitiga Sama kaki**
4. Jika input sisi berbeda semua dan kondisi pertama dan kedua tidak terpenuhi maka hasil outputnya **Segitiga sembarang**

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
        Scanner sc =new Scanner(System.in);
        String namaMakanan, pengiriman;
        int hargaMakanan, total;
        int  ongkir = 0;

        System.out.print("Masukkan nama makanan\t : ");
        namaMakanan = sc.nextLine();
        System.out.print("Masukkan harga makanan\t : Rp ");
        hargaMakanan = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)?: ");
        pengiriman = sc.nextLine();


       if (pengiriman.equalsIgnoreCase("0")) {
            if (hargaMakanan < 100000) {
                ongkir = 20000;
            } else if (hargaMakanan >= 100000) {
                ongkir = 30000;
            }
        }if(pengiriman.equalsIgnoreCase("1")){
           }else if (hargaMakanan < 100000) {
                ongkir = 25000 + 20000;
        }

        System.out.println("STRUK PEMBELIAN");
        System.out.println(namaMakanan + "\t\t\t Rp " + hargaMakanan);
        System.out.println("Biaya pengiriman\t\t Rp " + ongkir);
        total = hargaMakanan + ongkir;
        System.out.println("TOTAL\t\t\t\t Rp " + total);
    
        
```

    Masukkan nama makanan	 : tuna salad
    Masukkan harga makanan	 : Rp 115000
    Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)?: 0
    STRUK PEMBELIAN
    tuna salad			 Rp 115000
    Biaya pengiriman		 Rp 30000
    TOTAL				 Rp 145000
    

Penjelasan Tugas no 3:
- Menggunakan library Scanner. Mengdeklarasikan Scanner dan variabel.
- Menggunakan pemilihan if bersarang
- Program diatas digunakan untuk menerima pesanan dari internet yang nantinya akan menghasilkan struk yang berisi pesanan dan harga yang dipesan
- Proses berjalannya program:
1. Memasukkan nilai variabel namaMakanan yang merupakan tipe data string, memasukkan nilai variabel hargaMakanan, kemudian input variabel pengiriman.
2. Pada kondisi pertama tertera **(pengiriman.equalsIgnoreCase("0"))** yang nantinya diproses jika input varibel hargaMakanan bernilai "0".
3. Misal input yang kita masukkan memenuhi kondisi pertama, maka selanjutnya terdapat kondisi lagi yang menanyakan apakah variabel "hargaMakanan" lebih besar/lebih kecil dari 100.000. 
4. jika memenuhi kondisi misal hargaMakanan lebih besar dari 100.000 maka nanti hargaMakanan akan dikenakan ongkir sebesar 30.000
5. Setelah itu akan dihitung berapa total dari pesanan+ongkir nya.

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
        import java.util.Scanner;
        Scanner sc =new Scanner(System.in);
        int umur;
        String statusBekerja, statusSekolah = "";
        int pendapatan, tanggungan;
        double biayaHidup = 0;
        System.out.print("Masukkan umur Anda: ");
        umur = sc.nextInt();


        if(umur >= 18) {
            sc.nextLine();
            System.out.print("Masukkan status bekerja (y/n)");
            statusBekerja = sc.nextLine();
            if (statusBekerja.equalsIgnoreCase("y")){
                System.out.print("Masukkan pendapatan perbulan: ");
                pendapatan = sc.nextInt();
                System.out.print("Masukkan jumlah tanggungan\t: ");
                tanggungan = sc.nextInt();
                biayaHidup = pendapatan / tanggungan;
                System.out.println("Biaya hidup\t\t\t: Rp." + biayaHidup);
                if (biayaHidup < 300000) {
                    System.out.println("Penduduk miskin");
                } else{
                    System.out.println("Bukan penduduk miskin");
                }
            }else if(statusBekerja.equalsIgnoreCase("n")){
                System.out.println("Penduduk miskin");
            }else {
                System.out.println("Masukkan status sekolah (y/n): ");
                statusSekolah = sc.nextLine();
            }if(statusSekolah.equalsIgnoreCase("y")){
                System.out.println("Bukan penduduk miskin");
            }else if(statusSekolah.equalsIgnoreCase("n")){
                System.out.println("Penduduk miskin");
            }
        }
    
```

    Masukkan umur Anda: 25
    Masukkan status bekerja (y/n)y
    Masukkan pendapatan perbulan: 2000000
    Masukkan jumlah tanggungan	: 4
    Biaya hidup			: Rp.500000.0
    Bukan penduduk miskin
    

Penjelasan Tugas no 4:

- Menggunakan library Scanner. Mengdeklarasikan Scanner dan variabel.
- Menggunakan pemilihan if bersarang
- Proses Berjalannya program:
1. Masukkan nilai variabel umur apakah lebih dari 18, jika iya maka akan diproses pada kondisi pertama, lalu memasukkan nilai variabel "statusBekerja"
2. Kemudian jika nilai variabel "statusBekerja" itu "y", maka proses selanjutnya memasukkan nilai "pendapatan" dan "tanggungan"
3. Kemudian akan dihitung biayaHidup nya yaitu dengan membagi (pendapatan/tanggungan). dan hasilnya akan di output kan.
4. jika sudah dihitung biaya hisup nya berapa maka masuk ke kondisi biayahidup lebih dari 300.000, seperti pada contoh diatas.
5. Maka hasil outputnya akan menghasilkan **Bukan penduduk miskin**
