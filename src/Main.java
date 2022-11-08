import java.util.Scanner;

import com.series.manage.Scan;
import com.series.manage.Series;
import com.series.manage.Series_to_DB;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Series Management System...");
        Scanner sc = Scan.create();
        while(true)
        {
            System.out.println("1. Add New Series ");
            System.out.println("2. Display All Series");
            System.out.println("3. Delete Series ");
            System.out.println("4. Exit");
            int c = sc.nextInt();
            sc.nextLine();
            switch(c)
            {
                case 1:
                    System.out.println("Enter the series name :");
                    String name = sc.nextLine();  
                    System.out.println("Enter the status :");
                    String status = sc.nextLine();
                    System.out.println("Enter your ratings (Out of 10) :");
                    int rating = sc.nextInt();
                    Series s = new Series(name, status, rating);
                    if(Series_to_DB.insert(s))
                    {   
                        System.out.println("Inserted SuccessFully !");
                    }
                    else{
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    Series_to_DB.display();
                    break;
                
                case 3:
                    System.out.println("Enter the id you want to delete : ");
                    int id = sc.nextInt();
                    if(Series_to_DB.delete(id))
                    {
                        System.out.println("Deleted Successfully");
                    }else{
                        System.out.println("Error !");
                    }
                    break;

                case 4:
                    return;

            }


        }
        
        
    }
}
