package katas;

public class ParabolicArcLength {
    public static double lenCurve(int n) {
        double result = 0;
        double x_ini = 0;
        double x_fin = 0;
        double y_ini = 0;
        double y_fin = 0;
        double lines = (double)n;
        
        for(int i=1;i<=n;i++) {
        	x_fin = (1.0/lines)*i;
        	y_fin = x_fin * x_fin;
        	result+=Math.sqrt(Math.pow(x_fin-x_ini, 2)+Math.pow(y_fin-y_ini, 2));
        	x_ini = x_fin;
        	y_ini = y_fin;
        }
    	return (double)((int)(result*1000000000))/1000000000;
      }    
	public static void main (String args[]) {
		System.out.println(lenCurve(1));
		System.out.println(lenCurve(10));
	}
}
