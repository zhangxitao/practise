/**
*@author zhangxitao
*
*��ϰArrays�е�binarySearch��ʹ��
*/
import java.util.Arrays;  //����java.util.Arrays��

class ArraysTest_one   //����һ���࣬����ΪArraysTest_one
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};  //����һ��int���͵�����arr������Ϊ�丳ֵΪ1~9����
		int index_one = Arrays.binarySearch(arr,8);  //��arr�в��ҹؼ���8��������������Ԥ��ֵ��7
		int index_two = Arrays.binarySearch(arr,10);  //��arr�в��ҹؼ���10��Ԥ��ֵ������
		int index_three = Arrays.binarySearch(arr,2,8,5);  //����arr������arr[2]~arr[8]��Χ���Ƿ���ڹؼ���5
		int index_four = Arrays.binarySearch(arr,2,8,9);  //����arr������arr[2]~arr[8]��Χ���Ƿ���ڹؼ���5
		System.out.println(index_one);  //�����Ӧֵ
		System.out.println(index_two);//�����Ӧֵ
		System.out.println(index_three);//�����Ӧֵ
		System.out.println(index_four);//�����Ӧֵ

		int[] arr_ = {1,5,5,5,5,8,8,8,9};
		int index_ = Arrays.binarySearch(arr_,8);
		System.out.println(index_);
	}
}
