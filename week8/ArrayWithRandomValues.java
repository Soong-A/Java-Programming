package demo1.week8;

public class ArrayWithRandomValues {
    public static void main(String[] args) {
        double[] mylist = new double[5];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = Math.random()*10;
        }
    }
}
