class IfTest 
{
	public static void main(String[] args) 
	{
		int age = 52;
		if (age <= 10 && age >=0)
		{
			System.out.println(age+"�������С����");
		}else if (age <= 20 && age >10)
		{
			System.out.println(age+"�������������");
		}else if (age <= 30 && age > 20)
		{
			System.out.println(age+"�������������");
		}else if (age <= 50 && age > 30)
		{
			System.out.println(age+"�������������");
		}else if (age <= 100 && age > 50)
		{
			System.out.println(age+"�������������");
		}else if (age <= 150 && age > 100)
		{
			System.out.println("����һ���Ĵ�����");
		}
		else
		{
			System.out.println("���ڶ���");
		}
	}
}
