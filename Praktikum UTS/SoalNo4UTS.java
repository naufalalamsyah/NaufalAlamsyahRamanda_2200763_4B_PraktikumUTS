
package soalno4uts;

/**
 *
 * @author Naufal Alamsyah R
 */
public class SoalNo4UTS {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    // Constructor dengan parameter
    public SoalNo4UTS (double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }

    // Method untuk menghitung luas alas
    public double hitungLuasAlas() {
        return luasAlas;
    }

    // Method untuk menghitung volume limas
    public double hitungVolume() {
        return (luasAlas * tinggi) * 0.33;
    }

    // Getter untuk luas selubung limas
    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    // Getter untuk luas total
    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    // Method main untuk pengujian
    public static void main(String[] args) {
        // Membuat objek limas segi empat pertama dengan nilai yang diberikan
        SoalNo4UTS limas1 = new SoalNo4UTS (1.0, 1.0, 1.0);
        
        // Menampilkan limas segi empat pertama
        System.out.println("Limas segi empat dengan luas alas : " + limas1.hitungLuasAlas());
        System.out.println("Luas selubung limas : " + limas1.getLuasSelubungLimas());
        System.out.println("dan Tinggi : " + limas1.tinggi);
        // Menampilkan volume limas pertama
        System.out.println("Luasnya : " + limas1.getLuas());
        System.out.println("Sedangkan Volumenya : " + limas1.hitungVolume());
        
        // Membuat objek limas segi empat kedua dengan nilai yang diberikan
        SoalNo4UTS limas2 = new SoalNo4UTS (30.0, 40.0, 50.0);
        
        // Menampilkan limas segi empat kedua
        System.out.println("\nLimas segi empat dengan luas alas : " + limas2.hitungLuasAlas());
        System.out.println("Luas selubung limas : " + limas2.getLuasSelubungLimas());
        System.out.println("dan Tinggi : " + limas2.tinggi);
        // Menampilkan volume limas kedua
        System.out.println("Luasnya : " + limas2.getLuas());
        System.out.println("Sedangkan Volumenya : " + limas2.hitungVolume());
        
        // Membuat objek limas segi empat ketiga dengan nilai yang diberikan
        SoalNo4UTS limas3 = new SoalNo4UTS (25.0, 35.0, 45.0);
        
        // Menampilkan limas segi empat ketiga
        System.out.println("\nLimas segi empat dengan luas alas : " + limas3.hitungLuasAlas());
        System.out.println("Luas selubung limas : " + limas3.getLuasSelubungLimas());
        System.out.println("dan Tinggi : " + limas3.tinggi);
        // Menampilkan volume limas ketiga
        System.out.println("Luasnya : " + limas3.getLuas());
        System.out.println("Sedangkan Volumenya : " + limas3.hitungVolume());
    }
}
