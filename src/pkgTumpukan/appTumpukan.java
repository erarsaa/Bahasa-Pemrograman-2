package pkgTumpukan;
import java.util.Scanner;
public class appTumpukan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cTumpukan stack = new cTumpukan();
        int pilih = 0;
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
                    String n = sc.next();
                    cElemen b = new cElemen(n);
                    stack.push(b);
                    break;
                case 2:
                    cElemen t = stack.pop();
                    if(t==null){
                        System.out.println("Kosong!");
                    }
                    else{
                        System.out.println(t.getNama()+" Keluar!");
                    }
                    break;
                case 3:
                    stack.print();
                    break;
                case 4:
                    System.out.println("Terima Kasih...");
                    break;
            }
        }while(pilih!=4);
    }
}
