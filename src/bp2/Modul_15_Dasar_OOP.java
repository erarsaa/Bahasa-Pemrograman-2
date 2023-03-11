package bp2;
public class Modul_15_Dasar_OOP {
    //PARADIGMA PROCEDURAL
    static String nama;
    static String npm;
    static double ipk;
    
    static void cetakJudul(){
        System.out.println("----------------------");
        System.out.println("PROGRAM DATA MAHASISWA");
        System.out.println("----------------------");
    }
    
    static void isiData(String nm, String np, double ip){
        nama = nm;
        npm  = np;
        ipk  = ip;
    }
    
    static void cetakData(){
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : " +nama);
        System.out.println("NPM  : " +npm);
        System.out.println("IPK  : " +ipk);
    }
    
    public static void main (String[] args) {
        cetakJudul();
        isiData("Ervina", "21082010118", 3.75);
        cetakData();
    }
}
