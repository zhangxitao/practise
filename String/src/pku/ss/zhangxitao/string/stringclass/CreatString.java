/**
 * �ַ����������ʹ���
 */
package pku.ss.zhangxitao.string.stringclass;

/**
 * @author zhangxit
 *
 */
public class CreatString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ����һ���յ��ַ���*/
		String str1 = "";
		System.out.println("���1:"+str1);
		
		/**
		 * ��һ���ַ����鴴��String����*/
		char c1[] = {'s','t','r','i','n','g'};
		String str2 = new String(c1);
		System.out.println("���2��"+str2);
		
		/**
		 * ��ȡĳ���ַ������е�һ���ַ�������Щ��ȡ���ַ�����һ���ַ�������
		 * ����������������
		 * value��Ҫ��ȡ��Ŀ���ַ�����
		 * offset�ǿ�ʼλ��
		 * length�ǽ�ȡ����*/
		String str3 = new String(c1, 2, 4);
		System.out.println("���3��"+str3);
		
		/**
		 * ��һ���ַ����������ַ����ӣ����һ���ַ���*/
		String str4 = new String(c1);
		System.out.println("���4��"+str4);
		
		/**
		 * ע�⣺
		 * �������������ַ�����һ���ģ���ô����������������ͬ��ʵ��*/
		String str5 = "zhang xi tao";
		String str6 = "zhang xi tao";
		System.out.println("str5��str6������ͬ��ʵ��");

	}

}
