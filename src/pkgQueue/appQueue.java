package pkgQueue;
import java.util.Scanner;
public class appQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cQueue antrian = new cQueue();
        int pilih=0;
        do{
            System.out.println("\nAplikasi Antrian");
            System.out.println("1.Masuk");
            System.out.println("2.Keluar");
            System.out.println("3.Lihat");
            System.out.println("4.Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Nama Barang = ");
                    String brg = sc.next();
                    cNode baru = new cNode (brg);
                    antrian.enqueue(baru);
                    break;
                case 2:
                    cNode keluar = antrian.dequeue();
                    if(keluar!=null){
                        System.out.println(keluar.getBarang()+" keluar...");
                    }
                    break;
                case 3:
                    antrian.viewQueue();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
            }
        }while(pilih!=4);
    }
}
