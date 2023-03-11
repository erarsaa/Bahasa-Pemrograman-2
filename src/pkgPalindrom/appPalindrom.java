package pkgPalindrom;
import java.util.Scanner;
public class appPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cStack tumpukan = new cStack();
        int pilih = 0;
        do{
            System.out.println("\nPALINDROM");
            System.out.println("1.Cek Palindrom");
            System.out.println("2.Exit");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            System.out.println("_________________________");
            switch(pilih){
                case 1:
                    System.out.print("\nMasukkan Kata = ");
                    String kata = sc.next();
                    for (int i = 0; i < kata.length(); i++) {
                        char kt = kata.charAt(i);
                        cElemen huruf = new cElemen(Character.toString(kt));
                        tumpukan.push(huruf);
                    }
                    System.out.println("");
                    String cek="";
                    for (int i = 0; i < kata.length(); i++) {
                        String hasil = tumpukan.pop();
                        cek = cek + hasil;
                    }
                    if(cek.matches(kata)){
                        System.out.println("\nOutput = Palindrom");
                    }
                    else{
                        System.out.println("\nOutput = Bukan Palindrom");
                    }
                    System.out.println("_________________________");
                    break;
                case 2:
                    System.out.println("Terima Kasih...");
                    break;
            }
        }while(pilih!=2);
    }
}
