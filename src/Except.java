import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int size = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[size];
            int count = 0;
            for (int i = 0; i < size; i++) {
                System.out.println("arr[" + i + "]");
                String str = sc.nextLine();
                int value = Integer.parseInt(str);
                arr[i] = value;
                if (value > 0) count++;
            }
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
            if (count == 0) {
                throw new RuntimeException("Положительные элементы отсутствуют");
            }
            int sum = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] > 0) sum = sum + arr[i];
            }

            System.out.println("Среднее значение равно " + (double) sum/count);
        } catch (NumberFormatException | InputMismatchException in) {
            System.out.println("");
        }
        catch (RuntimeException re){
            System.out.println(re.getMessage());
        }

    }
}