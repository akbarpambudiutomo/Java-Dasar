/**
 * 
 */
package LatihanProgramJava;

import java.util.*;

/**
 * @author
 *  Akbar Pambudi Utomo May 31, 2023 2:55:18 PM
 */

class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

public class CobaCrud {
	private static List<Mahasiswa> database = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak valid.");
                    break;
            }
        }

        System.out.println("Program selesai.");
        
    }
    
    private static void tambahData() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);
        database.add(mahasiswa);

        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }
    
    private static void tampilkanData() {
        if (database.isEmpty()) {
            System.out.println("Database kosong.");
        } else {
            System.out.println("=== DATA MAHASISWA ===");
            for (int i = 0; i < database.size(); i++) {
                Mahasiswa mahasiswa = database.get(i);
                System.out.println("NIM: " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println();
            }
        }
    }
    
    private static void ubahData() {
        System.out.print("Masukkan NIM mahasiswa yang akan diubah: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = cariMahasiswaByNIM(nim);
        if (mahasiswa != null) {
            System.out.print("Masukkan Nama baru: ");
            String namaBaru = scanner.nextLine();

            mahasiswa.setNama(namaBaru);
            System.out.println("Data mahasiswa berhasil diubah.");
        } else {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }

    private static void hapusData() {
        System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = cariMahasiswaByNIM(nim);
        if (mahasiswa != null) {
            database.remove(mahasiswa);
            System.out.println("Data mahasiswa berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }

    private static Mahasiswa cariMahasiswaByNIM(String nim) {
        for (Mahasiswa mahasiswa : database) {
            if (mahasiswa.getNim().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

}
