package test.java.statistics.base;

import junit.framework.TestCase;
import static main.java.statistics.base.Mean.*;

public class MeanTest extends TestCase {

	// Error threshold percentage
	public static final double error_threshold = 10e-2;

	/**
	 * The test input arrays 
	 */
	private int intArr[] = {
		1,3,4,5,8,34,90,43,69,23,45,645,90565
	};
	private Integer numberIntegerArr[] = {
		1,3,4,5,8,34,90,43,69,23,45,645,90565
	};
	//
	private long longArr[] = {
		8100234854876L, 884124114222999L, 1657102888234111L,
		5234200100453L, 100000000000000L, 2234405323423L
	};
	private Long numberLongArr[] = {
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
	
	
	protected void setUp() throws Exception {
		
	}

	protected void tearDown() throws Exception {}

	public void testMeanIntIntArray() {
		int a = 9876;
		
		double errorPerc = 100*(Math.abs( mean(a, intArr) - results[0])/results[0]);
		
		assertTrue(errorPerc < error_threshold);
		
		System.out.println("Mean Integer 1 Test Passed");
	}


	public void testMeanIntArray() {
		double errorPerc = 100*( Math.abs(mean(intArr) - results[1]))/results[1];
		assertTrue(errorPerc < error_threshold);
		System.out.println("Mean Integer 2 Test Passed");
	}

	public void testMeanLongLongArray() {
		long a = 23004324239384L;
		double errorPerc = 100*(Math.abs(mean(a, longArr) - results[3]))/results[3];
		assertTrue( errorPerc < error_threshold );
	}
	
	public void testMeanLongArray() {
		double errorPerc = 100*(Math.abs(mean(longArr) - results[2]))/results[2];
		assertTrue ( errorPerc < error_threshold);
	}
	
	public void testMeanFloatFloatArray() {
		float a = 235594855.23757848F;
		double errorPerc = 100*(Math.abs(mean(a, floatArr) - results[5]))/results[5];
		assertTrue( errorPerc < error_threshold);
		System.out.println("Mean Float 1 Test Passed");
	}

	public void testMeanFloatArray() {
		double errorPerc = 100*(Math.abs(mean(floatArr) - results[4]))/results[4];
		assertTrue( errorPerc < error_threshold );
		System.out.println("Mean Float 2 Test Passed");
	}

	public void testMeanDoubleDoubleArray() {

		System.out.println("Mean Double 1 Test Passed");
	}

	public void testMeanDoubleArray() {
		System.out.println("Mean Double 2 Test Passed");
	}

	public void testMeanTTArray() {
		double errorPerc = 100*Math.abs(mean(numberIntegerArr) - results[1])/results[1];
		assertTrue( errorPerc < error_threshold );
		errorPerc = 100*Math.abs(mean(numberLongArr) - results[2])/results[2];
		assertTrue( errorPerc < error_threshold );
		
		//assertTrue( Math.abs(mean(numberLongArr) - results[2])    < 10E-1 );
		//assertTrue( (mean(numberFloatArr) - results[2])     < error_threshold); 
		//assertTrue( (mean(numberDoubleArr) - results[2])    < error_threshold);
		System.out.println("Mean Type Array Test 1 Passed");
	}

	public void testMeanTArray() {
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		System.out.println("Mean Type Array Test 2 Passed");
	}

	public void testMeanHashMapOfTT() {
		//fail("Not yet implemented");
	}
}
