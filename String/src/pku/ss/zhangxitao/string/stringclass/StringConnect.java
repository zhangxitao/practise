/**
 * 
 */
package pku.ss.zhangxitao.string.stringclass;

/**
 * @author zhangxit
 *
 */
public class StringConnect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 使用“+”运算符可实现多个字符串连接*/
		String str1 = new String("zhang");
		String str2 = new String("xi");
		String str3 = new String("tao");
		System.out.println("结果1："+str1+" "+str2+" "+str3);
		
		/**
		 * 将字符串与其他类型的数据连接*/
		int num1 = 4;
		float num2 = 5.0f;
		System.out.print("结果2：num1+num2="+(num1+num2)+"   ");
		System.out.println("num1+num2="+(int)(num1+num2));
		

	}

}
