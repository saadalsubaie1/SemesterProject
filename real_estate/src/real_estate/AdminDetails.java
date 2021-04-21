
package real_estate;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AdminDetails {
    private String username;
    private String password;

    public AdminDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean checkDetails(String  u,String p)
    {
        boolean check=false;String us;
        try {
      File myObj = new File("pas.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNext()) {
          us=myReader.next();
          if(u.equalsIgnoreCase(us)&&p.equals(myReader.next()))
          {
              check=true;
          }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        return check;
    }
    
}