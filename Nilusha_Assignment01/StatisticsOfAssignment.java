import java.util.Scanner;//import scanner class

/**
 * Write a description of class Statistics_of_Assignment here.
 *
 * @author Nilusha
 * @version 1.0 2023.09.01
 */
public class StatisticsOfAssignment{
    private String AssignmentName;
    private double[] stMarks;
    
    public StatisticsOfAssignment(){
       stMarks = new double[2];
       inputName();
       inputMarks();
       double highest = highestMark();
       double lowest = lowestMark();
       double sum = mean();
       System.out.println("The highest mark is: "+highest);
       System.out.println("The lowest mark is: "+lowest);
       System.out.println("The mean of the marks is: "+sum);
    }

    public void inputName() {
        Scanner nameAssign = new Scanner(System.in);
        System.out.print("Enter the Assignment Name: ");
        AssignmentName = nameAssign.nextLine();
    }

    public void inputMarks(){
        
        Scanner inputMarks = new Scanner(System.in); //create a scanner object
        
        for(int i=0; i< stMarks.length; i++){
            boolean validInput = false;
        while (!validInput){
            System.out.println("Please enter mark for student "+(i+1)+":");
         double marks = inputMarks.nextDouble();
           if(marks >= 0 && marks <= 30){
               stMarks[i] = marks;
               validInput = true;
            }else{
                System.out.println("Invalid mark.please enter a valid mark between 0 and 30");
            }      
            }

        }
    }
    
    public double highestMark(){
      double highest = stMarks[0];
      for(int i=1;i< stMarks.length;i++ ){
          if(stMarks[i]> highest){
              highest = stMarks[i];
          }
                }
      return highest;
    }
    
     public double lowestMark(){
      double lowest = stMarks[0];
      for(int i=1;i < stMarks.length;i++ ){
          if(stMarks[i]< lowest){
              lowest = stMarks[i];
          }
      }
      return lowest;
}

    public double mean (){
        double sum = 0;
        for(int i=0;i<stMarks.length;i++){
            sum += stMarks[i];
        }
        return sum/stMarks.length;
    }
    

}
