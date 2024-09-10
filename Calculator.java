import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of subjects here: ");
        int subject = sc.nextInt();
        if (subject < 1) {
            System.out.println("Enter valid subjects: ");
        }
        int marksTotal = 0;
        int max = 100;
        for (int i = 1; i < subject+1; i++) {
            System.out.println("Enter marks of " + i + " out of 100: ");
            int marksObtained = sc.nextInt();
            if (marksObtained < 0 || marksObtained > 100) {
                System.out.println("Marks shoud be in the range of 0 to 100");
                i--;
            } else {
                marksTotal += marksObtained;
            }
        }
        double percentage = (double) marksTotal/ (subject*max)*100;
        System.out.println("Total marks are: " + marksTotal);
        System.out.println("Average Percentage are: " + percentage + "%");
        System.out.println("Grade is: ");
        if (percentage >= 90){
            System.out.println("A+");
        }else if (percentage >= 80) {
            System.out.println("A");
        } else if (percentage >= 70) {
            System.out.println("B");
        } else if (percentage >= 60) {
            System.out.println("C");
        } else if (percentage >= 50) {
            System.out.println("E");
        } else {
            System.out.println("Failed..!!");
        }
    }
}
