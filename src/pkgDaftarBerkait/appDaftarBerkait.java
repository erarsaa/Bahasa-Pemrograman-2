package pkgDaftarBerkait;
import java.util.Scanner;
public class appDaftarBerkait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cSimpul s1 = new cSimpul("Sepatu");
        cSimpul s2 = new cSimpul("Sandal");
        cSimpul s3 = new cSimpul("Tas");
        cDaftarBerkait db = new cDaftarBerkait(null);
        int pilih=0;
        do{
            System.out.println("\nMENU LINKED LIST");
            System.out.println("1. Tambah Simpul");
            System.out.println("2. Hapus Simpul");
            System.out.println("3. Cetak Linked List");
            System.out.println("4. Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("\nMasukkan Nama Barang = ");
                    String nm = sc.next();
                    cSimpul b = new cSimpul(nm);
                    db.tambahSimpul(b);
                    break;
                case 2:
                    System.out.println("");
                    db.hapusSimpul();
                    break;
                case 3:
                    System.out.println("");
                    db.cetak();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
            }
        }while(pilih!=4);
    }
}
