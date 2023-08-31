import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums={3,5,8,9,12,16,17,21,24,68,78};
        int searchNumber=68;
        int searchResultIndex=new Solution().search(nums,searchNumber);
        System.out.println("Binary Search of array: "+Arrays.toString(nums)+
        " \nfor search number: "+searchNumber+", gives resulting array index number: "+searchResultIndex);
    }
}
