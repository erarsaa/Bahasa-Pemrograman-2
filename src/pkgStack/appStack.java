package pkgStack;
import java.util.Scanner;
public class appStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cStack myStack = new cStack();
        int pilih=0;
        do{
            System.out.println("\nMENU STACK");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan Nama Barang = ");
                    String nm = sc.next();
                    cItem t = new cItem(nm);
                    myStack.push(t);
                    break;
                case 2:
                    t = myStack.pop();
                    if(t==null){
                        System.out.println("Tidak ada data!");
                    }
                    else{
                        System.out.println(t.getNama()+" keluar...");
                    }
                    break;
                case 3:
                    myStack.print();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
            }
        }while(pilih!=4);
    }
}