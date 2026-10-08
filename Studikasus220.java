import java.util.Scanner;

public class Studikasus220 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenis;
        int dokumen;
        int juara;
        int statusPKM;
        int kurang;
        String hasil;

        System.out.print("Nama mahasiswa  : ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine();

        System.out.print("Jumlah dokumen  : ");
        dokumen = input.nextInt();

        System.out.print("Peringkat juara : ");
        juara = input.nextInt();

        System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
        statusPKM = input.nextInt();

        kurang = 4 - dokumen;

        if (jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    hasil = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    hasil = "Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                hasil = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            if (statusPKM == 1) {
                if (dokumen == 4) {
                    hasil = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    hasil = "Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                hasil = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }
        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            hasil = "Kegiatan lainnya tidak memperoleh dana penghargaan.";
        } else {
            hasil = "Jenis kegiatan tidak valid.";
        }

        System.out.println();
        System.out.println("Nama mahasiswa  : " + nama);
        System.out.println("Status : " + hasil);

    }
}