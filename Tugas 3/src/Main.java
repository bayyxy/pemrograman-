import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = input.nextInt();

        String status;
        if (nilai >= 60) {
            status = "Lulus";
        }
        else if (nilai < 0) {
            status = "nilai tidak bisa kurang dari 0";

        } else {
            status = "Tidak Lulus";
        }

        System.out.println("\n=== Hasil Kelulusan ===");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Status: " + status);

        input.close();
    }
}
// bentuk formal
//{| nama mahasiswa ^ 0 ≤ nilai ≤ 100 |}
//   c : input(nama, nilai);
//       if (nilai ≥ 60) then status := "Lulus"
//       else status := "Tidak Lulus";
//       output(nama, status);
//{| (status = "Lulus" = nilai ≥ 60) ∧ (status = "Tidak Lulus" = nilai < 60) |}
