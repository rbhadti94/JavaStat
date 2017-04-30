/**
 * @author Ravindra Bhadti
 * @V1.0
 */
package statistics.dist;

public class Distributions {
	
	
	//----Distribution List----//
	//Binomial
	//Poisson
	//Exponential
	
	
	//Bionomial probability.
	//P(X=r) in an N sized prob dist with probability p.
	public final double probBionomial(int r, int N, double p){
		return nCr(r, N)*Math.pow(p, r)*Math.pow(1-p, N-r);
	}
	
	//Return distribution for given N and probability p.
	public final double[] distBionomial(int N, double p){
		double bionomialDist[] = new double[N];
	
		for(int r = 0; r < N; r++){
			bionomialDist[r] = probBionomial(r, N, p);
		}
		
		return bionomialDist;
	}
	
	
	public final int nCr(int r, int N){
		return factorial(N)/(factorial(r)*factorial(N-r));
	}
	
	public final int factorial(int n){
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
	
}
