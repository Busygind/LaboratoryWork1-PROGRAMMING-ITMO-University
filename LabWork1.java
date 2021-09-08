public class LabWork1 {

    public static float getRandomNumber(int start, int end){
        int dif = end - start;
        return (float) (Math.random()*dif + start);
    }

    public static void printAnswer(double f[][]){
        for (int i = 0; i < f.length; i++) {  //идём по строкам
            for (int j = 0; j < f[0].length; j++) {  //идём по столбцам
                System.out.printf("%.2f", f[i][j]);
                System.out.print(" ");//вывод элемента
            }
            System.out.println(); //перенос строки
        }
    }
    public static void main(String[] args) {
        int i, j;

        long[] a = new long[11];
        for (i = 0; i < a.length ; i++){
            a[i] = 6+i;
        }

        float[] x = new float[11];
        for (i = 0; i < x.length; i++){
            x[i] = getRandomNumber(-4, 6);
        }

        double[][] f = new double[11][11];
        for (i = 0; i < 11; i++){
            for (j = 0; j < 11; j++) {
                if (a[i] == 13){
                    f[i][j] = Math.asin(Math.exp(Math.pow(-Math.abs(Math.exp(x[j])), 1/3d)));
                } else if ((a[i] == 7) || (a[i] == 11) || (a[i] == 12) || (a[i] == 15) || (a[i] == 16)){
                    f[i][j] = Math.pow(Math.atan(Math.sin(x[j]))*Math.asin(Math.exp(-Math.abs(x[j])))+1, Math.cos(Math.tan(x[j])));
                } else {
                    f[i][j] = Math.pow(Math.pow(Math.atan((x[j]+1)*Math.E+1)*Math.pow(Math.pow((3.0/x[j]), x[j])*(4+Math.pow(x[j], 1/3d)), Math.tan(x[j]))+1, 2)+ 3/4d, Math.pow(0.5/Math.pow((1-x[j])/3.0/2.0, 3.0), 3.0));
                }
            }
        }
        printAnswer(f);
    }
}
