package arrays;

public class arrayAssignment {
     public static void main(String[] args){
        int[] x = new int[]{10,20};
        int[] y= new int[]{30,40,50,600};
        y = x;
        for (int i=0; i<y.length; i++) {
            System.out.println(y[i]);
            // here x is of size 2 and y is of size 4 but  internally we are only changing the assignment var not assigning the array to variable.
        }
    }
}
