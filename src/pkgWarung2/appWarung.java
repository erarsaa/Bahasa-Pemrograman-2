/*
OOP --> class !!!
1. kalimat proses : Budi membeli sate.
2. class : pembeli, makanan.
3. lengkapi isi setiap class: data dan method (berkaitan).
4. menu program di main.
 */
package pkgWarung2;
import java.util.Scanner;
class cPembeli{
    //data
    private String nama;
    private String alamat;
    //method
    cPembeli(String n, String a){
        nama=n; alamat=a;
        System.out.println("Pembeli "+nama+" dibuat...");
    }
    public void setNama(String n){
        nama=n;
    }
    public void setAlamat(String a){
        alamat=a;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String ToString(){
        return nama+" ["+alamat+"] ";
    }
}

class cMakanan{
    //data
    private String namaMakanan;
    private int hargaMakanan;
    //method
    cMakanan(String n, int h){
        namaMakanan=n; hargaMakanan=h; 
        System.out.println("Menu "+namaMakanan+" dibuat...");
    }
    public void setNamaMakanan(String n){
        namaMakanan=n;
    }
    public void setHargaMakanan(int h){
        hargaMakanan=h;
    }
    public String getNamaMakanan(){
        return namaMakanan;
    }
    public int getHargaMakanan(){
        return hargaMakanan;
    }
    public String ToString(){
        return namaMakanan+" ["+hargaMakanan+"]";
    }
}

public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cMakanan mkn = new cMakanan("Sate",15000);
        cPembeli pb = new cPembeli("Budi", "Rungkut");
        int pilih=0,pilih2;
        do{
            System.out.println("\nWARUNG KITA");
            System.out.println("1.Makanan");
            System.out.println("2.Pembeli");
            System.out.println("3.Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1://pengelolaan makanan
                    //sub menu makanan
                    pilih2=0;
                    do{
                        System.out.println("  Makanan");
                        System.out.println("  1.Buat data ");
                        System.out.println("  2.Lihat data");
                        System.out.println("  3.Ubah data ");
                        System.out.println("  4.Kembali");
                        System.out.print("  Pilih = ");
                        pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.print("Nama Makanan= ");
                                String n = sc.next();
                                System.out.print("Harga = ");
                                int h = sc.nextInt();
                                mkn = new cMakanan(n,h);
                                break;
                            case 2:
                                String t = mkn.ToString();
                                System.out.println("Menu : "+t);
                                break;
                            case 3:
                                System.out.print("Harga Baru = ");
                                int hb = sc.nextInt();
                                mkn.setHargaMakanan(hb);
                                break;
                            case 4:
                                System.out.println("Ke Menu Utama..");
                                break;
                        }
                    }while(pilih2!=4);
                    break;
                case 2:
                    //sub menu pembeli
                    pilih2=0;
                    do{
                        System.out.println("  Pembeli");
                        System.out.println("  1.Buat data");
                        System.out.println("  2.Lihat data");
                        System.out.println("  3.Ubah data");
                        System.out.println("  4.Kembali");
                        System.out.print("  Pilih = ");
                        pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.print("Nama Pembeli = ");
                                String nm = sc.next();
                                System.out.print("Alamat       = ");
                                String al = sc.next();
                                pb = new cPembeli(nm,al);
                                break;
                            case 2:
                                String p = pb.ToString();
                                System.out.println("Pembeli : "+p);
                                break;
                            case 3:
                                System.out.print("Alamat Baru = ");
                                String ab = sc.next();
                                pb.setAlamat(ab);
                                break;
                            case 4:
                                System.out.println("Ke Menu Utama");
                                break;
                        }
                    }while(pilih2!=4);
                    break;
                case 3:
                    System.out.println("Terima Kasih..");
                    break;
            }
        }while(pilih!=3);
    }
}