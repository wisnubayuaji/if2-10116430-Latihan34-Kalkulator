/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class App {
    public static void main(String[] args) throws Exception {
        Kalkulator k = new Kalkulator();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        //in
        System.out.print("Masukan Angka ke-1 : ");
        double value1 = scn.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        double value2 = scn.nextDouble();
        
        //out
        System.out.println("Hasil Pertambahan : " +k.tambahBilangan());
        System.out.println("Hasil Pengurangan : " +k.kurangBilangan());
        System.out.println("Hasil Perkalian : " +k.kaliBilangan());
        System.out.println("Hasil Pembagian : " +k.bagiBilangan());
        System.out.println("Hasil Sisa : " +k.sisaBilangan());
    }
}
