class MahasiswaBerprestasi14 {
    Mahasiswa14[] listMhs;
    int jumMhs;

    MahasiswaBerprestasi14(int n) {
        listMhs = new Mahasiswa14[n];
        jumMhs = 0;
    }

    void tambah(Mahasiswa14 m) {
        listMhs[jumMhs] = m;
        jumMhs++;
    }

    void tampilData() {
        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println((i+1) + ". " + listMhs[i].nama + " - IPK: " + listMhs[i].ipk);
        }
    }

    // ✅ Binary Search
    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // ✅ WAJIB ADA (biar tidak error)
    void tampilPosisi(double cari, int posisi) {
        if (posisi != -1) {
            System.out.println("Data ditemukan di indeks: " + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    // ✅ WAJIB ADA (biar tidak error)
    void tampilDataSearch(double cari, int posisi) {
        if (posisi != -1) {
            System.out.println("Nama: " + listMhs[posisi].nama);
            System.out.println("IPK : " + listMhs[posisi].ipk);
        }
    }
}