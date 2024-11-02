 
package pwdsystem;

import java.util.Scanner;
public class Pwdsystem {

    public static void main(String[] args) {
       boolean exit = true;
    do{    
        Scanner sc = new Scanner (System.in);
        System.out.println("WELCOME TO PWD - RHU SYSTEM");
        System.out.println("");
        System.out.println("1. PWD");
        System.out.println("2. RHU");
        System.out.println("3. LOG");
        System.out.println("4. EXIT");
        
        System.out.println("Enter Action: ");
        
        int action = sc.nextInt();
        
        switch(action){
            case 1: 
                pwd test = new pwd();
                test.ePWD();
                break;
                
            case 2:
                rhu cs = new rhu();
                cs.pRHU();
        
            case 5:
                System.out.println("Exit Selected type 'yes' to continue ");
                String resp = sc.next();
                if(resp.equalsIgnoreCase("yes")){
                exit = false;
    
                
                }
        }
    
        System.out.println("Do you want to ");
    }while(exit);
    }

}

