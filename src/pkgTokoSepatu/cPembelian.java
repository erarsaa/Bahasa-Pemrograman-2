package pkgTokoSepatu;
//di dalam class pembelian terdapat array objek dari sepatu
//class pembelian sebagai containernya
//class sepatu sebagai array objeknya
//dlm satu buah transaksi bisa melibatkan 1/lebih sepatu
public class cPembelian {
    private String kode;
    private cSepatu[] sepatu; //array dari class sepatu
    private int js, ms; //js=jumlah sepatu || ms=maksimal sepatu
    cPembelian(String k, int n){
        kode=k; ms=n; 
        sepatu = new cSepatu[n];
        System.out.println("Object pembelian dibuat...");
    }
    public void addSepatu(cSepatu s){
        if(js<ms){
            sepatu[js]=s;
            js++;
            System.out.println("Adding done.");
        }
        else{
            System.out.println("Over capacity!");
        }
    }
    public void delSepatu(String m){
        if(js>0){
            boolean ada=false;
            for (int i = 0; i < js; i++) {
                if(sepatu[i].getMerk().equalsIgnoreCase(m)){
                    ada=true;
                    //geser array sepatu
                    for (int j = i; j < js; j++) {
                        if(j==js-1)
                            sepatu[j]=null;
                        else
                            sepatu[j]=sepatu[j+1];
                    }
                    js--;
                    System.out.println("Delete done.");
                    break;
                }
            }
            if(ada==false){
                System.out.println("Not found!");
            }
        }
        else{
            System.out.println("Empty!");
        }
    }
    public void showSepatu(){
        System.out.println("Daftar Belanja");
        if(js==0){
            System.out.println("Kosong");
        }
        else{
            for (int i = 0; i < js; i++) {
                System.out.print(sepatu[i].getMerk());
                System.out.println(" [Rp."+sepatu[i].getHarga()+"]");
            }
        }
        System.out.println("");
    }
    public String getKode(){
        return kode;
    }
    public int getMS(){
        return ms;
    }
    public cSepatu[] getSepatu(){
        return sepatu;
    }
}
