package test.statistics.base;

import junit.framework.TestCase;
import static main.statistics.base.Mean.*;

public class MeanTest extends TestCase {

	/**
	 * The test input arrays 
	 */
	
	//
	private int intArr[] = {
			1,3,4,5,8,34,90,43,69,23,45,645,90565
	};
	//
	private long longArr[] = {
			8_100_234_854_876L, 884_124_114_222_999L, 1_657_102_888_234_111L,
			5_234_200_100_453L, 100_000_000_000_000L, 2_234_405_323_423L
	};
	//
	private float floatArr[] = {
			
	};
	//
	private double doubleArr[] = {
			
	};
			
	/**
	 * 
	 */
	private double results[] = {
			7243.6428, 7041.1538, 4.4279930712264E+14, 3.82828595282178E+14
	};
	
	
	protected void setUp() throws Exception {
		
	}

	protected void tearDown() throws Exception {
		
	}

	public void testMeanIntIntArray() {
		int a = 9876;
		assertTrue(Math.abs( mean(a, intArr) - results[0] ) < 10e-3 );
	}

	public void testMeanIntArray() {
		assertTrue(Math.abs(mean(intArr) - results[1]) < 10e-3);
	}

	public void testMeanLongLongArray() {
		long a = 23_004_324_239_384L;
		assertTrue( (mean(a, longArr) - results[3]) < 10E1);
	}
	
	public void testMeanLongArray() {
		assertTrue ( (mean(longArr) - results[2]) < 10E1 );
	}
	
	public void testMeanFloatFloatArray() {
		fail("Not yet implemented");
	}

	public void testMeanFloatArray() {
		fail("Not yet implemented");
	}

	public void testMeanDoubleDoubleArray() {
		fail("Not yet implemented");
	}

	public void testMeanDoubleArray() {
		fail("Not yet implemented");
	}

	public void testMeanTTArray() {
		fail("Not yet implemented");
	}

	public void testMeanTArray() {
		fail("Not yet implemented");
	}

	public void testMeanHashMapOfTT() {
		fail("Not yet implemented");
	}

}
