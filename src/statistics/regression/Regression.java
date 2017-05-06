package statistics.regression;

import statistics.base.BasicStats;

public strictfp class Regression {

	/**
	 * 
	 * @param X
	 * @param Y
	 * @return
	 */
	public final static double pearsonCoefficient(double X[], double Y[]){
		
		assert X.length == Y.length : "The input array X & Y should be equal in length";
		
		int n = X.length;
		
		double meanX = BasicStats.mean(X);
		double meanY = BasicStats.mean(Y);
		
		double stdX  = BasicStats.standardDev(X);
		double stdY  = BasicStats.standardDev(Y);
		
		double covXY = 0;
		
		for(int i = 0; i < n; i++){
			covXY += (X[i]-meanX)*(Y[i]-meanY);
		}
		
		return covXY/(n*stdX*stdY);
	}
	
	/**
	 * 
	 * @param X
	 * @param Y
	 * @return
	 */
	public final static double pearsonCoefficient(int X[], int Y[]){
		
		double xTemp[] = new double[X.length];
		double yTemp[] = new double[Y.length];
		
		for(int i = 0; i < X.length; i++){
			xTemp[i] = X[i];
			yTemp[i] = Y[i];
		}
		
		return pearsonCoefficient(xTemp, yTemp);
		
	}
	
	/**
	 * 
	 * @param X
	 * @param Y
	 * @return
	 */
	public final static double pearsonCoefficient(long X[], long Y[]){
		double xTemp[] = new double[X.length];
		double yTemp[] = new double[Y.length];
		
		for(int i = 0; i < X.length; i++){
			xTemp[i] = X[i];
			yTemp[i] = Y[i];
		}
		
		return pearsonCoefficient(xTemp, yTemp);
	}
	
	/**
	 * 
	 * @param X
	 * @param Y
	 * @return
	 */
	public final static double pearsonCoefficient(float X[], float Y[]){
		double xTemp[] = new double[X.length];
		double yTemp[] = new double[Y.length];
		
		for(int i = 0; i < X.length; i++){
			xTemp[i] = X[i];
			yTemp[i] = Y[i];
		}
		
		return pearsonCoefficient(xTemp, yTemp);
	}
	
	/**
	 * 
	 * @param X
	 * @param Y
	 * @return Double
	 */
	public final static <T extends Number> Double pearsonCoefficient(T X[], T Y[]){
		
		double xTemp[] = new double[X.length];
		double yTemp[] = new double[Y.length];
		
		for(int i = 0; i < X.length; i++){
			xTemp[i] = X[i].doubleValue();
			yTemp[i] = Y[i].doubleValue();
		}		
		return pearsonCoefficient(xTemp, yTemp);
	}

}
