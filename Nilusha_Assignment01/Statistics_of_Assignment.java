import java.util.Scanner;//import scanner class

/**
 * Write a description of class Statistics_of_Assignment here.
 *
 * @author Nilusha
 * @version 1.0 2023.09.01
 */
public class Statistics_of_Assignment
{
    private String AssignmentName;
    private double[] stMarks;

    public void inputAssignmentName() {
        Scanner nameAssign = new Scanner(System.in);
        System.out.print("Enter the Assignment Name: ");
        AssignmentName = nameAssign.nextLine();
    }

    public void getMarks()
    {
        // put your code here
        Scanner userInput = new Scanner(System.in); //create a scanner object
        boolean Valid_Mark = false ;
        for(int i=0; i< stMarks.length; i++){
        while (!Valid_Mark){
            System.out.println("Please enter student's marks: ");
         double marks = userInput.nextDouble();
           if(marks >= 0 && marks <= 30){
               stMarks[i] = marks;
            }else{
                System.out.println("Invalid mark.please enter a valid mark between 0 and 30");
            }
               
              //  System.out.println("Student's mark " +Student_Marks+ " is not valid, please input a valid age between 18 and 120");
            //}else{
              //  System.out.println("Student's Mark is : " + Student_Marks);
                //Valid_Mark=true;
                
            }

        }
    }
}

