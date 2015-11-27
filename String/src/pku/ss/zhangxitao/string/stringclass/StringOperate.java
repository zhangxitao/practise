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
		 * 获取字符串*/
		/*从一个位置开始截取，截取后面的字符串*/
		String str1 = "0123456789";
		String str2 = str1.substring(5);
		System.out.println("结果1："+str2);
		/*设置首、末位(结果不算该末位)，截取字符串*/
		String str3 = str1.substring(5, 8);
		System.out.println("结果2："+str3);
		
		/**去除字符串两端空格*/
		String str4 = "  zhang xi tao   ";
		String str5 = str4.trim();
		System.out.println("结果3："+str4);
		System.out.println("结果3："+str5);

	}

}
