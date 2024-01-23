package belajarinheritanepakson2024;


public class BelajarInheritanePAKSON2024 { 
    public static void main(String[] args) {
        
        
        BangunDatar bangunDatar = new BangunDatar();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 8;
        persegipanjang.lebar = 4;
        
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;
        
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        
        lingkaran.luas();
        lingkaran.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
        
                
                
    }
    
}
