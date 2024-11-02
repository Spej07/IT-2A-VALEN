package pwdsystem;

import java.util.Scanner;

public class rhu {

   
    config conf = new config();

    public void pRHU() {
        Scanner sc = new Scanner(System.in);
        String resp;
        do {
            System.out.println("-----RHU-----");
            System.out.println("1. ADD RHU");
            System.out.println("2. VIEW RHU");
            System.out.println("3. UPDATE RHU");
            System.out.println("4. DELETE RHU");
            System.out.println("5. EXIT");

            System.out.print("Enter Action: ");
            int action = sc.nextInt();
            rhu test = new rhu();
            switch (action) {
                case 1:
                    test.addRHU();
                    test.viewRHU();
                    break;
                case 2:
                    test.viewRHU();
                    break;
                case 3:
                    test.viewRHU();
                    test.updateRHU();
                    break;
                case 4:
                    test.viewRHU();
                    test.deleteRHU();
                    test.viewRHU();
                    break;
            }

            System.out.print("Continue? ");
            resp = sc.next();

        } while (resp.equalsIgnoreCase("yes"));
        System.out.println("Thank You!");
    }

    public void addRHU() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Doctor name: ");
        String rname = sc.next();
        System.out.println("PWD name: ");
        String sname = sc.next();
        System.out.println("Date: ");
        String rdate = sc.next();
        System.out.println("Room: ");
        String rroom = sc.next();

        String sql = "INSERT INTO rhu (r_name, s_name, r_date, r_room) VALUES (?, ?, ?, ?)";
        conf.addRecord(sql, rname, sname, rdate, rroom);
    }

    public void viewRHU() {
        String qry = "SELECT * FROM rhu";
        String[] hdrs = {"ID","Doctor Name", "PWD name", "Date", "Room"};
        String[] clms = {"r_id", "r_name", "s_name", "r_date", "r_room"};

        conf.viewRecords(qry, hdrs, clms);
    
 
    } 
    
    public void updateRHU() {
    Scanner sc = new Scanner(System.in);
    
    try {
        System.out.print("Enter the ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Doctor Name: ");
        String nfname = sc.nextLine();
        
        System.out.print("Enter new PWD Name: ");
        String nlname = sc.nextLine();
        
        System.out.print("Enter new Room: ");
        String nroom = sc.nextLine();
        
  
        String qry = "UPDATE rhu SET r_name = ?, s_name = ?, r_room = ? WHERE s_id = ?";
        config conf = new config();  
     
      conf.updateRecord(qry, nfname, nlname, nroom, id);
        System.out.println("Record updated successfully!");
    } catch (Exception e) {
        System.err.println("Error updating record: " + e.getMessage());
    }
}

}

     
   

   