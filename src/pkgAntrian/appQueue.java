package pkgAntrian;
import java.util.Scanner;
public class appQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        cQueue q = new cQueue();
        do{
            System.out.println("\nPROGRAM ANTRIAN PEMBELIAN BARANG");
            System.out.println("1. Tambah Antrian "); //enqueue
            System.out.println("2. Proses Antrian "); //dequeue
            System.out.println("3. Lihat Antrian "); //print
            System.out.println("4. Keluar");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("\n--------------------------------");
                    System.out.println("         TAMBAH ANTRIAN         ");
                    System.out.println("--------------------------------");
                    System.out.print("Nama Barang = ");
                    String nm = sc.next();
                    cObject b = new cObject(nm);
                    q.enqueue(b);
                    break;
                case 2:
                    System.out.println("\n--------------------------------");
                    cObject t = q.dequeue();
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    System.out.println("Terima kasih...");
                    break;
            }
        }while(pilih!=4);
    }
}
