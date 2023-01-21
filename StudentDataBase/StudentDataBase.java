package StudentDataBase;
import java.util.*;


public class StudentDataBase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Ask how many students we want to Add
   System.out.print("Enter How Many Students You want to add :- ");
   
   int number = sc.nextInt();
    
   // Create n numbers of students
   for(int i = 0 ;i < number ; i++){
       Student s1 = new Student();
   }
    }
}
