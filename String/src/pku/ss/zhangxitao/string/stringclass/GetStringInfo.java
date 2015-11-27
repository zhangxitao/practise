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
		 * 获取字符串长度*/
		String str1 = "zhang xi tao";
		int num1 = str1.length();
		System.out.println("结果1："+num1);
		
		/**
		 * 字符串查找：两种查找方法*/
		/*获取某字符首次出现的位置*/
		String str2 = "zhang xi tao";
		int num2 = str2.indexOf("g");
		int num2_1 = str2.indexOf("p");
		System.out.println("结果2：字符“g”最后一次出现的位置为"+num2+"  字符“p”最后一次出现的位置为"+num2_1);
		
		/*获取某字符最有一次出现的位置*/
		int num3 = str2.lastIndexOf("a");
		int num4 = str2.lastIndexOf("p");
		int num5 = str2.lastIndexOf("");
		System.out.println("结果3：字符“a”最后一次出现的位置为"+num3+"  字符“p”最后一次出现的位置为"+num4);
		System.out.println("                  字符串长度为："+num5);
		
		/**
		 * 利用charAt()将指定位置的字符返回*/
		String str3 = "zhang xi tao";
		char chr1 = str3.charAt(4);
		System.out.println("结果4："+chr1);

	}

}
