/**
*@author zhangxitao
*练习 fill();函数的两种用法：
*fill(arr[],type val)  //将arr全部赋值为val
*fill(arr[],int fromIndex,int toIndex,type val);  //指定起始位置赋值
*/
import java.util.Arrays;

class ArraysTest_four 
{
	public static void main(String[] args) 
	{
		//Create arrays and assign values
		int[] arr_one = {1,2,3,4,5,6,7,8,9}; 
		int[] arr_two = {1,2,3,4,5,6,7,8,9};

		//Change the array value by function
		Arrays.fill(arr_one,0);
		Arrays.fill(arr_two,2,7,0);

		System.out.println("修改后的arr_one数组为："+Arrays.toString(arr_one));
		System.out.println("修改后的arr_two数组为："+Arrays.toString(arr_two));
	}
}
