# PERBAIKAN NILAI KUIS 2

### Nama: Muhammad Aqilul Muttaqin
### NIM: 2141720182
### No.Absen: 22


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
import java.util.Scanner;
Scanner sc = new Scanner(System.in); // deklarasi Scanner
int uk = 0;
System.out.print("Masukkan ukuran Matrix : ");
uk = sc.nextInt(); // merupakan inputan ukuran matrix dimana inputan tersebut digunakan sebagai panjangnya dari sebuah array mtrxA, mtrxB, dan hasil
int [][] mtrxA = new int [uk][uk];
int [][] mtrxB = new int [uk][uk];
int [][] hasil = new int [uk][uk];
// deklarasi sekaligus instansiasi array 2 dimensi dengan inputan ukuran sebagai panjang dari baris dan kolomnya
System.out.println("Masukkan matriks A");
for (int a = 0; a < mtrxA.length; a++) { //outer loop indeks dimulai dari 0 dengan syarat perulangan a < mtrxA.length, maksud dari array.length adalah panjang maksimalnya dari array
    for (int b = 0; b < mtrxA.length; b++) { //inner loop indeks dimulai dari 0 dengan syarat perulangan b < mtrxA.length dan diincrement
		System.out.print("elemen [" +a+ "," +b+"] : " );
		mtrxA [a][b] = sc.nextInt();
	}
} // untuk meminta inputan isi setiap baris dan kolom matriks 1 kepada user
System.out.println("Masukkan matriks B");
for (int a = 0; a < mtrxB.length; a++) { //outer loop indeks dimulai dari 0 dengan syarat perulangan a < mtrxB.length dan diincrement
	for (int b = 0; b < mtrxB.length; b++) { //inner loop indeks dimulai dari 0 dengan syarat perulangan bb < mtrxB.length dan diincrement
		System.out.print("elemen [" +a+ "," +b+"] : " );
		mtrxB [a][b] = sc.nextInt();
	}
} // untuk meminta inputan isi setiap baris dan kolom matriks 2 kepada user
int pilihan = 0;
while (pilihan != 3){ // menggunakan perulangan dengan syarat perulangannya adalah inputan pilihan tidak sama dengan 3
	System.out.println("\nProgram square matrix simple"
	+ "\n1. Penambahan matrix"
	+ "\n2. Tampil elemen diagonal"
	+ "\n3. Keluar");
	System.out.print("Silahkan pilih menu: ");
	pilihan = sc.nextInt();
	switch(pilihan){ // jika pilihan yang yang di inputkan user bukan 3 maka kode program ini akan terus berulang dan mengeluarkan output di atas sampai yang diinputkan user = 3
		case 1:
			System.out.println("Hasil penambahan: ");
			for (int a = 0; a < mtrxA.length; a++){ //outer loop
				for (int b = 0; b < mtrxB.length; b++){ //inner loop
					hasil [a][b] = mtrxA [a][b] + mtrxB [a][b];
					System.out.print(hasil [a][b] + " ");
				}
				System.out.println();
			}
			// pada case 1 ini menggunakan nested loop yang didalam perulangannya dengan cara mtrxA [a][b] ditambah dengan mtrxB [a][b]
			// setelah dijumlahkan hasilnya akan disimpan atau ditampung pada array hasil [a][b] kemudian mencetak array hasilnya
		break;
		case 2:
			int jumlah = 0;
			double rata;
			for (int a = 0; a < hasil.length; a++){
				System.out.println(hasil [a][(hasil.length - 1) - a]);
				jumlah += hasil [a][(hasil.length - 1) - a];
			}
			rata = jumlah / hasil.length;
			System.out.println("Hasil rata-rata dari diagonal: " + rata);
			// pada case 2 akan mencetak diagonal kiri dari matrix yakni dengan cara (hasil[a][(hasil.length-1)-a])
			// maksudnya yang akan dicetak adalah array hasil dengan indeks baris pertama atau awal dan kolom dengan (panjangnya array hasil-1)-a dan di increment
			// untuk array hasilnya akan dijumlahkan kemudian dicari rata-ratanya dengan cara jumlah dibagi dengan panjangnya array hasil 
		break;
		case 3: // pada case 3 ini perulangan akan terhenti dan keluar dari kode program
		break;
		default: // jika yang di inputkan user selain 1, 2, dan 3 maka akanmengeluarkan output dibawah ini
		System.out.println("Pilihan anda tidak ada dalam daftar menu");
	}
}
```

    Masukkan ukuran Matrix : 2
    Masukkan matriks A
    elemen [0,0] : 1
    elemen [0,1] : 2
    elemen [1,0] : 3
    elemen [1,1] : 4
    Masukkan matriks B
    elemen [0,0] : 5
    elemen [0,1] : 3
    elemen [1,0] : 2
    elemen [1,1] : 3
    
    Program square matrix simple
    1. Penambahan matrix
    2. Tampil elemen diagonal
    3. Keluar
    Silahkan pilih menu: 1
    Hasil penambahan: 
    6 5 
    5 7 
    
    Program square matrix simple
    1. Penambahan matrix
    2. Tampil elemen diagonal
    3. Keluar
    Silahkan pilih menu: 2
    5
    5
    Hasil rata-rata dari diagonal: 5.0
    
    Program square matrix simple
    1. Penambahan matrix
    2. Tampil elemen diagonal
    3. Keluar
    Silahkan pilih menu: 3

