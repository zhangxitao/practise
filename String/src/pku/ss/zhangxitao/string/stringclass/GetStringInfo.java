/**
 * 
 */
package pku.ss.zhangxitao.string.stringclass;

/**
 * @author zhangxit
 *
 */
public class GetStringInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * ��ȡ�ַ�������*/
		String str1 = "zhang xi tao";
		int num1 = str1.length();
		System.out.println("���1��"+num1);
		
		/**
		 * �ַ������ң����ֲ��ҷ���*/
		/*��ȡĳ�ַ��״γ��ֵ�λ��*/
		String str2 = "zhang xi tao";
		int num2 = str2.indexOf("g");
		int num2_1 = str2.indexOf("p");
		System.out.println("���2���ַ���g�����һ�γ��ֵ�λ��Ϊ"+num2+"  �ַ���p�����һ�γ��ֵ�λ��Ϊ"+num2_1);
		
		/*��ȡĳ�ַ�����һ�γ��ֵ�λ��*/
		int num3 = str2.lastIndexOf("a");
		int num4 = str2.lastIndexOf("p");
		int num5 = str2.lastIndexOf("");
		System.out.println("���3���ַ���a�����һ�γ��ֵ�λ��Ϊ"+num3+"  �ַ���p�����һ�γ��ֵ�λ��Ϊ"+num4);
		System.out.println("                  �ַ�������Ϊ��"+num5);
		
		/**
		 * ����charAt()��ָ��λ�õ��ַ�����*/
		String str3 = "zhang xi tao";
		char chr1 = str3.charAt(4);
		System.out.println("���4��"+chr1);

	}

}
