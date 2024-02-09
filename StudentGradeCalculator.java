import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many subjects did you take? ");
        int subjectCount = input.nextInt();

        int totalMarks = 0;

        for (int subjIndex = 1; subjIndex <= subjectCount; subjIndex++) {
            System.out.print("Enter marks obtained in subject #" + subjIndex + ": ");
            int subjectMarks = input.nextInt();
            totalMarks += subjectMarks;
        }

        double averageScore = (double) totalMarks / (subjectCount * 100) * 100;

        char finalGrade;
        if (averageScore >= 90) {
            finalGrade = 'A';
        } else if (averageScore >= 80) {
            finalGrade = 'B';
        } else if (averageScore >= 70) {
            finalGrade = 'C';
        } else if (averageScore >= 60) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }

        System.out.println("------------------------------------");
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.println("Average Percentage: " + averageScore + "%");
        System.out.println("Final Grade: " + finalGrade);

        input.close();
    }
}
