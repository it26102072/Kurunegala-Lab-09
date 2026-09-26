import java.util.Scanner;
public class IT26102072Lab9Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        double[] finalmarks = new double[5];
        char[] grades = new char[5];

        for (int i =0 ; i < 5 ; i++){

            double assignmentmark,exammark;
            System.out.print("\n\nEnter Name for Student " +(i + 1)+": ");
            names[i] = input.next();

            System.out.print("Enter Assigment Mark (out of 100) for: " + names[i]+": ");
            assignmentmark = input.nextDouble();

            System.out.print("Enter Assigment Mark (out of 100) for: " + names[i]+": ");
            exammark = input.nextDouble();
            
            finalmarks[i] = calcFinalMark(exammark,assignmentmark);
            grades[i] = findGrades(finalmarks[i]);

        }
        printDetails(names,finalmarks,grades);


    }
    public static double calcFinalMark(double exam , double assignment){

        double finalmark = ( (exam*0.7) +  (assignment*0.3) );
        return finalmark;

    }
    public static char findGrades(double finalmark){
        if(finalmark<50){
            return 'F' ;
        } else if (finalmark<60) {
            return 'C';
        } else if (finalmark<75) {
            return 'B';
        } else {
            return 'A';
        }
    }
    public static void printDetails( String[] names ,double[] finalmarks , char[] grades){
        System.out.println("Name\tFinal Mark\tGrade");
        for(int i = 0 ; i < names.length ; i++){
            System.out.println(names[i] + "\t" + finalmarks[i] + "\t\t" + grades[i]);
        }
    }

}