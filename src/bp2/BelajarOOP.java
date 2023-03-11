package bp2;
class MAHASISWA {
    static String nama;
    static String npm;
    static double ipk;
    
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
}

    public class BelajarOOP{
        static void cetakJudul(){
            System.out.println("----------------------");
            System.out.println("PROGRAM DATA MAHASISWA");
            System.out.println("----------------------");
        }
        public static void main (String[] args) {
            MAHASISWA mhs = new MAHASISWA();
            cetakJudul();
            mhs.isiData("Ervina", "21082010118", 3.75);
            mhs.cetakData();
        }
    }
