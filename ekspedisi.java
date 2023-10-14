import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class ekspedisi {
    public static void main(String[] args) {

        var clearScreen = ("\033[H\033[2J") ;
        System.out.println(clearScreen);
        
        // TODO: transaksi

        String nPengirim;
        String aPengirim;
        long nHandphonePengirim;
        String nPenerima;
        String aPenerima;
        String kecamatan;
        String kota;
        String provinsi;
        int kPOs;
        long nHandphonePenerima;
        
        Scanner transaksi = new Scanner(System.in);
        Calendar kalender = Calendar.getInstance();
        Date tanggal = kalender.getTime();

    // input data pengirim
        System.out.print("Nama Pengirim : ");
        nPengirim = transaksi.nextLine();
        System.out.print("Alamat Pengirim : ");
        aPengirim = transaksi.nextLine();
        System.out.print("No. Handphone : ");
        nHandphonePengirim = transaksi.nextLong();
        transaksi.nextLine();

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
        kPOs = transaksi.nextInt();
        System.out.print("No. Handphone : ");
        nHandphonePenerima = transaksi.nextLong();

        
        System.out.print(clearScreen);      
        
        System.out.println(tanggal);
        
    }
    
}