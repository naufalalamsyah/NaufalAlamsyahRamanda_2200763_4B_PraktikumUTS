
package soalno1uts;

public class SoalNo1UTS {
    public static void main(String[] args) {
        // Menampilkan nama bulan dari bulan ke-1 sampai ke-12
        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            String monthName = getMonthName(monthNumber);
            System.out.println("Bulan ke-" + monthNumber + " adalah " + monthName);
        }
    }
    
    // Metode untuk mendapatkan nama bulan berdasarkan nomor bulan
    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return "Bulan tidak valid";
        }
    }
}