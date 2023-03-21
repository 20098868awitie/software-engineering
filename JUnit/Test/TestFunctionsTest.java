import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFunctionsTest {
    TestFunctions tf = new TestFunctions();
    String username;
    String password;

    @BeforeEach
    void  setup() {
        username = "20098384@wit.ie";
        password = "o^=:-x}eyh@o4HT";
    }

    @Test
    void loginReturnsTrueForCorrectCredentials() {
        assertTrue(tf.Login(username,password));
    }

    @Test
    void loginReturnsFalseForIncorrectPassword() {
        password = "wrong password";
        assertFalse(tf.Login(username,password));
    }

    @Test
    void loginReturnsFalseForIncorrectEmail() {
        username = "20098384@gmail.com";
        assertFalse(tf.Login(username,password));
    }


    @Test
    void loginFailsForInsecurePassword() {
        password = "oxeyho4HT";
        assertFalse(tf.Login(username,password));
    }
}