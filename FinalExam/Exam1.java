
package FinalExam;
import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        int number;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
     
        
        int i,n=0,op;
        do{
        System.out.println("\n==== Menu ======");
        System.out.println("1. Input ");
        System.out.println("2. Output");
        System.out.println("Press -1 to Exit..");
        System.out.print("Pls Choose Option = "); op  = sc.nextInt();
        boolean check = false;
        switch(op)
        {
              
            case 1->{
                
                    System.out.print("Enter the numbers:  "); n = sc.nextInt();
                
                    for ( i = 0; i < n; i++) {
                           System.out.print("Input Niumber : "); number = sc.nextInt();
                           sb.append(+number);
                     
                   }
               
                
            }
            case 2 ->{
                  System.out.println(sb);

            }
        }
   }while(op!=-1);

  
}
}




    

