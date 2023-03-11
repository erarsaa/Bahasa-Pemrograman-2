/*PEKAN 4
    Budi membeli sate di warung sederhana.
    Warung sederhana adalah milik pak Benu.
    class: warung, pemilik.
*/
package pkgWarung;
import java.util.Scanner;
public class appWarung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih=0,pilih2=0;
        cPemilik owner = new cPemilik("Benu","Rungkut");
        cWarung wrg = new cWarung("Sederhana","Gubeng");
        
        do{
            System.out.println("\nMENU UTAMA");
            System.out.println("1.Pemilik");
            System.out.println("2.Warung");
            System.out.println("3.Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    //submenu pemilik
                    do{
                        System.out.println("  Menu Pemilik");
                        System.out.println("  1.Pemilik baru");
                        System.out.println("  2.Lihat pemilik");
                        System.out.println("  3.Ubah pemilik");
                        System.out.println("  4.Buat warung");
                        System.out.println("  5.Selesai");
                        System.out.print("  Pilih = ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.print("  Nama   = ");
                                String n = sc.next();
                                System.out.print("  Alamat = ");
                                String a = sc.next();
                                owner = new cPemilik(n,a);
                                break;
                            case 2:
                                String t = owner.ToString();
                                System.out.println("  Pemilik "+t);
                                break;
                            case 3:
                                System.out.print("  Alamat Baru = ");
                                String al = sc.next();
                                owner.setAlamat(al);
                                break;
                            case 4:
                                int pilih3=0;
                                do{
                                    System.out.println("    Kelola Warung");
                                    System.out.println("    1.Buat warung");
                                    System.out.println("    2.Lihat Warung");
                                    System.out.println("    3.Hapus Warung");
                                    System.out.println("    4.Selesai");
                                    System.out.print("    Pilih = ");
                                    pilih3 = sc.nextInt();
                                    switch(pilih3){
                                        case 1:
                                            owner.tambahWarung(wrg);
                                            break;
                                        case 2:
                                            owner.lihatWarung();
                                            break;
                                        case 3:
                                            owner.hapusWarung();
                                            break;
                                        case 4:
                                            System.out.println("    Kembali..");
                                            break;
                                    }
                                }while(pilih3!=4);
                                break;
                            case 5:
                                System.out.println("  Kembali...");
                                break;
                        }
                    }while(pilih2!=5);
                    break;
                case 2:
                    //submenu warung
                    do{
                        System.out.println("  Menu Warung");
                        System.out.println("  1.Warung baru");
                        System.out.println("  2.Lihat warung");
                        System.out.println("  3.Ubah warung");
                        System.out.println("  4.Selesai");
                        System.out.print("  Pilih = ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1:
                                System.out.print("  Nama   = ");
                                String n = sc.next();
                                System.out.print("  Alamat = ");
                                String a = sc.next();
                                wrg = new cWarung(n,a);
                                break;
                            case 2:
                                String t = wrg.ToString();
                                System.out.println("  "+t);
                                break;
                            case 3:
                                System.out.print("  Alamat Baru = ");
                                String al = sc.next();
                                wrg.setAlamat(al);
                                break;
                            case 4:
                                System.out.println("  Kembali...");
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
