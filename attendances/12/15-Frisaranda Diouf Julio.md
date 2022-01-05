```
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int a;
System.out.print("Masukkan ukuran matrix: ");                               //(1)                          
a = sc.nextInt();

int matrixA[][] = new int[a][a];                                            //(2)                                           
int matrixB[][] = new int[a][a];
int hasil[][] = new int[a][a];

System.out.println("Masukkan matriks A");                                   //(3)                                   
for(int i = 0; i < matrixA.length; i++){
    for(int j = 0; j < matrixA[0].length; j++){
        System.out.print("elemen [" + i + "," + j + "]: ");
        matrixA[i][j] = sc.nextInt();
    }
}

System.out.println("Masukkan matriks B");                                   //(4)                                    
for(int i = 0; i < matrixB.length; i++){
    for(int j = 0; j < matrixB[0].length; j++){
        System.out.print("elemen [" + i + "," + j + "]: ");
        matrixB[i][j] = sc.nextInt();
    }
}

for(int i = 0; i < 3; i++){                                                 //(5)                                                  
    System.out.println("");
    System.out.println("Program square matrix simple");
    System.out.println("1. Penambahan matrix");
    System.out.println("2. Tampil elemen diagonal kiri");
    System.out.println("3. Keluar");

    int pilih;                                                              //(6)                                                      
    System.out.print("Pilih: ");
    pilih = sc.nextInt();

    if(pilih == 1){                                                         //(7)                                              
    System.out.println("Hasilnya penambahan:");                         
        for(int j = 0; j < a; j++){                                         //(8)             
            for(int k = 0; k < a; k++){
                hasil[j][k] = matrixA[j][k] + matrixB[j][k];                //(9)             
            }
            System.out.println();
        }

        for(int l = 0; l < hasil.length; l++){                              //(10)             
            for(int n = 0; n < hasil[0].length; n++){
                System.out.print(hasil[l][n] + " ");
            }
            System.out.println();
        }
    }

    int jumlah = 0;
    double rata;
    if(pilih == 2){                                                         //(11)             
        for(int m = 0; m < hasil.length; m++){                              //(12)             
            System.out.println(hasil[m][((hasil[0].length - 1) - m)]);      //(13)      
            jumlah += hasil[m][((hasil[0].length - 1) - m)];                //(14)
        }                                                                   
        rata = (double)jumlah / hasil.length;                               
        System.out.println();                                                            
        System.out.printf("Hasil rata-rata: %.2f", rata);                   //(15)              
    }                                                                                    

    if(pilih == 3){                                                         //(16)              
        System.exit(0);
    }
}
```
> Penjelasan :
> 1. Meminta inputan ukuran matriks dari user. Value nya ini akan menentukan panjang array nya.
> 2. Deklarasi dan instansiasi array dua dimensi bertipe data int, yaitu array matrixA, matrixB, dan hasil.
> 3. Perulangan ini digunakan untuk menginisialisasi elemen array matriks A. Perulangan dilakukan sebanyak panjang array nya.
> 4. Perulangan ini digunakan untuk menginisialisasi elemen array matriks B. Perulangan dilakukan sebanyak panjang array nya.
> 5. Perulangan ini digunakan untuk menampilkan pilihan menu. Batas perulangannya yaitu 3, karena pilihan menunya hanya ada 3.
> 6. Deklarasi variabel pilih yang nantinya untuk menampung value pilihan dari user.
> 7. Apabila value pilih = 1, maka akan menampilkan hasil penambahan kedua matriks.
> 8. Perulangan ini digunakan untuk melakukan operasi penambahan indeks array.
> 9. Karena value dari masing-masing indeks sudah ada, maka langsung ditambah saja lalu ditampung di array baru bernama hasil.
> 10. Perulangan ini digunakan untuk menampilkan hasil operasi penambahan yang telah dilakukan di perulangan sebelumnya.
> 11. Apabila value pilih = 2, maka akan menampilkan elemen diagonal kiri.
> 12. Perulangan ini digunakan untuk menampilkan elemen diagonal kiri dari matriks atau array hasil.
> 13. Untuk menampilkan diagonal kiri, maka indeks pertamanya adalah indeks pada baris pertama kolom terakhir. Maka, pada perulangan pertama m bernilai 0 (baris pertama) dan untuk kolom nya adalah - 1 - m. Karena apabila ada 2 kolom maka kolom terakhirnya adalah indeks ke 1. Maka dari itu perlu dikurangi 1 dahulu. Sedangkan - m digunakan agar indeksnya mencapai 0. Karena semakin banyak perulangan nilai m akan semakin besar pula sampai indeks untuk kolom pertama atau indeks 0. Berkebalikan dengan kolom, baris pada indeks pertama adalah baris terakhir.
> 14. Kemudian value pada diagonal tadi akan dijumlahkan dan ditampung pada variabel jumlah.
> 15. Kemudian untuk mengetahui rata-ratanya, maka dilakukan pembagian variabel jumlah dengan panjang array hasil. Lalu, ditampilkan. Agar angka di belakang koma hanya muncul 2 angka, maka digunakan printf.
> 16. Apabila value pilih = 3, maka akan keluar dari program.