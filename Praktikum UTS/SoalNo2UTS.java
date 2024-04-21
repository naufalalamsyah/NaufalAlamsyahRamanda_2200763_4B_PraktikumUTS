
package soalno2uts;
/**
 *
 * @author Naufal Alamsyah R
 */
import java.util.Scanner;

public class SoalNo2UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int num;
        int count = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");

        do {
            num = input.nextInt();
            if (num != 0) {
                total += num;
                count++;
                if (num > 0)
                    positiveCount++;
                else if (num < 0)
                    negativeCount++;
            }
        } while (num != 0);

        if (count == 0) {
            System.out.println("Tidak ada input selain 0.");
        } else {
            double average = (double) total / count;
            System.out.println("Jumlah bilangan positif adalah " + positiveCount);
            System.out.println("Jumlah bilangan negatif adalah " + negativeCount);
            System.out.println("Nilai total adalah " + total);
            System.out.println("Nilai rata-rata adalah " + average);
        }

        input.close();
    }
}

