package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by utilisateur on 23/11/2016.
 */
public class TestLoginGenerator {
    LoginGenerator loginGenerator;

    @Before
    public void SetUp(){
        loginGenerator=new LoginGenerator(new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"}));
    }

    @Test
    public void testAddPaulDurant(){

        assertEquals(loginGenerator.generateLoginForNomAndPrenom("Durant","Paul"),"PDUR");
    }
    @Test
    public void testAddJeanRolling(){

        assertEquals(loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean"),"JROL1");
    }
    @Test
    public void testAddPaulDùrant(){

        assertEquals(loginGenerator.generateLoginForNomAndPrenom("Durant","Paul"),"PDUR");
    }
    @Test
    public void testAddJeanRolling2(){
        assertEquals(loginGenerator.generateLoginForNomAndPrenom("Rollange","Jean"),"JROL1");
        assertEquals(loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean"),"JROL2");
    }
}

