package test.java.statistics.base;

import junit.framework.TestCase;
import static main.java.statistics.base.Mean.*;

public class MeanTest extends TestCase {

	public static final double error_threshold = 10e-3;

	/**
	 * The test input arrays 
	 */
	private int intArr[] = {
			1,3,4,5,8,34,90,43,69,23,45,645,90565
	};
	//
	private long longArr[] = {
			8100234854876L, 884124114222999L, 1657102888234111L,
			5234200100453L, 100000000000000L, 2234405323423L
	};
	private float floatArr[] = {
			1234.5678F, 6548.345065F, 78596745.3454968F, 2748578.432423F
	};
	private double doubleArr[] = {
		
	};
			
	/**
	 * The results for each of the primitive types.
	 * int, int, double, double, 
	 */
	private double results[] = {
			7243.6428, 7041.1538, // Integer
			4.4279930712264E+14, 3.82828595282178E+14, //Float
			20338276.6726962, 63389592.38567265 //
	};
	
	
	protected void setUp() throws Exception {}

	protected void tearDown() throws Exception {}

	public void testMeanIntIntArray() {
		int a = 9876;
		assertTrue(Math.abs( mean(a, intArr) - results[0] ) < error_threshold );
		int[] b = {0};
		assertTrue(mean(0,b) == 0);
		System.out.println("Mean Integer 1 Test Passed");
	}


	public void testMeanIntArray() {
		assertTrue(Math.abs(mean(intArr) - results[1]) < error_threshold );
		System.out.println("Mean Integer 2 Test Passed");
	}

	public void testMeanLongLongArray() {
		long a = 23004324239384L;
		assertTrue( (mean(a, longArr) - results[3]) < 10E1);
		System.out.println("Mean Long 1 Test Passed");
	}
	
	public void testMeanLongArray() {
		assertTrue ( (mean(longArr) - results[2]) < 10E1 );
		System.out.println("Mean Long 2 Test Passed");
	}
	
	public void testMeanFloatFloatArray() {
		float a = 235594855.23757848F;
		assertTrue( (mean(a, floatArr) - results[5]) < 10e-3);
		System.out.println("Mean Float 1 Test Passed");
	}

	public void testMeanFloatArray() {
		assertTrue( (mean(floatArr) - results[4]) < 10e-3 );
		System.out.println("Mean Float 1 Test Passed");
	}

	public void testMeanDoubleDoubleArray() {
		//fail("Not yet implemented");
	}

	public void testMeanDoubleArray() {
		//fail("Not yet implemented");
	}

	public void testMeanTTArray() {
		//fail("Not yet implemented");
	}

	public void testMeanTArray() {
		//fail("Not yet implemented");
	}

	public void testMeanHashMapOfTT() {
		//fail("Not yet implemented");
	}

}
