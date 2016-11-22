package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by utilisateur on 22/11/2016.
 */
public class TestLoginService {

    String logins[]={"chat","chien","lapin"};
    LoginService logintest;

    @Before
    public void SetUp(){
        logintest=new LoginService(logins);
    }

    @Test
    public void testLoginExistTrue(){
        assertTrue(logintest.loginExists("chat"));
    }
    @Test
    public void testLoginExistFalse(){
        assertFalse(logintest.loginExists("carrote"));
    }
    @Test
    public void testLoginAdd(){
        logintest.addLogin("loup");
        assertTrue(logintest.loginExists("loup"));
    }
    @Test
    public void testfindAllLogins(){
        assertEquals(logintest.findAllLogins().size(),3);
    }
    @Test
    public void testlogstartwithCh(){
        assertEquals(logintest.findAllLoginsStartingWith("ch").size(),2);
    }
}

