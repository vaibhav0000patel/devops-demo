package ut;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ms.calc.Calculater;

public class CalculaterTest {

	static Calculater cl ;
	
	@BeforeClass
	  public static void setUp() {
	   cl = new Calculater();
	  }

	  @AfterClass
	  public static void tearDown()  {
	  System.gc();
	  }

	  @Test
	  public void testAdd() {
	 assertTrue(cl.doAdd(1,2)==3);
	  }
	  
	  @Test
	  public void testSub() {
	 assertTrue(cl.doSub(1,1)==0);
	  }
	  
	  @Test
	  public void testMul() {
	 assertTrue(cl.doMul(9,2)==18);
	  }
	  
	  
	  @Test
	  public void testDiv() {
	 assertTrue(cl.doDiv(8,2)==4);
	  }

	 
	
}
