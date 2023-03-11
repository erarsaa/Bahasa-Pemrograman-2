package pkgLinkedList_2;
import java.util.Scanner;
public class appLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cBarang b1 = new cBarang("Sepatu",150000);
        cBarang b2 = new cBarang("Tas",100000);
        cBarang b3 = new cBarang("Sandal",50000);
        cLinkedList LL = new cLinkedList();
        int pilih=0;
        
        do{
            System.out.println("\nAplikasi Linked List");
            System.out.println("1.Tambah Belakang");
            System.out.println("2.Hapus Depan");
            System.out.println("3.Lihat Isi");
            System.out.println("4.Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("  1."+b1.getNama());
                    System.out.println("  2."+b2.getNama());
                    System.out.println("  3."+b3.getNama());
                    System.out.print("  Pilih = ");
                    int pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            cSimpul b = new cSimpul(b1);
                            LL.tambahBelakang(b);
                            break;
                        case 2:
                            b = new cSimpul(b2);
                            LL.tambahBelakang(b);
                            break;
                        case 3:
                            b = new cSimpul(b3);
                            LL.tambahBelakang(b);
                            break;
                    }
                    break;
                case 2:
                    LL.hapusDepan();
                    break;
                case 3:
                    LL.bacaLinkedList();
                    break;
                case 4:
                    System.out.println("Terima Kasih...");
                    break;
            }
        }while(pilih!=4);
    }
}
