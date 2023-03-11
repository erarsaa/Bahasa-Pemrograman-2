package pkgLinkedList;
import java.util.Scanner;
//kalo gui pake option pin
public class appLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cNode n;
        cLinkedList LL = new cLinkedList(null);
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
                case 1://tambah
                    System.out.print("Masukkan Nama = ");
                    String nm = sc.next();
                    n = new cNode(nm);
                    LL.addNote(n);
                    break;
                case 2://hapus
                    LL.delNode();
                    break;
                case 3://cetak
                    LL.print();
                    break;
                case 4:
                    System.out.println("Terima Kasih...");
                    break;
            }
        }while(pilih!=4);
    }
}
