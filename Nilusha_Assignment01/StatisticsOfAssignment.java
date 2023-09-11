import java.util.Scanner;//import scanner class

/**
 * The class StatisticsOfAssignment calculates statistics related to students marks in an Assignment.
 * The program enables user to input name of the Assignemnt and students marks.
 * Then it computes highest mark,lowest mark,mean and standard deviation of marks of the students.
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

    /**
     *Constructor for objects of class  StatisticsOfAssignment
     */
    public StatisticsOfAssignment(){
       stMarks = new double[30];//initialize the array get students marks of 30 students
       inputName();//call method to input assignment name
       inputMarks();////call method to input marks of students
       highest=highestMark();//call method to find highest mark
       lowest=lowestMark();//call method to find lowest  mark
       mean=findMean();//call method to find mean
       findStDeviation(mean);//call method to find standard deviation
       printDetails();//call method print Details
    }

    public void inputName() {//Method to get the assignment name from the user
        Scanner nameAssign = new Scanner(System.in); //create a scanner object
        System.out.print("Enter the Assignment Name: ");
        assignmentName = nameAssign.nextLine();
    }

    public void inputMarks(){//Method to get the marks of the students from the user
        
        Scanner inputMarks = new Scanner(System.in); //create a scanner object
        
        for(int i=0; i< stMarks.length; i++){
            boolean validInput = false; //initialize validInput to false
        while (!validInput){
            System.out.println("Please enter mark for student "+(i+1)+":");
         double marks = inputMarks.nextDouble();//this is to read user input
           if(marks >= 0 && marks <= 30){
               stMarks[i] = marks;  //store the mark in the array
               validInput = true;
            }else{
                System.out.println("Invalid mark.please enter a valid mark between 0 and 30");
            }      
            }

        }
    }
    
    public double highestMark(){//Method to find the highest mark among the marks from the students marks array
      double highest = stMarks[0]; //initialize 1st element in the array to variable highest
      for(int i=1;i< stMarks.length;i++ ){
          if(stMarks[i]> highest){
              highest = stMarks[i];
          }
                }
      return highest; //return the highest mark found
    }
    
     public double lowestMark(){//Method to find the lowest mark among the marks from the students marks array
      double lowest = stMarks[0]; //initialize 1st element in the array to variable lowest
      for(int i=1;i < stMarks.length;i++ ){
          if(stMarks[i]< lowest){
              lowest = stMarks[i];
          }
      }
      return lowest; //return the lowest mark found
}

    public double findMean (){//Method to calculate the mean of the students marks
        double sum = 0;      //initialize sum to zero 
        for(int i=0;i<stMarks.length;i++){
            sum += stMarks[i];
        }
        mean =sum/stMarks.length;
        return mean;  //return the mean mark found
    }
    
    public double findStDeviation(double mean){//Method to calculate the standard deviation of the students marks
    double sqOfDiff=0;    //initialize squared differance to zero 
    for(int i=0;i<stMarks.length;i++){
        double diff = stMarks[i]- mean;
        sqOfDiff +=diff*diff;
            }
    variance = sqOfDiff/(stMarks.length-1);//calculating the variance of marks of the students
    standardDeviation = Math.sqrt(variance);
    return standardDeviation; //return the standard deviation found
}

    public void printDetails(){//Method to print all details including assignment name,all the marks which are input by the user,highest mark,lowest mark,mean and the standard deviation
       System.out.println("Name of the Assignment is  "+assignmentName); //to print name of the assignment
       for(int i=0;i<stMarks.length;i++){
       System.out.println("Marks of student "+(i+1)+"  is : "+stMarks[i]); //to print marks of students 
    }
       System.out.println("The highest mark is: "+highest); //to print highest mark
       System.out.println("The lowest mark is: "+lowest); //to print lowest mark
       System.out.println("The mean of the marks is: "+mean); //to print mean mark
       System.out.println("The Standard Deviation of the marks is: "+standardDeviation); //to print standard deviation of the marks
}
}