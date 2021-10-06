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
import java.util.Scanner;
Scanner input = new Scanner(System.in);
int nilai;
System.out.print("Masukkan nilai ujian (0-100) : ");
nilai = input.nextInt();
```

3. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk memastikan bahwa nilai yang dimasukkan berada pada rentang 0 – 100. Jika nilai berada pada rentang 0 – 100, maka akan dilakukan pengecekan status kelulusan mahasiswa, yaitu jika nilai di antara 90 – 100 maka nilainya A, jika nilai di antara 80 – 89 maka nilainya B, jika nilai di antara 60 – 79 maka nilainya C, jika nilai di antara 50 – 59 maka nilainya D, dan jika nilai di antara 0 – 49 maka nilainya E. Sedangkan jika nilai berada di luar rentang 0 – 100, maka ditampilkan informasi bahwa nilai yang dimasukkan tidak valid.

    ![](images/04.png)


```Java
if(nilai >= 0 && nilai <= 100){
    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi anda !");
    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi anda !");
    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar anda !");
    } else {
        System.out.println("Nilai E, Anda tidak lulus !");
    }
} else {
    System.out.println("Nilai tidak valid");
}
```

> Penjelasan kode program percobaan 1
import java.util.Scanner;
Scanner input = new Scanner(System.in);
- Membuat program inputan yang berasal dari keyboard

int nilai;
- Memasukkan variable nilai sebagai tipe data integer

System.out.print("Masukkan nilai ujian (0-100) : ");
nilai = input.nextInt();
- Menginputkan variabel dari keyboard untuk disimpan sebagai variabel nilai

if(nilai >= 0 && nilai <= 100){
- memberikan kondisi range nilai 0 sampai dengan 100 

    if(nilai >= 90 && nilai <= 100){
        System.out.println("Nilai A, EXCELLENT!");
- memberikan kondisi didalam kondisi pertama, jika nilai 90-100 maka akan mengeluarkan output Nilai A excelent

    } else if (nilai >= 80 && nilai <= 89){
        System.out.println("Nilai B, Pertahankan prestasi anda !");
- memberikan kondisi lanjutan, jika nilai 80-89 maka akan mengeluarkan output Nilai B

    } else if (nilai >= 60 && nilai <= 79){
        System.out.println("Nilai C, Tingkatkan prestasi anda !");
- memberikan kondisi lanjutan, jika nilai 60-79 maka akan mengeluarkan output Nilai C

    } else if (nilai >= 50 && nilai <= 59){
        System.out.println("Nilai D, Tingkatkan belajar anda !");
- memberikan kondisi didalam kondisi pertama, jika nilai 50-59 maka akan mengeluarkan output Nilai D

    } else {
        System.out.println("Nilai E, Anda tidak lulus !");
    }
- memberikan kondisi akhir dari kondisi pertama, jika nilai dibawah 50 maka akan mengeluarkan output Nilai E

} else {
    System.out.println("Nilai tidak valid");
}
- jika yang dimasukkan diluar dari kondisi pertama maka output yang keluar akan tidak valid


##### Pertanyaan

1. Modifikasi kode program pada Percobaan 1 sehingga jika nilai yang dimasukkan kurang dari 0 akan ditampilkan output “Nilai yang Anda masukkan kurang dari 0” dan jika nilai yang dimasukkan lebih dari 100 akan ditampilkan output “Nilai yang Anda masukkan lebih dari 100”!

2. Jelaskan fungsi sintaks if (nilai >= 0 && nilai <= 100)!

3. Ubah operator && menjadi || pada sintaks if (nilai >= 0 && nilai <= 100). Jalankan program dengan memasukkan nilai = 105. Amati apa yang terjadi! Mengapa hasilnya demikian?

1. import java.util.Scanner;
		Scanner input = new Scanner(System.in);
		int nilai;

		System.out.print("Masukkan nilai ujian (0-100) : ");
		nilai = input.nextInt();
		if(nilai >= 0 && nilai <= 100){
			if(nilai >= 90 && nilai <= 100){
				System.out.println("Nilai A, EXCELLENT!");
			} else if (nilai >= 80 && nilai <= 89){
    			System.out.println("Nilai B, Pertahankan prestasi anda !");
    		} else if (nilai >= 60 && nilai <= 79){
    		    System.out.println("Nilai C, Tingkatkan prestasi anda !");
    		} else if (nilai >= 50 && nilai <= 59){
    		    System.out.println("Nilai D, Tingkatkan belajar anda !");
    		} else {
    		    System.out.println("Nilai E, Anda tidak lulus !");
    		}
		} else if (nilai < 0){
			System.out.println("Nilai kurang dari 0");
		} else {
			System.out.println("Nilai lebih dari 100");
		}
	}
2. if(nilai >= 0 && nilai <= 100){ 
- command ini memiliki makna kondisi yaitu dimana suatu kondisi yang membatasi atau membentuk suatu range nilai untuk dibuat kondisi lagi didalamnya

3. hasilnya akan mengeluarkan Nilai E, Anda tidak lulus, karena nilai OR akan dinilai benar jika terdapat true di semua maupun di salah satu kondisi, sehingga keti 105 diinputkan dia memenuhi kondisi pertama diman nilai lebih dari 0 tetapi tidak memenuhi kondisi ke 2, karena memakai Operator OR maka akan tetap diikutkan pada peraturan kondisi yang dalam dan masuk kepada else dari kondisi lanjutan, yang mana akan mengeluarkan nilai E.



#### Percobaan 2

#### Waktu percobaan : 40 menit

1. Perhatikan flowchart dibawah ini!

![](images/02.png)

> Flowchart tersebut digunakan untuk menghitung gaji bersih seseorang setelah dipotong pajak sesuai dengan kategorinya (pekerja dan pebisnis) dan besarnya penghasilan. 

2. Tambahkan library Scanner dan deklarasi Scanner

3. Deklarasikan variabel kategori, penghasilan, gajiBersih, dan pajak

    ![](images/05.png)


```Java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String kategori;
int penghasilan, gajiBersih;
double pajak = 0;

System.out.print("Masukkan kategori : ");
kategori = input.nextLine();
System.out.print("Masukkan besarnya penghasilan : ");
penghasilan = input.nextInt();

```

4. Buatlah struktur pengecekan kondisi bersarang. Pengecekan pertama digunakan untuk mengecek kategori (pekerja atau pebisnis). Selanjutnya dilakukan pengecekan kedua untuk menentukan besarnya pajak berdasarkan penghasilan yang telah dimasukkan.Kemudian tambahkan kode program untuk menghitung gaji bersih yang diterima setelah dipotong pajak!

    ![](images/06.png)


```Java
if(kategori.equalsIgnoreCase ("pekerja")){
    if (penghasilan <= 2000000){
        pajak = 0.1;
    } else if (penghasilan <= 3000000){
        pajak = 0.15;
    } else {
        pajak = 0.2;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima : "+ gajiBersih);
    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
    if (penghasilan <= 2500000){
        pajak = 0.15;
    } else if (penghasilan <= 3500000){
        pajak = 0.2;
    } else {
        pajak = 0.25;
    }
    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima : "+ gajiBersih);
} else {
    System.out.println("Kategori anda salah !");
}
```

5. Jalankan program di atas. Amati apa yang terjadi!

> Penjelasan kode program percobaan 2
import java.util.Scanner;
Scanner input = new Scanner(System.in);
- Membuat program inputan yang berasal dari keyboard

String kategori;
- Memasukkan variable kategori sebagai tipe data string

int penghasilan, gajiBersih;
- Memasukkan variable penghasilan dan gajiBersih sebagai tipe data integer

double pajak = 0;
- Memasukkan variable pajak=0 sebagai tipe data double


System.out.print("Masukkan kategori : ");
kategori = input.nextLine();
- Menginputkan variabel string dari keyboard untuk disimpan sebagai variabel kategori

System.out.print("Masukkan besarnya penghasilan : ");
penghasilan = input.nextInt();
- Menginputkan variabel integer dari keyboard untuk disimpan sebagai variabel penghasilan

if(kategori.equalsIgnoreCase ("pekerja")){
- kondisi 1 yang membandingkan kategori dengan pekerja adalah sama

    if (penghasilan <= 2000000){
        pajak = 0.1;
- memberikan kondisi lanjutan, jika penghasilan kurang dari sama dengan 2 juta maka pajaknya 10 persen

    } else if (penghasilan <= 3000000){
        pajak = 0.15;
- memberikan kondisi lanjutan, jika penghasilan kurang dari sama dengan 3 juta maka pajaknya 15 persen

    } else {
        pajak = 0.2;
    }
- memberikan kondisi lanjutan, jika penghasilan dari 3 juta maka pajaknya 20 persen

    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima : "+ gajiBersih);
- memberikan hasil akhir dari pajak pekerja, akan mengeluarkan total gaji bersih yang sudah di proses sesuai aturan.

    
} else if (kategori.equalsIgnoreCase ("pebisnis")){
- kondisi lanjutan yang membandingkan kategori dengan pebisnis adalah sama

    if (penghasilan <= 2500000){
        pajak = 0.15;
- memberikan kondisi lanjutan, jika penghasilan kurang dari sama dengan 2.5 juta maka pajaknya 15 persen

    } else if (penghasilan <= 3500000){
        pajak = 0.2;
- memberikan kondisi lanjutan, jika penghasilan kurang dari sama dengan 3.5 juta maka pajaknya 20 persen

    } else {
        pajak = 0.25;
    }
- memberikan kondisi lanjutan, jika penghasilan lebih dari 3.5 juta maka pajaknya 25 persen

    gajiBersih = (int) (penghasilan - (penghasilan * pajak));
    System.out.println("Gaji bersih yang anda terima : "+ gajiBersih);
- memberikan hasil akhir dari pajak pebisnis, akan mengeluarkan total gaji bersih yang sudah di proses sesuai aturan.

} else {
    System.out.println("Kategori anda salah !");
}
- jika kategori yang dimasukkan bukan pekerja atau bebisnis maka akan mengeluarkan notifikiasi salah


##### Pertanyaan

1. Jalankan program dengan memasukkan kategori = pekerja dan penghasilan = 2048485. Amati apa yang terjadi! Mengapa angka di belakang koma tidak ditampilkan?

2. Jelaskan fungsi dari (int) pada sintaks:
```
gajiBersih = (int) (penghasilan - (penghasilan * pajak));
```

3.	Jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Apa kegunaan dari equalsIgnoreCase?

4.	Ubah equalsIgnoreCase menjadi equals, kemudian jalankan program dengan memasukkan kategori = pebisnis dan penghasilan = 2000000. Amati apa yang terjadi! Mengapa hasilnya demikian? Apa kegunaan dari equals?

1. karena dalam pelaksanaan prosesnya atau pada rumusnya output yang dikeluarkan dalam bentuk integer atau bilangan bulat sehingga angka dibelakang koma tidak akan diikutkan

2. gajiBersih = (int) (penghasilan - (penghasilan * pajak)); 
- maksud dari command tersebut yaitu untuk menentukan gaji bersih dilakukan beberapa pengoprasian karena melibatkan angka desimal pada pajak maka ditambahkan tipe data integer agar hasilnya tetap kelyuar dan dalam bentuk bilangan bulat

3. yang terjadi akan keluar gaji dari pebisnis tersebut sesuai dengan pajak yang diberikan untuk pebisnis, fungsi eualsIgnoreCase yaitu menyamakan atau membandingkan string dengan objek tertentu tanpa melihat kasus atau kondisi.

4. equals dengan equalsIgnoreCase sebenarnya memiliki fungsi yang sama yaitu membandingkan 2 string tetapi dalam menjalankan tugasnya memiliki tatatertib yang berbeda, dari yang saya pahami, apabila equals dia membandingkan 2 string dengan memperhatikan besar kecilnya huruf, tetapi equalsIgnoreCase tidak.\


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
import java.util.Scanner ;
		Scanner sc = new Scanner(System.in);
		double bil1, bil2, hasil;
		char operator;

		System.out.print("Masukkan bilangan pertama: ");
		bil1 = sc.nextDouble();
		System.out.print("Masukkan operator (+, -, *, /): ");
		operator = sc.next().charAt(0);
		System.out.print("Masukkan bilangan kedua: ");
		bil2 = sc.nextDouble();


		switch(operator){
			case '+':
			hasil = bil1 + bil2;
			System.out.println(bil1 + " + " + bil2 + " = " + hasil);
			break;
    		case '-':
        	hasil = bil1 - bil2;
        	System.out.println(bil1 + " - " + bil2 + " = " + hasil);
        	break;
    		case '*':
        	hasil = bil1 * bil2;
        	System.out.println(bil1 + " x " + bil2 + " = " + hasil);
        	break;
    		case '/':
        	hasil = bil1 / bil2;
        	System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        	break;
        	default:
    		System.out.println("Operator yang anda masukan salah");
    	}


```

    Masukkan bilangan pertama: 12
    Masukkan operator (+, -, *, /): +
    Masukkan bilangan kedua: 12
    12.0 + 12.0 = 24.0


2. Dengan menggunakan tiga nilai yang mewakili panjang tiga sisi sebuah segitiga, tentukan apakah segitiga tersebut sama sisi (ketiga sisinya bernilai sama), sama kaki (kedua sisinya bernilai sama), atau sembarang (tidak ada sisi yang bernilai sama)! 


```Java
import java.util.Scanner ;
    Scanner sc = new Scanner(System.in); 
    int s1, s2, s3;

    System.out.print("Masukkan Sisi 1 : ");
    s1 = sc.nextInt();
    System.out.print("Masukkan Sisi 2 : ");
    s2 = sc.nextInt();
    System.out.print("Masukkan Sisi 3 : ");
    s3 = sc.nextInt();

    if ((s1 * s1) == (s2 * s2) + (s3 * s3)) {
            if ((s1 == s2) || (s1 == s3)) {
                System.out.println("Merupakan Segitiga Siku Siku Sama Kaki");
            } else {
                System.out.println("Merupakan Segitiga Siku Siku");
            }
        } else if ((s2 * s2) == (s1 * s1) + (s3 * s3)) {
            if ((s3 == s2) || (s3 == s1)) {
                System.out.println("Merupakan Segitiga Siku Siku Sama Kaki");
            } else {
                System.out.println("Merupakan Segitiga Siku Siku");
            }
        } else if ((s3 * s3) == (s1 * s1) + (s2 * s2)) {
            if ((s3 == s2) || (s3 == s1)) {
                System.out.println("Merupakan Segitiga Siku Siku Sama Kaki");
            } else {
                System.out.println("Merupakan Segitiga Siku Siku");
            }
        } else if ((s3 == s2) && (s2 == s1)) {
            System.out.println("Merupakan Segitiga Sama Sisi");
        } else if ((s3 == s2) || (s3 == s1) || (s1 == s2)) {
            System.out.println("Merupakan Segitiga Sama Kaki");
        } else {
            System.out.println("Merupakan Segitiga Sembarang");
        }
```

    Masukkan Sisi 1 : 12
    Masukkan Sisi 2 : 12
    Masukkan Sisi 3 : 13
    Merupakan Segitiga Sama Kaki


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
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
String makanan;
int harga, exp , reg , total, antar;

System.out.print("Nama Makanan \t\t : ");
makanan = sc.nextLine();
System.out.print("Harga Makanan \t\t : Rp ");
harga = sc.nextInt();
System.out.print("Apakah anda ingin pengiriman express (0 jika tidak, 1 jika iya) ? ");
antar = sc.nextInt();

System.out.println("");
System.out.println("Total Pembelian : ");
System.out.println("" + makanan + "\t\t : Rp " + harga);

    if (antar == 0){
        if (harga < 100000){
            reg = 20000;
            System.out.println("Biaya Kirim :Rp " + reg);
            System.out.println("Total\t\t :Rp " +(harga + reg));
        }else if (harga == 100000 || harga >= 100000){
            reg = 30000;
            System.out.println("Biaya Pengiriman :Rp " +reg);
            System.out.println("Total\t\t :Rp " +(harga + reg));

        }else{
            reg = 0;
            System.out.println("Biaya pengiriman :Rp " +reg);
            System.out.println("Total\t\t :Rp " +(harga + reg));
        }
    }else if (antar == 1){
        if (harga < 100000){
            exp = 45000;
            System.out.println("Biaya Pengiriman :Rp " +exp);
            System.out.println("Total\t\t :Rp " + (harga + exp));
        }else if (harga < 100000 || harga > 100000){
            exp = 550000;
            System.out.println("Biaya Pengiriman :Rp " +exp);
            System.out.println("Total\t\t :Rp " + (harga + exp));
        }
}
```

    Nama Makanan 		 : ayam
    Harga Makanan 		 : Rp 12
    Apakah anda ingin pengiriman express (0 jika tidak, 1 jika iya) ? 1
    
    Total Pembelian : 
    ayam		 : Rp 12
    Biaya Pengiriman :Rp 45000
    Total		 :Rp 45012


4. Perhatikan flowchart berikut ini!

![](images/01.png)

> Buatlah program sesuai dengan flowchart diatas!


```Java
import java.util.Scanner;
        Scanner input = new Scanner(System.in);
        String status;
        int umur, gaji, tanggungan, biayaakhir;

        System.out.print("Umur \t\t\t: ");
        umur = input.nextInt();
        input.nextLine();

    if(umur >=18){
        System.out.print("Sudah Bekerja (y/n) \t:  ");
        status = input.nextLine();
    
    if (status.equalsIgnoreCase ("y")){
        System.out.print("Gaji Perbulan \t\t: Rp ");
        gaji = input.nextInt();
        System.out.print("Tanggungan Keluarga \t: ");
        tanggungan = input.nextInt();
        
        biayaakhir = gaji/tanggungan;
        System.out.print("\nBiaya Hidup Anda Rp "+biayaakhir);
        
    if (biayaakhir > 300000){
      System.out.println("\nAnda tidak termasuk penduduk miskin");
    } else {
      System.out.println("\nAnda termasuk penduduk miskin");
    }
        
} else {
    System.out.println("Anda termasuk penduduk miskin");
}
    
} else {
    System.out.print("Anda Masih Sekolah (y/n) \t: ");
    status = input.nextLine();
    
     if (status.equalsIgnoreCase ("y")){
        System.out.println("Anda tidak termasuk penduduk miskin");
    } else {
         System.out.println("Anda termasuk penduduk miskin");
    }
}
```

    Umur 			: 18
    Sudah Bekerja (y/n) 	:  y
    Gaji Perbulan 		: Rp 4000000
    Tanggungan Keluarga 	: 2
    
    Biaya Hidup Anda Rp 2000000
    Anda tidak termasuk penduduk miskin

