package StudentDataBase;

import java.util.Scanner;

public class Student {
   private String firstName;
   private String lastName;
   private int gradeYear;
   private String courses = null;
   private String studentID;
   private int tuitionBalance = 0;
   private static int  costOfCourse = 600;
   private static int id = 1000;
   
   
    //Constructor : prompt user to enter student's name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Students First Name :- ");
        this.firstName = sc.nextLine();

        System.out.print("Enter Students Last Name :- ");
        this.lastName = sc.nextLine();

        System.out.print("Enter Your Grade Year \n1 - Freshman year \n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter Here :");
        this.gradeYear = sc.nextInt();
        setStudentID();
        System.out.println(firstName +" "+ lastName +" "+ gradeYear +" "+ studentID);
        int ans = 1;
        while(ans != 0){
            System.out.println("Enter \n1 - Enroling in courses \n2 - View balance \n3 - To pay Fees \n4 - See Status \n0 - to Exit ");
            ans = sc.nextInt();
            if(ans == 1){
                enroll();
            } else if(ans == 2){
                viewBalance();
            } else if(ans == 3){
                payFees();
            } else if(ans == 4){
                showStatus();
            } else {
                break;
            }
        }
        

    }
    //Generate an ID
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop until user hit 0
     do {   System.out.print("Enter course to enroll or Q to exit :- ");
        Scanner sc = new Scanner(System.in);
         String course = sc.nextLine();
        if(!course.equals("Q")){
          courses = courses + "\n" + course;
          tuitionBalance = tuitionBalance + costOfCourse;
    } else {
        break;
    }
} while(1 != 0);
        System.out.println("You have Enrolled in :- " + courses);
        System.out.println("Now your Tuition fees is :- " + tuitionBalance);    

}
    //View Balance
    public void viewBalance(){
        System.out.println("Your Balance is " + tuitionBalance);
    }

    //Pay tuition
public void payFees(){
    viewBalance();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Amount you want to pay :- ");
    int paid = sc.nextInt();
    tuitionBalance = tuitionBalance - paid;
    System.out.println("You have Succesfully paid " + paid);
    viewBalance();
}
    //Show Status
    public void showStatus(){
        System.out.println("Your Status is :- ");
        System.out.println("Your Student ID is :- " + studentID + "\n" +"You have enrolled in :-" + courses +"\n" +"Your Current tuition Balance is " + tuitionBalance);
    }
}