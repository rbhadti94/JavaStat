/**
 * 
 * Class: RavMath.base.Distributions
 * 
 * @author Ravindra Bhadti
 * @V1.0
 */
package statistics.dist;

public strictfp class Distributions {
	
	private static final double MAX_P = 1.0;
	
	private static final double MIN_P = 0.0;
	
	/**
	 * This class is non-instansiable.
	 */
	private Distributions(){
		//No-body
	}
	
	/**
	 * This method calculates P(X=r) for a bionomial
	 * distribution of size N > 0 with probability parameter 'p'.
	 * 
	 * @param r - The parameter to test for.
	 * @param N - The sample size.
	 * @param p - The probability p of an event.
	 * @return double The P(X=r)
	 */
	public static final double probBinomial(int r, int N, double p){
		assert(p<=MAX_P && p>=MIN_P);
		return nCr(r, N)*Math.pow(p, r)*Math.pow(1-p, N-r);
	}
	
	/**
	 * This method returns the values P(X=r) for
	 * r in [0,N-1]. It returns the distribution as 
	 * an array. 
	 * 
	 * @param N - The distribution size.
	 * @param p - The probability p of an event.
	 * @return double[] - The bionomial distribution
	 * 
	 */
	public static final double[] distBinomial(int N, double p){
		assert(p<=MAX_P && p>=MIN_P);
		double bionomialDist[] = new double[N];
		for(int r = 0; r < N; r++){
			bionomialDist[r] = probBinomial(r, N, p);
		}
		return bionomialDist;
	}
	
	
	/**
	 * This method returns P(X=x;lambda) using the exponential
	 * distribution with parameter lambda.
	 * 
	 * @param lambda - Decay constant.
	 * @param x - Value to test for.
	 * @return double - The P(X=x;lambda)
	 */
	public static final double probExponential(double lambda, double x){
		return lambda*Math.pow(Math.E, -lambda*x);
	}
	
	/**
	 * This method returns the values P(X=x;lambda) for
	 * x in range [0,xMax-1]. It returns the distribution as 
	 * an array. 
	 * 
	 * @param lambda - Decay constant.
	 * @param xMax - The maximum x value to go up to.
	 * @return double[] - The return distribution.
	 */
	public static final double[] distExponential(double lambda, int xMax){
		assert(xMax <= Integer.MAX_VALUE);
		double exponentialDist[] = new double[xMax];
		for(int x = 0; x < xMax; x++){
			exponentialDist[x] = probExponential(lambda, x);
		}
		return exponentialDist;
	}
	
	public static final double probPoisson(double lambda, int k){
		return Math.pow(lambda, k)*Math.pow(Math.E, -lambda)/factorial(k);
	}
	
	/**
	 * This method generates a normal distribution with 'numElem' elements
	 * either side of the mean 'mu'.
	 * 
	 * @param mu - The Mean.
	 * @param sigma - The Standard Deviation.
	 * @return double[] - The normal distribution N(mu, sigma^2);
	 * 
	 */
	public static final double[] distNormal(double mu, double sigma, int numElem){
		
		double normalDist[] = new double[2*numElem+1];
		double variance = sigma*sigma;
		double coeff = 1/(Math.sqrt(2*variance*Math.PI));
		double expRes = 0;
		
		for(int i = -numElem; i < numElem ; i++){
			expRes = Math.pow(Math.E, -((i-mu)*(i-mu))/(2*variance));
			normalDist[i] = coeff*expRes;
		}
		
		return normalDist;
		
	}
	
	/**
	 * 
	 * @param mu
	 * @param sigma
	 * @param z
	 * @return P(X<z) for N(mu, sigma^2).
	 */
	public static final double tailNormal(double mu, double sigma, double z){
		
		double erfCoeff = (z-mu)/(Math.sqrt(2)*sigma);
		
		return 0.5*(1+erf(erfCoeff));
	}
	
		
	/*---------- SIDE METHODS -----------*/
	
	/**
	 * Error Function 
	 * Returns erf(z).
	 */
	public static final double erf(double z){
		
		double t = 1/(1+0.5*Math.abs(z));
		
		double erfRes = 1-t*Math.exp( -z*z -  1.26551223 +
	            t * ( 1.00002368 +
	            t * ( 0.37409196 +
	            t * ( 0.09678418 +
	            t * (-0.18628806 +
	            t * ( 0.27886807 +
	            t * (-1.13520398 +
	            t * ( 1.48851587 +
	            t * (-0.82215223 +
	            t * ( 0.17087277)))))))))
	        );
		
		return z >= 0 ? erfRes : -erfRes ;
	}

	
	/**
	 * This method calculates nCr for integers 
	 * n and r. i.e. How many ways can we choose 
	 * 'r' from 'n'. E.g. 5C2 = 10.
	 * 
	 * @param r - The number of things you want to choose.
	 * @param n - The total number.
	 * @return int - The number of ways to choose 'r' from 'n'.
	 */
	public static final int nCr(int r, int n){
		return factorial(n)/(factorial(r)*factorial(n-r));
	}
	
	/**
	 * This recursive method calculates the factorial 
	 * of an integer. E.g. 3! = 3*2*1. 
	 * 
	 * @param  n - An integer.
	 * @return n! - The factorial result.
	 */
	public static final int factorial(int n){
		if(n==1 || n==0){
			return 1;
		}
		return n*factorial(n-1);
	}
	
}
