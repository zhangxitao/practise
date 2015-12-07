class SwitchTest 
{
	public static void main(String[] args) 
	{
		char score = 'D';

		switch (score)
		{
		case 'A':
			System.out.println("优秀");
		break;
		
		case 'B':
			System.out.println("良");
		break;

		case 'C':
			System.out.println("中");
		break;

		case 'D':
			System.out.println("及格");
		break;

		case 'E':
			System.out.println("不及格");
		break;

		default:
			System.out.println("错误的成绩");
		}
	}
}
