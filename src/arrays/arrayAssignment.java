package arrays;

public class arrayAssignment {
    public static void main(String[] args){
        int[] x = new int[]{10,20};
        int[] y= new int[]{30,40,50,60};
        x = y;
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
            // here x is of size 2 and y is of size 4 but  internally we are only changing the assignment var not assigning the array to variable.
        }
    }
}
