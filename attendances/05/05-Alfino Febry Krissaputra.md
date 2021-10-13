## JOBSHEET 5

## PEMILIHAN 1

### Tujuan

Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.

### Alat dan Bahan
+ PC/laptop
+ Browser(chrome, firefox, safari)
+ Koneksi internet

### Praktikum

#### Percobaan 1 : Penggunaan if

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

    <p align="left">
    <img width="351" height="460" src="images/01.png">
    </p>
    

> Flowchart diatas digunakan untuk menentukan bilangan ganjil/genap, selanjutnya kita akan membuat programnya berdasarkan
> flowchart di atas!

2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel bil untuk menampung data yang diinput melalui keyboard

    ![](images/03.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;
System.out.print("masukan sebuah bilangan: ");
bil = input.nextInt();
```

    masukan sebuah bilangan: 13


operasi import bertujuan untuk mengimport scanner, sedangkan operasi pada baris kedua bertujuan untuk mendeklarasikan scanner.
operasi int bil digunakan untuk membuat variabel bil dengan tipe data integer. system.out,print berfungsi untuk mengeluarkan output. bil = input.nextInt bertujuan untuk menggunakan scanner untuk mengisi variable bil dengan tipe data integer.

3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
// Ketik kode program di atas di bawah sini
if(bil%2 == 0){
    System.out.println("Bilangan Genap");
}else{
    System.out.println("Bilangan Ganjil");
}

```

    Bilangan Ganjil


sintaks di atas artinya jika sisa hasil bagi dari variabel 'bil' jika dibagi 2 sama dengan 0 maka outputnya 'bilangan genap' jika tidak outputnya 'bilangan ganjil'

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil %2 == 0) ? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output)

```

    Bilangan Ganjil


karena kedua program tersebut memiliki fungsi yang hampir sama. yakni untuk memberikan output bertpe string 'bilangan genap' jika syarat terpenuhi atau 'bilangan ganjil' jika syarat tidak dipenuhi. jika syaratnya masih sama tentunya outputnya juga tetap sama.

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
// Ketik kode program di atas di bawah sini
int nilai;
System.out.print("masukan sebuah bilangan: ");
nilai = input.nextInt();
 
```

    masukan sebuah bilangan: 87


+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
// Ketik kode program di atas di bawah sini
if(nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("hasil akhir nilai adalah " +nilai)
```

    hasil akhir nilai adalah 77


kode nilai += 10 berfungsi untuk menambahkan variable nilai dengan 10. sedangkan kode nilai-= 10 berfungsi untuk mengurangi variabel dengan 10.

+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!


```Java
int nilai1, nilai2, rata;
System.out.print("masukan nilai pertama: ");
nilai1 = input.nextInt();
System.out.print("masukan nilai kedua: ");
nilai2 = input.nextInt();
rata = (nilai1+nilai2)/2;

if(rata >= 100) {
    rata -= 5;
}else{
    rata += 5;
}
System.out.println("nilai akhirnya adalah " +rata);
```

    masukan nilai pertama: 33
    masukan nilai kedua: 99
    nilai akhirnya adalah 71


pertama buat variabel nilai1, nilai2, dan rata. menggunakan scanner untuk mengisi variabel nilai1 dan nilai2. operasi rata bermaksud menjumlahkan variabel nilai1 dan nilai2 lalu membagi dengan 2 untuk mendapatkan rata-rata. lalu operasi if, jika nilai rata lebih dari 100 akan dikurangi 5 jika tidak akan ditambah 5.

#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("masukan umur anda: ");
umur = input.nextInt();

```

    masukan umur anda: 18


mengimport scanner lalu mendeklarasikanya. buat variabel umur dengan tipe data integer lalu menggunakan scanner untuk menginput nilai variabel umur.

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
// Ketik kode program di atas di bawah sini
if (umur > 60)
    System.out.println("Lansia");
else if (umur > 45)
    System.out.println("Tua");
else if (umur > 17)
    System.out.println("Dewasa");
else if (umur > 5)
    System.out.println("Anak-anak");
else 
    System.out.println("Balita")
```

    Dewasa


kode program di atas artinya jika variabel umur nilainya lebih dari 60 maka outputnya adalah 'lansia'. jika tidak dan lebih dari 45 maka outputnya 'tua'. jika tidak dan lebih dari 17 maka outputnya adalah 'dewasa'. jika tidak dan lebih dari 5 maka outputnya anak-anak, selain itu outputnya balita.

##### + Jalankan program dan amati apa yang terjadi!

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;

```

program diatas bertujuan mengimport scanner dan mendeklarasikanya. lalu membuat variabel angka1, angka 2 dan hasil dengan tipe data double. serta variabel operator dengan tipe data char.

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
// Ketik kode program di atas di bawah sini
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
double angka1, angka2, hasil;
char operator;

System.out.println("Masukan angka pertama: ");
angka1 = sc.nextDouble();
System.out.println("Masukan angka kedua: ");
angka2 = sc.nextDouble();
System.out.println("Masukan operator (+ - * /): ");
operator = sc.next().charAt(0);
```

    Masukan angka pertama: 
    25
    Masukan angka kedua: 
    5
    Masukan operator (+ - * /): 
    /




4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
// Ketik kode program di atas di bawah sini
switch(operator){
    case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + "+" + angka2 + "=" + hasil);
    break;
    case '-':
        hasil =angka1 - angka2;
        System.out.println(angka1 + "-" + angka2 + "=" + hasil);
    break;
    case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + "*" + angka2 + "=" + hasil);
    break;
    case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + "/" + angka2 + "=" + hasil);
    break;
    default:
        System.out.println("Operator yang Anda masukan salah");
}

```

    25.0/5.0=5.0


program diatas bertujuan untuk melakukan operasi yang berbeda sesuai dengan input variael operator yang diberikan.

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

break berfungsi untuk mengakhiri atau menutup kondisi(case). sedangkan default bertujuan untuk memberikan operasi bawaan jika jika tidak ada kondisi yang terpenuhi.
fungsi perintah operator = sc.next().charAt(0) adalah menggunakan scanner untuk menerima input ke dlam variabel operator degan tipe data char.

### Tugas

#### Waktu pengerjaan Tugas: 140 menit

1. Buatlah program untuk menginputkan dua buah bilangan bulat, kemudian mencetak salah satu bilangan yang nilainya terbesar.
2. Perhatikan flowchart berikut ini:

![](images/02.png)

> Buatlah program sesuai dengan flowchart diatas!

3. Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40% nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan remidi berdasarkan nilai akhir yang didapatkannya!

4. Sebuah toko memberikan diskon kepada pelanggannya dengan ketentuan sebagai berikut:

| Total Belanja     | Potongan |
|-------------------|----------|
| >Rp. 200.000,00   | 2%       |
| >Rp. 500.000,00   | 5%       |
| >Rp. 1.000.000,00 | 10%      |

> Total belanja diperoleh dari pembelian tiga barang yaitu barang A, barang B, dan barang C. Ketika menginputkan harga barang juga menginputkan jumlah barang yang dibeli.

Contoh outputnya
```
Masukkan harga barang A   :100000
Masukkan jumlah barang A  :10
Masukkan harga barang B   :250000
Masukkan jumlah barang B  :5
Masukkan harga barang C   :150000
Masukkan jumlah barang C  :1
---------------------------------------------
                Struk total
---------------------------------------------
Nama Barang 	| 	Harga 	| 	Jumlah 	| 	Total
Barang A            100000         10        1000000   
Barang B            250000         5         1250000   
Barang C            150000         1         150000    
Total       :2400000
Diskon      :240000.0
Total Bayar :2160000.0
```


```Java
// soal nomor 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int bilangan1, bilangan2;

System.out.print("masukan angka pertama: ");
bilangan1 = sc.nextInt();

System.out.print("masukan angka kedua: ");
bilangan2 = sc.nextInt();

if(bilangan1 > bilangan2){
    System.out.println("bilangan terbesar adalah " +bilangan1);
}else{
    System.out.println("Bilangan terbesar adalah " +bilangan2);
}

```

    masukan angka pertama: 20
    masukan angka kedua: 40
    Bilangan terbesar adalah 40



```Java
// soal nomor 2
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int umur;

System.out.print("masukan umur anda: ");
umur = sc.nextInt();

if(umur >= 17){
    System.out.println("Boleh berkendara");
}else{
    System.out.println("Tidak boleh berkendara");
}

```

    masukan umur anda: 18
    Boleh berkendara



```Java
// soal nomor 3
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int uas, uts, kuis, tugas, nilaiAkhir;

System.out.print("masukan nilai UAS: ");
uas = sc.nextInt();
System.out.print("masukan nilai UTS: ");
uts = sc.nextInt();
System.out.print("masukan nilai kuis: ");
kuis = sc.nextInt();
System.out.print("masukan nilai tugas: ");
tugas = sc.nextInt();

nilaiAkhir = (uas * 40/100) + (uts * 30/100) + (kuis * 10/100) + (tugas * 20/100);
System.out.println("nilai akhir adalah " +nilaiAkhir);
if(nilaiAkhir >= 65){
    System.out.println("Tidak remidi");
}else{
    System.out.println("remidi");
}
```

    masukan nilai UAS: 70
    masukan nilai UTS: 90
    masukan nilai kuis: 100
    masukan nilai tugas: 70
    nilai akhir adalah 79
    Tidak remidi



```Java
// soal nomor 3
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int hargaA, jumlahA, hargaB, jumlahB, hargaC, jumlahC; 
double diskon, tagihan, total;

System.out.print("Masukan harga barang A : ");
hargaA = sc.nextInt();
System.out.print("Masukan jumlah barang A : ");
jumlahA = sc.nextInt();

double totalA = hargaA*jumlahA;

System.out.print("Masukan harga barang B : ");
hargaB = sc.nextInt();
System.out.print("Masukan jumlah barang B : ");
jumlahB = sc.nextInt();

double totalB = hargaB*jumlahB;

System.out.print("Masukan harga barang C : ");
hargaC = sc.nextInt();
System.out.print("Masukan jumlah barang C : ");
jumlahC = sc.nextInt();

double totalC = hargaC*jumlahC;
total = (int) totalA + (int) totalB + (int) totalC;

if( total > 1000000.0)
    diskon = 10.0/100.0;

else if( total > 500000.0)
    diskon = 5.0/100.0;

else if( total > 200000.0)
    diskon = 2.0/100.0;

else 
     diskon = 0;
     
double potongan = total *  diskon;
tagihan = total - potongan;


System.out.println("---------------------------------------------------------------------");
System.out.println("\t\t\t STRUK TOTAL");
    
System.out.println("---------------------------------------------------------------------");
System.out.println("Nama Barang \t|\t Harga \t|\t Jumlah \t|\t Total");
System.out.println("Barang A\t" +hargaA + "\t\t\t" + jumlahA + "\t\t\t" + (int) totalA);
System.out.println("Barang B\t" +hargaB + "\t\t\t" + jumlahB + "\t\t\t" + (int) totalB);
System.out.println("Barang C\t" +hargaC + "\t\t\t" + jumlahC + "\t\t\t" + (int) totalC);
System.out.println("total  : " + total);


System.out.println("diskon : " + potongan);
System.out.println("Total Bayar : " + tagihan);
```

    Masukan harga barang A : 100000
    Masukan jumlah barang A : 2
    Masukan harga barang B : 45000
    Masukan jumlah barang B : 3
    Masukan harga barang C : 34000
    Masukan jumlah barang C : 4
    ---------------------------------------------------------------------
    			 STRUK TOTAL
    ---------------------------------------------------------------------
    Nama Barang 	|	 Harga 	|	 Jumlah 	|	 Total
    Barang A	100000			2			200000
    Barang B	45000			3			135000
    Barang C	34000			4			136000
    total  : 471000.0
    diskon : 9420.0
    Total Bayar : 461580.0





```Java

```
