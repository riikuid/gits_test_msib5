# Problem Solving Test - GITS Internship MSIB Batch 5

Nama  : Fahmi Wahyu Alifian </br>
Role  : Software Engineer - Mobile Developer </br>

<h2>1. A000124 of Sloane’s OEIS (Score: 20)</h2></br>
Buatlah sebuah program dengan output sebagai berikut. Input bisa dinamis yang menghasilkan output yang berbeda-beda sesuai input yang dimasukan. Gunakan rumus A000124 of Sloane’s OEIS. </br>
</br>
Contoh: 
</br>- Input 7
</br>- Output : 1-2-4-7-11-16-22
</br>
</br>Soal: 
</br>Buat fungsi untuk menyelesaikan rumus A000124 of Sloane’s OEIS!
</br>
</br>Screenshot Output: </br>
![image](https://github.com/riikuid/gits_test_msib5/assets/80555853/c2cc555f-72e5-4e23-9ddd-8340dea3191e)
</br>



<h2>2. Dense Ranking (Score: 30)</h2>
</br>
GITS sedang bermain permainan arcade, dan dalam setiap permainan GITS ingin naik ke peringkat tertinggi dan juga ingin mengetahui setiap peringkat di setiap permainan. Dalam permainan ini menggunakan skema Dense Ranking​ dan memiliki aturan sebagai berikut:
</br>- Peringkat pertama dapat diraih oleh pemain yang memiliki skor tertinggi
</br>- Pemain yang memiliki skor yang sama memiliki peringkat yang sama.
</br>Contoh :
</br>
</br>- Empat pemain memiliki skor tertinggi sebagai berikut 100, 80, 80, dan 70, maka masing-masing pemain itu memiliki rangking 1,2,2 dan 3. Jika GITS memiliki skor 60, 70, 100 setelah pertandingan maka rangking yang didapatkan adalah 4, 3 dan 1.
</br>
</br>Sampel Input :
</br>
</br>7
</br>
</br>100 100 50 40 40 20 10 
</br>
</br>4
</br>
</br>5 25 50 120
</br>
</br>Sampel Output :
</br>
</br>6 4 2 1
</br>
</br>Keterangan :
</br>
</br>- 7​ adalah bentuk bilangan bulat, angka yang menunjukkan pada jumlah pemain yang ikut serta.
</br>
</br>- 100 100 50 40 40 20 10 ​ adalah daftar skor yang diurutkan dari nilai terbesar ke nilai terkecil 
</br>
</br>(dalam bentuk array integer).
</br>
</br>- 4 ​adalah jumlah permainan yang diikuti oleh GITS, 5 25 50 120 ​adalah skor yang didapatkan oleh GITS.
</br>
</br>Soal:
</br>Buat fungsi yang digunakan untuk menyelesaikan permasalahan Dense Ranking!
</br>Screenshot Output: </br>
![image](https://github.com/riikuid/gits_test_msib5/assets/80555853/80766490-4f18-40c4-9782-6f7a20f2d7e9)
</br>

<h2>3. Balanced Bracket (Score: 50)</h2>
</br>Sampe 1:
</br>Input: { [ ( ) ] }
</br>Output: YES
</br>Penjelasan: Setiap braket seimbang, antara braket buka dan braket tutup.
</br>opening : { }
</br>opening : [ ]
</br>opening : ( }
</br>
</br>Sampel 2:
</br>Input: { [ ( ] ) }
</br>Output: NO
</br>Penjelasan: String { [ ( ] ) } tidak seimbang untuk karakter yang diapit oleh { dan } yaitu [ ( ] ).
</br>
</br>Sampel 3:
</br>Input: { ( ( [ ] ) [ ] ) [ ] }
</br>Output: YES
</br>Penjelasan: Setiap braket seimbang, antara braket buka dan braket tutup, meskipun struktur braket tidak beraturan.
</br>
</br>Aturan:
</br>1. Tanda braket yang diperbolehkan sebagai berikut: ( , ) , { , } , atau [ , ]. 
</br>2. Periksa tanda kurung yang memiliki kecocokan antara braket buka dan braket tutup dengan mengembalikan nilai string YES atau NO.
</br>
</br>Soal:
</br>1. Buat fungsi untuk menemukan Balanced Bracket dengan kompleksitas paling rendah!
</br></br>2. Berapa ukuran kompleksitas kodinganmu? (cantumkan di README Repo)
</br>3. Jelaskan detail kompleksitas codingan Balanced Bracket Anda. (cantumkan di README Repo)

</br>Jawab:
</br>2. Ukuran kompleksitas ruang dan waktu dari program tersebut adalah O(n) yang berarti semakin banyak atau panjang inputnya, maka waktu eksekusi akan meningkat secara linear mengikuti banyaknya input
</br>3. Pada kodingan tersebut menggunakan stack untuk mengecek keseimbangan tanda kurung dalam string yang dimasukan. Setiap karakter dari string diperiksa satu per satu. Jika karakter adalah tanda kurung buka, maka tanda kurung itu akan dimasukkan ke dalam stack. Jika karakter adalah tanda kurung tutup, maka akan diperiksa apakah stack kosong atau tanda kurung buka teratas dalam stack sesuai dengan tanda kurung tutup. Jika sesuai, maka tanda kurung buka akan dihapus dari stack, jika tidak sesuai, maka fungsi akan mengembalikan "NO" karena tanda kurung tidak seimbang.
