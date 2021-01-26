import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class jualBarang {
    public static void main(String []args){

        //Ngasih nilai awal buat objek setiap kelas
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat)
        DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        //Ngisi atau deklarasi variabel
        int jumlah = 0, i = 0;
        double total_bayar = 0;

        //Ngisi atau deklarasi arraynya
        int [] kode = new int[5];
        int qty [] = new int[5];
        int harga [] = new int[5];
        double [] sub_total = new double[5];
        double [] diskon = new double[5];
        String barang [] = new String[5];

        System.out.println("PROGRAM PENJUALAN BARANG");

        System.out.println("");

        System.out.print("Isi Jumlah Beli = ");
        jumlah = input.nextInt();
        System.out.print(" ");

        //Masuin elemen ke dalem array
        for (i=0; i<jumlah; i++){
            System.out.print("Isi Kode Barang Ke-"+(i+1)+" : ");
            kode[i]=input.nextInt();
            System.out.print("Masukkan qty Ke-"+(i+1)+" : ");
            qty[i] = input.nextInt();

            //Nentuin barang dari kode yang sudah dimasukin
            switch (kode[i]){
                case 1: barang[i] = "Topi ";
                        harga[i]  = 200000;
                        diskon[i] = 0.1;
                        break;
                case 2: barang[i] = "Jaket ";
                        harga[i]  = 500000;
                        diskon[i] = 0.05;
                        break;
                case 3: barang[i] = "Kaos ";
                        harga[i]  = 450000;
                        diskon[i] = 0;
                        break;
                case 4: barang[i] = "Jam Tangan ";
                        harga[i]  = 600000;
                        diskon[i] = 0.2;
                        break;
                case 5: barang[i] = "Celana ";
                        harga[i]  = 400000;
                        diskon[i] = 0.1;
                        break;
                default: System.out.println("Maaf Kode Barang Tidak Tersedia");
                    
            }
        }

        //Ngatur format numbernya
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator(',');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.println("No   Nama Barang         Harga   QTY   Diskon   Sub Total");

        //Nampilin semua elemen di dalam array
        for (i=0; i<jumlah; i++){
            sub_total[i] = ((qty[i]*harga[i])-(qty[i]*harga[i]*diskon[i]));
            total_bayar += sub_total[i];
            System.out.println(i+1+"   "+barang[i]+"  "+kursIndonesia.format(harga[i])+"   "+qty[i]+"   "+(int)(diskon[i]*100)+"%"+"   "+kursIndonesia.format(sub_total[i]));
        }
        System.out.println(" ");
        
        //Nampilkan total pembayaran
        System.out.println("Total Pembayaran = "+kursIndonesia.format(total_bayar));


    }
}
