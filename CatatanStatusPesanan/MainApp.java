package CatatanStatusPesanan;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        OrderList daftarPesanan = new OrderList();
        Scanner scanner = new Scanner(System.in);

        // Tambah beberapa pesanan awal
        daftarPesanan.tambahPesanan(new Order(101, "Andi"));
        daftarPesanan.tambahPesanan(new Order(102, "Budi"));
        daftarPesanan.tambahPesanan(new Order(103, "Citra"));

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Lihat Semua Pesanan");
            System.out.println("2. Ubah Status Pesanan");
            System.out.println("3. Tambah Pesanan Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // mengonsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Daftar Pesanan ===");
                    daftarPesanan.tampilkanPesanan();
                    break;
                case 2:
                    System.out.print("Masukkan ID pesanan yang ingin diupdate: ");
                    int idUpdate = scanner.nextInt();
                    daftarPesanan.ubahStatus(idUpdate);
                    break;
                case 3:
                    System.out.print("Masukkan ID pesanan baru: ");
                    int idBaru = scanner.nextInt();
                    scanner.nextLine(); // konsumsi newline
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    daftarPesanan.tambahPesanan(new Order(idBaru, nama));
                    System.out.println("Pesanan berhasil ditambahkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
