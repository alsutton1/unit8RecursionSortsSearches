import java.util.Arrays;


public class SelectionSorter
{
    public static void sort(int[] a)
    {
        //scan unsorted portion of the array
        //find the least value and sort it least to greatest
        for(int x = 0; x < a.length - 1; x++)
        {
            int smallestValue = a[x];
            int smallestIndex = x;
            for(int y = x; y < a.length; y++)
            {
                if (a[y] < smallestValue)
                {
                    smallestValue = a[y];
                    smallestIndex = y;
                }
            }
            //swap the smallest value with the beginning of the unsorted portion of the array
            int temp = a[x];
            a[x] = smallestValue;
            a[smallestIndex] = temp;
        }
    }
    
    public static void main(String[] args)
    {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}