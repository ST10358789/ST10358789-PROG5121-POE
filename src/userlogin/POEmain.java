
package userlogin;

import java.util.Scanner;
public class POEmain {
    
    
    public static void main(String[] args) {
        String userName, firstName, lastName,password;
        Scanner obj = new Scanner(System.in);
        Login objUser = new Login();
        System.out.print("Enter user name: ");
        userName = obj.nextLine();
        objUser.checkUserName(userName); 
        System.out.print("Please enter a password at least 8 letters long with special characters : ");
        password = obj.nextLine();
        objUser.checkPasswordComplexity(password);
        System.out.print("Enter first name: ");
        firstName = obj.nextLine();
        System.out.print("Enter last name: ");
        lastName = obj.nextLine();
        objUser.registerUser(password, userName, firstName, lastName);
        objUser.loginUser(password,userName);
        objUser.returnLoginStatus(password, userName, firstName, lastName);
 
   

    
}

  
}