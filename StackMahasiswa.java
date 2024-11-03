import java.util.Scanner;

public class StackMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran stack: ");
        int ukuranStack = sc.nextInt();
        sc.nextLine(); 
        String[] stackNama = new String[ukuranStack];
        int[] stackNilai = new int[ukuranStack];
        int top = -1; 
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push (Tambah Data)");
            System.out.println("2. Pop (Hapus Data)");
            System.out.println("3. Tampilkan Stack");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1: 
                    if (top == ukuranStack - 1) {
                        System.out.println("Stack sudah penuh!");
                    } else {
                        top++;
                        System.out.print("Masukkan nama mahasiswa: ");
                        stackNama[top] = sc.nextLine();
                        System.out.print("Masukkan nilai mahasiswa: ");
                        stackNilai[top] = sc.nextInt();
                        sc.nextLine(); 
                        System.out.println("Data mahasiswa ditambahkan ke stack.");
                    }
                    break;

                case 2: 
                    if (top == -1) {
                        System.out.println("Stack kosong!");
                    } else {
                        System.out.println("Data yang dihapus: " + stackNama[top] + " dengan nilai " + stackNilai[top]);
                        top--; 
                    }
                    break;

                case 3: 
                    if (top == -1) {
                        System.out.println("Stack kosong!");
                    } else {
                        System.out.println("Isi Stack:");
                        System.out.println("No \t Nama \t Nilai");
                        for (int i = top; i >= 0; i--) {
                            System.out.printf("%d \t %s \t %d%n", (i + 1), stackNama[i], stackNilai[i]);
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}