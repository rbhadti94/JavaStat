/**
 * Class: RavMath.base.BasicStats 
 * 
 * @author Ravindra Bhadti
 * @V1.0
 */

package statistics.base;

import java.util.HashMap;


public strictfp class BasicStats  {
	
	//---STAT BASIC METHOD---//
	//mean.
	//median.
	//mode.
	//variance
	//standard deviation
	//interquartile range.
	
	/**
	 * This class is non-instansiable.
	 */
	private BasicStats(){
		//No body.
	}
	
	/**
	 * The var-args mean method, it can take 1 or
	 * more integers and return the mean.
	 * 
	 * @param a - A single integer.
	 * @param b - A variable number of integers.
	 * @return double - The mean the list a,b[0],b[1],...,b[N-1].
	 */
	public final static double mean(int a, int ...b){ 
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	/**
	 * The var-args mean method, it can take 1 or
	 * more integers and return the mean.
	 * 
	 * @param  arr[] -  An array of integers. 
	 * @return double - The mean the list arr[0],arr[1],...,arr[N-1].
	 */
	public final static double mean(int[] arr){
		double arrSum = 0;
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		return arr.length!=0 ? (arrSum/arr.length) : 0;
	}
	
	/**
	 * The var-args mean method, it can take 1 or
	 * more longs and return the mean.
	 * 
	 * @param a - A single long.
	 * @param b - A variable number of long.
	 * @return double - The mean the list a,b[0],b[1],...,b[N-1].
	 */
	public final static double mean(long a, long ...b){
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	/**
	 * This method returns the mean of an array
	 * of longs.
	 * 
	 * @param  arr[] -  An array of longs. 
	 * @return double - The mean the list arr[0],arr[1],...,arr[N-1].
	 */
	public final static double mean(long[] arr){
		double arrSum = 0;
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		return arr.length!=0 ? (arrSum/arr.length) : 0;
	}
	
	/**
	 * The var-args mean method, it can take 1 or
	 * more floats and return the mean.
	 * 
	 * @param a - A single float.
	 * @param b - A variable number of float.
	 * @return double - The mean the list a,b[0],b[1],...,b[N-1].
	 */
	public final static double mean(float a, float ...b){
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	/**
	 * This method returns the mean of an array
	 * of floats.
	 * 
	 * @param  arr[] -  An array of floats. 
	 * @return double - The mean the list arr[0],arr[1],...,arr[N-1].
	 */
	public final static double mean(float[] arr){
		double arrSum = 0;
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		return arr.length!=0 ? (arrSum/arr.length) : 0;
	}
	
	
	/**
	 * The var-args mean method, it can take 1 or
	 * more floats and return the mean.
	 * 
	 * @param a - A single double.
	 * @param b - A variable number of double.
	 * @return double - The mean the list a,b[0],b[1],...,b[N-1].
	 */
	public final static double mean(double a, double ...b){
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	/**
	 * This method returns the mean of an array
	 * of doubles.
	 * 
	 * @param  arr[] -  An array of floats. 
	 * @return double - The mean the list arr[0],arr[1],...,arr[N-1].
	 */
	public final static double mean(double[] arr){
		double arrSum = 0;
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		return arr.length!=0 ? (arrSum/arr.length) : 0;
	}
	
	@SafeVarargs
	public final static <T extends Number> double mean(T a, T ...b){
		return ((mean(b)*b.length)+a.doubleValue())/(b.length+1);
	}
	
	public final static <T extends Number> double mean( T[] arr){
		Double arrSum = 0.0;
		for(int i = 0; i < arr.length; i++){
			arrSum += arr[i].doubleValue();
		}
		return arr.length!=0 ? (arrSum/arr.length) : 0;
	}
	
	public final static <T extends Number> T mean( HashMap<T,T> hmap){
		return null;
	}
	
	public final static double standardDev(int[] arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public final static double standardDev(long[] arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public final static double standardDev(float []arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public final static double standardDev(double []arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public final static double standardDev(int a, int ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public final static double standardDev(long a, long ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public final static double standardDev(float a, float ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public final static double standardDev(double a, double ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public final static <T extends Number> double standardDev(T[] arr){
		
		double meanArr = mean(arr);
		double sumSquared = 0;
		for(int i = 0; i < arr.length; i++){
			sumSquared += Math.pow(arr[i].doubleValue() - meanArr,2);
		}
		return Math.sqrt(sumSquared/arr.length);
	}
	
	@SafeVarargs
	public final static <T extends Number> double standardDev(T a, T ...b){
		double meanArr = mean(a, b);
		double sumSquared = Math.pow((a.doubleValue()-meanArr), 2);
		
		for(int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i].doubleValue()-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	
}
