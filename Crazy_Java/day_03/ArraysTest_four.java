/**
*@author zhangxitao
*��ϰ fill();�����������÷���
*fill(arr[],type val)  //��arrȫ����ֵΪval
*fill(arr[],int fromIndex,int toIndex,type val);  //ָ����ʼλ�ø�ֵ
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

		System.out.println("�޸ĺ��arr_one����Ϊ��"+Arrays.toString(arr_one));
		System.out.println("�޸ĺ��arr_two����Ϊ��"+Arrays.toString(arr_two));
	}
}
