package pkgWarung3;
//satu pembeli banyak makanan
public class cTransaksi {
    private cPembeli pembeli;
    private cMakanan makanan[]; //makanan yg masuk dalam nota/dibeli
    //Class CONTAINER-nya adalah transaksi
    //Yang menjadi objeknya adalah makanan
    private int jmkn,maksmkn,total;
    
    cTransaksi(){
        maksmkn=3;
        makanan = new cMakanan[maksmkn];
        jmkn = 0; total=0;
        System.out.println("Objek transaksi dibuat..");
    }
    public void isiPembeli(cPembeli p){
        pembeli = p;
        System.out.println("    Isi pembeli sukses");
    }
    public void tambahMakanan(cMakanan m){
        if(jmkn>=maksmkn){
            System.out.println("    Kapasitas penuh");
        }
        else{
            makanan[jmkn]=m;
            jmkn++;
            System.out.println("    Penambahan sukses..");
        }
    }
    public void lihatMakanan(){
        System.out.println("\n    Daftar Makanan");
        if(pembeli!=null)
            System.out.println("    "+pembeli.ToString());
        else
            System.out.println("    Pembeli belum ada!");
        for (int i = 0; i < jmkn; i++) {
            System.out.println("    "+(i+1)+"."+makanan[i].ToString());
        }
    }
    public void hapusMakanan(String m){
        if(jmkn<=0){
            System.out.println("    Makanan kosong!");
        }
        else{
            boolean ada=false;
            for (int i = 0; i < jmkn; i++) {
                if (m.equalsIgnoreCase(makanan[i].getNama())) {
                    ada=true;
                    makanan[i]=null;
                    //geser maju elemen
                    for (int j = i; j < jmkn; j++) {
                        if(i==jmkn-1){
                            makanan[j]=null;
                        }
                        else{
                            makanan[j]=makanan[j+1];
                        }
                    }
                    System.out.println("    Penghapusan sukses..");
                    jmkn--;
                    break;
                }
            }
            if(ada==false){
                System.out.println("    Makanan tidak ada!");
            }
        }
    }
}
