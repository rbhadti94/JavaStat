/**
 * Class: RavMath.base.BasicStats 
 * 
 * @author Ravindra Bhadti
 * @V1.0
 */

package statistics.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public strictfp class BasicStats  {
	
	//---STAT BASIC METHOD---//
	//mean. --- Done
	//median.
	//mode. ---
	//standard deviation --- Done
	//interquartile range.
	
	/**
	 * This class is non-instansiable.
	 */
	private BasicStats(){
		//No body.
	}
	
	/* -------- MEAN -------- */
	
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
	
	/* -------- MEDIAN -------- */
	public final static double median(int[] arr){
		Arrays.sort(arr);
		
		double tmpArray[] = new double[arr.length];
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++){
			tmpArray[i] = arr[i];
		}
		
		return median(tmpArray);
	}
	
	public final static double median(int a, int ...b){
		int tmpArray[] = new int[b.length+1];
		tmpArray[0] = a;
		for(int i = 1; i <= b.length; i++){
			tmpArray[i] = b[i-1];
		}
		return median(tmpArray);
	}
	
	public final static double median(long[] arr){
		Arrays.sort(arr);
		double tmpArray[] = new double[arr.length];
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++){
			tmpArray[i] = arr[i];
		}
		
		return median(tmpArray);
	}
	
	public final static double median(long a, long ...b){
		long tmpArray[] = new long[b.length+1];
		tmpArray[0] = a;
		for(int i = 1; i <= b.length; i++){
			tmpArray[i] = b[i-1];
		}
		return median(tmpArray);
	}
	
	public final static double median(float[] arr){
		double tmpArray[] = new double[arr.length];
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++){
			tmpArray[i] = arr[i];
		}
		
		return median(tmpArray);
	}
	
	public final static double median(float a, float ...b){
		float tmpArray[] = new float[b.length+1];
		tmpArray[0] = a;
		for(int i = 1; i <= b.length; i++){
			tmpArray[i] = b[i-1];
		}
		return median(tmpArray);
	}
	
	public final static double median(double[] arr){
			
		//Sort the array.
		Arrays.sort(arr);
		
		int inputArraySize = arr.length;
		double medVal = 0;
		
		//Odd size array.
		if(arr.length%2==1){
			medVal = arr[(int)Math.floor(inputArraySize/2)];
		}
		//Even size array.
		else{
			medVal = (double)(arr[(inputArraySize/2)-1]+arr[(inputArraySize/2)])/2;
		}
		
		return medVal;
	}
	
	public final static double median(double a, double ...b){
		double tmpArray[] = new double[b.length+1];
		tmpArray[0] = a;
		for(int i = 1; i <= b.length; i++){
			tmpArray[i] = b[i-1];
		}
		return median(tmpArray);
	}
	
	
	/* -------- MODE -------- */
	public final static int mode(int[] arr){
		double[] tmpArr = new double[arr.length];
		for(int i = 0; i < arr.length; i++){
			tmpArr[i] = (double)arr[i];
		}
		return (int)mode(tmpArr);
	}
	
	public final static long mode(long[] arr){
		double[] tmpArr = new double[arr.length];
		for(int i = 0; i < arr.length; i++){
			tmpArr[i] = (double)arr[i];
		}
		return (long)mode(tmpArr);
	}
	
	public final static float mode(float[] arr){
		double[] tmpArr = new double[arr.length];
		for(int i = 0; i < arr.length; i++){
			tmpArr[i] = (double)arr[i];
		}
		return (float)mode(tmpArr);
	}
	
	/**
	 * All calcs done in double.
	 * @param arr
	 * @return
	 */
	public final static double mode(double[] arr){
		//Loop through array and store values in map.
		Map<Double, Integer> modalMap = new HashMap<Double, Integer>();
		for(int i = 0; i < arr.length; i++){
			//If it isn't contained in the map.
			if(!modalMap.containsKey(arr[i])){
				modalMap.put(arr[i], 1);
			}
			//If it already exists in the map.
			else{
				modalMap.replace(arr[i], modalMap.get(arr[i])+1);
			}
		}
		//Get the count values and convert to array.
		Collection<Integer> x = modalMap.values();
		List<Double> keys = new ArrayList<Double>(modalMap.keySet());
		Object[] y = x.toArray();
		int currMaxIndex = 0;
		
		for(int i = 0; i < x.size(); i++){
			//There are 2 modal values.
			if((Integer)y[i] == (Integer)y[currMaxIndex]){
				currMaxIndex = keys.get(currMaxIndex) < keys.get(i) ? currMaxIndex : i;
			}
			
			//The count at the current index is equal.
			else if((Integer)y[i] > (Integer)y[currMaxIndex]){
				currMaxIndex=i;
			}
		}
		
		//Mode returns the lowest value number with the greatest no.
		//of occurences.
		return keys.get(currMaxIndex);
	}
	
		
}

