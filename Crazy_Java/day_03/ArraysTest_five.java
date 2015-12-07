/**
*@author zhangxitao
*
*learn the function:
*Arrays.sort(arr[]);
*Arrays.sort(arr[],int fromIndex,int to Index);
*Arrays.toString(arr[]);
*/
import java.util.Arrays;  //import the java.util.Arrays bag
class ArraysTest_five 
{
	public static void main(String[] args) 
	{
		//Creat arrays and assign value
		int[] arr = {4,6,4,2,3,1,6,4,6,5,4,6,8};
		int[] arr_ = {4,6,4,2,3,1,6,4,6,5,4,6,8};

		//print the different result which array arr sort by the different function
		//and practise a demo for "Arrays.toString(arr[])"function
		Arrays.sort(arr);
		System.out.println("Sort all the value of arr:"+Arrays.toString(arr));

		Arrays.sort(arr_,2,9);
		System.out.println("Sort the part value of arr_:"+Arrays.toString(arr_));
		
	}
}
