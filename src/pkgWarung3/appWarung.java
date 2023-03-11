package pkgWarung3;
//CLASS CONTAINER
//Budi membeli sate dan soto
//class: pembeli, makanan, transaksi(nota/kwitansi)

//Budi membeli sate dan es jeruk
//class: minuman (es jeruk) --> nama minuman, harga
//variabel/data di dlm class makanan itu "sama dgn" class minuman
//buat class baru yg bisa meng-cover kedua class tsb --> class menu

import java.util.Scanner;
public class appWarung { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih=0;
        cPembeli pbl = new cPembeli();
        cMakanan menu[] = new cMakanan[5]; //untuk daftar menu warung
        menu[0]=new cMakanan("Sate",15000);
        menu[1]=new cMakanan("Gule",20000);
        menu[2]=new cMakanan("Soto",12000);
        menu[3]=new cMakanan("Bakso",10000);
        menu[4]=new cMakanan("Pecel",8000);
        
        do{
            System.out.println("\nAPP WARUNG");
            System.out.println("1.Pembeli");
            System.out.println("2.Makanan");
            System.out.println("3.Transaksi");
            System.out.println("4.Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    //sub menu pembeli
                    System.out.print("\n  Nama Pembeli = ");
                    String nm = sc.next();
                    pbl.setNama(nm);
                    System.out.println("  Isi pembeli sukses..");
                    break;
                case 2:
                    //sub menu makanan
                    System.out.println("\n  Daftar Menu");
                    for (int i = 0; i < menu.length; i++) {
                        System.out.println("  "+(i+1)+"."+menu[i].ToString());
                    }
                    break;
                case 3:
                    //sub menu transaksi
                    cTransaksi beli = new cTransaksi();
                    int pilih2=0;
                    do{
                        System.out.println("\n  Menu Transaksi");
                        System.out.println("  1.Isi pembeli");
                        System.out.println("  2.Tambah makanan");
                        System.out.println("  3.Lihat makanan");
                        System.out.println("  4.Hapus makanan");
                        System.out.println("  5.Selesai");
                        System.out.print("  Pilih = ");
                        pilih2 = sc.nextInt();
                        switch(pilih2){
                            case 1:
                                beli.isiPembeli(pbl);
                                break;
                            case 2:
                                System.out.print("\n  Nama Makanan = ");
                                String n = sc.next();
                                boolean ada=false;
                                for (int i = 0; i < menu.length; i++) {
                                    if(n.equalsIgnoreCase(menu[i].getNama())){
                                        ada=true;
                                        beli.tambahMakanan(menu[i]);
                                        break;
                                    }
                                }
                                if(ada==false){
                                    System.out.println("  Menu tidak ada!");
                                }
                                break;
                            case 3:
                                beli.lihatMakanan();
                                System.out.println("");
                                break;
                            case 4:
                                System.out.print("\n  Makanan dihapus = ");
                                String h = sc.next();
                                beli.hapusMakanan(h);
                                break;
                            case 5:
                                System.out.println("  Kembali ke menu utama");
                                break;
                        }
                    }while(pilih2!=5);
                    break;
                case 4:
                    System.out.println("Terima Kasih..");
                    break;
            }
        }while(pilih!=4);
    }
}
