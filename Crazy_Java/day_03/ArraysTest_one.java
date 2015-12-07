/**
*@author zhangxitao
*
*练习Arrays中的binarySearch的使用
*/
import java.util.Arrays;  //引入java.util.Arrays包

class ArraysTest_one   //创建一个类，类名为ArraysTest_one
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};  //创建一个int类型的数组arr，并且为其赋值为1~9数字
		int index_one = Arrays.binarySearch(arr,8);  //在arr中查找关键字8，返回其索引。预计值：7
		int index_two = Arrays.binarySearch(arr,10);  //在arr中查找关键字10，预计值：负数
		int index_three = Arrays.binarySearch(arr,2,8,5);  //查找arr数组中arr[2]~arr[8]范围内是否存在关键字5
		int index_four = Arrays.binarySearch(arr,2,8,9);  //查找arr数组中arr[2]~arr[8]范围内是否存在关键字5
		System.out.println(index_one);  //输出相应值
		System.out.println(index_two);//输出相应值
		System.out.println(index_three);//输出相应值
		System.out.println(index_four);//输出相应值

		int[] arr_ = {1,5,5,5,5,8,8,8,9};
		int index_ = Arrays.binarySearch(arr_,8);
		System.out.println(index_);
	}
}
