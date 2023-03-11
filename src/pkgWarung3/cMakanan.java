package pkgWarung3;
public class cMakanan {
    private String nama;
    private int harga;
    cMakanan(String n, int h){
        nama=n; harga=h;
        System.out.println("Objek "+nama+" dibuat..");
    }
    public void setHarga(int h){
        harga=h;
    }
    public String getNama(){
        return nama;
    }
    public String ToString(){
        return "Makanan: "+nama+" ["+harga+"]";
    }
}
