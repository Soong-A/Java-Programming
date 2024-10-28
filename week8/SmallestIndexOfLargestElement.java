package demo1.week8;


public class SmallestIndexOfLargestElement {
    public static void main(String[] args) {
// Create an array
        float[] mylist = new float[5];

// Initialize array with random values
        for (int i = 1; i < mylist.length; i++) {
            mylist[i] = (float) Math.random() * 10;
        }
// Display an array
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }
        float max = mylist[0];
        int indexofMax = 0;
        for (int i = 1; i < mylist.length; i++) {
            if (mylist[i] > max) {
                max = mylist[1];
                indexofMax = 1;
            }
        }
        System.out.println();
        System.out.println("Largest element in the array is: " + max);
        System.out.println("The index of the largest element: " + indexofMax);
    }
}

