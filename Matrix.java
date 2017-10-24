public class Matrix {


    public static double dot(double[] a, double[] b){

        double product = 0;
        double sum = 0;

        if(a.length == b.length){

            for(int i = 0; i < a.length; i++){
                product = a[i]*b[i];
                sum += product;
            }
            return sum;
        }
        return 0;
    }

    public static double[][] multiply(double[][] a, double[][] b) {

        double [][] x = new double[a[0].length][a[0].length];

        if(a[0].length == b.length)
        {
            for(int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                x[i][j] = a[i][j]*b[i][j];
                }
            }
        }
        return x;
    }

    public static double[][] transpose(double[][] a) {

        double [][] x = new double[a.length][a[0].length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length;j++)
            {
               x[j][i] = a[i][j];
            }
        }

        return x;
    }

    public static double[] multiply(double [][] a, double[] x){

        double [] b = new double[a.length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[1].length; j++){
                b[i] += a[i][j]*x[j];
            }
        }
        return b;
    }

    public static double[] multiply(double[] x, double [][] a){

        double [] b = new double[a[0].length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[1].length; j++){
                b[j] += x[i]*a[i][j];
            }
        }
        return b;
    }
}
