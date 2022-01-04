```Java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
System.out.print("masukkan ukuran matriks: ");
    int input = sc.nextInt();
    int matriks1[][] = new int[input][input];
    int matriks2[][] = new int[input][input];
    int jumlah[][] = new int[input][input];

    System.out.println("Masukkan matriks A : ");
    for (int x = 0; x < input; x++) {
      for (int y = 0; y < input; y++) {
        System.out.print("elemen [" + x + "," + y + "]: ");
        matriks1[x][y] = sc.nextInt();
      }
    }
    System.out.println("Masukkan matriks B : ");
    for (int x = 0; x < input; x++) {
      for (int y = 0; y < input; y++) {
        System.out.print("elemen [" + x + "," + y + "]: ");
        matriks2[x][y] = sc.nextInt();
      }
    }
        int pilihan=0, total=0;
        float ratarata =0;
        do {
            switch  (pilihan){
                case 1 :
                  System.out.println("Hasil pengurangan matriks: ");
                     for (int x = 0; x < input; x++) {
                        for (int y = 0; y < input; y++) {
                        jumlah[x][y] = matriks1[x][y] - matriks2[x][y];
                        System.out.print(jumlah[x][y] + "  ");
                        }
                    System.out.println();
                    }  break;
                   
                case 2 :
                    System.out.println("untuk yang diagonal kanan");
                     for (int x = 0; x < input; x++) {
                        for (int y = 0; y < input; y++) {
                         jumlah[x][y] = matriks1[x][y] - matriks2[x][y];
                        }
                     }
                     System.out.println("Hasil diagonal kanan");
                      for(int x = 0; x < input; x++){
                            for(int y = 0; y <=x; y++){
                                if(x==y){
                                System.out.println(jumlah[x][y]);
                                total+=jumlah[x][y];
               
                                }
                            }
                        }
                    System.out.println("Hasil dari rata rata : ");
                    ratarata= total/input;
                    System.out.println(ratarata);      
                     
                    break;
                case 3 :
                    break;
            }
            System.out.print("Program square matrix simpel\n" +
                        "1. Pengurangan matrix\n" +
                        "2. Tampil elemen diagonal kanan\n" +
                        "3. Keluar\n");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
           
        } while (pilihan == 1||pilihan == 2);
```

    masukkan ukuran matriks: 3
    Masukkan matriks A : 
    elemen [0,0]: 4
    elemen [0,1]: 8
    elemen [0,2]: 6
    elemen [1,0]: 7
    elemen [1,1]: 9
    elemen [1,2]: 10
    elemen [2,0]: 3
    elemen [2,1]: 4
    elemen [2,2]: 11
    Masukkan matriks B : 
    elemen [0,0]: 2
    elemen [0,1]: 3
    elemen [0,2]: 4
    elemen [1,0]: 5
    elemen [1,1]: 6
    elemen [1,2]: 9
    elemen [2,0]: 1
    elemen [2,1]: 3
    elemen [2,2]: 2
    Program square matrix simpel
    1. Pengurangan matrix
    2. Tampil elemen diagonal kanan
    3. Keluar
    Pilihan: 1
    Hasil pengurangan matriks: 
    2  5  2  
    2  3  1  
    2  1  9  
    Program square matrix simpel
    1. Pengurangan matrix
    2. Tampil elemen diagonal kanan
    3. Keluar
    Pilihan: 2
    untuk yang diagonal kanan
    Hasil diagonal kanan
    2
    3
    9
    Hasil dari rata rata : 
    4.0
    Program square matrix simpel
    1. Pengurangan matrix
    2. Tampil elemen diagonal kanan
    3. Keluar
    Pilihan: 3


### 

"PENJELASAN UNTUK PROGRAM DIATAS"

diatas tersebut mula mula kita input kan dulu untuk yg dibutuhkan seperti contoh nya int input setelah itu kita input kan untuk memasukkan angka dari matriks a untuk kali ini saya menggunakan perulangan for.lalu selanjutnya kita juga memasukkan angka dari matriks b dengan menggunakan perulangan yang sama yaitu perulangan for.setelah matriks a dan b sudah diinput kita lakukan pengurangan antara matriks a dan matriks b untuk kasus ini saya menggunakan swicth case untuk operasi pengurangannya.setelah selesai kita mencari diagonal kanan nya lalu setelah selesai kita hitung rata rata nya.di program tersebut saya tak lupa untuk memasukkan tabel dari program square matrix simple nya,untuk yang switch case diatas itu saya menggunakan 2 perulangan yaitu perulangan for dan perulangan do while.


```Java

```
