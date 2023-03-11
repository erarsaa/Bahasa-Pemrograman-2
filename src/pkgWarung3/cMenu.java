package pkgWarung3;
//class induk dari class makanan dan class minuman
public class cMenu {
    private String nama;
    private int harga;
    cMenu(String n, int h){
        nama=n; harga=h;
        System.out.println("Objek "+nama+" dibuat..");
    }
    public void setHarga(int h){
        harga=h;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public String ToString(){
        return "Makanan: "+nama+" ["+harga+"]";
    }
}
