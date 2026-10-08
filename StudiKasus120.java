import java.util.Scanner;

public class StudiKasus120 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon = 0;
        int totalBayar;
        int kembalian;
        int kurang;

        System.out.println("Masukkan Jumlah Cup");
        jumlahCup = input.nextInt();

        System.out.println("Masukkan uang bayar");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga       : Rp " + totalHarga);
        System.out.println("Diskon            : Rp " + diskon);
        System.out.println("Total bayar       : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian         : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}