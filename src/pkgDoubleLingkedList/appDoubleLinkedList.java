package pkgDoubleLingkedList;
import java.util.Scanner;
public class appDoubleLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cNode n;
        cDoubleLinkedList dll = new cDoubleLinkedList();
        int pilih=0;
        do{
            System.out.println("\nDOUBLE LINKED LIST");
            System.out.println("1.Add Node");
            System.out.println("2.Delete Node");
            System.out.println("3.Print Linked List");
            System.out.println("4.Exit");
                System.out.print("Choice = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Nama = ");
                    String nm=sc.next();
                    n = new cNode(nm);
                    dll.addFront(n);
                    break;
                case 2:
                    dll.delFront();
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    break;
            }
        }while(pilih!=4);
    }
}
