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
		System.out.println("----------------------------");
		
		/**
		 * 去除字符串两端空格*/
		String str4 = "  zhang xi tao   ";
		String str5 = str4.trim();
		System.out.println("结果3："+str4);
		System.out.println("结果3："+str5);
		System.out.println("----------------------------");
		
		/**
		 * 字符串替换*/
		String str6 = "zhang xi tao";
		String str7 = str6.replace("z", "c");
		System.out.println("结果4："+str7);
		String str8 = str6.replace("a", "*");
		System.out.println("结果5："+str8);
		System.out.println("----------------------------");
		
		/**
		 * 判断字符起始字符*/
		String str9 = "zhangxitao";
		boolean b1 = str9.startsWith("z");
		boolean b2 = str9.startsWith("o");
		boolean b3 = str9.endsWith("z");
		boolean b4 = str9.endsWith("o");
		System.out.println("结果6："+b1+" "+b2+" "+b3+" "+b4);
		System.out.println("----------------------------");
		
		/**
		 * 判断字符串是否相等*/
		String str10 = new String("zhangxitao");
		String str11 = new String("zhangxitao");
		String str12 = new String("ZhangXiTao");
		boolean b5 = str10.equals(str11);
		boolean b6 = str10.equals(str12);
		boolean b7 = str11.equalsIgnoreCase(str12);
		System.out.println("结果7："+b5+" "+b6+" "+b7);
		System.out.println("----------------------------");
		
		/**
		 * 按字典顺序比较两个字符串*/
		String str13 = "a";
		String str14 = "b";
		String str15 = "c";
		String str16 = "b";
		System.out.println("结果8："+str14.compareTo(str13)+" "+str14.compareTo(str15)
		+" "+str14.compareTo(str16));
		System.out.println("----------------------------");
		
		/**
		 * 大小写转换*/
		String str17 = str13.toUpperCase();
		String str18 = str17.toLowerCase();
		System.out.println("结果9："+str17+" "+str18);
		System.out.println("----------------------------");
		
		/**
		 * 字符串拆分*/
		String str19 = "zhang xi tao";
		String str_1[] = str19.split(" ");
		for (int i = 0; i < str_1.length; i++) {
			System.out.println("结果10："+str_1[i]);
		}
		String str_2[] = str19.split(" ", 2);
		for (int i = 0; i < str_2.length; i++) {
			System.out.println("结果11："+str_2[i]);
		}
		System.out.println("----------------------------");
	}

}
