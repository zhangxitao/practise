/**
*@author zhangxitao
*��ϰ  equals();������ʹ��
*/
import java.util.Arrays; //�����
class ArraysTest_three 
{
	public static void main(String[] args) 
	{
		int[] arr_one = {1,2,3,4,5,6,7,8,9}; //��������arr_one��arr_two��arr_three���У�1��2ӵ����ͬ��Ԫ�أ�3��ͬ��1��2
		int[] arr_two = {1,2,3,4,5,6,7,8,9};
		int[] arr_three = {1,2,3,4,5,6,7};

		boolean b1 = Arrays.equals(arr_one,arr_two);
		boolean b2 = Arrays.equals(arr_one,arr_three);
		
		System.out.println(b1+" "+b2);
	}
}
