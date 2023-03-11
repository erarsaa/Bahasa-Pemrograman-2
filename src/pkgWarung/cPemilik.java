package pkgWarung;
public class cPemilik {
    private String nama;
    private String alamat;
    private cWarung warung; //implementasi relasi HAS A
    public void tambahWarung(cWarung w){
        warung=w;
        System.out.println("Penambahan warung sukses..");
    }
    public void lihatWarung(){
        if(warung!=null){
            System.out.println("Bpk/Ibu " +nama+ " Memiliki "+warung.ToString());
        }
        else System.out.println("Belum punya warung!");
    }
    public void ubahWarung(cWarung w){
        warung=w;
        System.out.println("Pengubahan warung berhasil..");
    }
    public void hapusWarung(){
        warung=null;
        System.out.println("Penghapusan warung berhasil...");
    }
    cPemilik(String n, String a){
        nama=n; alamat=a;
        System.out.println("Objek "+nama+" dibuat..");
    }
    //setter
    public void setAlamat(String a){
        alamat=a;
    }
    //getter
    
    //ToString
    public String ToString(){
        return nama+" ["+alamat+"] ";
    }
}
