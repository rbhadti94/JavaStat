/**
 * @author Ravindra Bhadti
 * @V1.0
 */

package statistics.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BasicStats <T extends Number> {
	
	//---STAT BASIC METHOD---//
	//mean.
	//median.
	//mode.
	//variance
	//standard deviation
	//interquartile range.

	
	public double mean(int a, int ...b){ 
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	public double mean(int[] arr){
		
		double arrSum = 0;
		
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		
		return (arrSum/arr.length);
		
	}
	
	public double mean(long a, long ...b){
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	public double mean(long[] arr){
		double arrSum = 0;
		
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		
		return (arrSum/arr.length);
	}
	
	public double mean(float a, float ...b){
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	public double mean(float[] arr){
		
		double arrSum = 0;
		
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		
		return (arrSum/arr.length);
	}
	
	public double mean(double a, double ...b){
		return ((mean(b)*b.length)+a)/(b.length+1);
	}
	
	public double mean(double[] arr){
		
		double arrSum = 0;
		
		for(int i = 0; i < arr.length; i++){
			arrSum+=arr[i];
		}
		
		return (arrSum/arr.length);
	}
	
	public double mean(T a, T ...b){
		return ((mean(b)*b.length)+a.doubleValue())/(b.length+1);
	}
	
	public double mean( T[] arr){
		Double arrSum = 0.0;
		
		for(int i = 0; i < arr.length; i++){
			arrSum += arr[i].doubleValue();
		}
		
		return arrSum/arr.length;
		
	}
	
	public T mean( HashMap<T,T> hmap){
		return null;
	}
	
	public double standardDev(int[] arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public double standardDev(long[] arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public double standardDev(float []arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public double standardDev(double []arr){
		double sumSquared = 0;
		double meanArr = mean(arr);
		
		for(int i = 0; i < arr.length; i++){
			sumSquared+=(arr[i]-meanArr)*(arr[i]-meanArr);
		}
		
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public double standardDev(int a, int ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public double standardDev(long a, long ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public double standardDev(float a, float ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public double standardDev(double a, double ...b){
		double meanArr = mean(a, b);
		double sumSquared=Math.pow((a-meanArr), 2);
		
		for (int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i]-meanArr), 2);
		}
		return Math.sqrt(sumSquared/(b.length+1));
	}
	
	public double standardDev(T[] arr){
		double meanArr = mean(arr);
		double sumSquared = 0;
		for(int i = 0; i < arr.length; i++){
			sumSquared += Math.pow(arr[i].doubleValue() - meanArr,2);
		}
		return Math.sqrt(sumSquared/arr.length);
	}
	
	public double standardDev(T a, T ...b){
		
		double meanArr = mean(a, b);
		double sumSquared = Math.pow((a.doubleValue()-meanArr), 2);
		
		for(int i = 0; i < b.length; i++){
			sumSquared+=Math.pow((b[i].doubleValue()-meanArr), 2);
		}
		
		return Math.sqrt(sumSquared/(b.length+1));
	}
}
