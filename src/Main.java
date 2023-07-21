import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    /**    Scanner input = new Scanner(new File("students.txt"));
        PrintWriter output = new PrintWriter(new File("FinalGrades.txt"));
        String name;
        double[] scores = new double[5];
        double[] weights = {0.1,0.1,0.2,0.2,0.4};
        while(input.hasNext()){
            name = input.next();
            for(int i= 0; i < 5 ; i++)
                scores[i] = input.nextDouble();
            output.println(name + " - " + calcFinalGrade(scores, weights));

        }
output.close();
        int num = 12345;
        int result = addDigits(num);
        System.out.println("Sum of digits in " +
                num + " is " + result);
    }
    public static double calcFinalGrade(double[] scores, double[] weights) {
        double finalGrade = 0;
        for(int i = 0; i < scores.length; i++)
            finalGrade += scores[i] * weights[i];
        System.out.println(finalGrade);
        return finalGrade;
    }
    public static int addDigits(int n){
        if (n == 0)
            return 0;

     return (n % 10 + addDigits(n / 10));
     */
        public static void main(String[] args) {

            //Create a Scanner object
            Scanner input = new Scanner(System.in);

            //Ask the user to enter the length of the array
            System.out.println("Please enter the length of the array:");
            int arraylength = input.nextInt();

            //Ask the user to enter a max value
            System.out.println("Please enter the max value:");
            int max = input.nextInt();

            //Ask the user to input the minimum value
            System.out.println("Please enter the min value:");
            int min = input.nextInt();

            //Initialize the array based on the user's input
            double [] userArray = new double[arraylength];

            /**
             *The program comes up with random numbers based on the length
             *entered by the user. The numbers are limited to being between
             *the minimum and maximum value.
             */
            for (int i = min; i < userArray.length; i++) {
                userArray[i] = Math.random() * max;

            }
            selectionSort(userArray);
            for (int i = 0; i < userArray.length; i++) {



                System.out.println(Integer.toString(min) + "  " + Double.toString(userArray[i]) + "  " + Integer.toString(max));
            }

            //This code uses the method average to find the average
            average(userArray);

            //Close Scanner
            input.close();
        }

    public static double average(double[] data) {

        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];

        }

        double average = sum / data.length;

        return average;
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            //Find the minimum in the list[i...list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }


        }

        }
}