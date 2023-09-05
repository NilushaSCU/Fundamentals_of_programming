import java.util.Scanner;

/**
 * Write a description of class Statistics_of_Assignment here.
 *
 * @author Nilusha
 * @version 1.0 2023.09.01
 */
public class Statistics_of_Assignment
{
    private String AssignmentName;
    private double[] Student_Marks;
 
    

    public void inputAssignmentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Assignment Name: ");
        AssignmentName = scanner.nextLine();
    }

 


     public void getMarks()
    {
        // put your code here
       Scanner userInput = new Scanner(System.in); //create a scanner object
       boolean Valid_Mark = false ;
       while (!Valid_Mark){
       System.out.println("Please enter student's marks: ");
       
       int Student_Marks = userInput.nextInt(); //Read user Input
       if(Student_Marks < 0 || Student_Marks >= 30){
           System.out.println("Student's mark " +Student_Marks+ " is not valid, please input a valid age between 18 and 120");
        }else{
            System.out.println("Student's Mark is : " + Student_Marks);
            Valid_Mark=true;
        }
       
    }
}
}
  
