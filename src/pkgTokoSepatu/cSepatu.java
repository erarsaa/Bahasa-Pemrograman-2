package pkgTokoSepatu;
public class cSepatu {
    private String merk;
    private double harga;
    cSepatu (String m, double h){
        merk=m; harga=h;
        System.out.println("Object sepatu dibuat...");
    }
    public void setHarga(double h){
        harga=h;
    }
    public String getMerk(){
        return merk;
    }
    public double getHarga(){
        return harga;
    }
}
