import java.util.Scanner;
public class ekspedisi {
    public static void main(String[] args) {

        var clearScreen = ("\033[H\033[2J") ;
        System.out.println(clearScreen);
        
        // TODO: transaksi

        String nPengirim, aPengirim, nPenerima, aPenerima, kecamatan, kota, provinsi, nHandphonePengirim, nHandphonePenerima, kPOs, tKirim;
        
        Scanner transaksi = new Scanner(System.in);

        while (true) {
            // input data pengirim
            System.out.print("Nama Pengirim : ");
            nPengirim = transaksi.nextLine();
            System.out.print("Alamat Pengirim : ");
            aPengirim = transaksi.nextLine();
            System.out.print("No. Handphone : ");
            nHandphonePengirim = transaksi.nextLine();
        
            System.out.println(clearScreen);
        
            // input data penerima
            System.out.print("Nama Penerima : ");
            nPenerima = transaksi.nextLine();
            System.out.print("Alamat Penerima : ");
            aPenerima = transaksi.nextLine();
            System.out.print("Kecamatan : ");
            kecamatan = transaksi.nextLine();
            System.out.print("Kota/Kabupaten : ");
            kota = transaksi.nextLine();
            System.out.print("Provinsi : ");
            provinsi = transaksi.nextLine();
            System.out.print("Kode Pos : ");
            kPOs = transaksi.nextLine();
            System.out.print("No. Handphone : ");
            nHandphonePenerima = transaksi.nextLine();
            System.out.println("Tanggal Kirim : ");
            tKirim = transaksi.nextLine();
        
            System.out.print(clearScreen);
        
            System.out.print("apakah anda ingin memasukan data lain (y/n) : ");
            String answer = transaksi.next();
            if (answer.equals("n")) {
                break;
            }
            transaksi.nextLine();
        }
        
    }
}