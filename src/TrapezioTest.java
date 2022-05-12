import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrapezioTest {

	@Test
	public void test() {
		Trapezio t=new Trapezio(3,2,1);
		Float risAtteso=2.5f;
		Float risOttenuto= t.Area();
		assertEquals(risAtteso,risOttenuto);
	}
	
	
	@Test
	public void test1() {
		Trapezio t=new Trapezio(6,5,5);
		Float risAtteso=27.5f;
		Float risOttenuto= t.Area();
		assertEquals(risAtteso,risOttenuto);
	}
	
	
	@Test
	public void test2() {
		Trapezio t=new Trapezio(32,5,1);
		Float risAtteso=18.5f;
		Float risOttenuto= t.Area();
		assertEquals(risAtteso,risOttenuto);
	}

}
