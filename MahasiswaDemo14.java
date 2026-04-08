import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();
        sc.close();

        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(n);

        // Input data (WAJIB urut ASC berdasarkan IPK)
        for (int i = 0; i < n; i++) {
            System.out.println("\nData mahasiswa ke-" + (i+1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa14(nama, ipk));
        }

        list.tampilData();

        System.out.println("\n=== Binary Search ===");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        int posisi = list.findBinarySearch(cari, 0, list.jumMhs - 1);

        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}