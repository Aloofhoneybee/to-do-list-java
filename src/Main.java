import java.util.ArrayList;
import java.util.Scanner;

public class  Main{
     //method to add to task list
      static String  addtask() {

        


        String hold = input.nextLine();
        

        return hold;
     }
     //satsic declaration of list and scanner to be used anywhere in the class
     static ArrayList<String> Tasks= new ArrayList<String>();
     static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print(" Input the number of tasks to be added to the list: ");

        

        

        
        String task;

        int num = input.nextInt();

        input.nextLine();

        //to check for the amount of times to add tasks
        System.out.println("\nEnter your tasks: ");
        for (int i = 0; i < num ; i ++)
        {
            
            System.out.print(" Task "+ (i + 1) +": ");

            task = addtask();
            Tasks.add(task);
            
            

        }
       
        

        
         
        //System.out.println(hold);

        System.out.println("\nTasks on your list");
        for(int i = 0 ;i < Tasks.size(); i++)
        {

            
            System.out.println( (i+1) +". "+ Tasks.get(i));
        }

        
        

    }
   
}