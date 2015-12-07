class IfTest 
{
	public static void main(String[] args) 
	{
		int age = 52;
		if (age <= 10 && age >=0)
		{
			System.out.println(age+"岁的人是小孩子");
		}else if (age <= 20 && age >10)
		{
			System.out.println(age+"岁的人是青少年");
		}else if (age <= 30 && age > 20)
		{
			System.out.println(age+"岁的人是青年人");
		}else if (age <= 50 && age > 30)
		{
			System.out.println(age+"岁的人是中年人");
		}else if (age <= 100 && age > 50)
		{
			System.out.println(age+"岁的人是老年人");
		}else if (age <= 150 && age > 100)
		{
			System.out.println("神仙一样的存在着");
		}
		else
		{
			System.out.println("你在逗我");
		}
	}
}
