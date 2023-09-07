import java.util.Scanner;//import scanner class

/**
 * The class StatisticsOfAssignment .
 *
 * @author Nilusha
 * @version 1.0 2023.09.01
 */
public class StatisticsOfAssignment{
    private String assignmentName; //variable to assign Assignment Name
    private int i;
    private double[] stMarks; // Array to assign students marks
    private double highest;//variable to assign highest mark among the marks
    private double lowest;//variable to assign lowest mark among the marks 
    private double mean; //variable to assign the mean of marks
    private double variance;//variable to assign variance of marks
    private double standardDeviation;//variable to assign standard deviation of marks
    
    public StatisticsOfAssignment(){
       stMarks = new double[2];//initialize the array get students marks of 30 students
       inputName();//call method to inputName
       inputMarks();////call method to input marks
       highest=highestMark();//call method to find highest mark
       lowest=lowestMark();//call method to find lowest  mark
       mean=findMean();//call method to find mean
       findStDeviation(mean);//call method to find standard deviation
       printDetails();//call method print Details
    }

    public void inputName() {//Method to get the assignment name from the user
        Scanner nameAssign = new Scanner(System.in);
        System.out.print("Enter the Assignment Name: ");
        assignmentName = nameAssign.nextLine();
    }

    public void inputMarks(){//Method to get the marks of the students from the user
        
        Scanner inputMarks = new Scanner(System.in); //create a scanner object
        
        for(int i=0; i< stMarks.length; i++){
            boolean validInput = false;
        while (!validInput){
            System.out.println("Please enter mark for student "+(i+1)+":");
         double marks = inputMarks.nextDouble();//this is to read user input
           if(marks >= 0 && marks <= 30){
               stMarks[i] = marks;
               validInput = true;
            }else{
                System.out.println("Invalid mark.please enter a valid mark between 0 and 30");
            }      
            }

        }
    }
    
    public double highestMark(){//Method to find the highest mark among the marks from the students marks array
      double highest = stMarks[0];
      for(int i=1;i< stMarks.length;i++ ){
          if(stMarks[i]> highest){
              highest = stMarks[i];
          }
                }
      return highest;
    }
    
     public double lowestMark(){//Method to find the lowest mark among the marks from the students marks array
      double lowest = stMarks[0];
      for(int i=1;i < stMarks.length;i++ ){
          if(stMarks[i]< lowest){
              lowest = stMarks[i];
          }
      }
      return lowest;
}

    public double findMean (){//Method to calculate the mean of the students marks
        //double sum = 0;
        for(int i=0;i<stMarks.length;i++){
            mean += stMarks[i];
        }
        return mean/stMarks.length;
    }
    
    public double findStDeviation(double mean){//Method to calculate the standard deviation of the students marks
    double sqOfDiff=0;
    for(int i=0;i<stMarks.length;i++){
        double diff = stMarks[i]- mean;
        sqOfDiff +=diff*diff;
            }
    variance = sqOfDiff/(stMarks.length-1);//calculating the variance of marks of the students
    standardDeviation = Math.sqrt(variance);
    return standardDeviation;
}

    public void printDetails(){//Method to print all details including assignment name,all the marks which are input by the user,highest mark,lowest mark,mean and the standard deviation
       System.out.println("Name of the Assignment is  "+assignmentName);
       for(int i=0;i<stMarks.length;i++){
       System.out.println("Marks of student "+(i+1)+"  is : "+stMarks[i]);
    }
       System.out.println("The highest mark is: "+highest);
       System.out.println("The lowest mark is: "+lowest);
       System.out.println("The mean of the marks is: "+mean);
       System.out.println("The Standard Deviation of the marks is: "+standardDeviation);
}
}