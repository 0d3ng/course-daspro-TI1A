# JOBSHEET 14. Fungsi 2

## Tujuan
* Mahasiswa memahami konsep fungsi rekursif
* Mahasiswa mampu mengimplementasikan fungsi rekursif dalam kode program



## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung nilai faktorial dari suatu bilangan dengan menggunakan fungsi rekursif. Selain itu, akan dibuat juga fungsi untuk menghitung nilai faktorial dengan menggunakan algoritma iteratif sebagai pembandingnya

1. Buat fungsi static dengan nama **faktorialRekursif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya

    ![Gambar 1](images/code14-1.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
static int faktorialRekursif(int n){
    if(n == 0){
        return 1;
    }else{
        return (n * faktorialRekursif(n-1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n){
    int faktor = 1;
    for (int i = n;i >= 1;i--){
        faktor = faktor*1;
    }
    return faktor;
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
static int faktorialRekursif(int n){
    if(n == 0){
        return 1;
    }else{
        return (n * faktorialRekursif(n-1));
    }
}
static int faktorialIteratif(int n){
    int faktor = 1;
    for (int i = n;i >= 1;i--){
        faktor = faktor*i;
    }
    return faktor;
}
System.out.println(faktorialRekursif(5));
System.out.println(faktorialIteratif(5));
```

    120
    120


4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!

Jawaban
1. Fungsi rekursif adalah fungsi yang di dalam body fungsi tersebut memanggil fungsi tersebut
2. Contohnya adalah ketika kita ingin menampilkan angka dari 0 sampai 5, kita dapat menggunakan fungsi rekursif
3. Sama, alur pada fungsi rekursif yaitu, program dalam fungsi akan dijalankan hingga mencapai return pada kondisi yang sesuai, jika kondisi menghasilkan return yang memanggil fungsi, maka fungsi yang sama akan dijalankan lagi namun dengan value berbeda pada parameter yaitu (n-1) dan fungsi yang akan dijalankan akan dikali dengan value dari n, hal ini terus berulang hingga memenuhi kondisi n = 0. Alur pada fungsi iteratif yaitu, ketika fungsi dijalankan, maka akan terjadi perulangan dari code for loop dengan kondisi yang sudah ditentukan, fungsi tersebut akan mengembalikan nilai faktor yang valuenya telah mengalami perubahan pada for loop.


### Percobaan 2
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung pangkat sebuah bilangan dengan menggunakan fungsi rekursif.

1. Buat fungsi static dengan nama **hitungPangkat()**, dengan tipe data kembalian fungsi int dan memiliki 2 parameter dengan tipe data int berupa bilangan yang akan dihitung pangkatnya dan bilangan pangkatnya

    ![Gambar 5](images/code14-5.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah dua buah variabel bertipe int dengan nama bilangan dan pangkat
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

    ![Gambar 6](images/code14-6.png)

5. Lakukan pemanggilan fungsi hitungPangkat yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 7](images/code14-7.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 - 5
static int hitungPangkat(int x, int y){
    if (y==0){
        return 1;
    }else{
        return(x*hitungPangkat(x,y-1));
    }
}
Scanner in = new Scanner(System.in);
System.out.print("Bilangan  yang dihitung: ");
int bilangan = in.nextInt();
System.out.print("Pangkat: ");
int pangkat = in.nextInt();
System.out.println(hitungPangkat(bilangan,pangkat));
```

    Bilangan  yang dihitung: 6
    Pangkat: 3
    216


#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

Jawaban

Dalam fungsi tersebut dibuat suatu kondisi, jika y sama dengan 0, maka akan mengembalikan nilai 1. Jadi proses tersebut akan berakhir ketika value dari y telah mencapai 0.

### Percobaan 3
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung jumlah uang nasabah yang disimpan di Bank setelah mendapatkan bunga selama beberapa tahun dengan menggunakan fungsi rekursif. 

1. Buat fungsi static dengan nama **hitungBunga()**, dengan tipe data kembalian fungsi double dan memiliki 2 parameter dengan tipe  data int berupa saldo nasabah dan lamanya menabung. Pada kasus ini dianggap bunga yang ditentukan oleh bank adalah 11% per tahun. Karena perhitungan bunga adalah bunga * saldo, sehingga untuk menghitung besarnya uang setelah ditambah bunga adalah saldo + bunga * saldo. Dalam hal ini, besarnya bunga adalah 0.11 * saldo, dan saldo dianggap 1 * saldo, sehingga 1 * saldo + 0.11 * saldo dapat diringkas menjadi 1.11 * saldo untuk perhitungan saldo setelah ditambah bunga (dalam setahun).

    ![Gambar 8](images/code14-8.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah sebuah variabel bertipa double dengan nama saldoAwal dan sebuah variabel bertipe int bernama tahun
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

 ![Gambar 9](images/code14-9.png)

5. Lakukan pemanggilan fungsi hitungBunga yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 10](images/code14-10.png)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1 - 5
static double hitungBunga(double saldo,int tahun){
    if(tahun == 0){
        return saldo;
    }else{
        return(1.11*hitungBunga(saldo,tahun-1));
    }
}
System.out.print("Jumlah saldo awal: ");
int saldoAwal = in.nextInt();
System.out.print("Lamanya menabung (tahun): ");
int tahun = in.nextInt();
System.out.print("jumlah uang setelah "+ tahun + "tahun: ");
System.out.print(hitungBunga(saldoAwal,tahun))

```

    Jumlah saldo awal: 150000
    Lamanya menabung (tahun): 6
    jumlah uang setelah 6tahun: 280562.18282415014

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

```java
// base case
if(tahun == 0){
    return saldo;
}

// recursion call
else{
    return(1.11*hitungBunga(saldo,tahun-1));
}
```

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static void deretDescendingRekursif(int n){
    if (n == 0){
        System.out.println(n);
    }else{
        System.out.print(n + " ");
        deretDescendingRekursif(n-1);
    }
}
static void deretDescendingIteratif(int n){
    for (int i = n; i>= 0;i--){
        System.out.print(i + " ");
    }
}
Scanner in = new Scanner(System.in);
System.out.print("Masukkan angka : ");
int number = in.nextInt();
System.out.print("urutan angka menggunakan fungsi rekursif = " );
deretDescendingRekursif(number);
System.out.print("urutan angka menggunakan fungsi iteratif = ");
deretDescendingIteratif(number);
```
    Masukkan angka : 9
    urutan angka menggunakan fungsi rekursif = 9 8 7 6 5 4 3 2 1 0
    urutan angka menggunakan fungsi iteratif = 9 8 7 6 5 4 3 2 1 0 

Penjelasan
1. Membuat fungsi void rekursif berparameter int n agar bisa mengikutsertakan value diluar fungsi
2. dalam fungsi rekursif membuat kondisi jika n = 0 maka berisi base case agar rekursif bisa terhenti, base case tersebut mencetak value n
3. jika n != 0 maka mencetak value dari n dan memanggil fungsi tersebut atau recursion call agar terjadi rekursif, pada fungsi tersebut, value yang dimasukkan pada parameter adalah n - 1 jadi value akan menjadi dinamis dan bisa mencapai 0.
4. Membuat fungsi iteratif berparameter int n
5. dalam fungsi iteratif tersebut, membuat perulangan yang dapat mencetak angka dari angka yang diinputkan user hingga ke 0 yaitu dengan menggunakan for loop dengan kondisi(int i = n; i>= 0;i--) dan berisi System.out.print(i + " ");
6. Membuat sebuah variabel di luar fungsi iteratif dan rekursif bervalue angka input dari user 
7. Memanggil fungsi tersebut dan mengisi parameter dengan variabel yang menampung inputan user
---

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int sumFaktorial(int a){
    int hasil = 0;
    hasil += a;
    if (a == 1){
        return 1;
    }else{
        return hasil+sumFaktorial(a-1);
    }
}
Scanner in = new Scanner(System.in);
System.out.print("Masukkan angka yang mau di hitung : ");
int b = in.nextInt();
System.out.print("hasil dari penghitungan tersebut adalah ");
System.out.println(sumFaktorial(b));
```
    Masukkan angka yang mau di hitung : 8
    hasil dari penghitungan tersebut adalah 36

Penjelasan
1. membuat fungsi bertipe integer dengan sebuah parameter integer agar value dari user bisa diikutsertakan
2. dalam fungsi tersebut, membuat sebuah variabel yang telah diinisialisasi sebagai wadah penampung value dari parameter
3. membuat kondisi, jika value parameter (a) == 1, maka akan mengembalikan value 1
4. Jika tidak, maka mengembalikan value berupa hasil ditambah fungsi yang telah dibuat dengan parameter a-1. Hal ini bertujuan agar terjadi rekursif, sehingga value dari variabel a akan menjadi dinamis dan rekursif bisa terhenti ketika a telah mencapai 1, return kondisi ini juga menambahkan value dari variabel hasil yang telah menampung a, tujuannya adalah agar nilai dari value fungsi yang paling pertama dipanggil akan ikut serta ditambahkan sehingga seluruh angka yang pernah menjadi parameter akan ditambahkan
5. Di luar fungsi tersebut, membuat variabel yang menampung input user
6. lalu mencetak dengan memanggil fungsi yang telah dibuat dengan parameter berupa variabel penampung input user
---

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
static boolean cekPrimaRekursif(int a,int check){
    if (a == 0|| a == 1){
        return false;
    }else if (a%check == 0){
        if (a == check){
            return true;
        }
        return false;
    }
    else{
        return cekPrimaRekursif(a,check+1);
    }
}
Scanner in = new Scanner(System.in);
int checker = 2;
System.out.print("masukkan angka yang ingin diperiksa : ");
int number = in.nextInt();
boolean prima = cekPrimaRekursif(number,checker);
if (prima == false){
    System.out.println("angka itu bukan bilangan prima");
}else{
    System.out.println("angka itu adalah bilangan prima");
}
```
    masukkan angka yang ingin diperiksa : 7
    angka itu adalah bilangan prima
penjelasan
1. membuat fungsi boolean dengan 2 parameter bertipe data integer, parameter(a) berisi bilangan prima yang akan diperiksa, parameter (check) berguna untuk menjadi pemeriksa dari bilangan tersebut
2. membuat kondisi, jika parameter a bernilai 0 atau 1 maka dipastikan bukan bilangan prima dan mengembalikan nilai false
3. jika a dibagi dengan value check bernilai 0, maka akan diseleksi lagi, jika value a sama dengan value check maka dipastikan itu bilangan prima, jika tidak, maka bilangan itu bukan bilangan prima karena bilangan prima hanya bisa dibagi dengan dirinya sendiri atau 1 tanpa menyisakan suatu angka.
4. Jika selain kondisi tersebut, maka akan memanggil fungsi tersebut dengan parameter a tetap, namun parameter check ditambah dengan 1 agar value dari check bisa berubah sehingga angka yang diperiksa bisa dibagi dengan berbagai angka
5. di luar fungsi tersebut, mendaklarasikan variabel checker bertipe integer bervalue 2, nantinya akan diikutsertakan pada parameter check
6. membuat variabel penampung input user
7. membuat variabel boolean dengan value fungsi yang berparameter input user untuk parameter a dan checker untuk parameter check. Sehingga return dari fungsi tersebut disimpan pada variabel ini
8. Jika variabel boolean tersebut bernilai true, maka mencetak angka itu adalah bilangan prima
9. jika tidak, maka menceteak angka itu bukan bilangan prima
---
4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4
static int Fibonacci(int n,int a,int b,int c){
    c = a + b;
    a = b;
    b = c;
    if (n == 0){
        return c;
    }else{
        return Fibonacci(n-1,a,b,c);
    }
}
Scanner in = new Scanner(System.in);
int n1 = 0, n2 = 1,n3 = 0;
System.out.print("Masukkan Bulan ke berapa : ");
int bulan = in.nextInt();
int pasanganProduktif,pasanganBelumProduktif;
if (bulan == 1 || bulan == 2){
    pasanganProduktif = 0;
}else if(bulan == 3){
    pasanganProduktif = 1;
}else{
    pasanganProduktif =  Fibonacci(bulan-4,n1,n2,n3);
}
System.out.println("\nJumlah pasangan pada bulan " + bulan);
System.out.println("Pasangan produktif\t\t\t= " + pasanganProduktif);
if (bulan == 1 || bulan == 2){
    pasanganBelumProduktif = 1;
}else{
    pasanganBelumProduktif =  Fibonacci(bulan-3,n1,n2,n3);
}
System.out.println("Pasangan belum produktif\t= " + pasanganBelumProduktif);
int totalPasangan = pasanganProduktif + pasanganBelumProduktif;
System.out.println("total pasangan\t\t\t\t= " + totalPasangan );
```
    Jumlah pasangan pada bulan 12
    Pasangan produktif			= 55
    Pasangan belum produktif	= 89
    total pasangan				= 144
Penjelasan
1. Membuat fungsi integer dengan 4 parameter yaitu n,a,b,c . Semua parameter itu bertipe data integer. parameter n berfungsi sebagai penunjuk pola fibbonaci ke berapa yang ingin diketahui. Sementaria a , b , c adalah nilai ke 1, 2, dan 3 dari deret fibonacci
2. membuat program untuk membuat deret fibonnaci, yaitu nilai ke 3 berisi dengan nilai 1 + nilai 2, setelah operasi, value a akan ganti dengan value b, dan value b diganti dengan value c.
3. Membuat kondisi, jika n bervalue 0 maka akan mengembalikan nilai c
4. Jika tidak, maka akan memanggil fungsi tersebut dengan parameter sama, namun value pada n dikurangi 1 agar terjadi rekursif, karena value a,b,c sudah diproses dalam program, maka valuenya akan berganti seiring berjalannya fibonacci
5. Di luar fungsi, mendeklarasikan 3 variabel untuk menampung 3 nilai awal pada deret fibonacci serta untuk diisikan pada parameter fungsi fibonacci tersebut. 3 variabel itu adalah n1 bervalue 0, n2 bervalue 1, n3 bervalue 0. Karena nilai pertama pada fibonacci adalah 0 dan nilai ke dua adalah 1, n3 seharusnya bervalue 1, namun karena operasi dilakukan pada fungsi maka n3 harus berisi 0
6. lalu mendeklrasikan variabel integer untuk menampung input user. User akan menginput bulan ke berapa.
7. mendeklarasikan variabel pasanganProduktif dan pasanganBelumProduktif
8. Lalu membuat kondisi untuk mengetahui pasangan produktif
9. Karena pada penghitungan fibonacci pada pasangan produktif, fibonacci ke 0 berada pada bulan ke 4, maka untuk mengisi parameter n pada fungsi Fibonacci tersebut, value yang dimasukkan harus dikurangi 4 dalam hal ini adalah value dari variabel bulan.
10. Seperti yang sudah dijelaskan, karena fibonacci dimulai dari urutan ke 4, maka untuk urutan atau bulan 1 , 2 , 3 akan error jika diisi fungsi karena parameter n pada fungsi akan melampaui return dan mencapai ketakterhinggaan. oleh karena itu dibuatlah kondisi untuk bulan 1,2,3. Yaitu jika user menginputkan value 1 atau 2 , maka value dari pasanganProduktif bernilai 0. Jika user menginputkan value 3, maka value dari pasanganProduktif adalah 1. Selain itu value dari pasanganProduktif adalah memanggil fungsi Fibonacci dengan parameter yang sudah ditentukan yaitu (bulan-4,n1,n2,n3)
11. Begitupula dengan pasanganBelumProduktif. Fungsi Fibonacci berlaku pada urutan ke 3 atau pada bulan ke 3. Maka sama seperti step 10, kita harus membuat kondisi, jika user menginputkan 1 atau 2, maka value dari pasanganBelumProduktif adalah 1. Selain itu memanggil fungsi dengan parameter (bulan-3,n1,n2,n3)
12. Untuk mencari totalnya, maka kita harus mendeklarasikan variabel untuk menampung total dari pasanganProduktif dan pasanganBelumProduktif, lalu cetak.
