# KUIS 2

### Nama : Billie Faiqul Izzat
### NIM : 2141720051


```Java
import java.util.Scanner;
Scanner in = new Scanner(System.in);
System.out.print("Masukkan ukuran Matrix : ");
int ukur = in.nextInt();
//dikode program ini akan diminta inputan ukuran dari sebuah matrix yang akan ditampung di variabel ukur 

int[][] arr1 = new int[ukur][ukur];
int[][] arr2 = new int[ukur][ukur];
int arrKurang[][] = new int[ukur][ukur];

System.out.println("Masukkan Matrix A : ");
for(int i=0; i < arr1.length; i++){
    for(int j=0; j < arr1.length; j++){
        System.out.print("ELEMEN [" +i+ "][" +j+ "] : " );
        arr1[i][j] = in.nextInt();
        }
    } // di kode program menggunakan perulangan bersarang yaitu for didalam for lalu  meminta inputan matrix A dan akan ditampung di arr1[][]
System.out.println("Masukkan Matrix B: ");
for(int i=0; i< arr2.length; i++){
    for(int j=0; j< arr2.length ; j++){
        System.out.print("ELEMEN [" +i+ "][" +j+ "] : " );
        arr2[i][j] = in.nextInt();
        }
    }// di kode program menggunakan perulangan bersarang yaitu for didalam for lalu  meminta inputan matrix B dan akan ditampung di arr2[][]


    int pilih=0;
    while (true) {
        System.out.println("+^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+");
        System.out.println("|         * PILIHAN MENU *        |");
        System.out.println("+^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+");
        System.out.println("| [1] Pengurangan Matri           |");
        System.out.println("| [2] Tampil Elemen diagonal Kanan|");
        System.out.println("| [3] Keluar                      |");
        System.out.println("+---------------------------------+"); 
        System.out.print("Masukkan menu pilihan anda: "); 
        pilih = in.nextInt(); 
        if(pilih==1){
            System.out.println("Hasilnya pengurangan : " );
            for(int i=0; i < arrKurang.length; i++){
                for(int l=0; l < arrKurang[0].length;l++){
                    arrKurang[i][l] = arr1[i][l] - arr2[i][l];
                    System.out.print(arrKurang[i][l] + " ");
                }
                 System.out.println();
            }// jika kita memilih angka 1 makan akan menjalankan kode program dari hasil pengurangan yang menggunakan perulangan bersarang yaitu for didalam for prosesnya adalah arrKurang[][] = arr1[][] - arr2[][] 
        }else if(pilih==2){
            System.out.println("Tampil Elemen Diagonal Kanan : ");
            int diagonal = 0;
            int jumlah = 0;
            for (int x=0; x< ukur; ++x ){
                for(int y=0; y<=x; ++y){
                    if(x==y){
                    jumlah += arrKurang[x][y];
                    System.out.println(arrKurang[x][y]);
                    diagonal++;
                    break;
                }

               }
            }// dan jika memilih angka 2 akan menampilkan elemen diagonal kanan, dalam kode program menggunakan perulangan bersarang yaitu for didalam for jika x==y maka jumlah += arrKurang[][]
            double rata = jumlah / diagonal;
            System.out.println("Hasil rata-rata: " + rata);
            // untuk mengetahui nilai rata rata tinggal membagi jumlah dengan diagonal 
            }else if(pilih==3) break;
        }//jika memilih angka 3 akan keluar dari program
```

    Masukkan ukuran Matrix : 3
    Masukkan Matrix A : 
    ELEMEN [0][0] : 7
    ELEMEN [0][1] : 6
    ELEMEN [0][2] : 8
    ELEMEN [1][0] : 7
    ELEMEN [1][1] : 8
    ELEMEN [1][2] : 7
    ELEMEN [2][0] : 6
    ELEMEN [2][1] : 8
    ELEMEN [2][2] : 6
    Masukkan Matrix B: 
    ELEMEN [0][0] : 4
    ELEMEN [0][1] : 3
    ELEMEN [0][2] : 2
    ELEMEN [1][0] : 2
    ELEMEN [1][1] : 1
    ELEMEN [1][2] : 3
    ELEMEN [2][0] : 4
    ELEMEN [2][1] : 5
    ELEMEN [2][2] : 3
    +^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+
    |         * PILIHAN MENU *        |
    +^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+
    | [1] Pengurangan Matri           |
    | [2] Tampil Elemen diagonal Kanan|
    | [3] Keluar                      |
    +---------------------------------+
    Masukkan menu pilihan anda: 1
    Hasilnya pengurangan : 
    3 3 6 
    5 7 4 
    2 3 3 
    +^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+
    |         * PILIHAN MENU *        |
    +^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+
    | [1] Pengurangan Matri           |
    | [2] Tampil Elemen diagonal Kanan|
    | [3] Keluar                      |
    +---------------------------------+
    Masukkan menu pilihan anda: 2
    Tampil Elemen Diagonal Kanan : 
    3
    7
    3
    Hasil rata-rata: 4.0
    +^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+
    |         * PILIHAN MENU *        |
    +^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^+
    | [1] Pengurangan Matri           |
    | [2] Tampil Elemen diagonal Kanan|
    | [3] Keluar                      |
    +---------------------------------+
    Masukkan menu pilihan anda: 3

