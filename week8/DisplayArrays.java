package demo1.week8;

public class DisplayArrays {
    public static void main(String[] args) {

// Create an array
        double[] mylist = new double[5];

//Initializing arrays with random values:
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = Math.random() * 10;
        }

// Display arrays
        for (int i = 1; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }
    }
}

