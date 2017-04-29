/**
 * @author Ravindra Bhadti
 * @V1.0
 */

package statistics.base;

import java.util.HashMap;

public class BasicStats {
	
	//---STAT BASIC METHOD---//
	//mean.
	//median.
	//mode.
	//variance
	//standard deviation
	//interquartile range.

	
	public int mean(int a, int ...b){ 
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	public int mean(int[] arr){
		
		double arrSum = 0;
		
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		
		return (int)(arrSum/arr.length);
		
	}
	
	public long mean(long a, long ...b){
		return 0;
	}
	
	public long mean(long[] arr){
		return 0;
	}
	
	public float mean(float a, float ...b){
		return 0;
	}
	
	public float mean(float[] arr){
		return 0;
	}
	
	public double mean(double a, double ...b){
		return 0;
	}
	
	public double mean(double[] arr){
		return 0;
	}
	
	public < T extends Number > T mean(T a, T ...b){
		return a;
	}
	
	public < T extends Number > T mean( T[] arr){
		return (T)(new Object());
	}
	
	public < T extends Number > T mean( HashMap<T,T> hmap){
		return null;
	}
	
	//
	
	public double standardDev(int a, int ...b){
		return 0;
	}
	
	public double standardDev(long a, long ...b){
		return 0;
	}
	
	public double standardDev(float a, float ...b){
		return 0;
	}
	
	public double standardDev(double a, double ...b){
		return 0;
	}
}
