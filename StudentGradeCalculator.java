import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        int[] marks = new int[subjects];
        int total = 0;

       
         String[] subjectNames = new String[subjects];
         for (int i = 0; i < subjects; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            String subjectName = sc2.nextLine();    
            subjectNames[i] = subjectName;
            System.out.println("You entered: " + subjectName);
            System.out.print("Enter marks of " + subjectName + ": ");  
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks for " + subjectName + ". Marks should be between 0 and 100.");
                return;
            }
            total += marks[i];
        }

 System.out.println("Marks obtained in each subject:");
        for (int i = 0; i < subjects; i++) {
            System.out.println("Subject " + subjectNames[i] + ": " + marks[i] + " marks");
        }

         float percentage = ((float) total / (subjects * 100)) * 100;
        System.out.println("The Average Percentage is :-");
        System.out.println(percentage);
        sc.close();

        double average = total / (double) subjects;
        String grade;

        if (average >= 90) grade = "A+";
        else if (average >= 80) grade = "A";
        else if (average >= 70) grade = "B";
        else if (average >= 60) grade = "C";
        else if (average >= 50) grade = "D";
        else grade = "F";

        System.out.println("Total Marks: " + total + "/" + (subjects * 100));
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        }
        }
    


