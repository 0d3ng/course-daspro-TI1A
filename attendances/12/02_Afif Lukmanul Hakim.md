```
import java.util.Scanner;
        Scanner matriks = new Scanner(System.in);
        

        System.out.print("Masukkan ukuran matrix: ");
        int ukurMatriks = matriks.nextInt();
        int[][] myMatriks1 = new int[ukurMatriks][ukurMatriks];
        int[][] myMatriks2 = new int[ukurMatriks][ukurMatriks];
        int[][] sum = new int[ukurMatriks][ukurMatriks];
        

        System.out.println("Masukkan matriks A");
        for(int i=0; i < myMatriks1.length; i++){
        for(int j=0; j < myMatriks2.length; j++){
        System.out.print("elemen [" + i + "][" + j + "]: ");
        myMatriks1[i][j] = matriks.nextInt();
        }
    }
    System.out.println("Masukkan matriks B");
    for(int i=0; i < myMatriks1.length; i++){
    for(int j=0; j < myMatriks2.length; j++){
    System.out.print("elemen [" + i + "][" + j + "]: ");
    myMatriks2[i][j] = matriks.nextInt();
    }
}
int menu = 0;
	while (menu != 3){
System.out.println("Program Square Matrux Simple");
System.out.println("1. Hasil Penambahan");
System.out.println("2. Tampil Elemen Diagonal Kiri");
System.out.println("3. Keluar");

System.out.print("Silahkan pilih menu: ");
menu = matriks.nextInt();

switch (menu) {
    case 1:
    System.out.println("1. Hasil Penambahan: ");
    for(int i=0; i < myMatriks1.length; i++){
    for(int j=0; j < myMatriks2.length; j++){
    sum[i][j] = myMatriks1[i][j] + myMatriks2[i][j];
    System.out.print(sum[i][j] + " ");
    }
    System.out.println();
    } 
        break;
    case 2:
    int jum = 0;
    double ave;
    for(int i = 0; i < myMatriks1.length; i++){
        System.out.println(sum[i][((myMatriks1[0].length - 1) - i)]);
        jum += sum[i][((sum[0].length - 1) - i)];
        }
        ave = jum/sum.length;
        System.out.println("Hasil rata-rata : " + ave);
        break;
    case 3:
    break;
    default:
    System.out.println("Maaf menu anda tidak tersedia");
    }
}
```
// 1. Scanner untuk menampung data yang diinputkan ke library. (Baris 3)

// 2. Pendeklarasian dan instansiasi array 2 dimensi, mulai dari matriks A, B, sampai matriks hasil yang telah diinisialisasi di variabel sum. (Baris 8-10)

// 3. Menginputkan nilai dari matriks A dengan cara melakukan perulangan sesuai code perulangan di atas. (Baris 13-17)

// 4. Sama halnya dengan matriks A, melakukan penginputan nilai pada matriks B dengan melakukan perulangan. (Baris 20-24)

// 5. Memberikan menu pada code program dengan menggunakan switch case. (Baris 27-32)

// 6. User diminta inputan 1-3 untuk masuk ke menu dan jika tidak sesuai maka akan muncul "Maaf menu anda tidak tersedia". (Baris 34-35)

// 7. Pada case pertama kita akan melakukan penjumlahan pada setiap nilai matriks, dengan cara melakukan perulangan untuk menjumlahkan setiap nilai matriks dan menampilkan hasil penjumlahan. (Baris 38-46)

// 8. Pada case kedua kita akan menampilkan diagonal kiri dari hasil penjumlahan atau hasil dari case 1. (Baris 48-52)

// 9. Untuk memberikan jumlah dari semua nilai diagonal kiri yang telah ditemukan hasil matriksnya. (Baris 53)

//10. menghitung rata-rata dari jumlah nilai diagonal yang telah ditemukan. (Baris 55-56)

//11. Pada case 3, program akan berhenti dan sekaligus keluar dari program. (Baris 58-59)

//12. Pada case ini, jika user memasukkan menu tidak sesuai dengan menu yang tertera maka akan muncul kalimat "Maaf menu anda tidak tersedia". (Baris 60-61)