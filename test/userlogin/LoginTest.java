
package userlogin;

import org.junit.Test;
import org.junit.Testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest {
    Login objUser = new Login();
    Login obj1 = new Login();
    
    public LoginTest() {
    }
    
    @Test
    public void testCheckUserName(){
    
    assertEquals(true,objUser.checkUserName("kyl_1"));
    }
    @Test
    public void testCheckUserName_(){
    
    assertEquals(false,objUser.checkUserName("kyle!!!!!!"));
    }
    
    @Test
    public void testCheckPasswordComplexity() {
        
    assertEquals(true,objUser.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    @Test
    public void testCheckPasswordComplexity_() {
    assertEquals(false,objUser.checkPasswordComplexity("password"));
    }   
    @Test
    public void testRegisterUser() {
        assertEquals(true,objUser.registerUser("Ch&&sec@ke99!","kyl_1","Kyle","Schoeman"));
    }
    public void testRegisterUser_() {
        assertEquals(false,objUser.registerUser("password","kyle", "Kyle","Schoeman"));
    }

    @Test
    public void testLoginUser() {
        assertEquals(true,objUser.loginUser("Ch&&sec@ke99!", "kyl_1"));
    }
    @Test
    public void testLoginUser_() {
        assertEquals(false,objUser.loginUser("password", "kyle!!!!!!"));
    }

    @Test
    public void testReturnLoginStatus() {
    
    String expected = "Welcome " + obj1.Firstname + " , " + obj1.Lastname + " it is great to see you again";
    assertEquals(expected,objUser.returnLoginStatus("Ch&&sec@ke99!", "kyl_1", "obj1.Firstname", "obj1.Lastname"));
    }
    
}
