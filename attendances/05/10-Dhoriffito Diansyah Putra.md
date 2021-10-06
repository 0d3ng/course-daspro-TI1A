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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int bil;
System.out.print("Masukkan sebuah bilangan: ");
bil = input.nextInt();
```

    Masukkan sebuah bilangan: 10


Fungsi dari kita memanggil scanner adalah untuk user agar dapat menginput sebuah nilai dari keyboard mereka, kemudian kita panggil fungsi scanner dan mendeklarasikan sebuah tipe data integer yang mempunyai variabel bil kemudian kita munculkan kalimat dan input data dari variabel bil

3. Buatlah struktur kondisi untuk mengecek apakah bilangan tersebut merupakan bilangan genap atau ganjil

    ![](images/04.png)


```Java
if(bil %2 == 0){
    System.out.println("Bilangan Genap");
} else {
    System.out.println("Bilangan Ganjil");
}
```

    Bilangan Genap


Fungsi if disini adalah untuk mengecek bilangan tersebut apakah sesuai dengan yang kita deklarasikan tersebut, jika tidak sesuai maka akan mengeluarkan yang berada pada else 

##### Pertanyaan
1. Modifikasi program diatas dibagian struktur pemilihannya sehingga menjadi sebagai berikut:

    ![](images/05.png)


```Java
String output = (bil % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
System.out.println(output);

```

    Bilangan Genap


Kita menggunakan ternary operator yaitu fungsinya sama dengan fungsi if else yaitu menyeleksi 2 pernyataan jika benar maka akan memunculkan sebuah nilai yang memenuhi dan jika tidak maka memunculkan yang di deklarasikan pada else

2. Jalankan dan amatilah hasilnya!
3. Jelaskan mengapa output program yang dimodifikasi sama dengan output program sebelum dimodifikasi!

Pada percobaan yang sebelum di modifikasi ada 5 baris maka jika kita mengguanakan pemilihan ternary operator baris kodenya akan terlihat lebih simpel dibanding dengan menggunakan if...else

#### Percobaan 2 : Penggunaan if else

#### Waktu percobaan : 40 menit


+ Buatlah sebuah variabel nilai untuk menyimpan inputan dari keyboard

    ![](images/06.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan sebuah bilangan: ");
nilai = input.nextInt();
 
 
```

    Masukkan sebuah bilangan: 27


Dalam kode ini kita mendlakrasikan suatu tipe data yaitu integer yang mempunyai variabel nilai, kemudian kita munculkan kalimat berupa string. Setelah tadi kita mendeklarasikan sebuah tipe data, sekarang kita masukkan nilai yang akan kita input

+ Tambahkan sebuah kondisi untuk mengecek input pada variabel nilai

    ![](images/07.png)


```Java
if(nilai >= 100){
    nilai += 10;
}else{
    nilai -= 10;
}
System.out.println("Hasil akhir nilai adalah " + nilai)

```

    Hasil akhir nilai adalah 17


Dalam fungsi if tersebut terdapat sebuah pengecekan yaitu apabila bilangan yang dimasukkan lebih nilainya dari 100 maka akan ditambahkan nilai 10 jika nilai inputan kurang dari 100 maka akan dikurangi 10 dengan demikian kita dapat menampilkan nilainya

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
Scanner input = new Scanner(System.in);

int nilai1, nilai2;
System.out.print("Masukkan nilai 1 : ");
nilai1 = input.nextInt();
System.out.print("Masukkan nilai 2 : ");
nilai2 = input.nextInt();

float rata = (nilai1 + nilai2) / 2f;

if (rata >= 100) {
    rata -= 5;
} 
System.out.println("Hasil rata rata kedua nilai : " + rata);
input.close();
```

    Masukkan nilai 1 : 50
    Masukkan nilai 2 : 20
    Hasil rata rata kedua nilai : 35.0  


1. Fungsi dari +=10 adalah menambahkan hasil yang telah kita inputkan di awal jika yang kita inputkan diawal adalah bilangan lebih dari 100 maka hasil akhirnya akan ditambahkan 10, sedangkan jika -=10 inputan awal kita adalah bilangan kurang dari 100 yang nantinya hasil akhirnya akan dikurangi 10

#### Percobaan 3 : Penggunaan if else-if else

#### Waktu percobaan : 40 menit

+ Tambahakan library `Scanner`
+ Buatlah deklarasi `Scanner`
+ Buat variabel umur bertipe `int`

    ![](images/08.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int umur;
System.out.print("Masukkan umur Anda: ");
umur = input.nextInt();

```

    Masukkan umur Anda: 18


Kita harus memanggil fungsi library scanner terlebih dahulu agar user dapat menginputkan sebuah nilai pada keyboard mereka kemudian kita harus mendeklarasikan sebuah tipe data integer yang memiliki variabel umur. Setelah di deklarasika kita dapat memunculkan tulisan dan setelah itu menginput data yang kita mau dalam bentuk bilangan bulat

+ Kode untuk melakukan pengecekan variabel `umur`

    ![](images/09.png)


```Java
if(umur > 60){
    System.out.println("Lansia");
} else if (umur >45) {
    System.out.println("Tua");
} else if (umur >17) {
    System.out.println("Dewasa");
} else if (umur >5) {
    System.out.println("Anak-anak");
} else{
    System.out.println("Balita");
}
```

    Dewasa


Setelah tadi kita menginputkan umur kita yang memiliki tipe data integer maka di baris kode yang sekarang di cek masuk ke dalam katgori apakah umur kita, jika pada saat pengecekan pertama bernilai salah maka akan dilakukan pada pengecekan yang kedua dan begitupun seterusnya higga nilai yang kita masukkan sesuai dengan syarat yang dideklarasikan

+ Jalankan program dan amati apa yang terjadi!

##### Percobaan 4 : Penggunaan switch-case

#### Waktu percobaan : 40 menit

1. Deklarasikan Scanner
1. Buatlah variabel-variabel berikut

    ![](images/10.png)


```Java
import java.util.Scanner;
Scanner sc = new Scanner (System.in);
double angka1, angka2, hasil;
char operator;

```

Dalam hal ini kita memanggil library scanner kemudian disusul mendeklarasikan tipe data double untuk bilangan desimal yang memiliki 3 varaibel, yaitu angka1, angka2, angka3 kemudian mendeklrasaikan tipe data char yang digunakan untuk memunculkan karakter yang memiliki variabel operator

3. Kode program untuk meminta inputan dari keyboard

    ![](images/11.png)


```Java
System.out.println("Masukkan angka pertama: ");
angka1 = sc.nextDouble();
System.out.println("Masukkan angka kedua: ");
angka2 = sc.nextDouble();
System.out.println("Masukkan operator (+ - * /): ");
operator = sc.next().charAt(0);

```

    Masukkan angka pertama: 
    3
    Masukkan angka kedua: 
    5
    Masukkan operator (+ - * /): 
    /


Setelah kita mendeklarasikan tipe data pada kode sebelumnya sekarang kita memasukkan nilai sesuai variabel yang sesuai kemudian kita masukkan operator yang memiliki tipe data char isinya adalah perkalian, penjumlahan, pengurangan, dan pembagian. Setelah itu kita munculkan sesuai yang kita masukkan semua

4. Kode di bawah ini untuk melakukan pengecekan operator yang digunakan sebelum dilakukan operasi aritmatika

    ![](images/12.png)


```Java
switch(operator){
    
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

    3.0 / 5.0 = 0.6


5. Jalankan program. Amati apa yang terjadi!

Dengan menggubakan switch case kita dapat membuat kode program yang lebih simpel fungsi case disini adalah untuk mengecek yang akan ditampilkan setelahnya kemudian kita deklarasikan nilainya sesuai tanda, jadi nanti saat kita memasukkan sebuah nilai dan operator hasilnya akan sesuai yang telah dideklarasikan pada saat awal

##### Pertanyaan
1. Jelaskan fungsi dari break dan default pada percobaan 4 diatas!
2. Jelaskan fungsi perintah kode program dibawah ini pada percobaan 4!

    ```
    operator = sc.next().chartAt(0);
    ```

1 break berfungsi agar pada saat kondisinya benar atau true sesuai yang dideklarasikan agar berhenti di situ jika salah maka akan diteruskan pada case berikutnya, sedangkan default berfungsi jika semua fungsi pemilihan telah dicek dan ternyata hasilnya salah maka akan di munculkan pada fungsi default

2 Fungsi dari kode program tersebut adalah untuk menyimpan sebuah perintah yang telah diinput oleh user, tetapi untuk tipe data char sedikit ada perbedaan pada akhirannya yang berarti karakter pada index ke 0, jadi yang akan ditampilkan hanya satu karakter saja

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
#### Jawaban

#### 1
```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int angka1, angka2, hasil;

System.out.println("Masukkan angka pertama: ");
angka1 = sc.nextInt();
System.out.println("Masukkan angka kedua: ");
angka2 = sc.nextInt();

if(angka1>angka2){
    System.out.println("Bilangan yang terbesar adalah " + angka1);
}else{
    System.out.println("Bilangan yang terbesar adalah " + angka2);
}
```
```
Masukkan angka pertama: 
19
Masukkan angka kedua: 
27
Bilangan yang terbesar adalah 27
```

Kita harus mengimport library yaitu scanner agar user dapat memasukkan sebuah nilai pada keyboard, kemudian kita dapat mendeklarasikan tipe data integer yang memiliki variabel angka1, angka2, dan angka3 kemudian kita input angka1 dan angka2. Setelah muncul nilai akan dicek oleh pemilihan if else, apabila bernilai true akan dimunculkan pada if sementara jika false dimunculkan pada else



#### 2
```Java
import java.util.Scanner;
public class coba {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int umur;
        
        System.out.println("Masukkan umur anda: ");
        umur = sc.nextInt();
        if(umur>=17){
            System.out.println("boleh berkendara"); 
        }else{
            System.out.println("tidak boleh berkendara");
        }
    }
}

    
```
```
Masukkan umur anda: 
15
tidak boleh berkendara
```
Panggil terlebih dahulu library scanner kemudian deklarasikan scanner tersebut dan deklarasikan tipe data integer karena umur berupa bilangan bulat dengan variabel umur. Kemudia kita cek menggunakan pemilihan if...else, apabila hasil benar maka akan keluar output boleh berkendara dan apabila salah akan keluar output tidak boleh berkendara

#### 3
```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int uas, uts, kuis, tugas;
double nilaiAkhir;

System.out.println("Masukkan nilai uas: ");
uas = sc.nextInt();
System.out.println("Masukkan nilai uts: ");
uts = sc.nextInt();
System.out.println("Masukkan nilai kuis: ");
kuis = sc.nextInt();
System.out.println("Masukkan nilai tugas: ");
tugas = sc.nextInt();

nilaiAkhir = 0.4*uas + 0.3*uts + 0.1*kuis + 0.2*tugas;
if(nilaiAkhir>=65){
    System.out.println("Selamat anda lulus");
}else{
    System.out.println("Maaf anda remidi");
}
```
```
Masukkan nilai uas: 
70
Masukkan nilai uts: 
50
Masukkan nilai kuis: 
90
Masukkan nilai tugas: 
80
Selamat anda lulus
```
Langkah awal yang harus dilakukan adalah dengan memanggil library scanner terlebih dahulu kemudian deklarasikan scanner nya. Kemudian kita deklarasikan terlebih dahulu tipe data yang akan digunakan yaitu tipe data integer karena nilainya nanti akan berupa bilangan bulat, setelah itu deklarasikan juga nilaiAkhir menggunakan tipe data double karena nanti rata rata bisa saja berupa bilangan desimal. Kita buat rumus sesuai permintaan dari soal, lalu kita cek dengan menggunakan pemilihan if...else. Dalam pemilihan ini jika nilai yang di input lebih dari 65 maka akan lulus begitupun sebaliknya


### 4
```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

    int hargaA, jumlahA, hargaB,  jumlahB, hargaC, jumlahC, totalA, totalB, totalC, totalBelanja ;
    double diskon;
    
    System.out.print("Masukkan harga barang A\t\t: ");
    hargaA = sc.nextInt();
    System.out.print("Masukkan jumlah barang A\t: ");
    jumlahA = sc.nextInt();
    System.out.print("Masukkan harga barang B\t\t: ");
    hargaB = sc.nextInt();
    System.out.print("Masukkan jumlah barang B\t: ");
    jumlahB = sc.nextInt();
    System.out.print("Masukkan harga barang C\t\t: ");
    hargaC = sc.nextInt();
    System.out.print("Masukkan jumlah barang C\t: ");
    jumlahC = sc.nextInt();

    totalA = hargaA * jumlahA;
    totalB = hargaB * jumlahB;
    totalC = hargaC * jumlahC;
    totalBelanja = totalA + totalB + totalC;
    diskon = 0;


    if (totalBelanja >= 1000000) {
      diskon = totalBelanja * 10 / 100;
    } else if (totalBelanja >= 500000) {
      diskon = totalBelanja * 5 / 100;
    } else if (totalBelanja >= 200000) {
      diskon = totalBelanja * 2 / 100;
    }

    System.out.println("----------------------------------------");
    System.out.println("              Struk Total");
    System.out.println("----------------------------------------");
    
    System.out.println("Nama Barang\t\t|\t\tHarga\t\t|\t\tJumlah\t\t|\t\tTotal\t\t");
    System.out.println("Barang A\t\t|\t\t"+hargaA+"\t\t|\t\t"+jumlahA+"\t\t|\t\t" + totalA);
    System.out.println("Barang B\t\t|\t\t"+hargaB+"\t\t|\t\t"+jumlahB+"\t\t|\t\t" + totalB);
    System.out.println("Barang C\t\t|\t\t"+hargaC+"\t\t|\t\t"+jumlahC+"\t\t|\t\t" + totalC);
    System.out.println("Total\t\t\t: " + totalBelanja);
    System.out.println("Diskon\t\t\t: " + diskon);
    System.out.println("Total Bayar\t\t: " + (totalBelanja - diskon));
```
```
Masukkan harga barang A         : 10000
Masukkan jumlah barang A        : 4
Masukkan harga barang B         : 30000
Masukkan jumlah barang B        : 5
Masukkan harga barang C         : 40000
----------------------------------------
              Struk Total
----------------------------------------
Nama Barang             |               Harga           |               Jumlah          |               Total
Barang A                |               10000           |               4               |               40000
Barang B                |               30000           |               5               |               150000
Barang C                |               40000           |               4               |               160000
Total                   : 350000
Diskon                  : 7000.0
Total Bayar             : 343000.0
```
Pertama tama kita harus memasukkan sebuah library yaitu scanner agar dapat menginput pada keyboard user. Kemudian kita deklarasikan tipe data integer yaitu untuk harga dan jumlah barang dan tipe data double untuk diskon. Setelah itu kita inputkan nilai yang kita akan masukkan setelah kita input akan masuk ke dalam rumus total harga nya dikalikan dengan jumlah barangnya setelah semuanya terkumpul kita jumlah harga akhir nya. Kita cek ke dalam diskon menggunakan pemilihan if...else if...else apabila nilai dari total belanja lebih dari 1000000 maka akan mendapat diskon sebesar 10% dan jika harga total barang melebihi 500000 maka akan mendapat diskon sebesar 5% dan yang terakhir apabila harga total mencapai lebih dari 200000 maka akan mendapat diskon 2%. Setelah itu akan dimunculkan harga setelah diskon atau harus membayar berapa dan diskonnya mendapat berapa