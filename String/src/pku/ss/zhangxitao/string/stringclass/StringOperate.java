/**
 * 
 */
package pku.ss.zhangxitao.string.stringclass;

/**
 * @author zhangxit
 *
 */
public class StringOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * ��ȡ�ַ���*/
		/*��һ��λ�ÿ�ʼ��ȡ����ȡ������ַ���*/
		String str1 = "0123456789";
		String str2 = str1.substring(5);
		System.out.println("���1��"+str2);
		/*�����ס�ĩλ(��������ĩλ)����ȡ�ַ���*/
		String str3 = str1.substring(5, 8);
		System.out.println("���2��"+str3);
		
		/**ȥ���ַ������˿ո�*/
		String str4 = "  zhang xi tao   ";
		String str5 = str4.trim();
		System.out.println("���3��"+str4);
		System.out.println("���3��"+str5);

	}

}
