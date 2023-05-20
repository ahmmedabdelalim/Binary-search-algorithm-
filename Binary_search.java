public class Binary_search {
    public static void binary_search(int arr[] , int item)
    {
        int first = 0 ;
        int last  = arr.length - 1 ;
        int mid = (first + last) / 2 ;

        while(first <= last)
        {
            if(arr[mid]<item)
            {
                first = mid + 1 ;
            }
            else if (arr[mid]== item )
            {
                System.out.println("element is found = "+ mid);
                break;
            }
            else
            {
                last = mid - 1 ;
            }
            mid = (first + last) / 2 ;
        }
        if (first > last)
        {
            System.out.println("element is not found  ");
        }
    }
    public static void main (String args[])
    {
            int arr[] = {10,20,30,40,50};
            int item = 1;
            binary_search(arr , item);
        //        System.out.println("ahmed");
    }
}
