package test.java.statistics.base;

import junit.framework.TestCase;
import static main.java.statistics.base.Mean.*;

public class MeanTest extends TestCase {

	public static final double error_threshold = 10e-3;

	/**
	 * The test input arrays 
	 */
	
	//
	private int intArr[] = {
			1,3,4,5,8,34,90,43,69,23,45,645,90565
	};
	//
	private long longArr[] = {
			8100234854876L, 884124114222999L, 1657102888234111L,
			5234200100453L, 100000000000000L, 2234405323423L
	};
	//
	private float floatArr[] = {
			
	};
	//
	private double doubleArr[] = {
		
	};
			
	/**
	 * The results for each of the primitive types.
	 * int, long, float and double
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
		assertTrue(Math.abs( mean(a, intArr) - results[0] ) < error_threshold );
	}


	public void testMeanIntArray() {
		assertTrue(Math.abs(mean(intArr) - results[1]) < error_threshold );
	}

	public void testMeanLongLongArray() {
		long a = 23004324239384L;
		assertTrue( (mean(a, longArr) - results[3]) < 10E1);
	}
	
	public void testMeanLongArray() {
		assertTrue ( (mean(longArr) - results[2]) < 10E1 );
	}
	
	public void testMeanFloatFloatArray() {

	}

	public void testMeanFloatArray() {
		//fail("Not yet implemented");
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
