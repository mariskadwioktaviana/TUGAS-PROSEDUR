package id_blitz_tugasluas;

public class MencariLuas {

    public static void main(String[] args) {
        System.out.println("   Menghitung Luas Bangun Datar");
        System.out.println("==================================");

        PersegiPanjang hitung = new PersegiPanjang();
        hitung.lebar = 5;
        hitung.panjang = 7;
        hitung.hitungLuasBangunDatar();
        
        Persegi cari = new Persegi();
        cari.sisi = 5;
        cari.hitungLuasBangunDatar();
        
        Segitiga mencari = new Segitiga();
        mencari.alas = 4;
        mencari.tinggi = 8;
        mencari.hitungLuasBangunDatar();
        
        Lingkaran menghitung = new Lingkaran();
        menghitung.jarijari = 7;
        menghitung.phi = (float) 3.14;
        menghitung.hitungLuasBangunDatar();
        
        Trapesium search = new Trapesium();
        search.jumlahsisisejajar = 12 ;
        search.tinggi = 4 ;
        search.hitungLuasBangunDatar();
    }
    
}
