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
	 * distribution of size N > 0.
	 * 
	 * @param r - The parameter to test for.
	 * @param N - The sample size.
	 * @param p - The probability p of an event.
	 * @return double The P(X=r)
	 */
	public static final double probBionomial(int r, int N, double p){
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
	public static final double[] distBionomial(int N, double p){
		double bionomialDist[] = new double[N];
		for(int r = 0; r < N; r++){
			bionomialDist[r] = probBionomial(r, N, p);
		}
		return bionomialDist;
	}
	
	
	public static final double probExponential(double lambda, double x){
		return lambda*Math.pow(Math.E, -lambda*x);
	}
	
	public static final double[] distExponential(double lambda, int xMax){
		assert(xMax <= Integer.MAX_VALUE);
		double exponentialDist[] = new double[xMax];
		for(int x = 0; x < xMax; x++){
			exponentialDist[x] = probExponential(lambda, x);
		}
		return exponentialDist;
	}
	
	
	/*---------- SIDE METHODS -----------*/
	
	
	/**
	 * This method calculates nCr for integers 
	 * n and r. i.e. How many ways can we choose 
	 * 'r' from 'n'. E.g. 5C2 = 10.
	 * 
	 * @param r - 
	 * @param n - 
	 * @return int - The number of ways to choose 'r' from 'n'.
	 */
	public static final int nCr(int r, int n){
		return factorial(n)/(factorial(r)*factorial(n-r));
	}
	
	/**
	 * This method calculates the factorial of an
	 * integer. E.g. 3! = 3*2*1. 
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
