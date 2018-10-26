import java.util.Scanner;

public class FindMAx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter the number of value: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Please input the number of value lessthan 20");
            }
        }while (size > 20);

        int []array = new int[size];

        for (int i =0; i<size;i++){
            System.out.println("Enter value " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int j = 0;j<size;j++){
            System.out.print(array[j] + "   ");
        }

        int max = array[0];
        int index = 0;

        for (int i = 0;i < size; i++){
            if (array[i] > max){
                max = array[i];
                index = i+1;
            }
        }

        System.out.println("\nThe max value is " + max + " at " + index);

    }
}
