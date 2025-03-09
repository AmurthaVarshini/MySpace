// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1

class LinearSearch {

      static int search(int a[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (a[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args)
    {
        int[] a = { 3, 4, 1, 7, 5 };
        int n = a.length;
        
        int x = 4;

        int index = search(a, n, x);
        
          if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at position " + index);
    }
}
