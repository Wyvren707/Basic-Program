import java.util.Scanner;

public class AppAritmatika {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        //Ngisi variable

        double phi = 3.14;
    
        Integer panjang, lebar, luas, keliling, r;

        //Ini progam luas persegi panjang!!!

        System.out.println("<- Program Menghitung Luas Persegi Panjang ->");
        System.out.println("---------------------------------------------");
        System.out.println("");

        //Yang ini buat input data!!!

        System.out.print("Masukkan Panjangnya = ");
        panjang=input.nextInt();

        System.out.print("Masukkan Lebarnya = ");
        lebar=input.nextInt();
        System.out.println("");

        System.out.println("+--------------------------------------------+");

        //Ini rumusnya!!!

        luas = panjang * lebar;
        System.out.println("Jadi luas persegi panjangnya adalah = "+luas);
        keliling = 2 * (panjang + lebar);
        System.out.println("Jadi keliling persegi panjangnya adalah = " + keliling);
        System.out.println("");

        //Ini program luas lingkaran!!!

        System.out.println("...............................................");
        System.out.println("");
        System.out.println("<- Program Menghitung Luas Lingkaran ->");
        System.out.println("...............................................");
        System.out.println("");

        //Ini buat input datanya!!!

        System.out.print("Masukkan nilai jari-jarinya = ");
        r=input.nextInt();

        //Ini rumusnya!!!

        luas = (int) (phi * r * r);
        System.out.println("Jadi luas lingkarannya adalah = "+luas);
        System.out.println("");
        System.out.println("--------------------------------");

    }
    
}
