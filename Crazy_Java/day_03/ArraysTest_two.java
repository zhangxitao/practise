/**
*@author zhangxitao
*ѧϰʹ�� copyOf();��copyOfRange();��������
*/
import java.util.Arrays; //����java.util.Arrays��
class ArraysTest_two 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9}; //�������鲢�Ҹ�ֵ

		int[] arr_one = Arrays.copyOf(arr,12); //ʹ��copyOf(typr[] , int length);����

		int[] arr_two = Arrays.copyOfRange(arr,2,8); //ʹ��copyOfRange(type[] , int fromIndex, int toIndex);
		
		System.out.print("arr_one�е�Ԫ��Ϊ��");
		for (int i = 0;i<arr_one.length;i++ )
		{
			System.out.print(arr_one[i]+",");
		}
		System.out.println("");
		System.out.print("arr_two�е�Ԫ��Ϊ��");
		for (int i = 0;i<arr_two.length ;i++ )
		{
			System.out.print(arr_two[i]+",");
		}
	}
}
