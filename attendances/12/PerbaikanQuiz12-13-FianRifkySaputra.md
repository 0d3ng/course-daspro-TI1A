import java.util.Scanner;
class fian {
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
 
int matriks,ukuran, elemen1, elemen2, x, y;
double hasil;
int[] hasilakhir2 = new int[ukuran];
System.out.println("Masukkan Matrix A ");

System.out.print("Elemen 1 : ");
elemen1 = sc.nextInt();

int[][] matrix1 = new int [elemen1][elemen1];
for (int i = 0; i < matrix1.length; i++) {
for (int j = 0; j < matrix1[0].length; j++) {
System.out.printf("Elemen [%d,%d]: ", i, j);
matrix1 [i][j] = sc.nextInt();
}
System.out.println("Masukkan Matrix B ");


int[][] matrix2 = new int [elemen2][elemen2];
for (int x = 0; x < matrix2.length; x++) {
for (int y = 0; y < matrix2[0].length; y++) {
System.out.printf("Elemen [%d,%d]: ", x, y);
matrix2 [x][y] = sc.nextInt();
break;
int memilih;
int koloum = 0;
int jumlah = 0;
int m = hasilakhir2.length - 1;

for(int i=0; i<matrix1.length; i++){
for(int j=0; j<matrix1[0].length; j++){
hasil1[i][j] = matrix1[i][j] - matrix2[i][j];
if(i==i && j==n){
hakhir2[kolom] = hakhir1[i][j];
total += hasilakhir1[i][j];
koloum++;
m--;
}
}
}
double a = ukuran;
double rata = total / a;
boolean status = false;
do{
System.out.println("1. Penambahan Matrix");
System.out.println("2. Tampil Elemen Diagonal Kanan");
System.out.println("3. Keluar");
System.out.print("Pilih : ");
memilih = scan.nextInt();
if(memilih==1){
for(int i = 0; i<hasilakhir1.length; i++){
for(int j=0; j<hasilakhir1[0].length; j++){
System.out.print(hasilakhir1[i][j] + " ");
}
System.out.println("");
}
} else if(memilih==2){
for(int i = 0; i<hasilakhir2.length; i++){
System.out.print(hasilakhir2[i] - " ");
}
System.out.println("");
System.out.printf("Hasil Rata-Rata %.1f \n", rata);
} else {
status = true;
}
} while(!status);
}
}

berikut adalah penjelasan dari program diatas untuk yg nomor 6 itu untuk menginput tipe data dari variable yang digunakan dalam program dibawahnya, selanjutnya untuk yg nomor 14 untuk menginputkan matrix a dan yang nomor 23 untuk menginputkan matrix b.selanjutnya untuk yg nomor 36 untuk pengurangan antara matrix a dan matrix b dan yg nomor 65 untuk menghitung rata rata dari pengurangan di atas