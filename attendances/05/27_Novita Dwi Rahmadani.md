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
System.out.print("Masukkan sebuah bilangan: ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan: 8


Penjelasan: Dengan perintah diatas (import java.util.Scanner/menambahkan library scanner)kita dapat memasukkan bilangan integer yang kita mau 

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

    Bilangan Genap


Penjelasan: jika nilai bilangan habis dibagi 2 maka output bilangan genap,dan jika nilai bilangan dibagi 2 dan bersisa maka output bilangan ganjil

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
// Ketik kode program di atas di bawah sini
String output = (bil % 2 == 0)? "Bilangan Genap":"Bilangan Ganjil";
System.out.println(output);
```

    Bilangan Genap


Penjelasan: jika nilai bilangan habis dibagi 2 maka output bilangan genap,dan jika nilai bilangan dibagi 2 dan bersisa maka output bilangan ganjil.Perintah sintaks ini sama seperti diatas dan menghasilkan output yang sama juga,tetapi lebih simple daripada sintaks yang diatasnya

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit

+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
// Ketik kode program di atas di bawah sini
  int nilai;
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
```

    Masukkan sebuah bilangan: 12


Penjelasan: integer nilai untuk mendeklarasikan variabel nilai
System.out.print untuk output
input.nextInt untuk mengambil inputan keyboard dari variabel nilai bilangan integer


+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
// Ketik kode program di atas di bawah sini
if(nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah "+nilai);
```

    Hasil akhir nilai adalah 2


Penjelasan: jika nilai lebih dari sama dengan 100 maka nilai ditambah 10 dan jika nilai kurang dari sama dengan 100 maka nilai -dikurangi 10
nilai 12 yaitu kurang dari 100 maka dikurangi 10
12-10 =2


+ Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi kode program berikut:
    
    ```
    nilai+=10;
    nilai-=10;
    ```

2. Modifikasilah program diatas dimana inputannya yang awalnya hanya satu kemudian diganti 2 inputan (misal : nilai1 dan nilai2), lakukan perhitungan rata-rata kedua nilai tersebut jika nilainya lebih dari sama dengan 100 maka dikurangi 5, sedangkan jika nilai rata-rata tersebut kurang dari 100 maka akan langsung dicetak!


```Java
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
double rata2, angka1, angka2;
System.out.println("Masukkan nilai 1 : ");
angka1 = scan.nextDouble();
System.out.println("Masukkan nilai 2 : ");
angka2 = scan.nextDouble();

rata2 = (angka1 + angka2) / 2;
if(rata2 >= 100){
    rata2 -= 5;
    System.out.print("Rata-rata = " + rata2);
} else {
    System.out.print("Rata-rata = " +rata2);
}
```

    Masukkan nilai 1 : 
    20
    Masukkan nilai 2 : 
    40
    Rata-rata = 30.0

#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
// Ketik kode program di atas di bawah sini
int umur;
System.out.println("Masukkan umur Anda: ");
umur = input.nextInt();
```

    Masukkan umur Anda: 
    18 tahun


Penjelasan : import java.util.Scanner untuk menambahkan library scanner 
Scanner input=new Scanner(System.in) untuk mendeklarasikan scanner
integer umur untuk mendeklarasikan variabel umur dengan syarat umur termasuk bilangan integer
jadi sintaks diatas mendeklarasikan bahwa umur harus bil integer.


+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
// Ketik kode program di atas di bawah sini
if(umur > 60)
    System.out.println("Lansia");
else if(umur > 45)
    System.out.println("Tua");
else if(umur > 17)
    System.out.println("Dewasa");
else if(umur > 5)
    System.out.println("Anak-anak");
else
    System.out.println("Balita");
```

    Dewasa


Jika variabel umur lebih dari 60 tahun maka akan mengeluarkan output Lansia,jika tidak maka akan dicek lagi 
apabila umur lebih dari 45 maka akan mengeluarkan output Tua, jika tidak lagi maka akan dicek lagi apabila umur lebih dari 17 maka akan mengeluarkan output Dewasa, jika tidak lagi maka akan dicek lagi apabila umur lebih dari 5 maka akan mengeluarkan output Anak-Anak, namun jika tidak lagi maka akan mengeluarkan output balita.


+ Jalankan program dan amati apa yang terjadi!

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

Penjelasan: Kode program untuk meminta inputan dari keyboard

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
// Ketik kode program di atas di bawah sini
System.out.print("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.print("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.print("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0)
```

    Masukkan angka pertama: 15
    Masukkan angka kedua: 30
    Masukkan operator (+ - * /): +


Penjelasan : memasukkkan dua bilangan dengan tipe data double dan operator yang digunakan + , - , * , / .

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
        hasil = angka1 - angka2;
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
        System.out.println("Operator yang anda masukkan salah");
}
```

    15.0+30.0=45.0


Penjelelasan : jika operator yang kita masukkan "+" maka nilai bilangan 15 dan 30 akan ditambahkan dan menghasilkan nilai 45

5. Jalankan program. Amati apa yang terjadi!

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil1,bil2;
System.out.print("Masukkan sebuah bilangan: ");
bil1 = input.nextInt();
System.out.print("Masukkan sebuah bilangan: ");
bil2 = input.nextInt();
if(bil1 > bil2){
System.out.print("bilangan terbesar adalah " + bil1);
}else{
System.out.print("bilangan terbesar adalah " + bil2);
}
```

    Masukkan sebuah bilangan: 80
    Masukkan sebuah bilangan: 99
    bilangan terbesar adalah 99

Penjelasan : memasukkan 2 bilangan integer dan membandingkan kedua bilangan tersebut mana yang lebih besar.maka menghasilkan nilai 99 > 80.


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur: ");
umur = input.nextInt();
if(umur >= 17){
System.out.print("Boleh berkendara " );
}else{
System.out.print("Tidak boleh berkendara " );
}
```

    Masukkan umur: 19
    Boleh berkendara 

Penjelasan : mendeklarasikan umur jika umur lebih dari samadengan 17 maka boleh berkendara dan jika umur kurang dari samadengan 17 maka tidak boleh berkendara.
jika umur yang dimasukkan 19 maka boleh berkendara.


```Java
import java.util.Scanner;
Scanner nilai = new Scanner(System.in);
double uas, uts, kuis, tugas, nilaiakhir ;
System.out.println ("Nilai UAS : ");
uas = nilai.nextDouble ();
System.out.println ("Nilai UTS : ");
uts = nilai.nextDouble ();
System.out.println ("Nilai Kuis : ");
kuis = nilai.nextDouble ();
System.out.println ("Nilai Tugas :");
tugas = nilai.nextDouble ();

nilaiakhir = (0.4*uas) + (0.3*uts) + (0.1*kuis) + (0.2*tugas);
System.out.println("Hasil Akhir mu : "+ nilaiakhir);

if(nilaiakhir <= 65) {
System.out.println ("Remidi");
} else {
System.out.println ("Tidak Remidi");
}

```

    Nilai UAS : 
    80
    Nilai UTS : 
    70
    Nilai Kuis : 
    60
    Nilai Tugas :
    50
    Hasil Akhir mu : 69.0
    Tidak Remidi


Penjelasan: jika nilai akhir kurang dari samadengan 65 maka mahasiswa akan melakukan remidi,dan jika nilai akhir lebih dari samadengan 65 maka mahasiswa tidak melakukan remidi


```Java
import java.util.Scanner;
Scanner price = new Scanner (System.in);
double hargaA,hargaB,hargaC,jumlahA,jumlahB,jumlahC,total,Diskon,Bayar;
System.out.println ("Harga A : ");
hargaA = price.nextDouble();
System.out.println ("Jumlah A: ");
jumlahA = price.nextDouble();
System.out.println ("Harga B : ");
hargaB = price.nextDouble();
System.out.println ("Jumlah B : ");
jumlahB = price.nextDouble();
System.out.println ("Harga C : ");
hargaC = price.nextDouble();
System.out.println("Jumlah C: ");
jumlahC = price.nextDouble();

total = (hargaA*jumlahA)+ (hargaB*jumlahB) + (hargaC*jumlahC);
System.out.println ("Total harga : " + total);


if(total > 200000 && total < 500000 ){
Diskon = total * 0.02;
Bayar = total-Diskon;
System.out.println ("Diskonnya : "+ Diskon);
System.out.println ("Total Akhir Anda : " + Bayar);
} else if (total > 5000000 && total < 1000000){
Diskon = total* 0.05;
Bayar = total-Diskon;
System.out.println ("Diskonnya : "+ Diskon);
System.out.println ("Total Akhir Anda : " + Bayar);
} else if (total> 1000000){
Diskon = total*0.1;
Bayar = total-Diskon;
System.out.println ("Diskonnya : "+ Diskon);
System.out.println ("Total Akhir Anda : " + Bayar);
} else {
System.out.println ("Total Akhir Anda : " + total);

}
```

    Harga A : 
    100000
    Jumlah A: 
    10
    Harga B : 
    250000
    Jumlah B : 
    5
    Harga C : 
    150000
    Jumlah C: 
    1
    Total harga : 2400000.0
    Diskonnya : 240000.0
    Total Akhir Anda : 2160000.0


Penjelasan :Menginputkan harga dan jumlahnya, lalu melewati proses pentotalan beserta pengurangan diskon,dan menghasilkan total akhir, dan jangan lupa diberi limitnya.
