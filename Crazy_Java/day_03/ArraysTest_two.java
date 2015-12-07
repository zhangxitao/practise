/**
*@author zhangxitao
*学习使用 copyOf();和copyOfRange();两个函数
*/
import java.util.Arrays; //引入java.util.Arrays包
class ArraysTest_two 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9}; //创建数组并且赋值

		int[] arr_one = Arrays.copyOf(arr,12); //使用copyOf(typr[] , int length);函数

		int[] arr_two = Arrays.copyOfRange(arr,2,8); //使用copyOfRange(type[] , int fromIndex, int toIndex);
		
		System.out.print("arr_one中的元素为：");
		for (int i = 0;i<arr_one.length;i++ )
		{
			System.out.print(arr_one[i]+",");
		}
		System.out.println("");
		System.out.print("arr_two中的元素为：");
		for (int i = 0;i<arr_two.length ;i++ )
		{
			System.out.print(arr_two[i]+",");
		}
	}
}
