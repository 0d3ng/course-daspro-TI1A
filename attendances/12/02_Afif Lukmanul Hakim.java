import java.util.Scanner;
    public class matriksKuis{
        public static void main(String[] args){
        Scanner matriks = new Scanner(System.in);
        // Scanner untuk menampung data yang diinputkan ke library.

        System.out.print("Masukkan ukuran matrix: ");
        int ukurMatriks = matriks.nextInt();
        int[][] myMatriks1 = new int[ukurMatriks][ukurMatriks];
        int[][] myMatriks2 = new int[ukurMatriks][ukurMatriks];
        int[][] sum = new int[ukurMatriks][ukurMatriks];
        // Pendeklarasian dan instansiasi array 2 dimensi, mulai dari matriks A, B, sampai matriks hasil yang telah diinisialisasi di variabel sum.

        System.out.println("Masukkan matriks A");
        for(int i=0; i < myMatriks1.length; i++){
        for(int j=0; j < myMatriks2.length; j++){
        System.out.print("elemen [" + i + "][" + j + "]: ");
        myMatriks1[i][j] = matriks.nextInt();
        //menginputkan nilai dari matriks A dengan cara melakukan perulangan sesuai code perulangan di atas.
        }
    }
    System.out.println("Masukkan matriks B");
    for(int i=0; i < myMatriks1.length; i++){
    for(int j=0; j < myMatriks2.length; j++){
    System.out.print("elemen [" + i + "][" + j + "]: ");
    myMatriks2[i][j] = matriks.nextInt();
    //sama halnya dengan matriks A, melakukan penginputan nilai pada matriks B dengan melakukan perulangan.
    }
}
int menu = 0;
	while (menu != 3){
System.out.println("Program Square Matrux Simple");
System.out.println("1. Hasil Penambahan");
System.out.println("2. Tampil Elemen Diagonal Kiri");
System.out.println("3. Keluar");
//memberikan menu pada code program dengan menggunakan switch case.
System.out.print("Silahkan pilih menu: ");
menu = matriks.nextInt();
//user akan diminta inputan 1-3 untuk masuk ke menu dan jika tidak sesuai maka akan muncul "Maaf menu anda tidak tersedia".
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
    //Pada case pertama kita akan melakukan penjumlahan pada setiap nilai matriks,
    //dengan cara melakukan perulangan untuk menjumlahkan setiap nilai matriks dan menampilkan hasil penjumlahan 
        break;
    case 2:
    int jum = 0;
    double ave;
    for(int i = 0; i < myMatriks1.length; i++){
        System.out.println(sum[i][((myMatriks1[0].length - 1) - i)]);
    //Pada case kedua kita akan menampilkan diagonal kiri dari hasil penjumlahan atau hasil dari case 1.
        jum += sum[i][((sum[0].length - 1) - i)];
        //untuk memberikan jumlah dari semua nilai diagonal kiri yang telah ditemukan hasil matriksnya.
        }
        ave = jum/sum.length;
        System.out.println("Hasil rata-rata : " + ave);
        //menghitung rata-rata dari jumlah nilai diagonal yang telah ditemukan.
        break;
    case 3:
    // Pada case 3, program akan berhenti dan sekaligus keluar dari program.
    break;
    default:
    System.out.println("Maaf menu anda tidak tersedia");
    // Pada case ini, jika user memasukkan menu tidak sesuai dengan menu yang tertera maka akan muncul kalimat "Maaf menu anda tidak tersedia".
        }
    }
    }
}