/**
*@author zhangxitao
*练习  equals();方法的使用
*/
import java.util.Arrays; //导入包
class ArraysTest_three 
{
	public static void main(String[] args) 
	{
		int[] arr_one = {1,2,3,4,5,6,7,8,9}; //创建数组arr_one、arr_two、arr_three其中，1和2拥有相同的元素，3不同于1和2
		int[] arr_two = {1,2,3,4,5,6,7,8,9};
		int[] arr_three = {1,2,3,4,5,6,7};

		boolean b1 = Arrays.equals(arr_one,arr_two);
		boolean b2 = Arrays.equals(arr_one,arr_three);
		
		System.out.println(b1+" "+b2);
	}
}
