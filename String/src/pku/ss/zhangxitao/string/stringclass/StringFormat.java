/**
 * 
 */
package pku.ss.zhangxitao.string.stringclass;

import java.util.Date;

/**
 * @author zhangxit
 *
 */
public class StringFormat {
	private static Date date= new Date();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 日期与时间字符串格式化*/
		String year = String.format("%tY", date);
		String month = String.format("%tm", date);
		String day = String.format("%te", date);
		String week = String.format("%ta", date);
		String time_H = String.format("%tH", date);
		String time_M = String.format("%tM", date);
		String time_S = String.format("%tS", date);
		String day_num = String.format("%tj", date);
		System.out.println("现在是:"+year+"年"+month+"月"+day+"日  "+week+"  "
		+time_H+"时"+time_M+"分"+time_S+"秒  今天是今年的第"+day_num+"天");
		System.out.println("------------------------");
	}

}
