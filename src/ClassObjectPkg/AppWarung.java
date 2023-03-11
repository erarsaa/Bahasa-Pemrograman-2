/*
Konteks aplikasi utk Warung/Toko
1. Narasi/Kalimat proses yang bisa mewakili sistem: Budi membeli Sate di warung pak Amin
2. Identifikasi class: Budi, sate, warung (pak Amin)
   class pembeli, class makanan, class warung/pemilik
3. Melengkapi isi setiap class: data+methods
4. Buat programnya di class utama/aplikasi/main
*/
package ClassObjectPkg;
import java.util.Scanner;
//class provider
class pembeli{
    
}
class makanan{
    //data
    private String namaMakanan;
    private int hargaMakanan;
    //method2 standar
    //1.constructors --> inisialisasi data
    makanan(){ //deafult krn parameternya kosong
        System.out.println("Object makanan dibuat...");
    }
    makanan(String nm, int hg){
        namaMakanan = nm;
        hargaMakanan = hg;
        System.out.println("Object " +namaMakanan+" dibuat...");
    }
    //2.setter --> mengisi/menulis data ke variabel
    public void setNamaMakanan(String nm){
        namaMakanan = nm;
    }
    public void setHargaMakanan(int hg){
        hargaMakanan = hg;
    }
    //3.getter --> mengambil data dari variabel
    public String getNamaMakanan(){
        return namaMakanan;
    }
    public int getHarga(){
        return hargaMakanan;
    }
    //4.toString --> menghasilkan teks isi var2 class
    public String dataMakanan(){
        return namaMakanan+" ["+hargaMakanan+"]";
    }
    
}
class warung{
    
}
//class utama
public class AppWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        makanan mkn = new makanan("Sate Ayam",15000); //create objek
        int pilih=0;
        do{
            System.out.println("\nWarung BP2");
            System.out.println("1.Buat Makanan");
            System.out.println("2.Ubah Makanan");
            System.out.println("3.Lihat Makanan");
            System.out.println("4.Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("\nBUAT MAKANAN");
                    System.out.print("Nama Makanan = ");
                    String n = sc.next();
                    System.out.print("Harga        = ");
                    int h = sc.nextInt();
                    mkn = new makanan(n,h);
                    System.out.println("Object sukses");
                    break;
                case 2:
                     System.out.print("\nMasukkan Harga Baru = ");
                     int hb = sc.nextInt();
                     mkn.setHargaMakanan(hb);
                     System.out.println("Harga diubah");
                    break;
                case 3:
                    String m = mkn.dataMakanan();
                    System.out.println("\nMakanan : "+m);
                    break;
                case 4:
                    System.out.println("Selesai");
                    break;
            }
        }while(pilih!=4);
    }
}
