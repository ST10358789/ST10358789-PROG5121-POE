package userlogin;

import java.util.Scanner;

public class Login {

    String Firstname;
    String Lastname;
    String password,userName;
    static Login obj1 = new Login();
   
    public boolean checkUserName(String userName) {
        //Username tips
        //Contains an Undescore
        //Should not be longer than 5 characters
        String specialChar = "_";
        //to check if username meets requirements
        if (userName.length() <= 5 && userName.contains(specialChar)) {

            System.out.println("Username has been successfully captured");
            return true;
        } //to check if username does not meet requirements 
        else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        return false;
    }
    public boolean checkPasswordComplexity(String password) {
        //Password requirements
        //At least 8 characters long
        //Contains an special character
        //Contains a capital letter
        //Contains a number
        boolean Lower = false, Upper = false, digit = false, special =false;
        char ch;
        //prompt user to input password
        int total = password.length();
        // conditions of the password
        // geeksforgeeks.2023.Java Program to Check Whether the String Consists of Special Characters.[Source Code].https://www.geeksforgeeks.org/java-program-to-check-whether-the-string-consists-of-special-characters/ (ccessed 26 April 2023)
        
        for (int i = 0; i < total ; i++) 
        {
            ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)){
                Upper = true;
            }
            if (Character.isLowerCase(ch)) {
                Lower = true;
            }
            if (Character.isDigit(ch)) {
                digit = true;
            } 
            if (!Character.isDigit(ch)&& !Character.isAlphabetic(ch))
            {   special = true;}
        }         
            
            if (Upper ==true && Lower ==true && digit ==true && special ==true )
            {System.out.println("Password has been captured successfully");
                return true;
            }
            else {System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter , a number and a special character : ");
            
            return false;}
        }
    
    public boolean registerUser(String password, String userName,String firstName, String lastName)    
    { 
        boolean ispasswordCorrect = checkPasswordComplexity(password);
        boolean isUserNameCorrect = checkUserName(userName);
        boolean result = (isUserNameCorrect && ispasswordCorrect) ;
        if(result)
        {       
        obj1.Firstname = firstName ;
        obj1.Lastname = lastName ;
        obj1.password = password ;
        obj1.userName = userName ;
         
        System.out.println("Registration successful");
        }
        else
        {
            System.out.println("“Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }
        return result;}
    
    //Register login user
    public boolean loginUser(String password,String userName)// Register login user method
    {
        
        // check if login user details are correct
        if (userName.equals(userName) && password.equals(password)) {
            
            System.out.println("Login successful");
            return true;
            }  
            else {
           
            System.out.println("Unsuccessful login");
            } 
        return false;
    }
    
    public String returnLoginStatus(String password, String userName,String firstName, String lastName)
//        Scanner obj = new Scanner(System.in);
//        String firstName;
//        firstName = obj.nextLine();
//        String lastName;
//        lastName = obj.nextLine();
    {
        if (password.equals(password)&& userName.equals(userName)&& firstName.equals(obj1.Firstname)&& lastName.equals(obj1.Lastname))
        {return "Welcome " + obj1.Firstname + " , " + obj1.Lastname + " it is great to see you again";
        }
        else{
        return "Username or password is incorrect,please try again ";}
    }
}
                
                
    

    


