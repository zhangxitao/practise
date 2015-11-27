/**
 * 字符串的声明和创建
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
		 * 声明一个空的字符串*/
		String str1 = "";
		System.out.println("结果1:"+str1);
		
		/**
		 * 用一个字符数组创建String对象*/
		char c1[] = {'s','t','r','i','n','g'};
		String str2 = new String(c1);
		System.out.println("结果2："+str2);
		
		/**
		 * 提取某个字符数组中的一段字符，用这些提取的字符创建一个字符串对象
		 * 这里有三个参数：
		 * value是要截取的目标字符数组
		 * offset是开始位置
		 * length是截取长度*/
		String str3 = new String(c1, 2, 4);
		System.out.println("结果3："+str3);
		
		/**
		 * 将一个字符数组所有字符连接，组成一个字符串*/
		String str4 = new String(c1);
		System.out.println("结果4："+str4);
		
		/**
		 * 注意：
		 * 当两个变量的字符串是一样的，那么这两个变量具有相同的实体*/
		String str5 = "zhang xi tao";
		String str6 = "zhang xi tao";
		System.out.println("str5和str6具有相同的实体");

	}

}
