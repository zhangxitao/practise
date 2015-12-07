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
		 * ������ʱ���ַ�����ʽ��*/
		String year = String.format("%tY", date);
		String month = String.format("%tm", date);
		String day = String.format("%te", date);
		String week = String.format("%ta", date);
		String time_H = String.format("%tH", date);
		String time_M = String.format("%tM", date);
		String time_S = String.format("%tS", date);
		String day_num = String.format("%tj", date);
		System.out.println("������:"+year+"��"+month+"��"+day+"��  "+week+"  "
		+time_H+"ʱ"+time_M+"��"+time_S+"��  �����ǽ���ĵ�"+day_num+"��");
		System.out.println("------------------------");
	}

}
