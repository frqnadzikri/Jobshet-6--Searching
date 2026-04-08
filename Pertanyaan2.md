1. Divide:
Di bagian
int mid = (left + right) / 2;

karena data dibagi jadi dua.

2. Conquer:
Di bagian rekursif
findBinarySearch(cari, left, mid - 1);
findBinarySearch(cari, mid + 1, right);
karena lanjut cari ke kiri atau kanan.

3. left, right, mid:
left = batas kiri
right = batas kanan
mid = titik tengah
4. Data tidak urut:
Tidak bisa, karena binary search harus data terurut.
5. Jika urut DESC:
Hasilnya tidak sesuai.
Perlu dibalik kondisinya:
if (listMhs[mid].ipk < cari)
6. Data tidak ditemukan:
Saat right < left, maka return -1.
7. Jumlah dari input:
int n = sc.nextInt();
MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(n);