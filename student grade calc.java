import java.util.Scanner;
public  class studentGradeCalculator{
  public static void main(string[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of subjects:");
    int numsubjects = scanner.nextInt();
    int totalMarks = 0;
    int marks;
    for (int i =1; i<= numsubjects; i++){
      System.out.println("Enter marks for subjects " + i + " : ");
      marks = scanner.nextInt();
      totalMarks += marks;
    }
    double average = (double)totalMarks / numSubjects;
    char grade;
    if(average >= 90) {
      grade = 'A';
    } else if (average >= 80) {
      grade = 'B';
    } else if (average >= 70) {
      grade = 'C';
    } else if (average >= 60) {
      grade = 'D':
        } else {
      grade = 'F';
    }
System.out.println("\nTotal Marks: " + totalMarks);
    System.out.println("Average: " + average);
    System.out.println("Grade:" + grade);
    scanner.close();
  }
}
      
