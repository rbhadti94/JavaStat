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
	
	//----Distribution List----//
	//Binomial
	//Poisson
	//Exponential
	
	
	//Bionomial probability.
	//P(X=r) in an N sized prob dist with probability p.
	public static final double probBionomial(int r, int N, double p){
		return nCr(r, N)*Math.pow(p, r)*Math.pow(1-p, N-r);
	}
	
	//Return distribution set for given N and probability p.
	public static final double[] distBionomial(int N, double p){
		double bionomialDist[] = new double[N];
		for(int r = 0; r < N; r++){
			bionomialDist[r] = probBionomial(r, N, p);
		}
		return bionomialDist;
	}
	
	/*---------- SIDE METHODS -----------*/
	
	public static final int nCr(int r, int N){
		return factorial(N)/(factorial(r)*factorial(N-r));
	}
	
	public static final int factorial(int n){
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
	
}
