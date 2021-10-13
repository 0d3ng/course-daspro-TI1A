{
 "cells": [
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "## JOBSHEET 7\n",
    "\n",
    "## PERULANGAN 1\n",
    "\n",
    "### Tujuan\n",
    "\n",
    "Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks perulangan 1 dan mengimplemantasikannya dalam bahasa pemrogaman java.\n",
    "\n",
    "### Alat dan Bahan\n",
    "+ PC/laptop\n",
    "+ Browser(chrome, firefox, safari)\n",
    "+ Koneksi internet\n",
    "\n",
    "### Praktikum\n",
    "\n",
    "#### Percobaan 1 : Penggunaan for, while dan do-while\n",
    "\n",
    "#### Waktu percobaan : 40 menit\n",
    "\n",
    "1. Perhatikan flowchart perulangan for dibawah ini!\n",
    "\n",
    "    <p align=\"left\">\n",
    "    <img width=\"197\" height=\"259\" src=\"images/flowchartFaktorial.png\">\n",
    "    </p>\n",
    "    \n",
    "\n",
    "> Flowchart diatas digunakan untuk menghitung nilai faktorial, selanjutnya kita akan membuat programnya berdasarkan\n",
    "> flowchart di atas!\n",
    "\n",
    "2. Tambahkan library Scanner, deklarasi Scanner, dan buat variabel angka untuk menampung data yang diinput melalui keyboard\n",
    "\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 32,
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "// Ketik kode program di bawah sini\n",
    "import java.util.Scanner;\n",
    "Scanner input = new Scanner(System.in);"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "perintah import digunakan agar kita dapat menggunakan library Scanner\n",
    "deklarasi Scanner agar scanner dapat dikenali pada program"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 15,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program di bawah sini\n",
    "int angka, faktorial = 1;"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "inisialisasi variabel yang bertipe int dengan nama angka dan faktorial"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "4. Tambahkan struktur perulangan untuk menghitung hasil faktorial sebuah nilai yang diinputkan menggunakan for\n",
    "    \n",
    "    <p align=\"left\">\n",
    "    <img width=\"696\" height=\"124\" src=\"images/for.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 26,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program di atas di bawah sini\n",
    "System.out.println(\"=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====\");\n",
    "System.out.print(\"Masukkan Bilangan : \");\n",
    "angka = input.nextInt();\n",
    "for (int i = 1; i <= angka; i++)\n",
    "    faktorial *= i;\n",
    "System.out.print(\"Nilai faktorial bilangan tersebut adalah \" + faktorial);"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "perulangan for.\n",
    "ekspresi pertama menunjukkan inisialisasi int bernama i dengan nilai 1.\n",
    "ekspresi kedua menunjukkan boolean yang akan mengecek kondisi sebelum mengeksekusi program perulangan.\n",
    "ekspresi ketiga menunjukkan perubahan nilai, yaitu increment pada variabel i yang akan dilakukan tepat setelah program selesai dijalankan.\n",
    "perintah dalam program perulangan akan dijalankan jika boolean pada ekspresi kedua menghasilkan true.\n",
    "perintah faktorial *= i berarti nilai dari faktorial = faktorial * i.\n",
    "setelah itu, hasil perkalian akan dicetak dengan perintah sout(System.out).\n"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "5. Ubah nilai variabel faktorial seperti semula. Kemudian gunakan struktur perulangan while untuk menghitung hasil faktorial sebuah nilai yang diinputkan\n",
    "    \n",
    "    <p align=\"left\">\n",
    "    <img width=\"696\" height=\"124\" src=\"images/while.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 35,
   "metadata": {
    "scrolled": true
   },
   "outputs": [],
   "source": [
    "// Ketik kode program di atas di bawah sini\n",
    "faktorial = 1;\n",
    "System.out.println(\"=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====\");\n",
    "System.out.print(\"Masukkan Bilangan : \");\n",
    "angka = input.nextInt();\n",
    "int i = 1;\n",
    "while (i <= angka) {\n",
    "    faktorial *= i;\n",
    "    i++;\n",
    "}\n",
    "System.out.println(\"Nilai faktorial bilangan tersebut adalah \" + faktorial);"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "inisialisasi faktorial perlu dilakukan untuk mengatur ulang nilai dari variabel faktorial. hal ini perlu dilakukan karena pada sel sebelumnya, kita telah menggunakan variabel faktorial. maka dari itu, inisialisasi ulang ini sangat perlu dilakukan untuk menghindari penumpukan nilai. inisialisasi i juga dilakukan kembali untuk mengatur ulang nilai dari variabel i. perulangan while. diikuti dengan ekspresi boolean. jika ekspresi ini bernilai true, maka program perulangan akan dijalankan hingga ekspresi ini bernilai false. program yang akan dijalankan adalah perintah faktorial = faktorial * i; dengan perintah increment pada variabel i, i++;. setelah itu, hasil dari perintah akan dicetak menggunakan perintah sout."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "6. Kembalikan lagi nilai variabel faktorial seperti semula. Gunakan struktur perulangan do-while untuk menghitung hasil faktorial sebuah nilai yang diinputkan\n",
    "    \n",
    "    <p align=\"left\">\n",
    "    <img width=\"696\" height=\"124\" src=\"images/dowhile.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "faktorial = 1;\n",
    "System.out.println(\"=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====\");\n",
    "System.out.print(\"Masukkan Bilangan : \");\n",
    "angka = input.nextInt();\n",
    "int a = 1;\n",
    "do {\n",
    "    faktorial *= i;\n",
    "    i++;\n",
    "} while (a <= angka);\n",
    "System.out.println(\"Nilai faktorial bilangan tersebut adalah \" + faktorial);\n"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "inisialisasi faktorial perlu dilakukan untuk mengatur ulang nilai dari variabel faktorial. hal ini perlu dilakukan karena pada sel sebelumnya, kita telah menggunakan variabel faktorial. maka dari itu, inisialisasi ulang ini sangat perlu dilakukan untuk menghindari penumpukan nilai. inisialisasi i juga dilakukan kembali untuk mengatur ulang nilai dari variabel i. perulangan do-while. berbeda dengan perulangan for dan while. perulangan do-while akan menjalankan program perulangan terlebih dahulu sebelum melakukan pengecekan pada ekspresi boolean pada yang ada disamping perintah {while(boolean)}. jadi, meskipun boolean yang kita masukkan bernilai false dari awal, program perulangan ini kaan menjalankan program setidaknya sekali sebelum program berhenti. "
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "##### Pertanyaan\n",
    "1. Pada program diatas, apakah kegunaan baris berikut?\n",
    "<p align=\"left\">\n",
    "    <img src=\"images/hitungFaktorial.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "untuk melakukan operasi faktorial. dengan menggunakan operasi ini, kita dapat menghitung nilai faktorial dari suatu bilangan yang telah kita masukkan."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "2. Modifikasi program diatas dibagian struktur pemilihannya sehingga hasilnya menjadi seperti di bawah ini:\n",
    "<p align=\"left\">\n",
    "    <img src=\"images/modifP1.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "import java.util.Scanner;\n",
    "Scanner sama = new Scanner(System.in);\n",
    "\n",
    "int faktorial = 1, angka;\n",
    "System.out.println(\"=====PROGRAM MENGHITUNG NILAI FAKTORIAL=====\");\n",
    "System.out.print(\"Masukkan Bilangan : \");\n",
    "angka = sama.nextInt();\n",
    "System.out.print(angka + \" Faktorial = \");\n",
    "\n",
    "for (int i = 1; i <= angka; i++) {\n",
    "    faktorial *= i;\n",
    "    if (i < angka) { \n",
    "        System.out.print(i + \" x \");\n",
    "    } else { \n",
    "        System.out.print(i);\n",
    "    }\n",
    "}\n",
    "System.out.println(\" = \" + faktorial);"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "pertama, saya cetak 5 faktorial dengan perintah pada baris kedelapan. kedua, saya menggunakan perulangan for untuk menyelesaikan operasi nilai faktorial. ketiga, saya menyisipkan perintah pemilihan if else ke dalam perintah perulangan dimana jika nilai i kurang dari nilai angka maka akan tercetak \"nilai i x\". selain itu, akan hanya tercetak nilai dari i. setelah itu, saya mencetak nilai total dari nilai faktorial dengan menggunakan sout pada baris terakhir."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "#### Percobaan 2 : Keluar dari perulangan menggunakan break\n",
    "\n",
    "#### Waktu percobaan : 40 menit"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "1. Buatlah perulangan dengan menggunakan for yang memanfaatkan keyword break\n",
    "<p align=\"left\">\n",
    "    <img width=\"696\" height=\"124\" src=\"images/for2.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 5,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program di atas di bawah sini\n",
    "import java.util.Scanner;\n",
    "Scanner input = new Scanner(System.in);\n",
    "\n",
    "int angka, total;\n",
    "System.out.println(\"===PROGRAM FOR LOOP DENGAN BREAK===\");\n",
    "for (total = 0; true;) {\n",
    "    System.out.print(\"Masukkan Bilangan : \");\n",
    "    angka = input.nextInt();\n",
    "    total += angka;\n",
    "    if (total > 50)\n",
    "        break;\n",
    "}\n",
    "System.out.println(\"Jumlah angka-angka yang telah dimasukkan : \" + total);"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "2. Buat perulangan yang sama dengan struktur perulangan while\n",
    "<p align=\"left\">\n",
    "    <img width=\"696\" height=\"124\" src=\"images/while2.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 53,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program di atas di bawah sini\n",
    "int angka, total;\n",
    "System.out.println(\"===PROGRAM WHILE LOOP DENGAN BREAK===\");\n",
    "total = 0;\n",
    "while (true) {\n",
    "    System.out.print(\"Masukkan Bilangan  : \");\n",
    "    angka = input.nextInt();\n",
    "    total += angka;\n",
    "    if (total > 50)\n",
    "        break;\n",
    "}\n",
    "System.out.println(\"Jumlah angka-angka yang telah dimasukkan : \" + total);"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "3. Tuliskan perulangan diatas dalam struktur do-while\n",
    "    <p align=\"left\">\n",
    "    <img width=\"696\" height=\"124\" src=\"images/dowhile2.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 53,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program di atas di bawah sini\n",
    "System.out.println(\"===PROGRAM DO-WHILE LOOP DENGAN BREAK===\");\n",
    "total = 0;\n",
    "do {\n",
    "    System.out.print(\"Masukkan Bilangan : \");\n",
    "    angka = input.nextInt();\n",
    "    total += angka;\n",
    "    if (total > 50)\n",
    "        break;\n",
    "} while (true);\n",
    "System.out.println(\"Jumlah angka-angka yang telah dimasukkan : \" + total);"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "##### Pertanyaan\n",
    "1. Jelaskan fungsi kode program yang telah dibuat pada percobaan diatas!"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "// Ketik jawaban disini\n",
    "Membuat program untuk menjumlahkan hasil inputan dari user dan akan berhenti jika jumlah dari inputan lebih dari 50."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "2. Jelaskan fungsi kode berikut!\n",
    "    <p align=\"left\">\n",
    "    <img src=\"images/forPertanyaan2.jpg\" align=\"left\">\n",
    "    </p>\n"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "// Ketik jawaban disini\n",
    "pada ekspresi pertama, kita melakukan inisialisasi variabel total dengan nilai 0. pada ekspresi kedua, kita menetapkan true sebagai nilai boolean pada perintah perulangan. hal ini menyebabkan perintah perulangan akan dijalankan terus menerus hingga menghabiskan kapasitas memori atau bertemu dengan keyword break atau continue."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "#### Percobaan 3 : Keluar dari step perulangan menggunakan continue\n",
    "\n",
    "#### Waktu percobaan : 40 menit\n",
    "\n",
    "1. Buat program looping menggunakan struktur perulangan for seperti di bawah ini: \n",
    "<p align=\"left\">\n",
    "    <img src=\"images/forContinue.jpg\" align=\"left\">\n",
    "    </p>\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 61,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program di atas di bawah sini\n",
    "Scanner input = new Scanner(System.in);\n",
    "\n",
    "int angka, total, count;\n",
    "double avg;\n",
    "total = 0;\n",
    "count = 0;\n",
    "System.out.println(\"===PROGRAM FOR LOOP DENGAN CONTINUE===\");\n",
    "for (int i = 0; i < 5; i++) {\n",
    "    System.out.print(\"Masukkan Bilangan : \");\n",
    "    angka = input.nextInt();\n",
    "    if (angka >= 50)\n",
    "        continue;\n",
    "    total += angka;\n",
    "    count++;\n",
    "}\n",
    "System.out.println(\"Jumlah angka-angka yang kurang dari 50 : \" + total);\n",
    "avg = (double) total / count;\n",
    "System.out.println(\"Rata-rata angka yang kurang dari 50 : \" + avg);\n"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "5. Jalankan program. Amati apa yang terjadi!"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "##### Pertanyaan\n",
    "1. Jelaskan Perbedaan dari percobaan 2 dan percobaan 3"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "// Ketik jawaban disini\n",
    "1. nilai boolean. pada percobaan 2, nilai boolean adalah true dan itu akan menyebabkan perintah perulangan akan dijalankan terus menerus. sementara pada percobaan 3, nilai boolean sudah ditentukan, yaitu maksimal akan dijalankan 5 kali.\n",
    "2. keyword. pada percobaan 2, nilai boolean pada keyword break adalah jika total melebihi angka 50, maka program perulangan akan diberhentikan. sedangkan pada percobaan 3, nilai boolean pada keyword continue adalah jika nilai yang kita masukkan melebihi 50, maka akan diabaikan dan program akan dilanjutkan ke perulangan selanjutnya.\n",
    "3. adanya variabel avg. pada percobaan 2, tidak ada perhitungan rata-rata. sedangkanpada percobaan 3, terdapat perhitungan rata-rata pada variabel double bernama avg. "
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "2. Jelaskan apa fungsi perintah kode program dibawah ini?\n",
    "<p align=\"left\">\n",
    "    <img width=\"352\" height=\"79\" src=\"images/continuePertanyaan.jpg\" align=\"left\">\n",
    "    </p>"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "// Ketik jawaban disini\n",
    "jika nilai yang kita inputkan lebih dari atau sama dengan angka 50, maka perintah continue akan dijalankan dan program akan mengabaikan program di bawah perintah continue. sedangkan jika nilai yang kita masukkan kurang dari nilai 50, maka perintah continue akan diabaikan dan perintah di bawah continue akan dijalankan."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "### Tugas\n",
    "\n",
    "#### Waktu pengerjaan Tugas: 140 menit\n",
    "\n",
    "1. Buatlah program yang meminta masukan user sebuah bilangan bulat N (N > 0). Program kemudian menampilkan penjumlahan N bilangan genap positif pertama (bilangan genap ≥ 0).\n",
    "Contoh: \n",
    "    •\tJika user memasukkan N = 10, program akan menghitung banyaknya jumlah bilangan positive di dalam range bilangan 1-10   kemudian menampilkan penjumlahan bilangan positive bilangan bilangan diantara 1-10 yaitu : \n",
    "        0 + 2 + 4 + 6 + 10 = 30. \n",
    "        Setelah itu program akan menampilkan rata-rata dari bilangan positive yang telah dijumlahkan tadi.\n",
    "    •\tContoh output program dan flowchart\n",
    "<br/><img width=\"303\" height=\"529\" src=\"images/hasilTugasFc.jpg\" align=\"left\"><br/>\n",
    "  \n",
    "\n",
    "<br/><img width=\"303\" height=\"529\" src=\"images/fcTugasJS7.png\" align=\"left\">\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 23,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program disini\n",
    "import java.util.Scanner;\n",
    "Scanner let = new Scanner(System.in);\n",
    "\n",
    "int bil, jmlBilGenap, totalGenap = 0;\n",
    "double avg;\n",
    "\n",
    "System.out.print(\"Masukkan Angka : \");\n",
    "bil = let.nextInt();\n",
    "\n",
    "if (bil > 0) {\n",
    "    jmlBilGenap = bil / 2;\n",
    "    System.out.printf(\"\\nBanyaknnya bilangan genap dari 1 sampai %d adalah %d\", bil, jmlBilGenap);\n",
    "    System.out.print(\"\\nAngka genap dalam range tersebut adalah, \");\n",
    "\n",
    "    for (int i = 1; i <= bil; i++) {\n",
    "        if (i % 2 != 0)\n",
    "            continue;\n",
    "        else {\n",
    "            if (i < bil)\n",
    "                System.out.print(i + \", \");\n",
    "            else {\n",
    "                System.out.print(i);\n",
    "            }\n",
    "            totalGenap += i;\n",
    "        }\n",
    "    }\n",
    "    avg = totalGenap / jmlBilGenap;\n",
    "    System.out.printf(\"\\nHasil penjumlahan bilangan genap dari 1 sampai %d adalah %d\", bil, totalGenap);\n",
    "    System.out.printf(\"\\nRata-rata bilangan genap dari 1 sampai %d adalah %.1f\", bil, avg);\n",
    "} else {\n",
    "    System.out.println(\"Angka yang Anda masukkan bukanlah bilangan bulat!\");\n",
    "}"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "pertama saya minta input dari user dengan perintah sout. kemudian, jika inputan kurang dari atau sama dengan 0, maka akan tercetak perintah pada else. jika inputan lebih dari 0, maka akan jalan perintah pada if. perintah pada if. membagi bilangan input dengan 2 akan memberikan kita informasi tentang berapa jumlah bilangan genap dalam range 1 sampai bilangan yang dimasukkan. perintah perulangan. jika i dimodulus 2 tidak sama dengan 0, maka bilangan tersebut adalah bilangan ganjil dan keyword continue akan dijalankan. sebaliknya, perintah if level 2 akan mencetak i yang termasuk bilangan genap. menghitung rata-rata antara total bilangan genap yang ada dengan banyaknya bilangan genap."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "2. Buatlah program untuk menampilkan angka 1 hingga angka masukan pengguna secara berurutan dan melompati angka kelipatan 5. Seperti tampilan di bawah ini\n",
    "<p align=\"left\">\n",
    "<img width=\"184\" height=\"328\" src=\"images/tugas1.jpg\" align=\"left\">\n",
    "</p>"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program disini\n",
    "Scanner ulang = new Scanner(System.in);\n",
    "\n",
    "int angka;\n",
    "System.out.print(\"Masukkan angka : \");\n",
    "angka = ulang.nextInt();\n",
    "\n",
    "int i = 0;\n",
    "while (i <= angka) {\n",
    "    i++;\n",
    "    if (i % 5 == 0)\n",
    "        continue;\n",
    "    System.out.println(i);\n",
    "}"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "meminta input dari user kemudian menyimpannya pada variabel angka. menginisialisasi variabel i dengan nilai 0. kemudian menetapkan boolean untuk perintah while. saya menetapkan nilai 0 karena saya aakan melakukan increment pada awal perintah perulangan, jadi agar nilainya 1, saya inisialisasi menjadi 0 :). jika i dimodulus dengan 5 menghasilkan 0, maka perintah continue akan dijalankan. tidak lupa untuk mencetak nilai i JIKA tidak memenuhi if."
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "3. Buatlah sebuah program yang menampilkan deret bilangan fibonacci sebagai berikut. Dimana bilangan yang terletak di sebelah kanan adalah hasil penjumlahan dari 2 bilangan sebelumnya\n",
    " <p align=\"left\">\n",
    "    <img width=\"451\" height=\"226\" src=\"images/fibo.png\" align=\"left\">\n",
    "    </p>\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "// Ketik kode program disini\n",
    "import java.util.Scanner;\n",
    "Scanner kan = new Scanner(System.in);\n",
    "\n",
    "System.out.print(\"Masukkan iterasi : \");\n",
    "int iter = kan.nextInt();\n",
    "int a = 0, i = 1, u, o = 1;\n",
    "while (o <= iter) {\n",
    "    System.out.printf(\"Sum of : %d + %d = \", a, i);\n",
    "    u = a + i;\n",
    "    System.out.println(u);\n",
    "    a = i;\n",
    "    i = u;\n",
    "    o++;\n",
    "}"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "minta input dengan perintah sout. menginisialisasi beberapa variabel int yang nantinya akan digunakan. variabel a adalah nilai fibonacci pertama = 0. variabel i adalah angka fibonacci yang kedua = 1. variabel u adalah nilai ketiga fibonacci = a + i. setelah di cetak, kita menggeser kedudukan dari tiap variabel. variabel a ke nilai kedua fibonacci = 1, var i ke nilai ketiga fibonacci = 1, dan nilai u akan menjadi nilai keempat fibonacci = a + i. o adalah variabel counter yang berfungsi sebagai pembatas jumlah perulangan."
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Java",
   "language": "java",
   "name": "java"
  },
  "language_info": {
   "codemirror_mode": "java",
   "file_extension": ".jshell",
   "mimetype": "text/x-java-source",
   "name": "Java",
   "pygments_lexer": "java",
   "version": "17+35-LTS-2724"
  },
  "nteract": {
   "version": "nteract-on-jupyter@2.1.3"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 1
}
