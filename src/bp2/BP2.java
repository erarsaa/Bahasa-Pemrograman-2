package bp2;
//1. class pendukung
//2. lengkapi dgn data dan method
//3. buat object di class main
//4. jalankan method yg dimiliki oleh object

//studi kasus: UMKM --> Warung
//pelaku sistem? warung, pemilik, pembeli, barang

class Barang{
    //data
    String nama;
    int harga;
    
    //method
    void isiBarang(String n, int h){
        nama  = n;
        harga = h;
    }
    void lihatBarang(){
        System.out.println("Nama  :" +nama);
        System.out.println("Harga :" +harga);
        
    }
}

public class BP2 {
    public static void main(String[] args) {
        Barang brg = new Barang(); //create object
        //brg.nama = "Soto";
        //brg.harga = 15000;
        brg.isiBarang("Soto", 15000);
        brg.lihatBarang();
    }
    
}
