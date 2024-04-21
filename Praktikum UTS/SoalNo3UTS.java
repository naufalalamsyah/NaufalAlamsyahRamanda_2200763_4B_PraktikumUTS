
package soalno3uts;
import java.util.Scanner;
/**
 *
 * @author Naufal Alamsyah R
 */
public class SoalNo3UTS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long number = scanner.nextLong();
        int sum = sumDigits(number);
        System.out.println("Jumlah digit dalam bilangan " + number + " adalah: " + sum);
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10; // Tambahkan digit terakhir ke sum
            n /= 10;       // Hapus digit terakhir
        }
        return sum;
    }
}
