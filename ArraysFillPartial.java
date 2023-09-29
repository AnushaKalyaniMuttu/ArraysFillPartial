//output: [2, 10, 10, 10, 10, 2, 2, 2, 2]

import java.util.Arrays;
  
public class Main
{
    public static void main(String[] args)
    {
        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
  
        // Fill from index 1 to index 4.
        Arrays.fill(ar, 1, 5, 10);
     
        System.out.println(Arrays.toString(ar));
    }
}
