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

    Masukkan nilai ujian (0-100): 50


3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
// Ketik kode di sini
if(nilai >= 0 && nilai<=100){
    if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai A, EXCELENT!");
    }
     else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B,Pertahankan prestasi Anda!");
    }
     else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai C, Tingkatkan prestasi Anda!");
    }
     else if(nilai >= 80 && nilai <= 89){
        System.out.println("Nilai D, Tingkatkan belajar Anda!");
    }else{
        System.out.println("Nilai E, Anda tidak lulus!");
    }

}else{
    System.out.println("Nilai yang Anda masukkan tidak valid!");
}
```

    Nilai E, Anda tidak lulus!


> Penjelasan kode program percobaan 1
Program diawali dengan mendeklarasikan Scanner serta membuat variable "nilai" bertipe data integer yang memiliki value dari Scanner agar bisa diinputkan ketika menjalankan program. Selanjutnya dituliskan sintaks if untuk mengidentifikasi nilai yang telah diinput lalu diseleksi oleh kondisi yang berada di if atau else if maupun else. jika nilai memenuhi satu kondisi teratas maka akan menjalankan perintah yang ada di dalam body. Lalu program akan terhenti, jika kondisi atas belum memenuhi, maka akan nilai akan diseleksi ke kondisi yang ada di bawahnya hingga kondisi memenuhi

##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

Jawaban no 1

langkah pertama hapus else{....} pada 3 line dari bawah
ganti tulis kode 
else if(nilai < 0){
    System.out.println("Nilai yang Anda masukkan kurang dari 0");
}else{
    System.out.println("");
}

jawaban no 2

sintaks if di program tersebut memiliki fungsi untuk mengidentifikasi nilai apakah nilainya diantara 0 dan 100( 0 dan 100 termasuk).

jawaban no 3

Menghasilkan output Nilai E, Anda tidak lulus!, hal ini terjadi karena operator atau(||) membenarkan semua nilai yang bernilai lebih dari sama dengan 0 dan nilai <= 100. Jadi apapun nilai yang diinputkan kedalam variabel nilai akan bernilai true di dalam kondisi pada sintaks if(nilai >= 0 || nilai<=100). Lalu nilai tersebut akan diseleksi pada sintaks - sintaks kondisi yang ada. Karena 105 termasuk pada sintaks else yang memiliki bodi berupa perintah print "Nilai E, Anda tidak lulus!" maka output yang dikeluarkan adalah Nilai E, Anda tidak lulus!

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
Scanner input = new Scanner (System.in);
String kategori;
int penghasilan,gajiBersih;
double pajak = 0;

System.out.println("Masukkan Kategori");
kategori = input.nextLine();
System.out.println("Masukkan besarnya penghasilan");
penghasilan = input.nextInt();
```

    Masukkan Kategori
    pekerja
    Masukkan besarnya penghasilan
    2048485


4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
// Ketik kode di sini
if(kategori.equalsIgnoreCase("pekerja")){
    if(penghasilan<= 2000000){
        pajak = 0.1;
    }else if(penghasilan < 3000000){
        pajak = 0.15;
    }else{
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan*pajak));
    System.out.println("Gaji bersih yang Anda terima: "+ gajiBersih);
}else if(kategori.equalsIgnoreCase("pebisnis")){
    if (penghasilan<= 2500000){
        pajak = 0.15;
    } else if(penghasilan <=3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - penghasilan*pajak);
    System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
}else{
    System.out.println("Kategori yang Anda masukkan salah!");
}
```

    Gaji bersih yang Anda terima: 1638788


5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2

Program dimulai dengan mendeklarasikan Scanner lalu membuat variabel dan tipe data sesuai kebutuhan. Semua variabel belum diberi nilai selain variabel pajak karena variabel pajak perlu diinisialiasi terlebih dahulu. Lalu kode dilanjutkan dengan mengisikan value Scanner ke variabel kategori dan penghasilan. Setelah itu value dari variabel variabel tersebut diseleksi dalam sintaks - sintaks kondisi. Jika value memenuhi kondisi - kondisi tertentu, maka akan menghasilkan output seperti perintah dalam body sintaks.

##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

angka di belakang koma tidak ditampilkan karena pada variable gajiBersih terdapat (int) yang memaksa value untuk menjadi bilangan bulat. Sehingga gajiBersih tidak bisa menampilkan bilangan desimal

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```
berfungsi untuk memaksa value untuk menjadi bilangan bulat. Sehingga gajiBersih tidak bisa menampilkan bilangan desimal

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

value memenuhi sintaks else if(kategori.equalsIgnoreCase("pebisnis"). Kegunaan dari equalsIgnoreCase adalah untuk memeriksa apakah value dari variabel kategori sama dengan parameternya yang dalam hal ini adalah "pebisnis".

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

value memenuhi kondisi else if(kategori.equals("pebisnis")) karena value yang diinputkan sama persis dengan parameter equals(). equals berfungsi untuk mengidentifikasi apakah suatu value sama persis dengan parameter equals() baik dari susunan value di setiap indeksnya maupun besar kecilnya huruf bedanya dengan equalsIgnoreCase() adalah meskipun value memiliki huruf besar sementara di parameter huruf kecil, asalkan susunan value di setiap indeksnya sama maka bernilai true.

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
Scanner input = new Scanner(System.in);
System.out.print("bilangan pertama\t: ");
double a = input.nextDouble();
input.nextLine();
System.out.println("Masukkan operator (+, -, *, /)");
char operator = input.nextLine().charAt(0);
System.out.print("bilangan kedua\t: ");
double b = input.nextDouble();
double hasil;
switch (operator){
    case '+':
        hasil = a + b;
        System.out.println(a + " " + operator + " " + b + " = " + hasil);
        break;
    case '-':
        hasil = a - b;
        System.out.println(a + " " + operator + " " + b + " = " + hasil);
        break;
    case '*':
        hasil = a * b;
        System.out.println(a + " " + operator + " " + b + " = " + hasil);
        break;
    case '/':
        hasil = a / b;
        System.out.println(a + " " + operator + " " + b + " = " + hasil);
        break;
}
```

    bilangan pertama	: 2.5
    Masukkan operator (+, -, *, /)
    *
    bilangan kedua	: 4
    2.5 * 4.0 = 10.0

Penjelasan

Program dimulai dari mendeklarasikan Scanner. Setelah itu membuat variabel variabel dengan tipe data yang dibutuh kan. Lalu semua variabel diinputkan scanner selain variabel hasil. Namun ada tambahan untuk variabel operator, karena kita ingin menginputkan data bertipe data char, maka scanner harus ditambahkan charAt(0) agar scanner hanya membaca input pada indeks ke 0 saja. lalu ditambahkan sintaks switch kondisi - kondisi dan operasi yang akan dilakukan sesuai dengan operator yang ada di setiap case. Jika casenya adalah '+' maka operasinya adalah a + b lalu hasilnya diprint beserta operand dan operatornya. Contoh 2.5 + 4.0 = 6.5. Begitu juga pada case yang lain.


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
double A,B,C;
Scanner in = new Scanner(System.in);
System.out.print("masukkan panjang sisi A :");
A = in.nextDouble();
System.out.print("masukkan panjang sisi B :");
B = in.nextDouble();
System.out.print("masukkan panjang sisi C :");
C = in.nextDouble();
if(A == B && B == C){
    System.out.println("Segitiga sama sisi");
}else if (A == B || B == C || A == C){
    System.out.println("Segitiga sama kaki");
}else if(A != B && B != C && A != C){
    System.out.println("Segitiga sembarang");
}
```

    masukkan panjang sisi A : 4
    masukkan panjang sisi B : 4
    masukkan panjang sisi C : 3
    Segitiga sama kaki

penjelasan

program dimulai dengan membuat variabel kemudian mendeklarasikan Scanner. Lalu menyediakan user untuk menginput data dengan mengisikan scanner ke setiap variable yang telah dibuat. Agar dapat mengetahui jenis segitiganya, dibuatlah berbagai kondisi sehingga dapat mengidentifikasi jenis segitiganya hanya dengan melalui panjang di setiap segitiga. Jika semua sisi sama panjang, maka segitiga itu segitiga sama sisi, jika hanya 2 yang sama, maka segitiga itu segitiga sama kaki, jika berbeda semua maka segitiga itu segitiga sembarang. 

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
Scanner in = new Scanner(System.in);
int biayaPengiriman = 0,harga,choose,total = 0;
System.out.print("Masukkan nama makanan: " );
String Makanan = in.nextLine();
System.out.print("Masukkan harga makanan: ");
harga = in.nextInt();
System.out.print("Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)?");
choose = in.nextInt();
if (choose == 0){
    if(harga < 100000){
        biayaPengiriman = 20000;
    }else if(harga > 100000){
        biayaPengiriman = 30000;
    }
} else if(choose == 1) {
    if(harga < 100000){
        biayaPengiriman = 20000;
        biayaPengiriman += 25000;
    }else if(harga > 100000){
        biayaPengiriman = 30000;
        biayaPengiriman += 25000;
    }
}
total = biayaPengiriman + harga;
System.out.println("STRUK PEMBELIAN");
System.out.println(Makanan + "\t\t\tRp " + harga);
System.out.println("Biaya pengiriman\tRp " + biayaPengiriman);
System.out.println("TOTAL\t\t\t\tRp " + total);
```
```
    Masukkan nama makanan: Tuna salad
    Masukkan harga makanan: Rp 115000
    Apakah Anda ingin pengiriman ekspres (0 = tidak, 1 = ya)? 0

    STRUK PEMBELIAN
    Tuna salad        Rp 115000
    Biaya pengiriman  Rp 30000
    TOTAL             Rp 145000

```
Penjelasan

Seperti biasa, program diawali dengan deklarasi Scanner yang dilanjutkan dengan pembuatan variabel bertipe data int serta variabel makanan bertipe data String. Untuk variabel biayaPengiriman dan total harus diinisialisasi terlebih dahulu dengan menginputkan value berupa 0.  lalu kita mengisi variabel yang belum diinsialisasi dengan Scanner. Kemudian membuat kondisi yang jika user menginputkan 0 pada variabel choose maka akan mendapat biaya pengiriman sebesar 20.000 jika harga makanan kurang dari 100.0000, jika lebih dari 100.000 maka akan mendapat biaya pengiriman sebesar 30.000. Sementara jika user menginputkan 1 pada variabel choose, maka akan memilih jalur express yang berarti biaya pengirmannya adalah biaya pengiriman standart (seperti opsi 0) ditambah 25.000.

4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
//ketik kode program dan lampirkan hasilnya disini
import java.util.Scanner;
Scanner in = new Scanner(System.in);
int umur,pendapatanBulan,tanggungan,biayaHidup = 0;
System.out.println("masukkan umur anda sekarang");
umur = in.nextInt();
in.nextLine();
if(umur >=18){
    System.out.println("Sudah bekerja (A = sudah, B = belum)");
    String check = in.nextLine();
    check.charAt(0);
    if(check.equalsIgnoreCase("a")){
        System.out.println("Masukkan pendapatan perbulan");
        pendapatanBulan = in.nextInt();
        System.out.println("Masukkan jumlah tanggungan");
        tanggungan = in.nextInt();
        biayaHidup = pendapatanBulan/tanggungan;
        System.out.println("biaya hidup anda = " + biayaHidup);
        if(biayaHidup < 300000){
            System.out.println("Anda adalah penduduk miskin");
        }else{
            System.out.println("Anda bukan penduduk miskin");
        }
    }else if(check.equalsIgnoreCase("b")){
        System.out.println("Anda adalah penduduk miskin");
    }
}else{
    System.out.println("Anda masih bersekolah ? (A = bersekolah, B = tidak bersekolah)");
    String checkB = in.nextLine();
    checkB.charAt(0);
    if(checkB.equalsIgnoreCase("a")){
        System.out.println("Anda bukan penduduk miskin");
    }else if(checkB.equalsIgnoreCase("b")){
        System.out.println("Anda adalah penduduk miskin");
    }
}
```
penjelasan

Sesuai dengan flowchart membuat variabel umur dengan value Scanner agar user bisa menginputkan umurnya. lalu umur akan diperiksa melalui kondisi pada sintaks if, jika umurnya lebih dari sama dengan 18 maka user akan dipersilahkan untuk memilih opsi A atau B agar status bekerja dapat diketahui, hal ini dilakukan dengan pembuatan sintaks if dalam if. jika menginputkan B, maka user akan termasuk kepada penduduk miskin lalu perogram berakhir. Sementara jika menginput A, user akan diperintah untuk menginput pendapatan perbulan dan jumlah tanggungan yang setelahnya akan diproses hingga mengetahui biaya hidupnya. Setelah mengetahui biaya hidupnya, maka biaya hidupnya akan diperiksa lagi, apakah biaya hidupnya kurang dari 300.000 atau tidak, jika tidak, maka user bukan penduduk miskin, jika iya maka user adalah penduduk miskin. Kembali lagi ke sintaks if(umur >=18). jika umur user dibawah 18, maka user akan disuruh memilih A atau B, jika A berarti user bersekolah dan user bukan penduduk miskin, jika B berarti user tidak bersekolah maka user adalah penduduk miskin.
